package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class m$ac
  implements Runnable
{
  private final WeakReference<m> a;

  public m$ac(m paramm)
  {
    this.a = new WeakReference(paramm);
  }

  public void run()
  {
    m localm = (m)this.a.get();
    if (localm == null)
      return;
    localm.setBackgroundColor(localm.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.ac
 * JD-Core Version:    0.6.2
 */