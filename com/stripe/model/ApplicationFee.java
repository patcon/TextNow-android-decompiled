package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.List;
import java.util.Map;

public class ApplicationFee extends APIResource
{
  Integer amount;
  Integer amountRefunded;
  String application;
  String balanceTransaction;
  String charge;
  Long created;
  String currency;
  String id;
  Boolean livemode;
  Boolean refunded;
  List<FeeRefund> refunds;
  String user;

  public static ApplicationFeeCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static ApplicationFeeCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (ApplicationFeeCollection)request(APIResource.RequestMethod.GET, classURL(ApplicationFee.class), paramMap, ApplicationFeeCollection.class, paramString);
  }

  public static ApplicationFee retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static ApplicationFee retrieve(String paramString1, String paramString2)
  {
    return (ApplicationFee)request(APIResource.RequestMethod.GET, instanceURL(ApplicationFee.class, paramString1), null, ApplicationFee.class, paramString2);
  }

  public Integer getAmount()
  {
    return this.amount;
  }

  public Integer getAmountRefunded()
  {
    return this.amountRefunded;
  }

  public String getApplication()
  {
    return this.application;
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

  public String getId()
  {
    return this.id;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Boolean getRefunded()
  {
    return this.refunded;
  }

  public List<FeeRefund> getRefunds()
  {
    return this.refunds;
  }

  public String getUser()
  {
    return this.user;
  }

  public ApplicationFee refund()
  {
    return refund(null, null);
  }

  public ApplicationFee refund(String paramString)
  {
    return refund(null, paramString);
  }

  public ApplicationFee refund(Map<String, Object> paramMap)
  {
    return refund(paramMap, null);
  }

  public ApplicationFee refund(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(ApplicationFee.class, getId());
    return (ApplicationFee)request(localRequestMethod, String.format("%s/refund", arrayOfObject), paramMap, ApplicationFee.class, paramString);
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setAmountRefunded(Integer paramInteger)
  {
    this.amountRefunded = paramInteger;
  }

  public void setApplication(String paramString)
  {
    this.application = paramString;
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

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setRefunded(Boolean paramBoolean)
  {
    this.refunded = paramBoolean;
  }

  public void setRefunds(List<FeeRefund> paramList)
  {
    this.refunds = paramList;
  }

  public void setUser(String paramString)
  {
    this.user = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.ApplicationFee
 * JD-Core Version:    0.6.2
 */