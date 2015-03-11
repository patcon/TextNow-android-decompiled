package com.google.ads.mediation.customevent;

import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.internal.eu;

class CustomEventAdapter$b
  implements CustomEventInterstitialListener
{
  private final CustomEventAdapter q;
  private final MediationInterstitialListener s;

  public CustomEventAdapter$b(CustomEventAdapter paramCustomEventAdapter1, CustomEventAdapter paramCustomEventAdapter2, MediationInterstitialListener paramMediationInterstitialListener)
  {
    this.q = paramCustomEventAdapter2;
    this.s = paramMediationInterstitialListener;
  }

  public void onDismissScreen()
  {
    eu.z("Custom event adapter called onDismissScreen.");
    this.s.onDismissScreen(this.q);
  }

  public void onFailedToReceiveAd()
  {
    eu.z("Custom event adapter called onFailedToReceiveAd.");
    this.s.onFailedToReceiveAd(this.q, AdRequest.ErrorCode.NO_FILL);
  }

  public void onLeaveApplication()
  {
    eu.z("Custom event adapter called onLeaveApplication.");
    this.s.onLeaveApplication(this.q);
  }

  public void onPresentScreen()
  {
    eu.z("Custom event adapter called onPresentScreen.");
    this.s.onPresentScreen(this.q);
  }

  public void onReceivedAd()
  {
    eu.z("Custom event adapter called onReceivedAd.");
    this.s.onReceivedAd(this.t);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventAdapter.b
 * JD-Core Version:    0.6.2
 */