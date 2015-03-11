package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.gs;

class CustomEventAdapter$b
  implements CustomEventInterstitialListener
{
  private final MediationInterstitialListener m;
  private final CustomEventAdapter xh;

  public CustomEventAdapter$b(CustomEventAdapter paramCustomEventAdapter1, CustomEventAdapter paramCustomEventAdapter2, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.xh = paramCustomEventAdapter2;
    this.m = paramMediationInterstitialListener;
  }

  public void onAdClicked()
  {
    gs.S("Custom event adapter called onAdClicked.");
    this.m.onAdClicked(this.xh);
  }

  public void onAdClosed()
  {
    gs.S("Custom event adapter called onAdClosed.");
    this.m.onAdClosed(this.xh);
  }

  public void onAdFailedToLoad(int paramInt)
  {
    gs.S("Custom event adapter called onFailedToReceiveAd.");
    this.m.onAdFailedToLoad(this.xh, paramInt);
  }

  public void onAdLeftApplication()
  {
    gs.S("Custom event adapter called onAdLeftApplication.");
    this.m.onAdLeftApplication(this.xh);
  }

  public void onAdLoaded()
  {
    gs.S("Custom event adapter called onReceivedAd.");
    this.m.onAdLoaded(this.xi);
  }

  public void onAdOpened()
  {
    gs.S("Custom event adapter called onAdOpened.");
    this.m.onAdOpened(this.xh);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.b
 * JD-Core Version:    0.6.2
 */