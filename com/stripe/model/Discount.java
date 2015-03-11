package com.stripe.model;

public class Discount extends StripeObject
{
  Coupon coupon;
  String customer;
  Long end;
  String id;
  Long start;
  String subscription;

  public Coupon getCoupon()
  {
    return this.coupon;
  }

  public String getCustomer()
  {
    return this.customer;
  }

  public Long getEnd()
  {
    return this.end;
  }

  public String getId()
  {
    return this.id;
  }

  public Long getStart()
  {
    return this.start;
  }

  public String getSubscription()
  {
    return this.subscription;
  }

  public void setCoupon(Coupon paramCoupon)
  {
    this.coupon = paramCoupon;
  }

  public void setCustomer(String paramString)
  {
    this.customer = paramString;
  }

  public void setEnd(Long paramLong)
  {
    this.end = paramLong;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setStart(Long paramLong)
  {
    this.start = paramLong;
  }

  public void setSubscription(String paramString)
  {
    this.subscription = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Discount
 * JD-Core Version:    0.6.2
 */