package com.flurry.sdk;

public class kq$a extends jb.a
{
  protected static final jm[] a = new jm[0];
  protected static final kr[] b = new kr[0];
  protected static final ip[] c = new ip[0];
  protected static final ky[] d = new ky[0];
  protected final jd[] e;
  protected final jm[] f;
  protected final kr[] g;
  protected final ip[] h;
  protected final ky[] i;

  public kq$a()
  {
    this(null, null, null, null, null);
  }

  protected kq$a(jd[] paramArrayOfjd, jm[] paramArrayOfjm, kr[] paramArrayOfkr, ip[] paramArrayOfip, ky[] paramArrayOfky)
  {
    if (paramArrayOfjd == null)
      paramArrayOfjd = kq.b();
    this.e = paramArrayOfjd;
    if (paramArrayOfjm == null)
      paramArrayOfjm = a;
    this.f = paramArrayOfjm;
    if (paramArrayOfkr == null)
      paramArrayOfkr = b;
    this.g = paramArrayOfkr;
    if (paramArrayOfip == null)
      paramArrayOfip = c;
    this.h = paramArrayOfip;
    if (paramArrayOfky == null)
      paramArrayOfky = d;
    this.i = paramArrayOfky;
  }

  public jb.a a(ip paramip)
  {
    if (paramip == null)
      throw new IllegalArgumentException("Can not pass null resolver");
    ip[] arrayOfip = (ip[])qw.a(this.h, paramip);
    return new a(this.e, this.f, this.g, arrayOfip, this.i);
  }

  public jb.a a(jd paramjd)
  {
    if (paramjd == null)
      throw new IllegalArgumentException("Can not pass null Deserializers");
    return new a((jd[])qw.a(this.e, paramjd), this.f, this.g, this.h, this.i);
  }

  public jb.a a(jm paramjm)
  {
    if (paramjm == null)
      throw new IllegalArgumentException("Can not pass null KeyDeserializers");
    jm[] arrayOfjm = (jm[])qw.a(this.f, paramjm);
    return new a(this.e, arrayOfjm, this.g, this.h, this.i);
  }

  public jb.a a(ky paramky)
  {
    if (paramky == null)
      throw new IllegalArgumentException("Can not pass null resolver");
    ky[] arrayOfky = (ky[])qw.a(this.i, paramky);
    return new a(this.e, this.f, this.g, this.h, arrayOfky);
  }

  public Iterable<jd> a()
  {
    return qw.b(this.e);
  }

  public Iterable<jm> b()
  {
    return qw.b(this.f);
  }

  public Iterable<kr> c()
  {
    return qw.b(this.g);
  }

  public Iterable<ip> d()
  {
    return qw.b(this.h);
  }

  public Iterable<ky> e()
  {
    return qw.b(this.i);
  }

  public boolean f()
  {
    return this.f.length > 0;
  }

  public boolean g()
  {
    return this.g.length > 0;
  }

  public boolean h()
  {
    return this.h.length > 0;
  }

  public boolean i()
  {
    return this.i.length > 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kq.a
 * JD-Core Version:    0.6.2
 */