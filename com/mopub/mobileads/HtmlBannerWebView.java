package com.mopub.mobileads;

import android.content.Context;

public class HtmlBannerWebView extends BaseHtmlWebView
{
  public static final String EXTRA_AD_CLICK_DATA = "com.mopub.intent.extra.AD_CLICK_DATA";

  public HtmlBannerWebView(Context paramContext, AdConfiguration paramAdConfiguration)
  {
    super(paramContext, paramAdConfiguration);
  }

  public void init(CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener, boolean paramBoolean, String paramString1, String paramString2)
  {
    super.init(paramBoolean);
    setWebViewClient(new HtmlWebViewClient(new HtmlBannerWebView.HtmlBannerWebViewListener(paramCustomEventBannerListener), this, paramString2, paramString1));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlBannerWebView
 * JD-Core Version:    0.6.2
 */