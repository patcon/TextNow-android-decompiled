package com.google.android.gms.internal;

import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URI;
import java.net.URISyntaxException;

public class fc extends WebViewClient
{
  private final ex lN;
  private final String sT = G(paramString);
  private boolean sU = false;
  private final do sV;

  public fc(do paramdo, ex paramex, String paramString)
  {
    this.lN = paramex;
    this.sV = paramdo;
  }

  private String G(String paramString)
  {
    if (TextUtils.isEmpty(paramString));
    while (true)
    {
      return paramString;
      try
      {
        if (paramString.endsWith("/"))
        {
          String str = paramString.substring(0, -1 + paramString.length());
          return str;
        }
      }
      catch (IndexOutOfBoundsException localIndexOutOfBoundsException)
      {
        eu.A(localIndexOutOfBoundsException.getMessage());
      }
    }
    return paramString;
  }

  protected boolean F(String paramString)
  {
    String str1 = G(paramString);
    if (TextUtils.isEmpty(str1));
    while (true)
    {
      return false;
      try
      {
        URI localURI1 = new URI(str1);
        if ("passback".equals(localURI1.getScheme()))
        {
          eu.z("Passback received");
          this.sV.bp();
          return true;
        }
        if (!TextUtils.isEmpty(this.sT))
        {
          URI localURI2 = new URI(this.sT);
          String str2 = localURI2.getHost();
          String str3 = localURI1.getHost();
          String str4 = localURI2.getPath();
          String str5 = localURI1.getPath();
          if ((hk.equal(str2, str3)) && (hk.equal(str4, str5)))
          {
            eu.z("Passback received");
            this.sV.bp();
            return true;
          }
        }
      }
      catch (URISyntaxException localURISyntaxException)
      {
        eu.A(localURISyntaxException.getMessage());
      }
    }
    return false;
  }

  public void onLoadResource(WebView paramWebView, String paramString)
  {
    eu.z("JavascriptAdWebViewClient::onLoadResource: " + paramString);
    if (!F(paramString))
      this.lN.cb().onLoadResource(this.lN, paramString);
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    eu.z("JavascriptAdWebViewClient::onPageFinished: " + paramString);
    if (!this.sU)
    {
      this.sV.bo();
      this.sU = true;
    }
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    eu.z("JavascriptAdWebViewClient::shouldOverrideUrlLoading: " + paramString);
    if (F(paramString))
    {
      eu.z("shouldOverrideUrlLoading: received passback url");
      return true;
    }
    return this.lN.cb().shouldOverrideUrlLoading(this.lN, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.fc
 * JD-Core Version:    0.6.2
 */