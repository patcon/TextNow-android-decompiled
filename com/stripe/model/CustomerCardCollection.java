package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class CustomerCardCollection extends StripeColllectionAPIResource<Card>
{
  public CustomerCardCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public CustomerCardCollection all(Map<String, Object> paramMap, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = getURL();
    String str = String.format("%s%s", arrayOfObject);
    return (CustomerCardCollection)request(APIResource.RequestMethod.GET, str, paramMap, CustomerCardCollection.class, paramString);
  }

  public CustomerCardCollection create(Map<String, Object> paramMap)
  {
    return create(paramMap, null);
  }

  public CustomerCardCollection create(Map<String, Object> paramMap, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = getURL();
    String str = String.format("%s%s", arrayOfObject);
    return (CustomerCardCollection)request(APIResource.RequestMethod.POST, str, paramMap, CustomerCardCollection.class, paramString);
  }

  public Card retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public Card retrieve(String paramString1, String paramString2)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = getURL();
    arrayOfObject[2] = paramString1;
    String str = String.format("%s%s/%s", arrayOfObject);
    return (Card)request(APIResource.RequestMethod.GET, str, null, Card.class, paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.CustomerCardCollection
 * JD-Core Version:    0.6.2
 */