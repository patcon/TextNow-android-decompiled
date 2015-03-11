package com.admarvel.android.util;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import com.admarvel.android.ads.d;
import java.lang.ref.WeakReference;

class c$a
  implements LocationListener
{
  LocationManager a;
  private boolean c = false;

  public c$a(c paramc, String paramString, LocationManager paramLocationManager)
  {
    this.a = paramLocationManager;
    c.a(paramc, paramString);
  }

  public void a()
  {
    if (!this.c)
    {
      this.a.requestLocationUpdates(c.c(this.b), 0L, 0.0F, this);
      this.c = true;
    }
  }

  public void onLocationChanged(Location paramLocation)
  {
    if (c.a(this.b) != null);
    for (d locald = (d)c.a(this.b).get(); ; locald = null)
    {
      if ((locald != null) && (locald.getHandler() != null) && (c.b(this.b) != null) && (paramLocation != null) && (c.a(this.b) != null))
        locald.e(c.b(this.b) + "(" + paramLocation.getLatitude() + "," + paramLocation.getLongitude() + "," + paramLocation.getAccuracy() + ")");
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.c.a
 * JD-Core Version:    0.6.2
 */