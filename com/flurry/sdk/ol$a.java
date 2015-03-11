package com.flurry.sdk;

public class ol$a extends jv.a
{
  protected static final jx[] a = new jx[0];
  protected static final om[] b = new om[0];
  protected final jx[] c;
  protected final jx[] d;
  protected final om[] e;

  public ol$a()
  {
    this(null, null, null);
  }

  protected ol$a(jx[] paramArrayOfjx1, jx[] paramArrayOfjx2, om[] paramArrayOfom)
  {
    if (paramArrayOfjx1 == null)
      paramArrayOfjx1 = a;
    this.c = paramArrayOfjx1;
    if (paramArrayOfjx2 == null)
      paramArrayOfjx2 = a;
    this.d = paramArrayOfjx2;
    if (paramArrayOfom == null)
      paramArrayOfom = b;
    this.e = paramArrayOfom;
  }

  public jv.a a(jx paramjx)
  {
    if (paramjx == null)
      throw new IllegalArgumentException("Can not pass null Serializers");
    return new a((jx[])qw.a(this.c, paramjx), this.d, this.e);
  }

  public boolean a()
  {
    return this.d.length > 0;
  }

  public jv.a b(jx paramjx)
  {
    if (paramjx == null)
      throw new IllegalArgumentException("Can not pass null Serializers");
    jx[] arrayOfjx = (jx[])qw.a(this.d, paramjx);
    return new a(this.c, arrayOfjx, this.e);
  }

  public boolean b()
  {
    return this.e.length > 0;
  }

  public Iterable<jx> c()
  {
    return qw.b(this.c);
  }

  public Iterable<jx> d()
  {
    return qw.b(this.d);
  }

  public Iterable<om> e()
  {
    return qw.b(this.e);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ol.a
 * JD-Core Version:    0.6.2
 */