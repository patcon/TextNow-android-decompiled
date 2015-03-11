package com.flurry.sdk;

final class oo$b extends oi
{
  protected final oi p;
  protected final Class<?> q;

  protected oo$b(oi paramoi, Class<?> paramClass)
  {
    super(paramoi);
    this.p = paramoi;
    this.q = paramClass;
  }

  public final oi a(jk<Object> paramjk)
  {
    return new b(this.p.a(paramjk), this.q);
  }

  public final void a(Object paramObject, hf paramhf, jw paramjw)
  {
    Class localClass = paramjw.a();
    if ((localClass == null) || (this.q.isAssignableFrom(localClass)))
      this.p.a(paramObject, paramhf, paramjw);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.oo.b
 * JD-Core Version:    0.6.2
 */