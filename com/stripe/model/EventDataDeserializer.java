package com.stripe.model;

import com.stripe.net.APIResource;
import java.io.PrintStream;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import textnow.af.f;
import textnow.af.j;
import textnow.af.k;
import textnow.af.l;
import textnow.af.m;
import textnow.af.r;
import textnow.ai.e;

public class EventDataDeserializer
  implements l<EventData>
{
  static Map<String, Class> objectMap;

  static
  {
    HashMap localHashMap = new HashMap();
    objectMap = localHashMap;
    localHashMap.put("account", Account.class);
    objectMap.put("charge", Charge.class);
    objectMap.put("discount", Discount.class);
    objectMap.put("customer", Customer.class);
    objectMap.put("invoice", Invoice.class);
    objectMap.put("invoiceitem", InvoiceItem.class);
    objectMap.put("plan", Plan.class);
    objectMap.put("subscription", Subscription.class);
    objectMap.put("token", Token.class);
    objectMap.put("coupon", Coupon.class);
    objectMap.put("transfer", Transfer.class);
    objectMap.put("dispute", Dispute.class);
    objectMap.put("refund", Refund.class);
    objectMap.put("recipient", Recipient.class);
    objectMap.put("summary", Summary.class);
    objectMap.put("fee", Fee.class);
    objectMap.put("bank_account", BankAccount.class);
    objectMap.put("balance", Balance.class);
    objectMap.put("card", Card.class);
    objectMap.put("balance_transaction", BalanceTransaction.class);
  }

  private Object[] deserializeJsonArray(j paramj)
  {
    Object[] arrayOfObject = new Object[paramj.a()];
    Iterator localIterator = paramj.iterator();
    int j;
    for (int i = 0; localIterator.hasNext(); i = j)
    {
      m localm = (m)localIterator.next();
      j = i + 1;
      arrayOfObject[i] = deserializeJsonElement(localm);
    }
    return arrayOfObject;
  }

  private Object deserializeJsonElement(m paramm)
  {
    if (paramm.k())
      return null;
    if (paramm.i())
    {
      HashMap localHashMap = new HashMap();
      populateMapFromJSONObject(localHashMap, paramm.l());
      return localHashMap;
    }
    if (paramm.j())
      return deserializeJsonPrimitive(paramm.n());
    if (paramm.h())
      return deserializeJsonArray(paramm.m());
    System.err.println("Unknown JSON element type for element " + paramm + ". " + "If you're seeing this messaage, it's probably a bug in the Stripe Java " + "library. Please contact us by email at support@stripe.com.");
    return null;
  }

  private Object deserializeJsonPrimitive(r paramr)
  {
    if (paramr.a())
      return Boolean.valueOf(paramr.g());
    if (paramr.o())
      return paramr.b();
    return paramr.c();
  }

  private void populateMapFromJSONObject(Map<String, Object> paramMap, textnow.af.p paramp)
  {
    Iterator localIterator = paramp.a().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramMap.put((String)localEntry.getKey(), deserializeJsonElement((m)localEntry.getValue()));
    }
  }

  public EventData deserialize(m paramm, Type paramType, k paramk)
  {
    EventData localEventData = new EventData();
    Iterator localIterator = paramm.l().a().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      String str1 = (String)localEntry.getKey();
      m localm1 = (m)localEntry.getValue();
      if ("previous_attributes".equals(str1))
      {
        HashMap localHashMap = new HashMap();
        populateMapFromJSONObject(localHashMap, localm1.l());
        localEventData.setPreviousAttributes(localHashMap);
      }
      else if ("object".equals(str1))
      {
        String str2 = localm1.l().a("object").c();
        Class localClass = (Class)objectMap.get(str2);
        f localf = APIResource.GSON;
        m localm2 = (m)localEntry.getValue();
        Object localObject1;
        if (localClass != null)
        {
          localObject1 = localClass;
          label177: if (localm2 != null)
            break label214;
        }
        label214: for (Object localObject2 = null; ; localObject2 = localf.a(new e(localm2), (Type)localObject1))
        {
          localEventData.setObject((StripeObject)textnow.ah.p.a((Class)localObject1).cast(localObject2));
          break;
          localObject1 = StripeRawJsonObject.class;
          break label177;
        }
      }
    }
    return localEventData;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.EventDataDeserializer
 * JD-Core Version:    0.6.2
 */