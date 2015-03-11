package com.mopub.mobileads;

class HtmlBannerWebView$HtmlBannerWebViewListener
  implements HtmlWebViewListener
{
  private final CustomEventBanner.CustomEventBannerListener mCustomEventBannerListener;

  public HtmlBannerWebView$HtmlBannerWebViewListener(CustomEventBanner.CustomEventBannerListener paramCustomEventBannerListener)
  {
    this.mCustomEventBannerListener = paramCustomEventBannerListener;
  }

  public void onClicked()
  {
    this.mCustomEventBannerListener.onBannerClicked();
  }

  public void onCollapsed()
  {
    this.mCustomEventBannerListener.onBannerCollapsed();
  }

  public void onFailed(MoPubErrorCode paramMoPubErrorCode)
  {
    this.mCustomEventBannerListener.onBannerFailed(paramMoPubErrorCode);
  }

  public void onLoaded(BaseHtmlWebView paramBaseHtmlWebView)
  {
    this.mCustomEventBannerListener.onBannerLoaded(paramBaseHtmlWebView);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlBannerWebView.HtmlBannerWebViewListener
 * JD-Core Version:    0.6.2
 */