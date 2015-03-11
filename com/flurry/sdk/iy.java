package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JsonAutoDetect.Visibility;
import java.util.HashMap;

public class iy extends jn.c<iy.a, iy>
{
  protected rd<ja> a;
  protected final rs b;
  protected boolean c;

  public iy(iu<? extends ir> paramiu, iq paramiq, ne<?> paramne, ng paramng, jr paramjr, qs paramqs, je paramje)
  {
    super(paramiu, paramiq, paramne, paramng, paramjr, paramqs, paramje, d(iy.a.class));
    this.b = rs.a;
  }

  protected iy(iy paramiy, jn.a parama)
  {
    super(paramiy, parama, paramiy.h);
    this.a = paramiy.a;
    this.b = paramiy.b;
    this.c = paramiy.c;
  }

  private iy(iy paramiy, HashMap<qj, Class<?>> paramHashMap, ng paramng)
  {
    this(paramiy, paramiy.e);
    this.f = paramHashMap;
    this.h = paramng;
  }

  public iq a()
  {
    if (a(iy.a.a))
      return super.a();
    return nb.a;
  }

  public <T extends ir> T a(sh paramsh)
  {
    return i().a(this, paramsh, this);
  }

  protected iy a(int paramInt)
  {
    if ((paramInt & ju.a.l.b()) != 0);
    for (boolean bool = true; ; bool = false)
    {
      this.c = bool;
      return this;
    }
  }

  public iy a(ng paramng)
  {
    HashMap localHashMap = this.f;
    this.g = true;
    return new iy(this, localHashMap, paramng);
  }

  public jg<Object> a(mm parammm, Class<? extends jg<?>> paramClass)
  {
    je localje = k();
    if (localje != null)
    {
      jg localjg = localje.a(this, parammm, paramClass);
      if (localjg != null)
        return localjg;
    }
    return (jg)qy.b(paramClass, c());
  }

  @Deprecated
  public void a(iy.a parama, boolean paramBoolean)
  {
    super.a(parama, paramBoolean);
  }

  public boolean a(iy.a parama)
  {
    return (this.i & parama.b()) != 0;
  }

  public <T extends ir> T b(sh paramsh)
  {
    return i().a(this, paramsh, this);
  }

  public jl b(mm parammm, Class<? extends jl> paramClass)
  {
    je localje = k();
    if (localje != null)
    {
      jl localjl = localje.b(this, parammm, paramClass);
      if (localjl != null)
        return localjl;
    }
    return (jl)qy.b(paramClass, c());
  }

  @Deprecated
  public void b(iy.a parama)
  {
    super.b(parama);
  }

  public boolean b()
  {
    return a(iy.a.a);
  }

  public <T extends ir> T c(sh paramsh)
  {
    return i().b(this, paramsh, this);
  }

  public kx c(mm parammm, Class<? extends kx> paramClass)
  {
    je localje = k();
    if (localje != null)
    {
      kx localkx = localje.c(this, parammm, paramClass);
      if (localkx != null)
        return localkx;
    }
    return (kx)qy.b(paramClass, c());
  }

  @Deprecated
  public void c(iy.a parama)
  {
    super.a(parama);
  }

  public boolean c()
  {
    return a(iy.a.f);
  }

  public boolean d()
  {
    return this.c;
  }

  public ne<?> e()
  {
    ne localne = super.e();
    if (!a(iy.a.b))
      localne = localne.c(JsonAutoDetect.Visibility.NONE);
    if (!a(iy.a.c))
      localne = localne.d(JsonAutoDetect.Visibility.NONE);
    if (!a(iy.a.d))
      localne = localne.e(JsonAutoDetect.Visibility.NONE);
    return localne;
  }

  public rd<ja> f()
  {
    return this.a;
  }

  public ha g()
  {
    return hb.a();
  }

  public final rs h()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.iy
 * JD-Core Version:    0.6.2
 */