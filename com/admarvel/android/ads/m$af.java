package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$af
  implements Runnable
{
  private final WeakReference<m> a;
  private String b;

  public m$af(m paramm, String paramString)
  {
    this.a = new WeakReference(paramm);
    this.b = paramString;
  }

  public void run()
  {
    a locala;
    try
    {
      m localm = (m)this.a.get();
      if (localm == null)
        return;
      locala = (a)localm.findViewWithTag(localm.s + "EMBEDDED_VIDEO");
      if ((locala == null) || (this.b == null) || (this.b.trim().length() <= 0))
        return;
      if (this.b.equalsIgnoreCase("mute"))
      {
        locala.d();
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    if (this.b.equalsIgnoreCase("unmute"))
      locala.e();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.af
 * JD-Core Version:    0.6.2
 */