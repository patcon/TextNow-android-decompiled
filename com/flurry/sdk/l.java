package com.flurry.sdk;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.flurry.android.FlurryAdSize;
import com.flurry.android.impl.ads.FlurryAdModule;

public final class l extends RelativeLayout
{
  private static final String a = l.class.getSimpleName();
  private final FlurryAdModule b;
  private final String c;
  private final ViewGroup d;
  private long e;
  private final Runnable f = new l.a(this, null);

  public l(FlurryAdModule paramFlurryAdModule, Context paramContext, String paramString, ViewGroup paramViewGroup)
  {
    super(paramContext);
    this.b = paramFlurryAdModule;
    this.c = paramString;
    this.d = paramViewGroup;
  }

  private boolean e()
  {
    if (FlurryAdModule.i())
      eo.a(3, a, "Device is locked: banner will NOT rotate for adSpace: " + getAdSpace());
    i locali;
    do
    {
      return false;
      if (this.b.g())
      {
        eo.a(3, a, "Ad fullscreen panel is opened: banner will NOT rotate for adSpace: " + getAdSpace());
        return false;
      }
      locali = getCurrentBannerView();
    }
    while ((locali == null) || (!locali.g()));
    return true;
  }

  private void f()
  {
    eo.a(3, a, "Rotating banner for adSpace: " + getAdSpace());
    this.b.d().a(getContext(), this.c, this.d, FlurryAdSize.BANNER_BOTTOM, true);
  }

  private void g()
  {
    try
    {
      if (e())
        f();
      do.a().b(this.f, getRotationRateInMilliseconds());
      return;
    }
    finally
    {
    }
  }

  private i getCurrentBannerView()
  {
    if (getChildCount() <= 0)
      return null;
    View localView = getChildAt(0);
    try
    {
      i locali = (i)localView;
      return locali;
    }
    catch (ClassCastException localClassCastException)
    {
    }
    return null;
  }

  public final void a()
  {
    try
    {
      c();
      this.e = 0L;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void a(long paramLong)
  {
    try
    {
      if (this.e != paramLong)
      {
        c();
        this.e = paramLong;
        b();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b()
  {
    try
    {
      if (getRotationRateInMilliseconds() != 0L)
      {
        c();
        eo.a(3, a, "schedule banner rotation for adSpace = " + getAdSpace() + " with fixed rate in milliseconds = " + getRotationRateInMilliseconds());
        do.a().b(this.f, getRotationRateInMilliseconds());
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void c()
  {
    try
    {
      do.a().d(this.f);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void d()
  {
    a();
    i locali = getCurrentBannerView();
    if (locali != null)
      locali.onDestroy();
  }

  public final String getAdSpace()
  {
    return this.c;
  }

  public final long getRotationRateInMilliseconds()
  {
    return this.e;
  }

  public final ViewGroup getViewGroup()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.l
 * JD-Core Version:    0.6.2
 */