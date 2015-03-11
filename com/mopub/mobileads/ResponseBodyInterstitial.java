package com.mopub.mobileads;

import android.content.Context;
import java.util.Map;

abstract class ResponseBodyInterstitial extends CustomEventInterstitial
{
  protected AdConfiguration mAdConfiguration;
  long mBroadcastIdentifier;
  private EventForwardingBroadcastReceiver mBroadcastReceiver;
  protected Context mContext;

  private boolean extrasAreValid(Map<String, String> paramMap)
  {
    return paramMap.containsKey("Html-Response-Body");
  }

  protected abstract void extractExtras(Map<String, String> paramMap);

  protected void loadInterstitial(Context paramContext, CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener, Map<String, Object> paramMap, Map<String, String> paramMap1)
  {
    this.mContext = paramContext;
    if (extrasAreValid(paramMap1))
    {
      extractExtras(paramMap1);
      this.mAdConfiguration = AdConfiguration.extractFromMap(paramMap);
      if (this.mAdConfiguration != null)
        this.mBroadcastIdentifier = this.mAdConfiguration.getBroadcastIdentifier();
      this.mBroadcastReceiver = new EventForwardingBroadcastReceiver(paramCustomEventInterstitialListener, this.mBroadcastIdentifier);
      this.mBroadcastReceiver.register(paramContext);
      preRenderHtml(paramCustomEventInterstitialListener);
      return;
    }
    paramCustomEventInterstitialListener.onInterstitialFailed(MoPubErrorCode.NETWORK_INVALID_STATE);
  }

  protected void onInvalidate()
  {
    if (this.mBroadcastReceiver != null)
      this.mBroadcastReceiver.unregister();
  }

  protected abstract void preRenderHtml(CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener);

  protected abstract void showInterstitial();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.ResponseBodyInterstitial
 * JD-Core Version:    0.6.2
 */