package com.admarvel.android.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

public class AdMarvelAnalyticsAdapterInstances
{
  private static Map<String, AdMarvelAnalyticsAdapter> instances = null;

  static Map<String, AdMarvelAnalyticsAdapter> createInstances(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    try
    {
      localHashMap.put("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", AdMarvelAnalyticsAdapter.createInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramContext));
      return localHashMap;
    }
    catch (Exception localException)
    {
    }
    return localHashMap;
  }

  public static AdMarvelAnalyticsAdapter getInstance(String paramString, Context paramContext)
  {
    if (instances == null)
      instances = createInstances(paramContext);
    return (AdMarvelAnalyticsAdapter)instances.get(paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAnalyticsAdapterInstances
 * JD-Core Version:    0.6.2
 */