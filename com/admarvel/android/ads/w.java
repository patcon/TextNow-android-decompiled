package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;
import java.util.concurrent.atomic.AtomicBoolean;

class w
{
  @SuppressLint({"SetJavaScriptEnabled"})
  static void a(WebView paramWebView, Context paramContext, AtomicBoolean paramAtomicBoolean, boolean paramBoolean)
  {
    paramWebView.getSettings().setJavaScriptEnabled(true);
    paramWebView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
    paramWebView.getSettings().setAllowFileAccess(true);
    paramWebView.getSettings().setPluginState(WebSettings.PluginState.OFF);
    paramWebView.getSettings().setUseWideViewPort(true);
    paramWebView.getSettings().setLoadWithOverviewMode(true);
    paramWebView.getSettings().setAppCacheEnabled(true);
    paramWebView.getSettings().setDomStorageEnabled(true);
    paramWebView.getSettings().setAllowFileAccessFromFileURLs(true);
    paramWebView.getSettings().setAllowUniversalAccessFromFileURLs(true);
    paramWebView.getSettings().setAllowContentAccess(true);
    paramWebView.getSettings().setAllowFileAccess(true);
    if ((r.c()) && (paramBoolean))
      paramWebView.setLayerType(1, null);
    if (paramAtomicBoolean.get() == true)
    {
      paramWebView.getSettings().setBuiltInZoomControls(true);
      paramWebView.getSettings().setSupportZoom(true);
      paramWebView.getSettings().setDisplayZoomControls(false);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.w
 * JD-Core Version:    0.6.2
 */