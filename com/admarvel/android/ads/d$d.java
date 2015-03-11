package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class d$d extends WebViewClient
{
  private final WeakReference<d> a;
  private final WeakReference<Context> b;
  private final AdMarvelAd c;

  public d$d(d paramd, Context paramContext, AdMarvelAd paramAdMarvelAd)
  {
    this.a = new WeakReference(paramd);
    this.b = new WeakReference(paramContext);
    this.c = paramAdMarvelAd;
  }

  public void onLoadResource(WebView paramWebView, String paramString)
  {
    super.onLoadResource(paramWebView, paramString);
    d locald = (d)this.a.get();
    if (locald == null);
    while ((d.a(locald)) || (!d.g(locald)) || (!paramString.contains("mraid.js")))
      return;
    paramWebView.loadUrl("javascript: (function() { var script=document.createElement('script');script.type='text/javascript';script.src='http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js';document.getElementsByTagName('head').item(0).appendChild(script);})()");
    d.a(locald, false);
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    d locald = (d)this.a.get();
    if (locald == null);
    Context localContext;
    do
    {
      do
        return;
      while (d.a(locald));
      localContext = (Context)this.b.get();
    }
    while ((localContext == null) || (d.a(locald)));
    Logging.log("Load Ad: onPageFinished");
    if (d.h(locald).get())
      d.b(locald, true);
    while (true)
    {
      new Handler(Looper.getMainLooper()).post(new d.l(locald, localContext));
      return;
      d.d(locald, true);
    }
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    d locald = (d)this.a.get();
    if (locald == null);
    label17: Context localContext;
    do
    {
      do
      {
        do
        {
          break label17;
          do
            return;
          while (d.a(locald));
          Logging.log("Load Ad: onPageStarted");
          if ((locald.getParent() != null) && ((locald.getParent() instanceof RelativeLayout)))
          {
            RelativeLayout localRelativeLayout = (RelativeLayout)locald.getParent();
            o localo = (o)localRelativeLayout.findViewWithTag(locald.s + "CONTROLS");
            if (localo != null)
            {
              locald.setVisibility(0);
              localo.setVisibility(0);
              localo.findViewWithTag(locald.s + "PROGRESS_BAR").setVisibility(0);
              ((ProgressBar)localo.findViewWithTag(locald.s + "PROGRESS_BAR")).setProgress(10);
              localRelativeLayout.requestLayout();
            }
          }
          localContext = (Context)this.b.get();
        }
        while (localContext == null);
        if (!d.h(locald).get())
          break;
      }
      while (!d.i(locald));
      d.b(locald, false);
      new Handler(Looper.getMainLooper()).postDelayed(new d.h(locald, localContext), Constants.WAIT_FOR_INAPP_BROWSER);
      d.c(locald, false);
      return;
    }
    while (!d.j(locald));
    d.d(locald, false);
    new Handler(Looper.getMainLooper()).postDelayed(new d.i(locald, localContext), Constants.WAIT_FOR_INTERSTITIAL);
    d.e(locald, false);
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    Context localContext = (Context)this.b.get();
    if ((localContext != null) && ((localContext instanceof Activity)))
    {
      Activity localActivity = (Activity)localContext;
      if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
      {
        AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)localActivity;
        if (localAdMarvelActivity != null)
        {
          Logging.log("onReceivedError - Closing AdMarvel FullScreen due to bad URL : " + paramString2);
          localAdMarvelActivity.g();
        }
      }
    }
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    d locald = (d)this.a.get();
    if (locald == null)
      return false;
    if (d.a(locald))
      return false;
    return d.a(locald, paramString);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.d
 * JD-Core Version:    0.6.2
 */