package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

class m$l
  implements Runnable
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private final WeakReference<m> e;
  private final WeakReference<Activity> f;

  public m$l(m paramm, Activity paramActivity, int paramInt1, int paramInt2)
  {
    this.e = new WeakReference(paramm);
    this.f = new WeakReference(paramActivity);
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public m$l(m paramm, Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e = new WeakReference(paramm);
    this.f = new WeakReference(paramActivity);
    this.a = paramInt3;
    this.b = paramInt4;
    this.c = paramInt1;
    this.d = paramInt2;
  }

  public void run()
  {
    m localm = (m)this.e.get();
    if (localm == null);
    ViewGroup localViewGroup;
    LinearLayout localLinearLayout;
    do
    {
      d locald;
      RelativeLayout localRelativeLayout;
      m.k localk;
      do
      {
        do
        {
          do
          {
            Activity localActivity;
            do
            {
              return;
              localActivity = (Activity)this.f.get();
            }
            while (localActivity == null);
            localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
            locald = (d)localViewGroup.findViewWithTag(localm.s + "INTERNAL");
          }
          while ((locald == null) || (locald.b()) || (!localm.x));
          localRelativeLayout = (RelativeLayout)localViewGroup.findViewWithTag(localm.s + "EXPAND_LAYOUT");
        }
        while (localRelativeLayout == null);
        localk = (m.k)localViewGroup.findViewWithTag(localm.s + "EXPAND_BG");
      }
      while (localk == null);
      localk.setFocusableInTouchMode(true);
      localk.requestFocus();
      FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localRelativeLayout.getLayoutParams();
      if (localLayoutParams != null)
      {
        localLayoutParams.width = this.a;
        localLayoutParams.height = this.b;
        localLayoutParams.leftMargin = this.c;
        localLayoutParams.topMargin = this.d;
        if (this.c != 0)
          localLayoutParams.gravity = 0;
      }
      locald.a(this.c, this.d, this.a, this.b);
      if (!localm.f)
        break;
      localLinearLayout = (LinearLayout)localViewGroup.findViewWithTag(localm.s + "BTN_CLOSE");
    }
    while (localLinearLayout == null);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    int i = localViewGroup.getMeasuredHeight();
    int j = localViewGroup.getMeasuredWidth();
    float f1 = TypedValue.applyDimension(1, 30.0F, localm.getContext().getResources().getDisplayMetrics());
    m.a(localLinearLayout, localLayoutParams1, localm.j, this.c, this.d, this.a, this.b, j, i, (int)f1);
    localLinearLayout.removeAllViews();
    localLinearLayout.addView(new m.h(localm.getContext(), localm));
    m.b(localm, true);
    localViewGroup.invalidate();
    localViewGroup.requestLayout();
    localm.a.set(true);
    localm.invalidate();
    localm.requestLayout();
    if (m.a(localm.s) != null)
      m.a(localm.s).a();
    localm.invalidate();
    localm.requestLayout();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.l
 * JD-Core Version:    0.6.2
 */