package com.facebook;

public enum HttpMethod
{
  static
  {
    DELETE = new HttpMethod("DELETE", 2);
    HttpMethod[] arrayOfHttpMethod = new HttpMethod[3];
    arrayOfHttpMethod[0] = GET;
    arrayOfHttpMethod[1] = POST;
    arrayOfHttpMethod[2] = DELETE;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.facebook.HttpMethod
 * JD-Core Version:    0.6.2
 */