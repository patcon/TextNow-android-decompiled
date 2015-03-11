package com.google.android.gms.wallet;

import com.google.android.gms.identity.intents.model.CountrySpecification;
import java.util.ArrayList;
import java.util.Collection;

public final class MaskedWalletRequest$Builder
{
  private MaskedWalletRequest$Builder(MaskedWalletRequest paramMaskedWalletRequest)
  {
  }

  public final Builder addAllowedCountrySpecificationForShipping(CountrySpecification paramCountrySpecification)
  {
    if (this.ajQ.ajP == null)
      this.ajQ.ajP = new ArrayList();
    this.ajQ.ajP.add(paramCountrySpecification);
    return this;
  }

  public final Builder addAllowedCountrySpecificationsForShipping(Collection<CountrySpecification> paramCollection)
  {
    if (paramCollection != null)
    {
      if (this.ajQ.ajP == null)
        this.ajQ.ajP = new ArrayList();
      this.ajQ.ajP.addAll(paramCollection);
    }
    return this;
  }

  public final MaskedWalletRequest build()
  {
    return this.ajQ;
  }

  public final Builder setAllowDebitCard(boolean paramBoolean)
  {
    this.ajQ.ajO = paramBoolean;
    return this;
  }

  public final Builder setAllowPrepaidCard(boolean paramBoolean)
  {
    this.ajQ.ajN = paramBoolean;
    return this;
  }

  public final Builder setCart(Cart paramCart)
  {
    this.ajQ.aja = paramCart;
    return this;
  }

  public final Builder setCurrencyCode(String paramString)
  {
    this.ajQ.aiL = paramString;
    return this;
  }

  public final Builder setEstimatedTotalPrice(String paramString)
  {
    this.ajQ.ajI = paramString;
    return this;
  }

  public final Builder setIsBillingAgreement(boolean paramBoolean)
  {
    this.ajQ.ajL = paramBoolean;
    return this;
  }

  public final Builder setMerchantName(String paramString)
  {
    this.ajQ.ajJ = paramString;
    return this;
  }

  public final Builder setMerchantTransactionId(String paramString)
  {
    this.ajQ.aiR = paramString;
    return this;
  }

  public final Builder setPhoneNumberRequired(boolean paramBoolean)
  {
    this.ajQ.ajF = paramBoolean;
    return this;
  }

  public final Builder setShippingAddressRequired(boolean paramBoolean)
  {
    this.ajQ.ajG = paramBoolean;
    return this;
  }

  public final Builder setShouldRetrieveWalletObjects(boolean paramBoolean)
  {
    this.ajQ.ajK = paramBoolean;
    return this;
  }

  public final Builder setUseMinimalBillingAddress(boolean paramBoolean)
  {
    this.ajQ.ajH = paramBoolean;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWalletRequest.Builder
 * JD-Core Version:    0.6.2
 */