package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class AdMarvelWebView$am
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private String b = null;

  public AdMarvelWebView$am(String paramString, AdMarvelWebView paramAdMarvelWebView)
  {
    this.b = paramString;
    this.a = new WeakReference(paramAdMarvelWebView);
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    int i;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "INTERNAL");
      }
      while (localAdMarvelInternalWebView == null);
      i = localAdMarvelInternalWebView.getVisibility();
      if ((this.b.equals("show")) && (i != 0))
        localAdMarvelInternalWebView.setVisibility(0);
    }
    while ((!this.b.equals("hide")) || (i != 0));
    localAdMarvelInternalWebView.setVisibility(4);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.am
 * JD-Core Version:    0.6.2
 */