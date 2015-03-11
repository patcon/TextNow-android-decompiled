package com.admarvel.android.ads;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;

class c
{
  private static Map<String, AdMarvelAnalyticsAdapter> a = null;

  static AdMarvelAnalyticsAdapter a(String paramString, Context paramContext)
  {
    if (a == null)
      a = a(paramContext);
    return (AdMarvelAnalyticsAdapter)a.get(paramString);
  }

  static Map<String, AdMarvelAnalyticsAdapter> a(Context paramContext)
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
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.c
 * JD-Core Version:    0.6.2
 */