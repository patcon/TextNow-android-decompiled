package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.a.b;
import com.admarvel.android.util.f;
import com.admarvel.android.util.n;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicLong;

public class AdMarvelView extends LinearLayout
{
  public static boolean a;
  protected static boolean c = true;
  private static boolean n = true;
  private static WeakReference<Activity> u;
  final String b = UUID.randomUUID().toString();
  private int d;
  private int e;
  private int f;
  private int g;
  private final l h = new l();
  private boolean i = false;
  private boolean j;
  private final AtomicLong k;
  private boolean l = true;
  private int m = -1;
  private boolean o = false;
  private final AdMarvelView.h p;
  private final AdMarvelView.i q;
  private boolean r = true;
  private boolean s = false;
  private boolean t = false;
  private AdMarvelAd v;
  private boolean w = false;
  private boolean x = false;

  public AdMarvelView(Context paramContext)
  {
    this(paramContext, null);
  }

  public AdMarvelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AdMarvelAdapterInstances.buildAdMarvelAdapterInstances(this.b);
    Logging.log(Version.getVersionDump());
    setFocusable(true);
    setDescendantFocusability(262144);
    setClickable(true);
    String str = "http://schemas.android.com/apk/res/" + paramContext.getPackageName();
    if (paramAttributeSet != null)
      if (paramAttributeSet.getAttributeValue(str, "backgroundColor") != null)
        if (!"0".equals(paramAttributeSet.getAttributeValue(str, "backgroundColor")))
          break label379;
    label379: for (this.d = 0; ; this.d = Integer.parseInt(paramAttributeSet.getAttributeValue(str, "backgroundColor").replace("#", ""), 16))
    {
      if (paramAttributeSet.getAttributeValue(str, "textBackgroundColor") != null)
        this.e = Integer.parseInt(paramAttributeSet.getAttributeValue(str, "textBackgroundColor").replace("#", ""), 16);
      if (paramAttributeSet.getAttributeValue(str, "textFontColor") != null)
        this.f = Integer.parseInt(paramAttributeSet.getAttributeValue(str, "textFontColor").replace("#", ""), 16);
      if (paramAttributeSet.getAttributeValue(str, "textBorderColor") != null)
        this.g = Integer.parseInt(paramAttributeSet.getAttributeValue(str, "textBorderColor").replace("#", ""), 16);
      if (paramAttributeSet.getAttributeValue(str, "disableAnimation") != null)
        this.j = Boolean.parseBoolean(paramAttributeSet.getAttributeValue(str, "disableAnimation"));
      if (paramAttributeSet.getAttributeValue(str, "enableClickRedirect") != null)
        this.l = Boolean.parseBoolean(paramAttributeSet.getAttributeValue(str, "enableClickRedirect"));
      setAdMarvelBackgroundColor(this.d);
      this.k = new AtomicLong(0L);
      this.p = new AdMarvelView.h(this);
      this.q = new AdMarvelView.i(this);
      return;
    }
  }

  private void a(View paramView)
  {
    if ((paramView != null) && ((paramView instanceof m)))
    {
      m localm = (m)paramView;
      localm.e();
      localm.d();
    }
  }

  private void a(final View paramView, final AdMarvelAd paramAdMarvelAd)
  {
    if (this.j)
      return;
    setVisibility(8);
    setVisibility(0);
    n localn = new n(0.0F, -90.0F, getWidth() / 2.0F, getHeight() / 2.0F, -0.3F * getWidth(), true);
    localn.setDuration(700L);
    localn.setFillAfter(true);
    localn.setInterpolator(new AccelerateInterpolator());
    localn.setAnimationListener(new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        AdMarvelView.this.post(new AdMarvelView.k(paramView, AdMarvelView.this, paramAdMarvelAd));
      }

      public void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    startAnimation(localn);
  }

  public static boolean a()
  {
    return n;
  }

  private void b(View paramView)
  {
    boolean bool = paramView instanceof FrameLayout;
    View localView = null;
    if (bool)
      localView = ((FrameLayout)paramView).getChildAt(0);
    try
    {
      AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").cleanupView(localView);
      try
      {
        label34: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").cleanupView(localView);
        try
        {
          label48: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").cleanupView(localView);
          try
          {
            label62: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").cleanupView(localView);
            try
            {
              label76: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").cleanupView(localView);
              try
              {
                label90: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").cleanupView(localView);
                try
                {
                  label104: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").cleanupView(localView);
                  try
                  {
                    label118: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").cleanupView(localView);
                    try
                    {
                      label132: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").cleanupView(localView);
                      return;
                    }
                    catch (Exception localException9)
                    {
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label132;
                  }
                }
                catch (Exception localException7)
                {
                  break label118;
                }
              }
              catch (Exception localException6)
              {
                break label104;
              }
            }
            catch (Exception localException5)
            {
              break label90;
            }
          }
          catch (Exception localException4)
          {
            break label76;
          }
        }
        catch (Exception localException3)
        {
          break label62;
        }
      }
      catch (Exception localException2)
      {
        break label48;
      }
    }
    catch (Exception localException1)
    {
      break label34;
    }
  }

  public static void disableNetworkActivity()
  {
    try
    {
      b.a();
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void e()
  {
    if (this.j)
      return;
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(233L);
    localAlphaAnimation.startNow();
    localAlphaAnimation.setFillAfter(true);
    localAlphaAnimation.setInterpolator(new AccelerateInterpolator());
    startAnimation(localAlphaAnimation);
  }

  public static void enableNetworkActivity(Activity paramActivity, String paramString)
  {
    try
    {
      b.b(paramActivity, paramString);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void h(AdMarvelView paramAdMarvelView)
  {
    View localView1 = paramAdMarvelView.findViewWithTag("CURRENT");
    if (localView1 == null)
      return;
    if ((localView1 instanceof FrameLayout));
    for (View localView2 = ((FrameLayout)localView1).getChildAt(0); ; localView2 = null)
    {
      Logging.log("destroyAdapterView");
      try
      {
        AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").destroy(localView2);
        try
        {
          label49: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").destroy(localView2);
          try
          {
            label63: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").destroy(localView2);
            try
            {
              label77: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").destroy(localView2);
              try
              {
                label91: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").destroy(localView2);
                try
                {
                  label105: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").destroy(localView2);
                  try
                  {
                    label119: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").destroy(localView2);
                    try
                    {
                      label133: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").destroy(localView2);
                      try
                      {
                        label147: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").destroy(localView2);
                        return;
                      }
                      catch (Exception localException9)
                      {
                        return;
                      }
                    }
                    catch (Exception localException8)
                    {
                      break label147;
                    }
                  }
                  catch (Exception localException7)
                  {
                    break label133;
                  }
                }
                catch (Exception localException6)
                {
                  break label119;
                }
              }
              catch (Exception localException5)
              {
                break label105;
              }
            }
            catch (Exception localException4)
            {
              break label91;
            }
          }
          catch (Exception localException3)
          {
            break label77;
          }
        }
        catch (Exception localException2)
        {
          break label63;
        }
      }
      catch (Exception localException1)
      {
        break label49;
      }
    }
  }

  public static void initializeOfflineSDK(Activity paramActivity, String paramString)
  {
    a = true;
    b.a(paramActivity, paramString);
  }

  public static void setEnableHardwareAcceleration(boolean paramBoolean)
  {
    Logging.log("AdMarvelView - setEnableHardwareAcceleration :" + paramBoolean);
    n = paramBoolean;
  }

  protected void a(AdMarvelAd paramAdMarvelAd)
  {
    float f1;
    boolean bool;
    if (paramAdMarvelAd != null)
    {
      this.v = paramAdMarvelAd;
      if (getAdContainerWidth() > 0)
      {
        f1 = getAdContainerWidth() / r.i(getContext());
        paramAdMarvelAd.setAdMarvelViewWidth(f1);
      }
    }
    else
    {
      View localView1 = findViewWithTag("CURRENT");
      bool = false;
      if (localView1 != null)
      {
        bool = true;
        if ((localView1 instanceof m))
          ((m)localView1).e();
      }
      if ((u == null) || (u.get() == null))
        break label311;
    }
    label311: for (m localm = new m((Context)u.get(), this.r, this.s, paramAdMarvelAd.getXml(), paramAdMarvelAd, this.w, this.x, bool); ; localm = new m(getContext(), this.r, this.s, paramAdMarvelAd.getXml(), paramAdMarvelAd, this.w, this.x, bool))
    {
      localm.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
      localm.setBackgroundColor(this.d);
      localm.setEnableClickRedirect(this.l);
      m.a(localm.s, this.q);
      localm.setTag("PENDING");
      if (bool)
        localm.setVisibility(8);
      localm.a(getTextFontColor(), getTextBorderColor(), getTextBackgroundColor(), getAdMarvelBackgroundColor(), this);
      while (true)
      {
        View localView2 = findViewWithTag("PENDING");
        if (localView2 == null)
          break;
        removeView(localView2);
      }
      if (getWidth() > 0)
      {
        f1 = getWidth() / r.i(getContext());
        break;
      }
      if (r.g(getContext()) < r.h(getContext()));
      for (int i1 = r.g(getContext()); ; i1 = r.h(getContext()))
      {
        f1 = i1 / r.i(getContext());
        break;
      }
    }
    addView(localm);
  }

  protected void a(String paramString, AdMarvelAd paramAdMarvelAd, Context paramContext)
  {
    if (paramContext != null);
    try
    {
      String str2 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      int i1 = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      String str3;
      if (str2 != null)
        str3 = "duration" + str2 + i1 + AdMarvelUtils.getSDKVersion();
      String str4;
      for (localObject = str3; ; localObject = str4)
      {
        if (localObject != null)
        {
          SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(r.d("admarvel"), 0).edit();
          String str1 = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + 1000 * Integer.parseInt(paramString)));
          localEditor.putString(r.d((String)localObject), str1);
          localEditor.commit();
          Logging.log("requestNewAd: AD REQUEST BLOCKED, IGNORING REQUEST");
          this.h.a(getContext(), this, 304, r.a(304), paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        }
        return;
        str4 = "duration" + i1 + AdMarvelUtils.getSDKVersion();
      }
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      while (true)
      {
        Logging.log(Log.getStackTraceString(localNameNotFoundException));
        Object localObject = null;
      }
    }
  }

  protected void a(Map<String, Object> paramMap, AdMarvelAd paramAdMarvelAd, String paramString, Context paramContext)
  {
    if (paramAdMarvelAd != null);
    while (true)
    {
      float f1;
      AdMarvelAdapter localAdMarvelAdapter;
      View localView1;
      try
      {
        this.v = paramAdMarvelAd;
        if (getAdContainerWidth() > 0)
        {
          f1 = getAdContainerWidth() / r.i(getContext());
          paramAdMarvelAd.setAdMarvelViewWidth(f1);
          localAdMarvelAdapter = AdMarvelAdapterInstances.getInstance(this.b, paramString);
          if ((u == null) || (u.get() == null))
            break label245;
          localView1 = localAdMarvelAdapter.requestNewAd(this.p, (Context)u.get(), paramAdMarvelAd, paramMap, this.d, this.f);
          break label505;
          View localView2 = findViewWithTag("PENDING");
          if (localView2 == null)
            break label271;
          removeView(localView2);
          continue;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        this.h.a(getContext(), this, 304, r.a(304), paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        return;
      }
      if (getWidth() > 0)
      {
        f1 = getWidth() / r.i(getContext());
      }
      else
      {
        if (r.g(getContext()) < r.h(getContext()));
        for (int i1 = r.g(getContext()); ; i1 = r.h(getContext()))
        {
          f1 = i1 / r.i(getContext());
          break;
        }
        label245: localView1 = localAdMarvelAdapter.requestNewAd(this.p, paramContext, paramAdMarvelAd, paramMap, this.d, this.f);
        break label505;
        label271: ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
        if (localLayoutParams.width < 0)
        {
          localLayoutParams.width = -1;
          setLayoutParams(localLayoutParams);
        }
        setGravity(1);
        FrameLayout localFrameLayout = new FrameLayout(paramContext);
        localFrameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 1));
        if ((localView1.getLayoutParams() instanceof LinearLayout.LayoutParams))
        {
          LinearLayout.LayoutParams localLayoutParams3 = (LinearLayout.LayoutParams)localView1.getLayoutParams();
          localLayoutParams3.gravity = 1;
          localFrameLayout.addView(localView1, localLayoutParams3);
          localFrameLayout.setTag("PENDING");
          if (!paramAdMarvelAd.isMustBeVisible())
            break label495;
          localFrameLayout.setVisibility(0);
        }
        while (true)
        {
          addView(localFrameLayout);
          return;
          if ((localView1.getLayoutParams() instanceof FrameLayout.LayoutParams))
          {
            FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)localView1.getLayoutParams();
            localLayoutParams2.gravity = 1;
            localFrameLayout.addView(localView1, localLayoutParams2);
            break;
          }
          if ((localView1.getLayoutParams() instanceof RelativeLayout.LayoutParams))
          {
            RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localView1.getLayoutParams();
            localLayoutParams1.addRule(13);
            localFrameLayout.addView(localView1, localLayoutParams1);
            break;
          }
          localFrameLayout.addView(localView1, new FrameLayout.LayoutParams(-2, -2, 1));
          break;
          label495: localFrameLayout.setVisibility(8);
        }
        label505: if (localView1 == null);
      }
    }
  }

  public void adMarvelViewDisplayed()
  {
    f.a().b().execute(new AdMarvelView.f(this));
  }

  public boolean b()
  {
    return this.w;
  }

  public boolean c()
  {
    return this.o;
  }

  public void destroy()
  {
    Logging.log("AdMarvelView - Destroy");
    new Handler(Looper.getMainLooper()).post(new AdMarvelView.c(this));
  }

  public void displayAd(Context paramContext, AdMarvelAd paramAdMarvelAd)
  {
    this.v = paramAdMarvelAd;
    if ((paramAdMarvelAd == null) || (paramContext == null));
    String str;
    do
    {
      return;
      try
      {
        if (paramAdMarvelAd.getAdType() != AdMarvelAd.AdType.SDKCALL)
          break;
        if (paramAdMarvelAd.getSdkNetwork() != null)
        {
          a(paramAdMarvelAd.getTargetParams(), paramAdMarvelAd, paramAdMarvelAd.getSdkNetwork(), paramContext);
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        AdMarvelUtils.ErrorReason localErrorReason = r.a(303);
        int i1 = r.a(localErrorReason);
        getListenerImpl().a(paramContext, this, i1, localErrorReason, paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        return;
      }
      if (!paramAdMarvelAd.isDisableAdrequest())
        break;
      str = paramAdMarvelAd.getDisableAdDuration();
    }
    while (str == null);
    a(str, paramAdMarvelAd, paramContext);
    return;
    a(paramAdMarvelAd);
  }

  public void enableAdFetchedModel(boolean paramBoolean)
  {
    this.w = paramBoolean;
  }

  public void fetchNewAd(Map<String, Object> paramMap, String paramString1, String paramString2)
  {
    enableAdFetchedModel(true);
    requestNewAd(paramMap, paramString1, paramString2);
  }

  public void fetchNewAd(Map<String, Object> paramMap, String paramString1, String paramString2, Activity paramActivity)
  {
    enableAdFetchedModel(true);
    requestNewAd(paramMap, paramString1, paramString2, paramActivity);
  }

  public void focus()
  {
    Logging.log("AdMarvelView - focus");
    new Handler(Looper.getMainLooper()).post(new AdMarvelView.g(this));
  }

  public int getAdContainerWidth()
  {
    return this.m;
  }

  public int getAdMarvelBackgroundColor()
  {
    return this.d;
  }

  l getListenerImpl()
  {
    return this.h;
  }

  public int getTextBackgroundColor()
  {
    return this.e;
  }

  public int getTextBorderColor()
  {
    return this.g;
  }

  public int getTextFontColor()
  {
    return this.f;
  }

  public void notifyAddedToListView()
  {
    Logging.log("AdMarvelView - notifyAddedToListView ");
    View localView1 = findViewWithTag("CURRENT");
    if ((localView1 instanceof m))
      ((m)localView1).c();
    View localView2;
    if ((localView1 instanceof FrameLayout))
      localView2 = ((FrameLayout)localView1).getChildAt(0);
    try
    {
      AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").notifyAddedToListView(localView2);
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void pause(Activity paramActivity)
  {
    Logging.log("AdMarvelView - Pause");
    View localView1 = findViewWithTag("CURRENT");
    if ((localView1 instanceof m))
      ((m)localView1).a();
    boolean bool = localView1 instanceof FrameLayout;
    View localView2 = null;
    if (bool)
      localView2 = ((FrameLayout)localView1).getChildAt(0);
    try
    {
      AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").pause(paramActivity, localView2);
      try
      {
        label66: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").pause(paramActivity, localView2);
        try
        {
          label82: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").pause(paramActivity, localView2);
          try
          {
            label97: AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).pause();
            return;
          }
          catch (Exception localException2)
          {
          }
        }
        catch (Exception localException1)
        {
          break label97;
        }
      }
      catch (Exception localException4)
      {
        break label82;
      }
    }
    catch (Exception localException3)
    {
      break label66;
    }
  }

  // ERROR //
  public void requestNewAd(Map<String, Object> paramMap, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_1
    //   4: ifnull +13 -> 17
    //   7: new 714	java/util/HashMap
    //   10: dup
    //   11: aload_1
    //   12: invokespecial 717	java/util/HashMap:<init>	(Ljava/util/Map;)V
    //   15: astore 4
    //   17: aload_0
    //   18: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   21: ldc_w 477
    //   24: invokestatic 480	com/admarvel/android/ads/r:d	(Ljava/lang/String;)Ljava/lang/String;
    //   27: iconst_0
    //   28: invokevirtual 484	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   31: astore 6
    //   33: aload_0
    //   34: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   37: invokevirtual 451	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   40: aload_0
    //   41: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   44: invokevirtual 128	android/content/Context:getPackageName	()Ljava/lang/String;
    //   47: iconst_0
    //   48: invokevirtual 457	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   51: getfield 462	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   54: astore 7
    //   56: aload_0
    //   57: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   60: invokevirtual 451	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   63: aload_0
    //   64: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   67: invokevirtual 128	android/content/Context:getPackageName	()Ljava/lang/String;
    //   70: iconst_0
    //   71: invokevirtual 457	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   74: getfield 465	android/content/pm/PackageInfo:versionCode	I
    //   77: istore 8
    //   79: aload 7
    //   81: ifnull +148 -> 229
    //   84: new 116	java/lang/StringBuilder
    //   87: dup
    //   88: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   91: ldc_w 467
    //   94: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   97: aload 7
    //   99: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: iload 8
    //   104: invokevirtual 470	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   107: invokestatic 475	com/admarvel/android/ads/AdMarvelUtils:getSDKVersion	()Ljava/lang/String;
    //   110: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: astore 9
    //   118: aload 9
    //   120: ifnull +141 -> 261
    //   123: aload 6
    //   125: aload 9
    //   127: invokestatic 480	com/admarvel/android/ads/r:d	(Ljava/lang/String;)Ljava/lang/String;
    //   130: aconst_null
    //   131: invokeinterface 720 3 0
    //   136: astore 10
    //   138: aload 10
    //   140: ifnull +121 -> 261
    //   143: aload 10
    //   145: invokevirtual 723	java/lang/String:length	()I
    //   148: ifle +113 -> 261
    //   151: invokestatic 496	java/text/DateFormat:getDateTimeInstance	()Ljava/text/DateFormat;
    //   154: aload 10
    //   156: invokevirtual 727	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   159: astore 18
    //   161: invokestatic 496	java/text/DateFormat:getDateTimeInstance	()Ljava/text/DateFormat;
    //   164: new 498	java/util/Date
    //   167: dup
    //   168: invokestatic 504	java/lang/System:currentTimeMillis	()J
    //   171: invokespecial 508	java/util/Date:<init>	(J)V
    //   174: invokevirtual 512	java/text/DateFormat:format	(Ljava/util/Date;)Ljava/lang/String;
    //   177: astore 19
    //   179: invokestatic 496	java/text/DateFormat:getDateTimeInstance	()Ljava/text/DateFormat;
    //   182: aload 19
    //   184: invokevirtual 727	java/text/DateFormat:parse	(Ljava/lang/String;)Ljava/util/Date;
    //   187: aload 18
    //   189: invokevirtual 731	java/util/Date:before	(Ljava/util/Date;)Z
    //   192: ifeq +69 -> 261
    //   195: ldc_w 523
    //   198: invokestatic 102	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   201: aload_0
    //   202: getfield 74	com/admarvel/android/ads/AdMarvelView:h	Lcom/admarvel/android/ads/l;
    //   205: aload_0
    //   206: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   209: aload_0
    //   210: sipush 304
    //   213: sipush 304
    //   216: invokestatic 526	com/admarvel/android/ads/r:a	(I)Lcom/admarvel/android/ads/AdMarvelUtils$ErrorReason;
    //   219: aload_3
    //   220: iconst_0
    //   221: aload 4
    //   223: ldc 153
    //   225: invokevirtual 542	com/admarvel/android/ads/l:a	(Landroid/content/Context;Lcom/admarvel/android/ads/AdMarvelView;ILcom/admarvel/android/ads/AdMarvelUtils$ErrorReason;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V
    //   228: return
    //   229: new 116	java/lang/StringBuilder
    //   232: dup
    //   233: invokespecial 117	java/lang/StringBuilder:<init>	()V
    //   236: ldc_w 467
    //   239: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   242: iload 8
    //   244: invokevirtual 470	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   247: invokestatic 475	com/admarvel/android/ads/AdMarvelUtils:getSDKVersion	()Ljava/lang/String;
    //   250: invokevirtual 123	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   253: invokevirtual 129	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   256: astore 9
    //   258: goto -140 -> 118
    //   261: aload_2
    //   262: invokevirtual 734	java/lang/String:trim	()Ljava/lang/String;
    //   265: astore 11
    //   267: aload_3
    //   268: invokevirtual 734	java/lang/String:trim	()Ljava/lang/String;
    //   271: astore 12
    //   273: invokestatic 739	com/admarvel/android/util/e:a	()Lcom/admarvel/android/util/e;
    //   276: astore 13
    //   278: aload 13
    //   280: ifnull +16 -> 296
    //   283: aload 13
    //   285: invokevirtual 741	com/admarvel/android/util/e:b	()Z
    //   288: ifeq +8 -> 296
    //   291: aload 13
    //   293: invokevirtual 742	com/admarvel/android/util/e:c	()V
    //   296: invokestatic 747	com/admarvel/android/util/c:a	()Lcom/admarvel/android/util/c;
    //   299: astore 14
    //   301: aload 14
    //   303: ifnull +12 -> 315
    //   306: aload 14
    //   308: aload_0
    //   309: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   312: invokevirtual 749	com/admarvel/android/util/c:a	(Landroid/content/Context;)V
    //   315: aload_0
    //   316: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   319: invokevirtual 752	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   322: invokestatic 757	com/admarvel/android/util/b:a	()Lcom/admarvel/android/util/b;
    //   325: invokevirtual 761	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   328: invokestatic 504	java/lang/System:currentTimeMillis	()J
    //   331: aload_0
    //   332: getfield 195	com/admarvel/android/ads/AdMarvelView:k	Ljava/util/concurrent/atomic/AtomicLong;
    //   335: invokestatic 504	java/lang/System:currentTimeMillis	()J
    //   338: invokevirtual 765	java/util/concurrent/atomic/AtomicLong:getAndSet	(J)J
    //   341: lsub
    //   342: ldc2_w 766
    //   345: lcmp
    //   346: ifle +97 -> 443
    //   349: aload_0
    //   350: getfield 74	com/admarvel/android/ads/AdMarvelView:h	Lcom/admarvel/android/ads/l;
    //   353: aload_0
    //   354: invokevirtual 769	com/admarvel/android/ads/l:a	(Lcom/admarvel/android/ads/AdMarvelView;)V
    //   357: aconst_null
    //   358: astore 16
    //   360: aload 4
    //   362: ifnull +18 -> 380
    //   365: aload 4
    //   367: ldc_w 771
    //   370: invokeinterface 776 2 0
    //   375: checkcast 141	java/lang/String
    //   378: astore 16
    //   380: new 616	android/os/Handler
    //   383: dup
    //   384: invokestatic 622	android/os/Looper:getMainLooper	()Landroid/os/Looper;
    //   387: invokespecial 625	android/os/Handler:<init>	(Landroid/os/Looper;)V
    //   390: new 778	com/admarvel/android/ads/AdMarvelView$a
    //   393: dup
    //   394: aload_0
    //   395: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   398: aload 4
    //   400: aload 11
    //   402: aload 12
    //   404: aload 16
    //   406: aload_0
    //   407: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   410: invokestatic 780	com/admarvel/android/ads/r:d	(Landroid/content/Context;)I
    //   413: aload_0
    //   414: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   417: invokestatic 783	com/admarvel/android/ads/r:a	(Landroid/content/Context;)Ljava/lang/String;
    //   420: aload_0
    //   421: iconst_0
    //   422: ldc 153
    //   424: invokespecial 786	com/admarvel/android/ads/AdMarvelView$a:<init>	(Landroid/content/Context;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/admarvel/android/ads/AdMarvelView;ILjava/lang/String;)V
    //   427: invokevirtual 632	android/os/Handler:post	(Ljava/lang/Runnable;)Z
    //   430: pop
    //   431: return
    //   432: astore 5
    //   434: aload 5
    //   436: invokestatic 548	android/util/Log:getStackTraceString	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   439: invokestatic 102	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   442: return
    //   443: ldc_w 788
    //   446: invokestatic 102	com/admarvel/android/util/Logging:log	(Ljava/lang/String;)V
    //   449: aload_0
    //   450: getfield 74	com/admarvel/android/ads/AdMarvelView:h	Lcom/admarvel/android/ads/l;
    //   453: aload_0
    //   454: invokevirtual 368	com/admarvel/android/ads/AdMarvelView:getContext	()Landroid/content/Context;
    //   457: aload_0
    //   458: sipush 304
    //   461: sipush 304
    //   464: invokestatic 526	com/admarvel/android/ads/r:a	(I)Lcom/admarvel/android/ads/AdMarvelUtils$ErrorReason;
    //   467: aload 12
    //   469: iconst_0
    //   470: aload 4
    //   472: ldc 153
    //   474: invokevirtual 542	com/admarvel/android/ads/l:a	(Landroid/content/Context;Lcom/admarvel/android/ads/AdMarvelView;ILcom/admarvel/android/ads/AdMarvelUtils$ErrorReason;Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V
    //   477: return
    //   478: astore 15
    //   480: goto -152 -> 328
    //
    // Exception table:
    //   from	to	target	type
    //   7	17	432	java/lang/Exception
    //   17	79	432	java/lang/Exception
    //   84	118	432	java/lang/Exception
    //   123	138	432	java/lang/Exception
    //   143	228	432	java/lang/Exception
    //   229	258	432	java/lang/Exception
    //   261	278	432	java/lang/Exception
    //   283	296	432	java/lang/Exception
    //   296	301	432	java/lang/Exception
    //   306	315	432	java/lang/Exception
    //   315	328	432	java/lang/Exception
    //   328	357	432	java/lang/Exception
    //   365	380	432	java/lang/Exception
    //   380	431	432	java/lang/Exception
    //   443	477	432	java/lang/Exception
    //   315	328	478	java/lang/IllegalArgumentException
  }

  public void requestNewAd(Map<String, Object> paramMap, String paramString1, String paramString2, Activity paramActivity)
  {
    u = new WeakReference(paramActivity);
    requestNewAd(paramMap, paramString1, paramString2);
  }

  public void resume(Activity paramActivity)
  {
    Logging.log("AdMarvelView - Resume");
    View localView1 = findViewWithTag("CURRENT");
    if ((localView1 instanceof m))
      ((m)localView1).b();
    boolean bool = localView1 instanceof FrameLayout;
    View localView2 = null;
    if (bool)
      localView2 = ((FrameLayout)localView1).getChildAt(0);
    try
    {
      AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").resume(paramActivity, localView2);
      try
      {
        label66: AdMarvelAdapterInstances.getInstance(this.b, "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").resume(paramActivity, localView2);
        try
        {
          label82: AdMarvelAdapterInstances.getInstance("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").resume(paramActivity, localView2);
          try
          {
            label97: AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).resume();
            return;
          }
          catch (Exception localException2)
          {
          }
        }
        catch (Exception localException1)
        {
          break label97;
        }
      }
      catch (Exception localException4)
      {
        break label82;
      }
    }
    catch (Exception localException3)
    {
      break label66;
    }
  }

  public void setAdContainerWidth(int paramInt)
  {
    Logging.log("AdMarvelView - setAdContainerWidth :" + paramInt);
    this.m = paramInt;
  }

  public void setAdMarvelBackgroundColor(int paramInt)
  {
    Logging.log("AdMarvelView - setAdMarvelBackgroundColor :" + paramInt);
    if (paramInt == 0);
    for (this.d = 0; ; this.d = (0xFF000000 | paramInt))
    {
      setBackgroundColor(this.d);
      return;
    }
  }

  public void setAdmarvelWebViewAsSoftwareLayer(boolean paramBoolean)
  {
    Logging.log("AdMarvelView - setAdmarvelWebViewAsSoftwareLayer :" + paramBoolean);
    this.o = paramBoolean;
  }

  public void setDisableAnimation(boolean paramBoolean)
  {
    Logging.log("AdMarvelView - setDisableAnimation :" + paramBoolean);
    this.j = paramBoolean;
  }

  public void setDisableSDKImpressionTracking(boolean paramBoolean)
  {
    Logging.log("AdMarvelView - setDisableSDKImpressionTracking :" + paramBoolean);
    this.t = paramBoolean;
  }

  public void setEnableAutoScaling(boolean paramBoolean)
  {
    Logging.log("AdMarvelView - setEnableAutoScaling :" + paramBoolean);
    this.r = paramBoolean;
  }

  public void setEnableClickRedirect(boolean paramBoolean)
  {
    Logging.log("AdMarvelView - setEnableClickRedirect :" + paramBoolean);
    this.l = paramBoolean;
  }

  public void setEnableFitToScreenForTablets(boolean paramBoolean)
  {
    Logging.log("AdMarvelView - setEnableFitToScreenForTablets :" + paramBoolean);
    this.s = paramBoolean;
  }

  public void setExtendedListener(AdMarvelView.AdMarvelViewExtendedListener paramAdMarvelViewExtendedListener)
  {
    this.h.a(paramAdMarvelViewExtendedListener);
  }

  public void setListener(AdMarvelView.AdMarvelViewListener paramAdMarvelViewListener)
  {
    this.h.a(paramAdMarvelViewListener);
  }

  public void setPostitialView(boolean paramBoolean)
  {
    Logging.log("AdMarvelView - setPostitialView :" + paramBoolean);
    this.x = paramBoolean;
  }

  public void setTextBackgroundColor(int paramInt)
  {
    Logging.log("AdMarvelView - setTextBackgroundColor :" + paramInt);
    this.e = (0xFF000000 | paramInt);
  }

  public void setTextBorderColor(int paramInt)
  {
    Logging.log("AdMarvelView - setTextBorderColor :" + paramInt);
    this.g = paramInt;
  }

  public void setTextFontColor(int paramInt)
  {
    Logging.log("AdMarvelView - setTextFontColor :" + paramInt);
    this.f = (0xFF000000 | paramInt);
  }

  public void setVisibility(int paramInt)
  {
    if (paramInt == 8)
      paramInt = 4;
    super.setVisibility(paramInt);
    requestLayout();
  }

  public void start(Activity paramActivity)
  {
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).start();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void stop(Activity paramActivity)
  {
    Logging.log("AdMarvelView - Stop");
    try
    {
      AdMarvelAnalyticsAdapterInstances.getInstance("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).stop();
      return;
    }
    catch (Exception localException)
    {
    }
  }

  public void updateCurrentActivity(Activity paramActivity)
  {
    Logging.log("AdMarvelView - updateCurrentActivity");
    if (paramActivity != null)
      u = new WeakReference(paramActivity);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView
 * JD-Core Version:    0.6.2
 */