package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class m$c extends WebViewClient
{
  m$c(m paramm)
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
    m.a(this.a, true);
    Logging.log("Load Ad: onPageFinished");
    if (AdMarvelUtils.isLogDumpEnabled())
      paramWebView.loadUrl("javascript:window.ADMARVEL.fetchWebViewHtmlContent(document.getElementsByTagName('html')[0].outerHTML);");
    if (!this.a.S)
    {
      this.a.setVisibility(8);
      ((d)this.a.findViewWithTag(this.a.s + "INTERNAL")).setLayoutParamsForBanner(true);
    }
    if ((!this.a.p.get()) && (this.a.b.compareAndSet(true, false)))
    {
      if (m.a(this.a.s) == null)
        break label192;
      d.a(this.a.s, (b)m.h(this.a).get());
      m.a(this.a.s).a(this.a, m.c(this.a));
    }
    while (true)
    {
      this.a.q.set(true);
      return;
      label192: Logging.log("Load Ad: onPageFinished - No listener found");
    }
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    Logging.log("Load Ad: onPageStarted");
    this.a.q.set(false);
    if (Version.getAndroidSDKVersion() > 18)
      new Handler(Looper.getMainLooper()).postDelayed(new m.v(this.a, paramString), Constants.WAIT_FOR_ON_PAGE_FINISHED);
  }

  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    d.b(this.a.s);
    Logging.log("Load Ad: onReceivedError - Failing Url " + paramString2);
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    if ((this.a.b.compareAndSet(true, false)) && (m.a(this.a.s) != null))
      m.a(this.a.s).a(this.a, m.c(this.a), 305, r.a(305));
  }

  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    int i = 8192;
    int j = 0;
    Logging.log("Load Ad : shouldInterceptRequest URL - " + paramString);
    if (paramString == null)
      return null;
    byte[] arrayOfByte2;
    if (paramString.equals("http://baseurl.admarvel.com/mraid.js"))
    {
      File localFile1 = ((d)this.a.findViewWithTag(this.a.s + "INTERNAL")).getContext().getDir("adm_mraid_file", 0);
      File localFile2 = null;
      if (localFile1 != null)
      {
        boolean bool = localFile1.isDirectory();
        localFile2 = null;
        if (bool)
          localFile2 = new File(localFile1.getAbsolutePath() + "/mraid.js");
      }
      if ((localFile2 != null) && (localFile2.exists()))
        try
        {
          Logging.log("Mraid loading from client");
          WebResourceResponse localWebResourceResponse2 = new WebResourceResponse("text/css", "UTF-8", new FileInputStream(localFile2));
          return localWebResourceResponse2;
        }
        catch (Exception localException2)
        {
          Logging.log(Log.getStackTraceString(localException2));
          return super.shouldInterceptRequest(paramWebView, paramString);
        }
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
        int k = localHttpURLConnection.getResponseCode();
        int m = localHttpURLConnection.getContentLength();
        Logging.log("Mraid Connection Status Code: " + k);
        Logging.log("Mraid Content Length: " + m);
        if (k != 200)
          break label580;
        localInputStream = (InputStream)localHttpURLConnection.getContent();
        localArrayList = new ArrayList();
        n = 0;
        while (i != -1)
        {
          byte[] arrayOfByte1 = new byte[8192];
          i = localInputStream.read(arrayOfByte1, 0, 8192);
          if (i > 0)
          {
            m.e locale1 = new m.e(null);
            locale1.a = arrayOfByte1;
            locale1.b = i;
            n += i;
            localArrayList.add(locale1);
          }
        }
      }
      catch (Exception localException1)
      {
        Logging.log(Log.getStackTraceString(localException1));
        return super.shouldInterceptRequest(paramWebView, paramString);
      }
      localInputStream.close();
      if (n <= 0)
        break label598;
      arrayOfByte2 = new byte[n];
      for (int i1 = 0; i1 < localArrayList.size(); i1++)
      {
        m.e locale2 = (m.e)localArrayList.get(i1);
        System.arraycopy(locale2.a, 0, arrayOfByte2, j, locale2.b);
        j += locale2.b;
      }
    }
    label580: label598: for (String str = new String(arrayOfByte2); ; str = "")
    {
      return new WebResourceResponse("text/css", "UTF-8", new ByteArrayInputStream(str.getBytes()));
      WebResourceResponse localWebResourceResponse1 = super.shouldInterceptRequest(paramWebView, paramString);
      return localWebResourceResponse1;
      return super.shouldInterceptRequest(paramWebView, paramString);
    }
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Logging.log("Load Ad : shouldOverrideUrlLoading URL - " + paramString);
    d locald = (d)this.a.findViewWithTag(this.a.s + "INTERNAL");
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
      if ((locald != null) && (!locald.c()) && ((paramString == null) || (paramString.length() <= 0) || ((!paramString.startsWith("admarvelsdk")) && (!paramString.startsWith("admarvelinternal")))))
        return true;
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
        Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(r.a(paramString, "admarvelexternal", "", r.a(paramString, "admarvelexternal"), this.a.getContext())));
        localIntent2.addFlags(268435456);
        if (r.a(this.a.getContext(), localIntent2))
          this.a.getContext().startActivity(localIntent2);
        new r(this.a.getContext()).c(m.f(this.a));
        return true;
      }
      if ((paramString != null) && (r.a(paramString, "admarvelcustomvideo") != r.q.c))
      {
        Intent localIntent1 = new Intent(this.a.getContext(), AdMarvelVideoActivity.class);
        localIntent1.addFlags(268435456);
        m.c(this.a).removeNonStringEntriesTargetParam();
        try
        {
          ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
          ObjectOutputStream localObjectOutputStream = new ObjectOutputStream(localByteArrayOutputStream);
          localObjectOutputStream.writeObject(m.c(this.a));
          localObjectOutputStream.close();
          localIntent1.putExtra("serialized_admarvelad", localByteArrayOutputStream.toByteArray());
          localIntent1.putExtra("url", paramString);
          localIntent1.putExtra("isCustomUrl", true);
          localIntent1.putExtra("xml", m.f(this.a));
          localIntent1.putExtra("source", m.g(this.a));
          localIntent1.putExtra("GUID", this.a.s);
          this.a.getContext().startActivity(localIntent1);
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
    if ((this.a.r.get() == true) || ((locald != null) && (locald.c())))
      this.a.c(paramString);
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.c
 * JD-Core Version:    0.6.2
 */