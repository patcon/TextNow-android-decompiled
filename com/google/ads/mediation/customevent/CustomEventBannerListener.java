package com.google.ads.mediation.customevent;

import android.view.View;

@Deprecated
public abstract interface CustomEventBannerListener extends CustomEventListener
{
  public abstract void onClick();

  public abstract void onReceivedAd(View paramView);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventBannerListener
 * JD-Core Version:    0.6.2
 */