package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class as
  implements SafeParcelable
{
  public static final Parcelable.Creator<as> CREATOR = new at();
  public final int avO;
  public final int statusCode;
  public final int versionCode;

  as(int paramInt1, int paramInt2, int paramInt3)
  {
    this.versionCode = paramInt1;
    this.statusCode = paramInt2;
    this.avO = paramInt3;
  }

  public int describeContents()
  {
    return 0;
  }

  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    at.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.internal.as
 * JD-Core Version:    0.6.2
 */