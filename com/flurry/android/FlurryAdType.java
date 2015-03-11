package com.flurry.android;

public enum FlurryAdType
{
  static
  {
    VIDEO_TAKEOVER = new FlurryAdType("VIDEO_TAKEOVER", 2);
    FlurryAdType[] arrayOfFlurryAdType = new FlurryAdType[3];
    arrayOfFlurryAdType[0] = WEB_BANNER;
    arrayOfFlurryAdType[1] = WEB_TAKEOVER;
    arrayOfFlurryAdType[2] = VIDEO_TAKEOVER;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.android.FlurryAdType
 * JD-Core Version:    0.6.2
 */