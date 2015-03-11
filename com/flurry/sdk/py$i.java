package com.flurry.sdk;

@kb
public final class py$i extends py.a<short[]>
{
  public py$i()
  {
    this(null);
  }

  public py$i(jz paramjz)
  {
    super([S.class, paramjz, null);
  }

  public final pf<?> a(jz paramjz)
  {
    return new i(paramjz);
  }

  public final void a(short[] paramArrayOfShort, hf paramhf, jw paramjw)
  {
    int i = 0;
    int j = paramArrayOfShort.length;
    while (i < j)
    {
      paramhf.b(paramArrayOfShort[i]);
      i++;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.py.i
 * JD-Core Version:    0.6.2
 */