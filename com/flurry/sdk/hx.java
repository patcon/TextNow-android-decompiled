package com.flurry.sdk;

public class hx extends hl
{
  protected final hx c;
  protected String d;
  protected hx e = null;

  protected hx(int paramInt, hx paramhx)
  {
    this.a = paramInt;
    this.c = paramhx;
    this.b = -1;
  }

  private final hx a(int paramInt)
  {
    this.a = paramInt;
    this.b = -1;
    this.d = null;
    return this;
  }

  public static hx g()
  {
    return new hx(0, null);
  }

  public final int a(String paramString)
  {
    if ((this.a != 2) || (this.d != null))
      return 4;
    this.d = paramString;
    if (this.b < 0)
      return 0;
    return 1;
  }

  protected final void a(StringBuilder paramStringBuilder)
  {
    if (this.a == 2)
    {
      paramStringBuilder.append('{');
      if (this.d != null)
      {
        paramStringBuilder.append('"');
        paramStringBuilder.append(this.d);
        paramStringBuilder.append('"');
      }
      while (true)
      {
        paramStringBuilder.append('}');
        return;
        paramStringBuilder.append('?');
      }
    }
    if (this.a == 1)
    {
      paramStringBuilder.append('[');
      paramStringBuilder.append(f());
      paramStringBuilder.append(']');
      return;
    }
    paramStringBuilder.append("/");
  }

  public final hx h()
  {
    hx localhx1 = this.e;
    if (localhx1 == null)
    {
      hx localhx2 = new hx(1, this);
      this.e = localhx2;
      return localhx2;
    }
    return localhx1.a(1);
  }

  public final hx i()
  {
    hx localhx1 = this.e;
    if (localhx1 == null)
    {
      hx localhx2 = new hx(2, this);
      this.e = localhx2;
      return localhx2;
    }
    return localhx1.a(2);
  }

  public final hx j()
  {
    return this.c;
  }

  public final int k()
  {
    if (this.a == 2)
    {
      if (this.d == null)
        return 5;
      this.d = null;
      this.b = (1 + this.b);
      return 2;
    }
    if (this.a == 1)
    {
      int i = this.b;
      this.b = (1 + this.b);
      if (i < 0)
        return 0;
      return 1;
    }
    this.b = (1 + this.b);
    if (this.b == 0)
      return 0;
    return 3;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(64);
    a(localStringBuilder);
    return localStringBuilder.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hx
 * JD-Core Version:    0.6.2
 */