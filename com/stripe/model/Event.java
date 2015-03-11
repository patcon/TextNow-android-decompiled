package com.stripe.model;

import com.stripe.net.APIResource;
import com.stripe.net.APIResource.RequestMethod;
import java.util.Map;

public class Event extends APIResource
{
  Long created;
  EventData data;
  String id;
  Boolean livemode;
  Integer pendingWebhooks;
  String type;
  String userId;

  public static EventCollection all(Map<String, Object> paramMap)
  {
    return all(paramMap, null);
  }

  public static EventCollection all(Map<String, Object> paramMap, String paramString)
  {
    return (EventCollection)request(APIResource.RequestMethod.GET, classURL(Event.class), paramMap, EventCollection.class, paramString);
  }

  public static Event retrieve(String paramString)
  {
    return retrieve(paramString, null);
  }

  public static Event retrieve(String paramString1, String paramString2)
  {
    return (Event)request(APIResource.RequestMethod.GET, instanceURL(Event.class, paramString1), null, Event.class, paramString2);
  }

  public Long getCreated()
  {
    return this.created;
  }

  public EventData getData()
  {
    return this.data;
  }

  public String getId()
  {
    return this.id;
  }

  public Boolean getLivemode()
  {
    return this.livemode;
  }

  public Integer getPendingWebhooks()
  {
    return this.pendingWebhooks;
  }

  public String getType()
  {
    return this.type;
  }

  public String getUserId()
  {
    return this.userId;
  }

  public void setCreated(Long paramLong)
  {
    this.created = paramLong;
  }

  public void setData(EventData paramEventData)
  {
    this.data = paramEventData;
  }

  public void setId(String paramString)
  {
    this.id = paramString;
  }

  public void setLivemode(Boolean paramBoolean)
  {
    this.livemode = paramBoolean;
  }

  public void setPendingWebhooks(Integer paramInteger)
  {
    this.pendingWebhooks = paramInteger;
  }

  public void setType(String paramString)
  {
    this.type = paramString;
  }

  public void setUserId(String paramString)
  {
    this.userId = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.model.Event
 * JD-Core Version:    0.6.2
 */