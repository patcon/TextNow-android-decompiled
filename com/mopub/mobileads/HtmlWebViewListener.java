package com.mopub.mobileads;

public abstract interface HtmlWebViewListener
{
  public abstract void onClicked();

  public abstract void onCollapsed();

  public abstract void onFailed(MoPubErrorCode paramMoPubErrorCode);

  public abstract void onLoaded(BaseHtmlWebView paramBaseHtmlWebView);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.HtmlWebViewListener
 * JD-Core Version:    0.6.2
 */