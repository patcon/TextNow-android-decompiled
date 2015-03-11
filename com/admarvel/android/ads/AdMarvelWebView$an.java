package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$an
  implements Runnable
{
  private final WeakReference<AdMarvelInternalWebView> a;

  public AdMarvelWebView$an(AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null)
      return;
    localAdMarvelInternalWebView.setLayerType(1, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.an
 * JD-Core Version:    0.6.2
 */