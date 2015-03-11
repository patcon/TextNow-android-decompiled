package com.flurry.sdk;

import java.math.BigDecimal;

@kb
public class lz$a extends mc<BigDecimal>
{
  public lz$a()
  {
    super(BigDecimal.class);
  }

  public BigDecimal b(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if ((localhm == hm.i) || (localhm == hm.j))
      return paramhj.y();
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      if (str.length() == 0)
        return null;
      try
      {
        BigDecimal localBigDecimal = new BigDecimal(str);
        return localBigDecimal;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw paramiz.b(this.q, "not a valid representation");
      }
    }
    throw paramiz.a(this.q, localhm);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lz.a
 * JD-Core Version:    0.6.2
 */