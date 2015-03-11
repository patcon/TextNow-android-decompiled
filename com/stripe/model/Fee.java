package com.stripe.model;

import com.stripe.net.APIResource;

public class Fee extends APIResource
{
  Integer amount;
  String application;
  String currency;
  String description;
  String type;

  public Integer getAmount()
  {
    return this.amount;
  }

  public String getApplication()
  {
    return this.application;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public String getDescription()
  {
    return this.description;
  }

  public String getType()
  {
    return this.type;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setApplication(String paramString)
  {
    this.application = paramString;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Fee
 * JD-Core Version:    0.6.2
 */