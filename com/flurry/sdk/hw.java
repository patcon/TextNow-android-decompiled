package com.flurry.sdk;

public final class hw extends hl
{
  protected final hw c;
  protected int d;
  protected int e;
  protected String f;
  protected hw g = null;

  public hw(hw paramhw, int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.c = paramhw;
    this.d = paramInt2;
    this.e = paramInt3;
    this.b = -1;
  }

  public static hw a(int paramInt1, int paramInt2)
  {
    return new hw(null, 0, paramInt1, paramInt2);
  }

  public static hw g()
  {
    return new hw(null, 0, 1, 0);
  }

  public final hg a(Object paramObject)
  {
    return new hg(paramObject, -1L, this.d, this.e);
  }

  protected final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a = paramInt1;
    this.b = -1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = null;
  }

  public final void a(String paramString)
  {
    this.f = paramString;
  }

  public final hw b(int paramInt1, int paramInt2)
  {
    hw localhw1 = this.g;
    if (localhw1 == null)
    {
      hw localhw2 = new hw(this, 1, paramInt1, paramInt2);
      this.g = localhw2;
      return localhw2;
    }
    localhw1.a(1, paramInt1, paramInt2);
    return localhw1;
  }

  public final hw c(int paramInt1, int paramInt2)
  {
    hw localhw1 = this.g;
    if (localhw1 == null)
    {
      hw localhw2 = new hw(this, 2, paramInt1, paramInt2);
      this.g = localhw2;
      return localhw2;
    }
    localhw1.a(2, paramInt1, paramInt2);
    return localhw1;
  }

  public final String h()
  {
    return this.f;
  }

  public final hw i()
  {
    return this.c;
  }

  public final boolean j()
  {
    int i = 1 + this.b;
    this.b = i;
    return (this.a != 0) && (i > 0);
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    switch (this.a)
    {
    default:
    case 0:
    case 1:
      while (true)
      {
        return localStringBuilder.toString();
        localStringBuilder.append("/");
        continue;
        localStringBuilder.append('[');
        localStringBuilder.append(f());
        localStringBuilder.append(']');
      }
    case 2:
    }
    localStringBuilder.append('{');
    if (this.f != null)
    {
      localStringBuilder.append('"');
      sk.a(localStringBuilder, this.f);
      localStringBuilder.append('"');
    }
    while (true)
    {
      localStringBuilder.append('}');
      break;
      localStringBuilder.append('?');
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hw
 * JD-Core Version:    0.6.2
 */