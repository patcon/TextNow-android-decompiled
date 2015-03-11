package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener;
import com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener;

final class lz$b extends lw.a
{
  private LocationClient.OnAddGeofencesResultListener afd;
  private LocationClient.OnRemoveGeofencesResultListener afe;
  private lz aff;

  public lz$b(LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener, lz paramlz)
  {
    this.afd = paramOnAddGeofencesResultListener;
    this.afe = null;
    this.aff = paramlz;
  }

  public lz$b(LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, lz paramlz)
  {
    this.afe = paramOnRemoveGeofencesResultListener;
    this.afd = null;
    this.aff = paramlz;
  }

  public final void onAddGeofencesResult(int paramInt, String[] paramArrayOfString)
  {
    if (this.aff == null)
    {
      Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
      return;
    }
    lz locallz1 = this.aff;
    lz locallz2 = this.aff;
    locallz2.getClass();
    locallz1.a(new lz.a(locallz2, this.afd, paramInt, paramArrayOfString));
    this.aff = null;
    this.afd = null;
    this.afe = null;
  }

  public final void onRemoveGeofencesByPendingIntentResult(int paramInt, PendingIntent paramPendingIntent)
  {
    if (this.aff == null)
    {
      Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
      return;
    }
    lz locallz1 = this.aff;
    lz locallz2 = this.aff;
    locallz2.getClass();
    locallz1.a(new lz.d(locallz2, 1, this.afe, paramInt, paramPendingIntent));
    this.aff = null;
    this.afd = null;
    this.afe = null;
  }

  public final void onRemoveGeofencesByRequestIdsResult(int paramInt, String[] paramArrayOfString)
  {
    if (this.aff == null)
    {
      Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
      return;
    }
    lz locallz1 = this.aff;
    lz locallz2 = this.aff;
    locallz2.getClass();
    locallz1.a(new lz.d(locallz2, 2, this.afe, paramInt, paramArrayOfString));
    this.aff = null;
    this.afd = null;
    this.afe = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lz.b
 * JD-Core Version:    0.6.2
 */