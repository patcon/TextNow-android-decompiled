package com.mopub.mobileads;

import android.net.Uri;
import java.util.Map;

class MraidInterstitial extends ResponseBodyInterstitial
{
  private String mHtmlData;

  protected void extractExtras(Map<String, String> paramMap)
  {
    this.mHtmlData = Uri.decode((String)paramMap.get("Html-Response-Body"));
  }

  protected void preRenderHtml(CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener)
  {
    MraidActivity.preRenderHtml(this.mContext, paramCustomEventInterstitialListener, this.mHtmlData);
  }

  protected void showInterstitial()
  {
    MraidActivity.start(this.mContext, this.mHtmlData, this.mAdConfiguration);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.MraidInterstitial
 * JD-Core Version:    0.6.2
 */