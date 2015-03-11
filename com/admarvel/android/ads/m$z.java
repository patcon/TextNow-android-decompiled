package com.admarvel.android.ads;

import android.annotation.TargetApi;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$z
  implements Runnable
{
  private final WeakReference<m> a;
  private final WeakReference<d> b;
  private int c;
  private int d;
  private int e;
  private int f;

  public m$z(m paramm, d paramd, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = new WeakReference(paramm);
    this.b = new WeakReference(paramd);
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramInt4;
  }

  @TargetApi(14)
  public void run()
  {
    while (true)
    {
      try
      {
        m localm = (m)this.a.get();
        d locald = (d)this.b.get();
        if (localm == null)
          break;
        if (locald == null)
          return;
        if (localm != null)
        {
          locala = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
          if (locala == null)
            break;
          locala.a(this.e, this.f, this.c, this.d);
          locala.i();
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      a locala = null;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.z
 * JD-Core Version:    0.6.2
 */