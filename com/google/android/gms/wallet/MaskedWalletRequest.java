package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class MaskedWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new l();
  private final int BR;
  String asC;
  Cart asL;
  String asw;
  boolean atp;
  boolean atq;
  boolean atr;
  String ats;
  String att;
  boolean atu;
  boolean atv;
  CountrySpecification[] atw;
  boolean atx;
  boolean aty;
  ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> atz;

  MaskedWalletRequest()
  {
    this.BR = 3;
    this.atx = true;
    this.aty = true;
  }

  MaskedWalletRequest(int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, String paramString3, String paramString4, Cart paramCart, boolean paramBoolean4, boolean paramBoolean5, CountrySpecification[] paramArrayOfCountrySpecification, boolean paramBoolean6, boolean paramBoolean7, ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> paramArrayList)
  {
    this.BR = paramInt;
    this.asC = paramString1;
    this.atp = paramBoolean1;
    this.atq = paramBoolean2;
    this.atr = paramBoolean3;
    this.ats = paramString2;
    this.asw = paramString3;
    this.att = paramString4;
    this.asL = paramCart;
    this.atu = paramBoolean4;
    this.atv = paramBoolean5;
    this.atw = paramArrayOfCountrySpecification;
    this.atx = paramBoolean6;
    this.aty = paramBoolean7;
    this.atz = paramArrayList;
  }

  public static MaskedWalletRequest.Builder newBuilder()
  {
    MaskedWalletRequest localMaskedWalletRequest = new MaskedWalletRequest();
    localMaskedWalletRequest.getClass();
    return new MaskedWalletRequest.Builder(localMaskedWalletRequest, null);
  }

  public final boolean allowDebitCard()
  {
    return this.aty;
  }

  public final boolean allowPrepaidCard()
  {
    return this.atx;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> getAllowedCountrySpecificationsForShipping()
  {
    return this.atz;
  }

  public final CountrySpecification[] getAllowedShippingCountrySpecifications()
  {
    return this.atw;
  }

  public final Cart getCart()
  {
    return this.asL;
  }

  public final String getCurrencyCode()
  {
    return this.asw;
  }

  public final String getEstimatedTotalPrice()
  {
    return this.ats;
  }

  public final String getMerchantName()
  {
    return this.att;
  }

  public final String getMerchantTransactionId()
  {
    return this.asC;
  }

  public final int getVersionCode()
  {
    return this.BR;
  }

  public final boolean isBillingAgreement()
  {
    return this.atv;
  }

  public final boolean isPhoneNumberRequired()
  {
    return this.atp;
  }

  public final boolean isShippingAddressRequired()
  {
    return this.atq;
  }

  public final boolean shouldRetrieveWalletObjects()
  {
    return this.atu;
  }

  public final boolean useMinimalBillingAddress()
  {
    return this.atr;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWalletRequest
 * JD-Core Version:    0.6.2
 */