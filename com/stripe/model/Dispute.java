package com.stripe.model;

public class Dispute extends StripeObject
{
  Integer amount;
  String balanceTransaction;
  String charge;
  Long created;
  String currency;
  String evidence;
  Long evidenceDueBy;
  Boolean livemode;
  String reason;
  String status;

  public Integer getAmount()
  {
    return this.amount;
  }

  public String getBalanceTransaction()
  {
    return this.balanceTransaction;
  }

  public String getCharge()
  {
    return this.charge;
  }

  public Long getCreated()
  {
    return this.created;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public String getEvidence()
  {
    return this.evidence;
  }

  public Long getEvidenceDueBy()
  {
    return this.evidenceDueBy;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public String getReason()
  {
    return this.reason;
  }

  public String getStatus()
  {
    return this.status;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setBalanceTransaction(String paramString)
  {
    this.balanceTransaction = paramString;
  }

  public void setCharge(String paramString)
  {
    this.charge = paramString;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }

  public void setEvidence(String paramString)
  {
    this.evidence = paramString;
  }

  public void setEvidenceDueBy(Long paramLong)
  {
    this.evidenceDueBy = paramLong;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setReason(String paramString)
  {
    this.reason = paramString;
  }

  public void setStatus(String paramString)
  {
    this.status = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Dispute
 * JD-Core Version:    0.6.2
 */