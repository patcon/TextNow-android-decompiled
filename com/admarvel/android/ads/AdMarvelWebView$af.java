package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$af
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;

  public AdMarvelWebView$af(AdMarvelWebView paramAdMarvelWebView)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
    if (localAdMarvelWebView == null)
      return;
    localAdMarvelWebView.setBackgroundColor(localAdMarvelWebView.b);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.af
 * JD-Core Version:    0.6.2
 */