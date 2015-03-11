package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;

public final class e$h extends e<T>.b<Boolean>
{
  public final Bundle LK;
  public final IBinder LL;
  public final int statusCode;

  public e$h(e parame, int paramInt, IBinder paramIBinder, Bundle paramBundle)
  {
    super(parame, Boolean.valueOf(true));
    this.statusCode = paramInt;
    this.LL = paramIBinder;
    this.LK = paramBundle;
  }

  protected final void b(Boolean paramBoolean)
  {
    if (paramBoolean == null)
    {
      e.a(this.LF, 1);
      return;
    }
    switch (this.statusCode)
    {
    default:
      if (this.LK == null)
        break;
    case 0:
    case 10:
    }
    for (PendingIntent localPendingIntent = (PendingIntent)this.LK.getParcelable("pendingIntent"); ; localPendingIntent = null)
    {
      if (e.d(this.LF) != null)
      {
        g.J(e.e(this.LF)).b(this.LF.getStartServiceAction(), e.d(this.LF));
        e.a(this.LF, null);
      }
      e.a(this.LF, 1);
      e.a(this.LF, null);
      e.a(this.LF).b(new ConnectionResult(this.statusCode, localPendingIntent));
      return;
      try
      {
        String str = this.LL.getInterfaceDescriptor();
        if (this.LF.getServiceDescriptor().equals(str))
        {
          e.a(this.LF, this.LF.j(this.LL));
          if (e.c(this.LF) != null)
          {
            e.a(this.LF, 3);
            e.a(this.LF).dL();
            return;
          }
        }
      }
      catch (RemoteException localRemoteException)
      {
        g.J(e.e(this.LF)).b(this.LF.getStartServiceAction(), e.d(this.LF));
        e.a(this.LF, null);
        e.a(this.LF, 1);
        e.a(this.LF, null);
        e.a(this.LF).b(new ConnectionResult(8, null));
        return;
      }
      e.a(this.LF, 1);
      throw new IllegalStateException("A fatal developer error has occurred. Check the logs for further information.");
    }
  }

  protected final void gT()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e.h
 * JD-Core Version:    0.6.2
 */