package com.flurry.sdk;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.flurry.android.impl.ads.FlurryAdModule;
import com.flurry.android.impl.ads.avro.protocol.v10.AdUnit;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class g$b extends WebViewClient
{
  private g$b(g paramg)
  {
  }

  public void onLoadResource(WebView paramWebView, String paramString)
  {
    eo.a(3, g.a(this.a), "onLoadResource: url = " + paramString);
    super.onLoadResource(paramWebView, paramString);
    if ((paramString == null) || (paramWebView == null) || (paramWebView != g.b(this.a)));
    do
    {
      do
      {
        do
        {
          String str;
          do
          {
            do
            {
              return;
              if (!paramString.equalsIgnoreCase(g.b(this.a).getUrl()))
                g.c(this.a);
            }
            while (g.d(this.a));
            str = Uri.parse(paramString).getLastPathSegment();
          }
          while ((str == null) || (!str.equalsIgnoreCase("mraid.js")));
          g.a(this.a, true);
          if (!g.e(this.a))
            break;
          g.f(this.a);
        }
        while (!g.g(this.a));
        g.h(this.a);
        g.i(this.a);
        g.j(this.a);
        g.k(this.a);
        return;
      }
      while (!g.g(this.a));
      g.l(this.a);
    }
    while ((!this.a.e()) || (this.a.getCurrentBinding() != 2));
    g.m(this.a);
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    eo.a(3, g.a(this.a), "onPageFinished: url = " + paramString);
    if ((paramString == null) || (paramWebView == null) || (paramWebView != g.b(this.a)));
    do
    {
      do
      {
        do
        {
          return;
          g.c(this.a);
          g.p(this.a);
          g.q(this.a);
          if ((!this.a.a(g.b(this.a))) && ((this.a.getCurrentBinding() == 2) || (this.a.getCurrentBinding() == 1)))
          {
            eo.a(3, g.a(this.a), "adding WebView to AdUnityView");
            this.a.addView(g.b(this.a));
          }
          g.b(this.a, true);
          if (!g.e(this.a))
            break;
        }
        while (!g.d(this.a));
        g.h(this.a);
        g.i(this.a);
        g.j(this.a);
        g.k(this.a);
        return;
      }
      while (!g.d(this.a));
      g.l(this.a);
    }
    while ((!this.a.e()) || (this.a.getCurrentBinding() != 2));
    g.m(this.a);
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    eo.a(3, g.a(this.a), "onPageStarted: url = " + paramString);
    if ((paramString == null) || (paramWebView == null) || (paramWebView != g.b(this.a)))
      return;
    g.n(this.a);
    g.o(this.a);
    g.b(this.a, false);
    g.a(this.a, false);
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    eo.a(3, g.a(this.a), "onReceivedError: url = " + paramString2);
    g.q(this.a);
    Uri localUri = Uri.parse(paramString2);
    if ("market".equals(localUri.getScheme()))
    {
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.setData(localUri);
      this.a.getContext().startActivity(localIntent);
      g.t(this.a);
      return;
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("errorCode", Integer.toString(b.q.a()));
    localHashMap.put("webViewErrorCode", Integer.toString(paramInt));
    localHashMap.put("failingUrl", paramString2);
    this.a.a("renderFailed", localHashMap, this.a.getAdUnit(), this.a.getAdLog(), this.a.getAdFrameIndex(), 0);
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    eo.a(3, g.a(this.a), "shouldOverrideUrlLoading: url = " + paramString);
    if ((paramString == null) || (paramWebView == null) || (paramWebView != g.b(this.a)))
      return false;
    String str1 = cf.c(g.b(this.a).getUrl());
    if ((!TextUtils.isEmpty(str1)) && (paramString.startsWith(str1)))
    {
      String str4 = paramString.substring(str1.length());
      Uri localUri2 = Uri.parse(str4);
      if ((localUri2.isHierarchical()) && (!TextUtils.isEmpty(localUri2.getScheme())) && (!TextUtils.isEmpty(localUri2.getAuthority())))
      {
        eo.a(3, g.a(this.a), "shouldOverrideUrlLoading: target url = " + str4);
        paramString = str4;
      }
    }
    Uri localUri1 = Uri.parse(paramString);
    if ("flurry".equals(localUri1.getScheme()))
    {
      String str3 = localUri1.getQueryParameter("event");
      Map localMap;
      if (str3 != null)
      {
        g.r(this.a).add(str3);
        localMap = fe.f(localUri1.getEncodedQuery());
        if (!localMap.containsKey("guid"))
          break label307;
        AdUnit localAdUnit2 = g.a(this.a, (String)localMap.get("guid"));
        e locale = g.b(this.a, (String)localMap.get("guid"));
        if ((localAdUnit2 != null) && (locale != null))
          this.a.a(str3, localMap, localAdUnit2, locale, 0, 0);
      }
      while (true)
      {
        return true;
        label307: this.a.a(str3, localMap, this.a.getAdUnit(), this.a.getAdLog(), this.a.getAdFrameIndex(), 0);
      }
    }
    if (g.s(this.a))
    {
      g.c(this.a, false);
      this.a.a("clicked", Collections.emptyMap(), this.a.getAdUnit(), this.a.getAdLog(), this.a.getAdFrameIndex(), 0);
    }
    if (this.a.e())
    {
      String str2 = cf.a(paramString);
      if (str2 != null)
      {
        boolean bool1 = cf.e(str2);
        boolean bool2 = false;
        if (bool1)
          bool2 = this.a.getPlatformModule().a().b(this.a.getContext(), str2, this.a.getAdUnit().b().toString());
        if (!bool2)
          g.b(this.a).loadUrl(str2);
      }
    }
    while (true)
    {
      return true;
      r localr = this.a.getPlatformModule().a();
      Context localContext = this.a.getContext();
      AdUnit localAdUnit1 = this.a.getAdUnit();
      localr.a(localContext, paramString, true, localAdUnit1, true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.g.b
 * JD-Core Version:    0.6.2
 */