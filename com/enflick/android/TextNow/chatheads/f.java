package com.enflick.android.TextNow.chatheads;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;

public final class f
{
  private WindowManager a;
  private Context b;

  f(Context paramContext)
  {
    this.b = paramContext;
    this.a = ((WindowManager)this.b.getSystemService("window"));
  }

  public final DisplayMetrics a()
  {
    DisplayMetrics localDisplayMetrics = new DisplayMetrics();
    this.a.getDefaultDisplay().getMetrics(localDisplayMetrics);
    return localDisplayMetrics;
  }

  public final void a(View paramView)
  {
    try
    {
      this.a.removeView(paramView);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public final void a(View paramView, WindowManager.LayoutParams paramLayoutParams)
  {
    try
    {
      this.a.addView(paramView, paramLayoutParams);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }

  public final void b(View paramView, WindowManager.LayoutParams paramLayoutParams)
  {
    try
    {
      this.a.updateViewLayout(paramView, paramLayoutParams);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.chatheads.f
 * JD-Core Version:    0.6.2
 */