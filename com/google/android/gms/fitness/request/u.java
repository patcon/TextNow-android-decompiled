package com.google.android.gms.fitness.request;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.n.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class u
  implements SafeParcelable
{
  public static final Parcelable.Creator<u> CREATOR = new v();
  private final int BR;
  private final PendingIntent mPendingIntent;

  u(int paramInt, PendingIntent paramPendingIntent)
  {
    this.BR = paramInt;
    this.mPendingIntent = paramPendingIntent;
  }

  public u(PendingIntent paramPendingIntent)
  {
    this.BR = 3;
    this.mPendingIntent = paramPendingIntent;
  }

  private boolean a(u paramu)
  {
    return n.equal(this.mPendingIntent, paramu.mPendingIntent);
  }

  public int describeContents()
  {
    return 0;
  }

  public boolean equals(Object paramObject)
  {
    return (this == paramObject) || (((paramObject instanceof u)) && (a((u)paramObject)));
  }

  int getVersionCode()
  {
    return this.BR;
  }

  public int hashCode()
  {
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = this.mPendingIntent;
    return n.hashCode(arrayOfObject);
  }

  public PendingIntent jr()
  {
    return this.mPendingIntent;
  }

  public String toString()
  {
    return n.h(this).a("pendingIntent", this.mPendingIntent).toString();
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    v.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.fitness.request.u
 * JD-Core Version:    0.6.2
 */