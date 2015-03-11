package com.mopub.nativeads;

import com.mopub.common.GpsHelper.GpsHelperListener;

class MoPubNative$NativeGpsHelperListener
  implements GpsHelper.GpsHelperListener
{
  private final RequestParameters mRequestParameters;

  MoPubNative$NativeGpsHelperListener(MoPubNative paramMoPubNative, RequestParameters paramRequestParameters)
  {
    this.mRequestParameters = paramRequestParameters;
  }

  public void onFetchAdInfoCompleted()
  {
    this.this$0.loadNativeAd(this.mRequestParameters);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubNative.NativeGpsHelperListener
 * JD-Core Version:    0.6.2
 */