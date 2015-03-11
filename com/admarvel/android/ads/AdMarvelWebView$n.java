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

class AdMarvelWebView$n
  implements Runnable
{
  private int a = 0;
  private int b = 0;
  private int c = 0;
  private int d = 0;
  private final WeakReference<AdMarvelWebView> e;
  private final WeakReference<Activity> f;

  public AdMarvelWebView$n(AdMarvelWebView paramAdMarvelWebView, Activity paramActivity, int paramInt1, int paramInt2)
  {
    this.e = new WeakReference(paramAdMarvelWebView);
    this.f = new WeakReference(paramActivity);
    this.a = paramInt1;
    this.b = paramInt2;
  }

  public AdMarvelWebView$n(AdMarvelWebView paramAdMarvelWebView, Activity paramActivity, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.e = new WeakReference(paramAdMarvelWebView);
    this.f = new WeakReference(paramActivity);
    this.a = paramInt3;
    this.b = paramInt4;
    this.c = paramInt1;
    this.d = paramInt2;
  }

  public void run()
  {
    AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.e.get();
    if (localAdMarvelWebView == null);
    ViewGroup localViewGroup;
    LinearLayout localLinearLayout;
    do
    {
      AdMarvelInternalWebView localAdMarvelInternalWebView;
      RelativeLayout localRelativeLayout;
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
          localAdMarvelInternalWebView = (AdMarvelInternalWebView)localViewGroup.findViewWithTag(localAdMarvelWebView.e + "INTERNAL");
        }
        while ((localAdMarvelInternalWebView == null) || (localAdMarvelInternalWebView.isSignalShutdown()) || (!AdMarvelWebView.f(localAdMarvelWebView)));
        localRelativeLayout = (RelativeLayout)localViewGroup.findViewWithTag(localAdMarvelWebView.e + "EXPAND_LAYOUT");
      }
      while (localRelativeLayout == null);
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
      localAdMarvelInternalWebView.a(this.c, this.d, this.a, this.b);
      if (!AdMarvelWebView.u(localAdMarvelWebView))
        break;
      localLinearLayout = (LinearLayout)localViewGroup.findViewWithTag(localAdMarvelWebView.e + "BTN_CLOSE");
    }
    while (localLinearLayout == null);
    RelativeLayout.LayoutParams localLayoutParams1 = new RelativeLayout.LayoutParams(-2, -2);
    int i = localViewGroup.getMeasuredHeight();
    int j = localViewGroup.getMeasuredWidth();
    float f1 = TypedValue.applyDimension(1, 30.0F, localAdMarvelWebView.getContext().getResources().getDisplayMetrics());
    AdMarvelWebView.a(localLinearLayout, localLayoutParams1, AdMarvelWebView.s(localAdMarvelWebView), this.c, this.d, this.a, this.b, j, i, (int)f1);
    localLinearLayout.removeAllViews();
    localLinearLayout.addView(new AdMarvelWebView.i(localAdMarvelWebView.getContext(), localAdMarvelWebView));
    AdMarvelWebView.d(localAdMarvelWebView, true);
    localViewGroup.invalidate();
    localViewGroup.requestLayout();
    localAdMarvelWebView.a.set(true);
    localAdMarvelWebView.invalidate();
    localAdMarvelWebView.requestLayout();
    if (AdMarvelWebView.a(localAdMarvelWebView.e) != null)
      AdMarvelWebView.a(localAdMarvelWebView.e).a();
    localAdMarvelWebView.invalidate();
    localAdMarvelWebView.requestLayout();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.n
 * JD-Core Version:    0.6.2
 */