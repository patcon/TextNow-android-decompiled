package com.google.android.gms.internal;

import com.google.android.gms.common.internal.e;
import com.google.android.gms.common.internal.e.b;
import com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener;
import com.google.android.gms.location.LocationStatusCodes;

final class lz$a extends e<lx>.b<LocationClient.OnAddGeofencesResultListener>
{
  private final int HF;
  private final String[] afb;

  public lz$a(lz paramlz, LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener, int paramInt, String[] paramArrayOfString)
  {
    super(paramlz, paramOnAddGeofencesResultListener);
    this.HF = LocationStatusCodes.ef(paramInt);
    this.afb = paramArrayOfString;
  }

  protected final void a(LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener)
  {
    if (paramOnAddGeofencesResultListener != null)
      paramOnAddGeofencesResultListener.onAddGeofencesResult(this.HF, this.afb);
  }

  protected final void gT()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lz.a
 * JD-Core Version:    0.6.2
 */