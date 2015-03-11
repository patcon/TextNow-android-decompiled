package com.mopub.common;

public enum MoPub$LocationAwareness
{
  static
  {
    DISABLED = new LocationAwareness("DISABLED", 2);
    LocationAwareness[] arrayOfLocationAwareness = new LocationAwareness[3];
    arrayOfLocationAwareness[0] = NORMAL;
    arrayOfLocationAwareness[1] = TRUNCATED;
    arrayOfLocationAwareness[2] = DISABLED;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.MoPub.LocationAwareness
 * JD-Core Version:    0.6.2
 */