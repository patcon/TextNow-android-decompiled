package com.flurry.sdk;

public abstract class ov
{
  public static ov a()
  {
    return ov.b.a;
  }

  public abstract jk<Object> a(Class<?> paramClass);

  public final ov.d a(sh paramsh, jw paramjw, is paramis)
  {
    jk localjk = paramjw.a(paramsh, paramis);
    return new ov.d(localjk, a(paramsh.p(), localjk));
  }

  public final ov.d a(Class<?> paramClass, jw paramjw, is paramis)
  {
    jk localjk = paramjw.a(paramClass, paramis);
    return new ov.d(localjk, a(paramClass, localjk));
  }

  public abstract ov a(Class<?> paramClass, jk<Object> paramjk);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ov
 * JD-Core Version:    0.6.2
 */