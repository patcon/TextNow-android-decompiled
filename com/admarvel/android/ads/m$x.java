package com.admarvel.android.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$x
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;

  public m$x(m paramm, d paramd)
  {
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramd);
  }

  public void run()
  {
    while (true)
    {
      a locala;
      try
      {
        m localm = (m)this.a.get();
        d locald = (d)this.b.get();
        if (localm == null)
          break;
        if (locald == null)
          return;
        if (localm.O != null)
        {
          new Handler(Looper.getMainLooper()).removeCallbacks(localm.O);
          localm.O = null;
        }
        locala = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
        if (locala == null)
          break;
        if (locala.isPlaying())
        {
          locala.pause();
          if ((localm.K == null) || (localm.K.length() <= 0))
            break;
          locald.e(localm.K + "()");
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      locala.c();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.x
 * JD-Core Version:    0.6.2
 */