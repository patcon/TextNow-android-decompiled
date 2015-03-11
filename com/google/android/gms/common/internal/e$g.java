package com.google.android.gms.common.internal;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesClient.OnConnectionFailedListener;
import com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener;

public final class e$g
  implements GoogleApiClient.OnConnectionFailedListener
{
  private final GooglePlayServicesClient.OnConnectionFailedListener LJ;

  public e$g(GooglePlayServicesClient.OnConnectionFailedListener paramOnConnectionFailedListener)
  {
    this.LJ = paramOnConnectionFailedListener;
  }

  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof g))
      return this.LJ.equals(((g)paramObject).LJ);
    return this.LJ.equals(paramObject);
  }

  public final void onConnectionFailed(ConnectionResult paramConnectionResult)
  {
    this.LJ.onConnectionFailed(paramConnectionResult);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.e.g
 * JD-Core Version:    0.6.2
 */