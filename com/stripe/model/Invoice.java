package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class Invoice extends APIResource
{
  Integer amountDue;
  Long applicationFee;
  Integer attemptCount;
  Boolean attempted;
  String charge;
  Boolean closed;
  Long created;
  String currency;
  String customer;
  Long date;
  Discount discount;
  Integer endingBalance;
  String id;
  InvoiceLineItemCollection lines;
  Boolean livemode;
  Long nextPaymentAttempt;
  Boolean paid;
  Long periodEnd;
  Long periodStart;
  Integer startingBalance;
  String subscription;
  Integer subtotal;
  Integer total;

  public static InvoiceCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static InvoiceCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (InvoiceCollection)request(APIResource.RequestMethod.GET, classURL(Invoice.class), paramMap, InvoiceCollection.class, paramString);
  }

  public static Invoice create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static Invoice create(Map<String, Object> paramMap, String paramString)
  {
    return (Invoice)request(APIResource.RequestMethod.POST, classURL(Invoice.class), paramMap, Invoice.class, paramString);
  }

  public static Invoice retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Invoice retrieve(String paramString1, String paramString2)
  {
    return (Invoice)request(APIResource.RequestMethod.GET, instanceURL(Invoice.class, paramString1), null, Invoice.class, paramString2);
  }

  public static Invoice upcoming(Map<String, Object> paramMap)
  {
    return upcoming(paramMap, null);
  }

  public static Invoice upcoming(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.GET;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = classURL(Invoice.class);
    return (Invoice)request(localRequestMethod, String.format("%s/upcoming", arrayOfObject), paramMap, Invoice.class, paramString);
  }

  public Integer getAmountDue()
  {
    return this.amountDue;
  }

  public Long getApplicationFee()
  {
    return this.applicationFee;
  }

  public Integer getAttemptCount()
  {
    return this.attemptCount;
  }

  public Boolean getAttempted()
  {
    return this.attempted;
  }

  public String getCharge()
  {
    return this.charge;
  }

  public Boolean getClosed()
  {
    return this.closed;
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

  public Long getDate()
  {
    return this.date;
  }

  public Discount getDiscount()
  {
    return this.discount;
  }

  public Integer getEndingBalance()
  {
    return this.endingBalance;
  }

  public String getId()
  {
    return this.id;
  }

  public InvoiceLineItemCollection getLines()
  {
    return this.lines;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Long getNextPaymentAttempt()
  {
    return this.nextPaymentAttempt;
  }

  public Boolean getPaid()
  {
    return this.paid;
  }

  public Long getPeriodEnd()
  {
    return this.periodEnd;
  }

  public Long getPeriodStart()
  {
    return this.periodStart;
  }

  public Integer getStartingBalance()
  {
    return this.startingBalance;
  }

  public String getSubscription()
  {
    return this.subscription;
  }

  public Integer getSubtotal()
  {
    return this.subtotal;
  }

  public Integer getTotal()
  {
    return this.total;
  }

  public Invoice pay()
  {
    return pay(null);
  }

  public Invoice pay(String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Invoice.class, getId());
    return (Invoice)request(localRequestMethod, String.format("%s/pay", arrayOfObject), null, Invoice.class, paramString);
  }

  public void setAmountDue(Integer paramInteger)
  {
    this.amountDue = paramInteger;
  }

  public void setApplicationFee(Long paramLong)
  {
    this.applicationFee = paramLong;
  }

  public void setAttemptCount(Integer paramInteger)
  {
    this.attemptCount = paramInteger;
  }

  public void setAttempted(Boolean paramBoolean)
  {
    this.attempted = paramBoolean;
  }

  public void setCharge(String paramString)
  {
    this.charge = paramString;
  }

  public void setClosed(Boolean paramBoolean)
  {
    this.closed = paramBoolean;
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

  public void setDate(Long paramLong)
  {
    this.date = paramLong;
  }

  public void setDiscount(Discount paramDiscount)
  {
    this.discount = paramDiscount;
  }

  public void setEndingBalance(Integer paramInteger)
  {
    this.endingBalance = paramInteger;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setNextPaymentAttempt(Long paramLong)
  {
    this.nextPaymentAttempt = paramLong;
  }

  public void setPaid(Boolean paramBoolean)
  {
    this.paid = paramBoolean;
  }

  public void setPeriodEnd(Long paramLong)
  {
    this.periodEnd = paramLong;
  }

  public void setPeriodStart(Long paramLong)
  {
    this.periodStart = paramLong;
  }

  public void setStartingBalance(Integer paramInteger)
  {
    this.startingBalance = paramInteger;
  }

  public void setSubscription(String paramString)
  {
    this.subscription = paramString;
  }

  public void setSubtotal(Integer paramInteger)
  {
    this.subtotal = paramInteger;
  }

  public void setTotal(Integer paramInteger)
  {
    this.total = paramInteger;
  }

  public Invoice update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public Invoice update(Map<String, Object> paramMap, String paramString)
  {
    return (Invoice)request(APIResource.RequestMethod.POST, instanceURL(Invoice.class, this.id), paramMap, Invoice.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Invoice
 * JD-Core Version:    0.6.2
 */