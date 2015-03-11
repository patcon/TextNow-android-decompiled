package com.mopub.mobileads;

 enum BaseInterstitialActivity$JavaScriptWebViewCallbacks
{
  private String mUrl;

  static
  {
    JavaScriptWebViewCallbacks[] arrayOfJavaScriptWebViewCallbacks = new JavaScriptWebViewCallbacks[2];
    arrayOfJavaScriptWebViewCallbacks[0] = WEB_VIEW_DID_APPEAR;
    arrayOfJavaScriptWebViewCallbacks[1] = WEB_VIEW_DID_CLOSE;
  }

  private BaseInterstitialActivity$JavaScriptWebViewCallbacks(String paramString)
  {
    this.mUrl = paramString;
  }

  protected final String getUrl()
  {
    return this.mUrl;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.BaseInterstitialActivity.JavaScriptWebViewCallbacks
 * JD-Core Version:    0.6.2
 */