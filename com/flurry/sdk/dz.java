package com.flurry.sdk;

import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Looper;
import android.text.TextUtils;

public class dz
  implements dq.a, fb.a
{
  private static final String c = dz.class.getSimpleName();
  private static dz q;
  boolean a = false;
  boolean b;
  private final int d = 3;
  private final long e = 10000L;
  private final long f = 90000L;
  private final long g = 0L;
  private long h = 0L;
  private LocationManager i;
  private Criteria j;
  private Location k;
  private dz.a l = new dz.a(this);
  private String m;
  private int n = 0;
  private int o = 0;
  private volatile Location p;

  private dz()
  {
    dq localdq = dp.a();
    this.j = ((Criteria)localdq.a("LocationCriteria"));
    localdq.a("LocationCriteria", this);
    eo.a(4, c, "initSettings, LocationCriteria = " + this.j);
    this.b = ((Boolean)localdq.a("ReportLocation")).booleanValue();
    localdq.a("ReportLocation", this);
    eo.a(4, c, "initSettings, ReportLocation = " + this.b);
  }

  public static dz a()
  {
    try
    {
      if (q == null)
        q = new dz();
      dz localdz = q;
      return localdz;
    }
    finally
    {
    }
  }

  private void a(String paramString)
  {
    if (!TextUtils.isEmpty(paramString))
      this.i.requestLocationUpdates(paramString, 10000L, 0.0F, this.l, Looper.getMainLooper());
  }

  private Location b(String paramString)
  {
    boolean bool = TextUtils.isEmpty(paramString);
    Location localLocation = null;
    if (!bool)
      localLocation = this.i.getLastKnownLocation(paramString);
    return localLocation;
  }

  private void i()
  {
    this.i.removeUpdates(this.l);
    this.a = false;
    this.o = 0;
    this.h = 0L;
    m();
    eo.a(4, c, "LocationProvider stopped");
  }

  private void j()
  {
    if (!this.b);
    Context localContext;
    do
    {
      do
        return;
      while (this.p != null);
      localContext = do.a().b();
    }
    while ((localContext.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") != 0) && (localContext.checkCallingOrSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0));
    i();
    String str = k();
    a(str);
    this.k = b(str);
    this.h = (90000L + System.currentTimeMillis());
    l();
    this.a = true;
    eo.a(4, c, "LocationProvider started");
  }

  private String k()
  {
    Criteria localCriteria = this.j;
    if (localCriteria == null)
      localCriteria = new Criteria();
    if (TextUtils.isEmpty(this.m));
    for (String str = this.i.getBestProvider(localCriteria, true); ; str = this.m)
    {
      eo.a(4, c, "provider = " + str);
      return str;
    }
  }

  private void l()
  {
    eo.a(4, c, "Register location timer");
    fa.a().a(this);
  }

  private void m()
  {
    eo.a(4, c, "Unregister location timer");
    fa.a().b(this);
  }

  public void a(float paramFloat1, float paramFloat2)
  {
    this.p = new Location("Explicit");
    this.p.setLatitude(paramFloat1);
    this.p.setLongitude(paramFloat2);
  }

  public void a(fb paramfb)
  {
    if ((this.h > 0L) && (this.h < System.currentTimeMillis()))
    {
      eo.a(4, c, "No location received in 90 seconds , stopping LocationManager");
      i();
    }
  }

  public void a(String paramString, Object paramObject)
  {
    if (paramString.equals("LocationCriteria"))
    {
      this.j = ((Criteria)paramObject);
      eo.a(4, c, "onSettingUpdate, LocationCriteria = " + this.j);
      if (this.a)
        j();
    }
    do
    {
      return;
      if (!paramString.equals("ReportLocation"))
        break label140;
      this.b = ((Boolean)paramObject).booleanValue();
      eo.a(4, c, "onSettingUpdate, ReportLocation = " + this.b);
      if (!this.b)
        break;
    }
    while ((this.a) || (this.n <= 0));
    j();
    return;
    i();
    return;
    label140: eo.a(6, c, "LocationProvider internal error! Had to be LocationCriteria or ReportLocation key.");
  }

  public void b()
  {
    try
    {
      LocationManager localLocationManager = this.i;
      if (localLocationManager != null);
      while (true)
      {
        return;
        this.i = ((LocationManager)do.a().b().getSystemService("location"));
      }
    }
    finally
    {
    }
  }

  public void c()
  {
    try
    {
      eo.a(4, c, "Location provider subscribed");
      this.n = (1 + this.n);
      if ((!this.a) && (this.o < 3))
        j();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void d()
  {
    try
    {
      eo.a(4, c, "Location provider unsubscribed");
      if (this.n <= 0)
        eo.a(6, c, "Error! Unsubscribed too many times!");
      while (true)
      {
        return;
        this.n = (-1 + this.n);
        if (this.n == 0)
          i();
      }
    }
    finally
    {
    }
  }

  public void e()
  {
    this.p = null;
  }

  public Location f()
  {
    if (this.p != null)
      return this.p;
    boolean bool = this.b;
    Location localLocation1 = null;
    if (bool)
    {
      Location localLocation2 = b(k());
      if (localLocation2 != null)
        this.k = localLocation2;
      localLocation1 = this.k;
    }
    eo.a(4, c, "getLocation() = " + localLocation1);
    return localLocation1;
  }

  public void g()
  {
    this.n = 0;
    i();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.dz
 * JD-Core Version:    0.6.2
 */