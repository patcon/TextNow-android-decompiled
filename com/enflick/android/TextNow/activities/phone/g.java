package com.enflick.android.TextNow.activities.phone;

import android.os.Handler;
import android.os.SystemClock;

public final class g extends Handler
{
  private d a;
  private long b;
  private boolean c;
  private long d;
  private i e;
  private h f;

  public g(h paramh)
  {
    this.f = paramh;
    this.e = new i(this);
  }

  public final void a()
  {
    this.b = (SystemClock.uptimeMillis() - this.d);
  }

  public final void a(d paramd)
  {
    this.a = paramd;
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
        d locald = this.a;
        if (this.f != null)
        {
          long l3 = locald.t();
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.g
 * JD-Core Version:    0.6.2
 */