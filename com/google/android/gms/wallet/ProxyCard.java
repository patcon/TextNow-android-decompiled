package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class ProxyCard
  implements SafeParcelable
{
  public static final Parcelable.Creator<ProxyCard> CREATOR = new o();
  String ajV;
  String ajW;
  int ajX;
  int ajY;
  private final int xM;

  ProxyCard(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3)
  {
    this.xM = paramInt1;
    this.ajV = paramString1;
    this.ajW = paramString2;
    this.ajX = paramInt2;
    this.ajY = paramInt3;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final String getCvn()
  {
    return this.ajW;
  }

  public final int getExpirationMonth()
  {
    return this.ajX;
  }

  public final int getExpirationYear()
  {
    return this.ajY;
  }

  public final String getPan()
  {
    return this.ajV;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    o.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.ProxyCard
 * JD-Core Version:    0.6.2
 */