package com.google.android.gms.ads.mediation.customevent;

import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.eu;

class CustomEventAdapter$b
  implements CustomEventInterstitialListener
{
  private final MediationInterstitialListener m;
  private final CustomEventAdapter sY;

  public CustomEventAdapter$b(CustomEventAdapter paramCustomEventAdapter1, CustomEventAdapter paramCustomEventAdapter2, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.sY = paramCustomEventAdapter2;
    this.m = paramMediationInterstitialListener;
  }

  public void onAdClicked()
  {
    eu.z("Custom event adapter called onAdClicked.");
    this.m.onAdClicked(this.sY);
  }

  public void onAdClosed()
  {
    eu.z("Custom event adapter called onAdClosed.");
    this.m.onAdClosed(this.sY);
  }

  public void onAdFailedToLoad(int paramInt)
  {
    eu.z("Custom event adapter called onFailedToReceiveAd.");
    this.m.onAdFailedToLoad(this.sY, paramInt);
  }

  public void onAdLeftApplication()
  {
    eu.z("Custom event adapter called onAdLeftApplication.");
    this.m.onAdLeftApplication(this.sY);
  }

  public void onAdLoaded()
  {
    eu.z("Custom event adapter called onReceivedAd.");
    this.m.onAdLoaded(this.sZ);
  }

  public void onAdOpened()
  {
    eu.z("Custom event adapter called onAdOpened.");
    this.m.onAdOpened(this.sY);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.ads.mediation.customevent.CustomEventAdapter.b
 * JD-Core Version:    0.6.2
 */