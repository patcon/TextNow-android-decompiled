package com.flurry.sdk;

@kb
public final class py$d extends pw<char[]>
{
  public py$d()
  {
    super([C.class);
  }

  private final void a(hf paramhf, char[] paramArrayOfChar)
  {
    int i = 0;
    int j = paramArrayOfChar.length;
    while (i < j)
    {
      paramhf.a(paramArrayOfChar, i, 1);
      i++;
    }
  }

  public final void a(char[] paramArrayOfChar, hf paramhf, jw paramjw)
  {
    if (paramjw.a(ju.a.s))
    {
      paramhf.b();
      a(paramhf, paramArrayOfChar);
      paramhf.c();
      return;
    }
    paramhf.a(paramArrayOfChar, 0, paramArrayOfChar.length);
  }

  public final void a(char[] paramArrayOfChar, hf paramhf, jw paramjw, jz paramjz)
  {
    if (paramjw.a(ju.a.s))
    {
      paramjz.c(paramArrayOfChar, paramhf);
      a(paramhf, paramArrayOfChar);
      paramjz.f(paramArrayOfChar, paramhf);
      return;
    }
    paramjz.a(paramArrayOfChar, paramhf);
    paramhf.a(paramArrayOfChar, 0, paramArrayOfChar.length);
    paramjz.d(paramArrayOfChar, paramhf);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.py.d
 * JD-Core Version:    0.6.2
 */