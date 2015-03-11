package com.admarvel.android.ads;

import android.location.Location;
import java.lang.ref.WeakReference;

class AdMarvelWebView$s
  implements Runnable
{
  private final WeakReference<AdMarvelInternalWebView> a;
  private final String b;
  private String c = "null";

  public AdMarvelWebView$s(AdMarvelInternalWebView paramAdMarvelInternalWebView, String paramString)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = paramString;
  }

  public void run()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null);
    do
    {
      return;
      if ((!ab.d(localAdMarvelInternalWebView.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) && (!ab.d(localAdMarvelInternalWebView.getContext(), "android.permission.ACCESS_FINE_LOCATION")))
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(" + this.c + ")");
        return;
      }
    }
    while (!ab.c(localAdMarvelInternalWebView.getContext(), "location"));
    Location localLocation = l.a().a(localAdMarvelInternalWebView);
    if (localLocation != null)
      this.c = (localLocation.getLatitude() + "," + localLocation.getLongitude() + "," + localLocation.getAccuracy());
    localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(" + this.c + ")");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.s
 * JD-Core Version:    0.6.2
 */