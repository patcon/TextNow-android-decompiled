package com.flurry.sdk;

@kb
public final class py$h extends py.a<long[]>
{
  public py$h()
  {
    this(null);
  }

  public py$h(jz paramjz)
  {
    super([J.class, paramjz, null);
  }

  public final pf<?> a(jz paramjz)
  {
    return new h(paramjz);
  }

  public final void a(long[] paramArrayOfLong, hf paramhf, jw paramjw)
  {
    int i = 0;
    int j = paramArrayOfLong.length;
    while (i < j)
    {
      paramhf.a(paramArrayOfLong[i]);
      i++;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.py.h
 * JD-Core Version:    0.6.2
 */