package com.stripe.model;

public class InvoiceLineItemPeriod extends StripeObject
{
  Long end;
  Long start;

  public Long getEnd()
  {
    return this.end;
  }

  public Long getStart()
  {
    return this.start;
  }

  public void setEnd(Long paramLong)
  {
    this.end = paramLong;
  }

  public void setStart(Long paramLong)
  {
    this.start = paramLong;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.InvoiceLineItemPeriod
 * JD-Core Version:    0.6.2
 */