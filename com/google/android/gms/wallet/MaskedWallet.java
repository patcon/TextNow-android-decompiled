package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet
  implements SafeParcelable
{
  public static final Parcelable.Creator<MaskedWallet> CREATOR = new k();
  private final int BR;
  String asB;
  String asC;
  String asE;
  Address asF;
  Address asG;
  String[] asH;
  UserAddress asI;
  UserAddress asJ;
  InstrumentInfo[] asK;
  LoyaltyWalletObject[] atm;
  OfferWalletObject[] atn;

  private MaskedWallet()
  {
    this.BR = 2;
  }

  MaskedWallet(int paramInt, String paramString1, String paramString2, String[] paramArrayOfString, String paramString3, Address paramAddress1, Address paramAddress2, LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject, OfferWalletObject[] paramArrayOfOfferWalletObject, UserAddress paramUserAddress1, UserAddress paramUserAddress2, InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    this.BR = paramInt;
    this.asB = paramString1;
    this.asC = paramString2;
    this.asH = paramArrayOfString;
    this.asE = paramString3;
    this.asF = paramAddress1;
    this.asG = paramAddress2;
    this.atm = paramArrayOfLoyaltyWalletObject;
    this.atn = paramArrayOfOfferWalletObject;
    this.asI = paramUserAddress1;
    this.asJ = paramUserAddress2;
    this.asK = paramArrayOfInstrumentInfo;
  }

  public static MaskedWallet.Builder newBuilderFrom(MaskedWallet paramMaskedWallet)
  {
    o.i(paramMaskedWallet);
    return pM().setGoogleTransactionId(paramMaskedWallet.getGoogleTransactionId()).setMerchantTransactionId(paramMaskedWallet.getMerchantTransactionId()).setPaymentDescriptions(paramMaskedWallet.getPaymentDescriptions()).setInstrumentInfos(paramMaskedWallet.getInstrumentInfos()).setEmail(paramMaskedWallet.getEmail()).setLoyaltyWalletObjects(paramMaskedWallet.getLoyaltyWalletObjects()).setOfferWalletObjects(paramMaskedWallet.getOfferWalletObjects()).setBuyerBillingAddress(paramMaskedWallet.getBuyerBillingAddress()).setBuyerShippingAddress(paramMaskedWallet.getBuyerShippingAddress());
  }

  public static MaskedWallet.Builder pM()
  {
    MaskedWallet localMaskedWallet = new MaskedWallet();
    localMaskedWallet.getClass();
    return new MaskedWallet.Builder(localMaskedWallet, null);
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

  public final LoyaltyWalletObject[] getLoyaltyWalletObjects()
  {
    return this.atm;
  }

  public final String getMerchantTransactionId()
  {
    return this.asC;
  }

  public final OfferWalletObject[] getOfferWalletObjects()
  {
    return this.atn;
  }

  public final String[] getPaymentDescriptions()
  {
    return this.asH;
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
    k.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWallet
 * JD-Core Version:    0.6.2
 */