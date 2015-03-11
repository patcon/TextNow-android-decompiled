package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;

public final class MaskedWalletRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator<MaskedWalletRequest> CREATOR = new l();
  String aiL;
  String aiR;
  boolean ajF;
  boolean ajG;
  boolean ajH;
  String ajI;
  String ajJ;
  boolean ajK;
  boolean ajL;
  CountrySpecification[] ajM;
  boolean ajN;
  boolean ajO;
  ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> ajP;
  Cart aja;
  private final int xM;

  MaskedWalletRequest()
  {
    this.xM = 3;
    this.ajN = true;
    this.ajO = true;
  }

  MaskedWalletRequest(int paramInt, String paramString1, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, String paramString2, String paramString3, String paramString4, Cart paramCart, boolean paramBoolean4, boolean paramBoolean5, CountrySpecification[] paramArrayOfCountrySpecification, boolean paramBoolean6, boolean paramBoolean7, ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> paramArrayList)
  {
    this.xM = paramInt;
    this.aiR = paramString1;
    this.ajF = paramBoolean1;
    this.ajG = paramBoolean2;
    this.ajH = paramBoolean3;
    this.ajI = paramString2;
    this.aiL = paramString3;
    this.ajJ = paramString4;
    this.aja = paramCart;
    this.ajK = paramBoolean4;
    this.ajL = paramBoolean5;
    this.ajM = paramArrayOfCountrySpecification;
    this.ajN = paramBoolean6;
    this.ajO = paramBoolean7;
    this.ajP = paramArrayList;
  }

  public static MaskedWalletRequest.Builder newBuilder()
  {
    MaskedWalletRequest localMaskedWalletRequest = new MaskedWalletRequest();
    localMaskedWalletRequest.getClass();
    return new MaskedWalletRequest.Builder(localMaskedWalletRequest, null);
  }

  public final boolean allowDebitCard()
  {
    return this.ajO;
  }

  public final boolean allowPrepaidCard()
  {
    return this.ajN;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final ArrayList<com.google.android.gms.identity.intents.model.CountrySpecification> getAllowedCountrySpecificationsForShipping()
  {
    return this.ajP;
  }

  public final CountrySpecification[] getAllowedShippingCountrySpecifications()
  {
    return this.ajM;
  }

  public final Cart getCart()
  {
    return this.aja;
  }

  public final String getCurrencyCode()
  {
    return this.aiL;
  }

  public final String getEstimatedTotalPrice()
  {
    return this.ajI;
  }

  public final String getMerchantName()
  {
    return this.ajJ;
  }

  public final String getMerchantTransactionId()
  {
    return this.aiR;
  }

  public final int getVersionCode()
  {
    return this.xM;
  }

  public final boolean isBillingAgreement()
  {
    return this.ajL;
  }

  public final boolean isPhoneNumberRequired()
  {
    return this.ajF;
  }

  public final boolean isShippingAddressRequired()
  {
    return this.ajG;
  }

  public final boolean shouldRetrieveWalletObjects()
  {
    return this.ajK;
  }

  public final boolean useMinimalBillingAddress()
  {
    return this.ajH;
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    l.a(this, paramParcel, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWalletRequest
 * JD-Core Version:    0.6.2
 */