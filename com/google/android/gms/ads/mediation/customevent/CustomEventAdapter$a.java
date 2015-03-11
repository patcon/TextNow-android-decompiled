package com.google.android.gms.ads.mediation.customevent;

import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.gs;

final class CustomEventAdapter$a
  implements CustomEventBannerListener
{
  private final MediationBannerListener l;
  private final CustomEventAdapter xh;

  public CustomEventAdapter$a(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.xh = paramCustomEventAdapter;
    this.l = paramMediationBannerListener;
  }

  public final void onAdClicked()
  {
    gs.S("Custom event adapter called onAdClicked.");
    this.l.onAdClicked(this.xh);
  }

  public final void onAdClosed()
  {
    gs.S("Custom event adapter called onAdClosed.");
    this.l.onAdClosed(this.xh);
  }

  public final void onAdFailedToLoad(int paramInt)
  {
    gs.S("Custom event adapter called onAdFailedToLoad.");
    this.l.onAdFailedToLoad(this.xh, paramInt);
  }

  public final void onAdLeftApplication()
  {
    gs.S("Custom event adapter called onAdLeftApplication.");
    this.l.onAdLeftApplication(this.xh);
  }

  public final void onAdLoaded(View paramView)
  {
    gs.S("Custom event adapter called onAdLoaded.");
    CustomEventAdapter.a(this.xh, paramView);
    this.l.onAdLoaded(this.xh);
  }

  public final void onAdOpened()
  {
    gs.S("Custom event adapter called onAdOpened.");
    this.l.onAdOpened(this.xh);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.a
 * JD-Core Version:    0.6.2
 */