package com.mopub.mobileads;

import android.content.Context;
import java.util.Map;

public abstract class CustomEventInterstitial
{
  protected abstract void loadInterstitial(Context paramContext, CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener, Map<String, Object> paramMap, Map<String, String> paramMap1);

  protected abstract void onInvalidate();

  protected abstract void showInterstitial();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.CustomEventInterstitial
 * JD-Core Version:    0.6.2
 */