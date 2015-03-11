package com.admarvel.android.ads;

import android.os.Handler;

class AdMarvelVideoActivity$i
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
      if (!AdMarvelVideoActivity.i.a(AdMarvelVideoActivity.i.this))
        return;
      AdMarvelVideoActivity.i.c(AdMarvelVideoActivity.i.this).post(AdMarvelVideoActivity.i.b(AdMarvelVideoActivity.i.this));
      if (AdMarvelVideoActivity.i.d(AdMarvelVideoActivity.i.this))
      {
        AdMarvelVideoActivity.i.a(AdMarvelVideoActivity.i.this, false);
        return;
      }
      AdMarvelVideoActivity.i.c(AdMarvelVideoActivity.i.this).postDelayed(AdMarvelVideoActivity.i.e(AdMarvelVideoActivity.i.this), AdMarvelVideoActivity.i.f(AdMarvelVideoActivity.i.this));
    }
  };

  public AdMarvelVideoActivity$i(Handler paramHandler, Runnable paramRunnable, int paramInt)
  {
    this.a = paramHandler;
    this.b = paramRunnable;
    this.c = paramInt;
  }

  public AdMarvelVideoActivity$i(Handler paramHandler, Runnable paramRunnable, int paramInt, boolean paramBoolean)
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelVideoActivity.i
 * JD-Core Version:    0.6.2
 */