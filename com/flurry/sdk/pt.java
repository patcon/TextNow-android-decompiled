package com.flurry.sdk;

public abstract class pt<T> extends pw<T>
{
  protected pt(Class<T> paramClass)
  {
    super(paramClass);
  }

  protected pt(Class<?> paramClass, boolean paramBoolean)
  {
    super(paramClass);
  }

  public void a(T paramT, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.a(paramT, paramhf);
    a(paramT, paramhf, paramjw);
    paramjz.d(paramT, paramhf);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.pt
 * JD-Core Version:    0.6.2
 */