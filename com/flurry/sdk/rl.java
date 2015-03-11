package com.flurry.sdk;

import java.math.BigInteger;

public final class rl extends rv
{
  protected final BigInteger c;

  public rl(BigInteger paramBigInteger)
  {
    this.c = paramBigInteger;
  }

  public static rl a(BigInteger paramBigInteger)
  {
    return new rl(paramBigInteger);
  }

  public final void a(hf paramhf, jw paramjw)
  {
    paramhf.a(this.c);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
    }
    while (((rl)paramObject).c == this.c);
    return false;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rl
 * JD-Core Version:    0.6.2
 */