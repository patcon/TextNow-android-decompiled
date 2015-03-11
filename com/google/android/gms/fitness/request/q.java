package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.fitness.data.k;
import com.google.android.gms.fitness.data.k.a;

public class q
  implements SafeParcelable
{
  public static final Parcelable.Creator<q> CREATOR = new r();
  private final int BR;
  private final k UA;
  private final PendingIntent mPendingIntent;

  q(int paramInt, IBinder paramIBinder, PendingIntent paramPendingIntent)
  {
    this.BR = paramInt;
    if (paramIBinder == null);
    for (k localk = null; ; localk = k.a.an(paramIBinder))
    {
      this.UA = localk;
      this.mPendingIntent = paramPendingIntent;
      return;
    }
  }

  public q(k paramk, PendingIntent paramPendingIntent)
  {
    this.BR = 2;
    this.UA = paramk;
    this.mPendingIntent = paramPendingIntent;
  }

  public int describeContents()
  {
    return 0;
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public PendingIntent jr()
  {
    return this.mPendingIntent;
  }

  IBinder jw()
  {
    if (this.UA == null)
      return null;
    return this.UA.asBinder();
  }

  public String toString()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.UA;
    return String.format("SensorUnregistrationRequest{%s}", arrayOfObject);
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    r.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.q
 * JD-Core Version:    0.6.2
 */