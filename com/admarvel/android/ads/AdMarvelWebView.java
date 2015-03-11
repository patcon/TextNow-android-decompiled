package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
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
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

@SuppressLint({"ViewConstructor", "SimpleDateFormat", "DefaultLocale"})
public class AdMarvelWebView extends RelativeLayout
{
  private static String f = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0px;padding:0px;}</style>";
  private static String g = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0px;padding:0px;}</style><script type='text/javascript' src='http://admarvel.s3.amazonaws.com/js/admarvel_compete_v1.1.js'></script>";
  private static String h = "<html><head>%s</head><body><div align=\"center\">%s</div></body></html>";
  private static String i = "<style>* {-webkit-tap-highlight-color: rgba(0,0,0,0.0);} body {background-color:transparent;margin:0;padding:0;} .bl span{display:table-cell;vertical-align:middle;height:38px;text-align:center;width:500px;} .bl {margin:2px;padding: 2px 15px;display:block;vertical-align:middle;text-align:center;line-height: 15px;font-size:12px;font-family: Helvetica;font-weight: bold;text-decoration: none;color:rgb(%d,%d,%d);text-shadow: #222222 0px 1px 2px; background-color:rgb(%d,%d,%d);background-image: url('http://admarvel.s3.amazonaws.com/btn_bg_trns.png');border: 2px rgb(%d, %d, %d) solid;-webkit-border-radius: 10px;}</style>";
  private static String j = "<html><head>%s</head><body><div class=\"bl\"><a href=\"%s\" style=\"text-decoration: none; color: #000;\" ><span>%s</span></a></div>";
  private static String k = "<meta name=\"viewport\" content=\"initial-scale=1.0,maximum-scale=1.0,target-densitydpi=device-dpi, width=device-width\" />";
  private static String l = "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, maximum-scale=1.0\" />";
  private static final Map<String, s> o = new ConcurrentHashMap();
  private String A = null;
  private boolean B = false;
  private final AtomicBoolean C;
  private final AtomicBoolean D;
  private final AtomicBoolean E;
  private final File F;
  private final String G;
  private final Handler H;
  private WeakReference<AdMarvelWebView.d> I;
  private AdMarvelWebView.d J;
  private int K = -1;
  private int L = -2147483648;
  private int M = -2147483648;
  private boolean N = false;
  private boolean O = false;
  private boolean P = false;
  private AdMarvelInternalWebView Q;
  private WeakReference<AdMarvelInternalWebView> R;
  private AdMarvelAd S = null;
  private boolean T = false;
  private String U = null;
  private int V = -1;
  private int W = -1;
  private int Z = -1;
  public final AtomicBoolean a;
  private int aa = -1;
  private int ab = -1;
  private String ac = null;
  private String ad = null;
  private String ae = null;
  private String af = null;
  private String ag = null;
  private String ah = null;
  private String ai = null;
  private String aj = null;
  private String ak = null;
  private AdMarvelWebView.ak al = null;
  private boolean am = true;
  int b;
  String c;
  String d;
  final String e;
  private String m;
  private String n;
  private boolean p;
  private final AtomicBoolean q;
  private final boolean r;
  private final boolean s;
  private boolean t = false;
  private boolean u = false;
  private boolean v = false;
  private boolean w = false;
  private String x = "top-right";
  private AdMarvelWebView.y y;
  private boolean z = false;

  AdMarvelWebView(Context paramContext, boolean paramBoolean1, boolean paramBoolean2, File paramFile, String paramString, AdMarvelAd paramAdMarvelAd, Handler paramHandler)
  {
    super(paramContext);
    this.G = paramString;
    this.r = paramBoolean1;
    this.s = paramBoolean2;
    this.e = UUID.randomUUID().toString();
    this.H = paramHandler;
    this.a = new AtomicBoolean(false);
    this.q = new AtomicBoolean(false);
    this.C = new AtomicBoolean(false);
    this.D = new AtomicBoolean(false);
    this.E = new AtomicBoolean(false);
    this.F = paramFile;
    this.J = new AdMarvelWebView.d(this);
    if ((paramContext instanceof Activity))
      this.K = ((Activity)paramContext).getRequestedOrientation();
    this.I = new WeakReference(this.J);
    this.S = paramAdMarvelAd;
  }

  public static s a(String paramString)
  {
    return (s)o.get(paramString);
  }

  public static void a(String paramString, s params)
  {
    try
    {
      o.put(paramString, params);
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
    o.remove(paramString);
  }

  private void c(String paramString)
  {
    if ((this.q.compareAndSet(true, false)) && (a(this.e) != null))
      a(this.e).a(this, this.S, 308, ab.a(308));
  }

  private void d(String paramString)
  {
    if (paramString != null);
    try
    {
      if (paramString.length() > 0)
        this.H.post(new AdMarvelWebView.ac(paramString, this, this.S));
      return;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }

  void a()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)findViewWithTag(this.e + "INTERNAL");
    if ((localAdMarvelInternalWebView == null) && (this.O))
    {
      Context localContext = getContext();
      if ((localContext != null) && ((localContext instanceof Activity)))
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)((ViewGroup)((Activity)localContext).getWindow().findViewById(16908290)).findViewWithTag(this.e + "INTERNAL");
    }
    if (localAdMarvelInternalWebView == null)
      return;
    if ((localAdMarvelInternalWebView instanceof AdMarvelInternalWebView))
      localAdMarvelInternalWebView.e();
    if (ac.a() >= 11)
    {
      ak.b(localAdMarvelInternalWebView);
      return;
    }
    al.b(localAdMarvelInternalWebView);
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
    if (this.S == null)
    {
      if (a(this.e) != null)
        a(this.e).a(this, this.S, 305, ab.a(305));
      return;
    }
    if ((this.S != null) && (this.S.getSource() != null))
      this.n = this.S.getSource();
    while (true)
    {
      try
      {
        if ((!this.S.getAdType().equals(AdMarvelAd.AdType.IMAGE)) || (!this.S.hasImage()))
          break label1096;
        if ((this.S.getImageWidth() <= 0) || (this.S.getImageHeight() <= 0))
          break label1034;
        if (ac.a() < 7)
          break label748;
        if ((AdMarvelUtils.isTabletDevice(getContext())) && (!this.s))
          break label463;
        if (ab.g(getContext()) >= ab.h(getContext()))
          break label451;
        i15 = ab.g(getContext());
        float f1 = i15 / ab.i(getContext());
        String str9 = "<a href=\"" + this.S.getClickURL() + "\"><img src=\"" + this.S.getImageURL() + "\" width=\"" + f1 + "\"\" /></a>";
        String str10 = h;
        Object[] arrayOfObject7 = new Object[2];
        arrayOfObject7[0] = (f + l);
        arrayOfObject7[1] = str9;
        this.m = String.format(str10, arrayOfObject7);
        this.Q = new AdMarvelInternalWebView(getContext(), false, this.G, this.e, this.H, paramAdMarvelView, null, this.S);
        this.Q.setTag(this.e + "INTERNAL");
        this.H.post(new Runnable()
        {
          public void run()
          {
            AdMarvelWebView.a(AdMarvelWebView.this).setFocusable(true);
            AdMarvelWebView.a(AdMarvelWebView.this).setClickable(true);
            AdMarvelWebView.a(AdMarvelWebView.this).setBackgroundColor(paramInt4);
            AdMarvelWebView.a(AdMarvelWebView.this).setScrollContainer(false);
            AdMarvelWebView.a(AdMarvelWebView.this).setVerticalScrollBarEnabled(false);
            AdMarvelWebView.a(AdMarvelWebView.this).setHorizontalScrollBarEnabled(false);
            if (ac.a() < 11)
            {
              WeakReference localWeakReference1 = new WeakReference(new AdMarvelWebView.c(AdMarvelWebView.this));
              AdMarvelWebView.a(AdMarvelWebView.this).setWebViewClient((WebViewClient)localWeakReference1.get());
            }
            while (true)
            {
              AdMarvelWebView.a(AdMarvelWebView.this, new WeakReference(AdMarvelWebView.a(AdMarvelWebView.this)));
              AdMarvelWebView.this.addView((View)AdMarvelWebView.b(AdMarvelWebView.this).get());
              WeakReference localWeakReference2 = new WeakReference(new AdMarvelWebView.InnerJS((AdMarvelInternalWebView)AdMarvelWebView.b(AdMarvelWebView.this).get(), AdMarvelWebView.c(AdMarvelWebView.this), AdMarvelWebView.d(AdMarvelWebView.this), AdMarvelWebView.this, AdMarvelWebView.this.getContext()));
              AdMarvelWebView.a(AdMarvelWebView.this).addJavascriptInterface(localWeakReference2.get(), "ADMARVEL");
              if (!AdMarvelView.b)
                break;
              AdMarvelWebView.a(AdMarvelWebView.this).loadDataWithBaseURL(AdMarvelWebView.c(AdMarvelWebView.this).getOfflineBaseUrl() + "/", AdMarvelWebView.e(AdMarvelWebView.this), "text/html", "utf-8", null);
              return;
              WeakReference localWeakReference3 = new WeakReference(new AdMarvelWebView.b(AdMarvelWebView.this));
              AdMarvelWebView.a(AdMarvelWebView.this).setWebViewClient((WebViewClient)localWeakReference3.get());
            }
            if (ac.a() < 11)
            {
              String str = "content://" + AdMarvelWebView.this.getContext().getPackageName() + ".AdMarvelLocalFileContentProvider";
              AdMarvelWebView.a(AdMarvelWebView.this).loadDataWithBaseURL(str, AdMarvelWebView.e(AdMarvelWebView.this), "text/html", "utf-8", null);
              return;
            }
            AdMarvelWebView.a(AdMarvelWebView.this).loadDataWithBaseURL("http://baseurl.admarvel.com", AdMarvelWebView.e(AdMarvelWebView.this), "text/html", "utf-8", null);
          }
        });
        if (ac.a() < 11)
          break label1495;
        ak.a(this.Q);
        this.q.set(true);
        return;
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
      }
      if (a(this.e) == null)
        break;
      a(this.e).a(this, this.S, 305, ab.a(305));
      return;
      label451: int i15 = ab.h(getContext());
      continue;
      label463: float f2 = this.S.getImageWidth();
      float f3 = this.S.getImageHeight();
      if (ac.a() >= 19)
        if (ab.g(getContext()) >= ab.h(getContext()))
          break label736;
      label736: for (int i16 = ab.g(getContext()); ; i16 = ab.h(getContext()))
      {
        float f4 = i16 / ab.i(getContext());
        Logging.log("Device Relative Screen Width :" + f4);
        if (f2 > f4)
        {
          float f5 = f4 / f2;
          Logging.log("Device Image Ad Scaling factpr :" + f5);
          f2 *= f5;
          f3 *= f5;
        }
        String str11 = "<a href=\"" + this.S.getClickURL() + "\"><img src=\"" + this.S.getImageURL() + "\" width=\"" + f2 + "\" height=\"" + f3 + "\" /></a>";
        String str12 = h;
        Object[] arrayOfObject8 = new Object[2];
        arrayOfObject8[0] = (f + k);
        arrayOfObject8[1] = str11;
        this.m = String.format(str12, arrayOfObject8);
        break;
      }
      label748: int i10;
      label768: int i11;
      label788: int i12;
      if (ab.d(getContext()) == 2)
      {
        i10 = ab.h(getContext());
        if (ab.d(getContext()) != 1)
          break label1001;
        i11 = ab.h(getContext());
        if (!this.r)
          break label1013;
        i12 = (int)(this.S.getImageWidth() * ab.a(getContext(), i10, this.S.getImageWidth()));
      }
      for (int i13 = (int)(this.S.getImageHeight() * ab.a(getContext(), i10, this.S.getImageWidth())); ; i13 = this.S.getImageHeight())
      {
        int i14 = Math.min(i13, i11);
        String str7 = "<a href=\"" + this.S.getClickURL() + "\"><img src=\"" + this.S.getImageURL() + "\" width=\"" + i12 + "\" height=\"" + i14 + "\" /></a>";
        String str8 = h;
        Object[] arrayOfObject6 = new Object[2];
        arrayOfObject6[0] = (f + k);
        arrayOfObject6[1] = str7;
        this.m = String.format(str8, arrayOfObject6);
        break;
        i10 = ab.g(getContext());
        break label768;
        label1001: i11 = ab.g(getContext());
        break label788;
        label1013: i12 = this.S.getImageWidth();
      }
      label1034: String str6 = h;
      Object[] arrayOfObject5 = new Object[2];
      arrayOfObject5[0] = (f + k);
      arrayOfObject5[1] = this.S.getXhtml();
      this.m = String.format(str6, arrayOfObject5);
      continue;
      label1096: if ((this.S.getAdType().equals(AdMarvelAd.AdType.TEXT)) && (this.S.getText() != null) && (this.S.getText().length() > 0))
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
        String str3 = i;
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
        String str5 = j;
        Object[] arrayOfObject4 = new Object[3];
        arrayOfObject4[0] = str4;
        arrayOfObject4[1] = this.S.getClickURL();
        arrayOfObject4[2] = this.S.getText();
        this.m = String.format(str5, arrayOfObject4);
      }
      else if (this.S.getXhtml().contains("ORMMA_API"))
      {
        String str2 = h;
        Object[] arrayOfObject2 = new Object[2];
        arrayOfObject2[0] = g;
        arrayOfObject2[1] = this.S.getXHTML();
        this.m = String.format(str2, arrayOfObject2);
      }
      else
      {
        String str1 = h;
        Object[] arrayOfObject1 = new Object[2];
        arrayOfObject1[0] = f;
        arrayOfObject1[1] = (this.S.getXHTML() + ab.a);
        this.m = String.format(str1, arrayOfObject1);
        continue;
        label1495: al.a(this.Q);
      }
    }
  }

  void b()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)findViewWithTag(this.e + "INTERNAL");
    if ((localAdMarvelInternalWebView == null) && (this.O))
    {
      Context localContext = getContext();
      if ((localContext != null) && ((localContext instanceof Activity)))
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)((ViewGroup)((Activity)localContext).getWindow().findViewById(16908290)).findViewWithTag(this.e + "INTERNAL");
    }
    if (localAdMarvelInternalWebView == null)
      return;
    if ((localAdMarvelInternalWebView instanceof AdMarvelInternalWebView))
      localAdMarvelInternalWebView.a(this);
    if (ac.a() >= 11)
    {
      ak.a(localAdMarvelInternalWebView);
      return;
    }
    al.a(localAdMarvelInternalWebView);
  }

  void c()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)findViewWithTag(this.e + "INTERNAL");
    if ((localAdMarvelInternalWebView == null) && (this.O))
    {
      Context localContext = getContext();
      if ((localContext != null) && ((localContext instanceof Activity)))
        localAdMarvelInternalWebView = (AdMarvelInternalWebView)((ViewGroup)((Activity)localContext).getWindow().findViewById(16908290)).findViewWithTag(this.e + "INTERNAL");
    }
    AdMarvelInternalWebView.b(this.e);
    AdMarvelInternalWebView.a(this.e);
    b(this.e);
    if (localAdMarvelInternalWebView != null)
    {
      AdMarvelWebView.h localh = new AdMarvelWebView.h(this);
      this.H.post(localh);
      if (ac.a() >= 15)
        localAdMarvelInternalWebView.setWebChromeClient(null);
      localAdMarvelInternalWebView.setWebViewClient(null);
      localAdMarvelInternalWebView.a();
      if (this.R != null)
        this.R.clear();
      this.S = null;
      if (this.J != null)
      {
        this.J.b();
        this.J = null;
        this.I = null;
      }
    }
  }

  void d()
  {
    int i1 = 0;
    while (true)
    {
      try
      {
        if (this.y != null)
          this.y.disable();
        Context localContext = getContext();
        if ((localContext instanceof Activity))
        {
          localActivity = (Activity)localContext;
          if ((this.N) && (this.P) && (!this.z) && (localActivity != null))
          {
            localActivity.setRequestedOrientation(this.K);
            this.N = false;
          }
          if ((this.a.compareAndSet(true, false)) && (localActivity != null))
          {
            ViewGroup localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
            AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)localViewGroup.findViewWithTag(this.e + "INTERNAL");
            if (localAdMarvelInternalWebView != null)
              localAdMarvelInternalWebView.isAdClosing = true;
            FrameLayout localFrameLayout1 = (FrameLayout)localViewGroup.findViewWithTag(this.e + "EXPAND_BG");
            RelativeLayout localRelativeLayout = (RelativeLayout)localViewGroup.findViewWithTag(this.e + "EXPAND_LAYOUT");
            if (this.t)
            {
              LinearLayout localLinearLayout = (LinearLayout)localViewGroup.findViewWithTag(this.e + "BTN_CLOSE");
              if (localLinearLayout != null)
                localRelativeLayout.removeView(localLinearLayout);
              this.t = false;
            }
            if ((localFrameLayout1 != null) && (localAdMarvelInternalWebView != null))
            {
              FrameLayout localFrameLayout2 = (FrameLayout)findViewWithTag(this.e + "EXPAND_PLACE_HOLDER");
              int i2 = getChildCount();
              if ((i1 < i2) && (getChildAt(i1) != localFrameLayout2))
              {
                i1++;
                continue;
              }
              localRelativeLayout.removeView(localAdMarvelInternalWebView);
              localFrameLayout1.removeView(localRelativeLayout);
              localViewGroup.removeView(localFrameLayout1);
              localViewGroup.invalidate();
              localViewGroup.requestLayout();
              removeAllViews();
              addView(localAdMarvelInternalWebView, i1);
              removeView(localFrameLayout2);
              localAdMarvelInternalWebView.f();
              this.O = false;
              this.B = false;
            }
            invalidate();
            requestLayout();
            if (a(this.e) != null)
              a(this.e).b();
            if (localAdMarvelInternalWebView != null)
            {
              if (this.c != null)
                localAdMarvelInternalWebView.loadUrl("javascript:" + this.c + "()");
              localAdMarvelInternalWebView.isAdClosing = false;
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

  void e()
  {
    View localView = findViewWithTag(this.e + "INTERNAL");
    if ((localView != null) && ((localView instanceof AdMarvelInternalWebView)) && (!localView.hasFocus()))
      localView.requestFocus();
  }

  public AdMarvelAd getAdMarvelAd()
  {
    return this.S;
  }

  public void setEnableClickRedirect(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView
 * JD-Core Version:    0.6.2
 */