package com.admarvel.android.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class b
{
  private static final Map<String, AdMarvelAdapter> a = b();
  private static Map<String, Map<String, AdMarvelAdapter>> b;

  static
  {
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    b = localConcurrentHashMap;
    localConcurrentHashMap.put("ADMARVELGUID", a);
  }

  protected static AdMarvelAdapter a(String paramString1, String paramString2)
  {
    Map localMap = (Map)b.get(paramString1);
    if (localMap != null)
      return (AdMarvelAdapter)localMap.get(paramString2);
    return null;
  }

  public static Map<String, Map<String, AdMarvelAdapter>> a()
  {
    return b;
  }

  protected static void a(String paramString)
  {
    try
    {
      b.put(paramString, b());
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static Map<String, AdMarvelAdapter> b()
  {
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter"));
      try
      {
        label22: localHashMap.put("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter"));
        try
        {
          label36: localHashMap.put("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter"));
          try
          {
            label50: localHashMap.put("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter"));
            try
            {
              label64: localHashMap.put("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter"));
              try
              {
                label78: localHashMap.put("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter"));
                try
                {
                  label92: localHashMap.put("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter"));
                  try
                  {
                    label106: localHashMap.put("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter"));
                    try
                    {
                      label120: localHashMap.put("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter"));
                      try
                      {
                        label134: localHashMap.put("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter"));
                        return localHashMap;
                      }
                      catch (Exception localException10)
                      {
                        return localHashMap;
                      }
                    }
                    catch (Exception localException9)
                    {
                      break label134;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label120;
                  }
                }
                catch (Exception localException7)
                {
                  break label106;
                }
              }
              catch (Exception localException6)
              {
                break label92;
              }
            }
            catch (Exception localException5)
            {
              break label78;
            }
          }
          catch (Exception localException4)
          {
            break label64;
          }
        }
        catch (Exception localException3)
        {
          break label50;
        }
      }
      catch (Exception localException2)
      {
        break label36;
      }
    }
    catch (Exception localException1)
    {
      break label22;
    }
  }

  protected static void b(String paramString)
  {
    try
    {
      b.remove(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static AdMarvelAdapter c(String paramString)
  {
    return (AdMarvelAdapter)a.get(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.b
 * JD-Core Version:    0.6.2
 */