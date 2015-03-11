package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class InvoiceLineItemCollection extends StripeColllectionAPIResource<InvoiceLineItem>
{
  public InvoiceLineItemCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public InvoiceLineItemCollection all(Map<String, Object> paramMap, String paramString)
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Stripe.getApiBase();
    arrayOfObject[1] = getURL();
    String str = String.format("%s%s", arrayOfObject);
    return (InvoiceLineItemCollection)request(APIResource.RequestMethod.GET, str, paramMap, InvoiceLineItemCollection.class, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.InvoiceLineItemCollection
 * JD-Core Version:    0.6.2
 */