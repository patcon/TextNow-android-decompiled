package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$g
  implements Runnable
{
  private final WeakReference<AdMarvelInternalWebView> a;
  private final String b;

  public AdMarvelWebView$g(AdMarvelInternalWebView paramAdMarvelInternalWebView, String paramString)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = paramString;
  }

  public void run()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null)
      return;
    if (ab.f(localAdMarvelInternalWebView.getContext()))
    {
      localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(\"YES\")");
      return;
    }
    localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(\"NO\")");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.g
 * JD-Core Version:    0.6.2
 */