package com.enflick.android.TextNow.customloader;

import android.app.Activity;
import android.view.View;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;

public abstract interface IAmazonAds
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.banner.AmazonAdsWrapper";

  public abstract View getBannerView();

  public abstract void init(Activity paramActivity);

  public abstract void invalidate();

  public abstract void loadAd(int paramInt);

  public abstract void setListener(CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.IAmazonAds
 * JD-Core Version:    0.6.2
 */