package com.admarvel.android.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$aa
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;

  public m$aa(m paramm, d paramd)
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
        if (localm.O == null)
        {
          localm.O = new m.ae(localm, locald);
          new Handler(Looper.getMainLooper()).postDelayed(localm.O, 500L);
        }
        a locala = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
        if ((locala != null) && (!locala.isPlaying()))
        {
          locala.g();
          if ((localm.L != null) && (localm.L.length() > 0))
          {
            locald.e(localm.L + "()");
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
 * Qualified Name:     com.admarvel.android.ads.m.aa
 * JD-Core Version:    0.6.2
 */