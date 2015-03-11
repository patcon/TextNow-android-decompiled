package com.flurry.sdk;

public enum ay
{
  private final int e;

  static
  {
    ay[] arrayOfay = new ay[4];
    arrayOfay[0] = a;
    arrayOfay[1] = b;
    arrayOfay[2] = c;
    arrayOfay[3] = d;
  }

  private ay(int paramInt)
  {
    this.e = paramInt;
  }

  public static ay a(int paramInt)
  {
    switch (paramInt)
    {
    default:
      return null;
    case 0:
      return a;
    case 1:
      return b;
    case 2:
      return c;
    case 3:
    }
    return d;
  }

  public final int a()
  {
    return this.e;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ay
 * JD-Core Version:    0.6.2
 */