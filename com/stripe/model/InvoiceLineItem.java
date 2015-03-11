package com.stripe.model;

import java.util.Map;

public class InvoiceLineItem extends StripeObject
{
  Integer amount;
  String currency;
  String description;
  String id;
  Boolean livemode;
  Map<String, String> metadata;
  InvoiceLineItemPeriod period;
  Plan plan;
  Boolean proration;
  Integer quantity;
  String type;

  public Integer getAmount()
  {
    return this.amount;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public String getDescription()
  {
    return this.description;
  }

  public String getId()
  {
    return this.id;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Map<String, String> getMetadata()
  {
    return this.metadata;
  }

  public InvoiceLineItemPeriod getPeriod()
  {
    return this.period;
  }

  public Plan getPlan()
  {
    return this.plan;
  }

  public Boolean getProration()
  {
    return this.proration;
  }

  public Integer getQuantity()
  {
    return this.quantity;
  }

  public String getType()
  {
    return this.type;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.InvoiceLineItem
 * JD-Core Version:    0.6.2
 */