package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.util.Map;

public final class bh
  implements bc
{
  private static int a(DisplayMetrics paramDisplayMetrics, Map<String, String> paramMap, String paramString, int paramInt)
  {
    String str = (String)paramMap.get(paramString);
    if (str != null);
    try
    {
      int i = et.a(paramDisplayMetrics, Integer.parseInt(str));
      paramInt = i;
      return paramInt;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      eu.D("Could not parse " + paramString + " in a video GMSG: " + str);
    }
    return paramInt;
  }

  public final void b(ex paramex, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("action");
    if (str1 == null)
    {
      eu.D("Action missing from video GMSG.");
      return;
    }
    cf localcf = paramex.ca();
    if (localcf == null)
    {
      eu.D("Could not get ad overlay for a video GMSG.");
      return;
    }
    boolean bool1 = "new".equalsIgnoreCase(str1);
    boolean bool2 = "position".equalsIgnoreCase(str1);
    if ((bool1) || (bool2))
    {
      DisplayMetrics localDisplayMetrics1 = paramex.getContext().getResources().getDisplayMetrics();
      int i = a(localDisplayMetrics1, paramMap, "x", 0);
      int j = a(localDisplayMetrics1, paramMap, "y", 0);
      int k = a(localDisplayMetrics1, paramMap, "w", -1);
      int m = a(localDisplayMetrics1, paramMap, "h", -1);
      if ((bool1) && (localcf.aQ() == null))
      {
        localcf.c(i, j, k, m);
        return;
      }
      localcf.b(i, j, k, m);
      return;
    }
    cj localcj = localcf.aQ();
    if (localcj == null)
    {
      cj.a(paramex, "no_video_view", null);
      return;
    }
    if ("click".equalsIgnoreCase(str1))
    {
      DisplayMetrics localDisplayMetrics2 = paramex.getContext().getResources().getDisplayMetrics();
      int n = a(localDisplayMetrics2, paramMap, "x", 0);
      int i1 = a(localDisplayMetrics2, paramMap, "y", 0);
      long l = SystemClock.uptimeMillis();
      MotionEvent localMotionEvent = MotionEvent.obtain(l, l, 0, n, i1, 0);
      localcj.b(localMotionEvent);
      localMotionEvent.recycle();
      return;
    }
    if ("controls".equalsIgnoreCase(str1))
    {
      String str3 = (String)paramMap.get("enabled");
      if (str3 == null)
      {
        eu.D("Enabled parameter missing from controls video GMSG.");
        return;
      }
      localcj.l(Boolean.parseBoolean(str3));
      return;
    }
    if ("currentTime".equalsIgnoreCase(str1))
    {
      String str2 = (String)paramMap.get("time");
      if (str2 == null)
      {
        eu.D("Time parameter missing from currentTime video GMSG.");
        return;
      }
      try
      {
        localcj.seekTo((int)(1000.0F * Float.parseFloat(str2)));
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        eu.D("Could not parse time parameter from currentTime video GMSG: " + str2);
        return;
      }
    }
    if ("hide".equalsIgnoreCase(str1))
    {
      localcj.setVisibility(4);
      return;
    }
    if ("load".equalsIgnoreCase(str1))
    {
      localcj.ba();
      return;
    }
    if ("pause".equalsIgnoreCase(str1))
    {
      localcj.pause();
      return;
    }
    if ("play".equalsIgnoreCase(str1))
    {
      localcj.play();
      return;
    }
    if ("show".equalsIgnoreCase(str1))
    {
      localcj.setVisibility(0);
      return;
    }
    if ("src".equalsIgnoreCase(str1))
    {
      localcj.o((String)paramMap.get("src"));
      return;
    }
    eu.D("Unknown video action: " + str1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bh
 * JD-Core Version:    0.6.2
 */