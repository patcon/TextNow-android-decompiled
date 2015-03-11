package com.stripe.model;

public class Summary extends StripeObject
{
  Integer adjustmentCount;
  Integer adjustmentGross;
  Integer chargeCount;
  Integer chargeFees;
  Integer chargeGross;
  Integer net;
  Integer refundCount;
  Integer refundFees;
  Integer refundGross;
  Integer validationCount;
  Integer validationFees;

  public Integer getAdjustmentCount()
  {
    return this.adjustmentCount;
  }

  public Integer getAdjustmentGross()
  {
    return this.adjustmentGross;
  }

  public Integer getChargeCount()
  {
    return this.chargeCount;
  }

  public Integer getChargeFees()
  {
    return this.chargeFees;
  }

  public Integer getChargeGross()
  {
    return this.chargeGross;
  }

  public Integer getNet()
  {
    return this.net;
  }

  public Integer getRefundCount()
  {
    return this.refundCount;
  }

  public Integer getRefundFees()
  {
    return this.refundFees;
  }

  public Integer getRefundGross()
  {
    return this.refundGross;
  }

  public Integer getValidationCount()
  {
    return this.validationCount;
  }

  public Integer getValidationFees()
  {
    return this.validationFees;
  }

  public void set(Integer paramInteger)
  {
    this.net = paramInteger;
  }

  public void setAdjustmentCount(Integer paramInteger)
  {
    this.adjustmentCount = paramInteger;
  }

  public void setAdjustmentGross(Integer paramInteger)
  {
    this.adjustmentGross = paramInteger;
  }

  public void setChargeCount(Integer paramInteger)
  {
    this.chargeCount = paramInteger;
  }

  public void setChargeFees(Integer paramInteger)
  {
    this.chargeFees = paramInteger;
  }

  public void setChargeGross(Integer paramInteger)
  {
    this.chargeGross = paramInteger;
  }

  public void setRefundCount(Integer paramInteger)
  {
    this.refundCount = paramInteger;
  }

  public void setRefundFees(Integer paramInteger)
  {
    this.refundFees = paramInteger;
  }

  public void setRefundGross(Integer paramInteger)
  {
    this.refundGross = paramInteger;
  }

  public void setValidationCount(Integer paramInteger)
  {
    this.validationCount = paramInteger;
  }

  public void setValidationFees(Integer paramInteger)
  {
    this.validationFees = paramInteger;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Summary
 * JD-Core Version:    0.6.2
 */