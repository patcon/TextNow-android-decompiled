package com.google.android.gms.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public final class hb$g
  implements GoogleApiClient.OnConnectionFailedListener
{
  private final GooglePlayServicesClient.OnConnectionFailedListener Gm;

  public hb$g(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.Gm = paramOnConnectionFailedListener;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof g))
      return this.Gm.equals(((g)paramObject).Gm);
    return this.Gm.equals(paramObject);
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.Gm.onConnectionFailed(paramConnectionResult);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hb.g
 * JD-Core Version:    0.6.2
 */