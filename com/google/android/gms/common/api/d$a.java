package com.google.android.gms.common.api;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.j;
import com.google.android.gms.common.ConnectionResult;

class d$a extends j<ConnectionResult>
  implements GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener
{
  public final GoogleApiClient JG;
  private boolean JH;
  private ConnectionResult JI;

  public d$a(Context paramContext, GoogleApiClient paramGoogleApiClient)
  {
    super(paramContext);
    this.JG = paramGoogleApiClient;
  }

  private void a(ConnectionResult paramConnectionResult)
  {
    this.JI = paramConnectionResult;
    if ((isStarted()) && (!isAbandoned()))
      deliverResult(paramConnectionResult);
  }

  public void gv()
  {
    if (this.JH)
    {
      this.JH = false;
      if ((isStarted()) && (!isAbandoned()))
        this.JG.connect();
    }
  }

  public void onConnected(Bundle paramBundle)
  {
    this.JH = false;
    a(ConnectionResult.HE);
  }

  public void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.JH = true;
    a(paramConnectionResult);
  }

  public void onConnectionSuspended(int paramInt)
  {
  }

  protected void onReset()
  {
    this.JI = null;
    this.JH = false;
    this.JG.unregisterConnectionCallbacks(this);
    this.JG.unregisterConnectionFailedListener(this);
    this.JG.disconnect();
  }

  protected void onStartLoading()
  {
    super.onStartLoading();
    this.JG.registerConnectionCallbacks(this);
    this.JG.registerConnectionFailedListener(this);
    if (this.JI != null)
      deliverResult(this.JI);
    if ((!this.JG.isConnected()) && (!this.JG.isConnecting()) && (!this.JH))
      this.JG.connect();
  }

  protected void onStopLoading()
  {
    this.JG.disconnect();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.d.a
 * JD-Core Version:    0.6.2
 */