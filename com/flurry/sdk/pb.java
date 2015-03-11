package com.flurry.sdk;

public abstract class pb<T> extends pf<T>
  implements jt
{
  protected final boolean a;
  protected final sh b;
  protected final jz c;
  protected jk<Object> d;
  protected final is e;
  protected ov f;

  protected pb(Class<?> paramClass, sh paramsh, boolean paramBoolean, jz paramjz, is paramis, jk<Object> paramjk)
  {
    super(paramClass, false);
    this.b = paramsh;
    boolean bool1;
    if (!paramBoolean)
    {
      bool1 = false;
      if (paramsh != null)
      {
        boolean bool2 = paramsh.u();
        bool1 = false;
        if (!bool2);
      }
    }
    else
    {
      bool1 = true;
    }
    this.a = bool1;
    this.c = paramjz;
    this.e = paramis;
    this.d = paramjk;
    this.f = ov.a();
  }

  protected final jk<Object> a(ov paramov, sh paramsh, jw paramjw)
  {
    ov.d locald = paramov.a(paramsh, paramjw, this.e);
    if (paramov != locald.b)
      this.f = locald.b;
    return locald.a;
  }

  protected final jk<Object> a(ov paramov, Class<?> paramClass, jw paramjw)
  {
    ov.d locald = paramov.a(paramClass, paramjw, this.e);
    if (paramov != locald.b)
      this.f = locald.b;
    return locald.a;
  }

  public void a(jw paramjw)
  {
    if ((this.a) && (this.b != null) && (this.d == null))
      this.d = paramjw.a(this.b, this.e);
  }

  public final void a(T paramT, hf paramhf, jw paramjw)
  {
    paramhf.b();
    b(paramT, paramhf, paramjw);
    paramhf.c();
  }

  public final void a(T paramT, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.c(paramT, paramhf);
    b(paramT, paramhf, paramjw);
    paramjz.f(paramT, paramhf);
  }

  protected abstract void b(T paramT, hf paramhf, jw paramjw);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pb
 * JD-Core Version:    0.6.2
 */