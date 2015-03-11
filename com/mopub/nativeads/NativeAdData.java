package com.mopub.nativeads;

class NativeAdData
{
  private final MoPubAdRenderer adRenderer;
  private final NativeResponse adResponse;
  private final String adUnitId;

  NativeAdData(String paramString, MoPubAdRenderer paramMoPubAdRenderer, NativeResponse paramNativeResponse)
  {
    this.adUnitId = paramString;
    this.adRenderer = paramMoPubAdRenderer;
    this.adResponse = paramNativeResponse;
  }

  NativeResponse getAd()
  {
    return this.adResponse;
  }

  MoPubAdRenderer getAdRenderer()
  {
    return this.adRenderer;
  }

  String getAdUnitId()
  {
    return this.adUnitId;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.NativeAdData
 * JD-Core Version:    0.6.2
 */