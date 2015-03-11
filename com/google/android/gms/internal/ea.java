package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class ea
{
  private int mOrientation = -1;
  private String qG;
  private String qH;
  private String qI;
  private List<String> qJ;
  private String qK;
  private String qL;
  private List<String> qM;
  private long qN = -1L;
  private boolean qO = false;
  private final long qP = -1L;
  private List<String> qQ;
  private long qR = -1L;

  private static String a(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
      return (String)localList.get(0);
    return null;
  }

  private static long b(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      try
      {
        float f = Float.parseFloat(str);
        return ()(f * 1000.0F);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        eu.D("Could not parse float from " + paramString + " header: " + str);
      }
    }
    return -1L;
  }

  private static List<String> c(Map<String, List<String>> paramMap, String paramString)
  {
    List localList = (List)paramMap.get(paramString);
    if ((localList != null) && (!localList.isEmpty()))
    {
      String str = (String)localList.get(0);
      if (str != null)
        return Arrays.asList(str.trim().split("\\s+"));
    }
    return null;
  }

  private void e(Map<String, List<String>> paramMap)
  {
    this.qG = a(paramMap, "X-Afma-Ad-Size");
  }

  private void f(Map<String, List<String>> paramMap)
  {
    List localList = c(paramMap, "X-Afma-Click-Tracking-Urls");
    if (localList != null)
      this.qJ = localList;
  }

  private void g(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Debug-Dialog");
    if ((localList != null) && (!localList.isEmpty()))
      this.qK = ((String)localList.get(0));
  }

  private void h(Map<String, List<String>> paramMap)
  {
    List localList = c(paramMap, "X-Afma-Tracking-Urls");
    if (localList != null)
      this.qM = localList;
  }

  private void i(Map<String, List<String>> paramMap)
  {
    long l = b(paramMap, "X-Afma-Interstitial-Timeout");
    if (l != -1L)
      this.qN = l;
  }

  private void j(Map<String, List<String>> paramMap)
  {
    this.qL = a(paramMap, "X-Afma-ActiveView");
  }

  private void k(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Mediation");
    if ((localList != null) && (!localList.isEmpty()))
      this.qO = Boolean.valueOf((String)localList.get(0)).booleanValue();
  }

  private void l(Map<String, List<String>> paramMap)
  {
    List localList = c(paramMap, "X-Afma-Manual-Tracking-Urls");
    if (localList != null)
      this.qQ = localList;
  }

  private void m(Map<String, List<String>> paramMap)
  {
    long l = b(paramMap, "X-Afma-Refresh-Rate");
    if (l != -1L)
      this.qR = l;
  }

  private void n(Map<String, List<String>> paramMap)
  {
    List localList = (List)paramMap.get("X-Afma-Orientation");
    String str;
    if ((localList != null) && (!localList.isEmpty()))
    {
      str = (String)localList.get(0);
      if (!"portrait".equalsIgnoreCase(str))
        break label53;
      this.mOrientation = eo.bS();
    }
    label53: 
    while (!"landscape".equalsIgnoreCase(str))
      return;
    this.mOrientation = eo.bR();
  }

  public final void a(String paramString1, Map<String, List<String>> paramMap, String paramString2)
  {
    this.qH = paramString1;
    this.qI = paramString2;
    d(paramMap);
  }

  public final void d(Map<String, List<String>> paramMap)
  {
    e(paramMap);
    f(paramMap);
    g(paramMap);
    h(paramMap);
    i(paramMap);
    k(paramMap);
    l(paramMap);
    m(paramMap);
    n(paramMap);
    j(paramMap);
  }

  public final du i(long paramLong)
  {
    return new du(this.qH, this.qI, this.qJ, this.qM, this.qN, this.qO, -1L, this.qQ, this.qR, this.mOrientation, this.qG, paramLong, this.qK, this.qL);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ea
 * JD-Core Version:    0.6.2
 */