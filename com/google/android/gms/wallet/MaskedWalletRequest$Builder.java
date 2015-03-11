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
    if (this.atA.atz == null)
      this.atA.atz = new ArrayList();
    this.atA.atz.add(paramCountrySpecification);
    return this;
  }

  public final Builder addAllowedCountrySpecificationsForShipping(Collection<CountrySpecification> paramCollection)
  {
    if (paramCollection != null)
    {
      if (this.atA.atz == null)
        this.atA.atz = new ArrayList();
      this.atA.atz.addAll(paramCollection);
    }
    return this;
  }

  public final MaskedWalletRequest build()
  {
    return this.atA;
  }

  public final Builder setAllowDebitCard(boolean paramBoolean)
  {
    this.atA.aty = paramBoolean;
    return this;
  }

  public final Builder setAllowPrepaidCard(boolean paramBoolean)
  {
    this.atA.atx = paramBoolean;
    return this;
  }

  public final Builder setCart(Cart paramCart)
  {
    this.atA.asL = paramCart;
    return this;
  }

  public final Builder setCurrencyCode(String paramString)
  {
    this.atA.asw = paramString;
    return this;
  }

  public final Builder setEstimatedTotalPrice(String paramString)
  {
    this.atA.ats = paramString;
    return this;
  }

  public final Builder setIsBillingAgreement(boolean paramBoolean)
  {
    this.atA.atv = paramBoolean;
    return this;
  }

  public final Builder setMerchantName(String paramString)
  {
    this.atA.att = paramString;
    return this;
  }

  public final Builder setMerchantTransactionId(String paramString)
  {
    this.atA.asC = paramString;
    return this;
  }

  public final Builder setPhoneNumberRequired(boolean paramBoolean)
  {
    this.atA.atp = paramBoolean;
    return this;
  }

  public final Builder setShippingAddressRequired(boolean paramBoolean)
  {
    this.atA.atq = paramBoolean;
    return this;
  }

  public final Builder setShouldRetrieveWalletObjects(boolean paramBoolean)
  {
    this.atA.atu = paramBoolean;
    return this;
  }

  public final Builder setUseMinimalBillingAddress(boolean paramBoolean)
  {
    this.atA.atr = paramBoolean;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wallet.MaskedWalletRequest.Builder
 * JD-Core Version:    0.6.2
 */