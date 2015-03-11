package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class FullWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<FullWalletRequest> CREATOR = new g();
  String aiQ;
  String aiR;
  Cart aja;
  private final int xM;

  FullWalletRequest()
  {
    this.xM = 1;
  }

  FullWalletRequest(int paramInt, String paramString1, String paramString2, Cart paramCart)
  {
    this.xM = paramInt;
    this.aiQ = paramString1;
    this.aiR = paramString2;
    this.aja = paramCart;
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
    return this.aja;
  }

  public final String getGoogleTransactionId()
  {
    return this.aiQ;
  }

  public final String getMerchantTransactionId()
  {
    return this.aiR;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    g.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWalletRequest
 * JD-Core Version:    0.6.2
 */