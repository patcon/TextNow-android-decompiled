package com.flurry.sdk;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpRequestBase;

public enum en$a
{
  static
  {
    a[] arrayOfa = new a[6];
    arrayOfa[0] = a;
    arrayOfa[1] = b;
    arrayOfa[2] = c;
    arrayOfa[3] = d;
    arrayOfa[4] = e;
    arrayOfa[5] = f;
  }

  public final HttpRequestBase a(String paramString)
  {
    switch (en.3.a[ordinal()])
    {
    default:
      return null;
    case 1:
      return new HttpPost(paramString);
    case 2:
      return new HttpPut(paramString);
    case 3:
      return new HttpDelete(paramString);
    case 4:
      return new HttpHead(paramString);
    case 5:
    }
    return new HttpGet(paramString);
  }

  public final String toString()
  {
    switch (en.3.a[ordinal()])
    {
    default:
      return null;
    case 1:
      return "POST";
    case 2:
      return "PUT";
    case 3:
      return "DELETE";
    case 4:
      return "HEAD";
    case 5:
    }
    return "GET";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.en.a
 * JD-Core Version:    0.6.2
 */