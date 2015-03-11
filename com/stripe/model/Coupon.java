package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class Coupon extends APIResource
{
  Integer amountOff;
  String currency;
  String duration;
  Integer durationInMonths;
  String id;
  Boolean livemode;
  Integer maxRedemptions;
  Integer percentOff;
  Long redeemBy;
  Integer timesRedeemed;
  Boolean valid;

  public static CouponCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static CouponCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (CouponCollection)request(APIResource.RequestMethod.GET, classURL(Coupon.class), paramMap, CouponCollection.class, paramString);
  }

  public static Coupon create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static Coupon create(Map<String, Object> paramMap, String paramString)
  {
    return (Coupon)request(APIResource.RequestMethod.POST, classURL(Coupon.class), paramMap, Coupon.class, paramString);
  }

  public static Coupon retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Coupon retrieve(String paramString1, String paramString2)
  {
    return (Coupon)request(APIResource.RequestMethod.GET, instanceURL(Coupon.class, paramString1), null, Coupon.class, paramString2);
  }

  public DeletedCoupon delete()
  {
    return delete(null);
  }

  public DeletedCoupon delete(String paramString)
  {
    return (DeletedCoupon)request(APIResource.RequestMethod.DELETE, instanceURL(Coupon.class, this.id), null, DeletedCoupon.class, paramString);
  }

  public Integer getAmountOff()
  {
    return this.amountOff;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public String getDuration()
  {
    return this.duration;
  }

  public Integer getDurationInMonths()
  {
    return this.durationInMonths;
  }

  public String getId()
  {
    return this.id;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Integer getMaxRedemptions()
  {
    return this.maxRedemptions;
  }

  public Integer getPercentOff()
  {
    return this.percentOff;
  }

  public Long getRedeemBy()
  {
    return this.redeemBy;
  }

  public Integer getTimesRedeemed()
  {
    return this.timesRedeemed;
  }

  public Boolean getValid()
  {
    return this.valid;
  }

  public void setAmountOff(Integer paramInteger)
  {
    this.amountOff = paramInteger;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }

  public void setDuration(String paramString)
  {
    this.duration = paramString;
  }

  public void setDurationInMonths(Integer paramInteger)
  {
    this.durationInMonths = paramInteger;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setMaxRedemptions(Integer paramInteger)
  {
    this.maxRedemptions = paramInteger;
  }

  public void setPercentOff(Integer paramInteger)
  {
    this.percentOff = paramInteger;
  }

  public void setRedeemBy(Long paramLong)
  {
    this.redeemBy = paramLong;
  }

  public void setTimesRedeemed(Integer paramInteger)
  {
    this.timesRedeemed = paramInteger;
  }

  public void setValid(Boolean paramBoolean)
  {
    this.valid = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Coupon
 * JD-Core Version:    0.6.2
 */