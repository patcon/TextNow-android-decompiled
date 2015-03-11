package com.mopub.mobileads;

public abstract interface MoPubInterstitial$InterstitialAdListener
{
  public abstract void onInterstitialClicked(MoPubInterstitial paramMoPubInterstitial);

  public abstract void onInterstitialDismissed(MoPubInterstitial paramMoPubInterstitial);

  public abstract void onInterstitialFailed(MoPubInterstitial paramMoPubInterstitial, MoPubErrorCode paramMoPubErrorCode);

  public abstract void onInterstitialLoaded(MoPubInterstitial paramMoPubInterstitial);

  public abstract void onInterstitialShown(MoPubInterstitial paramMoPubInterstitial);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MoPubInterstitial.InterstitialAdListener
 * JD-Core Version:    0.6.2
 */