package com.admarvel.android.ads;

import android.os.Handler;
import com.admarvel.android.util.a.b;
import java.lang.ref.WeakReference;

class m$p
  implements Runnable
{
  private final WeakReference<d> a;
  private final WeakReference<m> b;
  private final String c;

  public m$p(d paramd, m paramm, String paramString)
  {
    this.a = new WeakReference(paramd);
    this.b = new WeakReference(paramm);
    this.c = paramString;
  }

  public void run()
  {
    if ((d)this.a.get() == null);
    m localm;
    do
    {
      return;
      localm = (m)this.b.get();
    }
    while ((localm == null) || (this.c == null) || (this.c.length() == 0));
    if (AdMarvelView.a)
      try
      {
        new b().a(this.c, localm.getContext(), new Handler());
        return;
      }
      catch (Exception localException)
      {
        return;
      }
    new r(localm.getContext()).b(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.p
 * JD-Core Version:    0.6.2
 */