package com.admarvel.android.ads;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import java.lang.ref.WeakReference;

class l$a
  implements LocationListener
{
  LocationManager a;
  private boolean c = false;

  public l$a(l paraml, String paramString, LocationManager paramLocationManager)
  {
    this.a = paramLocationManager;
    l.a(paraml, paramString);
  }

  public void a()
  {
    if (!this.c)
    {
      this.a.requestLocationUpdates(l.c(this.b), 0L, 0.0F, this);
      this.c = true;
    }
  }

  public void onLocationChanged(final Location paramLocation)
  {
    if (l.a(this.b) != null);
    for (AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)l.a(this.b).get(); ; localAdMarvelInternalWebView = null)
    {
      if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.getHandler() != null) && (l.b(this.b) != null) && (paramLocation != null))
        localAdMarvelInternalWebView.getHandler().post(new Runnable()
        {
          public void run()
          {
            AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)l.a(l.a.this.b).get();
            if (l.a(l.a.this.b) != null)
              localAdMarvelInternalWebView.loadUrl("javascript:" + l.b(l.a.this.b) + "(" + paramLocation.getLatitude() + "," + paramLocation.getLongitude() + "," + paramLocation.getAccuracy() + ")");
          }
        });
      return;
    }
  }

  public void onProviderDisabled(String paramString)
  {
  }

  public void onProviderEnabled(String paramString)
  {
  }

  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.l.a
 * JD-Core Version:    0.6.2
 */