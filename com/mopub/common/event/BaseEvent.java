package com.mopub.common.event;

import com.mopub.common.ClientMetadata;

public abstract class BaseEvent
{
  private final String mEventName;
  private final long mEventTimeUtcMillis = System.currentTimeMillis();
  private final ClientMetadata mMetadata;
  private final String mRequestUrl;

  BaseEvent(BaseEvent.Type paramType, String paramString, ClientMetadata paramClientMetadata)
  {
    this.mEventName = paramType.mName;
    this.mRequestUrl = paramString;
    this.mMetadata = paramClientMetadata;
  }

  public String getEventName()
  {
    return this.mEventName;
  }

  public long getEventTimeUtcMillis()
  {
    return this.mEventTimeUtcMillis;
  }

  public ClientMetadata getMetadata()
  {
    return this.mMetadata;
  }

  public String getRequestUrl()
  {
    return this.mRequestUrl;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.event.BaseEvent
 * JD-Core Version:    0.6.2
 */