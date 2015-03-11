package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.TypedValue;
import android.view.OrientationEventListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.lang.ref.WeakReference;

class AdMarvelWebView$y extends OrientationEventListener
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<Activity> b;
  private int c = -1;

  public AdMarvelWebView$y(AdMarvelWebView paramAdMarvelWebView, Activity paramActivity, int paramInt)
  {
    super(paramActivity, paramInt);
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramActivity);
  }

  public void onOrientationChanged(final int paramInt)
  {
    if (this.c == -1)
      this.c = paramInt;
    final AdMarvelWebView localAdMarvelWebView;
    do
    {
      do
        return;
      while ((Math.abs(paramInt - this.c) < 90) || (Math.abs(paramInt - this.c) > 270));
      localAdMarvelWebView = (AdMarvelWebView)this.a.get();
    }
    while (localAdMarvelWebView == null);
    AdMarvelWebView.d(localAdMarvelWebView).postDelayed(new Runnable()
    {
      public void run()
      {
        Activity localActivity = (Activity)AdMarvelWebView.y.a(AdMarvelWebView.y.this).get();
        if ((localActivity != null) && (AdMarvelWebView.f(localAdMarvelWebView)))
        {
          ViewGroup localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
          RelativeLayout localRelativeLayout = (RelativeLayout)localViewGroup.findViewWithTag(localAdMarvelWebView.e + "EXPAND_LAYOUT");
          if (localRelativeLayout == null);
          FrameLayout.LayoutParams localLayoutParams;
          LinearLayout localLinearLayout;
          do
          {
            return;
            localLayoutParams = (FrameLayout.LayoutParams)localRelativeLayout.getLayoutParams();
            localLinearLayout = (LinearLayout)localViewGroup.findViewWithTag(localAdMarvelWebView.e + "BTN_CLOSE");
          }
          while (localLinearLayout == null);
          RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localLinearLayout.getLayoutParams();
          int i = localViewGroup.getHeight();
          int j = localViewGroup.getWidth();
          float f = TypedValue.applyDimension(1, 30.0F, localAdMarvelWebView.getContext().getResources().getDisplayMetrics());
          AdMarvelWebView.a(localLinearLayout, localLayoutParams1, AdMarvelWebView.s(localAdMarvelWebView), localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.width, localLayoutParams.height, j, i, (int)f);
        }
        AdMarvelWebView.y.a(AdMarvelWebView.y.this, paramInt);
      }
    }
    , 500L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.y
 * JD-Core Version:    0.6.2
 */