package com.google.android.gms.internal;

import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;

public final class hb$c
  implements GoogleApiClient.ConnectionCallbacks
{
  private final GooglePlayServicesClient.ConnectionCallbacks Gk;

  public hb$c(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.Gk = paramConnectionCallbacks;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof c))
      return this.Gk.equals(((c)paramObject).Gk);
    return this.Gk.equals(paramObject);
  }

  public final void onConnected(Bundle paramBundle)
  {
    this.Gk.onConnected(paramBundle);
  }

  public final void onConnectionSuspended(int paramInt)
  {
    this.Gk.onDisconnected();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb.c
 * JD-Core Version:    0.6.2
 */