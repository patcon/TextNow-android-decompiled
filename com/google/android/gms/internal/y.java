package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

public final class y
{
  private final y.a lf;
  private final Runnable lg;
  private ai lh;
  private boolean li = false;
  private boolean lj = false;
  private long lk = 0L;

  public y(u paramu)
  {
    this(paramu, new y.a(et.sv));
  }

  y(final u paramu, y.a parama)
  {
    this.lf = parama;
    this.lg = new Runnable()
    {
      private final WeakReference<u> ll = new WeakReference(paramu);

      public void run()
      {
        y.a(y.this, false);
        u localu = (u)this.ll.get();
        if (localu != null)
          localu.b(y.a(y.this));
      }
    };
  }

  public final void a(ai paramai, long paramLong)
  {
    if (this.li)
      eu.D("An ad refresh is already scheduled.");
    do
    {
      return;
      this.lh = paramai;
      this.li = true;
      this.lk = paramLong;
    }
    while (this.lj);
    eu.B("Scheduling ad refresh " + paramLong + " milliseconds from now.");
    this.lf.postDelayed(this.lg, paramLong);
  }

  public final void cancel()
  {
    this.li = false;
    this.lf.removeCallbacks(this.lg);
  }

  public final void d(ai paramai)
  {
    a(paramai, 60000L);
  }

  public final void pause()
  {
    this.lj = true;
    if (this.li)
      this.lf.removeCallbacks(this.lg);
  }

  public final void resume()
  {
    this.lj = false;
    if (this.li)
    {
      this.li = false;
      a(this.lh, this.lk);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.y
 * JD-Core Version:    0.6.2
 */