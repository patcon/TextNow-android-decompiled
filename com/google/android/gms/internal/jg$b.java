package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.util.Log;
import com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener;
import com.google.android.gms.location.LocationClient.OnRemoveGeofencesResultListener;

final class jg$b extends jd.a
{
  private LocationClient.OnAddGeofencesResultListener VV;
  private LocationClient.OnRemoveGeofencesResultListener VW;
  private jg VX;

  public jg$b(LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener, jg paramjg)
  {
    this.VV = paramOnAddGeofencesResultListener;
    this.VW = null;
    this.VX = paramjg;
  }

  public jg$b(LocationClient.OnRemoveGeofencesResultListener paramOnRemoveGeofencesResultListener, jg paramjg)
  {
    this.VW = paramOnRemoveGeofencesResultListener;
    this.VV = null;
    this.VX = paramjg;
  }

  public final void onAddGeofencesResult(int paramInt, String[] paramArrayOfString)
  {
    if (this.VX == null)
    {
      Log.wtf("LocationClientImpl", "onAddGeofenceResult called multiple times");
      return;
    }
    jg localjg1 = this.VX;
    jg localjg2 = this.VX;
    localjg2.getClass();
    localjg1.a(new jg.a(localjg2, this.VV, paramInt, paramArrayOfString));
    this.VX = null;
    this.VV = null;
    this.VW = null;
  }

  public final void onRemoveGeofencesByPendingIntentResult(int paramInt, PendingIntent paramPendingIntent)
  {
    if (this.VX == null)
    {
      Log.wtf("LocationClientImpl", "onRemoveGeofencesByPendingIntentResult called multiple times");
      return;
    }
    jg localjg1 = this.VX;
    jg localjg2 = this.VX;
    localjg2.getClass();
    localjg1.a(new jg.d(localjg2, 1, this.VW, paramInt, paramPendingIntent));
    this.VX = null;
    this.VV = null;
    this.VW = null;
  }

  public final void onRemoveGeofencesByRequestIdsResult(int paramInt, String[] paramArrayOfString)
  {
    if (this.VX == null)
    {
      Log.wtf("LocationClientImpl", "onRemoveGeofencesByRequestIdsResult called multiple times");
      return;
    }
    jg localjg1 = this.VX;
    jg localjg2 = this.VX;
    localjg2.getClass();
    localjg1.a(new jg.d(localjg2, 2, this.VW, paramInt, paramArrayOfString));
    this.VX = null;
    this.VV = null;
    this.VW = null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jg.b
 * JD-Core Version:    0.6.2
 */