package com.flurry.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;

public final class sq$a extends hv
{
  protected hn d;
  protected sq.b e;
  protected int f;
  protected hw g;
  protected boolean h;
  protected transient sj i;
  protected hg j = null;

  public sq$a(sq.b paramb, hn paramhn)
  {
    super(0);
    this.e = paramb;
    this.f = -1;
    this.d = paramhn;
    this.g = hw.a(-1, -1);
  }

  protected final Object A()
  {
    return this.e.b(this.f);
  }

  protected final void B()
  {
    if ((this.b == null) || (!this.b.c()))
      throw a("Current token (" + this.b + ") not numeric, can not use numeric value accessors");
  }

  protected final void H()
  {
    U();
  }

  public final hn a()
  {
    return this.d;
  }

  public final void a(hg paramhg)
  {
    this.j = paramhg;
  }

  public final byte[] a(ha paramha)
  {
    if (this.b == hm.g)
    {
      Object localObject = A();
      if ((localObject instanceof byte[]))
        return (byte[])localObject;
    }
    if (this.b != hm.h)
      throw a("Current token (" + this.b + ") not VALUE_STRING (or VALUE_EMBEDDED_OBJECT with byte[]), can not access as binary");
    String str = k();
    if (str == null)
      return null;
    sj localsj = this.i;
    if (localsj == null)
    {
      localsj = new sj(100);
      this.i = localsj;
    }
    while (true)
    {
      a(str, localsj, paramha);
      return localsj.b();
      this.i.a();
    }
  }

  public final hm b()
  {
    if ((this.h) || (this.e == null));
    do
    {
      return null;
      int k = 1 + this.f;
      this.f = k;
      if (k < 16)
        break;
      this.f = 0;
      this.e = this.e.a();
    }
    while (this.e == null);
    this.b = this.e.a(this.f);
    Object localObject;
    String str;
    if (this.b == hm.f)
    {
      localObject = A();
      if ((localObject instanceof String))
      {
        str = (String)localObject;
        this.g.a(str);
      }
    }
    while (true)
    {
      return this.b;
      str = localObject.toString();
      break;
      if (this.b == hm.b)
      {
        this.g = this.g.c(-1, -1);
      }
      else if (this.b == hm.d)
      {
        this.g = this.g.b(-1, -1);
      }
      else if ((this.b == hm.c) || (this.b == hm.e))
      {
        this.g = this.g.i();
        if (this.g == null)
          this.g = hw.a(-1, -1);
      }
    }
  }

  public final void close()
  {
    if (!this.h)
      this.h = true;
  }

  public final String g()
  {
    return this.g.h();
  }

  public final hg h()
  {
    return i();
  }

  public final hg i()
  {
    if (this.j == null)
      return hg.a;
    return this.j;
  }

  public final String k()
  {
    if ((this.b == hm.h) || (this.b == hm.f))
    {
      Object localObject1 = A();
      if ((localObject1 instanceof String))
        return (String)localObject1;
      if (localObject1 == null)
        return null;
      return localObject1.toString();
    }
    if (this.b == null)
      return null;
    switch (sq.1.a[this.b.ordinal()])
    {
    default:
      return this.b.a();
    case 7:
    case 8:
    }
    Object localObject2 = A();
    if (localObject2 == null)
      return null;
    return localObject2.toString();
  }

  public final char[] l()
  {
    String str = k();
    if (str == null)
      return null;
    return str.toCharArray();
  }

  public final int m()
  {
    String str = k();
    if (str == null)
      return 0;
    return str.length();
  }

  public final int n()
  {
    return 0;
  }

  public final boolean o()
  {
    return false;
  }

  public final Number p()
  {
    B();
    return (Number)A();
  }

  public final hj.b q()
  {
    Number localNumber = p();
    if ((localNumber instanceof Integer))
      return hj.b.a;
    if ((localNumber instanceof Long))
      return hj.b.b;
    if ((localNumber instanceof Double))
      return hj.b.e;
    if ((localNumber instanceof BigDecimal))
      return hj.b.f;
    if ((localNumber instanceof Float))
      return hj.b.d;
    if ((localNumber instanceof BigInteger))
      return hj.b.c;
    return null;
  }

  public final int t()
  {
    if (this.b == hm.i)
      return ((Number)A()).intValue();
    return p().intValue();
  }

  public final long u()
  {
    return p().longValue();
  }

  public final BigInteger v()
  {
    Number localNumber = p();
    if ((localNumber instanceof BigInteger))
      return (BigInteger)localNumber;
    switch (sq.1.b[q().ordinal()])
    {
    default:
      return BigInteger.valueOf(localNumber.longValue());
    case 3:
    }
    return ((BigDecimal)localNumber).toBigInteger();
  }

  public final float w()
  {
    return p().floatValue();
  }

  public final double x()
  {
    return p().doubleValue();
  }

  public final BigDecimal y()
  {
    Number localNumber = p();
    if ((localNumber instanceof BigDecimal))
      return (BigDecimal)localNumber;
    switch (sq.1.b[q().ordinal()])
    {
    case 3:
    case 4:
    default:
      return BigDecimal.valueOf(localNumber.doubleValue());
    case 1:
    case 5:
      return BigDecimal.valueOf(localNumber.longValue());
    case 2:
    }
    return new BigDecimal((BigInteger)localNumber);
  }

  public final Object z()
  {
    if (this.b == hm.g)
      return A();
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sq.a
 * JD-Core Version:    0.6.2
 */