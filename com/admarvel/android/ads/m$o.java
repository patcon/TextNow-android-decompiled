package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$o
  implements Runnable
{
  private final WeakReference<m> a;

  public m$o(m paramm)
  {
    this.a = new WeakReference(paramm);
  }

  public void run()
  {
    try
    {
      m localm = (m)this.a.get();
      if (localm == null)
        return;
      a locala = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
      if (locala != null)
      {
        locala.c();
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.o
 * JD-Core Version:    0.6.2
 */