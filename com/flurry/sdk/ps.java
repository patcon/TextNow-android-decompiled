package com.flurry.sdk;

@kb
public class ps<T> extends pw<T>
{
  public ps(Class<?> paramClass)
  {
    super(paramClass, false);
  }

  public void a(T paramT, hf paramhf, jw paramjw)
  {
    paramhf.d(paramT.toString());
  }

  public void a(T paramT, hf paramhf, jw paramjw, jz paramjz)
  {
    paramjz.a(paramT, paramhf);
    a(paramT, paramhf, paramjw);
    paramjz.d(paramT, paramhf);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ps
 * JD-Core Version:    0.6.2
 */