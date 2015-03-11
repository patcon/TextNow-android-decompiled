package com.google.android.gms.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class op
  implements SafeParcelable
{
  public static final Parcelable.Creator<op> CREATOR = new oq();
  private final int BR;
  String[] atO;
  byte[][] atP;

  op()
  {
    this(1, new String[0], new byte[0][]);
  }

  op(int paramInt, String[] paramArrayOfString, byte[][] paramArrayOfByte)
  {
    this.BR = paramInt;
    this.atO = paramArrayOfString;
    this.atP = paramArrayOfByte;
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
    oq.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.op
 * JD-Core Version:    0.6.2
 */