package com.flurry.sdk;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class eh
  implements HostnameVerifier
{
  public boolean verify(String paramString, SSLSession paramSSLSession)
  {
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.eh
 * JD-Core Version:    0.6.2
 */