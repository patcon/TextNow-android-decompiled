package com.admarvel.android.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.b;
import com.admarvel.android.util.c;
import com.admarvel.android.util.e;
import com.admarvel.android.util.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

public class AdMarvelWebViewJSInterface
{
  private final WeakReference<AdMarvelActivity> adMarvelActivityReference;
  final AdMarvelAd adMarvelAd;
  final WeakReference<d> adMarvelInternalWebViewReference;
  private final WeakReference<m> adMarvelWebViewReference;
  private final WeakReference<Context> contextReference;
  private boolean isInterstitial = false;
  private int lastOrientation;
  private String lockedOrientation = null;
  private String videoUrl;

  public AdMarvelWebViewJSInterface(d paramd, AdMarvelAd paramAdMarvelAd, AdMarvelActivity paramAdMarvelActivity)
  {
    this.adMarvelInternalWebViewReference = new WeakReference(paramd);
    this.adMarvelWebViewReference = null;
    this.contextReference = new WeakReference(paramAdMarvelActivity);
    this.adMarvelAd = paramAdMarvelAd;
    this.adMarvelActivityReference = new WeakReference(paramAdMarvelActivity);
    this.isInterstitial = true;
    this.lastOrientation = paramAdMarvelActivity.getRequestedOrientation();
  }

  public AdMarvelWebViewJSInterface(d paramd, AdMarvelAd paramAdMarvelAd, m paramm, Context paramContext)
  {
    this.adMarvelInternalWebViewReference = new WeakReference(paramd);
    this.adMarvelWebViewReference = new WeakReference(paramm);
    this.contextReference = new WeakReference(paramContext);
    this.adMarvelAd = paramAdMarvelAd;
    this.adMarvelActivityReference = null;
    this.isInterstitial = false;
  }

  @JavascriptInterface
  public void admarvelCheckFrameValues(String paramString)
  {
  }

  @JavascriptInterface
  public void allowInteractionInExpandState()
  {
    if ((!this.isInterstitial) && (this.adMarvelAd != null))
      this.adMarvelAd.allowInteractionInExpandableAds();
  }

  @JavascriptInterface
  public void checkForApplicationSupportedOrientations(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if (locald == null);
    String str1;
    do
    {
      Context localContext;
      do
      {
        do
          return;
        while ((locald != null) && (locald.b()));
        localContext = locald.getContext();
      }
      while ((localContext == null) || (!(localContext instanceof Activity)));
      String[] arrayOfString = r.a((Activity)localContext).split(",");
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
    while (locald == null);
    locald.e(paramString + "(" + str1 + ")");
  }

  @JavascriptInterface
  public void checkFrameValues(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    m localm;
    if ((locald != null) && (!locald.b()) && (!this.isInterstitial))
    {
      localm = (m)this.adMarvelWebViewReference.get();
      if (localm != null);
    }
    else
    {
      return;
    }
    f.a().b().execute(new m.f(paramString, locald, localm));
  }

  @JavascriptInterface
  public void checkNetworkAvailable(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (!locald.b()))
      f.a().b().execute(new r.c(locald, paramString));
  }

  @JavascriptInterface
  public void cleanup()
  {
    if (!this.isInterstitial)
      if (Version.getAndroidSDKVersion() >= 14);
    AdMarvelActivity localAdMarvelActivity;
    do
    {
      m localm;
      do
      {
        return;
        Logging.log("window.ADMARVEL.cleanup()");
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while ((localm == null) || ((d)this.adMarvelInternalWebViewReference.get() == null));
      m.g localg = new m.g(localm);
      new Handler(Looper.getMainLooper()).post(localg);
      return;
      Logging.log("window.ADMARVEL.cleanup()");
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    }
    while ((localAdMarvelActivity == null) || ((d)this.adMarvelInternalWebViewReference.get() == null));
    AdMarvelActivity.d locald = new AdMarvelActivity.d(localAdMarvelActivity);
    localAdMarvelActivity.d.post(locald);
  }

  @JavascriptInterface
  public void close()
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    do
    {
      do
        return;
      while (this.isInterstitial);
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while (localm == null);
    new Handler(Looper.getMainLooper()).post(new m.i(localm));
  }

  @JavascriptInterface
  public void closeinterstitialad()
  {
    AdMarvelActivity localAdMarvelActivity;
    if (this.isInterstitial)
    {
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      if (localAdMarvelActivity != null)
        break label23;
    }
    label23: d locald;
    do
    {
      return;
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald != null) && (locald.b()));
    localAdMarvelActivity.g();
  }

