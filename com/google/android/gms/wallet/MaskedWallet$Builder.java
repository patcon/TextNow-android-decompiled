package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet$Builder
{
  private MaskedWallet$Builder(MaskedWallet paramMaskedWallet)
  {
  }

  public final MaskedWallet build()
  {
    return this.ato;
  }

  public final Builder setBillingAddress(Address paramAddress)
  {
    this.ato.asF = paramAddress;
    return this;
  }

  public final Builder setBuyerBillingAddress(UserAddress paramUserAddress)
  {
    this.ato.asI = paramUserAddress;
    return this;
  }

  public final Builder setBuyerShippingAddress(UserAddress paramUserAddress)
  {
    this.ato.asJ = paramUserAddress;
    return this;
  }

  public final Builder setEmail(String paramString)
  {
    this.ato.asE = paramString;
    return this;
  }

  public final Builder setGoogleTransactionId(String paramString)
  {
    this.ato.asB = paramString;
    return this;
  }

  public final Builder setInstrumentInfos(InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    this.ato.asK = paramArrayOfInstrumentInfo;
    return this;
  }

  public final Builder setLoyaltyWalletObjects(LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject)
  {
    this.ato.atm = paramArrayOfLoyaltyWalletObject;
    return this;
  }

  public final Builder setMerchantTransactionId(String paramString)
  {
    this.ato.asC = paramString;
    return this;
  }

  public final Builder setOfferWalletObjects(OfferWalletObject[] paramArrayOfOfferWalletObject)
  {
    this.ato.atn = paramArrayOfOfferWalletObject;
    return this;
  }

  public final Builder setPaymentDescriptions(String[] paramArrayOfString)
  {
    this.ato.asH = paramArrayOfString;
    return this;
  }

  public final Builder setShippingAddress(Address paramAddress)
  {
    this.ato.asG = paramAddress;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWallet.Builder
 * JD-Core Version:    0.6.2
 */