package com.google.android.gms.internal;

import android.os.SystemClock;
import java.util.Iterator;
import java.util.List;

class go$a
  implements Runnable
{
  private go$a(go paramgo)
  {
  }

  public void run()
  {
    boolean bool1 = false;
    go.a(this.CI, false);
    long l = SystemClock.elapsedRealtime();
    Iterator localIterator1 = go.a(this.CI).iterator();
    while (localIterator1.hasNext())
      ((gr)localIterator1.next()).d(l, 3);
    while (true)
    {
      synchronized (gr.CN)
      {
        Iterator localIterator2 = go.a(this.CI).iterator();
        if (localIterator2.hasNext())
        {
          if (((gr)localIterator2.next()).ev())
          {
            bool2 = true;
            break label135;
          }
        }
        else
        {
          go.b(this.CI, bool1);
          return;
        }
      }
      boolean bool2 = bool1;
      label135: bool1 = bool2;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.go.a
 * JD-Core Version:    0.6.2
 */