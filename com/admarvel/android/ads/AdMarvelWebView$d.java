package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$d
  implements g, o
{
  private final WeakReference<AdMarvelWebView> a;

  public AdMarvelWebView$d(AdMarvelWebView paramAdMarvelWebView)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
  }

  public void a()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "INTERNAL");
      }
      while (localAdMarvelInternalWebView == null);
      AdMarvelWebView.f(localAdMarvelWebView, false);
      AdMarvelWebView.g(localAdMarvelWebView, false);
      if (AdMarvelWebView.a(localAdMarvelWebView.e) != null)
        AdMarvelWebView.a(localAdMarvelWebView.e).b();
    }
    while (localAdMarvelWebView.c == null);
    localAdMarvelInternalWebView.loadUrl("javascript:" + localAdMarvelWebView.c + "()");
  }

  public void a(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)localAdMarvelWebView.findViewWithTag(paramString + "INTERNAL");
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.mInAppBrowserCloseCallback == null) || (localAdMarvelInternalWebView.mInAppBrowserCloseCallback.length() <= 0));
    localAdMarvelInternalWebView.loadUrl("javascript:" + localAdMarvelInternalWebView.mInAppBrowserCloseCallback + "()");
  }

  public void b()
  {
    this.a.clear();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.d
 * JD-Core Version:    0.6.2
 */