  @JavascriptInterface
  public void createcalendarevent(final String paramString1, final String paramString2, final String paramString3)
  {
    final Context localContext = (Context)this.contextReference.get();
    if (localContext == null);
    final d locald;
    do
    {
      return;
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald == null) || (locald.b()) || (!r.c(localContext, "android.permission.READ_CALENDAR")) || (!r.c(localContext, "android.permission.WRITE_CALENDAR")) || (!(localContext instanceof Activity)));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder((Activity)localContext);
    localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (Version.getAndroidSDKVersion() >= 14)
        {
          f.a().b().execute(new r.e(locald, localContext, paramString1, paramString2, paramString3));
          return;
        }
        f.a().b().execute(new r.d(locald, localContext, paramString1, paramString2, paramString3));
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
    final Context localContext = (Context)this.contextReference.get();
    if (localContext == null);
    final d locald;
    do
    {
      return;
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald == null) || (locald.b()) || (!r.c(localContext, "android.permission.READ_CALENDAR")) || (!r.c(localContext, "android.permission.WRITE_CALENDAR")) || (!(localContext instanceof Activity)));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder((Activity)localContext);
    localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (Version.getAndroidSDKVersion() >= 14)
        {
          f.a().b().execute(new r.e(locald, localContext, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt));
          return;
        }
        f.a().b().execute(new r.d(locald, localContext, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt));
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
    final Context localContext = (Context)this.contextReference.get();
    if (localContext == null);
    final d locald;
    do
    {
      do
      {
        return;
        locald = (d)this.adMarvelInternalWebViewReference.get();
      }
      while ((locald == null) || (locald.b()));
      if ((r.c(localContext, "android.permission.READ_CALENDAR")) && (r.c(localContext, "android.permission.WRITE_CALENDAR")))
        break;
    }
    while (paramString11 == null);
    locald.e(paramString11 + "(NO)");
    return;
    if ((localContext instanceof Activity))
    {
      Activity localActivity = (Activity)localContext;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(localActivity);
      localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (Version.getAndroidSDKVersion() >= 14)
          {
            f.a().b().execute(new r.e(locald, localContext, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt1, paramString7, paramString8, paramString9, paramString10, paramInt2, paramInt3, paramString11));
            return;
          }
          f.a().b().execute(new r.d(locald, localContext, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt1, paramString7, paramString8, paramString9, paramString10, paramInt2, paramInt3, paramString11));
        }
      }).setNegativeButton("No", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (paramString11 != null)
            locald.e(paramString11 + "(\"NO\")");
          paramAnonymousDialogInterface.cancel();
        }
      });
      localBuilder.create().show();
      return;
    }
    locald.e(paramString11 + "(\"NO\")");
  }

  @JavascriptInterface
  public void delaydisplay()
  {
    if (this.adMarvelInternalWebViewReference != null)
    {
      d locald = (d)this.adMarvelInternalWebViewReference.get();
      if ((locald == null) || (!locald.b()));
    }
    m localm;
    do
    {
      do
        return;
      while (this.isInterstitial);
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while (localm == null);
    localm.p.set(true);
  }

  @JavascriptInterface
  public void detectlocation(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (!locald.b()))
    {
      c localc = c.a();
      if (localc != null)
        localc.a(locald, paramString);
    }
  }

  @JavascriptInterface
  public void detectsizechange(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (!locald.b()))
      locald.n = paramString;
  }

  @JavascriptInterface
  public void detectvisibility(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (!locald.b()))
    {
      locald.j = paramString;
      if ((this.isInterstitial) && (!locald.k) && (locald.m))
      {
        locald.e(paramString + "(" + true + ")");
        locald.k = true;
      }
    }
  }

  @JavascriptInterface
  public void disableRotationForExpand()
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    do
    {
      do
      {
        do
          return;
        while (this.isInterstitial);
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      localm.w = true;
      this.lockedOrientation = null;
    }
    while ((!localm.x) || (!localm.y));
    disablerotations(this.lockedOrientation);
  }

  @JavascriptInterface
  public void disableRotationForExpand(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    do
    {
      do
      {
        do
          return;
        while (this.isInterstitial);
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      localm.w = true;
      this.lockedOrientation = paramString;
    }
    while ((!localm.x) || (!localm.y));
    disablerotations(paramString);
  }

  @JavascriptInterface
  public void disableautodetect()
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    do
    {
      return;
      if (this.isInterstitial)
        break;
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while (localm == null);
    localm.r.set(false);
    return;
    locald.getEnableAutoDetect().set(false);
  }

  @JavascriptInterface
  public void disablebackbutton()
  {
    AdMarvelActivity localAdMarvelActivity;
    if (this.isInterstitial)
    {
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      if (localAdMarvelActivity != null)
        break label23;
    }
    label23: d locald;
    do
    {
      return;
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald == null) || (locald.b()));
    if (localAdMarvelActivity.c != null)
      localAdMarvelActivity.d.removeCallbacks(localAdMarvelActivity.c);
    localAdMarvelActivity.b = true;
  }

  @JavascriptInterface
  public void disablebackbutton(int paramInt)
  {
    AdMarvelActivity localAdMarvelActivity;
    if (this.isInterstitial)
    {
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      if (localAdMarvelActivity != null)
        break label23;
    }
    label23: d locald;
    do
    {
      return;
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald == null) || (locald.b()) || (paramInt <= 0));
    localAdMarvelActivity.b = true;
    if (localAdMarvelActivity.c != null)
      localAdMarvelActivity.d.removeCallbacks(localAdMarvelActivity.c);
    localAdMarvelActivity.d.postDelayed(localAdMarvelActivity.c, paramInt);
  }

  @JavascriptInterface
  public void disableclosebutton(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    while ((paramString == null) || (!paramString.equals("true")))
      return;
    sdkclosebutton("false", "false");
  }

  @JavascriptInterface
  public void disablerotations()
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    label120: 
    while (true)
    {
      return;
      m localm;
      Context localContext;
      if (!this.isInterstitial)
      {
        localm = (m)this.adMarvelWebViewReference.get();
        if (localm != null)
        {
          localContext = localm.getContext();
          if ((localContext == null) || (!(localContext instanceof Activity)));
        }
      }
      else
      {
        for (Activity localActivity = (Activity)localContext; ; localActivity = null)
        {
          if (localActivity == null)
            break label120;
          int i = localm.getResources().getConfiguration().orientation;
          if (i == 1)
          {
            localActivity.setRequestedOrientation(1);
            return;
          }
          if (i != 2)
            break;
          localActivity.setRequestedOrientation(0);
          return;
          disablerotations(null);
          return;
        }
      }
    }
  }

  @JavascriptInterface
  public void disablerotations(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    label223: AdMarvelActivity localAdMarvelActivity;
    label268: label332: int i;
    label579: label629: 
    do
    {
      do
      {
        do
        {
          Activity localActivity;
          int j;
          do
          {
            do
            {
              do
              {
                do
                {
                  m localm;
                  do
                  {
                    do
                    {
                      return;
                      if (this.isInterstitial)
                        break;
                      localm = (m)this.adMarvelWebViewReference.get();
                    }
                    while (localm == null);
                    Context localContext = localm.getContext();
                    localActivity = null;
                    if (localContext != null)
                    {
                      boolean bool = localContext instanceof Activity;
                      localActivity = null;
                      if (bool)
                        localActivity = (Activity)localContext;
                    }
                  }
                  while (localActivity == null);
                  if (Version.getAndroidSDKVersion() < 9)
                    j = localm.getResources().getConfiguration().orientation;
                  while (true)
                  {
                    if (paramString == null)
                      break label332;
                    if (localm.w)
                      break label268;
                    if (Version.getAndroidSDKVersion() >= 9)
                      break label223;
                    if ((!paramString.equalsIgnoreCase("Portrait")) || (j != 1))
                      break;
                    localActivity.setRequestedOrientation(1);
                    return;
                    m.q localq = new m.q(localm);
                    f.a().b().execute(localq);
                    for (j = -2147483648; j == -2147483648; j = localq.a());
                  }
                }
                while ((!paramString.equalsIgnoreCase("LandscapeLeft")) || (j != 2));
                localActivity.setRequestedOrientation(0);
                return;
                if ((paramString.equalsIgnoreCase("Portrait")) && (j == 0))
                {
                  localActivity.setRequestedOrientation(1);
                  return;
                }
              }
              while ((!paramString.equalsIgnoreCase("LandscapeLeft")) || (j != 1));
              localActivity.setRequestedOrientation(0);
              return;
              if (Version.getAndroidSDKVersion() >= 9)
                break;
              if (paramString.equalsIgnoreCase("Portrait"))
              {
                localActivity.setRequestedOrientation(1);
                return;
              }
            }
            while (!paramString.equalsIgnoreCase("LandscapeLeft"));
            localActivity.setRequestedOrientation(0);
            return;
            f.a().b().execute(new AdMarvelActivity.q(localActivity, paramString));
            return;
            if (Version.getAndroidSDKVersion() >= 9)
              break;
            if (j == 1)
            {
              localActivity.setRequestedOrientation(1);
              return;
            }
          }
          while (j != 2);
          localActivity.setRequestedOrientation(0);
          return;
          if (j == 0)
          {
            f.a().b().execute(new AdMarvelActivity.q(localActivity, "Portrait"));
            return;
          }
          if (j == 1)
          {
            f.a().b().execute(new AdMarvelActivity.q(localActivity, "LandscapeLeft"));
            return;
          }
          f.a().b().execute(new AdMarvelActivity.q(localActivity, "none"));
          return;
          localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
        }
        while (localAdMarvelActivity == null);
        this.lastOrientation = localAdMarvelActivity.getRequestedOrientation();
        if (Version.getAndroidSDKVersion() < 9)
          i = localAdMarvelActivity.getResources().getConfiguration().orientation;
        while (true)
        {
          if (paramString == null)
            break label629;
          if (Version.getAndroidSDKVersion() >= 9)
            break label579;
          if (!paramString.equalsIgnoreCase("Portrait"))
            break;
          localAdMarvelActivity.setRequestedOrientation(1);
          return;
          AdMarvelActivity.j localj = new AdMarvelActivity.j(localAdMarvelActivity);
          localAdMarvelActivity.d.post(localj);
          for (i = -2147483648; i == -2147483648; i = localj.a());
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
      localAdMarvelActivity.d.post(new AdMarvelActivity.q(localAdMarvelActivity, paramString));
      return;
      if (Version.getAndroidSDKVersion() >= 9)
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
      localAdMarvelActivity.d.post(new AdMarvelActivity.q(localAdMarvelActivity, "Portrait"));
      return;
    }
    if (i == 1)
    {
      localAdMarvelActivity.d.post(new AdMarvelActivity.q(localAdMarvelActivity, "LandscapeLeft"));
      return;
    }
    localAdMarvelActivity.d.post(new AdMarvelActivity.q(localAdMarvelActivity, "none"));
  }

  @JavascriptInterface
  public void enableVideoCloseInBackground()
  {
    AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    if (localAdMarvelActivity == null)
      return;
    localAdMarvelActivity.q = true;
  }

  @JavascriptInterface
  public void enableautodetect()
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    do
    {
      return;
      if (this.isInterstitial)
        break;
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while (localm == null);
    localm.r.set(true);
    return;
    locald.getEnableAutoDetect().set(true);
  }

  @JavascriptInterface
  public void enablebackbutton()
  {
    AdMarvelActivity localAdMarvelActivity;
    if (this.isInterstitial)
    {
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      if (localAdMarvelActivity != null)
        break label23;
    }
    label23: d locald;
    do
    {
      return;
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald == null) || (locald.b()));
    localAdMarvelActivity.b = false;
  }

  @JavascriptInterface
  public void enablerotations()
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    label119: 
    while (true)
    {
      return;
      m localm;
      Context localContext;
      if (!this.isInterstitial)
      {
        localm = (m)this.adMarvelWebViewReference.get();
        if (localm != null)
        {
          localContext = localm.getContext();
          if ((localContext == null) || (!(localContext instanceof Activity)));
        }
      }
      else
      {
        for (Activity localActivity = (Activity)localContext; ; localActivity = null)
        {
          if (localActivity == null)
            break label119;
          localActivity.setRequestedOrientation(localm.t);
          localm.w = false;
          return;
          AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
          if (localAdMarvelActivity == null)
            break;
          localAdMarvelActivity.setRequestedOrientation(this.lastOrientation);
          return;
        }
      }
    }
  }

  @JavascriptInterface
  public void expandto(int paramInt1, int paramInt2)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    Context localContext;
    do
    {
      do
      {
        do
          return;
        while (this.isInterstitial);
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      localContext = locald.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    if (localm.x)
    {
      new Handler(Looper.getMainLooper()).post(new m.l(localm, localActivity, paramInt1, paramInt2));
      return;
    }
    new Handler(Looper.getMainLooper()).post(new m.m(localm, localActivity, paramInt1, paramInt2, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandto(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, String paramString2)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    Context localContext;
    do
    {
      do
      {
        do
          return;
        while (this.isInterstitial);
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      localContext = locald.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      expandtofullscreen(paramString1, paramString2);
      return;
    }
    if (paramString1 != null)
      localm.l = paramString1;
    if (localm.x)
    {
      new Handler(Looper.getMainLooper()).post(new m.l(localm, localActivity, paramInt1, paramInt2, paramInt3, paramInt4));
      return;
    }
    new Handler(Looper.getMainLooper()).post(new m.m(localm, localActivity, paramInt1, paramInt2, paramInt3, paramInt4, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandto(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    Context localContext;
    do
    {
      do
      {
        do
          return;
        while (this.isInterstitial);
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      localContext = locald.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      expandtofullscreen(paramString1, paramString2);
      return;
    }
    if (paramString1 != null)
      localm.l = paramString1;
    if (localm.x)
    {
      new Handler(Looper.getMainLooper()).post(new m.l(localm, localActivity, paramInt1, paramInt2));
      return;
    }
    new Handler(Looper.getMainLooper()).post(new m.m(localm, localActivity, paramInt1, paramInt2, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandtofullscreen()
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    Context localContext;
    do
    {
      do
      {
        do
          return;
        while (this.isInterstitial);
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      localContext = locald.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    localm.y = true;
    if (localm.w)
      disablerotations(this.lockedOrientation);
    if (localm.x)
    {
      new Handler(Looper.getMainLooper()).post(new m.l(localm, localActivity, 0, 0, -1, -1));
      return;
    }
    new Handler(Looper.getMainLooper()).post(new m.m(localm, localActivity, 0, 0, -1, -1, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandtofullscreen(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    Context localContext;
    do
    {
      do
      {
        do
          return;
        while (this.isInterstitial);
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      localContext = locald.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    localm.y = true;
    if (paramString != null)
      localm.l = paramString;
    if (localm.w)
      disablerotations(this.lockedOrientation);
    if (localm.x)
    {
      new Handler(Looper.getMainLooper()).post(new m.l(localm, localActivity, 0, 0, -1, -1));
      return;
    }
    new Handler(Looper.getMainLooper()).post(new m.m(localm, localActivity, 0, 0, -1, -1, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandtofullscreen(String paramString1, String paramString2)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    do
    {
      do
        return;
      while (this.isInterstitial);
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while (localm == null);
    Context localContext = locald.getContext();
    Activity localActivity;
    if ((localContext != null) && ((localContext instanceof Activity)))
    {
      localActivity = (Activity)localContext;
      label73: if (paramString1 != null)
        localm.l = paramString1;
      localm.y = true;
      if ((paramString2 != null) && (paramString2.length() > 0))
      {
        localm.m = paramString2;
        localm.n = true;
      }
      if (localm.w)
      {
        if (!localm.n)
          break label224;
        if ((this.lockedOrientation == null) || (this.lockedOrientation.length() <= 0))
          break label213;
        localm.o = this.lockedOrientation;
      }
    }
    while (true)
    {
      if ((paramString2 == null) || (paramString2.length() <= 0))
        break label235;
      new Handler(Looper.getMainLooper()).post(new m.n(localm, paramString2, this.adMarvelAd));
      return;
      if (paramString2 == null)
        break;
      int i = paramString2.length();
      localActivity = null;
      if (i != 0)
        break label73;
      return;
      label213: localm.o = "Current";
      continue;
      label224: disablerotations(this.lockedOrientation);
    }
    label235: if (localm.x)
    {
      new Handler(Looper.getMainLooper()).post(new m.l(localm, localActivity, 0, 0, -1, -1));
      return;
    }
    new Handler(Looper.getMainLooper()).post(new m.m(localm, localActivity, 0, 0, -1, -1, this.adMarvelAd));
  }

  @JavascriptInterface
  public void fetchWebViewHtmlContent(String paramString)
  {
    if (this.adMarvelAd != null)
      this.adMarvelAd.setHtmlJson(paramString);
  }

  @JavascriptInterface
  public void finishVideo()
  {
    if ((this.isInterstitial) || (Version.getAndroidSDKVersion() < 14));
    m localm;
    do
    {
      return;
      Logging.log("window.ADMARVEL.finishVideo()");
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while ((localm == null) || ((d)this.adMarvelInternalWebViewReference.get() == null));
    m.o localo = new m.o(localm);
    new Handler(Looper.getMainLooper()).post(localo);
  }

  @JavascriptInterface
  public void firePixel(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    m localm;
    if ((locald != null) && (!locald.b()))
    {
      if (this.isInterstitial)
        break label70;
      localm = (m)this.adMarvelWebViewReference.get();
      if (localm != null)
        break label47;
    }
    label47: label70: AdMarvelActivity localAdMarvelActivity;
    do
    {
      return;
      f.a().b().execute(new m.p(locald, localm, paramString));
      return;
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    }
    while (localAdMarvelActivity == null);
    localAdMarvelActivity.d.post(new AdMarvelActivity.i(locald, localAdMarvelActivity, paramString));
  }

  @JavascriptInterface
  public int getAndroidOSVersionAPI()
  {
    return Version.getAndroidSDKVersion();
  }

  @JavascriptInterface
  public void getLocation(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (!locald.b()))
      f.a().b().execute(new r.p(locald, paramString));
  }

  @JavascriptInterface
  public void initAdMarvel(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    m localm;
    if ((locald != null) && (!locald.b()))
    {
      if (this.isInterstitial)
        break label70;
      localm = (m)this.adMarvelWebViewReference.get();
      if (localm != null)
        break label47;
    }
    label47: label70: AdMarvelActivity localAdMarvelActivity;
    do
    {
      return;
      f.a().b().execute(new m.r(paramString, locald, localm));
      return;
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    }
    while (localAdMarvelActivity == null);
    localAdMarvelActivity.d.post(new AdMarvelActivity.l(paramString, locald, localAdMarvelActivity));
  }

  @JavascriptInterface
  public void initVideo(String paramString)
  {
    if ((this.isInterstitial) || (Version.getAndroidSDKVersion() < 14));
    m localm;
    d locald;
    do
    {
      do
      {
        return;
        Logging.log("window.ADMARVEL.setVideoUrl(\"" + paramString + "\")");
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      localm.z = paramString;
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald == null) || (locald.b()) || (localm.z == null) || (localm.z.length() <= 0));
    new Handler(Looper.getMainLooper()).post(new m.s(paramString, localm, locald));
  }

  @JavascriptInterface
  public int isInterstitial()
  {
    if (this.isInterstitial)
      return 1;
    return 0;
  }

  @JavascriptInterface
  public int isinitialload()
  {
    return 1;
  }

  @JavascriptInterface
  public int isinstalled(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if (locald == null)
      return 0;
    if ((locald != null) && (locald.b()))
      return 0;
    if (r.a(locald.getContext(), paramString))
      return 1;
    return 0;
  }

  @JavascriptInterface
  public int isvideocached()
  {
    if (!this.isInterstitial)
    {
      if (Version.getAndroidSDKVersion() < 14)
        return 0;
      Logging.log("window.ADMARVEL.isvideocached()");
      m localm = (m)this.adMarvelWebViewReference.get();
      if (localm == null)
        return 0;
      if (Version.getAndroidSDKVersion() >= 14)
        return new m.t().a(localm);
      return 0;
    }
    return 0;
  }

  @JavascriptInterface
  public void loadVideo()
  {
    if (!this.isInterstitial)
      if (Version.getAndroidSDKVersion() >= 14);
    AdMarvelActivity localAdMarvelActivity;
    d locald1;
    do
    {
      do
      {
        do
        {
          m localm1;
          d locald2;
          do
          {
            do
            {
              return;
              Logging.log("window.ADMARVEL.loadVideo()");
              localm1 = (m)this.adMarvelWebViewReference.get();
            }
            while (localm1 == null);
            locald2 = (d)this.adMarvelInternalWebViewReference.get();
          }
          while ((locald2 == null) || (locald2.b()) || (localm1.z == null) || (localm1.z.length() <= 0));
          m.u localu = new m.u(localm1.z, localm1, locald2);
          new Handler(Looper.getMainLooper()).post(localu);
          return;
          Logging.log("window.ADMARVEL.loadVideo()");
          localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
        }
        while (localAdMarvelActivity == null);
        locald1 = (d)this.adMarvelInternalWebViewReference.get();
      }
      while (locald1 == null);
      localAdMarvelActivity.g = true;
    }
    while ((this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.m localm = new AdMarvelActivity.m(this.videoUrl, localAdMarvelActivity, locald1);
    localAdMarvelActivity.d.post(localm);
  }

  @JavascriptInterface
  public void notifyInAppBrowserCloseAction(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (!locald.b()))
      locald.u = paramString;
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
    localAdMarvelActivity.p = paramString;
  }

  @JavascriptInterface
  public void pauseVideo()
  {
    if (!this.isInterstitial)
      if (Version.getAndroidSDKVersion() >= 14);
    AdMarvelActivity localAdMarvelActivity;
    d locald1;
    do
    {
      do
      {
        m localm;
        d locald2;
        do
        {
          do
          {
            return;
            Logging.log("window.ADMARVEL.pauseVideo()");
            localm = (m)this.adMarvelWebViewReference.get();
          }
          while (localm == null);
          locald2 = (d)this.adMarvelInternalWebViewReference.get();
        }
        while (locald2 == null);
        m.x localx = new m.x(localm, locald2);
        new Handler(Looper.getMainLooper()).post(localx);
        return;
        Logging.log("window.ADMARVEL.pauseVideo()");
        localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      }
      while (localAdMarvelActivity == null);
      locald1 = (d)this.adMarvelInternalWebViewReference.get();
    }
    while (locald1 == null);
    AdMarvelActivity.n localn = new AdMarvelActivity.n(localAdMarvelActivity, locald1);
    localAdMarvelActivity.d.post(localn);
  }

  @JavascriptInterface
  public void playVideo()
  {
    if (!this.isInterstitial)
      if (Version.getAndroidSDKVersion() >= 14);
    AdMarvelActivity localAdMarvelActivity;
    d locald1;
    do
    {
      do
      {
        m localm;
        d locald2;
        do
        {
          do
          {
            return;
            Logging.log("window.ADMARVEL.playVideo()");
            localm = (m)this.adMarvelWebViewReference.get();
          }
          while (localm == null);
          locald2 = (d)this.adMarvelInternalWebViewReference.get();
        }
        while ((locald2 == null) || (localm.z == null) || (localm.z.length() <= 0));
        m.y localy = new m.y(localm, locald2);
        new Handler(Looper.getMainLooper()).post(localy);
        return;
        Logging.log("window.ADMARVEL.playVideo()");
        localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      }
      while (localAdMarvelActivity == null);
      locald1 = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald1 == null) || (this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.o localo = new AdMarvelActivity.o(localAdMarvelActivity, locald1);
    localAdMarvelActivity.d.post(localo);
  }

  @JavascriptInterface
  public void readyfordisplay()
  {
    if (this.adMarvelInternalWebViewReference != null)
    {
      d locald = (d)this.adMarvelInternalWebViewReference.get();
      if ((locald == null) || (!locald.b()));
    }
    m localm;
    do
    {
      do
      {
        do
          return;
        while (this.isInterstitial);
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      if (!localm.q.get())
        break;
    }
    while ((!localm.b.compareAndSet(true, false)) || (m.a(localm.s) == null));
    m.a(localm.s).a(localm, this.adMarvelAd);
    return;
    localm.p.set(false);
  }

  @JavascriptInterface
  public void redirect(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    AdMarvelActivity localAdMarvelActivity;
    do
    {
      m localm;
      do
      {
        return;
        if (this.isInterstitial)
          break;
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while ((localm == null) || (locald == null) || ((!locald.c()) && ((paramString == null) || (paramString.length() <= 0) || ((!paramString.startsWith("admarvelsdk")) && (!paramString.startsWith("admarvelinternal"))))));
      localm.c(paramString);
      return;
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
    }
    while ((localAdMarvelActivity == null) || (paramString == null) || (paramString.length() <= 0));
    AdMarvelRedirectRunnable localAdMarvelRedirectRunnable = new AdMarvelRedirectRunnable(paramString, localAdMarvelActivity, this.adMarvelAd, "interstitial", localAdMarvelActivity.e, AdMarvelInterstitialAds.getEnableClickRedirect(), AdMarvelInterstitialAds.enableOfflineSDK, false);
    localAdMarvelActivity.d.post(localAdMarvelRedirectRunnable);
  }

  public void registerBroadcastReceiver(Context paramContext, b paramb)
  {
    paramContext.getApplicationContext().registerReceiver(paramb, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
  }

  @JavascriptInterface
  public void registerEventsForAdMarvelVideo(String paramString1, String paramString2)
  {
    if (!this.isInterstitial)
      if (Version.getAndroidSDKVersion() >= 14);
    label15: AdMarvelActivity localAdMarvelActivity;
    do
    {
      do
      {
        do
        {
          m localm;
          do
          {
            do
            {
              break label15;
              break label15;
              break label15;
              do
                return;
              while ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0));
              localm = (m)this.adMarvelWebViewReference.get();
            }
            while (localm == null);
            if (paramString1.equals("loadeddata"))
            {
              localm.F = paramString2;
              return;
            }
            if (paramString1.equals("play"))
            {
              localm.G = paramString2;
              return;
            }
            if (paramString1.equals("canplay"))
            {
              localm.H = paramString2;
              return;
            }
            if (paramString1.equals("timeupdate"))
            {
              localm.I = paramString2;
              return;
            }
            if (paramString1.equals("ended"))
            {
              localm.J = paramString2;
              return;
            }
            if (paramString1.equals("pause"))
            {
              localm.K = paramString2;
              return;
            }
            if (paramString1.equals("resume"))
            {
              localm.L = paramString2;
              return;
            }
            if (paramString1.equals("stop"))
            {
              localm.M = paramString2;
              return;
            }
          }
          while (!paramString1.equals("error"));
          localm.N = paramString2;
          return;
        }
        while ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0));
        localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      }
      while (localAdMarvelActivity == null);
      if (paramString1.equals("loadeddata"))
      {
        localAdMarvelActivity.h = paramString2;
        return;
      }
      if (paramString1.equals("play"))
      {
        localAdMarvelActivity.i = paramString2;
        return;
      }
      if (paramString1.equals("canplay"))
      {
        localAdMarvelActivity.j = paramString2;
        return;
      }
      if (paramString1.equals("timeupdate"))
      {
        localAdMarvelActivity.k = paramString2;
        return;
      }
      if (paramString1.equals("ended"))
      {
        localAdMarvelActivity.l = paramString2;
        return;
      }
      if (paramString1.equals("pause"))
      {
        localAdMarvelActivity.m = paramString2;
        return;
      }
    }
    while (!paramString1.equals("error"));
    localAdMarvelActivity.n = paramString2;
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
    localAdMarvelActivity.o = paramString;
  }

  @JavascriptInterface
  public void registeraccelerationevent(String paramString)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext == null);
    d locald;
    e locale;
    do
    {
      do
      {
        return;
        locald = (d)this.adMarvelInternalWebViewReference.get();
      }
      while ((locald == null) || (locald.b()));
      locale = e.a();
    }
    while ((locale == null) || (!locale.a(localContext)));
    locale.b(paramString);
    locale.a(localContext, locald);
  }

  @JavascriptInterface
  public void registerheadingevent(String paramString)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext == null);
    d locald;
    e locale;
    do
    {
      do
      {
        return;
        locald = (d)this.adMarvelInternalWebViewReference.get();
      }
      while ((locald == null) || (locald.b()));
      locale = e.a();
    }
    while ((locale == null) || (!locale.a(localContext)));
    locale.c(paramString);
    locale.a(localContext, locald);
  }

  @JavascriptInterface
  public void registernetworkchangeevent(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (!locald.b()))
    {
      if (this.contextReference.get() != null)
      {
        b localb = b.a();
        registerBroadcastReceiver((Context)this.contextReference.get(), localb);
      }
      b.a(locald, paramString);
    }
  }

  @JavascriptInterface
  public void registershakeevent(String paramString1, String paramString2, String paramString3)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext == null);
    d locald;
    e locale;
    do
    {
      do
      {
        return;
        locald = (d)this.adMarvelInternalWebViewReference.get();
      }
      while ((locald == null) || (locald.b()));
      locale = e.a();
    }
    while ((locale == null) || (!locale.a(localContext)));
    locale.a(paramString1);
    locale.a(paramString2, paramString3);
    locale.a(localContext, locald);
  }

  @JavascriptInterface
  public void reportAdMarvelAdHistory()
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      AdMarvelUtils.reportAdMarvelAdHistory(localContext);
  }

  @JavascriptInterface
  public void reportAdMarvelAdHistory(int paramInt)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext != null)
      AdMarvelUtils.reportAdMarvelAdHistory(paramInt, localContext);
  }

  @JavascriptInterface
  public void resumeVideo()
  {
    if ((this.isInterstitial) || (Version.getAndroidSDKVersion() < 14));
    m localm;
    d locald;
    do
    {
      do
      {
        return;
        Logging.log("window.ADMARVEL.resumeVideo()");
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while (localm == null);
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while (locald == null);
    m.aa localaa = new m.aa(localm, locald);
    new Handler(Looper.getMainLooper()).post(localaa);
  }

  @JavascriptInterface
  public void sdkclosebutton(String paramString1, String paramString2)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    label187: 
    do
    {
      do
      {
        do
        {
          m localm;
          do
          {
            do
            {
              return;
              if (this.isInterstitial)
                break;
              localm = (m)this.adMarvelWebViewReference.get();
            }
            while (localm == null);
            localm.g = false;
            localm.h = false;
            localm.i = false;
            if ((paramString1 != null) && (paramString1.equals("true")))
            {
              localm.g = true;
              localm.i = true;
              return;
            }
          }
          while ((paramString1 == null) || (!paramString1.equals("false")) || (paramString2 == null) || (!paramString2.equals("true")));
          localm.g = true;
          localm.h = true;
          localm.i = false;
          return;
          if ((paramString1 == null) || (!paramString1.equals("false")))
            break label187;
          if ((paramString2 == null) || (!paramString2.equals("true")))
            break;
        }
        while (locald == null);
        locald.a(true);
        return;
      }
      while (locald == null);
      locald.a(false);
      return;
    }
    while ((paramString1 == null) || (!paramString1.equals("true")));
    locald.l();
  }

  @JavascriptInterface
  public void sdkclosebutton(String paramString1, String paramString2, String paramString3)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()))
      break label25;
    while (true)
    {
      label25: return;
      if (!this.isInterstitial)
      {
        m localm = (m)this.adMarvelWebViewReference.get();
        if (localm == null)
          break;
        localm.g = false;
        localm.h = false;
        localm.i = false;
        if ((paramString1 != null) && (paramString1.equals("true")))
          localm.g = true;
        for (localm.i = true; (paramString3 != null) && (paramString3.length() > 0); localm.i = false)
        {
          label94: localm.j = paramString3;
          return;
          if ((paramString1 == null) || (!paramString1.equals("false")) || (paramString2 == null) || (!paramString2.equals("true")))
            break label94;
          localm.g = true;
          localm.h = true;
        }
      }
    }
  }

  @JavascriptInterface
  public void seekVideoTo(float paramFloat)
  {
    if (!this.isInterstitial)
      if (Version.getAndroidSDKVersion() >= 14);
    AdMarvelActivity localAdMarvelActivity;
    d locald1;
    do
    {
      do
      {
        m localm;
        d locald2;
        do
        {
          do
          {
            return;
            Logging.log("window.ADMARVEL.seekToVideo()");
            localm = (m)this.adMarvelWebViewReference.get();
          }
          while (localm == null);
          locald2 = (d)this.adMarvelInternalWebViewReference.get();
        }
        while ((locald2 == null) || (localm.z == null) || (localm.z.length() <= 0));
        m.ab localab = new m.ab(localm, locald2, paramFloat);
        new Handler(Looper.getMainLooper()).post(localab);
        return;
        Logging.log("window.ADMARVEL.seekToVideo()");
        localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      }
      while (localAdMarvelActivity == null);
      locald1 = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald1 == null) || (this.videoUrl == null) || (this.videoUrl.length() <= 0));
    AdMarvelActivity.p localp = new AdMarvelActivity.p(localAdMarvelActivity, locald1, paramFloat);
    localAdMarvelActivity.d.post(localp);
  }

  @JavascriptInterface
  public void setAsHoverAd()
  {
    if ((!this.isInterstitial) && (this.adMarvelAd != null))
      this.adMarvelAd.setAsHoverAd();
  }

  @JavascriptInterface
  public void setInitialAudioState(String paramString)
  {
    if ((this.isInterstitial) || (Version.getAndroidSDKVersion() < 14));
    m localm;
    do
    {
      do
      {
        return;
        Logging.log("window.ADMARVEL.setInitialAudioState()");
        localm = (m)this.adMarvelWebViewReference.get();
      }
      while ((localm == null) || (paramString == null) || (paramString.trim().length() <= 0));
      if (paramString.equalsIgnoreCase("mute"))
      {
        localm.P = true;
        return;
      }
    }
    while (!paramString.equalsIgnoreCase("unmute"));
    localm.P = false;
  }

  @JavascriptInterface
  public void setVideoContainerHeight(int paramInt)
  {
    if ((this.isInterstitial) || (Version.getAndroidSDKVersion() < 14));
    m localm;
    do
    {
      return;
      Logging.log("ADMARVEL.setVideoContainerHeight " + paramInt);
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while (localm == null);
    localm.E = paramInt;
  }

  @JavascriptInterface
  public void setVideoDimensions(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    m localm;
    if (!this.isInterstitial)
    {
      Logging.log("ADMARVEL.setVideoDimensions " + paramInt1 + " " + paramInt2 + " " + paramInt3 + " " + paramInt4);
      localm = (m)this.adMarvelWebViewReference.get();
      if (localm != null)
        break label79;
    }
    label79: d locald;
    do
    {
      do
        return;
      while (Version.getAndroidSDKVersion() < 14);
      localm.A = paramInt3;
      localm.B = paramInt4;
      localm.C = paramInt1;
      localm.D = paramInt2;
      locald = (d)this.adMarvelInternalWebViewReference.get();
    }
    while ((locald == null) || (locald.b()));
    m.z localz = new m.z(localm, locald, paramInt1, paramInt2, paramInt3, paramInt4);
    new Handler(Looper.getMainLooper()).post(localz);
  }

  @JavascriptInterface
  public void setVideoUrl(String paramString)
  {
    AdMarvelActivity localAdMarvelActivity;
    if (this.isInterstitial)
    {
      Logging.log("window.ADMARVEL.setVideoUrl(\"" + paramString + "\")");
      localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      if (localAdMarvelActivity != null);
    }
    else
    {
      return;
    }
    this.videoUrl = paramString;
    localAdMarvelActivity.g = true;
  }

  @JavascriptInterface
  public void setbackgroundcolor(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (!locald.b()))
      if (!"0".equals(paramString))
        break label65;
    m localm;
    label65: long l;
    for (int i = 0; ; i = (int)l)
    {
      locald.setBackgroundColor(i);
      if (!this.isInterstitial)
      {
        localm = (m)this.adMarvelWebViewReference.get();
        if (localm != null)
          break;
      }
      return;
      l = Long.parseLong(paramString.replace("#", ""), 16);
      if ((paramString.length() == 7) || (paramString.length() == 6))
        l |= -16777216L;
    }
    localm.c = i;
    new Handler(Looper.getMainLooper()).post(new m.ac(localm));
  }

  @JavascriptInterface
  public void setsoftwarelayer()
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald == null) || (locald.b()) || (Version.getAndroidSDKVersion() < 11) || (this.isInterstitial) || ((m)this.adMarvelWebViewReference.get() == null))
      return;
    new Handler(Looper.getMainLooper()).post(new m.ah(locald));
  }

  @JavascriptInterface
  public void stopVideo()
  {
    if (!this.isInterstitial)
      if (Version.getAndroidSDKVersion() >= 14);
    AdMarvelActivity localAdMarvelActivity;
    d locald1;
    do
    {
      do
      {
        m localm;
        d locald2;
        do
        {
          do
          {
            return;
            Logging.log("window.ADMARVEL.stopVideo()");
            localm = (m)this.adMarvelWebViewReference.get();
          }
          while (localm == null);
          locald2 = (d)this.adMarvelInternalWebViewReference.get();
        }
        while (locald2 == null);
        m.ad localad = new m.ad(localm, locald2);
        new Handler(Looper.getMainLooper()).post(localad);
        return;
        Logging.log("window.ADMARVEL.stopVideo()");
        localAdMarvelActivity = (AdMarvelActivity)this.adMarvelActivityReference.get();
      }
      while (localAdMarvelActivity == null);
      locald1 = (d)this.adMarvelInternalWebViewReference.get();
    }
    while (locald1 == null);
    AdMarvelActivity.r localr = new AdMarvelActivity.r(localAdMarvelActivity, locald1);
    localAdMarvelActivity.d.post(localr);
  }

  @JavascriptInterface
  public void storepicture(String paramString1, final String paramString2)
  {
    Context localContext = (Context)this.contextReference.get();
    if (localContext == null);
    final d locald;
    final String str;
    do
    {
      do
      {
        return;
        locald = (d)this.adMarvelInternalWebViewReference.get();
      }
      while ((locald == null) || (locald.b()));
      str = r.a(paramString1, localContext);
      if ((r.c(locald.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) && ("mounted".equals(Environment.getExternalStorageState())))
        break;
    }
    while (paramString2 == null);
    locald.e(paramString2 + "(NO)");
    return;
    if ((localContext instanceof Activity))
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder((Activity)localContext);
      localBuilder.setMessage("Allow storing image in your Gallery?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (Version.getAndroidSDKVersion() < 8)
          {
            f.a().b().execute(new r.s(locald, str, paramString2));
            return;
          }
          f.a().b().execute(new r.r(locald, str, paramString2));
        }
      }).setNegativeButton("No", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (paramString2 != null)
            locald.e(paramString2 + "(\"NO\")");
          paramAnonymousDialogInterface.cancel();
        }
      });
      localBuilder.create().show();
      return;
    }
    locald.e(paramString2 + "(\"NO\")");
  }

  @JavascriptInterface
  public void triggerVibration(String paramString)
  {
    int i = 10000;
    if ((paramString != null) && (paramString.trim().length() > 0));
    while (true)
    {
      int k;
      try
      {
        k = Integer.parseInt(paramString);
        if (k <= i)
          break label69;
        Logging.log("Time mentioned is greater than Max duration ");
        j = i;
        r.a((Context)this.contextReference.get(), j);
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Logging.log("NumberFormatException so setting vibrate time to 500 Milli Sec");
      }
      int j = 500;
      continue;
      label69: i = k;
    }
  }

  @JavascriptInterface
  public void updateAudioState(String paramString)
  {
    if ((this.isInterstitial) || (Version.getAndroidSDKVersion() < 14));
    m localm;
    do
    {
      return;
      Logging.log("window.ADMARVEL.updateAudioState()");
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while (localm == null);
    m.af localaf = new m.af(localm, paramString);
    new Handler(Looper.getMainLooper()).post(localaf);
  }

  @JavascriptInterface
  public void updatestate(String paramString)
  {
    d locald = (d)this.adMarvelInternalWebViewReference.get();
    if ((locald != null) && (locald.b()));
    m localm;
    do
    {
      do
        return;
      while (this.isInterstitial);
      localm = (m)this.adMarvelWebViewReference.get();
    }
    while (localm == null);
    new Handler(Looper.getMainLooper()).post(new m.ag(paramString, localm));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebViewJSInterface
 * JD-Core Version:    0.6.2
 */