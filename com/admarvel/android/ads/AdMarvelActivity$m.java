package com.admarvel.android.ads;

import android.location.Location;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$m
  implements Runnable
{
  private final WeakReference<AdMarvelInternalWebView> a;
  private final String b;
  private String c = "null";

  public AdMarvelActivity$m(AdMarvelInternalWebView paramAdMarvelInternalWebView, String paramString)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = paramString;
  }

  public void run()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    try
    {
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
      if (localAdMarvelInternalWebView == null)
        return;
      if ((!ab.d(localAdMarvelInternalWebView.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) && (!ab.d(localAdMarvelInternalWebView.getContext(), "android.permission.ACCESS_FINE_LOCATION")))
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(" + this.c + ")");
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    if (ab.c(localAdMarvelInternalWebView.getContext(), "location"))
    {
      Location localLocation = l.a().a(localAdMarvelInternalWebView);
      if (localLocation != null)
        this.c = (localLocation.getLatitude() + "," + localLocation.getLongitude() + "," + localLocation.getAccuracy());
      localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(" + this.c + ")");
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.m
 * JD-Core Version:    0.6.2
 */