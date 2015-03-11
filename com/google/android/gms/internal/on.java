package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class on
  implements SafeParcelable
{
  public static final Parcelable.Creator<on> CREATOR = new oo();
  private final int BR;
  int[] atN;

  on()
  {
    this(1, null);
  }

  on(int paramInt, int[] paramArrayOfInt)
  {
    this.BR = paramInt;
    this.atN = paramArrayOfInt;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    oo.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.on
 * JD-Core Version:    0.6.2
 */