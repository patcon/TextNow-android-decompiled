package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

public final class hb$h extends hb<T>.b<Boolean>
{
  public final Bundle Gn;
  public final IBinder Go;
  public final int statusCode;

  public hb$h(hb paramhb, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(paramhb, Boolean.valueOf(true));
    this.statusCode = paramInt;
    this.Go = paramIBinder;
    this.Gn = paramBundle;
  }

  protected final void b(Boolean paramBoolean)
  {
    if (paramBoolean == null)
    {
      hb.a(this.Gi, 1);
      return;
    }
    switch (this.statusCode)
    {
    default:
      if (this.Gn == null)
        break;
    case 0:
    case 10:
    }
    for (PendingIntent localPendingIntent = (PendingIntent)this.Gn.getParcelable("pendingIntent"); ; localPendingIntent = null)
    {
      if (hb.d(this.Gi) != null)
      {
        hd.E(hb.e(this.Gi)).b(this.Gi.bu(), hb.d(this.Gi));
        hb.a(this.Gi, null);
      }
      hb.a(this.Gi, 1);
      hb.a(this.Gi, null);
      hb.a(this.Gi).a(new ConnectionResult(this.statusCode, localPendingIntent));
      return;
      try
      {
        String str = this.Go.getInterfaceDescriptor();
        if (this.Gi.bv().equals(str))
        {
          hb.a(this.Gi, this.Gi.x(this.Go));
          if (hb.c(this.Gi) != null)
          {
            hb.a(this.Gi, 3);
            hb.a(this.Gi).cp();
            return;
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        hd.E(hb.e(this.Gi)).b(this.Gi.bu(), hb.d(this.Gi));
        hb.a(this.Gi, null);
        hb.a(this.Gi, 1);
        hb.a(this.Gi, null);
        hb.a(this.Gi).a(new ConnectionResult(8, null));
        return;
      }
      hb.a(this.Gi, 1);
      throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }
  }

  protected final void fu()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb.h
 * JD-Core Version:    0.6.2
 */