package com.admarvel.android.ads;

import android.os.Handler;
import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$o
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<d> b;

  public AdMarvelActivity$o(AdMarvelActivity paramAdMarvelActivity, d paramd)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramd);
  }

  public void run()
  {
    while (true)
    {
      final j localj;
      try
      {
        final AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get();
        final d locald = (d)this.b.get();
        if (localAdMarvelActivity == null)
          break;
        if (locald == null)
          return;
        localj = (j)((RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.a)).findViewWithTag(localAdMarvelActivity.e + "BR_VIDEO");
        if (localj == null)
          break;
        if (localj.getHeight() == 0)
        {
          localAdMarvelActivity.d.postDelayed(new Runnable()
          {
            public void run()
            {
              if (localj.getHeight() == 0)
              {
                locald.loadUrl("javascript:" + localAdMarvelActivity.n + "()");
                return;
              }
              localj.start();
            }
          }
          , 500L);
          if (AdMarvelActivity.q(localAdMarvelActivity) == null)
          {
            AdMarvelActivity.a(localAdMarvelActivity, new AdMarvelActivity.s(localAdMarvelActivity, locald));
            localAdMarvelActivity.d.postDelayed(AdMarvelActivity.q(localAdMarvelActivity), 1000L);
          }
          if ((!localAdMarvelActivity.g) || (localAdMarvelActivity.i == null) || (localAdMarvelActivity.i.length() <= 0))
            break;
          locald.loadUrl("javascript:" + localAdMarvelActivity.i + "()");
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      localj.start();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.o
 * JD-Core Version:    0.6.2
 */