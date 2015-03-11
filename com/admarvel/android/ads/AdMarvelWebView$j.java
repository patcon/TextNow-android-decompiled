package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$j
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;

  public AdMarvelWebView$j(AdMarvelWebView paramAdMarvelWebView)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
    if (localAdMarvelWebView != null)
      localAdMarvelWebView.d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.j
 * JD-Core Version:    0.6.2
 */