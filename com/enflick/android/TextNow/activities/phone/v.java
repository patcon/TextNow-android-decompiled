package com.enflick.android.TextNow.activities.phone;

import android.os.SystemClock;
import android.os.Vibrator;

final class v extends Thread
{
  private v(u paramu)
  {
  }

  public final void run()
  {
    while (this.a.c)
    {
      this.a.b.vibrate(1000L);
      SystemClock.sleep(2000L);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.activities.phone.v
 * JD-Core Version:    0.6.2
 */