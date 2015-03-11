package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class FullWallet
  implements SafeParcelable
{
  public static final Parcelable.Creator<FullWallet> CREATOR = new f();
  private final int BR;
  String asB;
  String asC;
  ProxyCard asD;
  String asE;
  Address asF;
  Address asG;
  String[] asH;
  UserAddress asI;
  UserAddress asJ;
  InstrumentInfo[] asK;

  private FullWallet()
  {
    this.BR = 1;
  }

  FullWallet(int paramInt, String paramString1, String paramString2, ProxyCard paramProxyCard, String paramString3, Address paramAddress1, Address paramAddress2, String[] paramArrayOfString, UserAddress paramUserAddress1, UserAddress paramUserAddress2, InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    this.BR = paramInt;
    this.asB = paramString1;
    this.asC = paramString2;
    this.asD = paramProxyCard;
    this.asE = paramString3;
    this.asF = paramAddress1;
    this.asG = paramAddress2;
    this.asH = paramArrayOfString;
    this.asI = paramUserAddress1;
    this.asJ = paramUserAddress2;
    this.asK = paramArrayOfInstrumentInfo;
  }

  public final int describeContents()
  {
    return 0;
  }

  @Deprecated
  public final Address getBillingAddress()
  {
    return this.asF;
  }

  public final UserAddress getBuyerBillingAddress()
  {
    return this.asI;
  }

  public final UserAddress getBuyerShippingAddress()
  {
    return this.asJ;
  }

  public final String getEmail()
  {
    return this.asE;
  }

  public final String getGoogleTransactionId()
  {
    return this.asB;
  }

  public final InstrumentInfo[] getInstrumentInfos()
  {
    return this.asK;
  }

  public final String getMerchantTransactionId()
  {
    return this.asC;
  }

  public final String[] getPaymentDescriptions()
  {
    return this.asH;
  }

  public final ProxyCard getProxyCard()
  {
    return this.asD;
  }

  @Deprecated
  public final Address getShippingAddress()
  {
    return this.asG;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    f.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.FullWallet
 * JD-Core Version:    0.6.2
 */