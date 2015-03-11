package com.flurry.sdk;

final class ov$e extends ov
{
  private final Class<?> a;
  private final jk<Object> b;

  public ov$e(Class<?> paramClass, jk<Object> paramjk)
  {
    this.a = paramClass;
    this.b = paramjk;
  }

  public final jk<Object> a(Class<?> paramClass)
  {
    if (paramClass == this.a)
      return this.b;
    return null;
  }

  public final ov a(Class<?> paramClass, jk<Object> paramjk)
  {
    return new ov.a(this.a, this.b, paramClass, paramjk);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ov.e
 * JD-Core Version:    0.6.2
 */