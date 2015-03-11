package com.flurry.sdk;

public final class rq extends rv
{
  protected final double c;

  public rq(double paramDouble)
  {
    this.c = paramDouble;
  }

  public static rq b(double paramDouble)
  {
    return new rq(paramDouble);
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
    while (((rq)paramObject).c == this.c);
    return false;
  }

  public final int hashCode()
  {
    long l = Double.doubleToLongBits(this.c);
    return (int)l ^ (int)(l >> 32);
  }

  public final int k()
  {
    return (int)this.c;
  }

  public final long l()
  {
    return ()this.c;
  }

  public final double m()
  {
    return this.c;
  }

  public final String n()
  {
    return ij.a(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rq
 * JD-Core Version:    0.6.2
 */