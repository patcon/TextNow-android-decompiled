package com.flurry.sdk;

public final class rt extends rv
{
  final long c;

  public rt(long paramLong)
  {
    this.c = paramLong;
  }

  public static rt a(long paramLong)
  {
    return new rt(paramLong);
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
    while (((rt)paramObject).c == this.c);
    return false;
  }

  public final int hashCode()
  {
    return (int)this.c ^ (int)(this.c >> 32);
  }

  public final int k()
  {
    return (int)this.c;
  }

  public final long l()
  {
    return this.c;
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
 * Qualified Name:     com.flurry.sdk.rt
 * JD-Core Version:    0.6.2
 */