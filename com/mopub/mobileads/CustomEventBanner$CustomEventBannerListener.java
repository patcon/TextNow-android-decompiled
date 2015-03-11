package com.mopub.mobileads;

import android.view.View;

public abstract interface CustomEventBanner$CustomEventBannerListener
{
  public abstract void onBannerClicked();

  public abstract void onBannerCollapsed();

  public abstract void onBannerExpanded();

  public abstract void onBannerFailed(MoPubErrorCode paramMoPubErrorCode);

  public abstract void onBannerLoaded(View paramView);

  public abstract void onLeaveApplication();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener
 * JD-Core Version:    0.6.2
 */