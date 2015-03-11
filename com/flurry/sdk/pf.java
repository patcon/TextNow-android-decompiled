package com.flurry.sdk;

public abstract class pf<T> extends pw<T>
{
  protected pf(Class<T> paramClass)
  {
    super(paramClass);
  }

  protected pf(Class<?> paramClass, boolean paramBoolean)
  {
    super(paramClass, paramBoolean);
  }

  public abstract pf<?> a(jz paramjz);

  public pf<?> b(jz paramjz)
  {
    if (paramjz == null)
      return this;
    return a(paramjz);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pf
 * JD-Core Version:    0.6.2
 */