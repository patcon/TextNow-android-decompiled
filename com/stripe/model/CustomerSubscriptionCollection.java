package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class CustomerSubscriptionCollection extends StripeColllectionAPIResource<Subscription>
{
  public CustomerSubscriptionCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public CustomerSubscriptionCollection all(Map<String, Object> paramMap, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = getURL();
    String str = String.format("%s%s", arrayOfObject);
    return (CustomerSubscriptionCollection)request(APIResource.RequestMethod.GET, str, paramMap, CustomerSubscriptionCollection.class, paramString);
  }

  public CustomerSubscriptionCollection create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public CustomerSubscriptionCollection create(Map<String, Object> paramMap, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = getURL();
    String str = String.format("%s%s", arrayOfObject);
    return (CustomerSubscriptionCollection)request(APIResource.RequestMethod.POST, str, paramMap, CustomerSubscriptionCollection.class, paramString);
  }

  public Subscription retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public Subscription retrieve(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = getURL();
    arrayOfObject[2] = paramString1;
    String str = String.format("%s%s/%s", arrayOfObject);
    return (Subscription)request(APIResource.RequestMethod.GET, str, null, Subscription.class, paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.CustomerSubscriptionCollection
 * JD-Core Version:    0.6.2
 */