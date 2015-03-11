package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.HashMap;
import java.util.Map;

public class Customer extends APIResource
  implements MetadataStore<Customer>
{
  Integer accountBalance;
  CustomerCardCollection cards;
  Long created;
  String defaultCard;
  Boolean deleted;
  Boolean delinquent;
  String description;
  Discount discount;
  String email;
  String id;
  Boolean livemode;
  Map<String, String> metadata;
  NextRecurringCharge nextRecurringCharge;
  Subscription subscription;
  CustomerSubscriptionCollection subscriptions;
  Long trialEnd;

  public static CustomerCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static CustomerCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (CustomerCollection)request(APIResource.RequestMethod.GET, classURL(Customer.class), paramMap, CustomerCollection.class, paramString);
  }

  public static Customer create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public static Customer create(Map<String, Object> paramMap, String paramString)
  {
    return (Customer)request(APIResource.RequestMethod.POST, classURL(Customer.class), paramMap, Customer.class, paramString);
  }

  public static Customer retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Customer retrieve(String paramString1, String paramString2)
  {
    return (Customer)request(APIResource.RequestMethod.GET, instanceURL(Customer.class, paramString1), null, Customer.class, paramString2);
  }

  public Subscription cancelSubscription()
  {
    return cancelSubscription(null, null);
  }

  public Subscription cancelSubscription(String paramString)
  {
    return cancelSubscription(null, paramString);
  }

  public Subscription cancelSubscription(Map<String, Object> paramMap)
  {
    return cancelSubscription(paramMap, null);
  }

  public Subscription cancelSubscription(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.DELETE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Customer.class, this.id);
    return (Subscription)request(localRequestMethod, String.format("%s/subscription", arrayOfObject), paramMap, Subscription.class, paramString);
  }

  public Card createCard(String paramString)
  {
    return createCard(paramString, null);
  }

  public Card createCard(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("card", paramString1);
    return createCard(localHashMap, paramString2);
  }

  public Card createCard(Map<String, Object> paramMap)
  {
    return createCard(paramMap, null);
  }

  public Card createCard(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Customer.class, this.id);
    return (Card)request(localRequestMethod, String.format("%s/cards", arrayOfObject), paramMap, Card.class, paramString);
  }

  public Subscription createSubscription(Map<String, Object> paramMap)
  {
    return createSubscription(paramMap, null);
  }

  public Subscription createSubscription(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Customer.class, this.id);
    return (Subscription)request(localRequestMethod, String.format("%s/subscriptions", arrayOfObject), paramMap, Subscription.class, paramString);
  }

  public DeletedCustomer delete()
  {
    return delete(null);
  }

  public DeletedCustomer delete(String paramString)
  {
    return (DeletedCustomer)request(APIResource.RequestMethod.DELETE, instanceURL(Customer.class, this.id), null, DeletedCustomer.class, paramString);
  }

  public void deleteDiscount()
  {
    deleteDiscount(null);
  }

  public void deleteDiscount(String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.DELETE;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Customer.class, this.id);
    request(localRequestMethod, String.format("%s/discount", arrayOfObject), null, Discount.class, paramString);
  }

  public Integer getAccountBalance()
  {
    return this.accountBalance;
  }

  public CustomerCardCollection getCards()
  {
    return this.cards;
  }

  public Long getCreated()
  {
    return this.created;
  }

  public String getDefaultCard()
  {
    return this.defaultCard;
  }

  public Boolean getDeleted()
  {
    return this.deleted;
  }

  public Boolean getDelinquent()
  {
    return this.delinquent;
  }

  public String getDescription()
  {
    return this.description;
  }

  public Discount getDiscount()
  {
    return this.discount;
  }

  public String getEmail()
  {
    return this.email;
  }

  public String getId()
  {
    return this.id;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Map<String, String> getMetadata()
  {
    return this.metadata;
  }

  public NextRecurringCharge getNextRecurringCharge()
  {
    return this.nextRecurringCharge;
  }

  public Subscription getSubscription()
  {
    return this.subscription;
  }

  public CustomerSubscriptionCollection getSubscriptions()
  {
    return this.subscriptions;
  }

  public Long getTrialEnd()
  {
    return this.trialEnd;
  }

  public void setAccountBalance(Integer paramInteger)
  {
    this.accountBalance = paramInteger;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setDefaultCard(String paramString)
  {
    this.defaultCard = paramString;
  }

  public void setDelinquent(Boolean paramBoolean)
  {
    this.delinquent = paramBoolean;
  }

  public void setDescription(String paramString)
  {
    this.description = paramString;
  }

  public void setDiscount(Discount paramDiscount)
  {
    this.discount = paramDiscount;
  }

  public void setEmail(String paramString)
  {
    this.email = paramString;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setMetadata(Map<String, String> paramMap)
  {
    this.metadata = paramMap;
  }

  public void setNextRecurringCharge(NextRecurringCharge paramNextRecurringCharge)
  {
    this.nextRecurringCharge = paramNextRecurringCharge;
  }

  public void setSubscription(Subscription paramSubscription)
  {
    this.subscription = paramSubscription;
  }

  public void setTrialEnd(Long paramLong)
  {
    this.trialEnd = paramLong;
  }

  public Customer update(Map<String, Object> paramMap)
  {
    return update(paramMap, null);
  }

  public Customer update(Map<String, Object> paramMap, String paramString)
  {
    return (Customer)request(APIResource.RequestMethod.POST, instanceURL(Customer.class, this.id), paramMap, Customer.class, paramString);
  }

  public Subscription updateSubscription(Map<String, Object> paramMap)
  {
    return updateSubscription(paramMap, null);
  }

  public Subscription updateSubscription(Map<String, Object> paramMap, String paramString)
  {
    APIResource.RequestMethod localRequestMethod = APIResource.RequestMethod.POST;
    Object[] arrayOfObject = new Object[1];
    arrayOfObject[0] = instanceURL(Customer.class, this.id);
    return (Subscription)request(localRequestMethod, String.format("%s/subscription", arrayOfObject), paramMap, Subscription.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Customer
 * JD-Core Version:    0.6.2
 */