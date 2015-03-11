package com.stripe.net;

import java.util.List;
import java.util.Map;

public class StripeResponse
{
  String responseBody;
  int responseCode;
  Map<String, List<String>> responseHeaders;

  public StripeResponse(int paramInt, String paramString)
  {
    this.responseCode = paramInt;
    this.responseBody = paramString;
    this.responseHeaders = null;
  }

  public StripeResponse(int paramInt, String paramString, Map<String, List<String>> paramMap)
  {
    this.responseCode = paramInt;
    this.responseBody = paramString;
    this.responseHeaders = paramMap;
  }

  public String getResponseBody()
  {
    return this.responseBody;
  }

  public int getResponseCode()
  {
    return this.responseCode;
  }

  public Map<String, List<String>> getResponseHeaders()
  {
    return this.responseHeaders;
  }

  public void setResponseBody(String paramString)
  {
    this.responseBody = paramString;
  }

  public void setResponseCode(int paramInt)
  {
    this.responseCode = paramInt;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.stripe.net.StripeResponse
 * JD-Core Version:    0.6.2
 */