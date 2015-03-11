package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class Subscription extends APIResource
{
  Double applicationFeePercent;
  Boolean cancelAtPeriodEnd;
  Long canceledAt;
  Long currentPeriodEnd;
  Long currentPeriodStart;
  String customer;
  Discount discount;
  Long endedAt;
  String id;
  Plan plan;
  Integer quantity;
  Long start;
  String status;
  Long trialEnd;
  Long trialStart;

  public Subscription cancel(Map<String, Object> paramMap)
  {
    return cancel(paramMap, null);
  }

  public Subscription cancel(Map<String, Object> paramMap, String paramString)
  {
    return (Subscription)request(APIResource.RequestMethod.DELETE, getInstanceURL(), paramMap, Subscription.class, paramString);
  }

  public void deleteDiscount()
  {
    deleteDiscount(null);
  }

  public void deleteDiscount(String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.DELETE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = getInstanceURL();
    request(localRequestMethod, String.format("%s/discount", arrayOfObject), null, Discount.class, paramString);
  }

  public Double getApplicationFeePercent()
  {
    return this.applicationFeePercent;
  }

  public Boolean getCancelAtPeriodEnd()
  {
    return this.cancelAtPeriodEnd;
  }

  public Long getCanceledAt()
  {
    return this.canceledAt;
  }

  public Long getCurrentPeriodEnd()
  {
    return this.currentPeriodEnd;
  }

  public Long getCurrentPeriodStart()
  {
    return this.currentPeriodStart;
  }

  public String getCustomer()
  {
    return this.customer;
  }

  public Discount getDiscount()
  {
    return this.discount;
  }

  public Long getEndedAt()
  {
    return this.endedAt;
  }

  public String getId()
  {
    return this.id;
  }

  public String getInstanceURL()
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = classURL(Customer.class);
    arrayOfObject[1] = getCustomer();
    arrayOfObject[2] = getId();
    return String.format("%s/%s/subscriptions/%s", arrayOfObject);
  }

  public Plan getPlan()
  {
    return this.plan;
  }

  public Integer getQuantity()
  {
    return this.quantity;
  }

  public Long getStart()
  {
    return this.start;
  }

  public String getStatus()
  {
    return this.status;
  }

  public Long getTrialEnd()
  {
    return this.trialEnd;
  }

  public Long getTrialStart()
  {
    return this.trialStart;
  }

  public void setApplicationFeePercent(Double paramDouble)
  {
    this.applicationFeePercent = paramDouble;
  }

  public void setCancelAtPeriodEnd(Boolean paramBoolean)
  {
    this.cancelAtPeriodEnd = paramBoolean;
  }

  public void setCanceledAt(Long paramLong)
  {
    this.canceledAt = paramLong;
  }

  public void setCurrentPeriodEnd(Long paramLong)
  {
    this.currentPeriodEnd = paramLong;
  }

  public void setCurrentPeriodStart(Long paramLong)
  {
    this.currentPeriodStart = paramLong;
  }

  public void setCustomer(String paramString)
  {
    this.customer = paramString;
  }

  public void setDiscount(Discount paramDiscount)
  {
    this.discount = paramDiscount;
  }

  public void setEndedAt(Long paramLong)
  {
    this.endedAt = paramLong;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setPlan(Plan paramPlan)
  {
    this.plan = paramPlan;
  }

  public void setQuantity(Integer paramInteger)
  {
    this.quantity = paramInteger;
  }

  public void setStart(Long paramLong)
  {
    this.start = paramLong;
  }

  public void setStatus(String paramString)
  {
    this.status = paramString;
  }

  public void setTrialEnd(Long paramLong)
  {
    this.trialEnd = paramLong;
  }

  public void setTrialStart(Long paramLong)
  {
    this.trialStart = paramLong;
  }

  public Subscription update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public Subscription update(Map<String, Object> paramMap, String paramString)
  {
    return (Subscription)request(APIResource.RequestMethod.POST, getInstanceURL(), paramMap, Subscription.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Subscription
 * JD-Core Version:    0.6.2
 */