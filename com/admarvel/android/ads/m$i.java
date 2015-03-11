package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class m$i
  implements Runnable
{
  private final WeakReference<m> a;

  public m$i(m paramm)
  {
    this.a = new WeakReference(paramm);
  }

  public void run()
  {
    m localm = (m)this.a.get();
    if (localm != null)
      localm.e();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.i
 * JD-Core Version:    0.6.2
 */