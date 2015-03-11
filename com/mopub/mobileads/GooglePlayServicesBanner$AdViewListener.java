package com.mopub.mobileads;

import com.google.android.gms.ads.AdListener;

class GooglePlayServicesBanner$AdViewListener extends AdListener
{
  private GooglePlayServicesBanner$AdViewListener(GooglePlayServicesBanner paramGooglePlayServicesBanner)
  {
  }

  public void onAdClosed()
  {
  }

  public void onAdFailedToLoad(int paramInt)
  {
    if (GooglePlayServicesBanner.access$100(this.this$0) != null)
      GooglePlayServicesBanner.access$100(this.this$0).onBannerFailed(MoPubErrorCode.NETWORK_NO_FILL);
  }

  public void onAdLeftApplication()
  {
  }

  public void onAdLoaded()
  {
    if (GooglePlayServicesBanner.access$100(this.this$0) != null)
      GooglePlayServicesBanner.access$100(this.this$0).onBannerLoaded(GooglePlayServicesBanner.access$200(this.this$0));
  }

  public void onAdOpened()
  {
    if (GooglePlayServicesBanner.access$100(this.this$0) != null)
      GooglePlayServicesBanner.access$100(this.this$0).onBannerClicked();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.GooglePlayServicesBanner.AdViewListener
 * JD-Core Version:    0.6.2
 */