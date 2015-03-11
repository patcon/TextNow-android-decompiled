package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class g
  implements SafeParcelable
{
  public static final Parcelable.Creator<g> CREATOR = new h();
  int akT;
  String akU;
  double akV;
  String akW;
  long akX;
  int akY;
  private final int xM;

  g()
  {
    this.xM = 1;
    this.akY = -1;
    this.akT = -1;
    this.akV = -1.0D;
  }

  g(int paramInt1, int paramInt2, String paramString1, double paramDouble, String paramString2, long paramLong, int paramInt3)
  {
    this.xM = paramInt1;
    this.akT = paramInt2;
    this.akU = paramString1;
    this.akV = paramDouble;
    this.akW = paramString2;
    this.akX = paramLong;
    this.akY = paramInt3;
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
    h.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.wobs.g
 * JD-Core Version:    0.6.2
 */