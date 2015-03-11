package com.mopub.mobileads;

import android.net.Uri;
import java.util.Map;

public class HtmlInterstitial extends ResponseBodyInterstitial
{
  private String mClickthroughUrl;
  private String mHtmlData;
  private boolean mIsScrollable;
  private String mRedirectUrl;

  protected void extractExtras(Map<String, String> paramMap)
  {
    this.mHtmlData = Uri.decode((String)paramMap.get("Html-Response-Body"));
    this.mIsScrollable = Boolean.valueOf((String)paramMap.get("Scrollable")).booleanValue();
    this.mRedirectUrl = ((String)paramMap.get("Redirect-Url"));
    this.mClickthroughUrl = ((String)paramMap.get("Clickthrough-Url"));
  }

  protected void preRenderHtml(CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener)
  {
    MoPubActivity.preRenderHtml(this.mContext, paramCustomEventInterstitialListener, this.mHtmlData);
  }

  protected void showInterstitial()
  {
    MoPubActivity.start(this.mContext, this.mHtmlData, this.mIsScrollable, this.mRedirectUrl, this.mClickthroughUrl, this.mAdConfiguration);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlInterstitial
 * JD-Core Version:    0.6.2
 */