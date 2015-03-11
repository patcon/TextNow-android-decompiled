package com.flurry.sdk;

public final class rr extends rv
{
  private static final rr[] d = new rr[12];
  final int c;

  static
  {
    for (int i = 0; i < 12; i++)
      d[i] = new rr(i - 1);
  }

  public rr(int paramInt)
  {
    this.c = paramInt;
  }

  public static rr a(int paramInt)
  {
    if ((paramInt > 10) || (paramInt < -1))
      return new rr(paramInt);
    return d[(paramInt + 1)];
  }

  public final void a(hf paramhf, jw paramjw)
  {
    paramhf.b(this.c);
  }

  public final boolean e()
  {
    return true;
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
    while (((rr)paramObject).c == this.c);
    return false;
  }

  public final int hashCode()
  {
    return this.c;
  }

  public final int k()
  {
    return this.c;
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
 * Qualified Name:     com.flurry.sdk.rr
 * JD-Core Version:    0.6.2
 */