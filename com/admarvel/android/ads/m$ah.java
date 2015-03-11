package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class m$ah
  implements Runnable
{
  private final WeakReference<d> a;

  public m$ah(d paramd)
  {
    this.a = new WeakReference(paramd);
  }

  public void run()
  {
    d locald = (d)this.a.get();
    if (locald == null)
      return;
    locald.setLayerType(1, null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.ah
 * JD-Core Version:    0.6.2
 */