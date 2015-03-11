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
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class m$b extends WebViewClient
{
  m$b(m paramm)
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
    if (!this.a.S)
    {
      this.a.setVisibility(8);
      ((d)this.a.findViewWithTag(this.a.s + "INTERNAL")).setLayoutParamsForBanner(true);
    }
    if ((!this.a.p.get()) && (this.a.b.compareAndSet(true, false)) && (m.a(this.a.s) != null))
    {
      d.a(this.a.s, (b)m.h(this.a).get());
      m.a(this.a.s).a(this.a, m.c(this.a));
    }
    this.a.q.set(true);
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    Logging.log("Load Ad: onPageStarted");
    this.a.q.set(false);
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Logging.log("Load Ad : onReceivedError Failing URL - " + paramString2);
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    if ((this.a.b.compareAndSet(true, false)) && (m.a(this.a.s) != null))
      m.a(this.a.s).a(this.a, m.c(this.a), 305, r.a(305));
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Logging.log("Load Ad : shouldOverrideUrlLoading URL - " + paramString);
    if (paramString == null)
      return false;
    d locald;
    try
    {
      locald = (d)this.a.findViewWithTag(this.a.s + "INTERNAL");
      if ((locald == null) && (this.a.x))
      {
        Context localContext = this.a.getContext();
        if ((localContext != null) && ((localContext instanceof Activity)))
          locald = (d)((ViewGroup)((Activity)localContext).getWindow().findViewById(16908290)).findViewWithTag(this.a.s + "INTERNAL");
      }
      if ((locald != null) && (locald.b()))
        return false;
      if (r.f(paramString))
        return true;
      if (m.e(this.a))
      {
        if (r.a(this.a.getContext(), paramString, this.a.R))
        {
          new r(this.a.getContext()).c(m.f(this.a));
          return true;
        }
        if ((paramString != null) && (r.a(paramString, "admarvelsdk") != r.q.c))
        {
          if (m.a(this.a.s) != null)
            m.a(this.a.s).a(m.c(this.a), r.a(paramString, "admarvelsdk", "", r.a(paramString, "admarvelsdk"), this.a.getContext()));
          new r(this.a.getContext()).c(m.f(this.a));
          return true;
        }
        if ((paramString != null) && (r.a(paramString, "admarvelinternal") != r.q.c))
        {
          if (m.a(this.a.s) != null)
            m.a(this.a.s).a(m.c(this.a), r.a(paramString, "admarvelinternal", "", r.a(paramString, "admarvelinternal"), this.a.getContext()));
          new r(this.a.getContext()).c(m.f(this.a));
          return true;
        }
        if ((paramString != null) && (r.a(paramString, "admarvelvideo") != r.q.c))
        {
          String str = r.a(paramString, "admarvelvideo", "http://", r.a(paramString, "admarvelvideo"), this.a.getContext());
          Intent localIntent3 = new Intent("android.intent.action.VIEW");
          localIntent3.addFlags(268435456);
          localIntent3.setDataAndType(Uri.parse(str), "video/*");
          if (r.a(this.a.getContext(), localIntent3))
            this.a.getContext().startActivity(localIntent3);
          new r(this.a.getContext()).c(m.f(this.a));
          return true;
        }
        if ((paramString != null) && (r.a(paramString, "admarvelexternal") != r.q.c))
        {
          Intent localIntent1 = new Intent("android.intent.action.VIEW", Uri.parse(r.a(paramString, "admarvelexternal", "", r.a(paramString, "admarvelexternal"), this.a.getContext())));
          localIntent1.addFlags(268435456);
          if (r.a(this.a.getContext(), localIntent1))
            this.a.getContext().startActivity(localIntent1);
          new r(this.a.getContext()).c(m.f(this.a));
          return true;
        }
        if ((paramString != null) && (r.a(paramString, "admarvelcustomvideo") != r.q.c))
        {
          Intent localIntent2 = new Intent(this.a.getContext(), AdMarvelVideoActivity.class);
          localIntent2.addFlags(268435456);
          localIntent2.putExtra("url", paramString);
          m.c(this.a).removeNonStringEntriesTargetParam();
          try
          {
            ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
            localObjectOutputStream.writeObject(m.c(this.a));
            localObjectOutputStream.close();
            localIntent2.putExtra("serialized_admarvelad", localByteArrayOutputStream.toByteArray());
            localIntent2.putExtra("isCustomUrl", true);
            localIntent2.putExtra("xml", m.f(this.a));
            localIntent2.putExtra("source", m.g(this.a));
            localIntent2.putExtra("GUID", this.a.s);
            this.a.getContext().startActivity(localIntent2);
            new r(this.a.getContext()).c(m.f(this.a));
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
      if ((this.a.r.get() == true) || (locald.c()))
        this.a.c(paramString);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.b
 * JD-Core Version:    0.6.2
 */