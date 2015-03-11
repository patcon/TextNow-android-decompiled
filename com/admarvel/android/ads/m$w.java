package com.admarvel.android.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.OrientationEventListener;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.lang.ref.WeakReference;

class m$w extends OrientationEventListener
{
  private final WeakReference<m> a;
  private final WeakReference<Activity> b;
  private int c = -1;

  public m$w(m paramm, Activity paramActivity, int paramInt)
  {
    super(paramActivity, paramInt);
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramActivity);
  }

  public void onOrientationChanged(final int paramInt)
  {
    if (this.c == -1)
      this.c = paramInt;
    final m localm;
    do
    {
      do
        return;
      while ((Math.abs(paramInt - this.c) < 90) || (Math.abs(paramInt - this.c) > 270));
      localm = (m)this.a.get();
    }
    while (localm == null);
    new Handler(Looper.getMainLooper()).postDelayed(new Runnable()
    {
      public void run()
      {
        Activity localActivity = (Activity)m.w.a(m.w.this).get();
        if ((localActivity != null) && (localm.x))
        {
          ViewGroup localViewGroup = (ViewGroup)localActivity.getWindow().findViewById(16908290);
          RelativeLayout localRelativeLayout = (RelativeLayout)localViewGroup.findViewWithTag(localm.s + "EXPAND_LAYOUT");
          if (localRelativeLayout == null);
          FrameLayout.LayoutParams localLayoutParams;
          LinearLayout localLinearLayout;
          do
          {
            return;
            localLayoutParams = (FrameLayout.LayoutParams)localRelativeLayout.getLayoutParams();
            localLinearLayout = (LinearLayout)localViewGroup.findViewWithTag(localm.s + "BTN_CLOSE");
          }
          while (localLinearLayout == null);
          RelativeLayout.LayoutParams localLayoutParams1 = (RelativeLayout.LayoutParams)localLinearLayout.getLayoutParams();
          int i = localViewGroup.getHeight();
          int j = localViewGroup.getWidth();
          float f = TypedValue.applyDimension(1, 30.0F, localm.getContext().getResources().getDisplayMetrics());
          m.a(localLinearLayout, localLayoutParams1, localm.j, localLayoutParams.leftMargin, localLayoutParams.topMargin, localLayoutParams.width, localLayoutParams.height, j, i, (int)f);
        }
        m.w.a(m.w.this, paramInt);
      }
    }
    , 500L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.w
 * JD-Core Version:    0.6.2
 */