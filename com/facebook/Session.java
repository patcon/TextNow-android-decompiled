package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.content.m;
import android.text.TextUtils;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

public class Session
  implements Serializable
{
  public static final String ACTION_ACTIVE_SESSION_CLOSED = "com.facebook.sdk.ACTIVE_SESSION_CLOSED";
  public static final String ACTION_ACTIVE_SESSION_OPENED = "com.facebook.sdk.ACTIVE_SESSION_OPENED";
  public static final String ACTION_ACTIVE_SESSION_SET = "com.facebook.sdk.ACTIVE_SESSION_SET";
  public static final String ACTION_ACTIVE_SESSION_UNSET = "com.facebook.sdk.ACTIVE_SESSION_UNSET";
  private static final String AUTH_BUNDLE_SAVE_KEY = "com.facebook.sdk.Session.authBundleKey";
  public static final int DEFAULT_AUTHORIZE_ACTIVITY_CODE = 64206;
  private static final String MANAGE_PERMISSION_PREFIX = "manage";
  private static final Set<String> OTHER_PUBLISH_PERMISSIONS = new HashSet()
  {
  };
  private static final String PUBLISH_PERMISSION_PREFIX = "publish";
  private static final String SESSION_BUNDLE_SAVE_KEY = "com.facebook.sdk.Session.saveSessionKey";
  private static final Object STATIC_LOCK;
  public static final String TAG = Session.class.getCanonicalName();
  private static final int TOKEN_EXTEND_RETRY_SECONDS = 3600;
  private static final int TOKEN_EXTEND_THRESHOLD_SECONDS = 86400;
  public static final String WEB_VIEW_ERROR_CODE_KEY = "com.facebook.sdk.WebViewErrorCode";
  public static final String WEB_VIEW_FAILING_URL_KEY = "com.facebook.sdk.FailingUrl";
  private static Session activeSession;
  private static final long serialVersionUID = 1L;
  private static volatile Context staticContext;
  private AppEventsLogger appEventsLogger;
  private String applicationId;
  private volatile Bundle authorizationBundle;
  private AuthorizationClient authorizationClient;
  private Session.AutoPublishAsyncTask autoPublishAsyncTask;
  private final List<Session.StatusCallback> callbacks;
  private volatile Session.TokenRefreshRequest currentTokenRefreshRequest;
  private Handler handler;
  private Date lastAttemptedTokenExtendDate = new Date(0L);
  private final Object lock = new Object();
  private Session.AuthorizationRequest pendingAuthorizationRequest;
  private SessionState state;
  private TokenCachingStrategy tokenCachingStrategy;
  private AccessToken tokenInfo;

  static
  {
    STATIC_LOCK = new Object();
  }

  public Session(Context paramContext)
  {
    this(paramContext, null, null, true);
  }

  Session(Context paramContext, String paramString, TokenCachingStrategy paramTokenCachingStrategy)
  {
    this(paramContext, paramString, paramTokenCachingStrategy, true);
  }

  Session(Context paramContext, String paramString, TokenCachingStrategy paramTokenCachingStrategy, boolean paramBoolean)
  {
    if ((paramContext != null) && (paramString == null))
      paramString = Utility.getMetadataApplicationId(paramContext);
    Validate.notNull(paramString, "applicationId");
    initializeStaticContext(paramContext);
    if (paramTokenCachingStrategy == null)
      paramTokenCachingStrategy = new SharedPreferencesTokenCachingStrategy(staticContext);
    this.applicationId = paramString;
    this.tokenCachingStrategy = paramTokenCachingStrategy;
    this.state = SessionState.CREATED;
    this.pendingAuthorizationRequest = null;
    this.callbacks = new ArrayList();
    this.handler = new Handler(Looper.getMainLooper());
    Bundle localBundle = null;
    if (paramBoolean)
      localBundle = paramTokenCachingStrategy.load();
    if (TokenCachingStrategy.hasTokenInformation(localBundle))
    {
      Date localDate1 = TokenCachingStrategy.getDate(localBundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
      Date localDate2 = new Date();
      if ((localDate1 == null) || (localDate1.before(localDate2)))
      {
        paramTokenCachingStrategy.clear();
        this.tokenInfo = AccessToken.createEmptyToken();
        return;
      }
      this.tokenInfo = AccessToken.createFromCache(localBundle);
      this.state = SessionState.CREATED_TOKEN_LOADED;
      return;
    }
    this.tokenInfo = AccessToken.createEmptyToken();
  }

  private Session(String paramString, SessionState paramSessionState, AccessToken paramAccessToken, Date paramDate, boolean paramBoolean, Session.AuthorizationRequest paramAuthorizationRequest)
  {
    this.applicationId = paramString;
    this.state = paramSessionState;
    this.tokenInfo = paramAccessToken;
    this.lastAttemptedTokenExtendDate = paramDate;
    this.pendingAuthorizationRequest = paramAuthorizationRequest;
    this.handler = new Handler(Looper.getMainLooper());
    this.currentTokenRefreshRequest = null;
    this.tokenCachingStrategy = null;
    this.callbacks = new ArrayList();
  }

  private Session(String paramString, SessionState paramSessionState, AccessToken paramAccessToken, Date paramDate, boolean paramBoolean, Session.AuthorizationRequest paramAuthorizationRequest, Set<String> paramSet)
  {
    this.applicationId = paramString;
    this.state = paramSessionState;
    this.tokenInfo = paramAccessToken;
    this.lastAttemptedTokenExtendDate = paramDate;
    this.pendingAuthorizationRequest = paramAuthorizationRequest;
    this.handler = new Handler(Looper.getMainLooper());
    this.currentTokenRefreshRequest = null;
    this.tokenCachingStrategy = null;
    this.callbacks = new ArrayList();
  }

  private static boolean areEqual(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 == null)
      return paramObject2 == null;
    return paramObject1.equals(paramObject2);
  }

  private void autoPublishAsync()
  {
    try
    {
      Session.AutoPublishAsyncTask localAutoPublishAsyncTask1 = this.autoPublishAsyncTask;
      Session.AutoPublishAsyncTask localAutoPublishAsyncTask2 = null;
      if (localAutoPublishAsyncTask1 == null)
      {
        boolean bool = Settings.getShouldAutoPublishInstall();
        localAutoPublishAsyncTask2 = null;
        if (bool)
        {
          String str = this.applicationId;
          localAutoPublishAsyncTask2 = null;
          if (str != null)
          {
            localAutoPublishAsyncTask2 = new Session.AutoPublishAsyncTask(this, str, staticContext);
            this.autoPublishAsyncTask = localAutoPublishAsyncTask2;
          }
        }
      }
      if (localAutoPublishAsyncTask2 != null)
        localAutoPublishAsyncTask2.execute(new Void[0]);
      return;
    }
    finally
    {
    }
  }

  private void finishAuthorization(AccessToken paramAccessToken, Exception paramException)
  {
    SessionState localSessionState = this.state;
    if (paramAccessToken != null)
    {
      this.tokenInfo = paramAccessToken;
      saveTokenToCache(paramAccessToken);
      this.state = SessionState.OPENED;
    }
    while (true)
    {
      this.pendingAuthorizationRequest = null;
      postStateChange(localSessionState, this.state, paramException);
      return;
      if (paramException != null)
        this.state = SessionState.CLOSED_LOGIN_FAILED;
    }
  }

  private void finishReauthorization(AccessToken paramAccessToken, Exception paramException)
  {
    SessionState localSessionState = this.state;
    if (paramAccessToken != null)
    {
      this.tokenInfo = paramAccessToken;
      saveTokenToCache(paramAccessToken);
      this.state = SessionState.OPENED_TOKEN_UPDATED;
    }
    this.pendingAuthorizationRequest = null;
    postStateChange(localSessionState, this.state, paramException);
  }

  public static final Session getActiveSession()
  {
    synchronized (STATIC_LOCK)
    {
      Session localSession = activeSession;
      return localSession;
    }
  }

  private AppEventsLogger getAppEventsLogger()
  {
    synchronized (this.lock)
    {
      if (this.appEventsLogger == null)
        this.appEventsLogger = AppEventsLogger.newLogger(staticContext, this.applicationId);
      AppEventsLogger localAppEventsLogger = this.appEventsLogger;
      return localAppEventsLogger;
    }
  }

  private Intent getLoginActivityIntent(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    Intent localIntent = new Intent();
    localIntent.setClass(getStaticContext(), LoginActivity.class);
    localIntent.setAction(paramAuthorizationRequest.getLoginBehavior().toString());
    localIntent.putExtras(LoginActivity.populateIntentExtras(paramAuthorizationRequest.getAuthorizationClientRequest()));
    return localIntent;
  }

  static Context getStaticContext()
  {
    return staticContext;
  }

  private void handleAuthorizationResult(int paramInt, AuthorizationClient.Result paramResult)
  {
    AccessToken localAccessToken;
    Object localObject;
    if (paramInt == -1)
      if (paramResult.code == AuthorizationClient.Result.Code.SUCCESS)
      {
        localAccessToken = paramResult.token;
        localObject = null;
      }
    while (true)
    {
      logAuthorizationComplete(paramResult.code, paramResult.loggingExtras, (Exception)localObject);
      this.authorizationClient = null;
      finishAuthOrReauth(localAccessToken, (Exception)localObject);
      return;
      localObject = new FacebookAuthorizationException(paramResult.errorMessage);
      localAccessToken = null;
      continue;
      if (paramInt == 0)
      {
        localObject = new FacebookOperationCanceledException(paramResult.errorMessage);
        localAccessToken = null;
      }
      else
      {
        localObject = null;
        localAccessToken = null;
      }
    }
  }

  static Session.PermissionsPair handlePermissionResponse(Response paramResponse)
  {
    if (paramResponse.getError() != null)
      return null;
    GraphMultiResult localGraphMultiResult = (GraphMultiResult)paramResponse.getGraphObjectAs(GraphMultiResult.class);
    if (localGraphMultiResult == null)
      return null;
    GraphObjectList localGraphObjectList = localGraphMultiResult.getData();
    if ((localGraphObjectList == null) || (localGraphObjectList.size() == 0))
      return null;
    ArrayList localArrayList1 = new ArrayList(localGraphObjectList.size());
    ArrayList localArrayList2 = new ArrayList(localGraphObjectList.size());
    GraphObject localGraphObject1 = (GraphObject)localGraphObjectList.get(0);
    if (localGraphObject1.getProperty("permission") != null)
    {
      Iterator localIterator2 = localGraphObjectList.iterator();
      while (localIterator2.hasNext())
      {
        GraphObject localGraphObject2 = (GraphObject)localIterator2.next();
        String str1 = (String)localGraphObject2.getProperty("permission");
        if (!str1.equals("installed"))
        {
          String str2 = (String)localGraphObject2.getProperty("status");
          if (str2.equals("granted"))
            localArrayList1.add(str1);
          else if (str2.equals("declined"))
            localArrayList2.add(str1);
        }
      }
    }
    Iterator localIterator1 = localGraphObject1.asMap().entrySet().iterator();
    while (localIterator1.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator1.next();
      if ((!((String)localEntry.getKey()).equals("installed")) && (((Integer)localEntry.getValue()).intValue() == 1))
        localArrayList1.add(localEntry.getKey());
    }
    return new Session.PermissionsPair(localArrayList1, localArrayList2);
  }

  static void initializeStaticContext(Context paramContext)
  {
    if ((paramContext != null) && (staticContext == null))
    {
      Context localContext = paramContext.getApplicationContext();
      if (localContext != null)
        paramContext = localContext;
      staticContext = paramContext;
    }
  }

  public static boolean isPublishPermission(String paramString)
  {
    return (paramString != null) && ((paramString.startsWith("publish")) || (paramString.startsWith("manage")) || (OTHER_PUBLISH_PERMISSIONS.contains(paramString)));
  }

  private void logAuthorizationComplete(AuthorizationClient.Result.Code paramCode, Map<String, String> paramMap, Exception paramException)
  {
    Object localObject2;
    if (this.pendingAuthorizationRequest == null)
    {
      localObject2 = AuthorizationClient.newAuthorizationLoggingBundle("");
      ((Bundle)localObject2).putString("2_result", AuthorizationClient.Result.Code.ERROR.getLoggingValue());
      ((Bundle)localObject2).putString("5_error_message", "Unexpected call to logAuthorizationComplete with null pendingAuthorizationRequest.");
      ((Bundle)localObject2).putLong("1_timestamp_ms", System.currentTimeMillis());
      getAppEventsLogger().logSdkEvent("fb_mobile_login_complete", null, (Bundle)localObject2);
      return;
    }
    Bundle localBundle = AuthorizationClient.newAuthorizationLoggingBundle(this.pendingAuthorizationRequest.getAuthId());
    if (paramCode != null)
      localBundle.putString("2_result", paramCode.getLoggingValue());
    if ((paramException != null) && (paramException.getMessage() != null))
      localBundle.putString("5_error_message", paramException.getMessage());
    if (!Session.AuthorizationRequest.access$500(this.pendingAuthorizationRequest).isEmpty());
    for (Object localObject1 = new JSONObject(Session.AuthorizationRequest.access$500(this.pendingAuthorizationRequest)); ; localObject1 = null)
    {
      if (paramMap != null)
        if (localObject1 != null)
          break label264;
      label264: for (Object localObject3 = new JSONObject(); ; localObject3 = localObject1)
      {
        try
        {
          Iterator localIterator = paramMap.entrySet().iterator();
          while (localIterator.hasNext())
          {
            Map.Entry localEntry = (Map.Entry)localIterator.next();
            ((JSONObject)localObject3).put((String)localEntry.getKey(), localEntry.getValue());
          }
        }
        catch (JSONException localJSONException)
        {
          localObject1 = localObject3;
        }
        while (true)
        {
          if (localObject1 != null)
            localBundle.putString("6_extras", ((JSONObject)localObject1).toString());
          localObject2 = localBundle;
          break;
          localObject1 = localObject3;
        }
      }
    }
  }

  private void logAuthorizationStart()
  {
    Bundle localBundle = AuthorizationClient.newAuthorizationLoggingBundle(this.pendingAuthorizationRequest.getAuthId());
    localBundle.putLong("1_timestamp_ms", System.currentTimeMillis());
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("login_behavior", Session.AuthorizationRequest.access$700(this.pendingAuthorizationRequest).toString());
      localJSONObject.put("request_code", Session.AuthorizationRequest.access$800(this.pendingAuthorizationRequest));
      localJSONObject.put("is_legacy", Session.AuthorizationRequest.access$600(this.pendingAuthorizationRequest));
      localJSONObject.put("permissions", TextUtils.join(",", Session.AuthorizationRequest.access$900(this.pendingAuthorizationRequest)));
      localJSONObject.put("default_audience", Session.AuthorizationRequest.access$1000(this.pendingAuthorizationRequest).toString());
      localBundle.putString("6_extras", localJSONObject.toString());
      label127: getAppEventsLogger().logSdkEvent("fb_mobile_login_start", null, localBundle);
      return;
    }
    catch (JSONException localJSONException)
    {
      break label127;
    }
  }

  private void open(Session.OpenRequest paramOpenRequest, SessionAuthorizationType paramSessionAuthorizationType)
  {
    validatePermissions(paramOpenRequest, paramSessionAuthorizationType);
    validateLoginBehavior(paramOpenRequest);
    SessionState localSessionState1;
    synchronized (this.lock)
    {
      if (this.pendingAuthorizationRequest != null)
      {
        postStateChange(this.state, this.state, new UnsupportedOperationException("Session: an attempt was made to open a session that has a pending request."));
        return;
      }
      localSessionState1 = this.state;
      switch (5.$SwitchMap$com$facebook$SessionState[this.state.ordinal()])
      {
      case 2:
      default:
        throw new UnsupportedOperationException("Session: an attempt was made to open an already opened session.");
      case 1:
      case 3:
      }
    }
    SessionState localSessionState2 = SessionState.OPENING;
    this.state = localSessionState2;
    if (paramOpenRequest == null)
      throw new IllegalArgumentException("openRequest cannot be null when opening a new Session");
    this.pendingAuthorizationRequest = paramOpenRequest;
    while (true)
    {
      if (paramOpenRequest != null)
        addCallback(paramOpenRequest.getCallback());
      postStateChange(localSessionState1, localSessionState2, null);
      if (localSessionState2 != SessionState.OPENING)
        break;
      authorize(paramOpenRequest);
      return;
      if ((paramOpenRequest != null) && (!Utility.isNullOrEmpty(paramOpenRequest.getPermissions())) && (!Utility.isSubset(paramOpenRequest.getPermissions(), getPermissions())))
        this.pendingAuthorizationRequest = paramOpenRequest;
      if (this.pendingAuthorizationRequest == null)
      {
        localSessionState2 = SessionState.OPENED;
        this.state = localSessionState2;
      }
      else
      {
        localSessionState2 = SessionState.OPENING;
        this.state = localSessionState2;
      }
    }
  }

  public static Session openActiveSession(Activity paramActivity, boolean paramBoolean, Session.StatusCallback paramStatusCallback)
  {
    return openActiveSession(paramActivity, paramBoolean, new Session.OpenRequest(paramActivity).setCallback(paramStatusCallback));
  }

  public static Session openActiveSession(Activity paramActivity, boolean paramBoolean, List<String> paramList, Session.StatusCallback paramStatusCallback)
  {
    return openActiveSession(paramActivity, paramBoolean, new Session.OpenRequest(paramActivity).setCallback(paramStatusCallback).setPermissions(paramList));
  }

  public static Session openActiveSession(Context paramContext, Fragment paramFragment, boolean paramBoolean, Session.StatusCallback paramStatusCallback)
  {
    return openActiveSession(paramContext, paramBoolean, new Session.OpenRequest(paramFragment).setCallback(paramStatusCallback));
  }

  public static Session openActiveSession(Context paramContext, Fragment paramFragment, boolean paramBoolean, List<String> paramList, Session.StatusCallback paramStatusCallback)
  {
    return openActiveSession(paramContext, paramBoolean, new Session.OpenRequest(paramFragment).setCallback(paramStatusCallback).setPermissions(paramList));
  }

  private static Session openActiveSession(Context paramContext, boolean paramBoolean, Session.OpenRequest paramOpenRequest)
  {
    Session localSession = new Session.Builder(paramContext).build();
    if ((SessionState.CREATED_TOKEN_LOADED.equals(localSession.getState())) || (paramBoolean))
    {
      setActiveSession(localSession);
      localSession.openForRead(paramOpenRequest);
      return localSession;
    }
    return null;
  }

  public static Session openActiveSessionFromCache(Context paramContext)
  {
    return openActiveSession(paramContext, false, null);
  }

  public static Session openActiveSessionWithAccessToken(Context paramContext, AccessToken paramAccessToken, Session.StatusCallback paramStatusCallback)
  {
    Session localSession = new Session(paramContext, null, null, false);
    setActiveSession(localSession);
    localSession.open(paramAccessToken, paramStatusCallback);
    return localSession;
  }

  static void postActiveSessionAction(String paramString)
  {
    Intent localIntent = new Intent(paramString);
    m.a(getStaticContext()).a(localIntent);
  }

  private void readObject(ObjectInputStream paramObjectInputStream)
  {
    throw new InvalidObjectException("Cannot readObject, serialization proxy required");
  }

  private void requestNewPermissions(Session.NewPermissionsRequest paramNewPermissionsRequest, SessionAuthorizationType paramSessionAuthorizationType)
  {
    validatePermissions(paramNewPermissionsRequest, paramSessionAuthorizationType);
    validateLoginBehavior(paramNewPermissionsRequest);
    if (paramNewPermissionsRequest != null)
    {
      synchronized (this.lock)
      {
        if (this.pendingAuthorizationRequest != null)
          throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that has a pending request.");
      }
      if (this.state.isOpened())
      {
        this.pendingAuthorizationRequest = paramNewPermissionsRequest;
        paramNewPermissionsRequest.setValidateSameFbidAsToken(getAccessToken());
        addCallback(paramNewPermissionsRequest.getCallback());
        authorize(paramNewPermissionsRequest);
      }
    }
    else
    {
      return;
    }
    if (this.state.isClosed())
      throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that has been closed.");
    throw new UnsupportedOperationException("Session: an attempt was made to request new permissions for a session that is not currently open.");
  }

  private boolean resolveIntent(Intent paramIntent)
  {
    return getStaticContext().getPackageManager().resolveActivity(paramIntent, 0) != null;
  }

  public static final Session restoreSession(Context paramContext, TokenCachingStrategy paramTokenCachingStrategy, Session.StatusCallback paramStatusCallback, Bundle paramBundle)
  {
    if (paramBundle == null)
      return null;
    byte[] arrayOfByte = paramBundle.getByteArray("com.facebook.sdk.Session.saveSessionKey");
    ByteArrayInputStream localByteArrayInputStream;
    if (arrayOfByte != null)
      localByteArrayInputStream = new ByteArrayInputStream(arrayOfByte);
    try
    {
      localSession = (Session)new ObjectInputStream(localByteArrayInputStream).readObject();
      initializeStaticContext(paramContext);
      if (paramTokenCachingStrategy != null)
      {
        localSession.tokenCachingStrategy = paramTokenCachingStrategy;
        if (paramStatusCallback != null)
          localSession.addCallback(paramStatusCallback);
        localSession.authorizationBundle = paramBundle.getBundle("com.facebook.sdk.Session.authBundleKey");
        return localSession;
      }
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      while (true)
      {
        Session localSession;
        return null;
        localSession.tokenCachingStrategy = new SharedPreferencesTokenCachingStrategy(paramContext);
      }
    }
    catch (IOException localIOException)
    {
      label91: break label91;
    }
  }

  private static void runWithHandlerOrExecutor(Handler paramHandler, Runnable paramRunnable)
  {
    if (paramHandler != null)
    {
      paramHandler.post(paramRunnable);
      return;
    }
    Settings.getExecutor().execute(paramRunnable);
  }

  public static final void saveSession(Session paramSession, Bundle paramBundle)
  {
    ByteArrayOutputStream localByteArrayOutputStream;
    if ((paramBundle != null) && (paramSession != null) && (!paramBundle.containsKey("com.facebook.sdk.Session.saveSessionKey")))
      localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      new ObjectOutputStream(localByteArrayOutputStream).writeObject(paramSession);
      paramBundle.putByteArray("com.facebook.sdk.Session.saveSessionKey", localByteArrayOutputStream.toByteArray());
      paramBundle.putBundle("com.facebook.sdk.Session.authBundleKey", paramSession.authorizationBundle);
      return;
    }
    catch (IOException localIOException)
    {
      throw new FacebookException("Unable to save session.", localIOException);
    }
  }

  private void saveTokenToCache(AccessToken paramAccessToken)
  {
    if ((paramAccessToken != null) && (this.tokenCachingStrategy != null))
      this.tokenCachingStrategy.save(paramAccessToken.toCacheBundle());
  }

  public static final void setActiveSession(Session paramSession)
  {
    synchronized (STATIC_LOCK)
    {
      if (paramSession != activeSession)
      {
        Session localSession = activeSession;
        if (localSession != null)
          localSession.close();
        activeSession = paramSession;
        if (localSession != null)
          postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        if (paramSession != null)
        {
          postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_SET");
          if (paramSession.isOpened())
            postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_OPENED");
        }
      }
      return;
    }
  }

  private void tryLegacyAuth(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    this.authorizationClient = new AuthorizationClient();
    this.authorizationClient.setOnCompletedListener(new AuthorizationClient.OnCompletedListener()
    {
      public void onCompleted(AuthorizationClient.Result paramAnonymousResult)
      {
        if (paramAnonymousResult.code == AuthorizationClient.Result.Code.CANCEL);
        for (int i = 0; ; i = -1)
        {
          Session.this.handleAuthorizationResult(i, paramAnonymousResult);
          return;
        }
      }
    });
    this.authorizationClient.setContext(getStaticContext());
    this.authorizationClient.startOrContinueAuth(paramAuthorizationRequest.getAuthorizationClientRequest());
  }

  private boolean tryLoginActivity(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    Intent localIntent = getLoginActivityIntent(paramAuthorizationRequest);
    if (!resolveIntent(localIntent))
      return false;
    try
    {
      paramAuthorizationRequest.getStartActivityDelegate().startActivityForResult(localIntent, paramAuthorizationRequest.getRequestCode());
      return true;
    }
    catch (ActivityNotFoundException localActivityNotFoundException)
    {
    }
    return false;
  }

  private void validateLoginBehavior(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    if ((paramAuthorizationRequest != null) && (!Session.AuthorizationRequest.access$600(paramAuthorizationRequest)))
    {
      Intent localIntent = new Intent();
      localIntent.setClass(getStaticContext(), LoginActivity.class);
      if (!resolveIntent(localIntent))
      {
        Object[] arrayOfObject = new Object[2];
        arrayOfObject[0] = paramAuthorizationRequest.getLoginBehavior();
        arrayOfObject[1] = LoginActivity.class.getName();
        throw new FacebookException(String.format("Cannot use SessionLoginBehavior %s when %s is not declared as an activity in AndroidManifest.xml", arrayOfObject));
      }
    }
  }

  private void validatePermissions(Session.AuthorizationRequest paramAuthorizationRequest, SessionAuthorizationType paramSessionAuthorizationType)
  {
    if ((paramAuthorizationRequest == null) || (Utility.isNullOrEmpty(paramAuthorizationRequest.getPermissions())))
    {
      if (SessionAuthorizationType.PUBLISH.equals(paramSessionAuthorizationType))
        throw new FacebookException("Cannot request publish or manage authorization with no permissions.");
    }
    else
    {
      Iterator localIterator = paramAuthorizationRequest.getPermissions().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        if (isPublishPermission(str))
        {
          if (SessionAuthorizationType.READ.equals(paramSessionAuthorizationType))
            throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] { str }));
        }
        else if (SessionAuthorizationType.PUBLISH.equals(paramSessionAuthorizationType))
          String.format("Should not pass a read permission (%s) to a request for publish or manage authorization", new Object[] { str });
      }
    }
  }

  private Object writeReplace()
  {
    return new Session.SerializationProxyV1(this.applicationId, this.state, this.tokenInfo, this.lastAttemptedTokenExtendDate, false, this.pendingAuthorizationRequest);
  }

  public final void addCallback(Session.StatusCallback paramStatusCallback)
  {
    List localList = this.callbacks;
    if (paramStatusCallback != null);
    try
    {
      if (!this.callbacks.contains(paramStatusCallback))
        this.callbacks.add(paramStatusCallback);
      return;
    }
    finally
    {
    }
  }

  void authorize(Session.AuthorizationRequest paramAuthorizationRequest)
  {
    paramAuthorizationRequest.setApplicationId(this.applicationId);
    autoPublishAsync();
    logAuthorizationStart();
    boolean bool = tryLoginActivity(paramAuthorizationRequest);
    Map localMap = Session.AuthorizationRequest.access$500(this.pendingAuthorizationRequest);
    String str;
    if (bool)
    {
      str = "1";
      localMap.put("try_login_activity", str);
      if ((bool) || (!Session.AuthorizationRequest.access$600(paramAuthorizationRequest)))
        break label209;
      Session.AuthorizationRequest.access$500(this.pendingAuthorizationRequest).put("try_legacy", "1");
      tryLegacyAuth(paramAuthorizationRequest);
    }
    label209: for (int i = 1; ; i = bool)
      while (true)
      {
        if (i == 0);
        synchronized (this.lock)
        {
          SessionState localSessionState = this.state;
          switch (5.$SwitchMap$com$facebook$SessionState[this.state.ordinal()])
          {
          default:
            this.state = SessionState.CLOSED_LOGIN_FAILED;
            FacebookException localFacebookException = new FacebookException("Log in attempt failed: LoginActivity could not be started, and not legacy request");
            logAuthorizationComplete(AuthorizationClient.Result.Code.ERROR, null, localFacebookException);
            postStateChange(localSessionState, this.state, localFacebookException);
            return;
            str = "0";
            break;
          case 6:
          case 7:
            return;
          }
        }
      }
  }

  public final void close()
  {
    while (true)
    {
      SessionState localSessionState;
      synchronized (this.lock)
      {
        localSessionState = this.state;
        switch (5.$SwitchMap$com$facebook$SessionState[this.state.ordinal()])
        {
        default:
          return;
        case 1:
        case 2:
          this.state = SessionState.CLOSED_LOGIN_FAILED;
          postStateChange(localSessionState, this.state, new FacebookException("Log in attempt aborted."));
        case 3:
        case 4:
        case 5:
        }
      }
      this.state = SessionState.CLOSED;
      postStateChange(localSessionState, this.state, null);
    }
  }

  public final void closeAndClearTokenInformation()
  {
    if (this.tokenCachingStrategy != null)
      this.tokenCachingStrategy.clear();
    Utility.clearFacebookCookies(staticContext);
    Utility.clearCaches(staticContext);
    close();
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof Session));
    Session localSession;
    do
    {
      return false;
      localSession = (Session)paramObject;
    }
    while ((!areEqual(localSession.applicationId, this.applicationId)) || (!areEqual(localSession.authorizationBundle, this.authorizationBundle)) || (!areEqual(localSession.state, this.state)) || (!areEqual(localSession.getExpirationDate(), getExpirationDate())));
    return true;
  }

  void extendAccessToken()
  {
    synchronized (this.lock)
    {
      Session.TokenRefreshRequest localTokenRefreshRequest1 = this.currentTokenRefreshRequest;
      Session.TokenRefreshRequest localTokenRefreshRequest2 = null;
      if (localTokenRefreshRequest1 == null)
      {
        localTokenRefreshRequest2 = new Session.TokenRefreshRequest(this);
        this.currentTokenRefreshRequest = localTokenRefreshRequest2;
      }
      if (localTokenRefreshRequest2 != null)
        localTokenRefreshRequest2.bind();
      return;
    }
  }

  void extendAccessTokenIfNeeded()
  {
    if (shouldExtendAccessToken())
      extendAccessToken();
  }

  void extendTokenCompleted(Bundle paramBundle)
  {
    synchronized (this.lock)
    {
      SessionState localSessionState = this.state;
      switch (5.$SwitchMap$com$facebook$SessionState[this.state.ordinal()])
      {
      default:
        new StringBuilder().append("refreshToken ignored in state ").append(this.state).toString();
        return;
      case 4:
        this.state = SessionState.OPENED_TOKEN_UPDATED;
        postStateChange(localSessionState, this.state, null);
      case 5:
      }
      this.tokenInfo = AccessToken.createFromRefresh(this.tokenInfo, paramBundle);
      if (this.tokenCachingStrategy != null)
        this.tokenCachingStrategy.save(this.tokenInfo.toCacheBundle());
      return;
    }
  }

  void finishAuthOrReauth(AccessToken paramAccessToken, Exception paramException)
  {
    if ((paramAccessToken != null) && (paramAccessToken.isInvalid()))
    {
      paramAccessToken = null;
      paramException = new FacebookException("Invalid access token.");
    }
    while (true)
    {
      synchronized (this.lock)
      {
        switch (5.$SwitchMap$com$facebook$SessionState[this.state.ordinal()])
        {
        default:
          return;
        case 2:
          finishAuthorization(paramAccessToken, paramException);
        case 4:
        case 5:
        case 1:
        case 3:
        case 6:
        case 7:
        }
      }
      finishReauthorization(paramAccessToken, paramException);
      continue;
      new StringBuilder().append("Unexpected call to finishAuthOrReauth in state ").append(this.state).toString();
    }
  }

  public final String getAccessToken()
  {
    synchronized (this.lock)
    {
      if (this.tokenInfo == null)
      {
        localObject3 = null;
        return localObject3;
      }
      String str = this.tokenInfo.getToken();
      Object localObject3 = str;
    }
  }

  public final String getApplicationId()
  {
    return this.applicationId;
  }

  public final Bundle getAuthorizationBundle()
  {
    synchronized (this.lock)
    {
      Bundle localBundle = this.authorizationBundle;
      return localBundle;
    }
  }

  public final List<String> getDeclinedPermissions()
  {
    synchronized (this.lock)
    {
      if (this.tokenInfo == null)
      {
        localObject3 = null;
        return localObject3;
      }
      List localList = this.tokenInfo.getDeclinedPermissions();
      Object localObject3 = localList;
    }
  }

  public final Date getExpirationDate()
  {
    synchronized (this.lock)
    {
      if (this.tokenInfo == null)
      {
        localObject3 = null;
        return localObject3;
      }
      Date localDate = this.tokenInfo.getExpires();
      Object localObject3 = localDate;
    }
  }

  Date getLastAttemptedTokenExtendDate()
  {
    return this.lastAttemptedTokenExtendDate;
  }

  public final List<String> getPermissions()
  {
    synchronized (this.lock)
    {
      if (this.tokenInfo == null)
      {
        localObject3 = null;
        return localObject3;
      }
      List localList = this.tokenInfo.getPermissions();
      Object localObject3 = localList;
    }
  }

  public final SessionState getState()
  {
    synchronized (this.lock)
    {
      SessionState localSessionState = this.state;
      return localSessionState;
    }
  }

  AccessToken getTokenInfo()
  {
    return this.tokenInfo;
  }

  public int hashCode()
  {
    return 0;
  }

  public final boolean isClosed()
  {
    synchronized (this.lock)
    {
      boolean bool = this.state.isClosed();
      return bool;
    }
  }

  public final boolean isOpened()
  {
    synchronized (this.lock)
    {
      boolean bool = this.state.isOpened();
      return bool;
    }
  }

  public boolean isPermissionGranted(String paramString)
  {
    List localList = getPermissions();
    if (localList != null)
      return localList.contains(paramString);
    return false;
  }

  public final boolean onActivityResult(Activity paramActivity, int paramInt1, int paramInt2, Intent paramIntent)
  {
    Validate.notNull(paramActivity, "currentActivity");
    initializeStaticContext(paramActivity);
    Object localObject3;
    synchronized (this.lock)
    {
      if ((this.pendingAuthorizationRequest == null) || (paramInt1 != this.pendingAuthorizationRequest.getRequestCode()))
        return false;
      localObject3 = AuthorizationClient.Result.Code.ERROR;
      if (paramIntent == null)
        break label150;
      AuthorizationClient.Result localResult = (AuthorizationClient.Result)paramIntent.getSerializableExtra("com.facebook.LoginActivity:Result");
      if (localResult != null)
      {
        handleAuthorizationResult(paramInt2, localResult);
        return true;
      }
    }
    if (this.authorizationClient != null)
    {
      this.authorizationClient.onActivityResult(paramInt1, paramInt2, paramIntent);
      return true;
    }
    Object localObject4 = null;
    while (true)
    {
      if (localObject4 == null)
        localObject4 = new FacebookException("Unexpected call to Session.onActivityResult");
      logAuthorizationComplete((AuthorizationClient.Result.Code)localObject3, null, (Exception)localObject4);
      finishAuthOrReauth(null, (Exception)localObject4);
      return true;
      label150: if (paramInt2 == 0)
      {
        FacebookOperationCanceledException localFacebookOperationCanceledException = new FacebookOperationCanceledException("User canceled operation.");
        AuthorizationClient.Result.Code localCode = AuthorizationClient.Result.Code.CANCEL;
        localObject4 = localFacebookOperationCanceledException;
        localObject3 = localCode;
      }
      else
      {
        localObject4 = null;
      }
    }
  }

  public final void open(AccessToken paramAccessToken, Session.StatusCallback paramStatusCallback)
  {
    synchronized (this.lock)
    {
      if (this.pendingAuthorizationRequest != null)
        throw new UnsupportedOperationException("Session: an attempt was made to open a session that has a pending request.");
    }
    if (this.state.isClosed())
      throw new UnsupportedOperationException("Session: an attempt was made to open a previously-closed session.");
    if ((this.state != SessionState.CREATED) && (this.state != SessionState.CREATED_TOKEN_LOADED))
      throw new UnsupportedOperationException("Session: an attempt was made to open an already opened session.");
    if (paramStatusCallback != null)
      addCallback(paramStatusCallback);
    this.tokenInfo = paramAccessToken;
    if (this.tokenCachingStrategy != null)
      this.tokenCachingStrategy.save(paramAccessToken.toCacheBundle());
    SessionState localSessionState = this.state;
    this.state = SessionState.OPENED;
    postStateChange(localSessionState, this.state, null);
    autoPublishAsync();
  }

  public final void openForPublish(Session.OpenRequest paramOpenRequest)
  {
    open(paramOpenRequest, SessionAuthorizationType.PUBLISH);
  }

  public final void openForRead(Session.OpenRequest paramOpenRequest)
  {
    open(paramOpenRequest, SessionAuthorizationType.READ);
  }

  void postStateChange(SessionState paramSessionState1, final SessionState paramSessionState2, final Exception paramException)
  {
    if ((paramSessionState1 == paramSessionState2) && (paramSessionState1 != SessionState.OPENED_TOKEN_UPDATED) && (paramException == null));
    do
    {
      return;
      if (paramSessionState2.isClosed())
        this.tokenInfo = AccessToken.createEmptyToken();
      Runnable local4 = new Runnable()
      {
        public void run()
        {
          synchronized (Session.this.callbacks)
          {
            Iterator localIterator = Session.this.callbacks.iterator();
            if (localIterator.hasNext())
            {
              Runnable local1 = new Runnable()
              {
                public void run()
                {
                  this.val$callback.call(Session.this, Session.4.this.val$newState, Session.4.this.val$exception);
                }
              };
              Session.runWithHandlerOrExecutor(Session.this.handler, local1);
            }
          }
        }
      };
      runWithHandlerOrExecutor(this.handler, local4);
    }
    while ((this != activeSession) || (paramSessionState1.isOpened() == paramSessionState2.isOpened()));
    if (paramSessionState2.isOpened())
    {
      postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_OPENED");
      return;
    }
    postActiveSessionAction("com.facebook.sdk.ACTIVE_SESSION_CLOSED");
  }

  public final void refreshPermissions()
  {
    Request localRequest = new Request(this, "me/permissions");
    localRequest.setCallback(new Request.Callback()
    {
      public void onCompleted(Response paramAnonymousResponse)
      {
        Session.PermissionsPair localPermissionsPair = Session.handlePermissionResponse(paramAnonymousResponse);
        if (localPermissionsPair != null);
        synchronized (Session.this.lock)
        {
          Session.access$302(Session.this, AccessToken.createFromTokenWithRefreshedPermissions(Session.this.tokenInfo, localPermissionsPair.getGrantedPermissions(), localPermissionsPair.getDeclinedPermissions()));
          Session.this.postStateChange(Session.this.state, SessionState.OPENED_TOKEN_UPDATED, null);
          return;
        }
      }
    });
    localRequest.executeAsync();
  }

  public final void removeCallback(Session.StatusCallback paramStatusCallback)
  {
    synchronized (this.callbacks)
    {
      this.callbacks.remove(paramStatusCallback);
      return;
    }
  }

  public final void requestNewPublishPermissions(Session.NewPermissionsRequest paramNewPermissionsRequest)
  {
    requestNewPermissions(paramNewPermissionsRequest, SessionAuthorizationType.PUBLISH);
  }

  public final void requestNewReadPermissions(Session.NewPermissionsRequest paramNewPermissionsRequest)
  {
    requestNewPermissions(paramNewPermissionsRequest, SessionAuthorizationType.READ);
  }

  void setCurrentTokenRefreshRequest(Session.TokenRefreshRequest paramTokenRefreshRequest)
  {
    this.currentTokenRefreshRequest = paramTokenRefreshRequest;
  }

  void setLastAttemptedTokenExtendDate(Date paramDate)
  {
    this.lastAttemptedTokenExtendDate = paramDate;
  }

  void setTokenInfo(AccessToken paramAccessToken)
  {
    this.tokenInfo = paramAccessToken;
  }

  boolean shouldExtendAccessToken()
  {
    if (this.currentTokenRefreshRequest != null);
    Date localDate;
    do
    {
      return false;
      localDate = new Date();
    }
    while ((!this.state.isOpened()) || (!this.tokenInfo.getSource().canExtendToken()) || (localDate.getTime() - this.lastAttemptedTokenExtendDate.getTime() <= 3600000L) || (localDate.getTime() - this.tokenInfo.getLastRefresh().getTime() <= 86400000L));
    return true;
  }

  public String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder().append("{Session").append(" state:").append(this.state).append(", token:");
    Object localObject;
    StringBuilder localStringBuilder2;
    if (this.tokenInfo == null)
    {
      localObject = "null";
      localStringBuilder2 = localStringBuilder1.append(localObject).append(", appId:");
      if (this.applicationId != null)
        break label92;
    }
    label92: for (String str = "null"; ; str = this.applicationId)
    {
      return str + "}";
      localObject = this.tokenInfo;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.Session
 * JD-Core Version:    0.6.2
 */