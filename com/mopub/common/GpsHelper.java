package com.mopub.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.mopub.common.factories.MethodBuilderFactory;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.AsyncTasks;
import com.mopub.common.util.Reflection;
import com.mopub.common.util.Reflection.MethodBuilder;

public class GpsHelper
{
  public static final String ADVERTISING_ID_KEY = "advertisingId";
  public static final int GOOGLE_PLAY_SUCCESS_CODE = 0;
  public static final String IS_LIMIT_AD_TRACKING_ENABLED_KEY = "isLimitAdTrackingEnabled";
  private static String sAdvertisingIdClientClassName = "com.google.android.gms.ads.identifier.AdvertisingIdClient";
  private static String sPlayServicesUtilClassName = "com.google.android.gms.common.GooglePlayServicesUtil";

  public static void asyncFetchAdvertisingInfo(Context paramContext)
  {
    asyncFetchAdvertisingInfo(paramContext, null);
  }

  public static void asyncFetchAdvertisingInfo(Context paramContext, GpsHelper.GpsHelperListener paramGpsHelperListener)
  {
    if (!Reflection.classFound(sAdvertisingIdClientClassName))
      if (paramGpsHelperListener != null)
        paramGpsHelperListener.onFetchAdInfoCompleted();
    do
    {
      return;
      try
      {
        AsyncTasks.safeExecuteOnExecutor(new GpsHelper.FetchAdvertisingInfoTask(paramContext, paramGpsHelperListener), new Void[0]);
        return;
      }
      catch (Exception localException)
      {
        MoPubLog.d("Error executing FetchAdvertisingInfoTask", localException);
      }
    }
    while (paramGpsHelperListener == null);
    paramGpsHelperListener.onFetchAdInfoCompleted();
  }

  public static void asyncFetchAdvertisingInfoIfNotCached(Context paramContext, GpsHelper.GpsHelperListener paramGpsHelperListener)
  {
    if ((isGpsAvailable(paramContext)) && (!isSharedPreferencesPopluated(paramContext)))
    {
      asyncFetchAdvertisingInfo(paramContext, paramGpsHelperListener);
      return;
    }
    paramGpsHelperListener.onFetchAdInfoCompleted();
  }

  static String getAdvertisingId(Context paramContext)
  {
    boolean bool = isGpsAvailable(paramContext);
    String str = null;
    if (bool)
      str = SharedPreferencesHelper.getSharedPreferences(paramContext).getString("advertisingId", null);
    return str;
  }

  static boolean isGpsAvailable(Context paramContext)
  {
    try
    {
      Object localObject = MethodBuilderFactory.create(null, "isGooglePlayServicesAvailable").setStatic(Class.forName(sPlayServicesUtilClassName)).addParam(Context.class, paramContext).execute();
      if (localObject != null)
      {
        int i = ((Integer)localObject).intValue();
        if (i == 0)
          return true;
      }
      return false;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  public static boolean isLimitAdTrackingEnabled(Context paramContext)
  {
    boolean bool1 = isGpsAvailable(paramContext);
    boolean bool2 = false;
    if (bool1)
      bool2 = SharedPreferencesHelper.getSharedPreferences(paramContext).getBoolean("isLimitAdTrackingEnabled", false);
    return bool2;
  }

  static boolean isSharedPreferencesPopluated(Context paramContext)
  {
    SharedPreferences localSharedPreferences = SharedPreferencesHelper.getSharedPreferences(paramContext);
    return (localSharedPreferences.contains("advertisingId")) && (localSharedPreferences.contains("isLimitAdTrackingEnabled"));
  }

  static String reflectedGetAdvertisingId(Object paramObject, String paramString)
  {
    try
    {
      String str = (String)MethodBuilderFactory.create(paramObject, "getId").execute();
      return str;
    }
    catch (Exception localException)
    {
    }
    return paramString;
  }

  static boolean reflectedIsLimitAdTrackingEnabled(Object paramObject, boolean paramBoolean)
  {
    try
    {
      Boolean localBoolean = (Boolean)MethodBuilderFactory.create(paramObject, "isLimitAdTrackingEnabled").execute();
      if (localBoolean != null)
      {
        boolean bool = localBoolean.booleanValue();
        paramBoolean = bool;
      }
      return paramBoolean;
    }
    catch (Exception localException)
    {
    }
    return paramBoolean;
  }

  @Deprecated
  public static void setClassNamesForTesting()
  {
    sPlayServicesUtilClassName = "java.lang.Class";
    sAdvertisingIdClientClassName = "java.lang.Class";
  }

  static void updateSharedPreferences(Context paramContext, Object paramObject)
  {
    String str = reflectedGetAdvertisingId(paramObject, null);
    boolean bool = reflectedIsLimitAdTrackingEnabled(paramObject, false);
    SharedPreferencesHelper.getSharedPreferences(paramContext).edit().putString("advertisingId", str).putBoolean("isLimitAdTrackingEnabled", bool).commit();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.GpsHelper
 * JD-Core Version:    0.6.2
 */