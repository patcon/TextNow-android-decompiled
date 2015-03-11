package com.flurry.sdk;

public final class sd extends sc
{
  static final sd c = new sd("", 0, 0);
  final int d;

  sd(String paramString, int paramInt1, int paramInt2)
  {
    super(paramString, paramInt1);
    this.d = paramInt2;
  }

  static final sd b()
  {
    return c;
  }

  public final boolean a(int paramInt)
  {
    return paramInt == this.d;
  }

  public final boolean a(int paramInt1, int paramInt2)
  {
    return (paramInt1 == this.d) && (paramInt2 == 0);
  }

  public final boolean a(int[] paramArrayOfInt, int paramInt)
  {
    return (paramInt == 1) && (paramArrayOfInt[0] == this.d);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sd
 * JD-Core Version:    0.6.2
 */