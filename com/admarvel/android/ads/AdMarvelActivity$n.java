package com.admarvel.android.ads;

import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$n
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<d> b;

  public AdMarvelActivity$n(AdMarvelActivity paramAdMarvelActivity, d paramd)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramd);
  }

  public void run()
  {
    try
    {
      AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get();
      d locald = (d)this.b.get();
      if (localAdMarvelActivity != null)
      {
        if (locald == null)
          return;
        j localj = (j)((RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.a)).findViewWithTag(localAdMarvelActivity.e + "BR_VIDEO");
        if ((localj != null) && (localj.isPlaying()))
        {
          localj.pause();
          if ((localAdMarvelActivity.g) && (localAdMarvelActivity.m != null) && (localAdMarvelActivity.m.length() > 0))
          {
            locald.loadUrl("javascript:" + localAdMarvelActivity.m + "()");
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
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.n
 * JD-Core Version:    0.6.2
 */