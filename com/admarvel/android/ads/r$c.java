package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class r$c
  implements Runnable
{
  private final WeakReference<d> a;
  private final String b;

  public r$c(d paramd, String paramString)
  {
    this.a = new WeakReference(paramd);
    this.b = paramString;
  }

  public void run()
  {
    d locald;
    try
    {
      locald = (d)this.a.get();
      if (locald == null)
        return;
      if (r.f(locald.getContext()))
      {
        locald.e(this.b + "(\"YES\")");
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    locald.e(this.b + "(\"NO\")");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r.c
 * JD-Core Version:    0.6.2
 */