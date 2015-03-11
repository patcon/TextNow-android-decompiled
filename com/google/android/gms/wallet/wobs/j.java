package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class j
  implements SafeParcelable
{
  public static final Parcelable.Creator<j> CREATOR = new k();
  String akZ;
  String qe;
  private final int xM;

  j()
  {
    this.xM = 1;
  }

  j(int paramInt, String paramString1, String paramString2)
  {
    this.xM = paramInt;
    this.akZ = paramString1;
    this.qe = paramString2;
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
    k.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.j
 * JD-Core Version:    0.6.2
 */