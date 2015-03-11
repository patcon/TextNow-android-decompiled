package com.stripe.model;

public class NextRecurringCharge extends StripeObject
{
  Integer amount;
  String date;

  public Integer getAmount()
  {
    return this.amount;
  }

  public String getDate()
  {
    return this.date;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setDate(String paramString)
  {
    this.date = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.NextRecurringCharge
 * JD-Core Version:    0.6.2
 */