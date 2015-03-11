package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.List;
import java.util.Map;

public class Charge extends APIResource
  implements MetadataStore<Charge>
{
  Integer amount;
  Integer amountRefunded;
  String balanceTransaction;
  Boolean captured;
  Card card;
  Long created;
  String currency;
  String customer;
  String description;
  Dispute dispute;
  Boolean disputed;
  String failureCode;
  String failureMessage;
  String id;
  String invoice;
  Boolean livemode;
  Map<String, String> metadata;
  Boolean paid;
  Boolean refunded;
  List<Refund> refunds;
  String statementDescription;

  public static ChargeCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static ChargeCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (ChargeCollection)request(APIResource.RequestMethod.GET, classURL(Charge.class), paramMap, ChargeCollection.class, paramString);
  }

  public static Charge create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static Charge create(Map<String, Object> paramMap, String paramString)
  {
    return (Charge)request(APIResource.RequestMethod.POST, classURL(Charge.class), paramMap, Charge.class, paramString);
  }

  public static Charge retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Charge retrieve(String paramString1, String paramString2)
  {
    return (Charge)request(APIResource.RequestMethod.GET, instanceURL(Charge.class, paramString1), null, Charge.class, paramString2);
  }

  public Charge capture()
  {
    return capture(null, null);
  }

  public Charge capture(String paramString)
  {
    return capture(null, paramString);
  }

  public Charge capture(Map<String, Object> paramMap)
  {
    return capture(paramMap, null);
  }

  public Charge capture(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Charge.class, getId());
    return (Charge)request(localRequestMethod, String.format("%s/capture", arrayOfObject), paramMap, Charge.class, paramString);
  }

  public Dispute closeDispute()
  {
    return closeDispute(null);
  }

  public Dispute closeDispute(String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Charge.class, getId());
    return (Dispute)request(localRequestMethod, String.format("%s/dispute/close", arrayOfObject), null, Dispute.class, paramString);
  }

  public Integer getAmount()
  {
    return this.amount;
  }

  public Integer getAmountRefunded()
  {
    return this.amountRefunded;
  }

  public String getBalanceTransaction()
  {
    return this.balanceTransaction;
  }

  public Boolean getCaptured()
  {
    return this.captured;
  }

  public Card getCard()
  {
    return this.card;
  }

  public Long getCreated()
  {
    return this.created;
  }

  public String getCurrency()
  {
    return this.currency;
  }

  public String getCustomer()
  {
    return this.customer;
  }

  public String getDescription()
  {
    return this.description;
  }

  public Dispute getDispute()
  {
    return this.dispute;
  }

  public Boolean getDisputed()
  {
    return this.disputed;
  }

  public String getFailureCode()
  {
    return this.failureCode;
  }

  public String getFailureMessage()
  {
    return this.failureMessage;
  }

  public String getId()
  {
    return this.id;
  }

  public String getInvoice()
  {
    return this.invoice;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Map<String, String> getMetadata()
  {
    return this.metadata;
  }

  public Boolean getPaid()
  {
    return this.paid;
  }

  public Boolean getRefunded()
  {
    return this.refunded;
  }

  public List<Refund> getRefunds()
  {
    return this.refunds;
  }

  public String getStatementDescription()
  {
    return this.statementDescription;
  }

  public Charge refund()
  {
    return refund(null, null);
  }

  public Charge refund(String paramString)
  {
    return refund(null, paramString);
  }

  public Charge refund(Map<String, Object> paramMap)
  {
    return refund(paramMap, null);
  }

  public Charge refund(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Charge.class, getId());
    return (Charge)request(localRequestMethod, String.format("%s/refund", arrayOfObject), paramMap, Charge.class, paramString);
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
  }

  public void setAmountRefunded(Integer paramInteger)
  {
    this.amountRefunded = paramInteger;
  }

  public void setBalanceTransaction(String paramString)
  {
    this.balanceTransaction = paramString;
  }

  public void setCaptured(Boolean paramBoolean)
  {
    this.captured = paramBoolean;
  }

  public void setCard(Card paramCard)
  {
    this.card = paramCard;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setCurrency(String paramString)
  {
    this.currency = paramString;
  }

  public void setCustomer(String paramString)
  {
    this.customer = paramString;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setDispute(Dispute paramDispute)
  {
    this.dispute = paramDispute;
  }

  public void setDisputed(Boolean paramBoolean)
  {
    this.disputed = paramBoolean;
  }

  public void setFailureCode(String paramString)
  {
    this.failureCode = paramString;
  }

  public void setFailureMessage(String paramString)
  {
    this.failureMessage = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setInvoice(String paramString)
  {
    this.invoice = paramString;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setMetadata(Map<String, String> paramMap)
  {
    this.metadata = paramMap;
  }

  public void setPaid(Boolean paramBoolean)
  {
    this.paid = paramBoolean;
  }

  public void setRefunded(Boolean paramBoolean)
  {
    this.refunded = paramBoolean;
  }

  public void setRefunds(List<Refund> paramList)
  {
    this.refunds = paramList;
  }

  public void setStatementDescription(String paramString)
  {
    this.statementDescription = paramString;
  }

  public Charge update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public Charge update(Map<String, Object> paramMap, String paramString)
  {
    return (Charge)request(APIResource.RequestMethod.POST, instanceURL(Charge.class, this.id), paramMap, Charge.class, paramString);
  }

  public Dispute updateDispute(Map<String, Object> paramMap)
  {
    return updateDispute(paramMap, null);
  }

  public Dispute updateDispute(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Charge.class, this.id);
    return (Dispute)request(localRequestMethod, String.format("%s/dispute", arrayOfObject), paramMap, Dispute.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.Charge
 * JD-Core Version:    0.6.2
 */