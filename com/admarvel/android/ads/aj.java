package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

class aj
{
  @SuppressLint({"SetJavaScriptEnabled"})
  static void a(WebView paramWebView, Context paramContext, AtomicBoolean paramAtomicBoolean)
  {
    paramWebView.getSettings().setJavaScriptEnabled(true);
    paramWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    paramWebView.getSettings().setAllowFileAccess(true);
    paramWebView.getSettings().setPluginsEnabled(false);
    paramWebView.getSettings().setUseWideViewPort(true);
    paramWebView.getSettings().setLoadWithOverviewMode(true);
    paramWebView.getSettings().setAppCacheEnabled(true);
    paramWebView.getSettings().setDomStorageEnabled(true);
    if (paramAtomicBoolean.get() == true)
    {
      paramWebView.getSettings().setBuiltInZoomControls(true);
      paramWebView.getSettings().setSupportZoom(true);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.aj
 * JD-Core Version:    0.6.2
 */