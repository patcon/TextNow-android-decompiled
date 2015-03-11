package com.google.android.gms.internal;

import android.app.PendingIntent;
import android.os.IInterface;

public abstract interface jd extends IInterface
{
  public abstract void onAddGeofencesResult(int paramInt, String[] paramArrayOfString);

  public abstract void onRemoveGeofencesByPendingIntentResult(int paramInt, PendingIntent paramPendingIntent);

  public abstract void onRemoveGeofencesByRequestIdsResult(int paramInt, String[] paramArrayOfString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jd
 * JD-Core Version:    0.6.2
 */