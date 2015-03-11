package com.flurry.sdk;

@kb
public final class py$f extends py.a<float[]>
{
  public py$f()
  {
    this(null);
  }

  public py$f(jz paramjz)
  {
    super([F.class, paramjz, null);
  }

  public final pf<?> a(jz paramjz)
  {
    return new f(paramjz);
  }

  public final void a(float[] paramArrayOfFloat, hf paramhf, jw paramjw)
  {
    int i = 0;
    int j = paramArrayOfFloat.length;
    while (i < j)
    {
      paramhf.a(paramArrayOfFloat[i]);
      i++;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.py.f
 * JD-Core Version:    0.6.2
 */