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
import com.admarvel.android.util.c;
import com.admarvel.android.util.e;
import com.admarvel.android.util.f;
import com.admarvel.android.util.k;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ExecutorService;

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
    r.a(paramStringBuilder, paramString1, paramString2);
  }

  public static String captureTargetingParams(Map<String, Object> paramMap, String paramString)
  {
    return r.a(paramMap, paramString);
  }

  public static boolean detectDeviceForWebViewCrash()
  {
    return r.c();
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
    return r.d(paramString);
  }

  public static void forceCloseFullScreenAd(Activity paramActivity, AdMarvelActivity paramAdMarvelActivity, AdMarvelVideoActivity paramAdMarvelVideoActivity)
  {
    if (paramAdMarvelActivity != null)
      paramAdMarvelActivity.finish();
    if (paramAdMarvelVideoActivity != null)
      paramAdMarvelVideoActivity.finish();
    try
    {
      AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").forceCloseFullScreenAd(paramActivity);
      Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: forceCloseFullScreenAd");
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static AdMarvelUtils.AdMArvelErrorReason getAdMArvelErrorReason(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 201:
      return AdMarvelUtils.AdMArvelErrorReason.SITE_ID_OR_PARTNER_ID_NOT_PRESENT;
    case 202:
      return AdMarvelUtils.AdMArvelErrorReason.SITE_ID_AND_PARTNER_ID_DO_NOT_MATCH;
    case 203:
      return AdMarvelUtils.AdMArvelErrorReason.BOT_USER_AGENT_FOUND;
    case 204:
      return AdMarvelUtils.AdMArvelErrorReason.NO_BANNER_FOUND;
    case 205:
      return AdMarvelUtils.AdMArvelErrorReason.NO_AD_FOUND;
    case 206:
      return AdMarvelUtils.AdMArvelErrorReason.NO_USER_AGENT_FOUND;
    case 207:
      return AdMarvelUtils.AdMArvelErrorReason.SITE_ID_NOT_PRESENT;
    case 208:
      return AdMarvelUtils.AdMArvelErrorReason.PARTNER_ID_NOT_PRESENT;
    case 301:
      return AdMarvelUtils.AdMArvelErrorReason.NO_NETWORK_CONNECTIVITY;
    case 302:
      return AdMarvelUtils.AdMArvelErrorReason.NETWORK_CONNECTIVITY_DISRUPTED;
    case 303:
      return AdMarvelUtils.AdMArvelErrorReason.AD_REQUEST_XML_PARSING_EXCEPTION;
    case 304:
      return AdMarvelUtils.AdMArvelErrorReason.AD_REQUEST_IN_PROCESS_EXCEPTION;
    case 305:
      return AdMarvelUtils.AdMArvelErrorReason.AD_UNIT_NOT_ABLE_TO_RENDER;
    case 306:
      return AdMarvelUtils.AdMArvelErrorReason.AD_REQUEST_MISSING_XML_ELEMENTS;
    case 307:
      return AdMarvelUtils.AdMArvelErrorReason.AD_REQUEST_SDK_TYPE_UNSUPPORTED;
    case 308:
    }
    return AdMarvelUtils.AdMArvelErrorReason.AD_UNIT_NOT_ABLE_TO_LOAD;
  }

  public static Map<String, String> getAdMarvelOptionalFlags()
  {
    return adMarvelOptionalFlags;
  }

  public static Integer getAdmarvelActivityOrientationInfo(Context paramContext)
  {
    if (AdmarvelActivityOrientationInfo != null);
    switch (2.a[AdmarvelActivityOrientationInfo.ordinal()])
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
    return r.e(paramContext);
  }

  public static int getAndroidSDKVersion()
  {
    return Version.getAndroidSDKVersion();
  }

  public static String getDeviceConnectivitiy(Context paramContext)
  {
    return r.a(paramContext);
  }

  public static float getDeviceDensity(Context paramContext)
  {
    return r.i(paramContext);
  }

  public static int getDeviceHeight(Context paramContext)
  {
    return r.h(paramContext);
  }

  public static int getDeviceWidth(Context paramContext)
  {
    return r.g(paramContext);
  }

  public static int getErrorCode(AdMarvelUtils.ErrorReason paramErrorReason)
  {
    return r.a(paramErrorReason);
  }

  public static AdMarvelUtils.ErrorReason getErrorReason(int paramInt)
  {
    return r.a(paramInt);
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
    return "2.4.7";
  }

  public static String getSDKVersionDate()
  {
    return "2014-12-18";
  }

  public static int getScreenOrientation(Context paramContext)
  {
    return r.d(paramContext);
  }

  public static String getSupportedInterfaceOrientations(Activity paramActivity)
  {
    return r.a(paramActivity);
  }

  public static String getUserAgent(Context paramContext, Handler paramHandler)
  {
    return new r(paramContext).a();
  }

  public static void initialize(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap)
  {
    Logging.log("AdMarvelUtils - initialize");
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).start();
      label16: if ((Version.getAndroidSDKVersion() >= 11) && (AdMarvelView.a()))
        AdMarvelUtils.a.a(paramActivity);
      try
      {
        AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").initialize(paramActivity, paramMap);
        Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: initialize");
        try
        {
          label52: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").initialize(paramActivity, paramMap);
          Logging.log("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter: initialize");
          try
          {
            label71: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").initialize(paramActivity, paramMap);
            Logging.log("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter: initialize");
            label90: f.a().b().execute(new Runnable()
            {
              public final void run()
              {
                r.l(AdMarvelUtils.this);
                if (Version.getAndroidSDKVersion() > 8)
                  k.c(AdMarvelUtils.this);
                r.o(AdMarvelUtils.this);
              }
            });
            r.n(paramActivity);
            if (!isLogDumpEnabled())
              r.m(paramActivity);
            return;
          }
          catch (Exception localException4)
          {
            break label90;
          }
        }
        catch (Exception localException3)
        {
          break label71;
        }
      }
      catch (Exception localException2)
      {
        break label52;
      }
    }
    catch (Exception localException1)
    {
      break label16;
    }
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
    return r.f(paramContext);
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
    Logging.log("AdMarvelUtils - lockAdMarvelActivityOrientation");
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
      Constants.WAIT_FOR_INTERSTITIAL = paramInt * 1000;
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

  public static void uninitialize(Activity paramActivity)
  {
    Logging.log("AdMarvelUtils - uninitialize");
    e locale = e.a();
    if ((locale != null) && (locale.b()))
      locale.c();
    c localc = c.a();
    if (localc != null)
      localc.a(paramActivity);
    k.a();
    r.n(paramActivity);
    if (!isLogDumpEnabled())
      r.m(paramActivity);
    if (AdMarvelInterstitialAds.e.b != AdMarvelInterstitialAds.getInterstitialAdsState());
    try
    {
      AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").uninitialize(paramActivity, null);
      Logging.log("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter: uninitialize");
      try
      {
        label83: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").uninitialize(paramActivity, null);
        Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: uninitialize");
        try
        {
          label102: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").uninitialize(paramActivity, null);
          Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: uninitialize");
          try
          {
            label120: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").uninitialize(paramActivity, null);
            Logging.log("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter: uninitialize");
            try
            {
              label139: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").uninitialize(paramActivity, null);
              Logging.log("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter: uninitialize");
              try
              {
                label158: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").uninitialize(paramActivity, null);
                Logging.log("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter: uninitialize");
                try
                {
                  label177: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").uninitialize(paramActivity, null);
                  Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: uninitialize");
                  try
                  {
                    label196: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").uninitialize(paramActivity, null);
                    Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: uninitialize");
                    return;
                  }
                  catch (Exception localException8)
                  {
                  }
                }
                catch (Exception localException7)
                {
                  break label196;
                }
              }
              catch (Exception localException6)
              {
                break label177;
              }
            }
            catch (Exception localException5)
            {
              break label158;
            }
          }
          catch (Exception localException4)
          {
            break label139;
          }
        }
        catch (Exception localException3)
        {
          break label120;
        }
      }
      catch (Exception localException2)
      {
        break label102;
      }
    }
    catch (Exception localException1)
    {
      break label83;
    }
  }

  public void firePixel(AdMarvelAd paramAdMarvelAd)
  {
    new r((Context)this.contextReference.get()).a(paramAdMarvelAd);
  }

  public void firePixel(String paramString)
  {
    new r((Context)this.contextReference.get()).b(paramString);
  }

  public void firePixelUsingHTTP(String paramString)
  {
    new r((Context)this.contextReference.get()).a(paramString);
  }

  public void firePixelUsingHTTP(String paramString, Handler paramHandler)
  {
    new r((Context)this.contextReference.get()).a(paramString, paramHandler);
  }

  public String getUserAgent()
  {
    return new r((Context)this.contextReference.get()).a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelUtils
 * JD-Core Version:    0.6.2
 */