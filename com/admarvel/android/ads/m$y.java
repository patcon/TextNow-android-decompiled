package com.admarvel.android.ads;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$y
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;

  public m$y(m paramm, d paramd)
  {
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramd);
  }

  @TargetApi(14)
  public void run()
  {
    while (true)
    {
      final a locala;
      try
      {
        final m localm = (m)this.a.get();
        final d locald = (d)this.b.get();
        if (localm == null)
          break;
        if (locald == null)
          return;
        locala = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
        if (locala == null)
          break;
        if (locala.getHeight() == 0)
        {
          new Handler(Looper.getMainLooper()).postDelayed(new Runnable()
          {
            public void run()
            {
              if ((locala.getHeight() == 0) && (localm.N != null) && (localm.N.length() > 0))
              {
                locald.e(localm.N + "()");
                return;
              }
              locala.f();
            }
          }
          , 500L);
          if ((localm.G == null) || (localm.G.length() <= 0))
            break;
          locald.e(localm.G + "()");
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      locala.f();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.y
 * JD-Core Version:    0.6.2
 */