package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;

@ez
public final class fg$b extends fg
  implements GooglePlayServicesClient.ConnectionCallbacks, GooglePlayServicesClient.OnConnectionFailedListener
{
  private final Object mw = new Object();
  private final ff.a tu;
  private final fh tv;

  public fg$b(Context paramContext, fi paramfi, ff.a parama)
  {
    super(paramfi, parama);
    this.tu = parama;
    this.tv = new fh(paramContext, this, this, paramfi.lD.wF);
    this.tv.connect();
  }

  public final void cC()
  {
    synchronized (this.mw)
    {
      if ((this.tv.isConnected()) || (this.tv.isConnecting()))
        this.tv.disconnect();
      return;
    }
  }

  public final fm cD()
  {
    synchronized (this.mw)
    {
      try
      {
        fm localfm = this.tv.cE();
        return localfm;
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
    this.tu.a(new fk(0));
  }

  public final void onDisconnected()
  {
    gs.S("Disconnected from remote ad request service.");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fg.b
 * JD-Core Version:    0.6.2
 */