package com.stripe.model;

import java.lang.reflect.Type;
import textnow.z.k;
import textnow.z.l;
import textnow.z.m;

public class StripeRawJsonObjectDeserializer
  implements l<StripeRawJsonObject>
{
  public StripeRawJsonObject deserialize(m paramm, Type paramType, k paramk)
  {
    StripeRawJsonObject localStripeRawJsonObject = new StripeRawJsonObject();
    localStripeRawJsonObject.json = paramm.l();
    return localStripeRawJsonObject;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.stripe.model.StripeRawJsonObjectDeserializer
 * JD-Core Version:    0.6.2
 */