package com.flurry.sdk;

import java.lang.reflect.Array;
import java.util.HashSet;

public final class qw
{
  qw.b a = null;
  qw.c b = null;
  qw.h c = null;
  qw.f d = null;
  qw.g e = null;
  qw.e f = null;
  qw.d g = null;

  public static <T> HashSet<T> a(T[] paramArrayOfT)
  {
    HashSet localHashSet = new HashSet();
    if (paramArrayOfT != null)
    {
      int i = paramArrayOfT.length;
      for (int j = 0; j < i; j++)
        localHashSet.add(paramArrayOfT[j]);
    }
    return localHashSet;
  }

  public static <T> T[] a(T[] paramArrayOfT, T paramT)
  {
    int i = paramArrayOfT.length;
    for (int j = 0; j < i; j++)
      if (paramArrayOfT[j] == paramT)
      {
        if (j == 0)
          return paramArrayOfT;
        Object[] arrayOfObject2 = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i);
        System.arraycopy(paramArrayOfT, 0, arrayOfObject2, 1, j);
        paramArrayOfT[0] = paramT;
        return arrayOfObject2;
      }
    Object[] arrayOfObject1 = (Object[])Array.newInstance(paramArrayOfT.getClass().getComponentType(), i + 1);
    if (i > 0)
      System.arraycopy(paramArrayOfT, 0, arrayOfObject1, 1, i);
    arrayOfObject1[0] = paramT;
    return arrayOfObject1;
  }

  public static <T> Iterable<T> b(T[] paramArrayOfT)
  {
    return new qw.a(paramArrayOfT);
  }

  public final qw.b a()
  {
    if (this.a == null)
      this.a = new qw.b();
    return this.a;
  }

  public final qw.c b()
  {
    if (this.b == null)
      this.b = new qw.c();
    return this.b;
  }

  public final qw.h c()
  {
    if (this.c == null)
      this.c = new qw.h();
    return this.c;
  }

  public final qw.f d()
  {
    if (this.d == null)
      this.d = new qw.f();
    return this.d;
  }

  public final qw.g e()
  {
    if (this.e == null)
      this.e = new qw.g();
    return this.e;
  }

  public final qw.e f()
  {
    if (this.f == null)
      this.f = new qw.e();
    return this.f;
  }

  public final qw.d g()
  {
    if (this.g == null)
      this.g = new qw.d();
    return this.g;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qw
 * JD-Core Version:    0.6.2
 */