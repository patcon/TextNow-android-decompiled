package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.UserAddress;

public final class MaskedWallet$Builder
{
  private MaskedWallet$Builder(MaskedWallet paramMaskedWallet)
  {
  }

  public final MaskedWallet build()
  {
    return this.ajE;
  }

  public final Builder setBillingAddress(Address paramAddress)
  {
    this.ajE.aiU = paramAddress;
    return this;
  }

  public final Builder setBuyerBillingAddress(UserAddress paramUserAddress)
  {
    this.ajE.aiX = paramUserAddress;
    return this;
  }

  public final Builder setBuyerShippingAddress(UserAddress paramUserAddress)
  {
    this.ajE.aiY = paramUserAddress;
    return this;
  }

  public final Builder setEmail(String paramString)
  {
    this.ajE.aiT = paramString;
    return this;
  }

  public final Builder setGoogleTransactionId(String paramString)
  {
    this.ajE.aiQ = paramString;
    return this;
  }

  public final Builder setInstrumentInfos(InstrumentInfo[] paramArrayOfInstrumentInfo)
  {
    this.ajE.aiZ = paramArrayOfInstrumentInfo;
    return this;
  }

  public final Builder setLoyaltyWalletObjects(LoyaltyWalletObject[] paramArrayOfLoyaltyWalletObject)
  {
    this.ajE.ajC = paramArrayOfLoyaltyWalletObject;
    return this;
  }

  public final Builder setMerchantTransactionId(String paramString)
  {
    this.ajE.aiR = paramString;
    return this;
  }

  public final Builder setOfferWalletObjects(OfferWalletObject[] paramArrayOfOfferWalletObject)
  {
    this.ajE.ajD = paramArrayOfOfferWalletObject;
    return this;
  }

  public final Builder setPaymentDescriptions(String[] paramArrayOfString)
  {
    this.ajE.aiW = paramArrayOfString;
    return this;
  }

  public final Builder setShippingAddress(Address paramAddress)
  {
    this.ajE.aiV = paramAddress;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWallet.Builder
 * JD-Core Version:    0.6.2
 */