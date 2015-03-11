package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<FullWalletRequest> CREATOR = new g();
  private final int BR;
  String asB;
  String asC;
  Cart asL;

  FullWalletRequest()
  {
    this.BR = 1;
  }

  FullWalletRequest(int paramInt, String paramString1, String paramString2, Cart paramCart)
  {
    this.BR = paramInt;
    this.asB = paramString1;
    this.asC = paramString2;
    this.asL = paramCart;
  }

  public static FullWalletRequest.Builder newBuilder()
  {
    FullWalletRequest localFullWalletRequest = new FullWalletRequest();
    localFullWalletRequest.getClass();
    return new FullWalletRequest.Builder(localFullWalletRequest, null);
  }

  public final int describeContents()
  {
    return 0;
  }

  public final Cart getCart()
  {
    return this.asL;
  }

  public final String getGoogleTransactionId()
  {
    return this.asB;
  }

  public final String getMerchantTransactionId()
  {
    return this.asC;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWalletRequest
 * JD-Core Version:    0.6.2
 */