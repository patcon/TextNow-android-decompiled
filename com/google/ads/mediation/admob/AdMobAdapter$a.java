package com.google.ads.mediation.admob;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.mediation.MediationBannerListener;

final class AdMobAdapter$a extends AdListener
{
  private final AdMobAdapter k;
  private final MediationBannerListener l;

  public AdMobAdapter$a(AdMobAdapter paramAdMobAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.k = paramAdMobAdapter;
    this.l = paramMediationBannerListener;
  }

  public final void onAdClosed()
  {
    this.l.onAdClosed(this.k);
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    this.l.onAdFailedToLoad(this.k, paramInt);
  }

  public final void onAdLeftApplication()
  {
    this.l.onAdLeftApplication(this.k);
  }

  public final void onAdLoaded()
  {
    this.l.onAdLoaded(this.k);
  }

  public final void onAdOpened()
  {
    this.l.onAdClicked(this.k);
    this.l.onAdOpened(this.k);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.admob.AdMobAdapter.a
 * JD-Core Version:    0.6.2
 */