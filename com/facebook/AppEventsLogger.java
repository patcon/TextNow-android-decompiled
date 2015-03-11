package com.facebook;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.m;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.Logger;
import com.facebook.internal.Utility;
import com.facebook.internal.Utility.FetchedAppSettings;
import com.facebook.internal.Validate;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import textnow.m.e;

public class AppEventsLogger
{
  public static final String ACTION_APP_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_FLUSHED";
  public static final String APP_EVENTS_EXTRA_FLUSH_RESULT = "com.facebook.sdk.APP_EVENTS_FLUSH_RESULT";
  public static final String APP_EVENTS_EXTRA_NUM_EVENTS_FLUSHED = "com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED";
  private static final int APP_SUPPORTS_ATTRIBUTION_ID_RECHECK_PERIOD_IN_SECONDS = 86400;
  private static final int FLUSH_APP_SESSION_INFO_IN_SECONDS = 30;
  private static final int FLUSH_PERIOD_IN_SECONDS = 15;
  private static final int NUM_LOG_EVENTS_TO_TRY_TO_FLUSH_AFTER = 100;
  private static final String SOURCE_APPLICATION_HAS_BEEN_SET_BY_THIS_INTENT = "_fbSourceApplicationHasBeenSet";
  private static final String TAG = AppEventsLogger.class.getCanonicalName();
  private static Context applicationContext;
  private static ScheduledThreadPoolExecutor backgroundExecutor;
  private static AppEventsLogger.FlushBehavior flushBehavior = AppEventsLogger.FlushBehavior.AUTO;
  private static String hashedDeviceAndAppId;
  private static boolean isOpenedByApplink;
  private static boolean requestInFlight;
  private static String sourceApplication;
  private static Map<AppEventsLogger.AccessTokenAppIdPair, AppEventsLogger.SessionEventsState> stateMap = new ConcurrentHashMap();
  private static Object staticLock = new Object();
  private final AppEventsLogger.AccessTokenAppIdPair accessTokenAppId;
  private final Context context;

  private AppEventsLogger(Context paramContext, String paramString, Session paramSession)
  {
    Validate.notNull(paramContext, "context");
    this.context = paramContext;
    if (paramSession == null)
      paramSession = Session.getActiveSession();
    if ((paramSession != null) && ((paramString == null) || (paramString.equals(paramSession.getApplicationId()))))
      this.accessTokenAppId = new AppEventsLogger.AccessTokenAppIdPair(paramSession);
    synchronized (staticLock)
    {
      if (hashedDeviceAndAppId == null)
        hashedDeviceAndAppId = Utility.getHashedDeviceAndAppID(paramContext, paramString);
      if (applicationContext == null)
        applicationContext = paramContext.getApplicationContext();
      initializeTimersIfNeeded();
      return;
      if (paramString == null)
        paramString = Utility.getMetadataApplicationId(paramContext);
      this.accessTokenAppId = new AppEventsLogger.AccessTokenAppIdPair(null, paramString);
    }
  }

