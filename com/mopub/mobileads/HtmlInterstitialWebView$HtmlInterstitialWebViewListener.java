package com.mopub.mobileads;

class HtmlInterstitialWebView$HtmlInterstitialWebViewListener
  implements HtmlWebViewListener
{
  private final CustomEventInterstitial.CustomEventInterstitialListener mCustomEventInterstitialListener;

  public HtmlInterstitialWebView$HtmlInterstitialWebViewListener(CustomEventInterstitial.CustomEventInterstitialListener paramCustomEventInterstitialListener)
  {
    this.mCustomEventInterstitialListener = paramCustomEventInterstitialListener;
  }

  public void onClicked()
  {
    this.mCustomEventInterstitialListener.onInterstitialClicked();
  }

  public void onCollapsed()
  {
  }

  public void onFailed(MoPubErrorCode paramMoPubErrorCode)
  {
    this.mCustomEventInterstitialListener.onInterstitialFailed(paramMoPubErrorCode);
  }

  public void onLoaded(BaseHtmlWebView paramBaseHtmlWebView)
  {
    this.mCustomEventInterstitialListener.onInterstitialLoaded();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlInterstitialWebView.HtmlInterstitialWebViewListener
 * JD-Core Version:    0.6.2
 */