package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;

public final class dq$b extends dq
  implements GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener
{
  private final Object ls = new Object();
  private final dp.a pT;
  private final dr pU;

  public dq$b(Context paramContext, ds paramds, dp.a parama)
  {
    super(paramds, parama);
    this.pT = parama;
    this.pU = new dr(paramContext, this, this, paramds.kQ.sy);
    this.pU.connect();
  }

  public final void bs()
  {
    synchronized (this.ls)
    {
      if ((this.pU.isConnected()) || (this.pU.isConnecting()))
        this.pU.disconnect();
      return;
    }
  }

  public final dw bt()
  {
    synchronized (this.ls)
    {
      try
      {
        dw localdw = this.pU.bw();
        return localdw;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        return null;
      }
    }
  }

  public final void onConnected(Bundle paramBundle)
  {
    start();
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.pT.a(new du(0));
  }

  public final void onDisconnected()
  {
    eu.z("Disconnected from remote ad request service.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.dq.b
 * JD-Core Version:    0.6.2
 */