package com.mopub.mobileads.factories;

import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

public class HttpClientFactory
{
  public static final int SOCKET_SIZE = 8192;
  private static HttpClientFactory instance = new HttpClientFactory();

  public static DefaultHttpClient create()
  {
    return instance.internalCreate(0);
  }

  public static DefaultHttpClient create(int paramInt)
  {
    return instance.internalCreate(paramInt);
  }

  @Deprecated
  public static void setInstance(HttpClientFactory paramHttpClientFactory)
  {
    instance = paramHttpClientFactory;
  }

  protected DefaultHttpClient internalCreate(int paramInt)
  {
    BasicHttpParams localBasicHttpParams = new BasicHttpParams();
    if (paramInt > 0)
    {
      HttpConnectionParams.setConnectionTimeout(localBasicHttpParams, paramInt);
      HttpConnectionParams.setSoTimeout(localBasicHttpParams, paramInt);
    }
    HttpConnectionParams.setSocketBufferSize(localBasicHttpParams, 8192);
    return new DefaultHttpClient(localBasicHttpParams);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.HttpClientFactory
 * JD-Core Version:    0.6.2
 */