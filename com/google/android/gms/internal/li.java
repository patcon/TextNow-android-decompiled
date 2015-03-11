package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class li
  implements SafeParcelable
{
  public static final Parcelable.Creator<li> CREATOR = new lj();
  String[] ake;
  byte[][] akf;
  private final int xM;

  li()
  {
    this(1, new String[0], new byte[0][]);
  }

  li(int paramInt, String[] paramArrayOfString, byte[][] paramArrayOfByte)
  {
    this.xM = paramInt;
    this.ake = paramArrayOfString;
    this.akf = paramArrayOfByte;
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
    lj.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.li
 * JD-Core Version:    0.6.2
 */