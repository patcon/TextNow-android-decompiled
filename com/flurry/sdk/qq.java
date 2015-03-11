package com.flurry.sdk;

public abstract class qq extends sh
  implements jj
{
  volatile String c;

  protected qq(Class<?> paramClass, int paramInt, Object paramObject1, Object paramObject2)
  {
    super(paramClass, paramInt);
    this.f = paramObject1;
    this.g = paramObject2;
  }

  protected abstract String a();

  public void a(hf paramhf, jw paramjw)
  {
    paramhf.b(m());
  }

  public void a(hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.a(this, paramhf);
    a(paramhf, paramjw);
    paramjz.d(this, paramhf);
  }

  public String m()
  {
    String str = this.c;
    if (str == null)
      str = a();
    return str;
  }

  public <T> T n()
  {
    return this.f;
  }

  public <T> T o()
  {
    return this.g;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qq
 * JD-Core Version:    0.6.2
 */