package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$ab
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;
  private float c;

  public m$ab(m paramm, d paramd, float paramFloat)
  {
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramd);
    this.c = paramFloat;
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
        if (locala != null)
        {
          locala.seekTo((int)(1000.0F * this.c));
          return;
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
 * Qualified Name:     com.admarvel.android.ads.m.ab
 * JD-Core Version:    0.6.2
 */