package com.admarvel.android.ads;

import java.util.Map;

public class AdMarvelHttpPost
{
  private String a;
  private String b;
  private Map<String, String> c;

  public String getEndpointUrl()
  {
    return this.a;
  }

  public Map<String, String> getHttpHeaders()
  {
    return this.c;
  }

  public String getPostString()
  {
    return this.b;
  }

  public void setEndpointUrl(String paramString)
  {
    this.a = paramString;
  }

  public void setHttpHeaders(Map<String, String> paramMap)
  {
    this.c = paramMap;
  }

  public void setPostString(String paramString)
  {
    this.b = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelHttpPost
 * JD-Core Version:    0.6.2
 */