package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;

@SuppressLint({"NewApi", "HandlerLeak", "DefaultLocale", "SimpleDateFormat"})
public class AdMarvelActivity extends Activity
{
  static int a = 103422;
  private AdMarvelAd A;
  private AdMarvelActivity.s B;
  private String C;
  private boolean D = false;
  private boolean E = false;
  private boolean F = false;
  private String G;
  private Handler H = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      try
      {
        if (AdMarvelActivity.a(AdMarvelActivity.this) == true)
        {
          AdMarvelActivity.b(AdMarvelActivity.this);
          if (!AdMarvelInterstitialAds.getListener().b())
            AdMarvelActivity.this.finish();
          if ((AdMarvelActivity.this.o != null) && (AdMarvelActivity.this.o.length() > 0))
          {
            RelativeLayout localRelativeLayout = (RelativeLayout)AdMarvelActivity.this.findViewById(AdMarvelActivity.a);
            if (localRelativeLayout != null)
            {
              d locald = (d)localRelativeLayout.findViewWithTag(AdMarvelActivity.this.e + "WEBVIEW");
              if (locald != null)
                locald.loadUrl("javascript:" + AdMarvelActivity.this.o + "()");
            }
          }
          if (AdMarvelActivity.c(AdMarvelActivity.this) > 2)
            AdMarvelActivity.this.finish();
        }
        else
        {
          AdMarvelActivity.this.finish();
          return;
        }
      }
      catch (NullPointerException localNullPointerException)
      {
        Logging.log("Nullpointer exception occured in close" + localNullPointerException.getMessage());
      }
    }
  };
  private Handler I = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)AdMarvelActivity.this.findViewById(AdMarvelActivity.a);
      AdMarvelActivity localAdMarvelActivity = AdMarvelActivity.this;
      boolean bool;
      d locald;
      if (AdMarvelActivity.a(AdMarvelActivity.this))
      {
        bool = false;
        locald = new d(localAdMarvelActivity, bool, AdMarvelActivity.d(AdMarvelActivity.this), AdMarvelActivity.this.e, null, null, AdMarvelActivity.e(AdMarvelActivity.this));
        locald.setTag(AdMarvelActivity.this.e + "WEBVIEW");
        locald.k();
        locald.j();
        locald.addJavascriptInterface(new AdMarvelWebViewJSInterface(locald, AdMarvelActivity.e(AdMarvelActivity.this), AdMarvelActivity.this), "ADMARVEL");
        locald.addJavascriptInterface(new AdMarvelActivity.c(locald, AdMarvelActivity.this), "AndroidBridge");
        localRelativeLayout.addView(locald);
        if ((AdMarvelActivity.a(AdMarvelActivity.this)) || (AdMarvelActivity.f(AdMarvelActivity.this)))
          break label313;
        o localo2 = new o(AdMarvelActivity.this, AdMarvelActivity.this.getApplicationContext(), AdMarvelActivity.this.e, true);
        localo2.setTag(AdMarvelActivity.this.e + "CONTROLS");
        localRelativeLayout.addView(localo2);
      }
      while (true)
      {
        if (AdMarvelActivity.a(AdMarvelActivity.this))
          d.a(AdMarvelActivity.this.e, AdMarvelActivity.g(AdMarvelActivity.this));
        if ((AdMarvelActivity.h(AdMarvelActivity.this) == null) || (AdMarvelActivity.h(AdMarvelActivity.this).length() <= 0))
          break label380;
        locald.loadUrl(AdMarvelActivity.h(AdMarvelActivity.this));
        return;
        bool = true;
        break;
        label313: o localo1 = new o(AdMarvelActivity.this, AdMarvelActivity.this.getApplicationContext(), AdMarvelActivity.this.e, false);
        localo1.setTag(AdMarvelActivity.this.e + "CONTROLS");
        localRelativeLayout.addView(localo1);
      }
      label380: if ((AdMarvelActivity.this.e()) && (AdMarvelActivity.i(AdMarvelActivity.this) != null) && (AdMarvelActivity.i(AdMarvelActivity.this).length() > 0))
      {
        if (AdMarvelInterstitialAds.enableOfflineSDK)
        {
          if ((URLUtil.isNetworkUrl(AdMarvelActivity.i(AdMarvelActivity.this))) && (r.f(AdMarvelActivity.this)))
            locald.loadUrl(AdMarvelActivity.i(AdMarvelActivity.this));
          if (!URLUtil.isNetworkUrl(AdMarvelActivity.i(AdMarvelActivity.this)))
          {
            SharedPreferences localSharedPreferences = AdMarvelActivity.this.getSharedPreferences("admarvel_preferences", 0);
            String str2 = localSharedPreferences.getString("childDirectory", "NULL") + "/" + localSharedPreferences.getString("banner_folder", "NULL");
            if (str2 != null)
            {
              AdMarvelActivity.a(AdMarvelActivity.this, com.admarvel.android.util.a.b.a(str2, AdMarvelActivity.i(AdMarvelActivity.this)));
              Logging.log("Offline SDK:Admarvel XML Response:" + AdMarvelActivity.d(AdMarvelActivity.this));
            }
            locald.loadDataWithBaseURL(AdMarvelActivity.e(AdMarvelActivity.this).getOfflineBaseUrl() + "/", AdMarvelActivity.j(AdMarvelActivity.this), "text/html", "utf-8", null);
          }
        }
        while (true)
        {
          if (!AdMarvelActivity.k(AdMarvelActivity.this))
            locald.a(AdMarvelActivity.l(AdMarvelActivity.this));
          if ((AdMarvelActivity.m(AdMarvelActivity.this) == null) || (AdMarvelActivity.m(AdMarvelActivity.this).length() <= 0))
            break;
          AdMarvelActivity.this.a(AdMarvelActivity.m(AdMarvelActivity.this));
          return;
          locald.loadUrl(AdMarvelActivity.i(AdMarvelActivity.this));
        }
      }
      locald.setBackgroundColor(AdMarvelActivity.n(AdMarvelActivity.this));
      String str1 = "content://" + AdMarvelActivity.this.getPackageName() + ".AdMarvelLocalFileContentProvider";
      if (AdMarvelInterstitialAds.enableOfflineSDK)
      {
        locald.loadDataWithBaseURL(AdMarvelActivity.e(AdMarvelActivity.this).getOfflineBaseUrl() + "/", AdMarvelActivity.j(AdMarvelActivity.this), "text/html", "utf-8", null);
        return;
      }
      if (Version.getAndroidSDKVersion() < 11)
      {
        locald.loadDataWithBaseURL(str1, AdMarvelActivity.j(AdMarvelActivity.this), "text/html", "utf-8", null);
        return;
      }
      locald.loadDataWithBaseURL("http://baseurl.admarvel.com", AdMarvelActivity.j(AdMarvelActivity.this), "text/html", "utf-8", null);
    }
  };
  boolean b = false;
  Runnable c = new Runnable()
  {
    public void run()
    {
      AdMarvelActivity.this.b = false;
    }
  };
  final Handler d = new Handler();
  String e;
  public boolean f = false;
  public boolean g = false;
  String h;
  String i;
  String j;
  String k;
  String l;
  String m;
  String n;
  public String o;
  public String p;
  boolean q = false;
  private AdMarvelActivity.b r;
  private int s = 0;
  private String t;
  private String u;
  private String v;
  private int w;
  private boolean x = false;
  private boolean y = false;
  private String z;

  public int a()
  {
    return this.s;
  }

  void a(String paramString)
  {
    Logging.log("DisableActivityOrientation");
    int i1;
    if (Version.getAndroidSDKVersion() < 9)
    {
      i1 = getResources().getConfiguration().orientation;
      if (paramString != null)
      {
        if (Version.getAndroidSDKVersion() >= 9)
          break label127;
        if (!paramString.equalsIgnoreCase("Portrait"))
          break label81;
        setRequestedOrientation(1);
      }
    }
    label81: 
    do
    {
      do
      {
        return;
        AdMarvelActivity.j localj = new AdMarvelActivity.j(this);
        localj.run();
        for (i1 = -2147483648; i1 == -2147483648; i1 = localj.a());
        break;
        if (paramString.equalsIgnoreCase("LandscapeLeft"))
        {
          setRequestedOrientation(0);
          return;
        }
      }
      while (!paramString.equalsIgnoreCase("Current"));
      if (i1 == 1)
      {
        setRequestedOrientation(1);
        return;
      }
    }
    while (i1 != 2);
    setRequestedOrientation(0);
    return;
    label127: if (paramString.equalsIgnoreCase("Portrait"))
    {
      setRequestedOrientation(1);
      return;
    }
    if (paramString.equalsIgnoreCase("LandscapeLeft"))
    {
      setRequestedOrientation(0);
      return;
    }
    if (paramString.equalsIgnoreCase("Current"))
    {
      if (i1 == 0)
      {
        this.d.post(new AdMarvelActivity.q(this, "Portrait"));
        return;
      }
      if (i1 == 1)
      {
        this.d.post(new AdMarvelActivity.q(this, "LandscapeLeft"));
        return;
      }
      this.d.post(new AdMarvelActivity.q(this, "none"));
      return;
    }
    this.d.post(new AdMarvelActivity.q(this, paramString));
  }

  public void b()
  {
    this.s = (1 + this.s);
  }

  boolean c()
  {
    return this.x;
  }

  boolean d()
  {
    return this.y;
  }

  boolean e()
  {
    return this.D;
  }

  String f()
  {
    return this.u;
  }

  void g()
  {
    this.H.sendEmptyMessage(0);
  }

  public void h()
  {
    this.d.postDelayed(new AdMarvelActivity.e(this.A, this), 1000L);
  }

  public void i()
  {
    this.d.postDelayed(new AdMarvelActivity.f(this.A, this), 3000L);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (AdMarvelUtils.getAdmarvelActivityOrientationInfo(this) != null)
      setRequestedOrientation(AdMarvelUtils.getAdmarvelActivityOrientationInfo(this).intValue());
    if (Version.getAndroidSDKVersion() >= 11)
      AdMarvelActivity.k.a(this);
    Bundle localBundle = getIntent().getExtras();
    byte[] arrayOfByte;
    if (localBundle != null)
    {
      this.t = localBundle.getString("url");
      this.u = localBundle.getString("source");
      this.v = localBundle.getString("html");
      this.z = localBundle.getString("xml");
      this.x = localBundle.getBoolean("isInterstitial", false);
      this.y = localBundle.getBoolean("isInterstitialClick", false);
      this.e = localBundle.getString("GUID");
      arrayOfByte = localBundle.getByteArray("serialized_admarvelad");
      if (arrayOfByte == null);
    }
    try
    {
      this.A = ((AdMarvelAd)new ObjectInputStream(new ByteArrayInputStream(arrayOfByte)).readObject());
      this.w = localBundle.getInt("backgroundcolor");
      this.C = localBundle.getString("expand_url");
      if ((this.C != null) && (this.C.length() > 0))
      {
        this.D = true;
        this.E = localBundle.getBoolean("closeBtnEnabled");
        this.F = localBundle.getBoolean("closeAreaEnabled");
        this.G = localBundle.getString("orientationState");
      }
      if ((AdMarvelUtils.isNotificationBarInFullScreenLaunchEnabled()) || ((!this.x) && ((Build.MODEL.contains("Kindle")) || (Build.PRODUCT.contains("Kindle")))))
      {
        getWindow().addFlags(256);
        getWindow().clearFlags(1024);
        this.r = new AdMarvelActivity.b(this);
        RelativeLayout localRelativeLayout = new RelativeLayout(this);
        localRelativeLayout.setId(a);
        localRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        localRelativeLayout.setBackgroundColor(-16777216);
        setContentView(localRelativeLayout);
        if ((this.x == true) && ((this instanceof AdMarvelActivity)))
          AdMarvelInterstitialAds.getListener().a(this);
        if (Version.getAndroidSDKVersion() < 11)
          break label432;
        this.d.post(new AdMarvelActivity.g(this, this.A));
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Logging.log(Log.getStackTraceString(localException));
        continue;
        getWindow().setFlags(512, 512);
      }
      label432: new AdMarvelActivity.a(this, this.A).execute(new Object[0]);
    }
  }

  protected void onDestroy()
  {
    com.admarvel.android.util.e locale = com.admarvel.android.util.e.a();
    if (locale.b())
      locale.c();
    AdMarvelActivity.d locald = new AdMarvelActivity.d(this);
    this.d.post(locald);
    RelativeLayout localRelativeLayout = (RelativeLayout)findViewById(a);
    if ((e()) && (d.c(this.e) != null))
      d.c(this.e).a();
    if (localRelativeLayout != null)
    {
      d locald2 = (d)localRelativeLayout.findViewWithTag(this.e + "WEBVIEW");
      if ((locald2 != null) && (locald2.j != null) && (locald2.j.length() > 0) && (locald2.k))
      {
        locald2.e(locald2.j + "(" + false + ")");
        locald2.k = false;
      }
    }
    if (localRelativeLayout != null)
    {
      d locald1 = (d)localRelativeLayout.findViewWithTag(this.e + "WEBVIEW");
      if (locald1 != null)
      {
        localRelativeLayout.removeView(locald1);
        locald1.loadUrl("");
        locald1.a();
      }
    }
    if (this.x)
      d.b(this.e);
    if (!AdMarvelUtils.isLogDumpEnabled())
      r.m(this);
    super.onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 0);
    switch (paramInt)
    {
    default:
      return super.onKeyDown(paramInt, paramKeyEvent);
    case 4:
    }
    if (this.b)
      return false;
    g();
    if ((!c()) && (d.d(this.e) != null))
      d.d(this.e).a(this.e);
    return true;
  }

  protected void onPause()
  {
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).pause();
      label10: RelativeLayout localRelativeLayout1 = (RelativeLayout)findViewById(a);
      if (localRelativeLayout1 != null)
      {
        d locald2 = (d)localRelativeLayout1.findViewWithTag(this.e + "WEBVIEW");
        if (locald2 != null)
          locald2.f();
      }
      if ((!isFinishing()) && (this.p != null) && (this.p.length() > 0))
      {
        RelativeLayout localRelativeLayout2 = (RelativeLayout)findViewById(a);
        if (localRelativeLayout2 != null)
        {
          d locald1 = (d)localRelativeLayout2.findViewWithTag(this.e + "WEBVIEW");
          if (locald1 != null)
            locald1.loadUrl("javascript:" + this.p + "()");
        }
      }
      if (c());
      try
      {
        AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).pause();
        label197: super.onPause();
        return;
      }
      catch (Exception localException2)
      {
        break label197;
      }
    }
    catch (Exception localException1)
    {
      break label10;
    }
  }

  protected void onResume()
  {
    super.onResume();
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).resume();
      label14: RelativeLayout localRelativeLayout = (RelativeLayout)findViewById(a);
      d locald;
      if (localRelativeLayout != null)
      {
        locald = (d)localRelativeLayout.findViewWithTag(this.e + "WEBVIEW");
        if (locald != null)
        {
          if (Version.getAndroidSDKVersion() < 11)
            break label102;
          aa.a(locald);
        }
      }
      while (true)
      {
        locald.g();
        if (c());
        try
        {
          AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).resume();
          return;
          label102: ab.a(locald);
        }
        catch (Exception localException2)
        {
        }
      }
    }
    catch (Exception localException1)
    {
      break label14;
    }
  }

  protected void onStart()
  {
    if (c());
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
      label17: super.onStart();
      return;
    }
    catch (Exception localException)
    {
      break label17;
    }
  }

  protected void onStop()
  {
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).stop();
      label10: if (Version.getAndroidSDKVersion() >= 7)
        this.d.post(new AdMarvelActivity.h(this, null));
      if (c());
      try
      {
        AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).stop();
        label52: super.onStop();
        return;
      }
      catch (Exception localException2)
      {
        break label52;
      }
    }
    catch (Exception localException1)
    {
      break label10;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity
 * JD-Core Version:    0.6.2
 */