package com.handmark.pulltorefresh.library;

import android.view.animation.Interpolator;

final class l
  implements Runnable
{
  private final Interpolator b;
  private final int c;
  private final int d;
  private final long e;
  private j f;
  private boolean g = true;
  private long h = -1L;
  private int i = -1;

  public l(PullToRefreshBase paramPullToRefreshBase, int paramInt1, int paramInt2, long paramLong, j paramj)
  {
    this.d = paramInt1;
    this.c = paramInt2;
    this.b = PullToRefreshBase.b(paramPullToRefreshBase);
    this.e = paramLong;
    this.f = paramj;
  }

  public final void a()
  {
    this.g = false;
    this.a.removeCallbacks(this);
  }

  public final void run()
  {
    if (this.h == -1L)
    {
      this.h = System.currentTimeMillis();
      if ((!this.g) || (this.c == this.i))
        break label130;
      this.a.postDelayed(this, 16L);
    }
    label130: 
    while (this.f == null)
    {
      return;
      long l = Math.max(Math.min(1000L * (System.currentTimeMillis() - this.h) / this.e, 1000L), 0L);
      int j = Math.round((this.d - this.c) * this.b.getInterpolation((float)l / 1000.0F));
      this.i = (this.d - j);
      this.a.a(this.i);
      break;
    }
    this.f.a();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.handmark.pulltorefresh.library.l
 * JD-Core Version:    0.6.2
 */