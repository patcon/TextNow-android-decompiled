package com.flurry.sdk;

public final class sq$b
{
  private static final hm[] d = new hm[16];
  protected b a;
  protected long b;
  protected final Object[] c = new Object[16];

  static
  {
    hm[] arrayOfhm = hm.values();
    System.arraycopy(arrayOfhm, 1, d, 1, Math.min(15, -1 + arrayOfhm.length));
  }

  public final hm a(int paramInt)
  {
    long l = this.b;
    if (paramInt > 0)
      l >>= paramInt << 2;
    int i = 0xF & (int)l;
    return d[i];
  }

  public final b a()
  {
    return this.a;
  }

  public final b a(int paramInt, hm paramhm)
  {
    if (paramInt < 16)
    {
      b(paramInt, paramhm);
      return null;
    }
    this.a = new b();
    this.a.b(0, paramhm);
    return this.a;
  }

  public final b a(int paramInt, hm paramhm, Object paramObject)
  {
    if (paramInt < 16)
    {
      b(paramInt, paramhm, paramObject);
      return null;
    }
    this.a = new b();
    this.a.b(0, paramhm, paramObject);
    return this.a;
  }

  public final Object b(int paramInt)
  {
    return this.c[paramInt];
  }

  public final void b(int paramInt, hm paramhm)
  {
    long l = paramhm.ordinal();
    if (paramInt > 0)
      l <<= paramInt << 2;
    this.b = (l | this.b);
  }

  public final void b(int paramInt, hm paramhm, Object paramObject)
  {
    this.c[paramInt] = paramObject;
    long l = paramhm.ordinal();
    if (paramInt > 0)
      l <<= paramInt << 2;
    this.b = (l | this.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sq.b
 * JD-Core Version:    0.6.2
 */