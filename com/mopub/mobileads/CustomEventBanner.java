package com.mopub.mobileads;

import android.content.Context;
import java.util.Map;

public abstract class CustomEventBanner
{
  protected abstract void loadBanner(Context paramContext, CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, Map<String, Object> paramMap, Map<String, String> paramMap1);

  protected abstract void onInvalidate();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.CustomEventBanner
 * JD-Core Version:    0.6.2
 */