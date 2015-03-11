package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class InvoiceItem extends APIResource
  implements MetadataStore<InvoiceItem>
{
  Integer amount;
  String currency;
  String customer;
  Long date;
  String description;
  String id;
  String invoice;
  Boolean livemode;
  Map<String, String> metadata;
  String subscription;

  public static InvoiceItemCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static InvoiceItemCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (InvoiceItemCollection)request(APIResource.RequestMethod.GET, classURL(InvoiceItem.class), paramMap, InvoiceItemCollection.class, paramString);
  }

  public static InvoiceItem create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static InvoiceItem create(Map<String, Object> paramMap, String paramString)
  {
    return (InvoiceItem)request(APIResource.RequestMethod.POST, classURL(InvoiceItem.class), paramMap, InvoiceItem.class, paramString);
  }

  public static InvoiceItem retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static InvoiceItem retrieve(String paramString1, String paramString2)
  {
    return (InvoiceItem)request(APIResource.RequestMethod.GET, instanceURL(InvoiceItem.class, paramString1), null, InvoiceItem.class, paramString2);
  }

  public DeletedInvoiceItem delete()
  {
    return delete(null);
  }

  public DeletedInvoiceItem delete(String paramString)
  {
    return (DeletedInvoiceItem)request(APIResource.RequestMethod.DELETE, instanceURL(InvoiceItem.class, this.id), null, DeletedInvoiceItem.class, paramString);
  }

  public Integer getAmount()
  {
    return this.amount;
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

  public String getDescription()
  {
    return this.description;
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

  public String getSubscription()
  {
    return this.subscription;
  }

  public void setAmount(Integer paramInteger)
  {
    this.amount = paramInteger;
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

  public void setDescription(String paramString)
  {
    this.description = paramString;
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

  public void setSubscription(String paramString)
  {
    this.subscription = paramString;
  }

  public InvoiceItem update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public InvoiceItem update(Map<String, Object> paramMap, String paramString)
  {
    return (InvoiceItem)request(APIResource.RequestMethod.POST, instanceURL(InvoiceItem.class, this.id), paramMap, InvoiceItem.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.InvoiceItem
 * JD-Core Version:    0.6.2
 */