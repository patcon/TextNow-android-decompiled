package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.AdRequest.ErrorCode;
import com.google.ads.mediation.MediationBannerListener;
import com.google.android.gms.internal.gs;

final class CustomEventAdapter$a
  implements CustomEventBannerListener
{
  private final CustomEventAdapter q;
  private final MediationBannerListener r;

  public CustomEventAdapter$a(CustomEventAdapter paramCustomEventAdapter, MediationBannerListener paramMediationBannerListener)
  {
    this.q = paramCustomEventAdapter;
    this.r = paramMediationBannerListener;
  }

  public final void onClick()
  {
    gs.S("Custom event adapter called onFailedToReceiveAd.");
    this.r.onClick(this.q);
  }

  public final void onDismissScreen()
  {
    gs.S("Custom event adapter called onFailedToReceiveAd.");
    this.r.onDismissScreen(this.q);
  }

  public final void onFailedToReceiveAd()
  {
    gs.S("Custom event adapter called onFailedToReceiveAd.");
    this.r.onFailedToReceiveAd(this.q, AdRequest.ErrorCode.NO_FILL);
  }

  public final void onLeaveApplication()
  {
    gs.S("Custom event adapter called onFailedToReceiveAd.");
    this.r.onLeaveApplication(this.q);
  }

  public final void onPresentScreen()
  {
    gs.S("Custom event adapter called onFailedToReceiveAd.");
    this.r.onPresentScreen(this.q);
  }

  public final void onReceivedAd(View paramView)
  {
    gs.S("Custom event adapter called onReceivedAd.");
    CustomEventAdapter.a(this.q, paramView);
    this.r.onReceivedAd(this.q);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventAdapter.a
 * JD-Core Version:    0.6.2
 */