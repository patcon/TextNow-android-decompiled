package com.flurry.sdk;

final class or$a extends jk<Object>
{
  protected final jz a;
  protected final jk<Object> b;

  public or$a(jz paramjz, jk<Object> paramjk)
  {
    this.a = paramjz;
    this.b = paramjk;
  }

  public final void a(Object paramObject, hf paramhf, jw paramjw)
  {
    this.b.a(paramObject, paramhf, paramjw, this.a);
  }

  public final void a(Object paramObject, hf paramhf, jw paramjw, jz paramjz)
  {
    this.b.a(paramObject, paramhf, paramjw, paramjz);
  }

  public final Class<Object> c()
  {
    return Object.class;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.or.a
 * JD-Core Version:    0.6.2
 */