package com.flurry.sdk;

public abstract class py$a<T> extends pf<T>
{
  protected final jz e;
  protected final is f;

  protected py$a(Class<T> paramClass, jz paramjz, is paramis)
  {
    super(paramClass);
    this.e = paramjz;
    this.f = paramis;
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
 * Qualified Name:     com.flurry.sdk.py.a
 * JD-Core Version:    0.6.2
 */