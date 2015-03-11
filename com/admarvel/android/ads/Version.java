package com.admarvel.android.ads;

import android.os.Build.VERSION;
import com.admarvel.android.util.m;

public class Version
{
  public static final String ADMARVEL_API_VERSION = "1.5";
  public static final String SDK_VERSION = "2.4.7";
  public static final String SDK_VERSION_DATE = "2014-12-18";

  public static int getAndroidSDKVersion()
  {
    if (Build.VERSION.RELEASE.contains("1.5"))
      return 3;
    return m.a();
  }

  static final String getSDKSupported()
  {
    Object localObject = "";
    try
    {
      if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter") != null) && (h.a("com.google.android.gms.ads.AdView")) && (getAndroidSDKVersion() > 8))
      {
        String str9 = (String)localObject + "_googleplay_admob";
        localObject = str9;
      }
      try
      {
        label51: if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter") != null) && (h.a("com.rhythmnewmedia.sdk.display.RhythmDisplayAdView")) && (getAndroidSDKVersion() > 9))
        {
          String str8 = (String)localObject + "_rhythm";
          localObject = str8;
        }
        try
        {
          label99: if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter") != null) && (h.a("com.millennialmedia.android.MMAdView")) && (getAndroidSDKVersion() > 8))
          {
            String str7 = (String)localObject + "_millennial";
            localObject = str7;
          }
          try
          {
            label147: if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter") != null) && (h.a("com.amazon.device.ads.AdLayout")))
            {
              String str6 = (String)localObject + "_amazon";
              localObject = str6;
            }
            try
            {
              label187: if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter") != null) && (h.a("com.jirbo.adcolony.AdColony")) && (getAndroidSDKVersion() > 8))
              {
                String str5 = (String)localObject + "_adcolony";
                localObject = str5;
              }
              try
              {
                label235: if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter") != null) && (h.a("com.amobee.pulse3d.Pulse3DView")) && (getAndroidSDKVersion() > 15))
                {
                  String str4 = (String)localObject + "_pulse3d";
                  localObject = str4;
                }
                try
                {
                  label283: if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter") != null) && (h.a("com.facebook.ads.AdView")) && (getAndroidSDKVersion() > 8))
                  {
                    String str3 = (String)localObject + "_facebook";
                    localObject = str3;
                  }
                  try
                  {
                    label331: if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter") != null) && (h.a("com.inmobi.monetization.IMBanner")) && (getAndroidSDKVersion() > 7))
                    {
                      String str2 = (String)localObject + "_inmobi";
                      localObject = str2;
                    }
                    try
                    {
                      label379: if ((AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter") != null) && (Class.forName("com.heyzap.sdk.ads.VideoAd") != null) && (getAndroidSDKVersion() > 7))
                      {
                        String str1 = (String)localObject + "_heyzap";
                        localObject = str1;
                      }
                      return localObject;
                    }
                    catch (Exception localException9)
                    {
                      return localObject;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label379;
                  }
                }
                catch (Exception localException7)
                {
                  break label331;
                }
              }
              catch (Exception localException6)
              {
                break label283;
              }
            }
            catch (Exception localException5)
            {
              break label235;
            }
          }
          catch (Exception localException4)
          {
            break label187;
          }
        }
        catch (Exception localException3)
        {
          break label147;
        }
      }
      catch (Exception localException2)
      {
        break label99;
      }
    }
    catch (Exception localException1)
    {
      break label51;
    }
  }

  static final String getVersionDump()
  {
    Object localObject = "";
    try
    {
      AdMarvelAdapter localAdMarvelAdapter9 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter");
      if ((localAdMarvelAdapter9 != null) && (h.a("com.google.android.gms.ads.AdView")) && (getAndroidSDKVersion() > 8))
      {
        String str9 = (String)localObject + "googleplay: found, " + localAdMarvelAdapter9.getAdnetworkSDKVersionInfo() + "\n";
        localObject = str9;
      }
    }
    catch (Exception localException8)
    {
      try
      {
        AdMarvelAdapter localAdMarvelAdapter8 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter");
        if ((localAdMarvelAdapter8 != null) && (h.a("com.rhythmnewmedia.sdk.display.RhythmDisplayAdView")) && (getAndroidSDKVersion() > 9))
        {
          String str8 = (String)localObject + "rhythm: found, " + localAdMarvelAdapter8.getAdnetworkSDKVersionInfo() + "\n";
          localObject = str8;
        }
      }
      catch (Exception localException8)
      {
        try
        {
          AdMarvelAdapter localAdMarvelAdapter7 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter");
          if ((localAdMarvelAdapter7 != null) && (h.a("com.millennialmedia.android.MMAdView")) && (getAndroidSDKVersion() > 9))
          {
            String str7 = (String)localObject + "millennial: found, " + localAdMarvelAdapter7.getAdnetworkSDKVersionInfo() + "\n";
            localObject = str7;
          }
        }
        catch (Exception localException8)
        {
          try
          {
            AdMarvelAdapter localAdMarvelAdapter6 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter");
            if ((localAdMarvelAdapter6 != null) && (h.a("com.amazon.device.ads.AdLayout")))
            {
              String str6 = (String)localObject + "amazon: found, " + localAdMarvelAdapter6.getAdnetworkSDKVersionInfo() + "\n";
              localObject = str6;
            }
          }
          catch (Exception localException8)
          {
            try
            {
              AdMarvelAdapter localAdMarvelAdapter5 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter");
              if ((localAdMarvelAdapter5 != null) && (h.a("com.jirbo.adcolony.AdColony")) && (getAndroidSDKVersion() > 9))
              {
                String str5 = (String)localObject + "adcolony: found, " + localAdMarvelAdapter5.getAdnetworkSDKVersionInfo() + "\n";
                localObject = str5;
              }
            }
            catch (Exception localException8)
            {
              try
              {
                AdMarvelAdapter localAdMarvelAdapter4 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter");
                if ((localAdMarvelAdapter4 != null) && (h.a("com.amobee.pulse3d.Pulse3DView")) && (getAndroidSDKVersion() > 15))
                {
                  String str4 = (String)localObject + "pulse3d: found, " + localAdMarvelAdapter4.getAdnetworkSDKVersionInfo() + "\n";
                  localObject = str4;
                }
              }
              catch (Exception localException8)
              {
                try
                {
                  AdMarvelAdapter localAdMarvelAdapter3 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter");
                  if ((localAdMarvelAdapter3 != null) && (h.a("com.facebook.ads.AdView")) && (getAndroidSDKVersion() > 8))
                  {
                    String str3 = (String)localObject + "facebook: found, " + localAdMarvelAdapter3.getAdnetworkSDKVersionInfo() + "\n";
                    localObject = str3;
                  }
                }
                catch (Exception localException8)
                {
                  try
                  {
                    AdMarvelAdapter localAdMarvelAdapter2 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter");
                    if ((localAdMarvelAdapter2 != null) && (h.a("com.inmobi.monetization.IMBanner")) && (getAndroidSDKVersion() > 7))
                    {
                      String str2 = (String)localObject + "inmobi: found, " + localAdMarvelAdapter2.getAdnetworkSDKVersionInfo() + "\n";
                      localObject = str2;
                    }
                  }
                  catch (Exception localException8)
                  {
                    try
                    {
                      while (true)
                      {
                        AdMarvelAdapter localAdMarvelAdapter1 = AdMarvelAdapterInstances.getAdapterInstance("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter");
                        if ((localAdMarvelAdapter1 != null) && (Class.forName("com.heyzap.sdk.ads.VideoAd") != null) && (getAndroidSDKVersion() > 7))
                        {
                          String str1 = (String)localObject + "heyzap: found, " + localAdMarvelAdapter1.getAdnetworkSDKVersionInfo() + "\n";
                          localObject = str1;
                        }
                        return localObject;
                        localException1 = localException1;
                        localObject = (String)localObject + "googleplay: NOT found, admarvel-android-sdk-googleplay-adapter.jar NOT in classpath\n";
                        continue;
                        localException2 = localException2;
                        localObject = (String)localObject + "rhythm: NOT found, admarvel-android-sdk-rhythm-adapter.jar NOT in classpath\n";
                        continue;
                        localException3 = localException3;
                        localObject = (String)localObject + "millennial: NOT found, admarvel-android-sdk-millennial-adapter.jar NOT in classpath\n";
                        continue;
                        localException4 = localException4;
                        localObject = (String)localObject + "amazon: NOT found, admarvel-android-sdk-amazon-adapter.jar NOT in classpath\n";
                        continue;
                        localException5 = localException5;
                        localObject = (String)localObject + "adcolony: NOT found, admarvel-android-sdk-adcolony-adapter.jar NOT in classpath\n";
                        continue;
                        localException6 = localException6;
                        localObject = (String)localObject + "pulse3d: NOT found, admarvel-android-sdk-pulse3d-adapter.jar NOT in classpath\n";
                        continue;
                        localException7 = localException7;
                        localObject = (String)localObject + "facebook: NOT found, admarvel-android-sdk-facebook-adapter.jar NOT in classpath\n";
                        continue;
                        localException8 = localException8;
                        localObject = (String)localObject + "inmobi: NOT found, admarvel-android-sdk-inmobi-adapter.jar NOT in classpath\n";
                      }
                    }
                    catch (Exception localException9)
                    {
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    return (String)localObject + "heyzap: NOT found, admarvel-android-sdk-heyzap-adapter.jar NOT in classpath\n";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.Version
 * JD-Core Version:    0.6.2
 */