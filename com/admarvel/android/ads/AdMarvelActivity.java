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
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@SuppressLint({"NewApi", "HandlerLeak", "DefaultLocale", "SimpleDateFormat"})
public class AdMarvelActivity extends Activity
{
  static int b = 103422;
  private String A;
  private String B;
  private String C;
  private String D;
  private boolean E = false;
  private String F;
  private boolean G = false;
  private boolean H = false;
  private boolean I = false;
  private String J;
  private Handler K = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      while (true)
      {
        try
        {
          if (AdMarvelActivity.this.a == null)
            break label243;
          localg = (AdMarvelActivity.g)AdMarvelActivity.this.a.get();
          if (localg != null)
          {
            localg.b();
            AdMarvelActivity.g.a(localg);
          }
          if (AdMarvelActivity.a(AdMarvelActivity.this) == true)
          {
            AdMarvelActivity.b(AdMarvelActivity.this);
            if (!AdMarvelInterstitialAds.getListener().b())
              AdMarvelActivity.this.finish();
            if ((AdMarvelActivity.this.e != null) && (AdMarvelActivity.this.e.length() > 0))
            {
              RelativeLayout localRelativeLayout = (RelativeLayout)AdMarvelActivity.this.findViewById(AdMarvelActivity.b);
              if (localRelativeLayout != null)
              {
                AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(AdMarvelActivity.this) + "WEBVIEW");
                if (localAdMarvelInternalWebView != null)
                  localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.this.e + "()");
              }
            }
            if (AdMarvelActivity.d(AdMarvelActivity.this) > 2)
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
        return;
        label243: AdMarvelActivity.g localg = null;
      }
    }
  };
  private Handler L = new Handler()
  {
    public void handleMessage(Message paramAnonymousMessage)
    {
      RelativeLayout localRelativeLayout = (RelativeLayout)AdMarvelActivity.this.findViewById(AdMarvelActivity.b);
      AdMarvelActivity localAdMarvelActivity = AdMarvelActivity.this;
      boolean bool;
      if (AdMarvelActivity.a(AdMarvelActivity.this))
        bool = false;
      while (true)
      {
        AdMarvelInternalWebView localAdMarvelInternalWebView = new AdMarvelInternalWebView(localAdMarvelActivity, bool, AdMarvelActivity.e(AdMarvelActivity.this), AdMarvelActivity.c(AdMarvelActivity.this), AdMarvelActivity.f(AdMarvelActivity.this), null, null, AdMarvelActivity.g(AdMarvelActivity.this));
        localAdMarvelInternalWebView.setVisibility(4);
        localAdMarvelInternalWebView.setTag(AdMarvelActivity.c(AdMarvelActivity.this) + "WEBVIEW");
        localAdMarvelInternalWebView.g();
        Class[] arrayOfClass;
        if (ac.a() >= 11)
        {
          ak.a(localAdMarvelInternalWebView);
          localAdMarvelInternalWebView.addJavascriptInterface(new AdMarvelActivity.InnerInterstitialJS(localAdMarvelInternalWebView, AdMarvelActivity.this, AdMarvelActivity.g(AdMarvelActivity.this)), "ADMARVEL");
          localAdMarvelInternalWebView.addJavascriptInterface(new AdMarvelActivity.BrightRollInnerInterstitialJS(localAdMarvelInternalWebView, AdMarvelActivity.this), "AndroidBridge");
          if (ab.d(AdMarvelActivity.this.getApplicationContext(), "android.permission.RECORD_AUDIO"))
            arrayOfClass = new Class[] { AdMarvelInternalWebView.class, String.class, String.class };
        }
        try
        {
          if (AdMarvelActivity.g(AdMarvelActivity.this) != null)
          {
            Class localClass = Class.forName("com.admarvel.android.admarvelspeechkitadapter.Speech");
            Object localObject = localClass.newInstance();
            Method localMethod = localClass.getDeclaredMethod("initSpeechMembers", arrayOfClass);
            Object[] arrayOfObject = new Object[3];
            arrayOfObject[0] = localAdMarvelInternalWebView;
            arrayOfObject[1] = AdMarvelActivity.g(AdMarvelActivity.this).getBannerid();
            arrayOfObject[2] = AdMarvelActivity.g(AdMarvelActivity.this).getSiteId();
            localMethod.invoke(localObject, arrayOfObject);
            localAdMarvelInternalWebView.addJavascriptInterface(localObject, "ADMARVEL_SPEECH");
          }
          localRelativeLayout.addView(localAdMarvelInternalWebView);
          if ((!AdMarvelActivity.a(AdMarvelActivity.this)) && (!AdMarvelActivity.h(AdMarvelActivity.this)))
          {
            w localw = new w(AdMarvelActivity.this, AdMarvelActivity.this.getApplicationContext(), AdMarvelActivity.c(AdMarvelActivity.this));
            localw.setVisibility(4);
            localw.setTag(AdMarvelActivity.c(AdMarvelActivity.this) + "CONTROLS");
            localRelativeLayout.addView(localw);
          }
          if (AdMarvelActivity.a(AdMarvelActivity.this))
            AdMarvelInternalWebView.a(AdMarvelActivity.c(AdMarvelActivity.this), AdMarvelActivity.i(AdMarvelActivity.this));
          if ((AdMarvelActivity.j(AdMarvelActivity.this) != null) && (AdMarvelActivity.j(AdMarvelActivity.this).length() > 0))
          {
            localAdMarvelInternalWebView.loadUrl(AdMarvelActivity.j(AdMarvelActivity.this));
            return;
            bool = true;
            continue;
            al.a(localAdMarvelInternalWebView);
          }
        }
        catch (ClassNotFoundException localClassNotFoundException)
        {
          while (true)
            Logging.log(localClassNotFoundException.getMessage());
        }
        catch (InstantiationException localInstantiationException)
        {
          while (true)
            Logging.log(localInstantiationException.getMessage());
        }
        catch (IllegalAccessException localIllegalAccessException)
        {
          while (true)
            Logging.log(localIllegalAccessException.getMessage());
        }
        catch (NoSuchMethodException localNoSuchMethodException)
        {
          while (true)
            Logging.log(localNoSuchMethodException.getMessage());
        }
        catch (IllegalArgumentException localIllegalArgumentException)
        {
          while (true)
            Logging.log(localIllegalArgumentException.getMessage());
        }
        catch (InvocationTargetException localInvocationTargetException)
        {
          while (true)
            Logging.log(localInvocationTargetException.getMessage());
        }
        catch (NullPointerException localNullPointerException)
        {
          while (true)
            Logging.log(localNullPointerException.getMessage());
          if ((AdMarvelActivity.this.e()) && (AdMarvelActivity.k(AdMarvelActivity.this) != null) && (AdMarvelActivity.k(AdMarvelActivity.this).length() > 0))
          {
            if (AdMarvelInterstitialAds.enableOfflineSDK)
            {
              if ((URLUtil.isNetworkUrl(AdMarvelActivity.k(AdMarvelActivity.this))) && (ab.f(AdMarvelActivity.this)))
                localAdMarvelInternalWebView.loadUrl(AdMarvelActivity.k(AdMarvelActivity.this));
              if (!URLUtil.isNetworkUrl(AdMarvelActivity.k(AdMarvelActivity.this)))
              {
                SharedPreferences localSharedPreferences = AdMarvelActivity.this.getSharedPreferences("admarvel_preferences", 0);
                String str2 = localSharedPreferences.getString("childDirectory", "NULL") + "/" + localSharedPreferences.getString("banner_folder", "NULL");
                if (str2 != null)
                {
                  AdMarvelActivity.a(AdMarvelActivity.this, com.admarvel.android.b.a.a(str2, AdMarvelActivity.k(AdMarvelActivity.this)));
                  Logging.log("Offline SDK:Admarvel XML Response:" + AdMarvelActivity.e(AdMarvelActivity.this));
                }
                localAdMarvelInternalWebView.loadDataWithBaseURL(AdMarvelActivity.g(AdMarvelActivity.this).getOfflineBaseUrl() + "/", AdMarvelActivity.l(AdMarvelActivity.this), "text/html", "utf-8", null);
              }
            }
            while (true)
            {
              if (!AdMarvelActivity.m(AdMarvelActivity.this))
                localAdMarvelInternalWebView.a(AdMarvelActivity.n(AdMarvelActivity.this));
              if ((AdMarvelActivity.o(AdMarvelActivity.this) == null) || (AdMarvelActivity.o(AdMarvelActivity.this).length() <= 0))
                break;
              AdMarvelActivity.this.a(AdMarvelActivity.o(AdMarvelActivity.this));
              return;
              localAdMarvelInternalWebView.loadUrl(AdMarvelActivity.k(AdMarvelActivity.this));
            }
          }
          localAdMarvelInternalWebView.setBackgroundColor(AdMarvelActivity.p(AdMarvelActivity.this));
          String str1 = "content://" + AdMarvelActivity.this.getPackageName() + ".AdMarvelLocalFileContentProvider";
          if (AdMarvelInterstitialAds.enableOfflineSDK)
          {
            localAdMarvelInternalWebView.loadDataWithBaseURL(AdMarvelActivity.g(AdMarvelActivity.this).getOfflineBaseUrl() + "/", AdMarvelActivity.l(AdMarvelActivity.this), "text/html", "utf-8", null);
            return;
          }
          if (ac.a() < 11)
          {
            localAdMarvelInternalWebView.loadDataWithBaseURL(str1, AdMarvelActivity.l(AdMarvelActivity.this), "text/html", "utf-8", null);
            return;
          }
          localAdMarvelInternalWebView.loadDataWithBaseURL("http://baseurl.admarvel.com", AdMarvelActivity.l(AdMarvelActivity.this), "text/html", "utf-8", null);
        }
      }
    }
  };
  WeakReference<AdMarvelActivity.g> a;
  public boolean c = false;
  public boolean d = false;
  public String e;
  public String f;
  private boolean g = false;
  private boolean h = false;
  private AdMarvelActivity.b i;
  private int j = 0;
  private Runnable k = new Runnable()
  {
    public void run()
    {
      try
      {
        AdMarvelActivity.a(AdMarvelActivity.this, false);
        if (AdMarvelActivity.this.a != null);
        for (AdMarvelActivity.g localg = (AdMarvelActivity.g)AdMarvelActivity.this.a.get(); ; localg = null)
        {
          if (localg != null)
            localg.setCancelable(true);
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log("Exception in disable Back press button " + localException.getMessage());
      }
    }
  };
  private Runnable l = new Runnable()
  {
    public void run()
    {
      AdMarvelActivity.b(AdMarvelActivity.this, false);
    }
  };
  private String m;
  private String n;
  private String o;
  private int p;
  private boolean q = false;
  private boolean r = false;
  private String s;
  private final Handler t = new Handler();
  private String u;
  private AdMarvelAd v;
  private AdMarvelActivity.aa w;
  private String x;
  private String y;
  private String z;

  public int a()
  {
    return this.j;
  }

  void a(String paramString)
  {
    Logging.log("DisableActivityOrientation");
    int i1;
    if (ac.a() < 9)
    {
      i1 = getResources().getConfiguration().orientation;
      if (paramString != null)
      {
        if (ac.a() >= 9)
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
        AdMarvelActivity.n localn = new AdMarvelActivity.n(this);
        localn.run();
        for (i1 = -2147483648; i1 == -2147483648; i1 = AdMarvelActivity.n.a(localn));
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
        this.t.post(new AdMarvelActivity.w(this, "Portrait"));
        return;
      }
      if (i1 == 1)
      {
        this.t.post(new AdMarvelActivity.w(this, "LandscapeLeft"));
        return;
      }
      this.t.post(new AdMarvelActivity.w(this, "none"));
      return;
    }
    this.t.post(new AdMarvelActivity.w(this, paramString));
  }

  public void b()
  {
    this.j = (1 + this.j);
  }

  boolean c()
  {
    return this.q;
  }

  boolean d()
  {
    return this.r;
  }

  boolean e()
  {
    return this.G;
  }

  String f()
  {
    return this.n;
  }

  void g()
  {
    this.K.sendEmptyMessage(0);
  }

  public void h()
  {
    this.t.postDelayed(new AdMarvelActivity.h(this.v, this), 1000L);
  }

  public void i()
  {
    this.t.postDelayed(new AdMarvelActivity.i(this.v, this), 3000L);
  }

  protected void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (AdMarvelUtils.getAdmarvelActivityOrientationInfo(this) != null)
      setRequestedOrientation(AdMarvelUtils.getAdmarvelActivityOrientationInfo(this).intValue());
    if (ac.a() >= 11)
      AdMarvelActivity.o.a(this);
    Bundle localBundle = getIntent().getExtras();
    byte[] arrayOfByte;
    if (localBundle != null)
    {
      this.m = localBundle.getString("url");
      this.n = localBundle.getString("source");
      this.o = localBundle.getString("html");
      this.s = localBundle.getString("xml");
      this.q = localBundle.getBoolean("isInterstitial", false);
      this.r = localBundle.getBoolean("isInterstitialClick", false);
      this.u = localBundle.getString("GUID");
      arrayOfByte = localBundle.getByteArray("serialized_admarvelad");
      if (arrayOfByte == null);
    }
    try
    {
      this.v = ((AdMarvelAd)new ObjectInputStream(new ByteArrayInputStream(arrayOfByte)).readObject());
      this.p = localBundle.getInt("backgroundcolor");
      this.F = localBundle.getString("expand_url");
      if ((this.F != null) && (this.F.length() > 0))
      {
        this.G = true;
        this.H = localBundle.getBoolean("closeBtnEnabled");
        this.I = localBundle.getBoolean("closeAreaEnabled");
        this.J = localBundle.getString("orientationState");
      }
      if ((AdMarvelUtils.isNotificationBarInFullScreenLaunchEnabled()) || ((!this.q) && ((Build.MODEL.contains("Kindle")) || (Build.PRODUCT.contains("Kindle")))))
      {
        getWindow().addFlags(256);
        getWindow().clearFlags(1024);
        this.i = new AdMarvelActivity.b(this);
        RelativeLayout localRelativeLayout = new RelativeLayout(this);
        localRelativeLayout.setId(b);
        localRelativeLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        localRelativeLayout.setBackgroundColor(-16777216);
        setContentView(localRelativeLayout);
        new com.admarvel.android.a.a(this).a();
        if (this.q == true)
          AdMarvelInterstitialAds.getListener().a(this);
        if (ac.a() < 11)
          break label480;
        this.t.post(new AdMarvelActivity.j(this, this.v));
        AdMarvelActivity.g localg = new AdMarvelActivity.g(this, this);
        localg.setTag("ADM_DIALOG");
        addContentView(localg, localg.getLayoutParams());
        this.a = new WeakReference(localg);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Logging.log(Log.getStackTraceString(localException));
        continue;
        getWindow().setFlags(512, 512);
        continue;
        label480: new AdMarvelActivity.a(this, this.v).execute(new Object[0]);
      }
    }
  }

  protected void onDestroy()
  {
    if (this.a != null);
    for (AdMarvelActivity.g localg = (AdMarvelActivity.g)this.a.get(); ; localg = null)
    {
      if (localg != null)
      {
        localg.b();
        AdMarvelActivity.g.a(localg);
        localg.c();
        this.a.clear();
      }
      n localn = n.a();
      if (localn.b())
        localn.c();
      AdMarvelActivity.d locald = new AdMarvelActivity.d(this);
      this.t.post(locald);
      RelativeLayout localRelativeLayout = (RelativeLayout)findViewById(b);
      if ((e()) && (AdMarvelInternalWebView.c(this.u) != null))
        AdMarvelInternalWebView.c(this.u).a();
      if (localRelativeLayout != null)
      {
        AdMarvelInternalWebView localAdMarvelInternalWebView2 = (AdMarvelInternalWebView)localRelativeLayout.findViewWithTag(this.u + "WEBVIEW");
        if ((localAdMarvelInternalWebView2 != null) && (localAdMarvelInternalWebView2.visibilityCallback != null) && (localAdMarvelInternalWebView2.visibilityCallback.length() > 0) && (localAdMarvelInternalWebView2.isViewDisplayed))
        {
          localAdMarvelInternalWebView2.injectJavaScript(localAdMarvelInternalWebView2.visibilityCallback + "(" + false + ")");
          localAdMarvelInternalWebView2.isViewDisplayed = false;
        }
      }
      if (localRelativeLayout != null)
      {
        AdMarvelInternalWebView localAdMarvelInternalWebView1 = (AdMarvelInternalWebView)localRelativeLayout.findViewWithTag(this.u + "WEBVIEW");
        if (localAdMarvelInternalWebView1 != null)
        {
          localRelativeLayout.removeView(localAdMarvelInternalWebView1);
          localAdMarvelInternalWebView1.loadUrl("");
          localAdMarvelInternalWebView1.a();
        }
      }
      if (this.q)
        AdMarvelInternalWebView.b(this.u);
      super.onDestroy();
      return;
    }
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
    if ((this.g) || (this.h))
      return false;
    g();
    if ((!c()) && (AdMarvelInternalWebView.d(this.u) != null))
      AdMarvelInternalWebView.d(this.u).a(this.u);
    return true;
  }

  protected void onPause()
  {
    RelativeLayout localRelativeLayout1 = (RelativeLayout)findViewById(b);
    if (this.a != null)
      this.a.get();
    AdMarvelInternalWebView localAdMarvelInternalWebView2;
    if (localRelativeLayout1 != null)
    {
      localAdMarvelInternalWebView2 = (AdMarvelInternalWebView)localRelativeLayout1.findViewWithTag(this.u + "WEBVIEW");
      if (localAdMarvelInternalWebView2 != null)
      {
        if (ac.a() < 11)
          break label205;
        ak.b(localAdMarvelInternalWebView2);
      }
    }
    while (true)
    {
      if ((!isFinishing()) && (this.f != null) && (this.f.length() > 0))
      {
        RelativeLayout localRelativeLayout2 = (RelativeLayout)findViewById(b);
        if (localRelativeLayout2 != null)
        {
          AdMarvelInternalWebView localAdMarvelInternalWebView1 = (AdMarvelInternalWebView)localRelativeLayout2.findViewWithTag(this.u + "WEBVIEW");
          if (localAdMarvelInternalWebView1 != null)
            localAdMarvelInternalWebView1.loadUrl("javascript:" + this.f + "()");
        }
      }
      try
      {
        c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).resume();
        label200: super.onPause();
        return;
        label205: al.b(localAdMarvelInternalWebView2);
      }
      catch (Exception localException)
      {
        break label200;
      }
    }
  }

  protected void onResume()
  {
    super.onResume();
    RelativeLayout localRelativeLayout = (RelativeLayout)findViewById(b);
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    if (localRelativeLayout != null)
    {
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)localRelativeLayout.findViewWithTag(this.u + "WEBVIEW");
      if (localAdMarvelInternalWebView != null)
      {
        if (ac.a() < 11)
          break label143;
        ak.a(localAdMarvelInternalWebView);
      }
    }
    while (true)
    {
      if ((localAdMarvelInternalWebView.visibilityCallback != null) && (localAdMarvelInternalWebView.visibilityCallback.length() > 0) && (!localAdMarvelInternalWebView.isViewDisplayed))
      {
        localAdMarvelInternalWebView.injectJavaScript(localAdMarvelInternalWebView.visibilityCallback + "(" + true + ")");
        localAdMarvelInternalWebView.isViewDisplayed = true;
      }
      try
      {
        c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).resume();
        return;
        label143: al.a(localAdMarvelInternalWebView);
      }
      catch (Exception localException)
      {
      }
    }
  }

  protected void onStart()
  {
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).start();
      label10: super.onStart();
      return;
    }
    catch (Exception localException)
    {
      break label10;
    }
  }

  protected void onStop()
  {
    if (ac.a() >= 7)
      this.t.post(new AdMarvelActivity.k(this, null));
    try
    {
      c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", this).stop();
      label35: super.onStop();
      return;
    }
    catch (Exception localException)
    {
      break label35;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity
 * JD-Core Version:    0.6.2
 */