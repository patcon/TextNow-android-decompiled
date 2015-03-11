package com.flurry.sdk;

public final class se extends sc
{
  final int c;
  final int d;

  se(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    super(paramString, paramInt1);
    this.c = paramInt2;
    this.d = paramInt3;
  }

  public final boolean a(int paramInt)
  {
    return false;
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.c) && (paramInt2 == this.d);
  }

  public final boolean a(int[] paramArrayOfInt, int paramInt)
  {
    return (paramInt == 2) && (paramArrayOfInt[0] == this.c) && (paramArrayOfInt[1] == this.d);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.se
 * JD-Core Version:    0.6.2
 */