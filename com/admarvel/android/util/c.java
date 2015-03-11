package com.admarvel.android.util;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.admarvel.android.ads.d;
import com.admarvel.android.ads.r;
import java.lang.ref.WeakReference;
import java.util.List;

public class c
{
  private static c a = null;
  private static c.a b = null;
  private static c.a c = null;
  private String d;
  private String e;
  private WeakReference<d> f;

  public static c a()
  {
    if (a == null)
      a = new c();
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

  public Location a(d paramd)
  {
    Location localLocation = null;
    if ((!r.c(paramd.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) && (!r.c(paramd.getContext(), "android.permission.ACCESS_FINE_LOCATION")))
      return null;
    LocationManager localLocationManager = (LocationManager)paramd.getContext().getSystemService("location");
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

  public void a(d paramd, String paramString)
  {
    if ((!r.c(paramd.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) && (!r.c(paramd.getContext(), "android.permission.ACCESS_FINE_LOCATION")));
    while (true)
    {
      return;
      LocationManager localLocationManager = (LocationManager)paramd.getContext().getSystemService("location");
      this.f = new WeakReference(paramd);
      this.e = paramString;
      try
      {
        if ((a(paramd.getContext(), "gps")) && (localLocationManager.getProvider("gps") != null))
          b = new c.a(this, "gps", localLocationManager);
        try
        {
          label91: if ((a(paramd.getContext(), "network")) && (localLocationManager.getProvider("network") != null))
            c = new c.a(this, "network", localLocationManager);
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.c
 * JD-Core Version:    0.6.2
 */