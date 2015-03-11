package com.flurry.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;

@kb
public final class os$g extends pt<Number>
{
  public static final g a = new g();

  public os$g()
  {
    super(Number.class);
  }

  public final void a(Number paramNumber, hf paramhf, jw paramjw)
  {
    if ((paramNumber instanceof BigDecimal))
    {
      paramhf.a((BigDecimal)paramNumber);
      return;
    }
    if ((paramNumber instanceof BigInteger))
    {
      paramhf.a((BigInteger)paramNumber);
      return;
    }
    if ((paramNumber instanceof Integer))
    {
      paramhf.b(paramNumber.intValue());
      return;
    }
    if ((paramNumber instanceof Long))
    {
      paramhf.a(paramNumber.longValue());
      return;
    }
    if ((paramNumber instanceof Double))
    {
      paramhf.a(paramNumber.doubleValue());
      return;
    }
    if ((paramNumber instanceof Float))
    {
      paramhf.a(paramNumber.floatValue());
      return;
    }
    if (((paramNumber instanceof Byte)) || ((paramNumber instanceof Short)))
    {
      paramhf.b(paramNumber.intValue());
      return;
    }
    paramhf.e(paramNumber.toString());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.os.g
 * JD-Core Version:    0.6.2
 */