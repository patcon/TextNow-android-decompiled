package com.mopub.common;

public enum LocationService$LocationAwareness
{
  static
  {
    DISABLED = new LocationAwareness("DISABLED", 2);
    LocationAwareness[] arrayOfLocationAwareness = new LocationAwareness[3];
    arrayOfLocationAwareness[0] = NORMAL;
    arrayOfLocationAwareness[1] = TRUNCATED;
    arrayOfLocationAwareness[2] = DISABLED;
  }

  @Deprecated
  public static LocationAwareness fromMoPubLocationAwareness(MoPub.LocationAwareness paramLocationAwareness)
  {
    if (paramLocationAwareness == MoPub.LocationAwareness.DISABLED)
      return DISABLED;
    if (paramLocationAwareness == MoPub.LocationAwareness.TRUNCATED)
      return TRUNCATED;
    return NORMAL;
  }

  @Deprecated
  public final MoPub.LocationAwareness getNewLocationAwareness()
  {
    if (this == TRUNCATED)
      return MoPub.LocationAwareness.TRUNCATED;
    if (this == DISABLED)
      return MoPub.LocationAwareness.DISABLED;
    return MoPub.LocationAwareness.NORMAL;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.LocationService.LocationAwareness
 * JD-Core Version:    0.6.2
 */