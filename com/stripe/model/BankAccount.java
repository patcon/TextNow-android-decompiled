package com.stripe.model;

public class BankAccount extends StripeObject
{
  String bankName;
  String country;
  String last4;
  Boolean validated;

  public String getBankName()
  {
    return this.bankName;
  }

  public String getCountry()
  {
    return this.country;
  }

  public String getLast4()
  {
    return this.last4;
  }

  public Boolean getValidated()
  {
    return this.validated;
  }

  public void setBankName(String paramString)
  {
    this.bankName = paramString;
  }

  public void setCountry(String paramString)
  {
    this.country = paramString;
  }

  public void setLast4(String paramString)
  {
    this.last4 = paramString;
  }

  public void setValidated(Boolean paramBoolean)
  {
    this.validated = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.BankAccount
 * JD-Core Version:    0.6.2
 */