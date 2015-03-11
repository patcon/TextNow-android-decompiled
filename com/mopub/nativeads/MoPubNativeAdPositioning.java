package com.mopub.nativeads;

import java.util.ArrayList;

public final class MoPubNativeAdPositioning
{
  public static MoPubNativeAdPositioning.MoPubClientPositioning clientPositioning()
  {
    return new MoPubNativeAdPositioning.MoPubClientPositioning();
  }

  static MoPubNativeAdPositioning.MoPubClientPositioning clone(MoPubNativeAdPositioning.MoPubClientPositioning paramMoPubClientPositioning)
  {
    MoPubNativeAdPositioning.MoPubClientPositioning localMoPubClientPositioning = new MoPubNativeAdPositioning.MoPubClientPositioning();
    MoPubNativeAdPositioning.MoPubClientPositioning.access$000(localMoPubClientPositioning).addAll(MoPubNativeAdPositioning.MoPubClientPositioning.access$000(paramMoPubClientPositioning));
    MoPubNativeAdPositioning.MoPubClientPositioning.access$102(localMoPubClientPositioning, MoPubNativeAdPositioning.MoPubClientPositioning.access$100(paramMoPubClientPositioning));
    return localMoPubClientPositioning;
  }

  @Deprecated
  public static MoPubNativeAdPositioning.Builder newBuilder()
  {
    return new MoPubNativeAdPositioning.Builder();
  }

  public static MoPubNativeAdPositioning.MoPubServerPositioning serverPositioning()
  {
    return new MoPubNativeAdPositioning.MoPubServerPositioning();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubNativeAdPositioning
 * JD-Core Version:    0.6.2
 */