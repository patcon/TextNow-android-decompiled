package com.flurry.sdk;

import org.apache.http.client.HttpClient;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.SingleClientConnManager;
import org.apache.http.params.HttpParams;

public final class ek
{
  private static SchemeRegistry a;

  public static HttpClient a(HttpParams paramHttpParams)
  {
    return new DefaultHttpClient(new SingleClientConnManager(paramHttpParams, a()), paramHttpParams);
  }

  private static SchemeRegistry a()
  {
    try
    {
      SchemeRegistry localSchemeRegistry2;
      if (a != null)
      {
        localSchemeRegistry2 = a;
        return localSchemeRegistry2;
      }
      SchemeRegistry localSchemeRegistry1 = new SchemeRegistry();
      a = localSchemeRegistry1;
      localSchemeRegistry1.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
      if (eo.d())
        a.register(new Scheme("https", new ei(), 443));
      while (true)
      {
        localSchemeRegistry2 = a;
        break;
        a.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
      }
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ek
 * JD-Core Version:    0.6.2
 */