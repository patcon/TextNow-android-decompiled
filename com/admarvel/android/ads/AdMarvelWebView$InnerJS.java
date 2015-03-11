package com.admarvel.android.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class AdMarvelWebView$InnerJS
{
  final AdMarvelAd adMarvelAd;
  final WeakReference<AdMarvelInternalWebView> adMarvelInternalWebViewReference;
  private final WeakReference<AdMarvelWebView> adMarvelWebViewReference;
  private final WeakReference<Context> contextReference;
  private final Handler handler;
  private String lockedOrientation = null;

  public AdMarvelWebView$InnerJS(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelAd paramAdMarvelAd, Handler paramHandler, AdMarvelWebView paramAdMarvelWebView, Context paramContext)
  {
    this.adMarvelInternalWebViewReference = new WeakReference(paramAdMarvelInternalWebView);
    this.adMarvelWebViewReference = new WeakReference(paramAdMarvelWebView);
    this.contextReference = new WeakReference(paramContext);
    this.adMarvelAd = paramAdMarvelAd;
    this.handler = paramHandler;
  }

  @JavascriptInterface
  public void cacheitem(String paramString1, String paramString2, int paramInt)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown())));
    if (ac.a() >= 11)
    {
      this.handler.post(new AdMarvelWebView.a(localAdMarvelWebView.getContext(), localAdMarvelInternalWebView, paramString1, paramString2, paramInt, AdMarvelWebView.P(localAdMarvelWebView)));
      return;
    }
    k localk = new k(localAdMarvelWebView.getContext(), localAdMarvelInternalWebView, AdMarvelWebView.P(localAdMarvelWebView));
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString1;
    arrayOfObject[1] = paramString2;
    arrayOfObject[2] = Integer.valueOf(paramInt);
    localk.execute(arrayOfObject);
  }

  @JavascriptInterface
  public void checkForApplicationSupportedOrientations(final String paramString)
  {
    final AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if (localAdMarvelInternalWebView == null);
    final String str1;
    do
    {
      Context localContext;
      do
      {
        do
          return;
        while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
        localContext = localAdMarvelInternalWebView.getContext();
      }
      while ((localContext == null) || (!(localContext instanceof Activity)));
      String[] arrayOfString = ab.a((Activity)localContext).split(",");
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
    while (localAdMarvelInternalWebView == null);
    this.handler.post(new Runnable()
    {
      public void run()
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + paramString + "(" + str1 + ")");
      }
    });
  }

  @JavascriptInterface
  public void checkFrameValues(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    if (ac.a() >= 9)
    {
      AdMarvelWebView.t localt = new AdMarvelWebView.t(localAdMarvelWebView);
      this.handler.post(localt);
    }
    this.handler.post(new AdMarvelWebView.f(paramString, localAdMarvelInternalWebView, localAdMarvelWebView));
  }

  @JavascriptInterface
  public void checkNetworkAvailable(String paramString)
  {
    if ((AdMarvelWebView)this.adMarvelWebViewReference.get() == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    this.handler.post(new AdMarvelWebView.g(localAdMarvelInternalWebView, paramString));
  }

  @JavascriptInterface
  public void cleanup()
  {
    Logging.log("window.ADMARVEL.cleanup()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    while ((AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get() == null)
      return;
    AdMarvelWebView.h localh = new AdMarvelWebView.h(localAdMarvelWebView);
    this.handler.post(localh);
  }

  @JavascriptInterface
  public void close()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    this.handler.post(new AdMarvelWebView.j(localAdMarvelWebView));
  }

  @JavascriptInterface
  public void createcalendarevent(final String paramString1, final String paramString2, final String paramString3)
  {
    final AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    Context localContext;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (!ab.d(localAdMarvelWebView.getContext(), "android.permission.READ_CALENDAR")) || (!ab.d(localAdMarvelWebView.getContext(), "android.permission.WRITE_CALENDAR")));
      localContext = localAdMarvelWebView.getContext();
    }
    while (!(localContext instanceof Activity));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder((Activity)localContext);
    localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (ac.a() >= 14)
        {
          AdMarvelWebView.InnerJS.this.handler.post(new AdMarvelWebView.l(localAdMarvelInternalWebView, localAdMarvelWebView, paramString1, paramString2, paramString3));
          return;
        }
        AdMarvelWebView.InnerJS.this.handler.post(new AdMarvelWebView.k(localAdMarvelInternalWebView, localAdMarvelWebView, paramString1, paramString2, paramString3));
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
    final AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    Context localContext;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (!ab.d(localAdMarvelWebView.getContext(), "android.permission.READ_CALENDAR")) || (!ab.d(localAdMarvelWebView.getContext(), "android.permission.WRITE_CALENDAR")));
      localContext = localAdMarvelWebView.getContext();
    }
    while (!(localContext instanceof Activity));
    AlertDialog.Builder localBuilder = new AlertDialog.Builder((Activity)localContext);
    localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
      public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        if (ac.a() >= 14)
        {
          AdMarvelWebView.InnerJS.this.handler.post(new AdMarvelWebView.l(localAdMarvelInternalWebView, localAdMarvelWebView, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt));
          return;
        }
        AdMarvelWebView.InnerJS.this.handler.post(new AdMarvelWebView.k(localAdMarvelInternalWebView, localAdMarvelWebView, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt));
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
    final AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
      if ((ab.d(localAdMarvelWebView.getContext(), "android.permission.READ_CALENDAR")) && (ab.d(localAdMarvelWebView.getContext(), "android.permission.WRITE_CALENDAR")))
        break;
    }
    while (paramString11 == null);
    this.handler.post(new Runnable()
    {
      public void run()
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + paramString11 + "(NO)");
      }
    });
    return;
    Context localContext = localAdMarvelWebView.getContext();
    if ((localContext instanceof Activity))
    {
      Activity localActivity = (Activity)localContext;
      AlertDialog.Builder localBuilder = new AlertDialog.Builder(localActivity);
      localBuilder.setMessage("Allow access to Calendar?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (ac.a() >= 14)
          {
            AdMarvelWebView.InnerJS.this.handler.post(new AdMarvelWebView.l(localAdMarvelInternalWebView, localAdMarvelWebView, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt1, paramString7, paramString8, paramString9, paramString10, paramInt2, paramInt3, paramString11));
            return;
          }
          AdMarvelWebView.InnerJS.this.handler.post(new AdMarvelWebView.k(localAdMarvelInternalWebView, localAdMarvelWebView, paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, paramInt1, paramString7, paramString8, paramString9, paramString10, paramInt2, paramInt3, paramString11));
        }
      }).setNegativeButton("No", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (paramString11 != null)
            AdMarvelWebView.InnerJS.this.handler.post(new Runnable()
            {
              public void run()
              {
                AdMarvelWebView.InnerJS.7.this.val$adMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.InnerJS.7.this.val$callback + "(\"NO\")");
              }
            });
          paramAnonymousDialogInterface.cancel();
        }
      });
      localBuilder.create().show();
      return;
    }
    this.handler.post(new Runnable()
    {
      public void run()
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + paramString11 + "(\"NO\")");
      }
    });
  }

  @JavascriptInterface
  public void delaydisplay()
  {
    if (this.adMarvelInternalWebViewReference != null)
    {
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      if ((localAdMarvelInternalWebView == null) || (!localAdMarvelInternalWebView.isSignalShutdown()));
    }
    AdMarvelWebView localAdMarvelWebView;
    do
    {
      return;
      localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    }
    while (localAdMarvelWebView == null);
    AdMarvelWebView.m(localAdMarvelWebView).set(true);
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
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
      localAdMarvelInternalWebView.visibilityCallback = paramString;
  }

  @JavascriptInterface
  public void disableRotationForExpand()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    do
    {
      AdMarvelInternalWebView localAdMarvelInternalWebView;
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
      AdMarvelWebView.k(localAdMarvelWebView, true);
      this.lockedOrientation = null;
    }
    while ((!AdMarvelWebView.f(localAdMarvelWebView)) || (!AdMarvelWebView.R(localAdMarvelWebView)));
    disablerotations(this.lockedOrientation);
  }

  @JavascriptInterface
  public void disableRotationForExpand(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    do
    {
      AdMarvelInternalWebView localAdMarvelInternalWebView;
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
      AdMarvelWebView.k(localAdMarvelWebView, true);
      this.lockedOrientation = paramString;
    }
    while ((!AdMarvelWebView.f(localAdMarvelWebView)) || (!AdMarvelWebView.R(localAdMarvelWebView)));
    disablerotations(paramString);
  }

  @JavascriptInterface
  public void disableautodetect()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView.j(localAdMarvelWebView).set(false);
  }

  @JavascriptInterface
  public void disablerotations()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    label107: 
    while (true)
    {
      return;
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      if ((localAdMarvelInternalWebView == null) || (!localAdMarvelInternalWebView.isSignalShutdown()))
      {
        Context localContext = localAdMarvelWebView.getContext();
        if ((localContext != null) && ((localContext instanceof Activity)));
        for (Activity localActivity = (Activity)localContext; ; localActivity = null)
        {
          if (localActivity == null)
            break label107;
          int i = localAdMarvelWebView.getResources().getConfiguration().orientation;
          if (i == 1)
          {
            localActivity.setRequestedOrientation(1);
            return;
          }
          if (i != 2)
            break;
          localActivity.setRequestedOrientation(0);
          return;
        }
      }
    }
  }

  @JavascriptInterface
  public void disablerotations(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    Activity localActivity;
    int i;
    label207: label252: 
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              AdMarvelInternalWebView localAdMarvelInternalWebView;
              do
              {
                return;
                localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
              }
              while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
              Context localContext = localAdMarvelWebView.getContext();
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
            if (ac.a() < 9)
              i = localAdMarvelWebView.getResources().getConfiguration().orientation;
            while (true)
            {
              if (paramString == null)
                break label313;
              if (AdMarvelWebView.x(localAdMarvelWebView))
                break label252;
              if (ac.a() >= 9)
                break label207;
              if ((!paramString.equalsIgnoreCase("Portrait")) || (i != 1))
                break;
              localActivity.setRequestedOrientation(1);
              return;
              AdMarvelWebView.t localt = new AdMarvelWebView.t(localAdMarvelWebView);
              this.handler.post(localt);
              for (i = -2147483648; i == -2147483648; i = AdMarvelWebView.t.a(localt));
            }
          }
          while ((!paramString.equalsIgnoreCase("LandscapeLeft")) || (i != 2));
          localActivity.setRequestedOrientation(0);
          return;
          if ((paramString.equalsIgnoreCase("Portrait")) && (i == 0))
          {
            localActivity.setRequestedOrientation(1);
            return;
          }
        }
        while ((!paramString.equalsIgnoreCase("LandscapeLeft")) || (i != 1));
        localActivity.setRequestedOrientation(0);
        return;
        if (ac.a() >= 9)
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
      this.handler.post(new AdMarvelWebView.ag(localActivity, paramString));
      return;
      if (ac.a() >= 9)
        break;
      if (i == 1)
      {
        localActivity.setRequestedOrientation(1);
        return;
      }
    }
    while (i != 2);
    label313: localActivity.setRequestedOrientation(0);
    return;
    if (i == 0)
    {
      this.handler.post(new AdMarvelWebView.ag(localActivity, "Portrait"));
      return;
    }
    if (i == 1)
    {
      this.handler.post(new AdMarvelWebView.ag(localActivity, "LandscapeLeft"));
      return;
    }
    this.handler.post(new AdMarvelWebView.ag(localActivity, "none"));
  }

  @JavascriptInterface
  public void enableautodetect()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView.j(localAdMarvelWebView).set(true);
  }

  @JavascriptInterface
  public void enablerotations()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    while (true)
    {
      return;
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      if ((localAdMarvelInternalWebView == null) || (!localAdMarvelInternalWebView.isSignalShutdown()))
      {
        Context localContext = localAdMarvelWebView.getContext();
        if ((localContext != null) && ((localContext instanceof Activity)));
        for (Activity localActivity = (Activity)localContext; localActivity != null; localActivity = null)
        {
          localActivity.setRequestedOrientation(AdMarvelWebView.S(localAdMarvelWebView));
          AdMarvelWebView.k(localAdMarvelWebView, false);
          return;
        }
      }
    }
  }

  @JavascriptInterface
  public void expandto(int paramInt1, int paramInt2)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView localAdMarvelWebView;
    Context localContext;
    do
    {
      do
      {
        return;
        localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
      }
      while (localAdMarvelWebView == null);
      localContext = localAdMarvelInternalWebView.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    if (AdMarvelWebView.f(localAdMarvelWebView))
    {
      this.handler.post(new AdMarvelWebView.n(localAdMarvelWebView, localActivity, paramInt1, paramInt2));
      return;
    }
    this.handler.post(new AdMarvelWebView.o(localAdMarvelWebView, localActivity, paramInt1, paramInt2, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandto(int paramInt1, int paramInt2, int paramInt3, int paramInt4, String paramString1, String paramString2)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView localAdMarvelWebView;
    Context localContext;
    do
    {
      do
      {
        return;
        localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
      }
      while (localAdMarvelWebView == null);
      localContext = localAdMarvelInternalWebView.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      expandtofullscreen(paramString1, paramString2);
      return;
    }
    if (paramString1 != null)
      localAdMarvelWebView.c = paramString1;
    if (AdMarvelWebView.f(localAdMarvelWebView))
    {
      this.handler.post(new AdMarvelWebView.n(localAdMarvelWebView, localActivity, paramInt1, paramInt2, paramInt3, paramInt4));
      return;
    }
    this.handler.post(new AdMarvelWebView.o(localAdMarvelWebView, localActivity, paramInt1, paramInt2, paramInt3, paramInt4, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandto(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView localAdMarvelWebView;
    Context localContext;
    do
    {
      do
      {
        return;
        localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
      }
      while (localAdMarvelWebView == null);
      localContext = localAdMarvelInternalWebView.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    if ((paramString2 != null) && (paramString2.length() > 0))
    {
      expandtofullscreen(paramString1, paramString2);
      return;
    }
    if (paramString1 != null)
      localAdMarvelWebView.c = paramString1;
    if (AdMarvelWebView.f(localAdMarvelWebView))
    {
      this.handler.post(new AdMarvelWebView.n(localAdMarvelWebView, localActivity, paramInt1, paramInt2));
      return;
    }
    this.handler.post(new AdMarvelWebView.o(localAdMarvelWebView, localActivity, paramInt1, paramInt2, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandtofullscreen()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView localAdMarvelWebView;
    Context localContext;
    do
    {
      do
      {
        return;
        localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
      }
      while (localAdMarvelWebView == null);
      localContext = localAdMarvelInternalWebView.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    AdMarvelWebView.f(localAdMarvelWebView, true);
    if (AdMarvelWebView.x(localAdMarvelWebView))
      disablerotations(this.lockedOrientation);
    if (AdMarvelWebView.f(localAdMarvelWebView))
    {
      this.handler.post(new AdMarvelWebView.n(localAdMarvelWebView, localActivity, 0, 0, -1, -1));
      return;
    }
    this.handler.post(new AdMarvelWebView.o(localAdMarvelWebView, localActivity, 0, 0, -1, -1, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandtofullscreen(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView localAdMarvelWebView;
    Context localContext;
    do
    {
      do
      {
        return;
        localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
      }
      while (localAdMarvelWebView == null);
      localContext = localAdMarvelInternalWebView.getContext();
    }
    while ((localContext == null) || (!(localContext instanceof Activity)));
    Activity localActivity = (Activity)localContext;
    AdMarvelWebView.f(localAdMarvelWebView, true);
    if (paramString != null)
      localAdMarvelWebView.c = paramString;
    if (AdMarvelWebView.x(localAdMarvelWebView))
      disablerotations(this.lockedOrientation);
    if (AdMarvelWebView.f(localAdMarvelWebView))
    {
      this.handler.post(new AdMarvelWebView.n(localAdMarvelWebView, localActivity, 0, 0, -1, -1));
      return;
    }
    this.handler.post(new AdMarvelWebView.o(localAdMarvelWebView, localActivity, 0, 0, -1, -1, this.adMarvelAd));
  }

  @JavascriptInterface
  public void expandtofullscreen(String paramString1, String paramString2)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView localAdMarvelWebView;
    do
    {
      return;
      localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    }
    while (localAdMarvelWebView == null);
    Context localContext = localAdMarvelInternalWebView.getContext();
    Activity localActivity;
    if ((localContext != null) && ((localContext instanceof Activity)))
    {
      localActivity = (Activity)localContext;
      label66: if (paramString1 != null)
        localAdMarvelWebView.c = paramString1;
      AdMarvelWebView.f(localAdMarvelWebView, true);
      if ((paramString2 != null) && (paramString2.length() > 0))
      {
        localAdMarvelWebView.d = paramString2;
        AdMarvelWebView.g(localAdMarvelWebView, true);
      }
      if (AdMarvelWebView.x(localAdMarvelWebView))
      {
        if (!AdMarvelWebView.Q(localAdMarvelWebView))
          break label215;
        if ((this.lockedOrientation == null) || (this.lockedOrientation.length() <= 0))
          break label203;
        AdMarvelWebView.b(localAdMarvelWebView, this.lockedOrientation);
      }
    }
    while (true)
    {
      if ((paramString2 == null) || (paramString2.length() <= 0))
        break label226;
      this.handler.post(new AdMarvelWebView.p(localAdMarvelWebView, paramString2, this.adMarvelAd));
      return;
      if (paramString2 == null)
        break;
      int i = paramString2.length();
      localActivity = null;
      if (i != 0)
        break label66;
      return;
      label203: AdMarvelWebView.b(localAdMarvelWebView, "Current");
      continue;
      label215: disablerotations(this.lockedOrientation);
    }
    label226: if (AdMarvelWebView.f(localAdMarvelWebView))
    {
      this.handler.post(new AdMarvelWebView.n(localAdMarvelWebView, localActivity, 0, 0, -1, -1));
      return;
    }
    this.handler.post(new AdMarvelWebView.o(localAdMarvelWebView, localActivity, 0, 0, -1, -1, this.adMarvelAd));
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
    Logging.log("window.ADMARVEL.finishVideo()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    while ((AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get() == null)
      return;
    AdMarvelWebView.q localq = new AdMarvelWebView.q(localAdMarvelWebView);
    this.handler.post(localq);
  }

  @JavascriptInterface
  public void firePixel(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    this.handler.post(new AdMarvelWebView.r(localAdMarvelInternalWebView, localAdMarvelWebView, paramString));
  }

  @JavascriptInterface
  public int getAndroidOSVersionAPI()
  {
    return ac.a();
  }

  @JavascriptInterface
  public void getLocation(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
      this.handler.post(new AdMarvelWebView.s(localAdMarvelInternalWebView, paramString));
  }

  @JavascriptInterface
  public void initAdMarvel(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    if (ac.a() >= 9)
    {
      AdMarvelWebView.t localt = new AdMarvelWebView.t(localAdMarvelWebView);
      this.handler.post(localt);
    }
    this.handler.post(new AdMarvelWebView.u(paramString, localAdMarvelInternalWebView, localAdMarvelWebView));
  }

  @JavascriptInterface
  public void initVideo(String paramString)
  {
    Logging.log("window.ADMARVEL.setVideoUrl(\"" + paramString + "\")");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      AdMarvelWebView.d(localAdMarvelWebView, paramString);
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (AdMarvelWebView.T(localAdMarvelWebView) == null) || (AdMarvelWebView.T(localAdMarvelWebView).length() <= 0));
    this.handler.post(new AdMarvelWebView.v(paramString, localAdMarvelWebView, localAdMarvelInternalWebView));
  }

  @JavascriptInterface
  public int isinitialload()
  {
    return 1;
  }

  @JavascriptInterface
  public int isinstalled(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if (localAdMarvelInternalWebView == null)
      return 0;
    if ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()))
      return 0;
    if (ab.a(localAdMarvelInternalWebView.getContext(), paramString))
      return 1;
    return 0;
  }

  @JavascriptInterface
  public int isvideocached()
  {
    Logging.log("window.ADMARVEL.isvideocached()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null)
      return 0;
    f localf = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
    if (localf != null)
    {
      if (localf.b(localf.a().toString()))
        return 1;
      return 0;
    }
    return 0;
  }

  @JavascriptInterface
  public void loadVideo()
  {
    Logging.log("window.ADMARVEL.loadVideo()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (AdMarvelWebView.T(localAdMarvelWebView) == null) || (AdMarvelWebView.T(localAdMarvelWebView).length() <= 0));
    AdMarvelWebView.w localw = new AdMarvelWebView.w(AdMarvelWebView.T(localAdMarvelWebView), localAdMarvelWebView, localAdMarvelInternalWebView);
    this.handler.post(localw);
  }

  @JavascriptInterface
  public void notifyInAppBrowserCloseAction(String paramString)
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    if ((localAdMarvelInternalWebView != null) && (!localAdMarvelInternalWebView.isSignalShutdown()))
      localAdMarvelInternalWebView.mInAppBrowserCloseCallback = paramString;
  }

  @JavascriptInterface
  public void pauseVideo()
  {
    Logging.log("window.ADMARVEL.pauseVideo()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while (localAdMarvelInternalWebView == null);
    AdMarvelWebView.z localz = new AdMarvelWebView.z(localAdMarvelWebView, localAdMarvelInternalWebView);
    this.handler.post(localz);
  }

  @JavascriptInterface
  public void playVideo()
  {
    Logging.log("window.ADMARVEL.playVideo()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (AdMarvelWebView.T(localAdMarvelWebView) == null) || (AdMarvelWebView.T(localAdMarvelWebView).length() <= 0));
    AdMarvelWebView.aa localaa = new AdMarvelWebView.aa(localAdMarvelWebView, localAdMarvelInternalWebView);
    this.handler.post(localaa);
  }

  @JavascriptInterface
  public void readyfordisplay()
  {
    if (this.adMarvelInternalWebViewReference != null)
    {
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      if ((localAdMarvelInternalWebView == null) || (!localAdMarvelInternalWebView.isSignalShutdown()));
    }
    AdMarvelWebView localAdMarvelWebView;
    do
    {
      do
      {
        return;
        localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
      }
      while (localAdMarvelWebView == null);
      if (!AdMarvelWebView.l(localAdMarvelWebView).get())
        break;
    }
    while ((!AdMarvelWebView.k(localAdMarvelWebView).compareAndSet(true, false)) || (AdMarvelWebView.a(localAdMarvelWebView.e) == null));
    AdMarvelWebView.a(localAdMarvelWebView.e).a(localAdMarvelWebView, this.adMarvelAd);
    return;
    AdMarvelWebView.m(localAdMarvelWebView).set(false);
  }

  @JavascriptInterface
  public void redirect(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while (((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown())) || (localAdMarvelInternalWebView == null) || ((!localAdMarvelInternalWebView.b()) && ((paramString == null) || (paramString.length() <= 0) || ((!paramString.startsWith("admarvelsdk")) && (!paramString.startsWith("admarvelinternal"))))));
    AdMarvelWebView.a(localAdMarvelWebView, paramString);
  }

  @JavascriptInterface
  public void registerEventsForAdMarvelVideo(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0));
    AdMarvelWebView localAdMarvelWebView;
    do
    {
      do
      {
        return;
        localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
      }
      while (localAdMarvelWebView == null);
      if (paramString1.equals("loadeddata"))
      {
        AdMarvelWebView.e(localAdMarvelWebView, paramString2);
        return;
      }
      if (paramString1.equals("play"))
      {
        AdMarvelWebView.f(localAdMarvelWebView, paramString2);
        return;
      }
      if (paramString1.equals("canplay"))
      {
        AdMarvelWebView.g(localAdMarvelWebView, paramString2);
        return;
      }
      if (paramString1.equals("timeupdate"))
      {
        AdMarvelWebView.h(localAdMarvelWebView, paramString2);
        return;
      }
      if (paramString1.equals("ended"))
      {
        AdMarvelWebView.i(localAdMarvelWebView, paramString2);
        return;
      }
      if (paramString1.equals("pause"))
      {
        AdMarvelWebView.j(localAdMarvelWebView, paramString2);
        return;
      }
      if (paramString1.equals("resume"))
      {
        AdMarvelWebView.k(localAdMarvelWebView, paramString2);
        return;
      }
      if (paramString1.equals("stop"))
      {
        AdMarvelWebView.l(localAdMarvelWebView, paramString2);
        return;
      }
    }
    while (!paramString1.equals("error"));
    AdMarvelWebView.m(localAdMarvelWebView, paramString2);
  }

  @JavascriptInterface
  public void registeraccelerationevent(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
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
    while ((localn == null) || (!localn.a(localAdMarvelWebView.getContext())));
    localn.b(paramString);
    localn.a(localAdMarvelWebView.getContext(), localAdMarvelInternalWebView);
  }

  @JavascriptInterface
  public void registerheadingevent(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
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
    while ((localn == null) || (!localn.a(localAdMarvelWebView.getContext())));
    localn.c(paramString);
    localn.a(localAdMarvelWebView.getContext(), localAdMarvelInternalWebView);
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
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
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
    while ((localn == null) || (!localn.a(localAdMarvelWebView.getContext())));
    localn.a(paramString1);
    localn.a(paramString2, paramString3);
    localn.a(localAdMarvelWebView.getContext(), localAdMarvelInternalWebView);
  }

  @JavascriptInterface
  public void reportAdMarvelAdHistory()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    Context localContext;
    do
    {
      return;
      localContext = localAdMarvelWebView.getContext();
    }
    while (localContext == null);
    AdMarvelUtils.reportAdMarvelAdHistory(localContext);
  }

  @JavascriptInterface
  public void reportAdMarvelAdHistory(int paramInt)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    Context localContext;
    do
    {
      return;
      localContext = localAdMarvelWebView.getContext();
    }
    while (localContext == null);
    AdMarvelUtils.reportAdMarvelAdHistory(paramInt, localContext);
  }

  @JavascriptInterface
  public void resumeVideo()
  {
    Logging.log("window.ADMARVEL.resumeVideo()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while (localAdMarvelInternalWebView == null);
    AdMarvelWebView.ad localad = new AdMarvelWebView.ad(localAdMarvelWebView, localAdMarvelInternalWebView);
    this.handler.post(localad);
  }

  @JavascriptInterface
  public void sdkclosebutton(String paramString1, String paramString2)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    do
    {
      AdMarvelInternalWebView localAdMarvelInternalWebView;
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
      AdMarvelWebView.h(localAdMarvelWebView, false);
      AdMarvelWebView.i(localAdMarvelWebView, false);
      AdMarvelWebView.j(localAdMarvelWebView, false);
      if ((paramString1 != null) && (paramString1.equals("true")))
      {
        AdMarvelWebView.h(localAdMarvelWebView, true);
        AdMarvelWebView.j(localAdMarvelWebView, true);
        return;
      }
    }
    while ((paramString1 == null) || (!paramString1.equals("false")) || (paramString2 == null) || (!paramString2.equals("true")));
    AdMarvelWebView.h(localAdMarvelWebView, true);
    AdMarvelWebView.i(localAdMarvelWebView, true);
    AdMarvelWebView.j(localAdMarvelWebView, false);
  }

  @JavascriptInterface
  public void sdkclosebutton(String paramString1, String paramString2, String paramString3)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    while (true)
    {
      return;
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      if ((localAdMarvelInternalWebView == null) || (!localAdMarvelInternalWebView.isSignalShutdown()))
      {
        AdMarvelWebView.h(localAdMarvelWebView, false);
        AdMarvelWebView.i(localAdMarvelWebView, false);
        AdMarvelWebView.j(localAdMarvelWebView, false);
        if ((paramString1 != null) && (paramString1.equals("true")))
        {
          AdMarvelWebView.h(localAdMarvelWebView, true);
          AdMarvelWebView.j(localAdMarvelWebView, true);
        }
        while ((paramString3 != null) && (paramString3.length() > 0))
        {
          AdMarvelWebView.c(localAdMarvelWebView, paramString3);
          return;
          if ((paramString1 != null) && (paramString1.equals("false")) && (paramString2 != null) && (paramString2.equals("true")))
          {
            AdMarvelWebView.h(localAdMarvelWebView, true);
            AdMarvelWebView.i(localAdMarvelWebView, true);
            AdMarvelWebView.j(localAdMarvelWebView, false);
          }
        }
      }
    }
  }

  @JavascriptInterface
  public void seekVideoTo(float paramFloat)
  {
    Logging.log("window.ADMARVEL.seekToVideo()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (AdMarvelWebView.T(localAdMarvelWebView) == null) || (AdMarvelWebView.T(localAdMarvelWebView).length() <= 0));
    AdMarvelWebView.ae localae = new AdMarvelWebView.ae(localAdMarvelWebView, localAdMarvelInternalWebView, paramFloat);
    this.handler.post(localae);
  }

  @JavascriptInterface
  public void setInitialAudioState(String paramString)
  {
    Logging.log("window.ADMARVEL.setInitialAudioState()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    do
    {
      do
        return;
      while ((paramString == null) || (paramString.trim().length() <= 0));
      if (paramString.equalsIgnoreCase("mute"))
      {
        AdMarvelWebView.e(localAdMarvelWebView, true);
        return;
      }
    }
    while (!paramString.equalsIgnoreCase("unmute"));
    AdMarvelWebView.e(localAdMarvelWebView, false);
  }

  @JavascriptInterface
  public void setVideoContainerHeight(int paramInt)
  {
    Logging.log("ADMARVEL.setVideoContainerHeight " + paramInt);
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null)
      return;
    AdMarvelWebView.g(localAdMarvelWebView, paramInt);
  }

  @JavascriptInterface
  public void setVideoDimensions(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Logging.log("ADMARVEL.setVideoDimensions " + paramInt1 + " " + paramInt2 + " " + paramInt3 + " " + paramInt4);
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      AdMarvelWebView.c(localAdMarvelWebView, paramInt3);
      AdMarvelWebView.d(localAdMarvelWebView, paramInt4);
      AdMarvelWebView.e(localAdMarvelWebView, paramInt1);
      AdMarvelWebView.f(localAdMarvelWebView, paramInt2);
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    AdMarvelWebView.ab localab = new AdMarvelWebView.ab(localAdMarvelWebView, localAdMarvelInternalWebView, paramInt1, paramInt2, paramInt3, paramInt4);
    this.handler.post(localab);
  }

  @JavascriptInterface
  public void setbackgroundcolor(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
    if ("0".equals(paramString));
    long l;
    for (int i = 0; ; i = (int)l)
    {
      localAdMarvelInternalWebView.setBackgroundColor(i);
      localAdMarvelWebView.b = i;
      this.handler.post(new AdMarvelWebView.af(localAdMarvelWebView));
      return;
      l = Long.parseLong(paramString.replace("#", ""), 16);
      if ((paramString.length() == 7) || (paramString.length() == 6))
        l |= -16777216L;
    }
  }

  @JavascriptInterface
  public void setsoftwarelayer()
  {
    if ((AdMarvelWebView)this.adMarvelWebViewReference.get() == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (ac.a() < 11));
    this.handler.post(new AdMarvelWebView.an(localAdMarvelInternalWebView));
  }

  @JavascriptInterface
  public void stopVideo()
  {
    Logging.log("window.ADMARVEL.stopVideo()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while (localAdMarvelInternalWebView == null);
    AdMarvelWebView.ah localah = new AdMarvelWebView.ah(localAdMarvelWebView, localAdMarvelInternalWebView);
    this.handler.post(localah);
  }

  @JavascriptInterface
  public void storepicture(String paramString1, final String paramString2)
  {
    final AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    final AdMarvelInternalWebView localAdMarvelInternalWebView;
    final String str;
    do
    {
      do
      {
        return;
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
      }
      while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()));
      str = ab.a(paramString1, localAdMarvelWebView.getContext());
      if ((ab.d(localAdMarvelInternalWebView.getContext(), "android.permission.WRITE_EXTERNAL_STORAGE")) && ("mounted".equals(Environment.getExternalStorageState())))
        break;
    }
    while (paramString2 == null);
    this.handler.post(new Runnable()
    {
      public void run()
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + paramString2 + "(NO)");
      }
    });
    return;
    Context localContext = localAdMarvelWebView.getContext();
    if ((localContext instanceof Activity))
    {
      AlertDialog.Builder localBuilder = new AlertDialog.Builder((Activity)localContext);
      localBuilder.setMessage("Allow storing image in your Gallery?").setCancelable(false).setPositiveButton("Yes", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (ac.a() < 8)
          {
            AdMarvelWebView.InnerJS.this.handler.post(new AdMarvelWebView.aj(localAdMarvelWebView, localAdMarvelInternalWebView, str, paramString2));
            return;
          }
          AdMarvelWebView.InnerJS.this.handler.post(new AdMarvelWebView.ai(localAdMarvelWebView, localAdMarvelInternalWebView, str, paramString2));
        }
      }).setNegativeButton("No", new DialogInterface.OnClickListener()
      {
        public void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          if (paramString2 != null)
            AdMarvelWebView.InnerJS.this.handler.post(new Runnable()
            {
              public void run()
              {
                AdMarvelWebView.InnerJS.11.this.val$adMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.InnerJS.11.this.val$callback + "(\"NO\")");
              }
            });
          paramAnonymousDialogInterface.cancel();
        }
      });
      localBuilder.create().show();
      return;
    }
    this.handler.post(new Runnable()
    {
      public void run()
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + paramString2 + "(\"NO\")");
      }
    });
  }

  @JavascriptInterface
  public void triggerVibration(String paramString)
  {
    int i = 10000;
    if ((paramString != null) && (paramString.trim().length() > 0));
    while (true)
    {
      int k;
      AdMarvelWebView localAdMarvelWebView;
      try
      {
        k = Integer.parseInt(paramString);
        if (k <= i)
          break label82;
        Logging.log("Time mentioned is greater than Max duration ");
        j = i;
        localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
        if (localAdMarvelWebView != null)
          break label71;
        return;
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Logging.log("NumberFormatException so setting vibrate time to 500 Milli Sec");
      }
      int j = 500;
      continue;
      label71: ab.a(localAdMarvelWebView.getContext(), j);
      return;
      label82: i = k;
    }
  }

  @JavascriptInterface
  public void updateAudioState(String paramString)
  {
    Logging.log("window.ADMARVEL.updateAudioState()");
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null)
      return;
    AdMarvelWebView.al localal = new AdMarvelWebView.al(localAdMarvelWebView, paramString);
    this.handler.post(localal);
  }

  @JavascriptInterface
  public void updatestate(String paramString)
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.adMarvelWebViewReference.get();
    if (localAdMarvelWebView == null);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    do
    {
      return;
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.adMarvelInternalWebViewReference.get();
    }
    while ((localAdMarvelInternalWebView != null) && (localAdMarvelInternalWebView.isSignalShutdown()));
    this.handler.post(new AdMarvelWebView.am(paramString, localAdMarvelWebView));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.InnerJS
 * JD-Core Version:    0.6.2
 */