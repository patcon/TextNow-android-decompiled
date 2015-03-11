package com.admarvel.android.ads;

import android.content.Context;
import android.view.Display;
import android.view.WindowManager;
import java.lang.ref.WeakReference;

class m$q
  implements Runnable
{
  private static int a = -2147483648;
  private final WeakReference<m> b;

  public m$q(m paramm)
  {
    this.b = new WeakReference(paramm);
  }

  public int a()
  {
    return a;
  }

  public void run()
  {
    m localm = (m)this.b.get();
    if (localm == null);
    Context localContext;
    do
    {
      return;
      localContext = localm.getContext();
    }
    while (localContext == null);
    a = ((WindowManager)localContext.getSystemService("window")).getDefaultDisplay().getRotation();
    localm.u = a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.q
 * JD-Core Version:    0.6.2
 */