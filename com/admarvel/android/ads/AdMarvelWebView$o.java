package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class AdMarvelWebView$o
  implements Runnable
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private final WeakReference<AdMarvelWebView> e;
  private final WeakReference<Activity> f;
  private final AdMarvelAd g;

  public AdMarvelWebView$o(AdMarvelWebView paramAdMarvelWebView, Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, int paramInt4, AdMarvelAd paramAdMarvelAd)
  {
    this.e = new WeakReference(paramAdMarvelWebView);
    this.f = new WeakReference(paramActivity);
    this.a = paramInt3;
    this.b = paramInt4;
    this.c = paramInt1;
    this.d = paramInt2;
    this.g = paramAdMarvelAd;
  }

  public AdMarvelWebView$o(AdMarvelWebView paramAdMarvelWebView, Activity paramActivity, int paramInt1, int paramInt2, AdMarvelAd paramAdMarvelAd)
  {
    this.e = new WeakReference(paramAdMarvelWebView);
    this.f = new WeakReference(paramActivity);
    this.a = paramInt1;
    this.b = paramInt2;
    this.g = paramAdMarvelAd;
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView;
    Activity localActivity;
    ViewGroup localViewGroup;
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    FrameLayout localFrameLayout1;
    FrameLayout.LayoutParams localLayoutParams1;
    RelativeLayout localRelativeLayout;
    FrameLayout.LayoutParams localLayoutParams2;
    int j;
    try
    {
      localAdMarvelWebView = (AdMarvelWebView)this.e.get();
      if (localAdMarvelWebView == null)
        return;
      localActivity = (Activity)this.f.get();
      if (localActivity == null)
        return;
      localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "INTERNAL");
      if ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()))
        return;
      localAdMarvelInternalWebView.isAdExpanding = true;
      localFrameLayout1 = new FrameLayout(localAdMarvelWebView.getContext());
      localFrameLayout1.setTag(localAdMarvelWebView.e + "EXPAND_BG");
      localFrameLayout1.setOnTouchListener(new View.OnTouchListener()
      {
        public boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          return true;
        }
      });
      localLayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
      localRelativeLayout = new RelativeLayout(localAdMarvelWebView.getContext());
      localRelativeLayout.setTag(localAdMarvelWebView.e + "EXPAND_LAYOUT");
      localLayoutParams2 = new FrameLayout.LayoutParams(this.a, this.b);
      if (this.c == 0)
        localLayoutParams2.gravity = 1;
      while (true)
      {
        localRelativeLayout.setGravity(1);
        localLayoutParams2.leftMargin = this.c;
        localLayoutParams2.topMargin = this.d;
        int i = localAdMarvelWebView.getChildCount();
        for (j = 0; (j < i) && (localAdMarvelWebView.getChildAt(j) != localAdMarvelInternalWebView); j++);
        if (ac.a() < 11)
          localLayoutParams2.gravity = 48;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return;
    }
    FrameLayout localFrameLayout2 = new FrameLayout(localAdMarvelWebView.getContext());
    localFrameLayout2.setTag(localAdMarvelWebView.e + "EXPAND_PLACE_HOLDER");
    localAdMarvelWebView.addView(localFrameLayout2, j, new RelativeLayout.LayoutParams(localAdMarvelInternalWebView.getWidth(), localAdMarvelInternalWebView.getHeight()));
    localAdMarvelWebView.removeView(localAdMarvelInternalWebView);
    if (localAdMarvelInternalWebView != null)
      localAdMarvelInternalWebView.a(this.c, this.d, this.a, this.b);
    localRelativeLayout.addView(localAdMarvelInternalWebView);
    AdMarvelWebView.b(localAdMarvelWebView, true);
    localFrameLayout1.addView(localRelativeLayout, localLayoutParams2);
    localViewGroup.addView(localFrameLayout1, localLayoutParams1);
    localRelativeLayout.bringToFront();
    if ((AdMarvelWebView.q(localAdMarvelWebView)) && (!AdMarvelWebView.r(localAdMarvelWebView)))
    {
      LinearLayout localLinearLayout = new LinearLayout(localAdMarvelWebView.getContext());
      localLinearLayout.setBackgroundColor(0);
      localLinearLayout.setTag(localAdMarvelWebView.e + "BTN_CLOSE");
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
      int k = localViewGroup.getMeasuredHeight();
      int m = localViewGroup.getMeasuredWidth();
      float f1 = TypedValue.applyDimension(1, 30.0F, localAdMarvelWebView.getContext().getResources().getDisplayMetrics());
      AdMarvelWebView.a(localLinearLayout, localLayoutParams, AdMarvelWebView.s(localAdMarvelWebView), this.c, this.d, this.a, this.b, m, k, (int)f1);
      localLinearLayout.addView(new AdMarvelWebView.i(localAdMarvelWebView.getContext(), localAdMarvelWebView));
      localRelativeLayout.addView(localLinearLayout);
      AdMarvelWebView.c(localAdMarvelWebView, true);
      AdMarvelWebView.a(localAdMarvelWebView, new AdMarvelWebView.y(localAdMarvelWebView, localActivity, 3));
      if (AdMarvelWebView.t(localAdMarvelWebView).canDetectOrientation())
        AdMarvelWebView.t(localAdMarvelWebView).enable();
    }
    localViewGroup.invalidate();
    localViewGroup.requestLayout();
    localAdMarvelWebView.a.set(true);
    localAdMarvelWebView.invalidate();
    localAdMarvelWebView.requestLayout();
    if (AdMarvelWebView.a(localAdMarvelWebView.e) != null)
      AdMarvelWebView.a(localAdMarvelWebView.e).a();
    localAdMarvelWebView.invalidate();
    localAdMarvelWebView.requestLayout();
    localAdMarvelInternalWebView.isAdExpanding = false;
    if (AdMarvelUtils.isLogDumpEnabled())
      new Handler().postDelayed(new AdMarvelWebView.m(this.g, localActivity), 1000L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.o
 * JD-Core Version:    0.6.2
 */