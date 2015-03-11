package com.facebook;

import com.facebook.internal.Utility;
import java.io.Serializable;

class AppEventsLogger$AccessTokenAppIdPair
  implements Serializable
{
  private static final long serialVersionUID = 1L;
  private final String accessToken;
  private final String applicationId;

  AppEventsLogger$AccessTokenAppIdPair(Session paramSession)
  {
    this(paramSession.getAccessToken(), paramSession.getApplicationId());
  }

  AppEventsLogger$AccessTokenAppIdPair(String paramString1, String paramString2)
  {
    if (Utility.isNullOrEmpty(paramString1))
      paramString1 = null;
    this.accessToken = paramString1;
    this.applicationId = paramString2;
  }

  private Object writeReplace()
  {
    return new AppEventsLogger.AccessTokenAppIdPair.SerializationProxyV1(this.accessToken, this.applicationId, null);
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof AccessTokenAppIdPair));
    AccessTokenAppIdPair localAccessTokenAppIdPair;
    do
    {
      return false;
      localAccessTokenAppIdPair = (AccessTokenAppIdPair)paramObject;
    }
    while ((!Utility.areObjectsEqual(localAccessTokenAppIdPair.accessToken, this.accessToken)) || (!Utility.areObjectsEqual(localAccessTokenAppIdPair.applicationId, this.applicationId)));
    return true;
  }

  String getAccessToken()
  {
    return this.accessToken;
  }

  String getApplicationId()
  {
    return this.applicationId;
  }

  public int hashCode()
  {
    int i;
    int j;
    if (this.accessToken == null)
    {
      i = 0;
      String str = this.applicationId;
      j = 0;
      if (str != null)
        break label35;
    }
    while (true)
    {
      return i ^ j;
      i = this.accessToken.hashCode();
      break;
      label35: j = this.applicationId.hashCode();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.AccessTokenAppIdPair
 * JD-Core Version:    0.6.2
 */