package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Handler;
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
import com.admarvel.android.a.a;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.e;
import java.io.File;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicLong;

public class AdMarvelView extends LinearLayout
{
  static String a;
  public static boolean b;
  protected static boolean d = true;
  private static boolean j = false;
  private static boolean o = true;
  private static boolean w = true;
  private static com.admarvel.android.b.c x = null;
  private static WeakReference<Activity> z;
  private AdMarvelAd A;
  private boolean B = false;
  final String c = UUID.randomUUID().toString();
  private int e;
  private int f;
  private int g;
  private int h;
  private final r i = new r();
  private boolean k = false;
  private boolean l;
  private final AtomicLong m;
  private boolean n = true;
  private boolean p = false;
  private final AdMarvelView.k q;
  private final AdMarvelView.l r;
  private final Handler s = new Handler();
  private Map<String, String> t;
  private boolean u = true;
  private boolean v = false;
  private boolean y = false;

  public AdMarvelView(Context paramContext)
  {
    this(paramContext, null);
  }

  public AdMarvelView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    b.a(this.c);
    Logging.log(ac.b());
    setFocusable(true);
    setDescendantFocusability(262144);
    setClickable(true);
    String str = "http://schemas.android.com/apk/res/" + paramContext.getPackageName();
    if (paramAttributeSet != null)
      if (paramAttributeSet.getAttributeValue(str, "backgroundColor") != null)
        if (!"0".equals(paramAttributeSet.getAttributeValue(str, "backgroundColor")))
          break label380;
    label380: for (this.e = 0; ; this.e = Integer.parseInt(paramAttributeSet.getAttributeValue(str, "backgroundColor").replace("#", ""), 16))
    {
      if (paramAttributeSet.getAttributeValue(str, "textBackgroundColor") != null)
        this.f = Integer.parseInt(paramAttributeSet.getAttributeValue(str, "textBackgroundColor").replace("#", ""), 16);
      if (paramAttributeSet.getAttributeValue(str, "textFontColor") != null)
        this.g = Integer.parseInt(paramAttributeSet.getAttributeValue(str, "textFontColor").replace("#", ""), 16);
      if (paramAttributeSet.getAttributeValue(str, "textBorderColor") != null)
        this.h = Integer.parseInt(paramAttributeSet.getAttributeValue(str, "textBorderColor").replace("#", ""), 16);
      if (paramAttributeSet.getAttributeValue(str, "disableAnimation") != null)
        this.l = Boolean.parseBoolean(paramAttributeSet.getAttributeValue(str, "disableAnimation"));
      if (paramAttributeSet.getAttributeValue(str, "enableClickRedirect") != null)
        this.n = Boolean.parseBoolean(paramAttributeSet.getAttributeValue(str, "enableClickRedirect"));
      setAdMarvelBackgroundColor(this.e);
      this.m = new AtomicLong(0L);
      this.q = new AdMarvelView.k(this);
      this.r = new AdMarvelView.l(this);
      return;
    }
  }

  private void a(View paramView)
  {
    if ((paramView != null) && ((paramView instanceof AdMarvelWebView)))
    {
      AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)paramView;
      localAdMarvelWebView.d();
      localAdMarvelWebView.c();
    }
  }

  private void a(final View paramView, final AdMarvelAd paramAdMarvelAd)
  {
    if (this.l)
      return;
    setVisibility(8);
    setVisibility(0);
    aa localaa = new aa(0.0F, -90.0F, getWidth() / 2.0F, getHeight() / 2.0F, -0.3F * getWidth(), true);
    localaa.setDuration(700L);
    localaa.setFillAfter(true);
    localaa.setInterpolator(new AccelerateInterpolator());
    localaa.setAnimationListener(new Animation.AnimationListener()
    {
      public void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        AdMarvelView.this.post(new AdMarvelView.n(paramView, AdMarvelView.this, paramAdMarvelAd));
      }

      public void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
      }

      public void onAnimationStart(Animation paramAnonymousAnimation)
      {
      }
    });
    startAnimation(localaa);
  }

  private void b(View paramView)
  {
    try
    {
      b.a(this.c, "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").cleanupView(paramView);
      Logging.log("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter: cleanupView");
      try
      {
        label20: b.a(this.c, "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").cleanupView(paramView);
        Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: cleanupView");
        try
        {
          label40: b.a(this.c, "com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").cleanupView(paramView);
          Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: cleanupView");
          try
          {
            label60: b.a(this.c, "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").cleanupView(paramView);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: cleanupView");
            try
            {
              label80: b.a(this.c, "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").cleanupView(paramView);
              Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: cleanupView");
              try
              {
                label100: b.a(this.c, "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").cleanupView(paramView);
                Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: cleanupView");
                try
                {
                  label120: b.a(this.c, "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").cleanupView(paramView);
                  Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: cleanupView");
                  try
                  {
                    label140: b.a(this.c, "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").cleanupView(paramView);
                    Logging.log("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter: cleanupView");
                    try
                    {
                      label160: b.a(this.c, "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").cleanupView(paramView);
                      Logging.log("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter: cleanupView");
                      try
                      {
                        label180: b.a(this.c, "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").cleanupView(paramView);
                        Logging.log("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter: cleanupView");
                        return;
                      }
                      catch (Exception localException10)
                      {
                      }
                    }
                    catch (Exception localException9)
                    {
                      break label180;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label160;
                  }
                }
                catch (Exception localException7)
                {
                  break label140;
                }
              }
              catch (Exception localException6)
              {
                break label120;
              }
            }
            catch (Exception localException5)
            {
              break label100;
            }
          }
          catch (Exception localException4)
          {
            break label80;
          }
        }
        catch (Exception localException3)
        {
          break label60;
        }
      }
      catch (Exception localException2)
      {
        break label40;
      }
    }
    catch (Exception localException1)
    {
      break label20;
    }
  }

  public static void disableNetworkActivity()
  {
    try
    {
      w = false;
      if ((x != null) && (!x.isCancelled()))
      {
        x.cancel(true);
        x = null;
      }
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
    if (this.l)
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
    while (true)
    {
      try
      {
        w = true;
        if ((x != null) && (x.isCancelled()))
        {
          x = null;
          if (ac.a() >= 11)
          {
            new AdMarvelView.g(paramActivity, paramString).run();
            return;
          }
          x.execute(new Void[0]);
          continue;
        }
      }
      finally
      {
      }
      if (ac.a() >= 11)
        new AdMarvelView.g(paramActivity, paramString).run();
      else
        x.execute(new Void[0]);
    }
  }

  public static void forceCloseFullScreenAd(Activity paramActivity, AdMarvelActivity paramAdMarvelActivity, AdMarvelVideoActivity paramAdMarvelVideoActivity)
  {
    if (paramAdMarvelActivity != null)
      paramAdMarvelActivity.finish();
    if (paramAdMarvelVideoActivity != null)
      paramAdMarvelVideoActivity.finish();
    try
    {
      b.a("ADMARVELGUID", "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").forceCloseFullScreenAd(paramActivity);
      Logging.log("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter: forceCloseFullScreenAd");
      try
      {
        label35: b.a("ADMARVELGUID", "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").forceCloseFullScreenAd(paramActivity);
        Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: forceCloseFullScreenAd");
        try
        {
          label54: b.a("ADMARVELGUID", "com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").forceCloseFullScreenAd(paramActivity);
          Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: forceCloseFullScreenAd");
          try
          {
            label73: b.a("ADMARVELGUID", "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").forceCloseFullScreenAd(paramActivity);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: forceCloseFullScreenAd");
            try
            {
              label92: b.a("ADMARVELGUID", "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").forceCloseFullScreenAd(paramActivity);
              Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: forceCloseFullScreenAd");
              try
              {
                label111: b.a("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").forceCloseFullScreenAd(paramActivity);
                Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: forceCloseFullScreenAd");
                try
                {
                  label130: b.a("ADMARVELGUID", "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").forceCloseFullScreenAd(paramActivity);
                  Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: forceCloseFullScreenAd");
                  try
                  {
                    label149: b.a("ADMARVELGUID", "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").forceCloseFullScreenAd(paramActivity);
                    Logging.log("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter: forceCloseFullScreenAd");
                    try
                    {
                      label168: b.a("ADMARVELGUID", "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").forceCloseFullScreenAd(paramActivity);
                      Logging.log("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter: forceCloseFullScreenAd");
                      try
                      {
                        label187: b.a("ADMARVELGUID", "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").forceCloseFullScreenAd(paramActivity);
                        Logging.log("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter: forceCloseFullScreenAd");
                        return;
                      }
                      catch (Exception localException10)
                      {
                      }
                    }
                    catch (Exception localException9)
                    {
                      break label187;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label168;
                  }
                }
                catch (Exception localException7)
                {
                  break label149;
                }
              }
              catch (Exception localException6)
              {
                break label130;
              }
            }
            catch (Exception localException5)
            {
              break label111;
            }
          }
          catch (Exception localException4)
          {
            break label92;
          }
        }
        catch (Exception localException3)
        {
          break label73;
        }
      }
      catch (Exception localException2)
      {
        break label54;
      }
    }
    catch (Exception localException1)
    {
      break label35;
    }
  }

  public static void initialize(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap)
  {
    if ((ac.a() >= 11) && (o))
      AdMarvelView.j.a(paramActivity);
    new a(paramActivity).a();
    try
    {
      b.a("ADMARVELGUID", "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").initialize(paramActivity, paramMap);
      Logging.log("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter: startActivity");
      try
      {
        label49: b.a("ADMARVELGUID", "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").initialize(paramActivity, paramMap);
        Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: startActivity");
        try
        {
          label69: b.a("ADMARVELGUID", "com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").initialize(paramActivity, paramMap);
          Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: startActivity");
          try
          {
            label89: b.a("ADMARVELGUID", "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").initialize(paramActivity, paramMap);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: startActivity");
            try
            {
              label109: b.a("ADMARVELGUID", "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").initialize(paramActivity, paramMap);
              Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: startActivity");
              try
              {
                label129: b.a("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").initialize(paramActivity, paramMap);
                Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: startActivity");
                try
                {
                  label149: b.a("ADMARVELGUID", "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").initialize(paramActivity, paramMap);
                  Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: startActivity");
                  try
                  {
                    label169: b.a("ADMARVELGUID", "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").initialize(paramActivity, paramMap);
                    Logging.log("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter: startActivity");
                    try
                    {
                      label189: b.a("ADMARVELGUID", "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").initialize(paramActivity, paramMap);
                      Logging.log("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter: startActivity");
                      try
                      {
                        label209: b.a("ADMARVELGUID", "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").initialize(paramActivity, paramMap);
                        Logging.log("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter: startActivity");
                        try
                        {
                          label229: c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).start();
                          label239: new Thread(new Runnable()
                          {
                            public final void run()
                            {
                              ab.l(AdMarvelView.this);
                            }
                          }).start();
                          ab.m(paramActivity);
                          e.c(paramActivity);
                          return;
                        }
                        catch (Exception localException11)
                        {
                          break label239;
                        }
                      }
                      catch (Exception localException10)
                      {
                        break label229;
                      }
                    }
                    catch (Exception localException9)
                    {
                      break label209;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label189;
                  }
                }
                catch (Exception localException7)
                {
                  break label169;
                }
              }
              catch (Exception localException6)
              {
                break label149;
              }
            }
            catch (Exception localException5)
            {
              break label129;
            }
          }
          catch (Exception localException4)
          {
            break label109;
          }
        }
        catch (Exception localException3)
        {
          break label89;
        }
      }
      catch (Exception localException2)
      {
        break label69;
      }
    }
    catch (Exception localException1)
    {
      break label49;
    }
  }

  public static void initializeOfflineSDK(Activity paramActivity, String paramString)
  {
    b = true;
    Logging.log("Offline SDK:initializeOfflineSDK ");
    if ((w) && (ab.f(paramActivity)))
    {
      x = new com.admarvel.android.b.c(paramString, paramActivity);
      if (ac.a() >= 11)
        new AdMarvelView.g(paramActivity, paramString).run();
    }
    else
    {
      return;
    }
    x.execute(new Void[0]);
  }

  public static void pause(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap, AdMarvelView paramAdMarvelView)
  {
    if (paramAdMarvelView != null)
    {
      View localView = paramAdMarvelView.findViewWithTag("CURRENT");
      if ((localView instanceof AdMarvelWebView))
        ((AdMarvelWebView)localView).a();
    }
    Iterator localIterator = b.a().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map localMap = (Map)((Map.Entry)localIterator.next()).getValue();
      try
      {
        ((AdMarvelAdapter)localMap.get("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter")).pause(paramActivity, paramMap);
        Logging.log("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter: pause");
      }
      catch (Exception localException11)
      {
      }
    }
    try
    {
      b.a("ADMARVELGUID", "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").pause(paramActivity, paramMap);
      Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: pause");
      try
      {
        label123: b.a("ADMARVELGUID", "com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").pause(paramActivity, paramMap);
        Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: pause");
        try
        {
          label143: b.a("ADMARVELGUID", "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").pause(paramActivity, paramMap);
          Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: pause");
          try
          {
            label163: b.a("ADMARVELGUID", "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").pause(paramActivity, paramMap);
            Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: pause");
            try
            {
              label183: b.a("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").pause(paramActivity, paramMap);
              Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: pause");
              try
              {
                label203: b.a("ADMARVELGUID", "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").pause(paramActivity, paramMap);
                Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: pause");
                try
                {
                  label223: b.a("ADMARVELGUID", "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").pause(paramActivity, paramMap);
                  Logging.log("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter: pause");
                  try
                  {
                    label243: b.a("ADMARVELGUID", "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").pause(paramActivity, paramMap);
                    Logging.log("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter: pause");
                    try
                    {
                      label263: b.a("ADMARVELGUID", "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").pause(paramActivity, paramMap);
                      Logging.log("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter: pause");
                      try
                      {
                        label283: c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).pause();
                        return;
                      }
                      catch (Exception localException10)
                      {
                      }
                    }
                    catch (Exception localException9)
                    {
                      break label283;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label263;
                  }
                }
                catch (Exception localException7)
                {
                  break label243;
                }
              }
              catch (Exception localException6)
              {
                break label223;
              }
            }
            catch (Exception localException5)
            {
              break label203;
            }
          }
          catch (Exception localException4)
          {
            break label183;
          }
        }
        catch (Exception localException3)
        {
          break label163;
        }
      }
      catch (Exception localException2)
      {
        break label143;
      }
    }
    catch (Exception localException1)
    {
      break label123;
    }
  }

  public static void resume(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap, AdMarvelView paramAdMarvelView)
  {
    if (paramAdMarvelView != null)
    {
      View localView = paramAdMarvelView.findViewWithTag("CURRENT");
      if ((localView instanceof AdMarvelWebView))
        ((AdMarvelWebView)localView).b();
    }
    Iterator localIterator = b.a().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map localMap = (Map)((Map.Entry)localIterator.next()).getValue();
      try
      {
        ((AdMarvelAdapter)localMap.get("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter")).resume(paramActivity, paramMap);
        Logging.log("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter: resume");
      }
      catch (Exception localException11)
      {
      }
    }
    try
    {
      b.a("ADMARVELGUID", "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").resume(paramActivity, paramMap);
      Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: resume");
      try
      {
        label123: b.a("ADMARVELGUID", "com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").resume(paramActivity, paramMap);
        Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: resume");
        try
        {
          label143: b.a("ADMARVELGUID", "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").resume(paramActivity, paramMap);
          Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: resume");
          try
          {
            label163: b.a("ADMARVELGUID", "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").resume(paramActivity, paramMap);
            Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: resume");
            try
            {
              label183: b.a("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").resume(paramActivity, paramMap);
              Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: resume");
              try
              {
                label203: b.a("ADMARVELGUID", "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").resume(paramActivity, paramMap);
                Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: resume");
                try
                {
                  label223: b.a("ADMARVELGUID", "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").resume(paramActivity, paramMap);
                  Logging.log("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter: resume");
                  try
                  {
                    label243: b.a("ADMARVELGUID", "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").resume(paramActivity, paramMap);
                    Logging.log("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter: resume");
                    try
                    {
                      label263: b.a("ADMARVELGUID", "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").resume(paramActivity, paramMap);
                      Logging.log("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter: resume");
                      try
                      {
                        label283: c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).pause();
                        return;
                      }
                      catch (Exception localException10)
                      {
                      }
                    }
                    catch (Exception localException9)
                    {
                      break label283;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label263;
                  }
                }
                catch (Exception localException7)
                {
                  break label243;
                }
              }
              catch (Exception localException6)
              {
                break label223;
              }
            }
            catch (Exception localException5)
            {
              break label203;
            }
          }
          catch (Exception localException4)
          {
            break label183;
          }
        }
        catch (Exception localException3)
        {
          break label163;
        }
      }
      catch (Exception localException2)
      {
        break label143;
      }
    }
    catch (Exception localException1)
    {
      break label123;
    }
  }

  public static void setEnableHardwareAcceleration(boolean paramBoolean)
  {
    o = paramBoolean;
  }

  public static void uninitialize(Activity paramActivity, Map<AdMarvelUtils.SDKAdNetwork, String> paramMap)
  {
    n localn = n.a();
    if ((localn != null) && (localn.b()))
      localn.c();
    l locall = l.a();
    if (locall != null)
      locall.a(paramActivity);
    try
    {
      b.a("ADMARVELGUID", "com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter").uninitialize(paramActivity, paramMap);
      Logging.log("com.admarvel.android.admarvelgoogleplayadapter.AdMarvelGooglePlayAdapter: endActivity");
      try
      {
        label52: b.a("ADMARVELGUID", "com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter").uninitialize(paramActivity, paramMap);
        Logging.log("com.admarvel.android.admarvelrhythmadapter.AdMarvelRhythmAdapter: endActivity");
        try
        {
          label72: b.a("ADMARVELGUID", "com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter").uninitialize(paramActivity, paramMap);
          Logging.log("com.admarvel.android.admarvelgreystripeadapter.AdMarvelGreystripeAdapter: endActivity");
          try
          {
            label92: b.a("ADMARVELGUID", "com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter").uninitialize(paramActivity, paramMap);
            Logging.log("com.admarvel.android.admarvelmillennialadapter.AdMarvelMillennialAdapter: endActivity");
            try
            {
              label112: b.a("ADMARVELGUID", "com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter").uninitialize(paramActivity, paramMap);
              Logging.log("com.admarvel.android.admarvelamazonadapter.AdMarvelAmazonAdapter: endActivity");
              try
              {
                label132: b.a("ADMARVELGUID", "com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter").uninitialize(paramActivity, paramMap);
                Logging.log("com.admarvel.android.admarveladcolonyadapter.AdMarvelAdColonyAdapter: endActivity");
                try
                {
                  label152: b.a("ADMARVELGUID", "com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter").uninitialize(paramActivity, paramMap);
                  Logging.log("com.admarvel.android.admarvelpulse3dadapter.AdMarvelPulse3dAdapter: endActivity");
                  try
                  {
                    label172: b.a("ADMARVELGUID", "com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter").uninitialize(paramActivity, paramMap);
                    Logging.log("com.admarvel.android.admarvelfacebookadapter.AdMarvelFacebookAdapter: endActivity");
                    try
                    {
                      label192: b.a("ADMARVELGUID", "com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter").uninitialize(paramActivity, paramMap);
                      Logging.log("com.admarvel.android.admarvelinmobiadapter.AdMarvelInmobiAdapter: endActivity");
                      try
                      {
                        label212: b.a("ADMARVELGUID", "com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter").uninitialize(paramActivity, paramMap);
                        Logging.log("com.admarvel.android.admarvelheyzapadapter.AdMarvelHeyzapAdapter: endActivity");
                        try
                        {
                          label232: c.a("com.admarvel.android.admarvelmologiqadapter.AdMarvelMologiqAdapter", paramActivity).stop();
                          label242: e.a();
                          ab.m(paramActivity);
                          return;
                        }
                        catch (Exception localException11)
                        {
                          break label242;
                        }
                      }
                      catch (Exception localException10)
                      {
                        break label232;
                      }
                    }
                    catch (Exception localException9)
                    {
                      break label212;
                    }
                  }
                  catch (Exception localException8)
                  {
                    break label192;
                  }
                }
                catch (Exception localException7)
                {
                  break label172;
                }
              }
              catch (Exception localException6)
              {
                break label152;
              }
            }
            catch (Exception localException5)
            {
              break label132;
            }
          }
          catch (Exception localException4)
          {
            break label112;
          }
        }
        catch (Exception localException3)
        {
          break label92;
        }
      }
      catch (Exception localException2)
      {
        break label72;
      }
    }
    catch (Exception localException1)
    {
      break label52;
    }
  }

  protected void a(AdMarvelAd paramAdMarvelAd)
  {
    View localView1 = findViewWithTag("CURRENT");
    if ((localView1 instanceof AdMarvelWebView))
      ((AdMarvelWebView)localView1).d();
    String str = a;
    File localFile = null;
    if (str != null)
      localFile = new File(a);
    if ((z != null) && (z.get() != null));
    for (AdMarvelWebView localAdMarvelWebView = new AdMarvelWebView((Context)z.get(), this.u, this.v, localFile, paramAdMarvelAd.getXml(), paramAdMarvelAd, this.s); ; localAdMarvelWebView = new AdMarvelWebView(getContext(), this.u, this.v, localFile, paramAdMarvelAd.getXml(), paramAdMarvelAd, this.s))
    {
      localAdMarvelWebView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
      localAdMarvelWebView.setBackgroundColor(this.e);
      localAdMarvelWebView.setEnableClickRedirect(this.n);
      AdMarvelWebView.a(localAdMarvelWebView.e, this.r);
      localAdMarvelWebView.setTag("PENDING");
      localAdMarvelWebView.setVisibility(8);
      localAdMarvelWebView.a(getTextFontColor(), getTextBorderColor(), getTextBackgroundColor(), getAdMarvelBackgroundColor(), this);
      while (true)
      {
        View localView2 = findViewWithTag("PENDING");
        if (localView2 == null)
          break;
        removeView(localView2);
      }
    }
    addView(localAdMarvelWebView);
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
          SharedPreferences.Editor localEditor = paramContext.getSharedPreferences(ab.c("admarvel"), 0).edit();
          String str1 = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis() + 1000 * Integer.parseInt(paramString)));
          localEditor.putString(ab.c((String)localObject), str1);
          localEditor.commit();
          Logging.log("requestNewAd: AD REQUEST BLOCKED, IGNORING REQUEST");
          this.i.a(getContext(), this, 304, ab.a(304), paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
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
      AdMarvelAdapter localAdMarvelAdapter;
      try
      {
        this.A = paramAdMarvelAd;
        localAdMarvelAdapter = b.a(this.c, paramString);
        if ((z != null) && (z.get() != null))
        {
          localView1 = localAdMarvelAdapter.requestNewAd(this.q, (Context)z.get(), paramAdMarvelAd, paramMap, this.e, this.g);
          break label380;
          View localView2 = findViewWithTag("PENDING");
          if (localView2 == null)
            break label164;
          removeView(localView2);
          continue;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        this.i.a(getContext(), this, 304, ab.a(304), paramAdMarvelAd.getSiteId(), paramAdMarvelAd.getId(), paramAdMarvelAd.getTargetParams(), paramAdMarvelAd.getIpAddress());
        return;
      }
      View localView1 = localAdMarvelAdapter.requestNewAd(this.q, paramContext, paramAdMarvelAd, paramMap, this.e, this.g);
      break label380;
      label164: ViewGroup.LayoutParams localLayoutParams = getLayoutParams();
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
          break label370;
        localFrameLayout.setVisibility(0);
      }
      while (true)
      {
        removeAllViews();
        addView(localFrameLayout);
        return;
        if ((localView1.getLayoutParams() instanceof FrameLayout.LayoutParams))
        {
          FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)localView1.getLayoutParams();
          localLayoutParams2.gravity = 1;
          localFrameLayout.addView(localView1, localLayoutParams2);
          break;
        }
        if (!(localView1.getLayoutParams() instanceof RelativeLayout.LayoutParams))
          break;
        RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localView1.getLayoutParams();
        localLayoutParams1.addRule(13);
        localFrameLayout.addView(localView1, localLayoutParams1);
        break;
        label370: localFrameLayout.setVisibility(8);
      }
      label380: if (localView1 == null);
    }
  }

  public boolean a()
  {
    return this.B;
  }

  public void adMarvelViewDisplayed()
  {
    this.s.post(new AdMarvelView.h(this, this.s));
  }

  public boolean b()
  {
    return this.p;
  }

  public void destroy()
  {
    this.s.post(new AdMarvelView.d(this));
  }

  public void displayAd(Context paramContext, AdMarvelAd paramAdMarvelAd)
  {
    this.A = paramAdMarvelAd;
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
        AdMarvelUtils.ErrorReason localErrorReason = ab.a(303);
        int i1 = ab.a(localErrorReason);
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
    this.B = paramBoolean;
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
    this.s.post(new AdMarvelView.i(this));
  }

  public int getAdMarvelBackgroundColor()
  {
    return this.e;
  }

  r getListenerImpl()
  {
    return this.i;
  }

  public int getTextBackgroundColor()
  {
    return this.f;
  }

  public int getTextBorderColor()
  {
    return this.h;
  }

  public int getTextFontColor()
  {
    return this.g;
  }

  public void requestNewAd(Map<String, Object> paramMap, String paramString1, String paramString2)
  {
    String str5;
    try
    {
      SharedPreferences localSharedPreferences = getContext().getSharedPreferences(ab.c("admarvel"), 0);
      String str1 = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionName;
      int i1 = getContext().getPackageManager().getPackageInfo(getContext().getPackageName(), 0).versionCode;
      if (str1 != null);
      for (String str2 = "duration" + str1 + i1 + AdMarvelUtils.getSDKVersion(); str2 != null; str2 = "duration" + i1 + AdMarvelUtils.getSDKVersion())
      {
        String str3 = localSharedPreferences.getString(ab.c(str2), null);
        if ((str3 == null) || (str3.length() <= 0))
          break;
        Date localDate = DateFormat.getDateTimeInstance().parse(str3);
        String str8 = DateFormat.getDateTimeInstance().format(new Date(System.currentTimeMillis()));
        if (!DateFormat.getDateTimeInstance().parse(str8).before(localDate))
          break;
        Logging.log("requestNewAd: AD REQUEST BLOCKED, IGNORING REQUEST");
        this.i.a(getContext(), this, 304, ab.a(304), paramString2, 0, paramMap, "");
        return;
      }
      new a(getContext()).a();
      String str4 = paramString1.trim();
      str5 = paramString2.trim();
      n localn = n.a();
      if ((localn != null) && (localn.b()))
        localn.c();
      l locall = l.a();
      if (locall != null)
        locall.a(getContext());
      if (System.currentTimeMillis() - this.m.getAndSet(System.currentTimeMillis()) > 2000L)
      {
        this.i.a(this);
        String str6 = a;
        File localFile = null;
        if (str6 != null)
          localFile = new File(a);
        String str7 = null;
        if (paramMap != null)
          str7 = (String)paramMap.get("UNIQUE_ID");
        this.s.post(new AdMarvelView.b(localFile, getContext(), paramMap, str4, str5, str7, ab.d(getContext()), ab.a(getContext()), this, 0, "", this.s));
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    Logging.log("requestNewAd: AD REQUEST PENDING, IGNORING REQUEST");
    this.i.a(getContext(), this, 304, ab.a(304), str5, 0, paramMap, "");
  }

  public void requestNewAd(Map<String, Object> paramMap, String paramString1, String paramString2, Activity paramActivity)
  {
    z = new WeakReference(paramActivity);
    requestNewAd(paramMap, paramString1, paramString2);
  }

  public void setAdMarvelBackgroundColor(int paramInt)
  {
    if (paramInt == 0);
    for (this.e = 0; ; this.e = (0xFF000000 | paramInt))
    {
      setBackgroundColor(this.e);
      return;
    }
  }

  public void setAdmarvelWebViewAsSoftwareLayer(boolean paramBoolean)
  {
    this.p = paramBoolean;
  }

  public void setDisableAnimation(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  public void setDisableSDKImpressionTracking(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }

  public void setEnableAutoScaling(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }

  public void setEnableClickRedirect(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  public void setEnableFitToScreenForTablets(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }

  public void setExtendedListener(AdMarvelView.AdMarvelViewExtendedListener paramAdMarvelViewExtendedListener)
  {
    this.i.a(paramAdMarvelViewExtendedListener);
  }

  public void setListener(AdMarvelView.AdMarvelViewListener paramAdMarvelViewListener)
  {
    this.i.a(paramAdMarvelViewListener);
  }

  public void setOptionalFlags(Map<String, String> paramMap)
  {
    this.t = paramMap;
    String str1 = a;
    if (paramMap != null);
    try
    {
      for (String str2 = (String)paramMap.get("cached_directory"); ; str2 = null)
      {
        a = str2;
        if ((str2 != null) && (!j))
        {
          this.s.post(new AdMarvelView.a(getContext(), new File(a)));
          j = true;
        }
        return;
      }
    }
    finally
    {
    }
  }

  public void setTextBackgroundColor(int paramInt)
  {
    this.f = (0xFF000000 | paramInt);
  }

  public void setTextBorderColor(int paramInt)
  {
    this.h = paramInt;
  }

  public void setTextFontColor(int paramInt)
  {
    this.g = (0xFF000000 | paramInt);
  }

  public void setVisibility(int paramInt)
  {
    if (paramInt == 8)
      paramInt = 4;
    super.setVisibility(paramInt);
    requestLayout();
  }

  public void updateCurrentActivity(Activity paramActivity)
  {
    if (paramActivity != null)
      z = new WeakReference(paramActivity);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView
 * JD-Core Version:    0.6.2
 */