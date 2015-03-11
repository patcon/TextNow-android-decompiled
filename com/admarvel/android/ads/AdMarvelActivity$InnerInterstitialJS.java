package com.admarvel.android.ads;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Environment;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

class AdMarvelActivity$InnerInterstitialJS
{
  private final WeakReference<AdMarvelActivity> adMarvelActivityReference;
  private final AdMarvelAd adMarvelAd;
  private final WeakReference<AdMarvelInternalWebView> adMarvelInternalWebViewReference;
  private int lastOrientation;
  private String videoUrl;

  public AdMarvelActivity$InnerInterstitialJS(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity, AdMarvelAd paramAdMarvelAd)
  {
    this.adMarvelInternalWebViewReference = new WeakReference(paramAdMarvelInternalWebView);
    this.adMarvelActivityReference = new WeakReference(paramAdMarvelActivity);
    this.adMarvelAd = paramAdMarvelAd;
    this.lastOrientation = paramAdMarvelActivity.getRequestedOrientation();
  }

  @JavascriptInterface
  public void admarvelCheckFrameValues(String paramString)
  {
  }

  @JavascriptInterface
  public void checkForApplicationSupportedOrientations(final String paramString)
  {
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    if (this.adMarvelInternalWebViewReference != null)
    {
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      if ((localAdMarvelInternalWebView == null) || (!localAdMarvelInternalWebView.isSignalShutdown()))
        break label30;
    }
    label30: AdMarvelActivity localAdMarvelActivity;
    final String str1;
    do
    {
      do
      {
        return;
        localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      }
      while (localAdMarvelActivity == null);
      String[] arrayOfString = ab.a(localAdMarvelActivity).split(",");
      HashMap localHashMap = new HashMap();
      localHashMap.put("portrait", "NO");
      localHashMap.put("landscapeLeft", "NO");
      localHashMap.put("landscapeRight", "NO");
      localHashMap.put("portraitUpsideDown", "NO");
      int i = arrayOfString.length;
      int j = 0;
      if (j < i)
      {
        String str2 = arrayOfString[j];
        if (str2.equals("0"))
          localHashMap.put("portrait", "YES");
        while (true)
        {
          j++;
          break;
          if (str2.equals("90"))
            localHashMap.put("landscapeLeft", "YES");
          else if (str2.equals("-90"))
            localHashMap.put("landscapeRight", "YES");
          else if (str2.equals("180"))
            localHashMap.put("portraitUpsideDown", "YES");
        }
      }
      str1 = "\"{portrait:" + (String)localHashMap.get("portrait") + "," + "landscapeLeft:" + (String)localHashMap.get("landscapeLeft") + "," + "landscapeRight:" + (String)localHashMap.get("landscapeRight") + "," + "portraitUpsideDown:" + (String)localHashMap.get("portraitUpsideDown") + "}\"";
    }
    while ((localAdMarvelInternalWebView == null) || (paramString == null));
    AdMarvelActivity.f(localAdMarvelActivity).post(new Runnable()
    {
      public void run()
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + paramString + "(" + str1 + ")");
      }
    });
  }

  @JavascriptInterface
  public void checkNetworkAvailable(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.c(localAdMarvelInternalWebView, paramString));
  }

  @JavascriptInterface
  public void cleanup()
  {
    Logging.log("window.ADMARVEL.cleanup()");
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    while ((AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get() == null)
      return;
    AdMarvelActivity.d locald = new AdMarvelActivity.d(localAdMarvelActivity);
    AdMarvelActivity.f(localAdMarvelActivity).post(locald);
  }

  @JavascriptInterface
  public void closeinterstitialad()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelActivity.q(localAdMarvelActivity).sendEmptyMessage(0);
  }

  @JavascriptInterface
  public void createcalendarevent(final String paramString1, final String paramString2, final String paramString3)
  {
    final AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (!ab.d(localAdMarvelActivity, "android.permission.READ_CALENDAR")) || (!ab.d(localAdMarvelActivity, "android.permission.WRITE_CALENDAR")));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localAdMarvelActivity);
    localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (ac.a() >= 14)
        {
          AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.f(localAdMarvelInternalWebView, localAdMarvelActivity, paramString1, paramString2, paramString3));
          return;
        }
        AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.e(localAdMarvelInternalWebView, localAdMarvelActivity, paramString1, paramString2, paramString3));
      }
    }).setNegativeButton("No", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    localBuilder.create().show();
  }

  @JavascriptInterface
  public void createcalendarevent(final String paramString1, final String paramString2, final String paramString3, final String paramString4, final String paramString5, final String paramString6, final int paramInt)
  {
    final AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (!ab.d(localAdMarvelActivity, "android.permission.READ_CALENDAR")) || (!ab.d(localAdMarvelActivity, "android.permission.WRITE_CALENDAR")));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localAdMarvelActivity);
    localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (ac.a() >= 14)
        {
          AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.f(localAdMarvelInternalWebView, localAdMarvelActivity, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt));
          return;
        }
        AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.e(localAdMarvelInternalWebView, localAdMarvelActivity, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt));
      }
    }).setNegativeButton("No", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        paramAnonymousDialogInterface.cancel();
      }
    });
    localBuilder.create().show();
  }

  @JavascriptInterface
  public void createcalendarevent(final String paramString1, final String paramString2, final String paramString3, final String paramString4, final String paramString5, final String paramString6, final int paramInt1, final String paramString7, final String paramString8, final String paramString9, final String paramString10, final int paramInt2, final int paramInt3, final String paramString11)
  {
    final AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
      if ((ab.d(localAdMarvelActivity, "android.permission.READ_CALENDAR")) && (ab.d(localAdMarvelActivity, "android.permission.WRITE_CALENDAR")))
        break;
    }
    while (paramString11 == null);
    AdMarvelActivity.f(localAdMarvelActivity).post(new Runnable()
    {
      public void run()
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + paramString11 + "(NO)");
      }
    });
    return;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localAdMarvelActivity);
    localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (ac.a() >= 14)
        {
          AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.f(localAdMarvelInternalWebView, localAdMarvelActivity, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt1, paramString7, paramString8, paramString9, paramString10, paramInt2, paramInt3, paramString11));
          return;
        }
        AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.e(localAdMarvelInternalWebView, localAdMarvelActivity, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt1, paramString7, paramString8, paramString9, paramString10, paramInt2, paramInt3, paramString11));
      }
    }).setNegativeButton("No", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (paramString11 != null)
          AdMarvelActivity.f(localAdMarvelActivity).post(new Runnable()
          {
            public void run()
            {
              AdMarvelActivity.InnerInterstitialJS.7.this.val$adMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.InnerInterstitialJS.7.this.val$callback + "(\"NO\")");
            }
          });
        paramAnonymousDialogInterface.cancel();
      }
    });
    localBuilder.create().show();
  }

  @JavascriptInterface
  public void detectlocation(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
    {
      l locall = l.a();
      if (locall != null)
        locall.a(localAdMarvelInternalWebView, paramString);
    }
  }

  @JavascriptInterface
  public void detectsizechange(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
      localAdMarvelInternalWebView.sizeChangeCallback = paramString;
  }

  @JavascriptInterface
  public void detectvisibility(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()) && (!localAdMarvelInternalWebView.isViewDisplayed))
    {
      localAdMarvelInternalWebView.visibilityCallback = paramString;
      if (localAdMarvelInternalWebView.isInterstitialAdDisplayed)
      {
        localAdMarvelInternalWebView.injectJavaScript(paramString + "(" + true + ")");
        localAdMarvelInternalWebView.isViewDisplayed = true;
      }
    }
  }

  @JavascriptInterface
  public void disableautodetect()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
      localAdMarvelInternalWebView.getEnableAutoDetect().set(false);
  }

  @JavascriptInterface
  public void disablebackbutton()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    if (AdMarvelActivity.D(localAdMarvelActivity) != null)
      AdMarvelActivity.f(localAdMarvelActivity).removeCallbacks(AdMarvelActivity.D(localAdMarvelActivity));
    AdMarvelActivity.b(localAdMarvelActivity, true);
  }

  @JavascriptInterface
  public void disablebackbutton(int paramInt)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (paramInt <= 0));
    AdMarvelActivity.b(localAdMarvelActivity, true);
    if (AdMarvelActivity.D(localAdMarvelActivity) != null)
      AdMarvelActivity.f(localAdMarvelActivity).removeCallbacks(AdMarvelActivity.D(localAdMarvelActivity));
    AdMarvelActivity.f(localAdMarvelActivity).postDelayed(AdMarvelActivity.D(localAdMarvelActivity), paramInt);
  }

  @JavascriptInterface
  public void disableclosebutton(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    while ((paramString == null) || (!paramString.equals("true")))
      return;
    sdkclosebutton("false", "false");
  }

  @JavascriptInterface
  public void disablerotations()
  {
    if ((this.adMarvelInternalWebViewReference.get() != null) && (((AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get()).isSignalShutdown()));
    while ((AdMarvelActivity)this.adMarvelActivityReference.get() == null)
      return;
    disablerotations(null);
  }

  @JavascriptInterface
  public void disablerotations(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    int i;
    label154: label204: 
    do
    {
      do
      {
        do
          return;
        while ((this.adMarvelInternalWebViewReference.get() != null) && (((AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get()).isSignalShutdown()));
        this.lastOrientation = localAdMarvelActivity.getRequestedOrientation();
        if (ac.a() < 9)
          i = localAdMarvelActivity.getResources().getConfiguration().orientation;
        while (true)
        {
          if (paramString == null)
            break label204;
          if (ac.a() >= 9)
            break label154;
          if (!paramString.equalsIgnoreCase("Portrait"))
            break;
          localAdMarvelActivity.setRequestedOrientation(1);
          return;
          AdMarvelActivity.n localn = new AdMarvelActivity.n(localAdMarvelActivity);
          AdMarvelActivity.f(localAdMarvelActivity).post(localn);
          for (i = -2147483648; i == -2147483648; i = AdMarvelActivity.n.a(localn));
        }
      }
      while (!paramString.equalsIgnoreCase("LandscapeLeft"));
      localAdMarvelActivity.setRequestedOrientation(0);
      return;
      if (paramString.equalsIgnoreCase("Portrait"))
      {
        localAdMarvelActivity.setRequestedOrientation(1);
        return;
      }
      if (paramString.equalsIgnoreCase("LandscapeLeft"))
      {
        localAdMarvelActivity.setRequestedOrientation(0);
        return;
      }
      AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.w(localAdMarvelActivity, paramString));
      return;
      if (ac.a() >= 9)
        break;
      if (i == 1)
      {
        localAdMarvelActivity.setRequestedOrientation(1);
        return;
      }
    }
    while (i != 2);
    localAdMarvelActivity.setRequestedOrientation(0);
    return;
    if (i == 0)
    {
      AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.w(localAdMarvelActivity, "Portrait"));
      return;
    }
    if (i == 1)
    {
      AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.w(localAdMarvelActivity, "LandscapeLeft"));
      return;
    }
    AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.w(localAdMarvelActivity, "none"));
  }

  @JavascriptInterface
  public void enableVideoCloseInBackground()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null)
      return;
    AdMarvelActivity.c(localAdMarvelActivity, true);
  }

  @JavascriptInterface
  public void enableautodetect()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
      localAdMarvelInternalWebView.getEnableAutoDetect().set(true);
  }

  @JavascriptInterface
  public void enablebackbutton()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelActivity.b(localAdMarvelActivity, false);
  }

  @JavascriptInterface
  public void enablerotations()
  {
    if ((this.adMarvelInternalWebViewReference.get() != null) && (((AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get()).isSignalShutdown()));
    AdMarvelActivity localAdMarvelActivity;
    do
    {
      return;
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    }
    while (localAdMarvelActivity == null);
    localAdMarvelActivity.setRequestedOrientation(this.lastOrientation);
  }

  @JavascriptInterface
  public void fetchWebViewHtmlContent(String paramString)
  {
    if (this.adMarvelAd != null)
      this.adMarvelAd.setHtmlJson(paramString);
  }

  @JavascriptInterface
  public void firePixel(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.l(localAdMarvelInternalWebView, localAdMarvelActivity, paramString));
  }

  @JavascriptInterface
  public int getAndroidOSVersionAPI()
  {
    return ac.a();
  }

  @JavascriptInterface
  public void getLocation(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.m(localAdMarvelInternalWebView, paramString));
  }

  @JavascriptInterface
  public void initAdMarvel(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.p(paramString, localAdMarvelInternalWebView, localAdMarvelActivity));
  }

  @JavascriptInterface
  public int isinstalled(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null)
      return 0;
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()))
      return 0;
    if (ab.a(localAdMarvelActivity, paramString))
      return 1;
    return 0;
  }

  @JavascriptInterface
  public void loadVideo()
  {
    Logging.log("window.ADMARVEL.loadVideo()");
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while (localAdMarvelInternalWebView == null);
      localAdMarvelActivity.d = true;
    }
    while ((this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.q localq = new AdMarvelActivity.q(this.videoUrl, localAdMarvelActivity, localAdMarvelInternalWebView);
    AdMarvelActivity.f(localAdMarvelActivity).post(localq);
  }

  @JavascriptInterface
  public void notifyInAppBrowserCloseAction(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
      localAdMarvelInternalWebView.mInAppBrowserCloseCallback = paramString;
  }

  @JavascriptInterface
  public void notifyInterstitialBackgroundState(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    AdMarvelActivity localAdMarvelActivity;
    do
    {
      return;
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    }
    while (localAdMarvelActivity == null);
    localAdMarvelActivity.f = paramString;
  }

  @JavascriptInterface
  public void pauseVideo()
  {
    Logging.log("window.ADMARVEL.pauseVideo()");
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while (localAdMarvelInternalWebView == null);
    AdMarvelActivity.r localr = new AdMarvelActivity.r(localAdMarvelActivity, localAdMarvelInternalWebView);
    AdMarvelActivity.f(localAdMarvelActivity).post(localr);
  }

  @JavascriptInterface
  public void playVideo()
  {
    Logging.log("window.ADMARVEL.playVideo()");
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.s locals = new AdMarvelActivity.s(localAdMarvelActivity, localAdMarvelInternalWebView);
    AdMarvelActivity.f(localAdMarvelActivity).post(locals);
  }

  @JavascriptInterface
  public void redirect(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (paramString == null) || (paramString.length() <= 0));
    AdMarvelActivity.u localu = new AdMarvelActivity.u(paramString, localAdMarvelActivity, this.adMarvelAd);
    AdMarvelActivity.f(localAdMarvelActivity).post(localu);
  }

  @JavascriptInterface
  public void registerEventsForAdMarvelVideo(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0));
    AdMarvelActivity localAdMarvelActivity;
    do
    {
      do
      {
        return;
        localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      }
      while (localAdMarvelActivity == null);
      if (paramString1.equals("loadeddata"))
      {
        AdMarvelActivity.b(localAdMarvelActivity, paramString2);
        return;
      }
      if (paramString1.equals("play"))
      {
        AdMarvelActivity.c(localAdMarvelActivity, paramString2);
        return;
      }
      if (paramString1.equals("canplay"))
      {
        AdMarvelActivity.d(localAdMarvelActivity, paramString2);
        return;
      }
      if (paramString1.equals("timeupdate"))
      {
        AdMarvelActivity.e(localAdMarvelActivity, paramString2);
        return;
      }
      if (paramString1.equals("ended"))
      {
        AdMarvelActivity.f(localAdMarvelActivity, paramString2);
        return;
      }
      if (paramString1.equals("pause"))
      {
        AdMarvelActivity.g(localAdMarvelActivity, paramString2);
        return;
      }
    }
    while (!paramString1.equals("error"));
    AdMarvelActivity.h(localAdMarvelActivity, paramString2);
  }

  @JavascriptInterface
  public void registerInterstitialCloseCallback(String paramString)
  {
    if ((paramString == null) || (paramString.length() <= 0));
    AdMarvelActivity localAdMarvelActivity;
    do
    {
      return;
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    }
    while (localAdMarvelActivity == null);
    localAdMarvelActivity.e = paramString;
  }

  @JavascriptInterface
  public void registeraccelerationevent(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    n localn;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
      localn = n.a();
    }
    while (!localn.a(localAdMarvelActivity.getBaseContext()));
    localn.b(paramString);
    localn.a(localAdMarvelActivity.getBaseContext(), localAdMarvelInternalWebView);
  }

  @JavascriptInterface
  public void registerheadingevent(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    n localn;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
      localn = n.a();
    }
    while ((localn == null) || (!localn.a(localAdMarvelActivity.getBaseContext())));
    localn.c(paramString);
    localn.a(localAdMarvelActivity.getBaseContext(), localAdMarvelInternalWebView);
  }

  @JavascriptInterface
  public void registernetworkchangeevent(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
      e.a(localAdMarvelInternalWebView, paramString);
  }

  @JavascriptInterface
  public void registershakeevent(String paramString1, String paramString2, String paramString3)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    n localn;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
      localn = n.a();
    }
    while (!localn.a(localAdMarvelActivity.getBaseContext()));
    localn.a(paramString1);
    localn.a(paramString2, paramString3);
    localn.a(localAdMarvelActivity.getBaseContext(), localAdMarvelInternalWebView);
  }

  @JavascriptInterface
  public void reportAdMarvelAdHistory()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null)
      return;
    AdMarvelUtils.reportAdMarvelAdHistory(localAdMarvelActivity);
  }

  @JavascriptInterface
  public void reportAdMarvelAdHistory(int paramInt)
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null)
      return;
    AdMarvelUtils.reportAdMarvelAdHistory(paramInt, localAdMarvelActivity);
  }

  @JavascriptInterface
  public void sdkclosebutton(String paramString1, String paramString2)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if (localAdMarvelInternalWebView == null);
    label15: label75: 
    do
    {
      do
      {
        do
        {
          break label15;
          do
            return;
          while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
          if ((paramString1 == null) || (!paramString1.equals("false")))
            break label75;
          if ((paramString2 == null) || (!paramString2.equals("true")))
            break;
        }
        while (localAdMarvelInternalWebView == null);
        localAdMarvelInternalWebView.a(true);
        return;
      }
      while (localAdMarvelInternalWebView == null);
      localAdMarvelInternalWebView.a(false);
      return;
    }
    while ((paramString1 == null) || (!paramString1.equals("true")));
    localAdMarvelInternalWebView.h();
  }

  @JavascriptInterface
  public void seekVideoTo(float paramFloat)
  {
    Logging.log("window.ADMARVEL.seekToVideo()");
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.v localv = new AdMarvelActivity.v(localAdMarvelActivity, localAdMarvelInternalWebView, paramFloat);
    AdMarvelActivity.f(localAdMarvelActivity).post(localv);
  }

  @JavascriptInterface
  public void setVideoUrl(String paramString)
  {
    Logging.log("window.ADMARVEL.setVideoUrl(\"" + paramString + "\")");
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null)
      return;
    this.videoUrl = paramString;
    localAdMarvelActivity.d = true;
  }

  @JavascriptInterface
  public void setbackgroundcolor(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    if (this.adMarvelInternalWebViewReference != null)
    {
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
        if (!"0".equals(paramString))
          break label48;
    }
    label48: long l;
    for (int i = 0; ; i = (int)l)
    {
      localAdMarvelInternalWebView.setBackgroundColor(i);
      return;
      l = Long.parseLong(paramString.replace("#", ""), 16);
      if ((paramString.length() == 7) || (paramString.length() == 6))
        l |= -16777216L;
    }
  }

  @JavascriptInterface
  public void stopVideo()
  {
    Logging.log("window.ADMARVEL.stopVideo()");
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while (localAdMarvelInternalWebView == null);
    AdMarvelActivity.x localx = new AdMarvelActivity.x(localAdMarvelActivity, localAdMarvelInternalWebView);
    AdMarvelActivity.f(localAdMarvelActivity).post(localx);
  }

  @JavascriptInterface
  public void storepicture(final String paramString1, final String paramString2)
  {
    final AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null);
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
      if ((ab.d(localAdMarvelInternalWebView.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) && ("mounted".equals(Environment.getExternalStorageState())))
        break;
    }
    while (paramString2 == null);
    AdMarvelActivity.f(localAdMarvelActivity).post(new Runnable()
    {
      public void run()
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + paramString2 + "(NO)");
      }
    });
    return;
    AlertDialog.Builder localBuilder = new AlertDialog.Builder(localAdMarvelActivity);
    localBuilder.setMessage("Allow storing image in your Gallery?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (ac.a() < 8)
        {
          AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.z(localAdMarvelInternalWebView, paramString1, paramString2));
          return;
        }
        AdMarvelActivity.f(localAdMarvelActivity).post(new AdMarvelActivity.y(localAdMarvelInternalWebView, paramString1, paramString2));
      }
    }).setNegativeButton("No", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (paramString2 != null)
          AdMarvelActivity.f(localAdMarvelActivity).post(new Runnable()
          {
            public void run()
            {
              AdMarvelActivity.InnerInterstitialJS.10.this.val$adMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.InnerInterstitialJS.10.this.val$callback + "(\"NO\")");
            }
          });
        paramAnonymousDialogInterface.cancel();
      }
    });
    localBuilder.create().show();
  }

  @JavascriptInterface
  public void triggerVibration(String paramString)
  {
    int i = 10000;
    if ((paramString != null) && (paramString.trim().length() > 0));
    while (true)
    {
      int k;
      AdMarvelActivity localAdMarvelActivity;
      try
      {
        k = Integer.parseInt(paramString);
        if (k <= i)
          break label79;
        Logging.log("Time mentioned is greater than Max duration ");
        j = i;
        localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
        if (localAdMarvelActivity != null)
          break label71;
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Logging.log("NumberFormatException so setting vibrate time to 500 Milli Sec");
      }
      int j = 500;
      continue;
      label71: ab.a(localAdMarvelActivity, j);
      return;
      label79: i = k;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.InnerInterstitialJS
 * JD-Core Version:    0.6.2
 */