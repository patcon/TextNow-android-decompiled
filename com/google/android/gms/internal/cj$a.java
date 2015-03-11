package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

final class cj$a
{
  private final Runnable lg;
  private volatile boolean oN = false;

  public cj$a(final cj paramcj)
  {
    this.lg = new Runnable()
    {
      private final WeakReference<cj> oO = new WeakReference(paramcj);

      public void run()
      {
        cj localcj = (cj)this.oO.get();
        if ((!cj.a.a(cj.a.this)) && (localcj != null))
        {
          localcj.bb();
          cj.a.this.bc();
        }
      }
    };
  }

  public final void bc()
  {
    et.sv.postDelayed(this.lg, 250L);
  }

  public final void cancel()
  {
    this.oN = true;
    et.sv.removeCallbacks(this.lg);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.cj.a
 * JD-Core Version:    0.6.2
 */