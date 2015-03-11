package com.admarvel.android.ads;

import com.admarvel.android.b.a;
import java.lang.ref.WeakReference;

class AdMarvelWebView$r
  implements Runnable
{
  private final WeakReference<AdMarvelInternalWebView> a;
  private final WeakReference<AdMarvelWebView> b;
  private final String c;

  public AdMarvelWebView$r(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelWebView paramAdMarvelWebView, String paramString)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = new WeakReference(paramAdMarvelWebView);
    this.c = paramString;
  }

  public void run()
  {
    if ((AdMarvelInternalWebView)this.a.get() == null);
    AdMarvelWebView localAdMarvelWebView;
    do
    {
      return;
      localAdMarvelWebView = (AdMarvelWebView)this.b.get();
    }
    while ((localAdMarvelWebView == null) || (this.c == null) || (this.c.length() == 0));
    if (AdMarvelView.b)
    {
      new a().a(this.c, localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView));
      return;
    }
    new ab(localAdMarvelWebView.getContext(), AdMarvelWebView.d(localAdMarvelWebView)).a(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.r
 * JD-Core Version:    0.6.2
 */