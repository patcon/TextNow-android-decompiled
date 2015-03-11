package com.admarvel.android.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

class d$n
  implements Runnable
{
  private WeakReference<d> a;
  private WeakReference<m> b;
  private long c = 500L;

  public d$n(d paramd, Context paramContext, m paramm)
  {
    this.a = new WeakReference(paramd);
    this.b = new WeakReference(paramm);
  }

  public void run()
  {
    m localm = (m)this.b.get();
    d locald = (d)this.a.get();
    if ((locald == null) || (localm == null))
      break label30;
    label30: label289: label293: 
    while (true)
    {
      return;
      if ((!d.a(locald)) && (!d.n(locald)) && (!Thread.currentThread().isInterrupted()))
      {
        int[] arrayOfInt = { -1, -1 };
        locald.getLocationInWindow(arrayOfInt);
        int i;
        label86: int j;
        label103: int k;
        if (locald.getHeight() > 0)
        {
          i = locald.getHeight() / 2;
          if (locald.getHeight() <= 0)
            break label224;
          j = 2 * (locald.getHeight() / 3);
          if ((localm.v == -2147483648) || (localm.v <= 0))
            break label230;
          k = localm.v;
          label125: if ((i + (arrayOfInt[1] - k) < 0) || (j + arrayOfInt[1] >= r.h(localm.getContext())))
            break label289;
        }
        for (int m = 1; ; m = 0)
        {
          if (Thread.currentThread().isInterrupted())
            break label293;
          if ((m != 0) && (!locald.k))
          {
            locald.e(locald.j + "(" + true + ")");
            locald.k = true;
            return;
            i = 0;
            break label86;
            label224: j = 0;
            break label103;
            label230: k = 0;
            break label125;
          }
          if ((m != 0) || (!locald.k))
            break;
          locald.e(locald.j + "(" + false + ")");
          locald.k = false;
          return;
        }
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.d.n
 * JD-Core Version:    0.6.2
 */