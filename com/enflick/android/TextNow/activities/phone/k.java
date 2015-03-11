package com.enflick.android.TextNow.activities.phone;

import android.os.Handler;
import android.os.SystemClock;

public final class k extends Handler
{
  private h a;
  private long b;
  private boolean c;
  private long d;
  private m e;
  private l f;

  public k(l paraml)
  {
    this.f = paraml;
    this.e = new m(this);
  }

  public final void a()
  {
    this.b = (SystemClock.uptimeMillis() - this.d);
  }

  public final void a(h paramh)
  {
    this.a = paramh;
    this.d = 1000L;
  }

  public final void b()
  {
    if (!this.c)
    {
      this.c = true;
      long l1 = SystemClock.uptimeMillis();
      for (long l2 = this.b + this.d; l1 >= l2; l2 += this.d);
      new StringBuilder().append("periodicUpdateTimer() @ ").append(l2).toString();
      postAtTime(this.e, l2);
      this.b = l2;
      if (this.a != null)
      {
        h localh = this.a;
        if (this.f != null)
        {
          long l3 = localh.t();
          new StringBuilder().append("updateElapsedTime, duration=").append(l3).toString();
          this.f.a(l3 / 1000L);
        }
      }
    }
  }

  public final void c()
  {
    removeCallbacks(this.e);
    this.c = false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.k
 * JD-Core Version:    0.6.2
 */