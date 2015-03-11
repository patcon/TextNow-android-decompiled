package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.a;
import java.lang.ref.WeakReference;
import java.util.Map;

public class AdMarvelUtils
{
  protected static final String ADMARVEL_ADAPTER_GUID = "ADMARVELGUID";
  static final int AD_HISTORY_AD_DUMP_DELAY = 1000;
  static final int AD_HISTORY_REDIRECTED_PAGE_DUMP_DELAY = 3000;
  private static AdMarvelUtils.AdmarvelOrientationInfo AdmarvelActivityOrientationInfo = null;
  public static final String PATH = "/data/com.admarvel.android.admarvelcachedads";
  private static Map<String, String> adMarvelOptionalFlags;
  private static boolean enableLogging = false;
  private static boolean isLogDumpEnabled = false;
  private static boolean notificationBarInFullScreenLaunchEnabled = false;
  private WeakReference<Context> contextReference;

  public AdMarvelUtils(Context paramContext)
  {
    this.contextReference = new WeakReference(paramContext);
  }

  public static void appendParams(StringBuilder paramStringBuilder, String paramString1, String paramString2)
  {
    ab.a(paramStringBuilder, paramString1, paramString2);
  }

  public static String captureTargetingParams(Map<String, Object> paramMap, String paramString)
  {
    return ab.a(paramMap, paramString);
  }

  public static void disableLogDump()
  {
    isLogDumpEnabled = false;
  }

  public static void enableLogDump()
  {
    isLogDumpEnabled = true;
  }

  public static void enableLogging(boolean paramBoolean)
  {
    enableLogging = paramBoolean;
  }

  public static void enableNotificationBarInFullScreenLaunch(boolean paramBoolean)
  {
    notificationBarInFullScreenLaunchEnabled = paramBoolean;
  }

  public static String encodeString(String paramString)
  {
    return ab.c(paramString);
  }

  public static Map<String, String> getAdMarvelOptionalFlags()
  {
    return adMarvelOptionalFlags;
  }

  public static Integer getAdmarvelActivityOrientationInfo(Context paramContext)
  {
    if (AdmarvelActivityOrientationInfo != null);
    switch (1.a[AdmarvelActivityOrientationInfo.ordinal()])
    {
    default:
      return null;
    case 1:
      return Integer.valueOf(1);
    case 2:
      return Integer.valueOf(0);
    case 3:
      return Integer.valueOf(8);
    case 4:
      return Integer.valueOf(9);
    case 5:
    }
    return ab.e(paramContext);
  }

  public static int getAndroidSDKVersion()
  {
    return ac.a();
  }

  public static String getDeviceConnectivitiy(Context paramContext)
  {
    return ab.a(paramContext);
  }

  public static int getDeviceHeight(Context paramContext)
  {
    return ab.h(paramContext);
  }

  public static int getDeviceWidth(Context paramContext)
  {
    return ab.g(paramContext);
  }

  public static int getErrorCode(AdMarvelUtils.ErrorReason paramErrorReason)
  {
    return ab.a(paramErrorReason);
  }

  public static AdMarvelUtils.ErrorReason getErrorReason(int paramInt)
  {
    return ab.a(paramInt);
  }

