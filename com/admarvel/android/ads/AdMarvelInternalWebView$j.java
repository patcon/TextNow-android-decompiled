package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelInternalWebView$j
  implements Runnable
{
  private final WeakReference<AdMarvelInternalWebView> b;
  private String c = null;

  public AdMarvelInternalWebView$j(AdMarvelInternalWebView paramAdMarvelInternalWebView1, AdMarvelInternalWebView paramAdMarvelInternalWebView2, String paramString)
  {
    this.b = new WeakReference(paramAdMarvelInternalWebView2);
    this.c = paramString;
  }

  public void run()
  {
    if (this.b == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    localAdMarvelInternalWebView.loadUrl("javascript:" + this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.j
 * JD-Core Version:    0.6.2
 */