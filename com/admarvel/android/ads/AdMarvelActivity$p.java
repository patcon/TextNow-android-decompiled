package com.admarvel.android.ads;

import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$p
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<d> b;
  private float c;

  public AdMarvelActivity$p(AdMarvelActivity paramAdMarvelActivity, d paramd, float paramFloat)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramd);
    this.c = paramFloat;
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
        RelativeLayout localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.a);
        if (localRelativeLayout != null)
        {
          j localj = (j)localRelativeLayout.findViewWithTag(localAdMarvelActivity.e + "BR_VIDEO");
          if (localj != null)
          {
            localj.seekTo((int)(1000.0F * this.c));
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
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.p
 * JD-Core Version:    0.6.2
 */