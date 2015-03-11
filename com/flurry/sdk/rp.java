package com.flurry.sdk;

import java.math.BigDecimal;

public final class rp extends rv
{
  protected final BigDecimal c;

  public rp(BigDecimal paramBigDecimal)
  {
    this.c = paramBigDecimal;
  }

  public static rp a(BigDecimal paramBigDecimal)
  {
    return new rp(paramBigDecimal);
  }

  public final void a(hf paramhf, jw paramjw)
  {
    paramhf.a(this.c);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this)
      bool = true;
    Class localClass1;
    Class localClass2;
    do
    {
      do
      {
        return bool;
        bool = false;
      }
      while (paramObject == null);
      localClass1 = paramObject.getClass();
      localClass2 = getClass();
      bool = false;
    }
    while (localClass1 != localClass2);
    return ((rp)paramObject).c.equals(this.c);
  }

  public final int hashCode()
  {
    return this.c.hashCode();
  }

  public final int k()
  {
    return this.c.intValue();
  }

  public final long l()
  {
    return this.c.longValue();
  }

  public final double m()
  {
    return this.c.doubleValue();
  }

  public final String n()
  {
    return this.c.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rp
 * JD-Core Version:    0.6.2
 */