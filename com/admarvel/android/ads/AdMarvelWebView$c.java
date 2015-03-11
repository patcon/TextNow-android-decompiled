package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicBoolean;

class AdMarvelWebView$c extends WebViewClient
{
  AdMarvelWebView$c(AdMarvelWebView paramAdMarvelWebView)
  {
  }

  public void onLoadResource(WebView paramWebView, String paramString)
  {
    Logging.log("Load Ad : onLoadResource URL - " + paramString);
    super.onLoadResource(paramWebView, paramString);
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    Logging.log("Load Ad: onPageFinished");
    if (AdMarvelUtils.isLogDumpEnabled())
      paramWebView.loadUrl("javascript:window.ADMARVEL.fetchWebViewHtmlContent(document.getElementsByTagName('html')[0].outerHTML);");
    if ((!AdMarvelWebView.m(this.a).get()) && (AdMarvelWebView.k(this.a).compareAndSet(true, false)) && (AdMarvelWebView.a(this.a.e) != null))
      AdMarvelWebView.a(this.a.e).a(this.a, AdMarvelWebView.c(this.a));
    AdMarvelWebView.l(this.a).set(true);
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    Logging.log("Load Ad: onPageStarted");
    AdMarvelWebView.l(this.a).set(false);
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Logging.log("Load Ad : onReceivedError Failing URL - " + paramString2);
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    if ((AdMarvelWebView.k(this.a).compareAndSet(true, false)) && (AdMarvelWebView.a(this.a.e) != null))
      AdMarvelWebView.a(this.a.e).a(this.a, AdMarvelWebView.c(this.a), 305, ab.a(305));
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Logging.log("Load Ad : shouldOverrideUrlLoading URL - " + paramString);
    if (paramString == null)
      return false;
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    try
    {
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.findViewWithTag(this.a.e + "INTERNAL");
      if ((localAdMarvelInternalWebView == null) && (AdMarvelWebView.f(this.a)))
      {
        Context localContext = this.a.getContext();
        if ((localContext != null) && ((localContext instanceof Activity)))
          localAdMarvelInternalWebView = (AdMarvelInternalWebView)((ViewGroup)((Activity)localContext).getWindow().findViewById(16908290)).findViewWithTag(this.a.e + "INTERNAL");
      }
      if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()))
        return false;
      if (ab.d(paramString))
        return true;
      if (AdMarvelWebView.g(this.a))
      {
        if (ab.b(this.a.getContext(), paramString))
        {
          new ab(this.a.getContext(), AdMarvelWebView.d(this.a)).b(AdMarvelWebView.h(this.a));
          return true;
        }
        if ((paramString != null) && (ab.a(paramString, "admarvelsdk") != ab.f.c))
        {
          if (AdMarvelWebView.a(this.a.e) != null)
            AdMarvelWebView.a(this.a.e).a(AdMarvelWebView.c(this.a), ab.a(paramString, "admarvelsdk", "", ab.a(paramString, "admarvelsdk"), this.a.getContext()));
          new ab(this.a.getContext(), AdMarvelWebView.d(this.a)).b(AdMarvelWebView.h(this.a));
          return true;
        }
        if ((paramString != null) && (ab.a(paramString, "admarvelinternal") != ab.f.c))
        {
          if (AdMarvelWebView.a(this.a.e) != null)
            AdMarvelWebView.a(this.a.e).a(AdMarvelWebView.c(this.a), ab.a(paramString, "admarvelinternal", "", ab.a(paramString, "admarvelinternal"), this.a.getContext()));
          new ab(this.a.getContext(), AdMarvelWebView.d(this.a)).b(AdMarvelWebView.h(this.a));
          return true;
        }
        if ((paramString != null) && (ab.a(paramString, "admarvelvideo") != ab.f.c))
        {
          String str = ab.a(paramString, "admarvelvideo", "http://", ab.a(paramString, "admarvelvideo"), this.a.getContext());
          Intent localIntent3 = new Intent("android.intent.action.VIEW");
          localIntent3.addFlags(268435456);
          localIntent3.setDataAndType(Uri.parse(str), "video/*");
          if (ab.a(this.a.getContext(), localIntent3))
            this.a.getContext().startActivity(localIntent3);
          new ab(this.a.getContext(), AdMarvelWebView.d(this.a)).b(AdMarvelWebView.h(this.a));
          return true;
        }
        if ((paramString != null) && (ab.a(paramString, "admarvelexternal") != ab.f.c))
        {
          Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse(ab.a(paramString, "admarvelexternal", "", ab.a(paramString, "admarvelexternal"), this.a.getContext())));
          localIntent1.addFlags(268435456);
          if (ab.a(this.a.getContext(), localIntent1))
            this.a.getContext().startActivity(localIntent1);
          new ab(this.a.getContext(), AdMarvelWebView.d(this.a)).b(AdMarvelWebView.h(this.a));
          return true;
        }
        if ((paramString != null) && (ab.a(paramString, "admarvelcustomvideo") != ab.f.c))
        {
          Intent localIntent2 = new Intent(this.a.getContext(), AdMarvelVideoActivity.class);
          localIntent2.addFlags(268435456);
          localIntent2.putExtra("url", paramString);
          AdMarvelWebView.c(this.a).removeNonStringEntriesTargetParam();
          try
          {
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
            localObjectOutputStream.writeObject(AdMarvelWebView.c(this.a));
            localObjectOutputStream.close();
            localIntent2.putExtra("serialized_admarvelad", localByteArrayOutputStream.toByteArray());
            localIntent2.putExtra("isCustomUrl", true);
            localIntent2.putExtra("xml", AdMarvelWebView.h(this.a));
            localIntent2.putExtra("source", AdMarvelWebView.i(this.a));
            localIntent2.putExtra("GUID", this.a.e);
            this.a.getContext().startActivity(localIntent2);
            new ab(this.a.getContext(), AdMarvelWebView.d(this.a)).b(AdMarvelWebView.h(this.a));
            return true;
          }
          catch (IOException localIOException)
          {
            while (true)
              localIOException.printStackTrace();
          }
        }
      }
    }
    catch (Exception localException)
    {
      Logging.log(localException.getMessage() + "exception in shouldOverrideUrlLoading");
    }
    while (true)
    {
      return true;
      if ((AdMarvelWebView.j(this.a).get() == true) || (localAdMarvelInternalWebView.b()))
        AdMarvelWebView.a(this.a, paramString);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.c
 * JD-Core Version:    0.6.2
 */