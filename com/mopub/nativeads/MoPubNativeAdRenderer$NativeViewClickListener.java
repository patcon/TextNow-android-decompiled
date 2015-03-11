package com.mopub.nativeads;

import android.view.View;
import android.view.View.OnClickListener;
import com.mopub.common.VisibleForTesting;

@VisibleForTesting
class MoPubNativeAdRenderer$NativeViewClickListener
  implements View.OnClickListener
{
  private final NativeResponse mNativeResponse;

  MoPubNativeAdRenderer$NativeViewClickListener(NativeResponse paramNativeResponse)
  {
    this.mNativeResponse = paramNativeResponse;
  }

  public void onClick(View paramView)
  {
    this.mNativeResponse.handleClick(paramView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.MoPubNativeAdRenderer.NativeViewClickListener
 * JD-Core Version:    0.6.2
 */