package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class lg
  implements SafeParcelable
{
  public static final Parcelable.Creator<lg> CREATOR = new lh();
  int[] akd;
  private final int xM;

  lg()
  {
    this(1, null);
  }

  lg(int paramInt, int[] paramArrayOfInt)
  {
    this.xM = paramInt;
    this.akd = paramArrayOfInt;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    lh.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lg
 * JD-Core Version:    0.6.2
 */