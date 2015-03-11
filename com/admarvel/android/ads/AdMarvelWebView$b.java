package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class AdMarvelWebView$b extends WebViewClient
{
  AdMarvelWebView$b(AdMarvelWebView paramAdMarvelWebView)
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
    AdMarvelWebView.a(this.a, true);
    Logging.log("Load Ad: onPageFinished");
    if (AdMarvelUtils.isLogDumpEnabled())
      paramWebView.loadUrl("javascript:window.ADMARVEL.fetchWebViewHtmlContent(document.getElementsByTagName('html')[0].outerHTML);");
    if ((!AdMarvelWebView.m(this.a).get()) && (AdMarvelWebView.k(this.a).compareAndSet(true, false)))
    {
      if (AdMarvelWebView.a(this.a.e) == null)
        break label134;
      AdMarvelInternalWebView.a(this.a.e, (g)AdMarvelWebView.n(this.a).get());
      AdMarvelWebView.a(this.a.e).a(this.a, AdMarvelWebView.c(this.a));
    }
    while (true)
    {
      AdMarvelWebView.l(this.a).set(true);
      return;
      label134: Logging.log("Load Ad: onPageFinished - No listener found");
    }
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    Logging.log("Load Ad: onPageStarted");
    AdMarvelWebView.l(this.a).set(false);
    if (ac.a() > 18)
    {
      Logging.log(" adding onpagefinsihed callback reciever with delay of 5 sec" + u.b);
      AdMarvelWebView.d(this.a).postDelayed(new AdMarvelWebView.x(this.a, paramString), u.b);
    }
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    AdMarvelInternalWebView.b(this.a.e);
    Logging.log("Load Ad: onReceivedError - Failing Url " + paramString2);
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    if ((AdMarvelWebView.k(this.a).compareAndSet(true, false)) && (AdMarvelWebView.a(this.a.e) != null))
      AdMarvelWebView.a(this.a.e).a(this.a, AdMarvelWebView.c(this.a), 305, ab.a(305));
  }

  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    int i = 0;
    Logging.log("Load Ad : shouldInterceptRequest URL - " + paramString);
    byte[] arrayOfByte2;
    if (paramString.equals("http://baseurl.admarvel.com/mraid.js"))
    {
      InputStream localInputStream;
      ArrayList localArrayList;
      int n;
      try
      {
        HttpURLConnection localHttpURLConnection = (HttpURLConnection)new URL("http://admarvel.s3.amazonaws.com/js/admarvel_mraid_v2_complete.js").openConnection();
        localHttpURLConnection.setRequestMethod("GET");
        localHttpURLConnection.setDoOutput(false);
        localHttpURLConnection.setDoInput(true);
        localHttpURLConnection.setUseCaches(false);
        localHttpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        localHttpURLConnection.setRequestProperty("Content-Length", "0");
        localHttpURLConnection.setConnectTimeout(2000);
        localHttpURLConnection.setReadTimeout(10000);
        int j = localHttpURLConnection.getResponseCode();
        int k = localHttpURLConnection.getContentLength();
        Logging.log("Mraid Connection Status Code: " + j);
        Logging.log("Mraid Content Length: " + k);
        if (j != 200)
          break label409;
        localInputStream = (InputStream)localHttpURLConnection.getContent();
        localArrayList = new ArrayList();
        int m = 8192;
        n = 0;
        while (m != -1)
        {
          byte[] arrayOfByte1 = new byte[8192];
          m = localInputStream.read(arrayOfByte1, 0, 8192);
          if (m > 0)
          {
            AdMarvelWebView.e locale1 = new AdMarvelWebView.e(null);
            locale1.a = arrayOfByte1;
            locale1.b = m;
            n += m;
            localArrayList.add(locale1);
          }
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      localInputStream.close();
      if (n <= 0)
        break label427;
      arrayOfByte2 = new byte[n];
      for (int i1 = 0; i1 < localArrayList.size(); i1++)
      {
        AdMarvelWebView.e locale2 = (AdMarvelWebView.e)localArrayList.get(i1);
        System.arraycopy(locale2.a, 0, arrayOfByte2, i, locale2.b);
        i += locale2.b;
      }
    }
    label409: label427: for (String str = new String(arrayOfByte2); ; str = "")
    {
      return new WebResourceResponse("text/css", "UTF-8", new ByteArrayInputStream(str.getBytes()));
      WebResourceResponse localWebResourceResponse = super.shouldInterceptRequest(paramWebView, paramString);
      return localWebResourceResponse;
      return super.shouldInterceptRequest(paramWebView, paramString);
    }
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Logging.log("Load Ad : shouldOverrideUrlLoading URL - " + paramString);
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.findViewWithTag(this.a.e + "INTERNAL");
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
      if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.b()) && ((paramString == null) || (paramString.length() <= 0) || ((!paramString.startsWith("admarvelsdk")) && (!paramString.startsWith("admarvelinternal")))))
        return true;
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
        Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(ab.a(paramString, "admarvelexternal", "", ab.a(paramString, "admarvelexternal"), this.a.getContext())));
        localIntent2.addFlags(268435456);
        if (ab.a(this.a.getContext(), localIntent2))
          this.a.getContext().startActivity(localIntent2);
        new ab(this.a.getContext(), AdMarvelWebView.d(this.a)).b(AdMarvelWebView.h(this.a));
        return true;
      }
      if ((paramString != null) && (ab.a(paramString, "admarvelcustomvideo") != ab.f.c))
      {
        Intent localIntent1 = new Intent(this.a.getContext(), AdMarvelVideoActivity.class);
        localIntent1.addFlags(268435456);
        AdMarvelWebView.c(this.a).removeNonStringEntriesTargetParam();
        try
        {
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
          localObjectOutputStream.writeObject(AdMarvelWebView.c(this.a));
          localObjectOutputStream.close();
          localIntent1.putExtra("serialized_admarvelad", localByteArrayOutputStream.toByteArray());
          localIntent1.putExtra("url", paramString);
          localIntent1.putExtra("isCustomUrl", true);
          localIntent1.putExtra("xml", AdMarvelWebView.h(this.a));
          localIntent1.putExtra("source", AdMarvelWebView.i(this.a));
          localIntent1.putExtra("GUID", this.a.e);
          this.a.getContext().startActivity(localIntent1);
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
    if ((AdMarvelWebView.j(this.a).get() == true) || ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.b())))
      AdMarvelWebView.a(this.a, paramString);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.b
 * JD-Core Version:    0.6.2
 */