package com.google.android.gms.internal;

import android.os.Handler;
import java.lang.ref.WeakReference;

final class do$a
{
  private final Runnable mk;
  private volatile boolean sc = false;

  public do$a(final do paramdo)
  {
    this.mk = new Runnable()
    {
      private final WeakReference<do> sd = new WeakReference(paramdo);

      public void run()
      {
        do localdo = (do)this.sd.get();
        if ((!do.a.a(do.a.this)) && (localdo != null))
        {
          localdo.ci();
          do.a.this.cj();
        }
      }
    };
  }

  public final void cancel()
  {
    this.sc = true;
    gr.wC.removeCallbacks(this.mk);
  }

  public final void cj()
  {
    gr.wC.postDelayed(this.mk, 250L);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.do.a
 * JD-Core Version:    0.6.2
 */