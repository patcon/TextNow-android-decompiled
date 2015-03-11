package com.google.android.gms.ads.mediation;

public abstract interface MediationBannerListener
{
  public abstract void onAdClicked(MediationBannerAdapter paramMediationBannerAdapter);

  public abstract void onAdClosed(MediationBannerAdapter paramMediationBannerAdapter);

  public abstract void onAdFailedToLoad(MediationBannerAdapter paramMediationBannerAdapter, int paramInt);

  public abstract void onAdLeftApplication(MediationBannerAdapter paramMediationBannerAdapter);

  public abstract void onAdLoaded(MediationBannerAdapter paramMediationBannerAdapter);

  public abstract void onAdOpened(MediationBannerAdapter paramMediationBannerAdapter);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.MediationBannerListener
 * JD-Core Version:    0.6.2
 */