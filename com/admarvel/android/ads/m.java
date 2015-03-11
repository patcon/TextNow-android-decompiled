package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.f;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor", "SimpleDateFormat", "DefaultLocale"})
public class m extends RelativeLayout
{
  private static String T = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0px;padding:0px;}</style>";
  private static String U = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0px;padding:0px;}</style><script type='text/javascript' src='http://admarvel.s3.amazonaws.com/js/admarvel_compete_v1.1.js'></script>";
  private static String V = "<html><head>%s</head><body><div align=\"center\">%s</div></body></html>";
  private static String W = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0;padding:0;} .bl span{display:table-cell;vertical-align:middle;height:38px;text-align:center;width:500px;} .bl {margin:2px;padding: 2px 15px;display:block;vertical-align:middle;text-align:center;line-height: 15px;font-size:12px;font-family: Helvetica;font-weight: bold;text-decoration: none;color:rgb(%d,%d,%d);text-shadow: #222222 0px 1px 2px; background-color:rgb(%d,%d,%d);background-image: url('http://admarvel.s3.amazonaws.com/btn_bg_trns.png');border: 2px rgb(%d, %d, %d) solid;-webkit-border-radius: 10px;}</style>";
  private static String aa = "<html><head>%s</head><body><div class=\"bl\"><a href=\"%s\" style=\"text-decoration: none; color: #000;\" ><span>%s</span></a></div>";
  private static String ab = "<meta name=\"viewport\" content=\"initial-scale=1.0,maximum-scale=1.0,target-densitydpi=device-dpi, width=device-width\" />";
  private static String ac = "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />";
  private static final Map<String, n> af = new ConcurrentHashMap();
  int A = -1;
  int B = -1;
  int C = -1;
  int D = -1;
  int E = -1;
  String F = null;
  String G = null;
  String H = null;
  String I = null;
  String J = null;
  String K = null;
  String L = null;
  String M = null;
  String N = null;
  m.ae O = null;
  boolean P = true;
  final boolean Q;
  final boolean R;
  final boolean S;
  public final AtomicBoolean a;
  private String ad;
  private String ae;
  private boolean ag;
  private boolean ah = false;
  private final String ai;
  private WeakReference<m.d> aj;
  private m.d ak;
  private d al;
  private WeakReference<d> am;
  private AdMarvelAd an = null;
  private boolean ao = false;
  final AtomicBoolean b;
  int c;
  final boolean d;
  final boolean e;
  boolean f = false;
  boolean g = false;
  boolean h = false;
  boolean i = false;
  String j = "top-right";
  m.w k;
  String l;
  String m;
  boolean n = false;
  String o = null;
  final AtomicBoolean p;
  final AtomicBoolean q;
  final AtomicBoolean r;
  final String s;
  int t = -1;
  int u = -2147483648;
  public int v = -2147483648;
  boolean w = false;
  boolean x = false;
  boolean y = false;
  String z = null;

  m(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, String paramString, AdMarvelAd paramAdMarvelAd, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5)
  {
    super(paramContext);
    this.Q = paramBoolean3;
    this.R = paramBoolean4;
    this.ai = paramString;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.s = UUID.randomUUID().toString();
    this.a = new AtomicBoolean(false);
    this.b = new AtomicBoolean(false);
    this.p = new AtomicBoolean(false);
    this.q = new AtomicBoolean(false);
    this.r = new AtomicBoolean(false);
    this.ak = new m.d(this);
    if ((paramContext instanceof Activity))
      this.t = ((Activity)paramContext).getRequestedOrientation();
    this.aj = new WeakReference(this.ak);
    this.an = paramAdMarvelAd;
    this.S = paramBoolean5;
  }

  public static n a(String paramString)
  {
    return (n)af.get(paramString);
  }

  public static void a(String paramString, n paramn)
  {
    try
    {
      af.put(paramString, paramn);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private static void b(LinearLayout paramLinearLayout, RelativeLayout.LayoutParams paramLayoutParams, String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7)
  {
    paramLayoutParams.rightMargin = 0;
    paramLayoutParams.leftMargin = 0;
    paramLayoutParams.topMargin = 0;
    paramLayoutParams.bottomMargin = 0;
    if (paramInt3 == -1)
      paramInt3 = paramInt5;
    if (paramInt4 == -1)
      paramInt4 = paramInt6;
    int i11;
    if ((paramString != null) && (paramString.length() > 0))
      if ("top-right".equals(paramString))
      {
        paramLayoutParams.addRule(10);
        paramLayoutParams.addRule(11);
        i11 = paramInt1 + paramInt3 - paramInt5;
        if ((paramInt1 == 0) && (i11 > 0))
        {
          paramLayoutParams.rightMargin = (i11 / 2);
          if (paramInt2 >= 0)
            break label140;
          paramLayoutParams.topMargin = Math.abs(paramInt2);
        }
      }
    while (true)
    {
      paramLinearLayout.setLayoutParams(paramLayoutParams);
      return;
      if (i11 > 0)
      {
        paramLayoutParams.rightMargin = i11;
        break;
      }
      paramLayoutParams.rightMargin = 0;
      break;
      label140: paramLayoutParams.topMargin = 0;
      continue;
      if ("top-left".equals(paramString))
      {
        paramLayoutParams.addRule(9);
        paramLayoutParams.addRule(10);
        if (paramInt1 < 0)
          paramLayoutParams.leftMargin = Math.abs(paramInt1);
        while (true)
        {
          if (paramInt2 >= 0)
            break label234;
          paramLayoutParams.topMargin = Math.abs(paramInt2);
          break;
          if (paramInt1 == 0)
          {
            int i10 = (paramInt3 - paramInt5) / 2;
            if (i10 > 0)
              paramLayoutParams.leftMargin = i10;
          }
          else
          {
            paramLayoutParams.leftMargin = 0;
          }
        }
        label234: paramLayoutParams.topMargin = 0;
      }
      else if ("bottom-right".equals(paramString))
      {
        paramLayoutParams.addRule(11);
        paramLayoutParams.addRule(12);
        int i8 = paramInt1 + paramInt3 - paramInt5;
        if ((paramInt1 == 0) && (i8 > 0))
          paramLayoutParams.rightMargin = (i8 / 2);
        while (true)
        {
          int i9 = paramInt6 - (paramInt2 + paramInt4);
          if (i9 >= 0)
            break label339;
          paramLayoutParams.bottomMargin = Math.abs(i9);
          break;
          if (i8 > 0)
            paramLayoutParams.rightMargin = i8;
          else
            paramLayoutParams.rightMargin = 0;
        }
        label339: paramLayoutParams.bottomMargin = 0;
      }
      else if ("bottom-left".equals(paramString))
      {
        paramLayoutParams.addRule(9);
        paramLayoutParams.addRule(12);
        if (paramInt1 < 0)
          paramLayoutParams.leftMargin = Math.abs(paramInt1);
        while (true)
        {
          int i6 = paramInt6 - (paramInt2 + paramInt4);
          if (i6 >= 0)
            break label443;
          paramLayoutParams.bottomMargin = Math.abs(i6);
          break;
          if (paramInt1 == 0)
          {
            int i7 = (paramInt3 - paramInt5) / 2;
            if (i7 > 0)
              paramLayoutParams.leftMargin = i7;
          }
          else
          {
            paramLayoutParams.leftMargin = 0;
          }
        }
        label443: paramLayoutParams.bottomMargin = 0;
      }
      else if ("center".equals(paramString))
      {
        if (paramInt1 + paramInt3 <= paramInt5)
          if (paramInt1 <= 0)
            paramLayoutParams.leftMargin = ((paramInt1 + paramInt3) / 2 + Math.abs(paramInt1) - paramInt7 / 2);
        while (true)
        {
          paramLayoutParams.addRule(15);
          if (paramInt2 >= 0)
            break label615;
          int i5 = paramInt2 + paramInt4 / 2;
          if (i5 >= 0)
            break label601;
          paramLayoutParams.topMargin = (Math.abs(i5) + paramInt4 / 2);
          paramLayoutParams.addRule(10);
          break;
          paramLayoutParams.leftMargin = (paramInt3 / 2 - paramInt7 / 2);
          continue;
          if (paramInt1 <= 0)
            paramLayoutParams.leftMargin = (paramInt5 / 2 + Math.abs(paramInt1) - paramInt7 / 2);
          else
            paramLayoutParams.leftMargin = ((paramInt5 - paramInt1) / 2 - paramInt7 / 2);
        }
        label601: paramLayoutParams.topMargin = 0;
        paramLayoutParams.addRule(15);
        continue;
        label615: int i4 = paramInt6 - (paramInt2 + paramInt4 / 2);
        if (i4 < 0)
        {
          paramLayoutParams.bottomMargin = (Math.abs(i4) + paramInt4 / 2);
          paramLayoutParams.addRule(12);
        }
        else
        {
          paramLayoutParams.bottomMargin = 0;
          paramLayoutParams.addRule(15);
        }
      }
      else if ("bottom-center".equals(paramString))
      {
        int i3 = paramInt6 - (paramInt2 + paramInt4);
        if (i3 < 0);
        for (paramLayoutParams.bottomMargin = Math.abs(i3); ; paramLayoutParams.bottomMargin = 0)
        {
          paramLayoutParams.addRule(9);
          paramLayoutParams.addRule(12);
          if (paramInt1 + paramInt3 > paramInt5)
            break label775;
          if (paramInt1 > 0)
            break label759;
          paramLayoutParams.leftMargin = ((paramInt1 + paramInt3) / 2 + Math.abs(paramInt1) - paramInt7 / 2);
          break;
        }
        label759: paramLayoutParams.leftMargin = (paramInt3 / 2 - paramInt7 / 2);
        continue;
        label775: if (paramInt1 <= 0)
          paramLayoutParams.leftMargin = (paramInt5 / 2 + Math.abs(paramInt1) - paramInt7 / 2);
        else
          paramLayoutParams.leftMargin = ((paramInt5 - paramInt1) / 2 - paramInt7 / 2);
      }
      else if ("top-center".equals(paramString))
      {
        paramLayoutParams.addRule(14);
        if (paramInt2 < 0)
          paramLayoutParams.topMargin = Math.abs(paramInt2);
        while (true)
          if (paramInt1 + paramInt3 <= paramInt5)
          {
            if (paramInt1 <= 0)
            {
              paramLayoutParams.leftMargin = ((paramInt1 + paramInt3) / 2 + Math.abs(paramInt1) - paramInt7 / 2);
              break;
              paramLayoutParams.topMargin = 0;
              continue;
            }
            paramLayoutParams.leftMargin = (paramInt3 / 2 - paramInt7 / 2);
            break;
          }
        if (paramInt1 <= 0)
          paramLayoutParams.leftMargin = (paramInt5 / 2 + Math.abs(paramInt1) - paramInt7 / 2);
        else
          paramLayoutParams.leftMargin = ((paramInt5 - paramInt1) / 2 - paramInt7 / 2);
      }
      else
      {
        paramLayoutParams.addRule(11);
        paramLayoutParams.addRule(10);
        int i2 = paramInt1 + paramInt3 - paramInt5;
        if (i2 > 0);
        for (paramLayoutParams.rightMargin = i2; ; paramLayoutParams.rightMargin = 0)
        {
          if (paramInt2 >= 0)
            break label1008;
          paramLayoutParams.topMargin = Math.abs(paramInt2);
          break;
        }
        label1008: paramLayoutParams.topMargin = 0;
        continue;
        paramLayoutParams.addRule(11);
        paramLayoutParams.addRule(10);
        int i1 = paramInt1 + paramInt3 - paramInt5;
        if (i1 > 0);
        for (paramLayoutParams.rightMargin = i1; ; paramLayoutParams.rightMargin = 0)
        {
          if (paramInt2 >= 0)
            break label1073;
          paramLayoutParams.topMargin = Math.abs(paramInt2);
          break;
        }
        label1073: paramLayoutParams.topMargin = 0;
      }
    }
  }

  public static void b(String paramString)
  {
    af.remove(paramString);
  }

  private void d(String paramString)
  {
    if ((this.b.compareAndSet(true, false)) && (a(this.s) != null))
      a(this.s).a(this, this.an, 308, r.a(308));
  }

  void a()
  {
    d locald = (d)findViewWithTag(this.s + "INTERNAL");
    if ((locald == null) && (this.x))
    {
      Context localContext = getContext();
      if ((localContext != null) && ((localContext instanceof Activity)))
        locald = (d)((ViewGroup)((Activity)localContext).getWindow().findViewById(16908290)).findViewWithTag(this.s + "INTERNAL");
    }
    if (locald == null)
      return;
    locald.f();
  }

  void a(int paramInt1, int paramInt2)
  {
    ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
    localLayoutParams.width = paramInt1;
    localLayoutParams.height = paramInt2;
    requestLayout();
  }

  void a(int paramInt1, int paramInt2, int paramInt3, final int paramInt4, AdMarvelView paramAdMarvelView)
  {
    if (this.an == null)
    {
      if (a(this.s) != null)
        a(this.s).a(this, this.an, 305, r.a(305));
      return;
    }
    if ((this.an != null) && (this.an.getSource() != null))
      this.ae = this.an.getSource();
    label777: label789: label1054: 
    while (true)
    {
      float f1;
      try
      {
        if ((!this.an.getAdType().equals(AdMarvelAd.AdType.IMAGE)) || (!this.an.hasImage()))
          break label1137;
        if ((this.an.getImageWidth() <= 0) || (this.an.getImageHeight() <= 0))
          break label1075;
        if (Version.getAndroidSDKVersion() < 7)
          break label789;
        if ((AdMarvelUtils.isTabletDevice(getContext())) && (!this.e))
          break label504;
        if (paramAdMarvelView.getAdContainerWidth() <= 0)
          break label423;
        f1 = paramAdMarvelView.getAdContainerWidth() / r.i(getContext());
        String str9 = "<a href=\"" + this.an.getClickURL() + "\"><img src=\"" + this.an.getImageURL() + "\" width=\"" + f1 + "\"\" /></a>";
        String str10 = V;
        Object[] arrayOfObject7 = new Object[2];
        arrayOfObject7[0] = (T + ac);
        arrayOfObject7[1] = str9;
        this.ad = String.format(str10, arrayOfObject7);
        this.al = new d(getContext(), false, this.ai, this.s, paramAdMarvelView, null, this.an);
        this.al.setTag(this.s + "INTERNAL");
        new Handler(Looper.getMainLooper()).post(new Runnable()
        {
          public void run()
          {
            m.a(m.this).setFocusable(true);
            m.a(m.this).setClickable(true);
            m.a(m.this).setBackgroundColor(paramInt4);
            m.a(m.this).setScrollContainer(false);
            m.a(m.this).setVerticalScrollBarEnabled(false);
            m.a(m.this).setHorizontalScrollBarEnabled(false);
            m.a(m.this).setLayoutParamsForBanner(m.this.S);
            if ((Version.getAndroidSDKVersion() >= 11) && (Version.getAndroidSDKVersion() < 21))
            {
              WeakReference localWeakReference4 = new WeakReference(new m.c(m.this));
              m.a(m.this).setWebViewClient((WebViewClient)localWeakReference4.get());
            }
            while (true)
            {
              m.a(m.this, new WeakReference(m.a(m.this)));
              m.this.addView((View)m.b(m.this).get());
              WeakReference localWeakReference2 = new WeakReference(new AdMarvelWebViewJSInterface((d)m.b(m.this).get(), m.c(m.this), m.this, m.this.getContext()));
              m.a(m.this).addJavascriptInterface(localWeakReference2.get(), "ADMARVEL");
              if (!AdMarvelView.a)
                break;
              m.a(m.this).loadDataWithBaseURL(m.c(m.this).getOfflineBaseUrl() + "/", m.d(m.this), "text/html", "utf-8", null);
              return;
              if (Version.getAndroidSDKVersion() < 11)
              {
                WeakReference localWeakReference1 = new WeakReference(new m.b(m.this));
                m.a(m.this).setWebViewClient((WebViewClient)localWeakReference1.get());
              }
              else
              {
                WeakReference localWeakReference3 = new WeakReference(new m.a(m.this));
                m.a(m.this).setWebViewClient((WebViewClient)localWeakReference3.get());
              }
            }
            if (Version.getAndroidSDKVersion() < 11)
            {
              String str = "content://" + m.this.getContext().getPackageName() + ".AdMarvelLocalFileContentProvider";
              m.a(m.this).loadDataWithBaseURL(str, m.d(m.this), "text/html", "utf-8", null);
              return;
            }
            m.a(m.this).loadDataWithBaseURL("http://baseurl.admarvel.com", m.d(m.this), "text/html", "utf-8", null);
          }
        });
        this.b.set(true);
        return;
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
      }
      if (a(this.s) == null)
        break;
      a(this.s).a(this, this.an, 305, r.a(305));
      return;
      label423: if (paramAdMarvelView.getWidth() > 0)
      {
        f1 = paramAdMarvelView.getWidth() / r.i(getContext());
      }
      else
      {
        if (r.g(getContext()) < r.h(getContext()));
        for (int i15 = r.g(getContext()); ; i15 = r.h(getContext()))
        {
          f1 = i15 / r.i(getContext());
          break;
        }
        label504: float f2 = this.an.getImageWidth();
        float f3 = this.an.getImageHeight();
        if (Version.getAndroidSDKVersion() >= 19)
          if (r.g(getContext()) >= r.h(getContext()))
            break label777;
        for (int i16 = r.g(getContext()); ; i16 = r.h(getContext()))
        {
          float f4 = i16 / r.i(getContext());
          Logging.log("Device Relative Screen Width :" + f4);
          if (f2 > f4)
          {
            float f5 = f4 / f2;
            Logging.log("Device Image Ad Scaling factpr :" + f5);
            f2 *= f5;
            f3 *= f5;
          }
          String str11 = "<a href=\"" + this.an.getClickURL() + "\"><img src=\"" + this.an.getImageURL() + "\" width=\"" + f2 + "\" height=\"" + f3 + "\" /></a>";
          String str12 = V;
          Object[] arrayOfObject8 = new Object[2];
          arrayOfObject8[0] = (T + ab);
          arrayOfObject8[1] = str11;
          this.ad = String.format(str12, arrayOfObject8);
          break;
        }
        int i10;
        label809: int i11;
        label829: int i12;
        if (r.d(getContext()) == 2)
        {
          i10 = r.h(getContext());
          if (r.d(getContext()) != 1)
            break label1042;
          i11 = r.h(getContext());
          if (!this.d)
            break label1054;
          i12 = (int)(this.an.getImageWidth() * r.a(getContext(), i10, this.an.getImageWidth()));
        }
        for (int i13 = (int)(this.an.getImageHeight() * r.a(getContext(), i10, this.an.getImageWidth())); ; i13 = this.an.getImageHeight())
        {
          int i14 = Math.min(i13, i11);
          String str7 = "<a href=\"" + this.an.getClickURL() + "\"><img src=\"" + this.an.getImageURL() + "\" width=\"" + i12 + "\" height=\"" + i14 + "\" /></a>";
          String str8 = V;
          Object[] arrayOfObject6 = new Object[2];
          arrayOfObject6[0] = (T + ab);
          arrayOfObject6[1] = str7;
          this.ad = String.format(str8, arrayOfObject6);
          break;
          i10 = r.g(getContext());
          break label809;
          i11 = r.g(getContext());
          break label829;
          i12 = this.an.getImageWidth();
        }
        label1075: String str6 = V;
        Object[] arrayOfObject5 = new Object[2];
        arrayOfObject5[0] = (T + ab);
        arrayOfObject5[1] = this.an.getXhtml();
        this.ad = String.format(str6, arrayOfObject5);
        continue;
        label1137: if ((this.an.getAdType().equals(AdMarvelAd.AdType.TEXT)) && (this.an.getText() != null) && (this.an.getText().length() > 0))
        {
          int i1 = 0xFF & paramInt1 >> 16;
          int i2 = 0xFF & paramInt1 >> 8;
          int i3 = paramInt1 & 0xFF;
          int i4 = 0xFF & paramInt3 >> 16;
          int i5 = 0xFF & paramInt3 >> 8;
          int i6 = paramInt3 & 0xFF;
          int i7 = 0xFF & paramInt2 >> 16;
          int i8 = 0xFF & paramInt2 >> 8;
          int i9 = paramInt2 & 0xFF;
          String str3 = W;
          Object[] arrayOfObject3 = new Object[9];
          arrayOfObject3[0] = Integer.valueOf(i1);
          arrayOfObject3[1] = Integer.valueOf(i2);
          arrayOfObject3[2] = Integer.valueOf(i3);
          arrayOfObject3[3] = Integer.valueOf(i4);
          arrayOfObject3[4] = Integer.valueOf(i5);
          arrayOfObject3[5] = Integer.valueOf(i6);
          arrayOfObject3[6] = Integer.valueOf(i7);
          arrayOfObject3[7] = Integer.valueOf(i8);
          arrayOfObject3[8] = Integer.valueOf(i9);
          String str4 = String.format(str3, arrayOfObject3);
          String str5 = aa;
          Object[] arrayOfObject4 = new Object[3];
          arrayOfObject4[0] = str4;
          arrayOfObject4[1] = this.an.getClickURL();
          arrayOfObject4[2] = this.an.getText();
          this.ad = String.format(str5, arrayOfObject4);
        }
        else if (this.an.getXhtml().contains("ORMMA_API"))
        {
          String str2 = V;
          Object[] arrayOfObject2 = new Object[2];
          arrayOfObject2[0] = U;
          arrayOfObject2[1] = this.an.getXHTML();
          this.ad = String.format(str2, arrayOfObject2);
        }
        else
        {
          String str1 = V;
          Object[] arrayOfObject1 = new Object[2];
          arrayOfObject1[0] = T;
          arrayOfObject1[1] = (this.an.getXHTML() + r.a);
          this.ad = String.format(str1, arrayOfObject1);
        }
      }
    }
  }

  void b()
  {
    d locald = (d)findViewWithTag(this.s + "INTERNAL");
    if ((locald == null) && (this.x))
    {
      Context localContext = getContext();
      if ((localContext != null) && ((localContext instanceof Activity)))
        locald = (d)((ViewGroup)((Activity)localContext).getWindow().findViewById(16908290)).findViewWithTag(this.s + "INTERNAL");
    }
    if (locald == null)
      return;
    locald.g();
    if ((locald instanceof d))
      locald.a(this);
    if (Version.getAndroidSDKVersion() >= 11)
    {
      aa.a(locald);
      return;
    }
    ab.a(locald);
  }

  public void c()
  {
  }

  void c(String paramString)
  {
    if (paramString != null);
    try
    {
      if (paramString.length() > 0)
        f.a().b().execute(new AdMarvelRedirectRunnable(paramString, getContext(), this.an, "banner", this.s, this.ag, AdMarvelView.a, this.R));
      return;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  void d()
  {
    d locald = (d)findViewWithTag(this.s + "INTERNAL");
    if ((locald == null) && (this.x))
    {
      Context localContext = getContext();
      if ((localContext != null) && ((localContext instanceof Activity)))
        locald = (d)((ViewGroup)((Activity)localContext).getWindow().findViewById(16908290)).findViewWithTag(this.s + "INTERNAL");
    }
    d.b(this.s);
    d.a(this.s);
    b(this.s);
    if (locald != null)
    {
      if (Version.getAndroidSDKVersion() >= 14)
      {
        m.g localg = new m.g(this);
        new Handler(Looper.getMainLooper()).post(localg);
      }
      if (Version.getAndroidSDKVersion() >= 15)
        locald.setWebChromeClient(null);
      locald.setWebViewClient(null);
      locald.a();
      if (this.am != null)
        this.am.clear();
      this.an = null;
      if (this.ak != null)
      {
        this.ak.b();
        this.ak = null;
        this.aj = null;
      }
    }
  }

  void e()
  {
    int i1 = 0;
    while (true)
    {
      try
      {
        if (this.k != null)
          this.k.disable();
        Context localContext = getContext();
        if ((localContext instanceof Activity))
        {
          localActivity = (Activity)localContext;
          if ((this.w) && (this.y) && (!this.n) && (localActivity != null))
          {
            localActivity.setRequestedOrientation(this.t);
            this.w = false;
          }
          if ((this.a.compareAndSet(true, false)) && (localActivity != null))
          {
            ViewGroup localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
            d locald = (d)localViewGroup.findViewWithTag(this.s + "INTERNAL");
            if (locald != null)
              locald.g = true;
            m.k localk = (m.k)localViewGroup.findViewWithTag(this.s + "EXPAND_BG");
            RelativeLayout localRelativeLayout = (RelativeLayout)localViewGroup.findViewWithTag(this.s + "EXPAND_LAYOUT");
            if (this.f)
            {
              LinearLayout localLinearLayout = (LinearLayout)localViewGroup.findViewWithTag(this.s + "BTN_CLOSE");
              if (localLinearLayout != null)
                localRelativeLayout.removeView(localLinearLayout);
              this.f = false;
            }
            if ((localk != null) && (locald != null))
            {
              FrameLayout localFrameLayout = (FrameLayout)findViewWithTag(this.s + "EXPAND_PLACE_HOLDER");
              int i2 = getChildCount();
              if ((i1 < i2) && (getChildAt(i1) != localFrameLayout))
              {
                i1++;
                continue;
              }
              localRelativeLayout.removeView(locald);
              localk.removeView(localRelativeLayout);
              localk.a();
              localViewGroup.removeView(localk);
              localViewGroup.invalidate();
              localViewGroup.requestLayout();
              removeAllViews();
              addView(locald, i1);
              removeView(localFrameLayout);
              locald.i();
              this.x = false;
              this.ah = false;
            }
            invalidate();
            requestLayout();
            if (a(this.s) != null)
              a(this.s).b();
            if (locald != null)
            {
              if (this.l != null)
                locald.loadUrl("javascript:" + this.l + "()");
              locald.g = false;
            }
          }
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      Activity localActivity = null;
    }
  }

  void f()
  {
    View localView = findViewWithTag(this.s + "INTERNAL");
    if ((localView != null) && ((localView instanceof d)) && (!localView.hasFocus()))
      localView.requestFocus();
  }

  public AdMarvelAd getAdMarvelAd()
  {
    return this.an;
  }

  public void setEnableClickRedirect(boolean paramBoolean)
  {
    this.ag = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m
 * JD-Core Version:    0.6.2
 */