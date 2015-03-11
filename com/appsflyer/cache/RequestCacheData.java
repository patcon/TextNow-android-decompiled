package com.appsflyer.cache;

import java.util.Scanner;

public class RequestCacheData
{
  private String cacheKey;
  private String postData;
  private String requestURL;
  private String version;

  public RequestCacheData(String paramString1, String paramString2, String paramString3)
  {
    this.requestURL = paramString1;
    this.postData = paramString2;
    this.version = paramString3;
  }

  public RequestCacheData(char[] paramArrayOfChar)
  {
    Scanner localScanner = new Scanner(new String(paramArrayOfChar));
    while (localScanner.hasNextLine())
    {
      String str = localScanner.nextLine();
      if (str.startsWith("url="))
        this.requestURL = str.substring("url=".length()).trim();
      else if (str.startsWith("version="))
        this.version = str.substring("version=".length()).trim();
      else if (str.startsWith("data="))
        this.postData = str.substring("data=".length()).trim();
    }
    localScanner.close();
  }

  public String getCacheKey()
  {
    return this.cacheKey;
  }

  public String getPostData()
  {
    return this.postData;
  }

  public String getRequestURL()
  {
    return this.requestURL;
  }

  public String getVersion()
  {
    return this.version;
  }

  public void setCacheKey(String paramString)
  {
    this.cacheKey = paramString;
  }

  public void setPostData(String paramString)
  {
    this.postData = paramString;
  }

  public void setRequestURL(String paramString)
  {
    this.requestURL = paramString;
  }

  public void setVersion(String paramString)
  {
    this.version = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.cache.RequestCacheData
 * JD-Core Version:    0.6.2
 */