package com.mopub.nativeads;

import android.os.Handler;

class ClientPositioningSource
  implements PositioningSource
{
  private Handler mHandler = new Handler();
  private final MoPubNativeAdPositioning.MoPubClientPositioning mPositioning;

  ClientPositioningSource(MoPubNativeAdPositioning.MoPubClientPositioning paramMoPubClientPositioning)
  {
    this.mPositioning = MoPubNativeAdPositioning.clone(paramMoPubClientPositioning);
  }

  public void loadPositions(String paramString, final PositioningSource.PositioningListener paramPositioningListener)
  {
    this.mHandler.post(new Runnable()
    {
      public void run()
      {
        paramPositioningListener.onLoad(ClientPositioningSource.this.mPositioning);
      }
    });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.ClientPositioningSource
 * JD-Core Version:    0.6.2
 */