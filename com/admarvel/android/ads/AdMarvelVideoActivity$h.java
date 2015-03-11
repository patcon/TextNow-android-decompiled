package com.admarvel.android.ads;

import android.os.Handler;

class AdMarvelVideoActivity$h
{
  private Handler a;
  private Runnable b;
  private int c;
  private boolean d = false;
  private boolean e = false;
  private Runnable f = new Runnable()
  {
    public void run()
    {
      if (!AdMarvelVideoActivity.h.a(AdMarvelVideoActivity.h.this))
        return;
      AdMarvelVideoActivity.h.c(AdMarvelVideoActivity.h.this).post(AdMarvelVideoActivity.h.b(AdMarvelVideoActivity.h.this));
      if (AdMarvelVideoActivity.h.d(AdMarvelVideoActivity.h.this))
      {
        AdMarvelVideoActivity.h.a(AdMarvelVideoActivity.h.this, false);
        return;
      }
      AdMarvelVideoActivity.h.c(AdMarvelVideoActivity.h.this).postDelayed(AdMarvelVideoActivity.h.e(AdMarvelVideoActivity.h.this), AdMarvelVideoActivity.h.f(AdMarvelVideoActivity.h.this));
    }
  };

  public AdMarvelVideoActivity$h(Handler paramHandler, Runnable paramRunnable, int paramInt)
  {
    this.a = paramHandler;
    this.b = paramRunnable;
    this.c = paramInt;
  }

  public AdMarvelVideoActivity$h(Handler paramHandler, Runnable paramRunnable, int paramInt, boolean paramBoolean)
  {
    this(paramHandler, paramRunnable, paramInt);
    this.e = paramBoolean;
  }

  public void a()
  {
    if (this.d);
    while (this.c <= 0)
      return;
    this.d = true;
    this.a.postDelayed(this.f, this.c);
  }

  public void b()
  {
    if (!this.d)
      return;
    this.d = false;
    this.a.removeCallbacks(this.b);
    this.a.removeCallbacks(this.f);
  }

  public boolean c()
  {
    return this.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.h
 * JD-Core Version:    0.6.2
 */