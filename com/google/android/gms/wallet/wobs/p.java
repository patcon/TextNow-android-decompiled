package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class p
  implements SafeParcelable
{
  public static final Parcelable.Creator<p> CREATOR = new q();
  String akZ;
  l ald;
  n ale;
  n alf;
  String qe;
  private final int xM;

  p()
  {
    this.xM = 1;
  }

  p(int paramInt, String paramString1, String paramString2, l paraml, n paramn1, n paramn2)
  {
    this.xM = paramInt;
    this.akZ = paramString1;
    this.qe = paramString2;
    this.ald = paraml;
    this.ale = paramn1;
    this.alf = paramn2;
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
    q.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.p
 * JD-Core Version:    0.6.2
 */