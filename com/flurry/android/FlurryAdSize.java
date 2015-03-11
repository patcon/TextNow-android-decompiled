package com.flurry.android;

public enum FlurryAdSize
{
  private int a;

  static
  {
    BANNER_BOTTOM = new FlurryAdSize("BANNER_BOTTOM", 1, 2);
    FULLSCREEN = new FlurryAdSize("FULLSCREEN", 2, 3);
    FlurryAdSize[] arrayOfFlurryAdSize = new FlurryAdSize[3];
    arrayOfFlurryAdSize[0] = BANNER_TOP;
    arrayOfFlurryAdSize[1] = BANNER_BOTTOM;
    arrayOfFlurryAdSize[2] = FULLSCREEN;
  }

  private FlurryAdSize(int paramInt)
  {
    this.a = paramInt;
  }

  public final int getValue()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.FlurryAdSize
 * JD-Core Version:    0.6.2
 */