package com.admarvel.android.ads;

public enum AdMarvelAd$AdType
{
  static
  {
    IMAGE = new AdType("IMAGE", 1);
    JAVASCRIPT = new AdType("JAVASCRIPT", 2);
    SDKCALL = new AdType("SDKCALL", 3);
    ERROR = new AdType("ERROR", 4);
    CUSTOM = new AdType("CUSTOM", 5);
    AdType[] arrayOfAdType = new AdType[6];
    arrayOfAdType[0] = TEXT;
    arrayOfAdType[1] = IMAGE;
    arrayOfAdType[2] = JAVASCRIPT;
    arrayOfAdType[3] = SDKCALL;
    arrayOfAdType[4] = ERROR;
    arrayOfAdType[5] = CUSTOM;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelAd.AdType
 * JD-Core Version:    0.6.2
 */