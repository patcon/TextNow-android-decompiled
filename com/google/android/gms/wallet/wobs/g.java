package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class g
  implements SafeParcelable
{
  public static final Parcelable.Creator<g> CREATOR = new h();
  private final int BR;
  int auD;
  String auE;
  double auF;
  String auG;
  long auH;
  int auI;

  g()
  {
    this.BR = 1;
    this.auI = -1;
    this.auD = -1;
    this.auF = -1.0D;
  }

  g(int paramInt1, int paramInt2, String paramString1, double paramDouble, String paramString2, long paramLong, int paramInt3)
  {
    this.BR = paramInt1;
    this.auD = paramInt2;
    this.auE = paramString1;
    this.auF = paramDouble;
    this.auG = paramString2;
    this.auH = paramLong;
    this.auI = paramInt3;
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
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.g
 * JD-Core Version:    0.6.2
 */