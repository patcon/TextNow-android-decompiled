package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class d$e extends WebViewClient
{
  private final WeakReference<d> a;
  private final WeakReference<Context> b;
  private final AdMarvelAd c;

  public d$e(d paramd, Context paramContext, AdMarvelAd paramAdMarvelAd)
  {
    this.a = new WeakReference(paramd);
    this.b = new WeakReference(paramContext);
    this.c = paramAdMarvelAd;
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
    super.onPageStarted(paramWebView, paramString, paramBitmap);
    d locald = (d)this.a.get();
    if (locald == null);
    label24: Context localContext;
    do
    {
      do
      {
        do
        {
          break label24;
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

  public WebResourceResponse shouldInterceptRequest(WebView paramWebView, String paramString)
  {
    int i = 0;
    d locald = (d)this.a.get();
    if (locald == null)
      return null;
    if (d.a(locald))
      return null;
    if (paramString == null)
      return null;
    byte[] arrayOfByte2;
    if ((paramString.equals("http://baseurl.admarvel.com/mraid.js")) || ((d.g(locald)) && (paramString.endsWith("mraid.js"))))
    {
      File localFile1 = locald.getContext().getDir("adm_mraid_file", 0);
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
        int j = localHttpURLConnection.getResponseCode();
        int k = localHttpURLConnection.getContentLength();
        Logging.log("Mraid Connection Status Code: " + j);
        Logging.log("Mraid Content Length: " + k);
        if (j != 200)
          break label579;
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
            d.f localf1 = new d.f(null);
            localf1.a = arrayOfByte1;
            localf1.b = m;
            n += m;
            localArrayList.add(localf1);
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
        break label597;
      arrayOfByte2 = new byte[n];
      for (int i1 = 0; i1 < localArrayList.size(); i1++)
      {
        d.f localf2 = (d.f)localArrayList.get(i1);
        System.arraycopy(localf2.a, 0, arrayOfByte2, i, localf2.b);
        i += localf2.b;
      }
    }
    label579: label597: for (String str = new String(arrayOfByte2); ; str = "")
    {
      d.a(locald, false);
      return new WebResourceResponse("text/css", "UTF-8", new ByteArrayInputStream(str.getBytes()));
      WebResourceResponse localWebResourceResponse1 = super.shouldInterceptRequest(paramWebView, paramString);
      return localWebResourceResponse1;
      return super.shouldInterceptRequest(paramWebView, paramString);
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
 * Qualified Name:     com.admarvel.android.ads.d.e
 * JD-Core Version:    0.6.2
 */