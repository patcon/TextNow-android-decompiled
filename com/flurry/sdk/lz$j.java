package com.flurry.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;

@kb
public final class lz$j extends mc<Number>
{
  public lz$j()
  {
    super(Number.class);
  }

  public final Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    switch (lz.1.a[paramhj.e().ordinal()])
    {
    default:
      return paramjy.c(paramhj, paramiz);
    case 1:
    case 2:
    case 3:
    }
    return b(paramhj, paramiz);
  }

  public final Number b(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.i)
    {
      if (paramiz.a(iy.a.h))
        return paramhj.v();
      return paramhj.p();
    }
    if (localhm == hm.j)
    {
      if (paramiz.a(iy.a.g))
        return paramhj.y();
      return Double.valueOf(paramhj.x());
    }
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      try
      {
        if (str.indexOf('.') < 0)
          break label135;
        if (paramiz.a(iy.a.g))
        {
          BigDecimal localBigDecimal = new BigDecimal(str);
          return localBigDecimal;
        }
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid number");
      }
      return new Double(str);
      label135: if (paramiz.a(iy.a.h))
        return new BigInteger(str);
      long l = Long.parseLong(str);
      if ((l <= 2147483647L) && (l >= -2147483648L))
        return Integer.valueOf((int)l);
      Long localLong = Long.valueOf(l);
      return localLong;
    }
    throw paramiz.a(this.q, localhm);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lz.j
 * JD-Core Version:    0.6.2
 */