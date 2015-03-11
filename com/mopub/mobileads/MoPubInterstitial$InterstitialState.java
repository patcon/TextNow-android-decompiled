package com.mopub.mobileads;

 enum MoPubInterstitial$InterstitialState
{
  static
  {
    InterstitialState[] arrayOfInterstitialState = new InterstitialState[2];
    arrayOfInterstitialState[0] = CUSTOM_EVENT_AD_READY;
    arrayOfInterstitialState[1] = NOT_READY;
  }

  final boolean isReady()
  {
    return this != NOT_READY;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubInterstitial.InterstitialState
 * JD-Core Version:    0.6.2
 */