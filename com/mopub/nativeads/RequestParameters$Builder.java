package com.mopub.nativeads;

import android.location.Location;
import java.util.EnumSet;

public final class RequestParameters$Builder
{
  private EnumSet<RequestParameters.NativeAdAsset> desiredAssets;
  private String keywords;
  private Location location;

  public final RequestParameters build()
  {
    return new RequestParameters(this, null);
  }

  public final Builder desiredAssets(EnumSet<RequestParameters.NativeAdAsset> paramEnumSet)
  {
    this.desiredAssets = EnumSet.copyOf(paramEnumSet);
    return this;
  }

  public final Builder keywords(String paramString)
  {
    this.keywords = paramString;
    return this;
  }

  public final Builder location(Location paramLocation)
  {
    this.location = paramLocation;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.RequestParameters.Builder
 * JD-Core Version:    0.6.2
 */