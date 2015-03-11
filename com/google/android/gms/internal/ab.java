package com.google.android.gms.internal;

import java.lang.ref.WeakReference;

@ez
public class ab
{
  private final ab.a mj;
  private final Runnable mk;
  private av ml;
  private boolean mm = false;
  private boolean mn = false;
  private long mo = 0L;

  public ab(u paramu)
  {
    this(paramu, new ab.a(gr.wC));
  }

  ab(final u paramu, ab.a parama)
  {
    this.mj = parama;
    this.mk = new Runnable()
    {
      private final WeakReference<u> mp = new WeakReference(paramu);

      public void run()
      {
        ab.a(ab.this, false);
        u localu = (u)this.mp.get();
        if (localu != null)
          localu.b(ab.a(ab.this));
      }
    };
  }

  public void a(av paramav, long paramLong)
  {
    if (this.mm)
      gs.W("An ad refresh is already scheduled.");
    do
    {
      return;
      this.ml = paramav;
      this.mm = true;
      this.mo = paramLong;
    }
    while (this.mn);
    gs.U("Scheduling ad refresh " + paramLong + " milliseconds from now.");
    this.mj.postDelayed(this.mk, paramLong);
  }

  public boolean ay()
  {
    return this.mm;
  }

  public void c(av paramav)
  {
    a(paramav, 60000L);
  }

  public void cancel()
  {
    this.mm = false;
    this.mj.removeCallbacks(this.mk);
  }

  public void pause()
  {
    this.mn = true;
    if (this.mm)
      this.mj.removeCallbacks(this.mk);
  }

  public void resume()
  {
    this.mn = false;
    if (this.mm)
    {
      this.mm = false;
      a(this.ml, this.mo);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ab
 * JD-Core Version:    0.6.2
 */