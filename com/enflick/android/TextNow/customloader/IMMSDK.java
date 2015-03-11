package com.enflick.android.TextNow.customloader;

import android.content.Context;
import android.view.View;
import com.mopub.mobileads.CustomEventBanner.CustomEventBannerListener;

public abstract interface IMMSDK
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.banner.MMSDKWrapper";

  public abstract void getAd();

  public abstract View getBannerView();

  public abstract void initialize(Context paramContext, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4);

  public abstract void invalidate();

  public abstract void setListener(CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.IMMSDK
 * JD-Core Version:    0.6.2
 */