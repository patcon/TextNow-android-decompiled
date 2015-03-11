package com.flurry.sdk;

final class ov$a extends ov
{
  private final Class<?> a;
  private final Class<?> b;
  private final jk<Object> c;
  private final jk<Object> d;

  public ov$a(Class<?> paramClass1, jk<Object> paramjk1, Class<?> paramClass2, jk<Object> paramjk2)
  {
    this.a = paramClass1;
    this.c = paramjk1;
    this.b = paramClass2;
    this.d = paramjk2;
  }

  public final jk<Object> a(Class<?> paramClass)
  {
    if (paramClass == this.a)
      return this.c;
    if (paramClass == this.b)
      return this.d;
    return null;
  }

  public final ov a(Class<?> paramClass, jk<Object> paramjk)
  {
    ov.f[] arrayOff = new ov.f[2];
    arrayOff[0] = new ov.f(this.a, this.c);
    arrayOff[1] = new ov.f(this.b, this.d);
    return new ov.c(arrayOff);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ov.a
 * JD-Core Version:    0.6.2
 */