package com.flurry.sdk;

import java.text.DateFormat;
import java.util.HashMap;

public abstract class jn<T extends jn<T>>
  implements iu.a
{
  protected static final DateFormat d = ri.f;
  protected jn.a e;
  protected HashMap<qj, Class<?>> f;
  protected boolean g;
  protected ng h;

  protected jn(iu<? extends ir> paramiu, iq paramiq, ne<?> paramne, ng paramng, jr paramjr, qs paramqs, je paramje)
  {
    this.e = new jn.a(paramiu, paramiq, paramne, paramjr, paramqs, null, d, paramje);
    this.h = paramng;
    this.g = true;
  }

  protected jn(jn<T> paramjn, jn.a parama, ng paramng)
  {
    this.e = parama;
    this.h = paramng;
    this.g = true;
    this.f = paramjn.f;
  }

  public iq a()
  {
    return this.e.b();
  }

  public abstract <DESC extends ir> DESC a(sh paramsh);

  public sh a(sh paramsh, Class<?> paramClass)
  {
    return m().a(paramsh, paramClass);
  }

  public final Class<?> a(Class<?> paramClass)
  {
    if (this.f == null)
      return null;
    return (Class)this.f.get(new qj(paramClass));
  }

  public final void a(Class<?> paramClass1, Class<?> paramClass2)
  {
    if (this.f == null)
    {
      this.g = false;
      this.f = new HashMap();
    }
    while (true)
    {
      this.f.put(new qj(paramClass1), paramClass2);
      return;
      if (this.g)
      {
        this.g = false;
        this.f = new HashMap(this.f);
      }
    }
  }

  public final sh b(Class<?> paramClass)
  {
    return m().a(paramClass, null);
  }

  public abstract boolean b();

  public <DESC extends ir> DESC c(Class<?> paramClass)
  {
    return a(b(paramClass));
  }

  public abstract boolean c();

  public ni<?> d(mm parammm, Class<? extends ni<?>> paramClass)
  {
    je localje = k();
    if (localje != null)
    {
      ni localni = localje.a(this, parammm, paramClass);
      if (localni != null)
        return localni;
    }
    return (ni)qy.b(paramClass, c());
  }

  public final ni<?> d(sh paramsh)
  {
    return this.e.f();
  }

  public abstract boolean d();

  public ne<?> e()
  {
    return this.e.c();
  }

  public nh e(mm parammm, Class<? extends nh> paramClass)
  {
    je localje = k();
    if (localje != null)
    {
      nh localnh = localje.b(this, parammm, paramClass);
      if (localnh != null)
        return localnh;
    }
    return (nh)qy.b(paramClass, c());
  }

  public iu<? extends ir> i()
  {
    return this.e.a();
  }

  public final jr j()
  {
    return this.e.d();
  }

  public final je k()
  {
    return this.e.h();
  }

  public final ng l()
  {
    if (this.h == null)
      this.h = new nt();
    return this.h;
  }

  public final qs m()
  {
    return this.e.e();
  }

  public final DateFormat n()
  {
    return this.e.g();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.jn
 * JD-Core Version:    0.6.2
 */