package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.f;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class d extends WebView
  implements View.OnTouchListener
{
  private static final Map<String, i> W = new ConcurrentHashMap();
  static int a = 100002;
  private static final Map<String, b> aa = new ConcurrentHashMap();
  static String b = "admarvel_internal_webview_" + a;
  private d.n A = null;
  private ScheduledThreadPoolExecutor B;
  private boolean C = true;
  private boolean D = false;
  private boolean E = false;
  private boolean F = false;
  private int G;
  private int H;
  private int I = -1;
  private int J = -1;
  private final AtomicBoolean K;
  private final String L;
  private volatile boolean M;
  private volatile boolean N;
  private final WeakReference<Context> O;
  private final AdMarvelAd P;
  private boolean Q = false;
  private boolean R = true;
  private boolean S = true;
  private boolean T = true;
  private boolean U = true;
  private boolean V = false;
  public boolean c = false;
  final WeakReference<AdMarvelView> d;
  final WeakReference<RelativeLayout> e;
  public boolean f = false;
  public boolean g = false;
  public int h = 0;
  public int i = 0;
  public String j = null;
  public boolean k = false;
  public boolean l = false;
  public boolean m = false;
  public String n = null;
  public String o = null;
  public String p = null;
  public String q = null;
  public String r = null;
  final String s;
  public GestureDetector t = null;
  public String u = null;
  private final AtomicBoolean v;
  private final AtomicBoolean w;
  private final AtomicBoolean x;
  private final AtomicBoolean y;
  private final AtomicBoolean z;

  d(Context paramContext, boolean paramBoolean, String paramString1, String paramString2, AdMarvelView paramAdMarvelView, RelativeLayout paramRelativeLayout, AdMarvelAd paramAdMarvelAd)
  {
    super(paramContext);
    this.L = paramString1;
    this.v = new AtomicBoolean(false);
    this.K = new AtomicBoolean(true);
    this.M = false;
    this.N = false;
    this.s = paramString2;
    this.O = new WeakReference(paramContext);
    this.w = new AtomicBoolean(false);
    this.x = new AtomicBoolean(false);
    this.y = new AtomicBoolean(false);
    this.z = new AtomicBoolean(false);
    this.P = paramAdMarvelAd;
    AdMarvelActivity localAdMarvelActivity2;
    if ((paramContext != null) && ((paramContext instanceof Activity)))
    {
      Activity localActivity2 = (Activity)paramContext;
      if ((localActivity2 != null) && ((localActivity2 instanceof AdMarvelActivity)))
      {
        localAdMarvelActivity2 = (AdMarvelActivity)localActivity2;
        if (localAdMarvelActivity2 != null)
        {
          if (localAdMarvelActivity2.c())
            this.y.set(true);
        }
        else
        {
          this.d = new WeakReference(paramAdMarvelView);
          this.e = new WeakReference(paramRelativeLayout);
          if (this.d != null)
          {
            AdMarvelView localAdMarvelView = (AdMarvelView)this.d.get();
            if (localAdMarvelView != null)
              this.c = localAdMarvelView.c();
          }
          setOnTouchListener(this);
          this.t = new GestureDetector(paramContext, new p());
          if (Version.getAndroidSDKVersion() < 18)
            break label700;
          t.a(this, paramContext, this.w, this.c);
          label423: if (paramBoolean)
            setScrollBarStyle(0);
          if ((paramContext != null) && ((paramContext instanceof Activity)))
          {
            Activity localActivity1 = (Activity)paramContext;
            if ((localActivity1 != null) && ((localActivity1 instanceof AdMarvelActivity)))
            {
              AdMarvelActivity localAdMarvelActivity1 = (AdMarvelActivity)localActivity1;
              if ((localAdMarvelActivity1 != null) && ((localAdMarvelActivity1.c()) || (localAdMarvelActivity1.e())))
              {
                if (localAdMarvelActivity1.e())
                  this.F = true;
                ViewGroup localViewGroup = (ViewGroup)localActivity1.getWindow().findViewById(16908290);
                LinearLayout localLinearLayout = new LinearLayout(getContext());
                localLinearLayout.setBackgroundColor(0);
                localLinearLayout.setTag(this.s + "BTN_CLOSE");
                localLinearLayout.setVisibility(4);
                localLinearLayout.setGravity(53);
                localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                localLinearLayout.addView(new d.j(paramContext, this, null, localActivity1));
                localViewGroup.addView(localLinearLayout);
              }
            }
          }
          if (Version.getAndroidSDKVersion() < 7)
            break label824;
        }
      }
    }
    label824: for (int i1 = 1; ; i1 = 0)
    {
      if (i1 != 0)
        break label830;
      setWebChromeClient(new d.b(this, paramContext));
      return;
      if (localAdMarvelActivity2.e())
      {
        this.z.set(true);
        break;
      }
      this.w.set(true);
      break;
      this.x.set(true);
      break;
      this.x.set(true);
      break;
      label700: if (Version.getAndroidSDKVersion() >= 17)
      {
        x.a(this, paramContext, this.w, this.c);
        break label423;
      }
      if (Version.getAndroidSDKVersion() >= 16)
      {
        w.a(this, paramContext, this.w, this.c);
        break label423;
      }
      if (Version.getAndroidSDKVersion() >= 11)
      {
        v.a(this, paramContext, this.w, this.c);
        break label423;
      }
      if (Version.getAndroidSDKVersion() >= 8)
      {
        u.a(this, paramContext, this.w);
        break label423;
      }
      if (Version.getAndroidSDKVersion() >= 7)
      {
        z.a(this, paramContext, this.w);
        break label423;
      }
      y.a(this, paramContext, this.w);
      break label423;
    }
    label830: setWebChromeClient(new d.a(this, paramContext));
  }

  static void a(String paramString)
  {
    try
    {
      W.remove(paramString);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        localException.printStackTrace();
    }
    finally
    {
    }
  }

  public static void a(String paramString, b paramb)
  {
    try
    {
      aa.put(paramString, paramb);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public static void a(String paramString, i parami)
  {
    try
    {
      W.put(paramString, parami);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  static void b(String paramString)
  {
    try
    {
      aa.remove(paramString);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public static i c(String paramString)
  {
    return (i)W.get(paramString);
  }

  public static b d(String paramString)
  {
    return (b)aa.get(paramString);
  }

  public static void d()
  {
    aa.clear();
    W.clear();
  }

  private boolean f(String paramString)
  {
    Context localContext = (Context)this.O.get();
    AdMarvelActivity localAdMarvelActivity;
    if ((localContext != null) && ((localContext instanceof Activity)))
    {
      Activity localActivity = (Activity)localContext;
      if ((localActivity != null) && ((localActivity instanceof AdMarvelActivity)))
      {
        localAdMarvelActivity = (AdMarvelActivity)localActivity;
        if (localAdMarvelActivity != null)
        {
          if (r.a(getContext(), paramString, false))
          {
            new r(getContext()).c(this.L);
            if (!localAdMarvelActivity.c())
              localAdMarvelActivity.g();
            if ((localAdMarvelActivity.d()) && (this.P != null))
              AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
            while (true)
            {
              return true;
              if ((m.a(this.s) != null) && (this.P != null))
                m.a(this.s).a(this.P, paramString);
            }
          }
          if (localAdMarvelActivity.c())
            break label1116;
          if ((paramString != null) && (r.a(paramString, "admarvelsdk") != r.q.c))
          {
            if ((localAdMarvelActivity.d()) && (this.P != null))
              AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, r.a(paramString, "admarvelsdk", "", r.a(paramString, "admarvelsdk"), getContext()), this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
            while (true)
            {
              new r(getContext()).c(this.L);
              localAdMarvelActivity.g();
              return true;
              if ((m.a(this.s) != null) && (this.P != null))
                m.a(this.s).a(this.P, r.a(paramString, "admarvelsdk", "", r.a(paramString, "admarvelsdk"), getContext()));
            }
          }
          if ((paramString != null) && (r.a(paramString, "admarvelinternal") != r.q.c))
          {
            if ((localAdMarvelActivity.d()) && (this.P != null))
              AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, r.a(paramString, "admarvelinternal", "", r.a(paramString, "admarvelinternal"), getContext()), this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
            while (true)
            {
              new r(getContext()).c(this.L);
              localAdMarvelActivity.g();
              return true;
              if ((m.a(this.s) != null) && (this.P != null))
                m.a(this.s).a(this.P, r.a(paramString, "admarvelinternal", "", r.a(paramString, "admarvelinternal"), getContext()));
            }
          }
          if ((paramString != null) && (r.a(paramString, "admarvelvideo") != r.q.c))
          {
            if ((localAdMarvelActivity.d()) && (this.P != null))
              AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
            while (true)
            {
              str2 = r.a(paramString, "admarvelvideo", "http://", r.a(paramString, "admarvelvideo"), getContext());
              localIntent7 = new Intent("android.intent.action.VIEW");
              localIntent7.addFlags(268435456);
              localIntent7.setDataAndType(Uri.parse(str2), "video/*");
              getContext().startActivity(localIntent7);
              new r(getContext()).c(this.L);
              localAdMarvelActivity.g();
              return true;
              if ((m.a(this.s) != null) && (this.P != null))
                m.a(this.s).a(this.P, paramString);
            }
          }
          if ((paramString == null) || (r.a(paramString, "admarvelcustomvideo") == r.q.c))
            break label1007;
          if ((!localAdMarvelActivity.d()) || (this.P == null))
            break label960;
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
          localIntent6 = new Intent(getContext(), AdMarvelVideoActivity.class);
          localIntent6.addFlags(268435456);
          this.P.removeNonStringEntriesTargetParam();
        }
      }
    }
    label960: label1007: 
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
          localObjectOutputStream2.writeObject(this.P);
          localObjectOutputStream2.close();
          localIntent6.putExtra("serialized_admarvelad", localByteArrayOutputStream2.toByteArray());
          localIntent6.putExtra("url", paramString);
          localIntent6.putExtra("isCustomUrl", true);
          localIntent6.putExtra("xml", this.L);
          localIntent6.putExtra("GUID", this.s);
          getContext().startActivity(localIntent6);
          new r(getContext()).c(this.L);
          localAdMarvelActivity.g();
          return false;
          if ((m.a(this.s) == null) || (this.P == null))
            continue;
          m.a(this.s).a(this.P, paramString);
        }
        catch (IOException localIOException2)
        {
          localIOException2.printStackTrace();
          continue;
        }
        if ((paramString != null) && (r.a(paramString, "admarvelexternal") != r.q.c))
        {
          Intent localIntent5 = new Intent("android.intent.action.VIEW", Uri.parse(r.a(paramString, "admarvelexternal", "", r.a(paramString, "admarvelexternal"), getContext())));
          localIntent5.addFlags(268435456);
          if (r.a(getContext(), localIntent5))
            getContext().startActivity(localIntent5);
          new r(getContext()).c(this.L);
          localAdMarvelActivity.g();
        }
      }
    label1116: if (AdMarvelInterstitialAds.getEnableClickRedirect())
    {
      if ((paramString != null) && (r.a(paramString, "admarvelsdk") != r.q.c))
      {
        if (this.P != null)
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, r.a(paramString, "admarvelsdk", "", r.a(paramString, "admarvelsdk"), getContext()), this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
        new r(getContext()).c(this.L);
        return true;
      }
      if ((paramString != null) && (r.a(paramString, "admarvelinternal") != r.q.c))
      {
        if (this.P != null)
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, r.a(paramString, "admarvelinternal", "", r.a(paramString, "admarvelinternal"), getContext()), this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
        new r(getContext()).c(this.L);
        return true;
      }
      if ((paramString == null) || (r.a(paramString, "admarvelvideo") == r.q.c))
        break label1536;
      if (this.P != null)
        AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
      String str1 = r.a(paramString, "admarvelvideo", "http://", r.a(paramString, "admarvelvideo"), getContext());
      Intent localIntent4 = new Intent("android.intent.action.VIEW");
      localIntent4.addFlags(268435456);
      localIntent4.setDataAndType(Uri.parse(str1), "video/*");
      if (r.a(getContext(), localIntent4))
        getContext().startActivity(localIntent4);
      new r(getContext()).c(this.L);
    }
    while (true)
    {
      if (this.P != null)
        AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
      return true;
      label1536: if ((paramString != null) && (r.a(paramString, "admarvelcustomvideo") != r.q.c))
      {
        if ((localAdMarvelActivity.d()) && (this.P != null))
          AdMarvelInterstitialAds.getListener().a(localAdMarvelActivity, paramString, this.P.getSiteId(), this.P.getId(), this.P.getTargetParams(), this.P.getIpAddress());
        while (true)
        {
          Intent localIntent3 = new Intent(getContext(), AdMarvelVideoActivity.class);
          localIntent3.addFlags(268435456);
          localIntent3.putExtra("url", paramString);
          localIntent3.putExtra("isCustomUrl", true);
          localIntent3.putExtra("isInterstitial", false);
          localIntent3.putExtra("isInterstitialClick", true);
          localIntent3.putExtra("xml", this.L);
          localIntent3.putExtra("GUID", this.s);
          getContext().startActivity(localIntent3);
          new r(getContext()).c(this.L);
          break;
          if ((m.a(this.s) != null) && (this.P != null))
            m.a(this.s).a(this.P, paramString);
        }
      }
      if ((paramString != null) && (r.a(paramString, "admarvelexternal") != r.q.c))
      {
        Intent localIntent2 = new Intent("android.intent.action.VIEW", Uri.parse(r.a(paramString, "admarvelexternal", "", r.a(paramString, "admarvelexternal"), getContext())));
        localIntent2.addFlags(268435456);
        if (r.a(getContext(), localIntent2))
          getContext().startActivity(localIntent2);
        new r(getContext()).c(this.L);
        continue;
      }
      if ((this.K.get() != true) || (paramString == null) || (paramString.length() <= 0))
        continue;
      Intent localIntent1 = new Intent(getContext(), AdMarvelActivity.class);
      localIntent1.addFlags(268435456);
      localIntent1.putExtra("url", paramString);
      localIntent1.putExtra("isInterstitial", false);
      localIntent1.putExtra("isInterstitialClick", true);
      localIntent1.putExtra("xml", this.L);
      localIntent1.putExtra("GUID", this.s);
      try
      {
        if (this.P != null)
        {
          this.P.removeNonStringEntriesTargetParam();
          ByteArrayOutputStream localByteArrayOutputStream1 = new ByteArrayOutputStream();
          ObjectOutputStream localObjectOutputStream1 = new ObjectOutputStream(localByteArrayOutputStream1);
          localObjectOutputStream1.writeObject(this.P);
          localObjectOutputStream1.close();
          localIntent1.putExtra("serialized_admarvelad", localByteArrayOutputStream1.toByteArray());
        }
        if (localAdMarvelActivity.f() != null)
          localIntent1.putExtra("source", localAdMarvelActivity.f());
        getContext().startActivity(localIntent1);
        new r(getContext()).c(this.L);
      }
      catch (IOException localIOException1)
      {
        while (true)
          localIOException1.printStackTrace();
      }
    }
  }

  public void a()
  {
    this.U = true;
    e();
    WebSettings localWebSettings = getSettings();
    if (localWebSettings != null)
      localWebSettings.setJavaScriptEnabled(false);
    this.O.clear();
    this.d.clear();
    this.e.clear();
    h();
    this.t = null;
    this.t = null;
    Logging.log("AdMarveInternalWebView:cleanup");
  }

  void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.M)
      return;
    setLayoutParams(new RelativeLayout.LayoutParams(-1, paramInt4));
  }

  public void a(m paramm)
  {
    if (this.M);
    while (true)
    {
      return;
      h();
      if (this.j != null)
      {
        if (this.O != null);
        for (Context localContext = (Context)this.O.get(); localContext != null; localContext = null)
        {
          this.A = null;
          this.B = null;
          this.A = new d.n(this, localContext, paramm);
          this.B = new ScheduledThreadPoolExecutor(1);
          this.B.scheduleWithFixedDelay(this.A, 0L, 500L, TimeUnit.MILLISECONDS);
          return;
        }
      }
    }
  }

  public void a(boolean paramBoolean)
  {
    if (this.M);
    Context localContext;
    do
    {
      return;
      this.D = true;
      this.E = paramBoolean;
      localContext = (Context)this.O.get();
    }
    while (localContext == null);
    new Handler(Looper.getMainLooper()).post(new d.g(this, localContext, Boolean.valueOf(true)));
  }

  public boolean b()
  {
    return this.M;
  }

  public boolean c()
  {
    return this.V;
  }

  public void destroy()
  {
    e();
    this.U = true;
    super.destroy();
    Logging.log("AdMarveInternalWebView:destroy()");
  }

  public void e()
  {
    this.M = true;
  }

  public void e(String paramString)
  {
    new Handler(Looper.getMainLooper()).post(new d.k(this, this, paramString));
  }

  public void f()
  {
    this.N = true;
    f.a().b().execute(new d.m(this, this));
  }

  public void g()
  {
    this.N = false;
    if ((this.y.get()) || (this.z.get()))
      if ((this.j != null) && (!this.k))
      {
        e(this.j + "(" + true + ")");
        this.k = true;
        if (this.y.get())
          this.m = true;
      }
    while ((!this.x.get()) || (this.j == null))
      return;
    int[] arrayOfInt = { -1, -1 };
    getLocationInWindow(arrayOfInt);
    int i1;
    label145: int i2;
    if (getHeight() > 0)
    {
      i1 = getHeight() / 2;
      ViewParent localViewParent = getParent();
      if (!(localViewParent instanceof m))
        break label314;
      m localm = (m)localViewParent;
      if (localm == null)
        break label314;
      if ((localm.v == -2147483648) || (localm.v <= 0))
        break label308;
      i2 = localm.v;
    }
    while (true)
    {
      int i3 = i1 + (arrayOfInt[1] - i2);
      int i4 = 0;
      if (i3 >= 0)
      {
        int i5 = i1 + arrayOfInt[1];
        int i6 = r.h(getContext());
        i4 = 0;
        if (i5 < i6)
          i4 = 1;
      }
      if ((this.j == null) || (this.k) || (i4 == 0))
        break;
      e(this.j + "(" + true + ")");
      this.k = true;
      return;
      i1 = 0;
      break label145;
      label308: i2 = 0;
      continue;
      label314: i2 = 0;
    }
  }

  public String getBaseUrl()
  {
    return null;
  }

  public AtomicBoolean getEnableAutoDetect()
  {
    return this.K;
  }

  public void h()
  {
    if ((this.A != null) && (this.j != null) && (this.B != null))
    {
      this.B.remove(this.A);
      this.B.shutdown();
      this.B.purge();
      this.A = null;
    }
  }

  void i()
  {
    if (this.M)
      return;
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    localLayoutParams.width = this.H;
    localLayoutParams.height = this.G;
    setVisibility(0);
    ViewParent localViewParent = getParent();
    if ((localViewParent instanceof m))
      ((m)localViewParent).a(this.H, this.G);
    requestLayout();
  }

  void j()
  {
    if (this.M)
      return;
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(2, o.a);
    setLayoutParams(localLayoutParams);
  }

  void k()
  {
    Context localContext = (Context)this.O.get();
    if ((localContext != null) && ((this.P != null) || (this.w.get())))
    {
      if ((Version.getAndroidSDKVersion() >= 11) && (Version.getAndroidSDKVersion() < 21))
        setWebViewClient(new d.e(this, localContext, this.P));
    }
    else
      return;
    if (Version.getAndroidSDKVersion() < 11)
    {
      setWebViewClient(new d.d(this, localContext, this.P));
      return;
    }
    setWebViewClient(new d.c(this, localContext, this.P));
  }

  public void l()
  {
    if (this.D)
    {
      Context localContext = (Context)this.O.get();
      if (localContext != null)
        new Handler(Looper.getMainLooper()).post(new d.g(this, localContext, Boolean.valueOf(false)));
      this.D = false;
    }
  }

  protected void onDetachedFromWindow()
  {
    try
    {
      super.onDetachedFromWindow();
      return;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.M)
      return;
    ViewParent localViewParent = getParent();
    int i1 = getWidth();
    int i2 = getHeight();
    if (((localViewParent instanceof m)) && (!((m)localViewParent).a.get()))
    {
      this.G = getHeight();
      this.H = getWidth();
      if ((this.j != null) && (this.C))
      {
        this.C = false;
        a((m)localViewParent);
      }
    }
    while (true)
    {
      if ((this.I != -1) && (this.J != -1) && ((i1 != this.J) || (i2 != this.I)) && (i1 > 0) && (i2 > 0) && (this.J >= 0) && (this.I >= 0) && (this.n != null))
        e(this.n + "(" + i1 + "," + i2 + ")");
      this.J = i1;
      this.I = i2;
      return;
      if ((this.y.get()) || (this.z.get()))
        if (i2 == 0)
          this.m = false;
        else
          this.m = true;
    }
  }

  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    this.V = true;
    switch (paramMotionEvent.getAction())
    {
    default:
      if ((!this.w.get()) && (Version.getAndroidSDKVersion() > 10))
        break;
    case 0:
    case 1:
    }
    while (this.t == null)
    {
      return false;
      if (paramView.hasFocus())
        break;
      paramView.requestFocus();
      break;
    }
    return this.t.onTouchEvent(paramMotionEvent);
  }

  void setLayoutParamsForBanner(boolean paramBoolean)
  {
    if (this.M)
      return;
    if (paramBoolean);
    for (RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2); ; localLayoutParams = new RelativeLayout.LayoutParams(-1, 1))
    {
      setLayoutParams(localLayoutParams);
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d
 * JD-Core Version:    0.6.2
 */