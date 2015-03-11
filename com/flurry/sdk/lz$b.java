package com.flurry.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;

@kb
public class lz$b extends mc<BigInteger>
{
  public lz$b()
  {
    super(BigInteger.class);
  }

  public BigInteger b(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.i)
      switch (lz.1.b[paramhj.q().ordinal()])
      {
      default:
      case 1:
      case 2:
      }
    String str;
    do
    {
      str = paramhj.k().trim();
      if (str.length() != 0)
        break;
      return null;
      return BigInteger.valueOf(paramhj.u());
      if (localhm == hm.j)
        return paramhj.y().toBigInteger();
    }
    while (localhm == hm.h);
    throw paramiz.a(this.q, localhm);
    try
    {
      BigInteger localBigInteger = new BigInteger(str);
      return localBigInteger;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
    throw paramiz.b(this.q, "not a valid representation");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lz.b
 * JD-Core Version:    0.6.2
 */