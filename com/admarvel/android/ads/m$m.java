package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class m$m
  implements Runnable
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private final WeakReference<m> e;
  private final WeakReference<Activity> f;
  private final AdMarvelAd g;

  public m$m(m paramm, Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, int paramInt4, AdMarvelAd paramAdMarvelAd)
  {
    this.e = new WeakReference(paramm);
    this.f = new WeakReference(paramActivity);
    this.a = paramInt3;
    this.b = paramInt4;
    this.c = paramInt1;
    this.d = paramInt2;
    this.g = paramAdMarvelAd;
  }

  public m$m(m paramm, Activity paramActivity, int paramInt1, int paramInt2, AdMarvelAd paramAdMarvelAd)
  {
    this.e = new WeakReference(paramm);
    this.f = new WeakReference(paramActivity);
    this.a = paramInt1;
    this.b = paramInt2;
    this.g = paramAdMarvelAd;
  }

  public void run()
  {
    final m localm;
    Activity localActivity;
    ViewGroup localViewGroup;
    d locald;
    m.k localk;
    FrameLayout.LayoutParams localLayoutParams1;
    RelativeLayout localRelativeLayout;
    FrameLayout.LayoutParams localLayoutParams2;
    int j;
    try
    {
      localm = (m)this.e.get();
      if (localm == null)
        return;
      localActivity = (Activity)this.f.get();
      if (localActivity == null)
        return;
      localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
      locald = (d)localm.findViewWithTag(localm.s + "INTERNAL");
      if ((locald == null) || (locald.b()))
        return;
      locald.f = true;
      localk = new m.k(localActivity, this.g.isHoverAd(), this.g.isAppInteractionAllowedForExpandableAds());
      localk.setTag(localm.s + "EXPAND_BG");
      localk.setFocusableInTouchMode(true);
      localk.requestFocus();
      localk.setOnKeyListener(new View.OnKeyListener()
      {
        public boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
        {
          if ((paramAnonymousKeyEvent.getAction() == 0) && (paramAnonymousInt == 4))
          {
            localm.e();
            return true;
          }
          return false;
        }
      });
      localLayoutParams1 = new FrameLayout.LayoutParams(-1, -1);
      localRelativeLayout = new RelativeLayout(localm.getContext());
      localRelativeLayout.setTag(localm.s + "EXPAND_LAYOUT");
      localLayoutParams2 = new FrameLayout.LayoutParams(this.a, this.b);
      if (this.c == 0)
        localLayoutParams2.gravity = 1;
      while (true)
      {
        localRelativeLayout.setGravity(1);
        localLayoutParams2.leftMargin = this.c;
        localLayoutParams2.topMargin = this.d;
        int i = localm.getChildCount();
        for (j = 0; (j < i) && (localm.getChildAt(j) != locald); j++);
        if (Version.getAndroidSDKVersion() < 11)
          localLayoutParams2.gravity = 48;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return;
    }
    FrameLayout localFrameLayout = new FrameLayout(localm.getContext());
    localFrameLayout.setTag(localm.s + "EXPAND_PLACE_HOLDER");
    localm.addView(localFrameLayout, j, new RelativeLayout.LayoutParams(locald.getWidth(), locald.getHeight()));
    localm.removeView(locald);
    if (locald != null)
      locald.a(this.c, this.d, this.a, this.b);
    localRelativeLayout.addView(locald);
    localm.x = true;
    localk.addView(localRelativeLayout, localLayoutParams2);
    localViewGroup.addView(localk, localLayoutParams1);
    localRelativeLayout.bringToFront();
    if ((localm.g) && (!m.i(localm)))
    {
      LinearLayout localLinearLayout = new LinearLayout(localm.getContext());
      localLinearLayout.setBackgroundColor(0);
      localLinearLayout.setTag(localm.s + "BTN_CLOSE");
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(r.a(50.0F, localm.getContext()), r.a(50.0F, localm.getContext()));
      int k = localViewGroup.getMeasuredHeight();
      int m = localViewGroup.getMeasuredWidth();
      float f1 = TypedValue.applyDimension(1, 30.0F, localm.getContext().getResources().getDisplayMetrics());
      m.a(localLinearLayout, localLayoutParams, localm.j, this.c, this.d, this.a, this.b, m, k, (int)f1);
      localLinearLayout.addView(new m.h(localm.getContext(), localm));
      localRelativeLayout.addView(localLinearLayout);
      localm.f = true;
      localm.k = new m.w(localm, localActivity, 3);
      if (localm.k.canDetectOrientation())
        localm.k.enable();
    }
    localViewGroup.invalidate();
    localViewGroup.requestLayout();
    localm.a.set(true);
    localm.invalidate();
    localm.requestLayout();
    if (m.a(localm.s) != null)
      m.a(localm.s).a();
    localm.invalidate();
    localm.requestLayout();
    locald.f = false;
    if (AdMarvelUtils.isLogDumpEnabled())
      new Handler().postDelayed(new m.j(this.g, localActivity), 1000L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.m
 * JD-Core Version:    0.6.2
 */