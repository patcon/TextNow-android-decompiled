package com.google.android.gms.internal;

import com.google.android.gms.location.LocationClient.OnAddGeofencesResultListener;
import com.google.android.gms.location.LocationStatusCodes;

final class jg$a extends hb<je>.b<LocationClient.OnAddGeofencesResultListener>
{
  private final int CT;
  private final String[] VT;

  public jg$a(jg paramjg, LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener, int paramInt, String[] paramArrayOfString)
  {
    super(paramjg, paramOnAddGeofencesResultListener);
    this.CT = LocationStatusCodes.cJ(paramInt);
    this.VT = paramArrayOfString;
  }

  protected final void a(LocationClient.OnAddGeofencesResultListener paramOnAddGeofencesResultListener)
  {
    if (paramOnAddGeofencesResultListener != null)
      paramOnAddGeofencesResultListener.onAddGeofencesResult(this.CT, this.VT);
  }

  protected final void fu()
  {
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jg.a
 * JD-Core Version:    0.6.2
 */