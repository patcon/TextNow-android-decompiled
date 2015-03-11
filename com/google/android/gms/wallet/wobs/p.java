package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class p
  implements SafeParcelable
{
  public static final Parcelable.Creator<p> CREATOR = new q();
  private final int BR;
  String auJ;
  l auN;
  n auO;
  n auP;
  String tG;

  p()
  {
    this.BR = 1;
  }

  p(int paramInt, String paramString1, String paramString2, l paraml, n paramn1, n paramn2)
  {
    this.BR = paramInt;
    this.auJ = paramString1;
    this.tG = paramString2;
    this.auN = paraml;
    this.auO = paramn1;
    this.auP = paramn2;
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
    q.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.p
 * JD-Core Version:    0.6.2
 */