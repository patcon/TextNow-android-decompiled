package com.enflick.android.TextNow.activities.phone;

import android.os.Looper;

final class w
  implements Runnable
{
  private final Object b = new Object();
  private Looper c;

  w(u paramu, String paramString)
  {
    new Thread(null, this, paramString).start();
    synchronized (this.b)
    {
      while (true)
      {
        Looper localLooper = this.c;
        if (localLooper != null)
          break;
        try
        {
          this.b.wait();
        }
        catch (InterruptedException localInterruptedException)
        {
        }
      }
      return;
    }
  }

  public final Looper a()
  {
    return this.c;
  }

  public final void run()
  {
    synchronized (this.b)
    {
      Looper.prepare();
      this.c = Looper.myLooper();
      this.b.notifyAll();
      Looper.loop();
      return;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.w
 * JD-Core Version:    0.6.2
 */