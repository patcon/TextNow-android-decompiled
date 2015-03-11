package com.admarvel.android.ads;

import java.lang.ref.WeakReference;

class m$ag
  implements Runnable
{
  private final WeakReference<m> a;
  private String b = null;

  public m$ag(String paramString, m paramm)
  {
    this.b = paramString;
    this.a = new WeakReference(paramm);
  }

  public void run()
  {
    m localm = (m)this.a.get();
    if (localm == null);
    d locald;
    int i;
    do
    {
      do
      {
        return;
        locald = (d)localm.findViewWithTag(localm.s + "INTERNAL");
      }
      while (locald == null);
      i = locald.getVisibility();
      if ((this.b.equals("show")) && (i != 0))
        locald.setVisibility(0);
    }
    while ((!this.b.equals("hide")) || (i != 0));
    locald.setVisibility(4);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.ag
 * JD-Core Version:    0.6.2
 */