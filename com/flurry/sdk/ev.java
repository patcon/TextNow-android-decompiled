package com.flurry.sdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Iterator;
import java.util.List;

public class ev extends BroadcastReceiver
{
  private static ev e;
  boolean a;
  Boolean b;
  private final dt<eu> c = new dt();
  private boolean d = false;

  public static ev a()
  {
    try
    {
      if (e == null)
        e = new ev();
      ev localev = e;
      return localev;
    }
    finally
    {
    }
  }

  private boolean a(Context paramContext)
  {
    if ((!this.d) || (paramContext == null))
      return true;
    NetworkInfo localNetworkInfo = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    return (localNetworkInfo != null) && (localNetworkInfo.isConnected());
  }

  private List<eu> f()
  {
    try
    {
      List localList = this.c.a();
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void a(eu parameu)
  {
    try
    {
      this.c.a(parameu);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void b()
  {
    try
    {
      Context localContext = do.a().b();
      if (localContext.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
      for (boolean bool = true; ; bool = false)
      {
        this.d = bool;
        this.a = a(localContext);
        if (this.d)
          d();
        return;
      }
    }
    finally
    {
    }
  }

  public boolean c()
  {
    if (this.b != null)
      return this.b.booleanValue();
    return this.a;
  }

  void d()
  {
    Context localContext = do.a().b();
    this.a = a(localContext);
    localContext.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }

  public ev.a e()
  {
    if (!this.d)
      return ev.a.a;
    NetworkInfo localNetworkInfo = ((ConnectivityManager)do.a().b().getSystemService("connectivity")).getActiveNetworkInfo();
    if ((localNetworkInfo == null) || (!localNetworkInfo.isConnected()))
      return ev.a.a;
    switch (localNetworkInfo.getType())
    {
    default:
      return ev.a.c;
    case 1:
    case 9:
      return ev.a.b;
    case 0:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
      return ev.a.c;
    case 8:
    }
    return ev.a.a;
  }

  public void onReceive(Context paramContext, Intent paramIntent)
  {
    boolean bool = a(paramContext);
    if (this.a != bool)
    {
      this.a = bool;
      Iterator localIterator = f().iterator();
      while (localIterator.hasNext())
        ((eu)localIterator.next()).a(this.a);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ev
 * JD-Core Version:    0.6.2
 */