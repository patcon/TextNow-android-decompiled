package com.enflick.android.TextNow.customloader;

import android.content.Context;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;

public abstract interface ISmaato
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.banner.SmaatoWrapper";

  public abstract void fetchAd(Context paramContext, int paramInt1, int paramInt2, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.ISmaato
 * JD-Core Version:    0.6.2
 */