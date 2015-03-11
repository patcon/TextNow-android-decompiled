package com.stripe.model;

public class TransferTransaction extends StripeObject
{
  Long amount;
  Long created;
  String description;
  Long fee;
  String id;
  Long net;
  String type;

  public Long getAmount()
  {
    return this.amount;
  }

  public Long getCreated()
  {
    return this.created;
  }

  public String getDescription()
  {
    return this.description;
  }

  public Long getFee()
  {
    return this.fee;
  }

  public String getId()
  {
    return this.id;
  }

  public Long getNet()
  {
    return this.net;
  }

  public String getType()
  {
    return this.type;
  }

  public void setAmount(Long paramLong)
  {
    this.amount = paramLong;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setFee(Long paramLong)
  {
    this.fee = paramLong;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setNet(Long paramLong)
  {
    this.net = paramLong;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.TransferTransaction
 * JD-Core Version:    0.6.2
 */