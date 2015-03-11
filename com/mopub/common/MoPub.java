package com.mopub.common;

public class MoPub
{
  private static final int DEFAULT_LOCATION_PRECISION = 6;
  public static final String SDK_VERSION = "3.0.0";
  private static volatile MoPub.LocationAwareness sLocationLocationAwareness = MoPub.LocationAwareness.NORMAL;
  private static volatile int sLocationPrecision = 6;

  public static MoPub.LocationAwareness getLocationAwareness()
  {
    return sLocationLocationAwareness;
  }

  public static int getLocationPrecision()
  {
    return sLocationPrecision;
  }

  public static void setLocationAwareness(MoPub.LocationAwareness paramLocationAwareness)
  {
    sLocationLocationAwareness = paramLocationAwareness;
  }

  public static void setLocationPrecision(int paramInt)
  {
    sLocationPrecision = Math.min(Math.max(0, paramInt), 6);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.MoPub
 * JD-Core Version:    0.6.2
 */