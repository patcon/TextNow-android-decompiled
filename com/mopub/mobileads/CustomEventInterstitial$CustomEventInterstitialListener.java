package com.mopub.mobileads;

public abstract interface CustomEventInterstitial$CustomEventInterstitialListener
{
  public abstract void onInterstitialClicked();

  public abstract void onInterstitialDismissed();

  public abstract void onInterstitialFailed(MoPubErrorCode paramMoPubErrorCode);

  public abstract void onInterstitialLoaded();

  public abstract void onInterstitialShown();

  public abstract void onLeaveApplication();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.CustomEventInterstitial.CustomEventInterstitialListener
 * JD-Core Version:    0.6.2
 */