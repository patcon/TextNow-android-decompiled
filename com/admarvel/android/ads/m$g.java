package com.admarvel.android.ads;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.LinearLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class m$g
  implements Runnable
{
  private final WeakReference<m> a;

  public m$g(m paramm)
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
        locala.b();
        localm.removeView(locala);
        locala.e = null;
      }
      if (localm.O != null)
      {
        new Handler(Looper.getMainLooper()).removeCallbacks(localm.O);
        localm.O = null;
      }
      r.n(localm.getContext());
      d locald = (d)localm.findViewWithTag(localm.s + "INTERNAL");
      if (locald != null)
      {
        locald.h();
        locald.j = null;
        locald.invalidate();
        locald.requestLayout();
      }
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localm.getLayoutParams();
      localLayoutParams.height = -2;
      localm.setLayoutParams(localLayoutParams);
      localm.forceLayout();
      localm.requestLayout();
      localm.invalidate();
      localm.requestFocus();
      this.a.clear();
      return;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.m.g
 * JD-Core Version:    0.6.2
 */