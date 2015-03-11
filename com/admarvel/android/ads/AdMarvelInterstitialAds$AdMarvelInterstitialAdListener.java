package com.admarvel.android.ads;

public abstract interface AdMarvelInterstitialAds$AdMarvelInterstitialAdListener
{
  public abstract void onAdMarvelVideoActivityLaunched(AdMarvelVideoActivity paramAdMarvelVideoActivity);

  public abstract void onAdmarvelActivityLaunched(AdMarvelActivity paramAdMarvelActivity);

  public abstract void onClickInterstitialAd(String paramString);

  public abstract void onCloseInterstitialAd();

  public abstract void onFailedToReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork paramSDKAdNetwork, String paramString, int paramInt, AdMarvelUtils.ErrorReason paramErrorReason);

  public abstract void onReceiveInterstitialAd(AdMarvelUtils.SDKAdNetwork paramSDKAdNetwork, String paramString, AdMarvelAd paramAdMarvelAd);

  public abstract void onRequestInterstitialAd();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInterstitialAds.AdMarvelInterstitialAdListener
 * JD-Core Version:    0.6.2
 */