  public static boolean getPreferenceValueBoolean(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      boolean bool = paramContext.getSharedPreferences(paramString1, 0).getBoolean(paramString2, false);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static int getPreferenceValueInt(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      int i = paramContext.getSharedPreferences(paramString1, 0).getInt(paramString2, -2147483648);
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static long getPreferenceValueLong(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      long l = paramContext.getSharedPreferences(paramString1, 0).getLong(paramString2, -2147483648L);
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String getPreferenceValueString(Context paramContext, String paramString1, String paramString2)
  {
    try
    {
      String str = paramContext.getSharedPreferences(paramString1, 0).getString(paramString2, "VALUE_NOT_DEFINED");
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static String getSDKVersion()
  {
    return "2.4.5";
  }

  public static String getSDKVersionDate()
  {
    return "2014-07-09";
  }

  public static String getSupportedInterfaceOrientations(Activity paramActivity)
  {
    return ab.a(paramActivity);
  }

  public static String getUserAgent(Context paramContext, Handler paramHandler)
  {
    return new ab(paramContext, paramHandler).a();
  }

  public static boolean isLogDumpEnabled()
  {
    return isLogDumpEnabled;
  }

  public static boolean isLoggingEnabled()
  {
    return enableLogging;
  }

  public static final boolean isNetworkAvailable(Context paramContext)
  {
    return ab.f(paramContext);
  }

  public static boolean isNotificationBarInFullScreenLaunchEnabled()
  {
    return notificationBarInFullScreenLaunchEnabled;
  }

  public static boolean isTabletDevice(Context paramContext)
  {
    DisplayMetrics localDisplayMetrics = paramContext.getResources().getDisplayMetrics();
    if (localDisplayMetrics.widthPixels < 600);
    Double localDouble;
    do
    {
      return false;
      float f1 = localDisplayMetrics.widthPixels / localDisplayMetrics.xdpi;
      float f2 = localDisplayMetrics.heightPixels / localDisplayMetrics.ydpi;
      localDouble = Double.valueOf(Math.sqrt(f1 * f1 + f2 * f2));
      Logging.log("Device Screen Size : " + localDouble);
    }
    while (localDouble.doubleValue() <= 6.5D);
    return true;
  }

  public static void lockAdMarvelActivityOrientation(AdMarvelUtils.AdmarvelOrientationInfo paramAdmarvelOrientationInfo)
  {
    AdmarvelActivityOrientationInfo = paramAdmarvelOrientationInfo;
  }

  public static String reportAdMarvelAdHistory(int paramInt, Context paramContext)
  {
    String str = "";
    if ((isNetworkAvailable(paramContext)) && (isLogDumpEnabled))
      str = a.b(paramContext).a(paramInt);
    return str;
  }

  public static String reportAdMarvelAdHistory(Context paramContext)
  {
    String str = "";
    if ((isNetworkAvailable(paramContext)) && (isLogDumpEnabled))
      str = a.b(paramContext).a(20);
    return str;
  }

  public static void setAdMarvelOptionalFlags(Map<String, String> paramMap)
  {
    adMarvelOptionalFlags = paramMap;
  }

  public static AdMarvelAd setAdStatus(AdMarvelAd paramAdMarvelAd, String paramString)
  {
    try
    {
      paramAdMarvelAd.setAdType(AdMarvelAd.AdType.ERROR);
      paramAdMarvelAd.setErrorCode(306);
      paramAdMarvelAd.setErrorReason(paramString);
      return paramAdMarvelAd;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void setFullScreenloadingTimeout(int paramInt)
  {
    if (paramInt > 0)
    {
      u.a = paramInt * 1000;
      return;
    }
    Logging.log("setFullScreenloadingTimeout :- time cannot be less than zero");
  }

  public static void setPreferenceValueBoolean(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    try
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramString1, 0).edit();
      localEditor.putBoolean(paramString2, paramBoolean);
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void setPreferenceValueInt(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    try
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramString1, 0).edit();
      localEditor.putInt(paramString2, paramInt);
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void setPreferenceValueLong(Context paramContext, String paramString1, String paramString2, long paramLong)
  {
    try
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramString1, 0).edit();
      localEditor.putLong(paramString2, paramLong);
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void setPreferenceValueString(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    try
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(paramString1, 0).edit();
      localEditor.putString(paramString2, paramString3);
      localEditor.commit();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void firePixel(AdMarvelAd paramAdMarvelAd)
  {
    new ab((Context)this.contextReference.get()).a(paramAdMarvelAd);
  }

  public void firePixel(String paramString)
  {
    new ab((Context)this.contextReference.get()).a(paramString);
  }

  public void firePixelUsingHTTP(String paramString, Handler paramHandler)
  {
    new ab((Context)this.contextReference.get()).a(paramString, paramHandler);
  }

  public String getUserAgent()
  {
    return new ab((Context)this.contextReference.get()).a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelUtils
 * JD-Core Version:    0.6.2
 */