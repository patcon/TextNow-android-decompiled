package com.flurry.sdk;

final class ov$c extends ov
{
  private final ov.f[] a;

  public ov$c(ov.f[] paramArrayOff)
  {
    this.a = paramArrayOff;
  }

  public final jk<Object> a(Class<?> paramClass)
  {
    int i = 0;
    int j = this.a.length;
    while (i < j)
    {
      ov.f localf = this.a[i];
      if (localf.a == paramClass)
        return localf.b;
      i++;
    }
    return null;
  }

  public final ov a(Class<?> paramClass, jk<Object> paramjk)
  {
    int i = this.a.length;
    if (i == 8)
      return this;
    ov.f[] arrayOff = new ov.f[i + 1];
    System.arraycopy(this.a, 0, arrayOff, 0, i);
    arrayOff[i] = new ov.f(paramClass, paramjk);
    return new c(arrayOff);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ov.c
 * JD-Core Version:    0.6.2
 */