package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class m$d
  implements b, i
{
  private final WeakReference<m> a;

  public m$d(m paramm)
  {
    this.a = new WeakReference(paramm);
  }

  public void a()
  {
    m localm = (m)this.a.get();
    if (localm == null);
    d locald;
    do
    {
      do
      {
        return;
        locald = (d)localm.findViewWithTag(localm.s + "INTERNAL");
      }
      while (locald == null);
      localm.y = false;
      localm.n = false;
      if (m.a(localm.s) != null)
        m.a(localm.s).b();
    }
    while (localm.l == null);
    locald.e(localm.l + "()");
  }

  public void a(String paramString)
  {
    m localm = (m)this.a.get();
    if (localm == null);
    d locald;
    do
    {
      return;
      locald = (d)localm.findViewWithTag(paramString + "INTERNAL");
    }
    while ((locald == null) || (locald.u == null) || (locald.u.length() <= 0));
    locald.e(locald.u + "()");
  }

  public void b()
  {
    this.a.clear();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.d
 * JD-Core Version:    0.6.2
 */