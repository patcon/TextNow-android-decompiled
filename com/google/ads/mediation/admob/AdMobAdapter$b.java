package com.google.ads.mediation.admob;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

final class AdMobAdapter$b extends AdListener
{
  private final AdMobAdapter k;
  private final MediationInterstitialListener m;

  public AdMobAdapter$b(AdMobAdapter paramAdMobAdapter, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.k = paramAdMobAdapter;
    this.m = paramMediationInterstitialListener;
  }

  public final void onAdClosed()
  {
    this.m.onAdClosed(this.k);
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    this.m.onAdFailedToLoad(this.k, paramInt);
  }

  public final void onAdLeftApplication()
  {
    this.m.onAdLeftApplication(this.k);
  }

  public final void onAdLoaded()
  {
    this.m.onAdLoaded(this.k);
  }

  public final void onAdOpened()
  {
    this.m.onAdOpened(this.k);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.admob.AdMobAdapter.b
 * JD-Core Version:    0.6.2
 */