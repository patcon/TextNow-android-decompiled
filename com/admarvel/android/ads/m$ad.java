package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$ad
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;

  public m$ad(m paramm, d paramd)
  {
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramd);
  }

  public void run()
  {
    try
    {
      m localm = (m)this.a.get();
      d locald = (d)this.b.get();
      if (localm != null)
      {
        if (locald == null)
          return;
        a locala = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
        if ((locala != null) && (locala.isPlaying()))
        {
          locala.c();
          if ((localm.M != null) && (localm.M.length() > 0))
          {
            locald.e(localm.M + "()");
            return;
          }
        }
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.ad
 * JD-Core Version:    0.6.2
 */