package com.admarvel.android.ads;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import java.lang.ref.WeakReference;
import java.util.List;

class l
{
  private static l a = null;
  private static l.a b = null;
  private static l.a c = null;
  private String d;
  private String e;
  private WeakReference<AdMarvelInternalWebView> f;

  public static l a()
  {
    if (a == null)
      a = new l();
    return a;
  }

  private boolean a(Context paramContext, String paramString)
  {
    LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
    try
    {
      List localList = localLocationManager.getAllProviders();
      for (int i = 0; ; i++)
      {
        int j = localList.size();
        boolean bool = false;
        if (i < j)
        {
          if (paramString.equals((String)localList.get(i)))
            bool = true;
        }
        else
          return bool;
      }
    }
    catch (Throwable localThrowable)
    {
    }
    return false;
  }

  public Location a(AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    Location localLocation = null;
    if ((!ab.d(paramAdMarvelInternalWebView.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) && (!ab.d(paramAdMarvelInternalWebView.getContext(), "android.permission.ACCESS_FINE_LOCATION")))
      return null;
    LocationManager localLocationManager = (LocationManager)paramAdMarvelInternalWebView.getContext().getSystemService("location");
    List localList = localLocationManager.getProviders(true);
    for (int i = -1 + localList.size(); i >= 0; i--)
    {
      localLocation = localLocationManager.getLastKnownLocation((String)localList.get(i));
      if (localLocation != null)
        break;
    }
    return localLocation;
  }

  public void a(Context paramContext)
  {
    LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
    if (c != null)
      localLocationManager.removeUpdates(c);
    if (b != null)
      localLocationManager.removeUpdates(b);
    c = null;
    b = null;
  }

  public void a(AdMarvelInternalWebView paramAdMarvelInternalWebView, String paramString)
  {
    if ((!ab.d(paramAdMarvelInternalWebView.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) && (!ab.d(paramAdMarvelInternalWebView.getContext(), "android.permission.ACCESS_FINE_LOCATION")));
    while (true)
    {
      return;
      LocationManager localLocationManager = (LocationManager)paramAdMarvelInternalWebView.getContext().getSystemService("location");
      this.f = new WeakReference(paramAdMarvelInternalWebView);
      this.e = paramString;
      try
      {
        if ((a(paramAdMarvelInternalWebView.getContext(), "gps")) && (localLocationManager.getProvider("gps") != null))
          b = new l.a(this, "gps", localLocationManager);
        try
        {
          label91: if ((a(paramAdMarvelInternalWebView.getContext(), "network")) && (localLocationManager.getProvider("network") != null))
            c = new l.a(this, "network", localLocationManager);
          label127: if (c != null)
            c.a();
          if (b == null)
            continue;
          b.a();
          return;
        }
        catch (Exception localException2)
        {
          break label127;
        }
      }
      catch (Exception localException1)
      {
        break label91;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.l
 * JD-Core Version:    0.6.2
 */