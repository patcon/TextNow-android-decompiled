package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener;
import com.google.android.gms.location.LocationStatusCodes;

final class jg$d extends hb<je>.b<LocationClient.OnRemoveGeofencesResultListener>
{
  private final int CT;
  private final String[] VT;
  private final int VY;
  private final PendingIntent mPendingIntent;

  public jg$d(jg paramjg, int paramInt1, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, int paramInt2, PendingIntent paramPendingIntent)
  {
    super(paramjg, paramOnRemoveGeofencesResultListener);
    if (paramInt1 == i);
    while (true)
    {
      gx.A(i);
      this.VY = paramInt1;
      this.CT = LocationStatusCodes.cJ(paramInt2);
      this.mPendingIntent = paramPendingIntent;
      this.VT = null;
      return;
      i = 0;
    }
  }

  public jg$d(jg paramjg, int paramInt1, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, int paramInt2, String[] paramArrayOfString)
  {
    super(paramjg, paramOnRemoveGeofencesResultListener);
    if (paramInt1 == 2);
    for (boolean bool = true; ; bool = false)
    {
      gx.A(bool);
      this.VY = paramInt1;
      this.CT = LocationStatusCodes.cJ(paramInt2);
      this.VT = paramArrayOfString;
      this.mPendingIntent = null;
      return;
    }
  }

  protected final void a(LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
  {
    if (paramOnRemoveGeofencesResultListener != null);
    switch (this.VY)
    {
    default:
      Log.wtf("LocationClientImpl", "Unsupported action: " + this.VY);
      return;
    case 1:
      paramOnRemoveGeofencesResultListener.onRemoveGeofencesByPendingIntentResult(this.CT, this.mPendingIntent);
      return;
    case 2:
    }
    paramOnRemoveGeofencesResultListener.onRemoveGeofencesByRequestIdsResult(this.CT, this.VT);
  }

  protected final void fu()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jg.d
 * JD-Core Version:    0.6.2
 */