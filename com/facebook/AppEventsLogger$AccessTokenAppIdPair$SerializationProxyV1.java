package com.facebook;

import java.io.Serializable;

class AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1
  implements Serializable
{
  private static final long serialVersionUID = -2488473066578201069L;
  private final String accessToken;
  private final String appId;

  private AppEventsLogger$AccessTokenAppIdPair$SerializationProxyV1(String paramString1, String paramString2)
  {
    this.accessToken = paramString1;
    this.appId = paramString2;
  }

  private Object readResolve()
  {
    return new AppEventsLogger.AccessTokenAppIdPair(this.accessToken, this.appId);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.AppEventsLogger.AccessTokenAppIdPair.SerializationProxyV1
 * JD-Core Version:    0.6.2
 */