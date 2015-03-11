package com.mopub.nativeads;

import android.location.Location;
import android.text.TextUtils;
import java.util.EnumSet;

public final class RequestParameters
{
  private final EnumSet<RequestParameters.NativeAdAsset> mDesiredAssets;
  private final String mKeywords;
  private final Location mLocation;

  private RequestParameters(RequestParameters.Builder paramBuilder)
  {
    this.mKeywords = RequestParameters.Builder.access$100(paramBuilder);
    this.mLocation = RequestParameters.Builder.access$200(paramBuilder);
    this.mDesiredAssets = RequestParameters.Builder.access$300(paramBuilder);
  }

  public final String getDesiredAssets()
  {
    String str = "";
    if (this.mDesiredAssets != null)
      str = TextUtils.join(",", this.mDesiredAssets.toArray());
    return str;
  }

  public final String getKeywords()
  {
    return this.mKeywords;
  }

  public final Location getLocation()
  {
    return this.mLocation;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.RequestParameters
 * JD-Core Version:    0.6.2
 */