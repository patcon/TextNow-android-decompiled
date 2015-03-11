package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.GooglePlayServicesClient.ConnectionCallbacks;
import com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks;

public final class e$c
  implements GoogleApiClient.ConnectionCallbacks
{
  private final GooglePlayServicesClient.ConnectionCallbacks LH;

  public e$c(GooglePlayServicesClient.ConnectionCallbacks paramConnectionCallbacks)
  {
    this.LH = paramConnectionCallbacks;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof c))
      return this.LH.equals(((c)paramObject).LH);
    return this.LH.equals(paramObject);
  }

  public final void onConnected(Bundle paramBundle)
  {
    this.LH.onConnected(paramBundle);
  }

  public final void onConnectionSuspended(int paramInt)
  {
    this.LH.onDisconnected();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e.c
 * JD-Core Version:    0.6.2
 */