package com.mopub.common.event;

public enum BaseEvent$Type
{
  public final String mName;

  static
  {
    DATA_ERROR = new Type("DATA_ERROR", 1, "invalid_data");
    Type[] arrayOfType = new Type[2];
    arrayOfType[0] = NETWORK_REQUEST;
    arrayOfType[1] = DATA_ERROR;
  }

  private BaseEvent$Type(String paramString)
  {
    this.mName = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.event.BaseEvent.Type
 * JD-Core Version:    0.6.2
 */