package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.eu;

final class CustomEventAdapter$a
  implements CustomEventBannerListener
{
  private final MediationBannerListener l;
  private final CustomEventAdapter sY;

  public CustomEventAdapter$a(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.sY = paramCustomEventAdapter;
    this.l = paramMediationBannerListener;
  }

  public final void onAdClicked()
  {
    eu.z("Custom event adapter called onAdClicked.");
    this.l.onAdClicked(this.sY);
  }

  public final void onAdClosed()
  {
    eu.z("Custom event adapter called onAdClosed.");
    this.l.onAdClosed(this.sY);
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    eu.z("Custom event adapter called onAdFailedToLoad.");
    this.l.onAdFailedToLoad(this.sY, paramInt);
  }

  public final void onAdLeftApplication()
  {
    eu.z("Custom event adapter called onAdLeftApplication.");
    this.l.onAdLeftApplication(this.sY);
  }

  public final void onAdLoaded(View paramView)
  {
    eu.z("Custom event adapter called onAdLoaded.");
    CustomEventAdapter.a(this.sY, paramView);
    this.l.onAdLoaded(this.sY);
  }

  public final void onAdOpened()
  {
    eu.z("Custom event adapter called onAdOpened.");
    this.l.onAdOpened(this.sY);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.a
 * JD-Core Version:    0.6.2
 */