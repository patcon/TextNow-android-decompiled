package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class ly
{
  private final me<lx> Dh;
  private ContentProviderClient aeR = null;
  private boolean aeS = false;
  private HashMap<LocationListener, ly.b> aeT = new HashMap();
  private final Context mContext;

  public ly(Context paramContext, me<lx> paramme)
  {
    this.mContext = paramContext;
    this.Dh = paramme;
  }

  private ly.b a(LocationListener paramLocationListener, Looper paramLooper)
  {
    if (paramLooper == null)
      o.b(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
    synchronized (this.aeT)
    {
      ly.b localb = (ly.b)this.aeT.get(paramLocationListener);
      if (localb == null)
        localb = new ly.b(paramLocationListener, paramLooper);
      this.aeT.put(paramLocationListener, localb);
      return localb;
    }
  }

  public void a(ma paramma, LocationListener paramLocationListener, Looper paramLooper)
  {
    this.Dh.dJ();
    ly.b localb = a(paramLocationListener, paramLooper);
    ((lx)this.Dh.gS()).a(paramma, localb);
  }

  public void b(ma paramma, PendingIntent paramPendingIntent)
  {
    this.Dh.dJ();
    ((lx)this.Dh.gS()).a(paramma, paramPendingIntent);
  }

  public Location getLastLocation()
  {
    this.Dh.dJ();
    try
    {
      Location localLocation = ((lx)this.Dh.gS()).bW(this.mContext.getPackageName());
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void lY()
  {
    if (this.aeS);
    try
    {
      setMockMode(false);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void removeAllListeners()
  {
    try
    {
      synchronized (this.aeT)
      {
        Iterator localIterator = this.aeT.values().iterator();
        while (localIterator.hasNext())
        {
          ly.b localb = (ly.b)localIterator.next();
          if (localb != null)
            ((lx)this.Dh.gS()).a(localb);
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
    this.aeT.clear();
  }

  public void removeLocationUpdates(PendingIntent paramPendingIntent)
  {
    this.Dh.dJ();
    ((lx)this.Dh.gS()).a(paramPendingIntent);
  }

  public void removeLocationUpdates(LocationListener paramLocationListener)
  {
    this.Dh.dJ();
    o.b(paramLocationListener, "Invalid null listener");
    synchronized (this.aeT)
    {
      ly.b localb = (ly.b)this.aeT.remove(paramLocationListener);
      if ((this.aeR != null) && (this.aeT.isEmpty()))
      {
        this.aeR.release();
        this.aeR = null;
      }
      if (localb != null)
      {
        localb.release();
        ((lx)this.Dh.gS()).a(localb);
      }
      return;
    }
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    this.Dh.dJ();
    ((lx)this.Dh.gS()).a(paramLocationRequest, paramPendingIntent);
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    this.Dh.dJ();
    ly.b localb = a(paramLocationListener, paramLooper);
    ((lx)this.Dh.gS()).a(paramLocationRequest, localb);
  }

  public void setMockLocation(Location paramLocation)
  {
    this.Dh.dJ();
    ((lx)this.Dh.gS()).setMockLocation(paramLocation);
  }

  public void setMockMode(boolean paramBoolean)
  {
    this.Dh.dJ();
    ((lx)this.Dh.gS()).setMockMode(paramBoolean);
    this.aeS = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ly
 * JD-Core Version:    0.6.2
 */