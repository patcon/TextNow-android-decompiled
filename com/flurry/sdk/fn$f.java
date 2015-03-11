package com.flurry.sdk;

import java.util.Set;

public class fn$f
{
  private final String a;
  private transient int b = -1;
  private final fn c;
  private final String d;
  private final hh e;
  private final fn.f.a f;
  private Set<String> g;
  private final fn.r h = new fn.r(fn.n());

  public fn$f(String paramString1, fn paramfn, String paramString2, hh paramhh)
  {
    this(paramString1, paramfn, paramString2, paramhh, fn.f.a.a);
  }

  public fn$f(String paramString1, fn paramfn, String paramString2, hh paramhh, fn.f.a parama)
  {
    this.a = fn.g(paramString1);
    this.c = paramfn;
    this.d = paramString2;
    this.e = paramhh;
    this.f = parama;
  }

  private boolean a(hh paramhh)
  {
    if (this.e == null)
      return paramhh == null;
    if (Double.isNaN(this.e.o()))
      return Double.isNaN(paramhh.o());
    return this.e.equals(paramhh);
  }

  public String a()
  {
    return this.a;
  }

  public void a(String paramString1, String paramString2)
  {
    try
    {
      this.h.a(paramString1, paramString2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public int b()
  {
    return this.b;
  }

  public fn c()
  {
    return this.c;
  }

  public String d()
  {
    return this.d;
  }

  public hh e()
  {
    return this.e;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    f localf;
    do
    {
      return true;
      if (!(paramObject instanceof f))
        return false;
      localf = (f)paramObject;
    }
    while ((this.a.equals(localf.a)) && (this.c.equals(localf.c)) && (a(localf.e)) && (this.h.equals(localf.h)));
    return false;
  }

  public fn.f.a f()
  {
    return this.f;
  }

  public int hashCode()
  {
    return this.a.hashCode() + this.c.m();
  }

  public String toString()
  {
    return this.a + " type:" + fn.d(this.c) + " pos:" + this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.f
 * JD-Core Version:    0.6.2
 */