package com.google.android.gms.internal;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

class iq$a
  implements Runnable
{
  private iq$a(iq paramiq)
  {
  }

  public void run()
  {
    boolean bool1 = false;
    iq.a(this.Hu, false);
    long l = SystemClock.elapsedRealtime();
    Iterator localIterator1 = iq.a(this.Hu).iterator();
    while (localIterator1.hasNext())
      ((it)localIterator1.next()).e(l, 2102);
    while (true)
    {
      synchronized (it.Hz)
      {
        Iterator localIterator2 = iq.a(this.Hu).iterator();
        if (localIterator2.hasNext())
        {
          if (((it)localIterator2.next()).fV())
          {
            bool2 = true;
            break label137;
          }
        }
        else
        {
          iq.b(this.Hu, bool1);
          return;
        }
      }
      boolean bool2 = bool1;
      label137: bool1 = bool2;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iq.a
 * JD-Core Version:    0.6.2
 */