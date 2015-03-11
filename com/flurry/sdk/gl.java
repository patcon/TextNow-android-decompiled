package com.flurry.sdk;

public class gl extends gm
{
  private gf d;

  static
  {
    if (!gl.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      b = bool;
      return;
    }
  }

  gl(fn paramfn1, fn paramfn2, gf paramgf)
  {
    this(a(paramfn1, paramfn2), paramgf);
  }

  private gl(Object paramObject, gf paramgf)
  {
    super((gq)paramObject, paramgf);
  }

  public static Object a(fn paramfn1, fn paramfn2)
  {
    if (paramfn1 == null)
      throw new NullPointerException("writer cannot be null!");
    if (paramfn2 == null)
      throw new NullPointerException("reader cannot be null!");
    return new go().a(paramfn1, paramfn2);
  }

  public gq a(gq paramgq1, gq paramgq2)
  {
    if ((paramgq2 instanceof gq.e))
    {
      if (paramgq1 == gq.s)
        return paramgq2;
      return null;
    }
    if ((paramgq2 instanceof gq.k))
    {
      gq.k localk = (gq.k)paramgq2;
      if (localk.B != paramgq1)
        throw new fl("Found " + localk.B + " while looking for " + paramgq1);
      return localk.z;
    }
    if ((paramgq2 instanceof gq.n))
    {
      gq localgq = ((gq.n)paramgq2).z;
      this.a.d(localgq);
    }
    while (true)
    {
      return null;
      if ((paramgq2 instanceof gq.q))
      {
        gq.a locala = (gq.a)this.a.c();
        this.a.c(locala.a(this.c.s()));
      }
      else
      {
        if ((paramgq2 instanceof gq.d))
          throw new fl(((gq.d)paramgq2).z);
        if ((paramgq2 instanceof gq.b))
        {
          gq.b localb = (gq.b)paramgq2;
          this.d = this.c;
          this.c = gg.a().a(localb.z, null);
        }
        else
        {
          if (paramgq2 != gq.x)
            break;
          this.c = this.d;
        }
      }
    }
    throw new fl("Unknown action: " + paramgq2);
  }

  public long e()
  {
    gq localgq = this.a.a(gq.f);
    if (localgq == gq.e)
      return this.c.d();
    if (localgq == gq.h)
      return ()this.c.g();
    if ((!b) && (localgq != gq.f))
      throw new AssertionError();
    return this.c.e();
  }

  public float f()
  {
    gq localgq = this.a.a(gq.g);
    if (localgq == gq.e)
      return this.c.d();
    if (localgq == gq.f)
      return (float)this.c.e();
    if ((!b) && (localgq != gq.g))
      throw new AssertionError();
    return this.c.f();
  }

  public double g()
  {
    gq localgq = this.a.a(gq.h);
    if (localgq == gq.e)
      return this.c.d();
    if (localgq == gq.f)
      return this.c.e();
    if (localgq == gq.g)
      return this.c.f();
    if ((!b) && (localgq != gq.h))
      throw new AssertionError();
    return this.c.g();
  }

  public int k()
  {
    this.a.a(gq.l);
    gq.c localc = (gq.c)this.a.c();
    int i = this.c.k();
    Object localObject = localc.z[i];
    if ((localObject instanceof Integer))
      return ((Integer)localObject).intValue();
    throw new fl((String)localObject);
  }

  public void l()
  {
    gq localgq = this.a.c();
    if ((localgq instanceof gq.k))
      this.a.c(((gq.k)localgq).z);
    do
    {
      return;
      if ((localgq instanceof gq.n))
      {
        this.a.c(((gq.n)localgq).z);
        return;
      }
      if ((localgq instanceof gq.q))
      {
        gq.a locala = (gq.a)this.a.c();
        this.a.c(locala.a(this.c.s()));
        return;
      }
      if ((localgq instanceof gq.d))
        throw new fl(((gq.d)localgq).z);
      if ((localgq instanceof gq.b))
      {
        gq.b localb = (gq.b)localgq;
        this.d = this.c;
        this.c = gg.a().a(localb.z, null);
        return;
      }
    }
    while (localgq != gq.x);
    this.c = this.d;
  }

  public int s()
  {
    this.a.a(gq.m);
    gq.p localp = (gq.p)this.a.c();
    this.a.c(localp.B);
    return localp.z;
  }

  public final fn.f[] u()
  {
    return ((gq.e)this.a.a(gq.s)).z;
  }

  public final void v()
  {
    this.a.a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gl
 * JD-Core Version:    0.6.2
 */