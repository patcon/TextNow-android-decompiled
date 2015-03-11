package com.flurry.sdk;

final class oo$a extends oi
{
  protected final oi p;
  protected final Class<?>[] q;

  protected oo$a(oi paramoi, Class<?>[] paramArrayOfClass)
  {
    super(paramoi);
    this.p = paramoi;
    this.q = paramArrayOfClass;
  }

  public final oi a(jk<Object> paramjk)
  {
    return new a(this.p.a(paramjk), this.q);
  }

  public final void a(Object paramObject, hf paramhf, jw paramjw)
  {
    Class localClass = paramjw.a();
    if (localClass != null)
    {
      int i = 0;
      int j = this.q.length;
      while ((i < j) && (!this.q[i].isAssignableFrom(localClass)))
        i++;
      if (i == j)
        return;
    }
    this.p.a(paramObject, paramhf, paramjw);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.oo.a
 * JD-Core Version:    0.6.2
 */