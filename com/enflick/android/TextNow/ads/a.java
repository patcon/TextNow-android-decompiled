package com.enflick.android.TextNow.ads;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.flurry.android.FlurryAdSize;
import com.flurry.android.FlurryAds;
import com.flurry.android.FlurryAgent;
import java.util.HashMap;
import java.util.Map;

public final class a
{
  private static boolean a = true;

  public static void a(Context paramContext)
  {
    try
    {
      FlurryAgent.setReportLocation(false);
      FlurryAgent.onStartSession(paramContext, "J8PTPZS8NBXMJFGCMNCX");
      return;
    }
    catch (Throwable localThrowable)
    {
      a = false;
    }
  }

  public static void a(Context paramContext, String paramString, ViewGroup paramViewGroup)
  {
    if (!a)
      return;
    try
    {
      FlurryAds.displayAd(paramContext, paramString, paramViewGroup);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static void a(Context paramContext, String paramString, ViewGroup paramViewGroup, FlurryAdSize paramFlurryAdSize)
  {
    if (!a)
      return;
    try
    {
      FlurryAds.fetchAd(paramContext, paramString, paramViewGroup, paramFlurryAdSize);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static void a(String paramString1, String paramString2, String paramString3)
  {
    HashMap localHashMap = new HashMap();
    if (!TextUtils.isEmpty(paramString2))
      localHashMap.put(paramString2, paramString3);
    a(paramString1, localHashMap);
  }

  public static void a(String paramString, Map<String, String> paramMap)
  {
    try
    {
      FlurryAgent.logEvent(paramString, paramMap);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static void a(Map<String, String> paramMap)
  {
    if (!a)
      return;
    try
    {
      FlurryAds.setUserCookies(paramMap);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static boolean a(String paramString)
  {
    if (!a)
      return false;
    try
    {
      boolean bool = FlurryAds.isAdReady(paramString);
      return bool;
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  public static void b(Context paramContext)
  {
    if (!a)
      return;
    try
    {
      FlurryAgent.onEndSession(paramContext);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static void b(Context paramContext, String paramString, ViewGroup paramViewGroup)
  {
    try
    {
      FlurryAds.removeAd(paramContext, paramString, paramViewGroup);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }

  public static void b(String paramString)
  {
    try
    {
      FlurryAgent.logEvent(paramString);
      return;
    }
    catch (Throwable localThrowable)
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.ads.a
 * JD-Core Version:    0.6.2
 */