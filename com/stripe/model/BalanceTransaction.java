package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.List;
import java.util.Map;

public class BalanceTransaction extends APIResource
{
  Integer amount;
  Long availableOn;
  Long created;
  String currency;
  String description;
  Long fee;
  List<Fee> feeDetails;
  String id;
  Integer net;
  String source;
  String status;
  String type;

  public static BalanceTransactionCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static BalanceTransactionCollection all(Map<String, Object> paramMap, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = "v1/balance/history";
    String str = String.format("%s/%s", arrayOfObject);
    return (BalanceTransactionCollection)request(APIResource.RequestMethod.GET, str, paramMap, BalanceTransactionCollection.class, paramString);
  }

  public static BalanceTransaction retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static BalanceTransaction retrieve(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = "v1/balance/history";
    arrayOfObject[2] = paramString1;
    String str = String.format("%s/%s/%s", arrayOfObject);
    return (BalanceTransaction)request(APIResource.RequestMethod.GET, str, null, BalanceTransaction.class, paramString2);
  }

  public Integer getAmount()
  {
    return this.amount;
  }

  public Long getAvailableOn()
  {
    return this.availableOn;
  }

  public Long getCreated()
  {
    return this.created;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public String getDescription()
  {
    return this.description;
  }

  public Long getFee()
  {
    return this.fee;
  }

  public List<Fee> getFeeDetails()
  {
    return this.feeDetails;
  }

  public String getId()
  {
    return this.id;
  }

  public Integer getNet()
  {
    return this.net;
  }

  public String getSource()
  {
    return this.source;
  }

  public String getStatus()
  {
    return this.status;
  }

  public String getType()
  {
    return this.type;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setAvailableOn(Long paramLong)
  {
    this.availableOn = paramLong;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setFee(Long paramLong)
  {
    this.fee = paramLong;
  }

  public void setFeeDetails(List<Fee> paramList)
  {
    this.feeDetails = paramList;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setNet(Integer paramInteger)
  {
    this.net = paramInteger;
  }

  public void setSource(String paramString)
  {
    this.source = paramString;
  }

  public void setStatus(String paramString)
  {
    this.status = paramString;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.BalanceTransaction
 * JD-Core Version:    0.6.2
 */