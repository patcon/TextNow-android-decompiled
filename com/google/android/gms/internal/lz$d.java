package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.b;
import com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener;
import com.google.android.gms.location.LocationStatusCodes;

final class lz$d extends e<lx>.b<LocationClient.OnRemoveGeofencesResultListener>
{
  private final int HF;
  private final String[] afb;
  private final int afg;
  private final PendingIntent mPendingIntent;

  public lz$d(lz paramlz, int paramInt1, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, int paramInt2, PendingIntent paramPendingIntent)
  {
    super(paramlz, paramOnRemoveGeofencesResultListener);
    if (paramInt1 == i);
    while (true)
    {
      a.I(i);
      this.afg = paramInt1;
      this.HF = LocationStatusCodes.ef(paramInt2);
      this.mPendingIntent = paramPendingIntent;
      this.afb = null;
      return;
      i = 0;
    }
  }

  public lz$d(lz paramlz, int paramInt1, LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, int paramInt2, String[] paramArrayOfString)
  {
    super(paramlz, paramOnRemoveGeofencesResultListener);
    if (paramInt1 == 2);
    for (boolean bool = true; ; bool = false)
    {
      a.I(bool);
      this.afg = paramInt1;
      this.HF = LocationStatusCodes.ef(paramInt2);
      this.afb = paramArrayOfString;
      this.mPendingIntent = null;
      return;
    }
  }

  protected final void a(LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener)
  {
    if (paramOnRemoveGeofencesResultListener != null);
    switch (this.afg)
    {
    default:
      Log.wtf("LocationClientImpl", "Unsupported action: " + this.afg);
      return;
    case 1:
      paramOnRemoveGeofencesResultListener.onRemoveGeofencesByPendingIntentResult(this.HF, this.mPendingIntent);
      return;
    case 2:
    }
    paramOnRemoveGeofencesResultListener.onRemoveGeofencesByRequestIdsResult(this.HF, this.afb);
  }

  protected final void gT()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lz.d
 * JD-Core Version:    0.6.2
 */