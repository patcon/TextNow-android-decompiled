package com.flurry.sdk;

import java.util.List;
import java.util.Map;

public abstract class gq
{
  public static final gq c = new gq.o("null");
  public static final gq d = new gq.o("boolean");
  public static final gq e = new gq.o("int");
  public static final gq f = new gq.o("long");
  public static final gq g = new gq.o("float");
  public static final gq h = new gq.o("double");
  public static final gq i = new gq.o("string");
  public static final gq j = new gq.o("bytes");
  public static final gq k = new gq.o("fixed");
  public static final gq l = new gq.o("enum");
  public static final gq m = new gq.o("union");
  public static final gq n = new gq.o("array-start");
  public static final gq o = new gq.o("array-end");
  public static final gq p = new gq.o("map-start");
  public static final gq q = new gq.o("map-end");
  public static final gq r = new gq.o("item-end");
  public static final gq s = new gq.o("field-action");
  public static final gq t = new gq.g(false, null);
  public static final gq u = new gq.g(true, null);
  public static final gq v = new gq.g(true, null);
  public static final gq w = new gq.g(true, null);
  public static final gq x = new gq.g(true, null);
  public static final gq y = new gq.o("map-key-marker");
  public final gq.i a;
  public final gq[] b;

  protected gq(gq.i parami)
  {
    this(parami, null);
  }

  protected gq(gq.i parami, gq[] paramArrayOfgq)
  {
    this.b = paramArrayOfgq;
    this.a = parami;
  }

  protected static int a(gq[] paramArrayOfgq, int paramInt)
  {
    int i1 = 0;
    if (paramInt < paramArrayOfgq.length)
    {
      if ((paramArrayOfgq[paramInt] instanceof gq.m));
      for (int i2 = i1 + ((gq.m)paramArrayOfgq[paramInt]).a(); ; i2 = i1 + 1)
      {
        paramInt++;
        i1 = i2;
        break;
      }
    }
    return i1;
  }

  static gq a(gq paramgq1, gq paramgq2)
  {
    return new gq.k(paramgq1, paramgq2, null);
  }

  static gq a(gq paramgq, gq[] paramArrayOfgq)
  {
    return new gq.j(paramgq, paramArrayOfgq, null);
  }

  static gq a(String paramString)
  {
    return new gq.d(paramString, null);
  }

  static gq a(gq[] paramArrayOfgq)
  {
    return new gq.l(paramArrayOfgq, null);
  }

  static gq a(gq[] paramArrayOfgq, String[] paramArrayOfString)
  {
    return new gq.a(paramArrayOfgq, paramArrayOfString, null);
  }

  static void a(gq[] paramArrayOfgq1, int paramInt1, gq[] paramArrayOfgq2, int paramInt2, Map<gq.m, gq.m> paramMap, Map<gq.m, List<gq.f>> paramMap1)
  {
    if (paramInt1 < paramArrayOfgq1.length)
    {
      gq localgq = paramArrayOfgq1[paramInt1].a(paramMap, paramMap1);
      List localList;
      if ((localgq instanceof gq.m))
      {
        gq[] arrayOfgq = localgq.b;
        localList = (List)paramMap1.get(localgq);
        if (localList == null)
        {
          System.arraycopy(arrayOfgq, 0, paramArrayOfgq2, paramInt2, arrayOfgq.length);
          label63: paramInt2 += arrayOfgq.length;
        }
      }
      while (true)
      {
        paramInt1++;
        break;
        localList.add(new gq.f(paramArrayOfgq2, paramInt2));
        break label63;
        int i1 = paramInt2 + 1;
        paramArrayOfgq2[paramInt2] = localgq;
        paramInt2 = i1;
      }
    }
  }

  static gq b(gq[] paramArrayOfgq)
  {
    return new gq.m(paramArrayOfgq, null);
  }

  public int a()
  {
    return 1;
  }

  public gq a(Map<gq.m, gq.m> paramMap, Map<gq.m, List<gq.f>> paramMap1)
  {
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gq
 * JD-Core Version:    0.6.2
 */