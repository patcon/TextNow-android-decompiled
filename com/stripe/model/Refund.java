package com.stripe.model;

public class Refund extends StripeObject
{
  Integer amount;
  String balanceTransaction;
  Long created;
  String currency;

  public Integer getAmount()
  {
    return this.amount;
  }

  public String getBalanceTransaction()
  {
    return this.balanceTransaction;
  }

  public Long getCreated()
  {
    return this.created;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setBalanceTransaction(String paramString)
  {
    this.balanceTransaction = paramString;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Refund
 * JD-Core Version:    0.6.2
 */