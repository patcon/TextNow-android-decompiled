package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class fa extends ey
{
  public fa(ex paramex, boolean paramBoolean)
  {
    super(paramex, paramBoolean);
  }

  protected WebResourceResponse c(Context paramContext, String paramString1, String paramString2)
  {
    HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL(paramString2).openConnection();
    try
    {
      eo.a(paramContext, paramString1, true, localHttpURLConnection);
      localHttpURLConnection.connect();
      WebResourceResponse localWebResourceResponse = new WebResourceResponse("application/javascript", "UTF-8", new ByteArrayInputStream(eo.a(new InputStreamReader(localHttpURLConnection.getInputStream())).getBytes("UTF-8")));
      return localWebResourceResponse;
    }
    finally
    {
      localHttpURLConnection.disconnect();
    }
  }

  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    try
    {
      if (!"mraid.js".equalsIgnoreCase(new File(paramString).getName()))
        return super.shouldInterceptRequest(paramWebView, paramString);
      if (!(paramWebView instanceof ex))
      {
        eu.D("Tried to intercept request from a WebView that wasn't an AdWebView.");
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      ex localex = (ex)paramWebView;
      localex.cb().aS();
      if (localex.V().mf)
      {
        eu.C("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_interstitial.js)");
        return c(localex.getContext(), this.lN.cd().sw, "http://media.admob.com/mraid/v1/mraid_app_interstitial.js");
      }
      if (localex.ce())
      {
        eu.C("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js)");
        return c(localex.getContext(), this.lN.cd().sw, "http://media.admob.com/mraid/v1/mraid_app_expanded_banner.js");
      }
      eu.C("shouldInterceptRequest(http://media.admob.com/mraid/v1/mraid_app_banner.js)");
      WebResourceResponse localWebResourceResponse = c(localex.getContext(), this.lN.cd().sw, "http://media.admob.com/mraid/v1/mraid_app_banner.js");
      return localWebResourceResponse;
    }
    catch (IOException localIOException)
    {
      eu.D("Could not fetching MRAID JS. " + localIOException.getMessage());
    }
    return super.shouldInterceptRequest(paramWebView, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fa
 * JD-Core Version:    0.6.2
 */