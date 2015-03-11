package com.admarvel.android.ads;

import android.os.Build.VERSION;

class ac
{
  public static int a()
  {
    if (Build.VERSION.RELEASE.contains("1.5"))
      return 3;
    return z.a();
  }

  static final String b()
  {
    Object localObject = "";
    try
    {
      AdMarvelAdapter localAdMarvelAdapter10 = b.c("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter");
      if ((localAdMarvelAdapter10 != null) && (m.a("com.google.android.gms.ads.AdView")) && (a() > 8))
      {
        String str10 = (String)localObject + "googleplay: found, " + localAdMarvelAdapter10.getAdnetworkSDKVersionInfo() + "\n";
        localObject = str10;
      }
    }
    catch (Exception localException9)
    {
      try
      {
        AdMarvelAdapter localAdMarvelAdapter9 = b.c("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter");
        if ((localAdMarvelAdapter9 != null) && (m.a("com.rhythmnewmedia.sdk.display.RhythmDisplayAdView")))
        {
          String str9 = (String)localObject + "rhythm: found, " + localAdMarvelAdapter9.getAdnetworkSDKVersionInfo() + "\n";
          localObject = str9;
        }
      }
      catch (Exception localException9)
      {
        try
        {
          AdMarvelAdapter localAdMarvelAdapter8 = b.c("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter");
          if ((localAdMarvelAdapter8 != null) && (m.a("com.greystripe.sdk.GSMobileBannerAdView")))
          {
            String str8 = (String)localObject + "greystripe: found, " + localAdMarvelAdapter8.getAdnetworkSDKVersionInfo() + "\n";
            localObject = str8;
          }
        }
        catch (Exception localException9)
        {
          try
          {
            AdMarvelAdapter localAdMarvelAdapter7 = b.c("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter");
            if ((localAdMarvelAdapter7 != null) && (m.a("com.millennialmedia.android.MMAdView")))
            {
              String str7 = (String)localObject + "millennial: found, " + localAdMarvelAdapter7.getAdnetworkSDKVersionInfo() + "\n";
              localObject = str7;
            }
          }
          catch (Exception localException9)
          {
            try
            {
              AdMarvelAdapter localAdMarvelAdapter6 = b.c("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter");
              if ((localAdMarvelAdapter6 != null) && (m.a("com.amazon.device.ads.AdLayout")))
              {
                String str6 = (String)localObject + "amazon: found, " + localAdMarvelAdapter6.getAdnetworkSDKVersionInfo() + "\n";
                localObject = str6;
              }
            }
            catch (Exception localException9)
            {
              try
              {
                AdMarvelAdapter localAdMarvelAdapter5 = b.c("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter");
                if ((localAdMarvelAdapter5 != null) && (m.a("com.jirbo.adcolony.AdColony")))
                {
                  String str5 = (String)localObject + "adcolony: found, " + localAdMarvelAdapter5.getAdnetworkSDKVersionInfo() + "\n";
                  localObject = str5;
                }
              }
              catch (Exception localException9)
              {
                try
                {
                  AdMarvelAdapter localAdMarvelAdapter4 = b.c("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter");
                  if ((localAdMarvelAdapter4 != null) && (m.a("com.amobee.pulse3d.Pulse3DView")))
                  {
                    String str4 = (String)localObject + "pulse3d: found, " + localAdMarvelAdapter4.getAdnetworkSDKVersionInfo() + "\n";
                    localObject = str4;
                  }
                }
                catch (Exception localException9)
                {
                  try
                  {
                    AdMarvelAdapter localAdMarvelAdapter3 = b.c("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter");
                    if ((localAdMarvelAdapter3 != null) && (m.a("com.facebook.ads.AdView")))
                    {
                      String str3 = (String)localObject + "facebook: found, " + localAdMarvelAdapter3.getAdnetworkSDKVersionInfo() + "\n";
                      localObject = str3;
                    }
                  }
                  catch (Exception localException9)
                  {
                    try
                    {
                      AdMarvelAdapter localAdMarvelAdapter2 = b.c("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter");
                      if ((localAdMarvelAdapter2 != null) && (m.a("com.inmobi.monetization.IMBanner")))
                      {
                        String str2 = (String)localObject + "inmobi: found, " + localAdMarvelAdapter2.getAdnetworkSDKVersionInfo() + "\n";
                        localObject = str2;
                      }
                    }
                    catch (Exception localException9)
                    {
                      try
                      {
                        while (true)
                        {
                          AdMarvelAdapter localAdMarvelAdapter1 = b.c("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter");
                          if ((localAdMarvelAdapter1 != null) && (Class.forName("com.heyzap.sdk.ads.VideoAd") != null))
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
                          localObject = (String)localObject + "greystripe: NOT found, admarvel-android-sdk-greystripe-adapter.jar NOT in classpath\n";
                          continue;
                          localException4 = localException4;
                          localObject = (String)localObject + "millennial: NOT found, admarvel-android-sdk-millennial-adapter.jar NOT in classpath\n";
                          continue;
                          localException5 = localException5;
                          localObject = (String)localObject + "amazon: NOT found, admarvel-android-sdk-amazon-adapter.jar NOT in classpath\n";
                          continue;
                          localException6 = localException6;
                          localObject = (String)localObject + "adcolony: NOT found, admarvel-android-sdk-adcolony-adapter.jar NOT in classpath\n";
                          continue;
                          localException7 = localException7;
                          localObject = (String)localObject + "pulse3d: NOT found, admarvel-android-sdk-pulse3d-adapter.jar NOT in classpath\n";
                          continue;
                          localException8 = localException8;
                          localObject = (String)localObject + "facebook: NOT found, admarvel-android-sdk-facebook-adapter.jar NOT in classpath\n";
                          continue;
                          localException9 = localException9;
                          localObject = (String)localObject + "inmobi: NOT found, admarvel-android-sdk-inmobi-adapter.jar NOT in classpath\n";
                        }
                      }
                      catch (Exception localException10)
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
    }
    return (String)localObject + "heyzap: NOT found, admarvel-android-sdk-heyzap-adapter.jar NOT in classpath\n";
  }

  static final String c()
  {
    Object localObject = "";
    try
    {
      if ((b.c("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter") != null) && (m.a("com.google.android.gms.ads.AdView")) && (a() > 8))
      {
        String str10 = (String)localObject + "_googleplay_admob";
        localObject = str10;
      }
      try
      {
        label51: if ((b.c("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter") != null) && (m.a("com.rhythmnewmedia.sdk.display.RhythmDisplayAdView")))
        {
          String str9 = (String)localObject + "_rhythm";
          localObject = str9;
        }
        try
        {
          label91: if ((b.c("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter") != null) && (m.a("com.greystripe.sdk.GSMobileBannerAdView")))
          {
            String str8 = (String)localObject + "_greystripe";
            localObject = str8;
          }
          try
          {
            label131: if ((b.c("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter") != null) && (m.a("com.millennialmedia.android.MMAdView")))
            {
              String str7 = (String)localObject + "_millennial";
              localObject = str7;
            }
            try
            {
              label171: if ((b.c("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter") != null) && (m.a("com.amazon.device.ads.AdLayout")))
              {
                String str6 = (String)localObject + "_amazon";
                localObject = str6;
              }
              try
              {
                label211: if ((b.c("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter") != null) && (m.a("com.jirbo.adcolony.AdColony")))
                {
                  String str5 = (String)localObject + "_adcolony";
                  localObject = str5;
                }
                try
                {
                  label251: if ((b.c("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter") != null) && (m.a("com.amobee.pulse3d.Pulse3DView")) && (a() > 15))
                  {
                    String str4 = (String)localObject + "_pulse3d";
                    localObject = str4;
                  }
                  try
                  {
                    label299: if ((b.c("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter") != null) && (m.a("com.facebook.ads.AdView")) && (a() > 7))
                    {
                      String str3 = (String)localObject + "_facebook";
                      localObject = str3;
                    }
                    try
                    {
                      label347: if ((b.c("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter") != null) && (m.a("com.inmobi.monetization.IMBanner")))
                      {
                        String str2 = (String)localObject + "_inmobi";
                        localObject = str2;
                      }
                      try
                      {
                        label387: if ((b.c("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter") != null) && (Class.forName("com.heyzap.sdk.ads.VideoAd") != null))
                        {
                          String str1 = (String)localObject + "_heyzap";
                          localObject = str1;
                        }
                        return localObject;
                      }
                      catch (Exception localException10)
                      {
                        return localObject;
                      }
                    }
                    catch (Exception localException9)
                    {
                      break label387;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label347;
                  }
                }
                catch (Exception localException7)
                {
                  break label299;
                }
              }
              catch (Exception localException6)
              {
                break label251;
              }
            }
            catch (Exception localException5)
            {
              break label211;
            }
          }
          catch (Exception localException4)
          {
            break label171;
          }
        }
        catch (Exception localException3)
        {
          break label131;
        }
      }
      catch (Exception localException2)
      {
        break label91;
      }
    }
    catch (Exception localException1)
    {
      break label51;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.ac
 * JD-Core Version:    0.6.2
 */