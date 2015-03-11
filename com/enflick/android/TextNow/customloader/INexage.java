package com.enflick.android.TextNow.customloader;

import android.content.Context;
import android.location.Location;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;

public abstract interface INexage
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.banner.NexageWrapper";

  public abstract void fetchAds(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener);

  public abstract void init(int paramInt1, int paramInt2);

  public abstract void initLocation(Location paramLocation);

  public abstract void invalidate();

  public abstract void pauseNexageSDK();

  public abstract void resumeNexageSDK();

  public abstract void setIsMediation(boolean paramBoolean);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.INexage
 * JD-Core Version:    0.6.2
 */