  private static int accumulatePersistedEvents()
  {
    AppEventsLogger.PersistedEvents localPersistedEvents = AppEventsLogger.PersistedEvents.readAndClearStore(applicationContext);
    Iterator localIterator = localPersistedEvents.keySet().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = (AppEventsLogger.AccessTokenAppIdPair)localIterator.next();
      AppEventsLogger.SessionEventsState localSessionEventsState = getSessionEventsState(applicationContext, localAccessTokenAppIdPair);
      List localList = localPersistedEvents.getEvents(localAccessTokenAppIdPair);
      localSessionEventsState.accumulatePersistedEvents(localList);
      i += localList.size();
    }
    return i;
  }

  public static void activateApp(Context paramContext)
  {
    Settings.sdkInitialize(paramContext);
    activateApp(paramContext, Utility.getMetadataApplicationId(paramContext));
  }

  public static void activateApp(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null))
      throw new IllegalArgumentException("Both context and applicationId must be non-null");
    if ((paramContext instanceof Activity))
      setSourceApplication((Activity)paramContext);
    while (true)
    {
      Settings.publishInstallAsync(paramContext, paramString, null);
      AppEventsLogger localAppEventsLogger = new AppEventsLogger(paramContext, paramString, null);
      final long l = System.currentTimeMillis();
      String str = getSourceApplication();
      backgroundExecutor.execute(new Runnable()
      {
        public final void run()
        {
          AppEventsLogger.this.logAppSessionResumeEvent(l, this.val$sourceApplicationInfo);
        }
      });
      return;
      resetSourceApplication();
      AppEventsLogger.class.getName();
    }
  }

  private static AppEventsLogger.FlushStatistics buildAndExecuteRequests(AppEventsLogger.FlushReason paramFlushReason, Set<AppEventsLogger.AccessTokenAppIdPair> paramSet)
  {
    AppEventsLogger.FlushStatistics localFlushStatistics = new AppEventsLogger.FlushStatistics(null);
    boolean bool = Settings.getLimitEventAndDataUsage(applicationContext);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator1 = paramSet.iterator();
    while (localIterator1.hasNext())
    {
      AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = (AppEventsLogger.AccessTokenAppIdPair)localIterator1.next();
      AppEventsLogger.SessionEventsState localSessionEventsState = getSessionEventsState(localAccessTokenAppIdPair);
      if (localSessionEventsState != null)
      {
        Request localRequest = buildRequestForSession(localAccessTokenAppIdPair, localSessionEventsState, bool, localFlushStatistics);
        if (localRequest != null)
          localArrayList.add(localRequest);
      }
    }
    if (localArrayList.size() > 0)
    {
      LoggingBehavior localLoggingBehavior = LoggingBehavior.APP_EVENTS;
      String str = TAG;
      Object[] arrayOfObject = new Object[2];
      arrayOfObject[0] = Integer.valueOf(localFlushStatistics.numEvents);
      arrayOfObject[1] = paramFlushReason.toString();
      Logger.log(localLoggingBehavior, str, "Flushing %d events due to %s.", arrayOfObject);
      Iterator localIterator2 = localArrayList.iterator();
      while (localIterator2.hasNext())
        ((Request)localIterator2.next()).executeAndWait();
      return localFlushStatistics;
    }
    return null;
  }

  private static Request buildRequestForSession(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, final AppEventsLogger.SessionEventsState paramSessionEventsState, boolean paramBoolean, final AppEventsLogger.FlushStatistics paramFlushStatistics)
  {
    String str = paramAccessTokenAppIdPair.getApplicationId();
    Utility.FetchedAppSettings localFetchedAppSettings = Utility.queryAppSettings(str, false);
    final Request localRequest = Request.newPostRequest(null, String.format("%s/activities", new Object[] { str }), null, null);
    Bundle localBundle = localRequest.getParameters();
    if (localBundle == null)
      localBundle = new Bundle();
    localBundle.putString("access_token", paramAccessTokenAppIdPair.getAccessToken());
    localRequest.setParameters(localBundle);
    if (localFetchedAppSettings == null)
      return null;
    int i = paramSessionEventsState.populateRequest(localRequest, localFetchedAppSettings.supportsImplicitLogging(), localFetchedAppSettings.supportsAttribution(), paramBoolean);
    if (i == 0)
      return null;
    paramFlushStatistics.numEvents = (i + paramFlushStatistics.numEvents);
    localRequest.setCallback(new Request.Callback()
    {
      public final void onCompleted(Response paramAnonymousResponse)
      {
        AppEventsLogger.handleResponse(AppEventsLogger.this, localRequest, paramAnonymousResponse, paramSessionEventsState, paramFlushStatistics);
      }
    });
    return localRequest;
  }

  public static void deactivateApp(Context paramContext)
  {
    deactivateApp(paramContext, Utility.getMetadataApplicationId(paramContext));
  }

  public static void deactivateApp(Context paramContext, String paramString)
  {
    if ((paramContext == null) || (paramString == null))
      throw new IllegalArgumentException("Both context and applicationId must be non-null");
    resetSourceApplication();
    AppEventsLogger localAppEventsLogger = new AppEventsLogger(paramContext, paramString, null);
    final long l = System.currentTimeMillis();
    backgroundExecutor.execute(new Runnable()
    {
      public final void run()
      {
        AppEventsLogger.this.logAppSessionSuspendEvent(l);
      }
    });
  }

  static void eagerFlush()
  {
    if (getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY)
      flush(AppEventsLogger.FlushReason.EAGER_FLUSHING_EVENT);
  }

  private static void flush(AppEventsLogger.FlushReason paramFlushReason)
  {
    Settings.getExecutor().execute(new Runnable()
    {
      public final void run()
      {
        AppEventsLogger.flushAndWait(AppEventsLogger.this);
      }
    });
  }

  private static void flushAndWait(AppEventsLogger.FlushReason paramFlushReason)
  {
    HashSet localHashSet;
    synchronized (staticLock)
    {
      if (requestInFlight)
        return;
      requestInFlight = true;
      localHashSet = new HashSet(stateMap.keySet());
      accumulatePersistedEvents();
    }
    try
    {
      AppEventsLogger.FlushStatistics localFlushStatistics2 = buildAndExecuteRequests(paramFlushReason, localHashSet);
      localFlushStatistics1 = localFlushStatistics2;
    }
    catch (Exception localException)
    {
      synchronized (staticLock)
      {
        AppEventsLogger.FlushStatistics localFlushStatistics1;
        requestInFlight = false;
        if (localFlushStatistics1 != null)
        {
          Intent localIntent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
          localIntent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", localFlushStatistics1.numEvents);
          localIntent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", localFlushStatistics1.result);
          m.a(applicationContext).a(localIntent);
          return;
          localObject2 = finally;
          throw localObject2;
          localException = localException;
          Utility.logd(TAG, "Caught unexpected exception while flushing: ", localException);
          localFlushStatistics1 = null;
        }
      }
    }
  }

  private static void flushIfNecessary()
  {
    synchronized (staticLock)
    {
      if ((getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) && (getAccumulatedEventCount() > 100))
        flush(AppEventsLogger.FlushReason.EVENT_THRESHOLD);
      return;
    }
  }

  private static int getAccumulatedEventCount()
  {
    synchronized (staticLock)
    {
      Iterator localIterator = stateMap.values().iterator();
      int i = 0;
      while (localIterator.hasNext())
        i += ((AppEventsLogger.SessionEventsState)localIterator.next()).getAccumulatedEventCount();
      return i;
    }
  }

  public static AppEventsLogger.FlushBehavior getFlushBehavior()
  {
    synchronized (staticLock)
    {
      AppEventsLogger.FlushBehavior localFlushBehavior = flushBehavior;
      return localFlushBehavior;
    }
  }

  @Deprecated
  public static boolean getLimitEventUsage(Context paramContext)
  {
    return Settings.getLimitEventAndDataUsage(paramContext);
  }

  private static AppEventsLogger.SessionEventsState getSessionEventsState(Context paramContext, AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    AppEventsLogger.SessionEventsState localSessionEventsState1 = (AppEventsLogger.SessionEventsState)stateMap.get(paramAccessTokenAppIdPair);
    AttributionIdentifiers localAttributionIdentifiers = null;
    if (localSessionEventsState1 == null)
      localAttributionIdentifiers = AttributionIdentifiers.getAttributionIdentifiers(paramContext);
    synchronized (staticLock)
    {
      AppEventsLogger.SessionEventsState localSessionEventsState2 = (AppEventsLogger.SessionEventsState)stateMap.get(paramAccessTokenAppIdPair);
      if (localSessionEventsState2 == null)
      {
        localSessionEventsState2 = new AppEventsLogger.SessionEventsState(localAttributionIdentifiers, paramContext.getPackageName(), hashedDeviceAndAppId);
        stateMap.put(paramAccessTokenAppIdPair, localSessionEventsState2);
      }
      return localSessionEventsState2;
    }
  }

  private static AppEventsLogger.SessionEventsState getSessionEventsState(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    synchronized (staticLock)
    {
      AppEventsLogger.SessionEventsState localSessionEventsState = (AppEventsLogger.SessionEventsState)stateMap.get(paramAccessTokenAppIdPair);
      return localSessionEventsState;
    }
  }

  static String getSourceApplication()
  {
    String str = "Unclassified";
    if (isOpenedByApplink)
      str = "Applink";
    if (sourceApplication != null)
      str = str + "(" + sourceApplication + ")";
    return str;
  }

  private static void handleResponse(AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair, Request paramRequest, Response paramResponse, AppEventsLogger.SessionEventsState paramSessionEventsState, AppEventsLogger.FlushStatistics paramFlushStatistics)
  {
    FacebookRequestError localFacebookRequestError = paramResponse.getError();
    AppEventsLogger.FlushResult localFlushResult1 = AppEventsLogger.FlushResult.SUCCESS;
    AppEventsLogger.FlushResult localFlushResult3;
    Object localObject1;
    if (localFacebookRequestError != null)
      if (localFacebookRequestError.getErrorCode() == -1)
      {
        localFlushResult3 = AppEventsLogger.FlushResult.NO_CONNECTIVITY;
        localObject1 = "Failed: No Connectivity";
      }
    for (Object localObject2 = localFlushResult3; ; localObject2 = localFlushResult1)
    {
      while (true)
      {
        String str1;
        if (Settings.isLoggingBehaviorEnabled(LoggingBehavior.APP_EVENTS))
          str1 = (String)paramRequest.getTag();
        try
        {
          String str4 = new JSONArray(str1).toString(2);
          str2 = str4;
          LoggingBehavior localLoggingBehavior = LoggingBehavior.APP_EVENTS;
          String str3 = TAG;
          Object[] arrayOfObject1 = new Object[3];
          arrayOfObject1[0] = paramRequest.getGraphObject().toString();
          arrayOfObject1[1] = localObject1;
          arrayOfObject1[2] = str2;
          Logger.log(localLoggingBehavior, str3, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", arrayOfObject1);
          if (localFacebookRequestError != null)
          {
            bool = true;
            paramSessionEventsState.clearInFlightAndStats(bool);
            if (localObject2 == AppEventsLogger.FlushResult.NO_CONNECTIVITY)
              AppEventsLogger.PersistedEvents.persistEvents(applicationContext, paramAccessTokenAppIdPair, paramSessionEventsState);
            if ((localObject2 != AppEventsLogger.FlushResult.SUCCESS) && (paramFlushStatistics.result != AppEventsLogger.FlushResult.NO_CONNECTIVITY))
              paramFlushStatistics.result = ((AppEventsLogger.FlushResult)localObject2);
            return;
            Object[] arrayOfObject2 = new Object[2];
            arrayOfObject2[0] = paramResponse.toString();
            arrayOfObject2[1] = localFacebookRequestError.toString();
            String str5 = String.format("Failed:\n  Response: %s\n  Error %s", arrayOfObject2);
            AppEventsLogger.FlushResult localFlushResult2 = AppEventsLogger.FlushResult.SERVER_ERROR;
            localObject1 = str5;
            localObject2 = localFlushResult2;
          }
        }
        catch (JSONException localJSONException)
        {
          while (true)
          {
            String str2 = "<Can't encode events for debug logging>";
            continue;
            boolean bool = false;
          }
        }
      }
      localObject1 = "Success";
    }
  }

  private static void initializeTimersIfNeeded()
  {
    synchronized (staticLock)
    {
      if (backgroundExecutor != null)
        return;
      backgroundExecutor = new ScheduledThreadPoolExecutor(1);
      Runnable local3 = new Runnable()
      {
        public final void run()
        {
          if (AppEventsLogger.getFlushBehavior() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY)
            AppEventsLogger.flushAndWait(AppEventsLogger.FlushReason.TIMER);
        }
      };
      backgroundExecutor.scheduleAtFixedRate(local3, 0L, 15L, TimeUnit.SECONDS);
      Runnable local4 = new Runnable()
      {
        public final void run()
        {
          HashSet localHashSet = new HashSet();
          synchronized (AppEventsLogger.staticLock)
          {
            Iterator localIterator1 = AppEventsLogger.stateMap.keySet().iterator();
            if (localIterator1.hasNext())
              localHashSet.add(((AppEventsLogger.AccessTokenAppIdPair)localIterator1.next()).getApplicationId());
          }
          Iterator localIterator2 = localHashSet.iterator();
          while (localIterator2.hasNext())
            Utility.queryAppSettings((String)localIterator2.next(), true);
        }
      };
      backgroundExecutor.scheduleAtFixedRate(local4, 0L, 86400L, TimeUnit.SECONDS);
      return;
    }
  }

  private void logAppSessionResumeEvent(long paramLong, String paramString)
  {
    AppEventsLogger.PersistedAppSessionInfo.onResume(applicationContext, this.accessTokenAppId, this, paramLong, paramString);
  }

  private void logAppSessionSuspendEvent(long paramLong)
  {
    AppEventsLogger.PersistedAppSessionInfo.onSuspend(applicationContext, this.accessTokenAppId, this, paramLong);
  }

  private static void logEvent(Context paramContext, final AppEventsLogger.AppEvent paramAppEvent, final AppEventsLogger.AccessTokenAppIdPair paramAccessTokenAppIdPair)
  {
    Settings.getExecutor().execute(new Runnable()
    {
      public final void run()
      {
        AppEventsLogger.getSessionEventsState(AppEventsLogger.this, paramAccessTokenAppIdPair).addEvent(paramAppEvent);
        AppEventsLogger.access$700();
      }
    });
  }

  private void logEvent(String paramString, Double paramDouble, Bundle paramBundle, boolean paramBoolean)
  {
    AppEventsLogger.AppEvent localAppEvent = new AppEventsLogger.AppEvent(this.context, paramString, paramDouble, paramBundle, paramBoolean);
    logEvent(this.context, localAppEvent, this.accessTokenAppId);
  }

  public static AppEventsLogger newLogger(Context paramContext)
  {
    return new AppEventsLogger(paramContext, null, null);
  }

  public static AppEventsLogger newLogger(Context paramContext, Session paramSession)
  {
    return new AppEventsLogger(paramContext, null, paramSession);
  }

  public static AppEventsLogger newLogger(Context paramContext, String paramString)
  {
    return new AppEventsLogger(paramContext, paramString, null);
  }

  public static AppEventsLogger newLogger(Context paramContext, String paramString, Session paramSession)
  {
    return new AppEventsLogger(paramContext, paramString, paramSession);
  }

  private static void notifyDeveloperError(String paramString)
  {
    Logger.log(LoggingBehavior.DEVELOPER_ERRORS, "AppEvents", paramString);
  }

  public static void onContextStop()
  {
    AppEventsLogger.PersistedEvents.persistEvents(applicationContext, stateMap);
  }

  static void resetSourceApplication()
  {
    sourceApplication = null;
    isOpenedByApplink = false;
  }

  public static void setFlushBehavior(AppEventsLogger.FlushBehavior paramFlushBehavior)
  {
    synchronized (staticLock)
    {
      flushBehavior = paramFlushBehavior;
      return;
    }
  }

  @Deprecated
  public static void setLimitEventUsage(Context paramContext, boolean paramBoolean)
  {
    Settings.setLimitEventAndDataUsage(paramContext, paramBoolean);
  }

  private static void setSourceApplication(Activity paramActivity)
  {
    ComponentName localComponentName = paramActivity.getCallingActivity();
    if (localComponentName != null)
    {
      String str = localComponentName.getPackageName();
      if (str.equals(paramActivity.getPackageName()))
      {
        resetSourceApplication();
        return;
      }
      sourceApplication = str;
    }
    Intent localIntent = paramActivity.getIntent();
    if ((localIntent == null) || (localIntent.getBooleanExtra("_fbSourceApplicationHasBeenSet", false)))
    {
      resetSourceApplication();
      return;
    }
    Bundle localBundle1 = e.a(localIntent);
    if (localBundle1 == null)
    {
      resetSourceApplication();
      return;
    }
    isOpenedByApplink = true;
    Bundle localBundle2 = localBundle1.getBundle("referer_app_link");
    if (localBundle2 == null)
    {
      sourceApplication = null;
      return;
    }
    sourceApplication = localBundle2.getString("package");
    localIntent.putExtra("_fbSourceApplicationHasBeenSet", true);
  }

  static void setSourceApplication(String paramString, boolean paramBoolean)
  {
    sourceApplication = paramString;
    isOpenedByApplink = paramBoolean;
  }

  public void flush()
  {
    flush(AppEventsLogger.FlushReason.EXPLICIT);
  }

  public String getApplicationId()
  {
    return this.accessTokenAppId.getApplicationId();
  }

  boolean isValidForSession(Session paramSession)
  {
    AppEventsLogger.AccessTokenAppIdPair localAccessTokenAppIdPair = new AppEventsLogger.AccessTokenAppIdPair(paramSession);
    return this.accessTokenAppId.equals(localAccessTokenAppIdPair);
  }

  public void logEvent(String paramString)
  {
    logEvent(paramString, null);
  }

  public void logEvent(String paramString, double paramDouble)
  {
    logEvent(paramString, paramDouble, null);
  }

  public void logEvent(String paramString, double paramDouble, Bundle paramBundle)
  {
    logEvent(paramString, Double.valueOf(paramDouble), paramBundle, false);
  }

  public void logEvent(String paramString, Bundle paramBundle)
  {
    logEvent(paramString, null, paramBundle, false);
  }

  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency)
  {
    logPurchase(paramBigDecimal, paramCurrency, null);
  }

  public void logPurchase(BigDecimal paramBigDecimal, Currency paramCurrency, Bundle paramBundle)
  {
    if (paramBigDecimal == null)
    {
      notifyDeveloperError("purchaseAmount cannot be null");
      return;
    }
    if (paramCurrency == null)
    {
      notifyDeveloperError("currency cannot be null");
      return;
    }
    if (paramBundle == null)
      paramBundle = new Bundle();
    paramBundle.putString("fb_currency", paramCurrency.getCurrencyCode());
    logEvent("fb_mobile_purchase", paramBigDecimal.doubleValue(), paramBundle);
    eagerFlush();
  }

  public void logSdkEvent(String paramString, Double paramDouble, Bundle paramBundle)
  {
    logEvent(paramString, paramDouble, paramBundle, true);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger
 * JD-Core Version:    0.6.2
 */