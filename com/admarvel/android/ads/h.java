package com.admarvel.android.ads;

import java.util.HashMap;
import java.util.Map;

class h
{
  private static final Map<String, Boolean> a = a();

  static Map<String, Boolean> a()
  {
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("com.google.android.gms.ads.AdView", Boolean.valueOf(b("com.google.android.gms.ads.AdView")));
      try
      {
        label25: localHashMap.put("com.rhythmnewmedia.sdk.display.RhythmDisplayAdView", Boolean.valueOf(b("com.rhythmnewmedia.sdk.display.RhythmDisplayAdView")));
        try
        {
          label42: localHashMap.put("com.millennialmedia.android.MMAdView", Boolean.valueOf(b("com.millennialmedia.android.MMAdView")));
          try
          {
            label59: localHashMap.put("com.amazon.device.ads.AdLayout", Boolean.valueOf(b("com.amazon.device.ads.AdLayout")));
            try
            {
              label76: localHashMap.put("com.jirbo.adcolony.AdColony", Boolean.valueOf(b("com.jirbo.adcolony.AdColony")));
              try
              {
                label93: localHashMap.put("com.amobee.pulse3d.Pulse3DView", Boolean.valueOf(b("com.amobee.pulse3d.Pulse3DView")));
                try
                {
                  label110: localHashMap.put("com.facebook.ads.AdView", Boolean.valueOf(b("com.facebook.ads.AdView")));
                  try
                  {
                    label127: localHashMap.put("com.inmobi.monetization.IMBanner", Boolean.valueOf(b("com.inmobi.monetization.IMBanner")));
                    try
                    {
                      label144: localHashMap.put("com.heyzap.sdk.ads.VideoAd", Boolean.valueOf(b("com.heyzap.sdk.ads.VideoAd")));
                      return localHashMap;
                    }
                    catch (Exception localException9)
                    {
                      return localHashMap;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label144;
                  }
                }
                catch (Exception localException7)
                {
                  break label127;
                }
              }
              catch (Exception localException6)
              {
                break label110;
              }
            }
            catch (Exception localException5)
            {
              break label93;
            }
          }
          catch (Exception localException4)
          {
            break label76;
          }
        }
        catch (Exception localException3)
        {
          break label59;
        }
      }
      catch (Exception localException2)
      {
        break label42;
      }
    }
    catch (Exception localException1)
    {
      break label25;
    }
  }

  static boolean a(String paramString)
  {
    return ((Boolean)a.get(paramString)).booleanValue();
  }

  public static boolean b(String paramString)
  {
    try
    {
      Class.forName(paramString);
      return true;
    }
    catch (Exception localException)
    {
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.h
 * JD-Core Version:    0.6.2
 */