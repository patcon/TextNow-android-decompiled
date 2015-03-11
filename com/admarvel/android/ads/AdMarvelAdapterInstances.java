package com.admarvel.android.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AdMarvelAdapterInstances
{
  private static Map<String, Map<String, AdMarvelAdapter>> adMarvelAdapterInstances;

  static
  {
    ConcurrentHashMap localConcurrentHashMap = new ConcurrentHashMap();
    adMarvelAdapterInstances = localConcurrentHashMap;
    localConcurrentHashMap.put("ADMARVELGUID", createInstances());
  }

  public static void buildAdMarvelAdapterInstances(String paramString)
  {
    try
    {
      adMarvelAdapterInstances.put(paramString, createInstances());
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static Map<String, AdMarvelAdapter> createInstances()
  {
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter"));
      try
      {
        label22: localHashMap.put("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter"));
        try
        {
          label36: localHashMap.put("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter"));
          try
          {
            label50: localHashMap.put("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter"));
            try
            {
              label64: localHashMap.put("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter"));
              try
              {
                label78: localHashMap.put("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter"));
                try
                {
                  label92: localHashMap.put("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter"));
                  try
                  {
                    label106: localHashMap.put("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter"));
                    try
                    {
                      label120: localHashMap.put("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter", AdMarvelAdapter.createInstance("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter"));
                      return localHashMap;
                    }
                    catch (Exception localException9)
                    {
                      return localHashMap;
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

  protected static void destroyAdMarvelAdapterInstances(String paramString)
  {
    try
    {
      adMarvelAdapterInstances.remove(paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static Map<String, Map<String, AdMarvelAdapter>> getAdMarvelAdapterInstancesForAdMarvelView()
  {
    return adMarvelAdapterInstances;
  }

  public static AdMarvelAdapter getAdapterInstance(String paramString)
  {
    Map localMap = (Map)adMarvelAdapterInstances.get("ADMARVELGUID");
    if (localMap != null)
      return (AdMarvelAdapter)localMap.get(paramString);
    return null;
  }

  public static AdMarvelAdapter getInstance(String paramString1, String paramString2)
  {
    Map localMap = (Map)adMarvelAdapterInstances.get(paramString1);
    if (localMap != null)
      return (AdMarvelAdapter)localMap.get(paramString2);
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAdapterInstances
 * JD-Core Version:    0.6.2
 */