package com.stripe.model;

import java.util.Map;

public class EventData extends StripeObject
{
  StripeObject object;
  Map<String, Object> previousAttributes;

  public StripeObject getObject()
  {
    return this.object;
  }

  public Map<String, Object> getPreviousAttributes()
  {
    return this.previousAttributes;
  }

  public void setObject(StripeObject paramStripeObject)
  {
    this.object = paramStripeObject;
  }

  public void setPreviousAttributes(Map<String, Object> paramMap)
  {
    this.previousAttributes = paramMap;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.EventData
 * JD-Core Version:    0.6.2
 */