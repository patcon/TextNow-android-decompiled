package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.content.ContentProviderClient;
import android.content.Context;
import android.location.Location;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class jf
{
  private final jj<je> VJ;
  private ContentProviderClient VK = null;
  private boolean VL = false;
  private HashMap<LocationListener, jf.b> VM = new HashMap();
  private final Context mContext;

  public jf(Context paramContext, jj<je> paramjj)
  {
    this.mContext = paramContext;
    this.VJ = paramjj;
  }

  public Location getLastLocation()
  {
    this.VJ.cn();
    try
    {
      Location localLocation = ((je)this.VJ.ft()).bo(this.mContext.getPackageName());
      return localLocation;
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
  }

  public void iY()
  {
    if (this.VL);
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
      synchronized (this.VM)
      {
        Iterator localIterator = this.VM.values().iterator();
        while (localIterator.hasNext())
        {
          jf.b localb = (jf.b)localIterator.next();
          if (localb != null)
            ((je)this.VJ.ft()).a(localb);
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      throw new IllegalStateException(localRemoteException);
    }
    this.VM.clear();
  }

  public void removeLocationUpdates(PendingIntent paramPendingIntent)
  {
    this.VJ.cn();
    ((je)this.VJ.ft()).a(paramPendingIntent);
  }

  public void removeLocationUpdates(LocationListener paramLocationListener)
  {
    this.VJ.cn();
    hm.b(paramLocationListener, "Invalid null listener");
    synchronized (this.VM)
    {
      jf.b localb = (jf.b)this.VM.remove(paramLocationListener);
      if ((this.VK != null) && (this.VM.isEmpty()))
      {
        this.VK.release();
        this.VK = null;
      }
      if (localb != null)
      {
        localb.release();
        ((je)this.VJ.ft()).a(localb);
      }
      return;
    }
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, PendingIntent paramPendingIntent)
  {
    this.VJ.cn();
    ((je)this.VJ.ft()).a(paramLocationRequest, paramPendingIntent);
  }

  public void requestLocationUpdates(LocationRequest paramLocationRequest, LocationListener paramLocationListener, Looper paramLooper)
  {
    this.VJ.cn();
    if (paramLooper == null)
      hm.b(Looper.myLooper(), "Can't create handler inside thread that has not called Looper.prepare()");
    while (true)
    {
      jf.b localb1;
      synchronized (this.VM)
      {
        localb1 = (jf.b)this.VM.get(paramLocationListener);
        if (localb1 == null)
        {
          localb2 = new jf.b(paramLocationListener, paramLooper);
          this.VM.put(paramLocationListener, localb2);
          ((je)this.VJ.ft()).a(paramLocationRequest, localb2, this.mContext.getPackageName());
          return;
        }
      }
      jf.b localb2 = localb1;
    }
  }

  public void setMockLocation(Location paramLocation)
  {
    this.VJ.cn();
    ((je)this.VJ.ft()).setMockLocation(paramLocation);
  }

  public void setMockMode(boolean paramBoolean)
  {
    this.VJ.cn();
    ((je)this.VJ.ft()).setMockMode(paramBoolean);
    this.VL = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jf
 * JD-Core Version:    0.6.2
 */