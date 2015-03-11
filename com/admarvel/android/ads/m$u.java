package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$u
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;
  private String c;

  public m$u(String paramString, m paramm, d paramd)
  {
    this.c = paramString;
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramd);
  }

  public void run()
  {
    try
    {
      m localm = (m)this.a.get();
      d locald = (d)this.b.get();
      if ((localm != null) && (locald != null) && (this.c != null))
      {
        if (this.c.length() <= 0)
          return;
        a locala = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
        if (locala != null)
        {
          locala.e(this.c);
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
 * Qualified Name:     com.admarvel.android.ads.m.u
 * JD-Core Version:    0.6.2
 */