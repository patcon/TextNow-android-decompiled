package com.flurry.sdk;

import java.util.HashMap;
import java.util.Map;

public class cu
{
  private int a;
  private int b;
  private ds<co, String> c;
  private Map<cp, String> d;
  private cv e;

  public static cu a(cu paramcu1, cu paramcu2)
  {
    if ((paramcu1 == null) || (paramcu2 == null))
      return null;
    ds localds1 = new ds();
    ds localds2 = paramcu1.c();
    if (localds2 != null)
      localds1.a(localds2);
    ds localds3 = paramcu2.c();
    if (localds3 != null)
      localds1.a(localds3);
    HashMap localHashMap = new HashMap();
    Map localMap1 = paramcu1.d();
    if (localMap1 != null)
      localHashMap.putAll(localMap1);
    Map localMap2 = paramcu2.d();
    if (localMap2 != null)
      localHashMap.putAll(localMap2);
    cu.a locala = new cu.a();
    locala.a(paramcu2.a());
    locala.b(paramcu2.b());
    locala.a(localds1);
    locala.a(localHashMap);
    locala.a(paramcu2.e());
    return locala.a();
  }

  public int a()
  {
    return this.a;
  }

  public int b()
  {
    return this.b;
  }

  public ds<co, String> c()
  {
    return this.c;
  }

  public Map<cp, String> d()
  {
    return this.d;
  }

  public cv e()
  {
    return this.e;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cu
 * JD-Core Version:    0.6.2
 */