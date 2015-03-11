package com.flurry.sdk;

public final class sg extends sc
{
  final int[] c;
  final int d;

  sg(String paramString, int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    super(paramString, paramInt1);
    if (paramInt2 < 3)
      throw new IllegalArgumentException("Qlen must >= 3");
    this.c = paramArrayOfInt;
    this.d = paramInt2;
  }

  public final boolean a(int paramInt)
  {
    return false;
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    return false;
  }

  public final boolean a(int[] paramArrayOfInt, int paramInt)
  {
    if (paramInt != this.d)
      return false;
    for (int i = 0; ; i++)
    {
      if (i >= paramInt)
        break label35;
      if (paramArrayOfInt[i] != this.c[i])
        break;
    }
    label35: return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sg
 * JD-Core Version:    0.6.2
 */