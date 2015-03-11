package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
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

class AdMarvelInternalWebView$c extends WebViewClient
{
  private final WeakReference<AdMarvelInternalWebView> a;
  private final WeakReference<Context> b;
  private final AdMarvelAd c;

  public AdMarvelInternalWebView$c(AdMarvelInternalWebView paramAdMarvelInternalWebView, Context paramContext, AdMarvelAd paramAdMarvelAd)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = new WeakReference(paramContext);
    this.c = paramAdMarvelAd;
  }

  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null);
    Context localContext;
    do
    {
      do
        return;
      while (AdMarvelInternalWebView.a(localAdMarvelInternalWebView));
      localContext = (Context)this.b.get();
    }
    while ((localContext == null) || (AdMarvelInternalWebView.a(localAdMarvelInternalWebView)));
    Logging.log("Load Ad: onPageFinished");
    if (AdMarvelInternalWebView.f(localAdMarvelInternalWebView).get())
      AdMarvelInternalWebView.b(true);
    while (true)
    {
      AdMarvelInternalWebView.h(localAdMarvelInternalWebView).post(new AdMarvelInternalWebView.k(localAdMarvelInternalWebView, localContext));
      return;
      AdMarvelInternalWebView.d(true);
    }
  }

  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null);
    Context localContext;
    do
    {
      do
      {
        do
          return;
        while (AdMarvelInternalWebView.a(localAdMarvelInternalWebView));
        Logging.log("Load Ad: onPageStarted");
        if (AdMarvelInternalWebView.d(localAdMarvelInternalWebView).get() == true)
        {
          ViewParent localViewParent = localAdMarvelInternalWebView.getParent();
          w localw = null;
          if (localViewParent != null)
          {
            boolean bool = localAdMarvelInternalWebView.getParent() instanceof RelativeLayout;
            localw = null;
            if (bool)
              localw = (w)((RelativeLayout)localAdMarvelInternalWebView.getParent()).findViewWithTag(localAdMarvelInternalWebView.GUID + "CONTROLS");
          }
          if ((localw != null) && (AdMarvelInternalWebView.e(localAdMarvelInternalWebView).get() == true))
            localw.findViewWithTag(localAdMarvelInternalWebView.GUID + "PROGRESS_BAR").setVisibility(0);
        }
        localContext = (Context)this.b.get();
      }
      while (localContext == null);
      if (!AdMarvelInternalWebView.f(localAdMarvelInternalWebView).get())
        break;
      AdMarvelInternalWebView.b(false);
    }
    while (!AdMarvelInternalWebView.k());
    Logging.log(" AdMarvelUtils.WAIT_FOR_INTERSTITIAL " + u.a);
    AdMarvelInternalWebView.h(localAdMarvelInternalWebView).postDelayed(new AdMarvelInternalWebView.g(localAdMarvelInternalWebView, localContext), u.a);
    AdMarvelInternalWebView.c(false);
    return;
    AdMarvelInternalWebView.d(false);
    Logging.log(" AdMarvelUtils.WAIT_FOR_INTERSTITIAL " + u.a);
    AdMarvelInternalWebView.h(localAdMarvelInternalWebView).postDelayed(new AdMarvelInternalWebView.h(localAdMarvelInternalWebView, localContext), u.a);
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
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null)
      return null;
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
      return null;
    if (paramString == null)
      return null;
    byte[] arrayOfByte2;
    if ((paramString.equals("http://baseurl.admarvel.com/mraid.js")) || ((AdMarvelInternalWebView.g(localAdMarvelInternalWebView)) && (paramString.endsWith("mraid.js"))))
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
          break label446;
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
            AdMarvelInternalWebView.e locale1 = new AdMarvelInternalWebView.e(null);
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
        break label464;
      arrayOfByte2 = new byte[n];
      for (int i1 = 0; i1 < localArrayList.size(); i1++)
      {
        AdMarvelInternalWebView.e locale2 = (AdMarvelInternalWebView.e)localArrayList.get(i1);
        System.arraycopy(locale2.a, 0, arrayOfByte2, i, locale2.b);
        i += locale2.b;
      }
    }
    label446: label464: for (String str = new String(arrayOfByte2); ; str = "")
    {
      AdMarvelInternalWebView.a(localAdMarvelInternalWebView, false);
      return new WebResourceResponse("text/css", "UTF-8", new ByteArrayInputStream(str.getBytes()));
      WebResourceResponse localWebResourceResponse = super.shouldInterceptRequest(paramWebView, paramString);
      return localWebResourceResponse;
      return super.shouldInterceptRequest(paramWebView, paramString);
    }
  }

  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
    if (localAdMarvelInternalWebView == null)
      return false;
    if (AdMarvelInternalWebView.a(localAdMarvelInternalWebView))
      return false;
    AdMarvelInternalWebView.a(localAdMarvelInternalWebView, 1 + AdMarvelInternalWebView.i(localAdMarvelInternalWebView));
    Context localContext = (Context)this.b.get();
    AdMarvelActivity localAdMarvelActivity;
    if ((localContext != null) && ((localContext instanceof Activity)))
    {
      Activity localActivity = (Activity)localContext;
      if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
      {
        localAdMarvelActivity = (AdMarvelActivity)localActivity;
        if (localAdMarvelActivity != null)
        {
          if (localAdMarvelActivity.a != null);
          for (AdMarvelActivity.g localg = (AdMarvelActivity.g)localAdMarvelActivity.a.get(); ; localg = null)
          {
            if ((localg != null) && (localg.a()) && (localg.getProgress() >= 10) && (AdMarvelInternalWebView.i(localAdMarvelInternalWebView) > 2) && (AdMarvelInternalWebView.f(localAdMarvelInternalWebView).get() == true))
              AdMarvelInternalWebView.h(localAdMarvelInternalWebView).post(new AdMarvelInternalWebView.k(localAdMarvelInternalWebView, localActivity));
            if (!ab.b(localAdMarvelInternalWebView.getContext(), paramString))
              break;
            new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
            if (!localAdMarvelActivity.c())
              localAdMarvelActivity.g();
            if ((AdMarvelWebView.a(localAdMarvelInternalWebView.GUID) != null) && (this.c != null))
              AdMarvelWebView.a(localAdMarvelInternalWebView.GUID).a(this.c, paramString);
            return true;
          }
          if (localAdMarvelActivity.c())
            break label1234;
          if ((paramString != null) && (ab.a(paramString, "admarvelsdk") != ab.f.c))
          {
            if ((localAdMarvelActivity.d()) && (this.c != null))
              AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, ab.a(paramString, "admarvelsdk", "", ab.a(paramString, "admarvelsdk"), localAdMarvelInternalWebView.getContext()), this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
            while (true)
            {
              new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
              localAdMarvelActivity.g();
              return true;
              if ((AdMarvelWebView.a(localAdMarvelInternalWebView.GUID) != null) && (this.c != null))
                AdMarvelWebView.a(localAdMarvelInternalWebView.GUID).a(this.c, ab.a(paramString, "admarvelsdk", "", ab.a(paramString, "admarvelsdk"), localAdMarvelInternalWebView.getContext()));
            }
          }
          if ((paramString != null) && (ab.a(paramString, "admarvelinternal") != ab.f.c))
          {
            if ((localAdMarvelActivity.d()) && (this.c != null))
              AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, ab.a(paramString, "admarvelinternal", "", ab.a(paramString, "admarvelinternal"), localAdMarvelInternalWebView.getContext()), this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
            while (true)
            {
              new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
              localAdMarvelActivity.g();
              return true;
              if ((AdMarvelWebView.a(localAdMarvelInternalWebView.GUID) != null) && (this.c != null))
                AdMarvelWebView.a(localAdMarvelInternalWebView.GUID).a(this.c, ab.a(paramString, "admarvelinternal", "", ab.a(paramString, "admarvelinternal"), localAdMarvelInternalWebView.getContext()));
            }
          }
          if ((paramString != null) && (ab.a(paramString, "admarvelvideo") != ab.f.c))
          {
            if ((localAdMarvelActivity.d()) && (this.c != null))
              AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
            while (true)
            {
              str2 = ab.a(paramString, "admarvelvideo", "http://", ab.a(paramString, "admarvelvideo"), localAdMarvelInternalWebView.getContext());
              localIntent7 = new Intent("android.intent.action.VIEW");
              localIntent7.addFlags(268435456);
              localIntent7.setDataAndType(Uri.parse(str2), "video/*");
              localAdMarvelInternalWebView.getContext().startActivity(localIntent7);
              new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
              localAdMarvelActivity.g();
              return true;
              if ((AdMarvelWebView.a(localAdMarvelInternalWebView.GUID) != null) && (this.c != null))
                AdMarvelWebView.a(localAdMarvelInternalWebView.GUID).a(this.c, paramString);
            }
          }
          if ((paramString == null) || (ab.a(paramString, "admarvelcustomvideo") == ab.f.c))
            break label1121;
          if ((!localAdMarvelActivity.d()) || (this.c == null))
            break label1074;
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
          localIntent6 = new Intent(localAdMarvelInternalWebView.getContext(), AdMarvelVideoActivity.class);
          localIntent6.addFlags(268435456);
          this.c.removeNonStringEntriesTargetParam();
        }
      }
    }
    label1074: label1121: 
    while (!localAdMarvelActivity.c())
      while (true)
      {
        try
        {
          String str2;
          Intent localIntent7;
          Intent localIntent6;
          ByteArrayOutputStream localByteArrayOutputStream2 = new ByteArrayOutputStream();
          ObjectOutputStream localObjectOutputStream2 = new ObjectOutputStream(localByteArrayOutputStream2);
          localObjectOutputStream2.writeObject(this.c);
          localObjectOutputStream2.close();
          localIntent6.putExtra("serialized_admarvelad", localByteArrayOutputStream2.toByteArray());
          localIntent6.putExtra("url", paramString);
          localIntent6.putExtra("isCustomUrl", true);
          localIntent6.putExtra("xml", AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
          localIntent6.putExtra("GUID", localAdMarvelInternalWebView.GUID);
          localAdMarvelInternalWebView.getContext().startActivity(localIntent6);
          new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
          localAdMarvelActivity.g();
          if ((ac.a() < 4) || (!t.a(paramString, localAdMarvelInternalWebView.getContext())))
            break;
          return true;
          if ((AdMarvelWebView.a(localAdMarvelInternalWebView.GUID) == null) || (this.c == null))
            continue;
          AdMarvelWebView.a(localAdMarvelInternalWebView.GUID).a(this.c, paramString);
        }
        catch (IOException localIOException2)
        {
          localIOException2.printStackTrace();
          continue;
        }
        if ((paramString != null) && (ab.a(paramString, "admarvelexternal") != ab.f.c))
        {
          Intent localIntent5 = new Intent("android.intent.action.VIEW", Uri.parse(ab.a(paramString, "admarvelexternal", "", ab.a(paramString, "admarvelexternal"), localAdMarvelInternalWebView.getContext())));
          localIntent5.addFlags(268435456);
          if (ab.a(localAdMarvelInternalWebView.getContext(), localIntent5))
            localAdMarvelInternalWebView.getContext().startActivity(localIntent5);
          new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
          localAdMarvelActivity.g();
        }
      }
    label1234: if (AdMarvelInterstitialAds.getEnableClickRedirect())
    {
      if ((paramString != null) && (ab.a(paramString, "admarvelsdk") != ab.f.c))
      {
        if (this.c != null)
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, ab.a(paramString, "admarvelsdk", "", ab.a(paramString, "admarvelsdk"), localAdMarvelInternalWebView.getContext()), this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
        return true;
      }
      if ((paramString != null) && (ab.a(paramString, "admarvelinternal") != ab.f.c))
      {
        if (this.c != null)
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, ab.a(paramString, "admarvelinternal", "", ab.a(paramString, "admarvelinternal"), localAdMarvelInternalWebView.getContext()), this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
        return true;
      }
      if ((paramString == null) || (ab.a(paramString, "admarvelvideo") == ab.f.c))
        break label1666;
      if (this.c != null)
        AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
      String str1 = ab.a(paramString, "admarvelvideo", "http://", ab.a(paramString, "admarvelvideo"), localAdMarvelInternalWebView.getContext());
      Intent localIntent4 = new Intent("android.intent.action.VIEW");
      localIntent4.addFlags(268435456);
      localIntent4.setDataAndType(Uri.parse(str1), "video/*");
      if (ab.a(localAdMarvelInternalWebView.getContext(), localIntent4))
        localAdMarvelInternalWebView.getContext().startActivity(localIntent4);
      new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
    }
    while (true)
    {
      if (this.c != null)
        AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
      return true;
      label1666: if ((paramString != null) && (ab.a(paramString, "admarvelcustomvideo") != ab.f.c))
      {
        if ((localAdMarvelActivity.d()) && (this.c != null))
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.c.getSiteId(), this.c.getId(), this.c.getTargetParams(), this.c.getIpAddress());
        while (true)
        {
          Intent localIntent3 = new Intent(localAdMarvelInternalWebView.getContext(), AdMarvelVideoActivity.class);
          localIntent3.addFlags(268435456);
          localIntent3.putExtra("url", paramString);
          localIntent3.putExtra("isCustomUrl", true);
          localIntent3.putExtra("isInterstitial", false);
          localIntent3.putExtra("isInterstitialClick", true);
          localIntent3.putExtra("xml", AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
          localIntent3.putExtra("GUID", localAdMarvelInternalWebView.GUID);
          localAdMarvelInternalWebView.getContext().startActivity(localIntent3);
          new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
          break;
          if ((AdMarvelWebView.a(localAdMarvelInternalWebView.GUID) != null) && (this.c != null))
            AdMarvelWebView.a(localAdMarvelInternalWebView.GUID).a(this.c, paramString);
        }
      }
      if ((paramString != null) && (ab.a(paramString, "admarvelexternal") != ab.f.c))
      {
        Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(ab.a(paramString, "admarvelexternal", "", ab.a(paramString, "admarvelexternal"), localAdMarvelInternalWebView.getContext())));
        localIntent2.addFlags(268435456);
        if (ab.a(localAdMarvelInternalWebView.getContext(), localIntent2))
          localAdMarvelInternalWebView.getContext().startActivity(localIntent2);
        new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
      }
      else if ((AdMarvelInternalWebView.k(localAdMarvelInternalWebView).get() == true) && (paramString != null) && (paramString.length() > 0))
      {
        Intent localIntent1 = new Intent(localAdMarvelInternalWebView.getContext(), AdMarvelActivity.class);
        localIntent1.addFlags(268435456);
        localIntent1.putExtra("url", paramString);
        localIntent1.putExtra("isInterstitial", false);
        localIntent1.putExtra("isInterstitialClick", true);
        localIntent1.putExtra("xml", AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
        localIntent1.putExtra("GUID", localAdMarvelInternalWebView.GUID);
        try
        {
          if (this.c != null)
          {
            this.c.removeNonStringEntriesTargetParam();
            ByteArrayOutputStream localByteArrayOutputStream1 = new ByteArrayOutputStream();
            ObjectOutputStream localObjectOutputStream1 = new ObjectOutputStream(localByteArrayOutputStream1);
            localObjectOutputStream1.writeObject(this.c);
            localObjectOutputStream1.close();
            localIntent1.putExtra("serialized_admarvelad", localByteArrayOutputStream1.toByteArray());
          }
          if (localAdMarvelActivity.f() != null)
            localIntent1.putExtra("source", localAdMarvelActivity.f());
          localAdMarvelInternalWebView.getContext().startActivity(localIntent1);
          new ab(localAdMarvelInternalWebView.getContext(), AdMarvelInternalWebView.h(localAdMarvelInternalWebView)).b(AdMarvelInternalWebView.j(localAdMarvelInternalWebView));
        }
        catch (IOException localIOException1)
        {
          while (true)
            localIOException1.printStackTrace();
        }
      }
    }
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInternalWebView.c
 * JD-Core Version:    0.6.2
 */