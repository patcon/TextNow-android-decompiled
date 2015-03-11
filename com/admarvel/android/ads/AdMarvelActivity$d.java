package com.admarvel.android.ads;

import android.os.Handler;
import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$d
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;

  public AdMarvelActivity$d(AdMarvelActivity paramAdMarvelActivity)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
  }

  public void run()
  {
    try
    {
      AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get();
      if (localAdMarvelActivity == null)
        return;
      localAdMarvelActivity.f = false;
      RelativeLayout localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.a);
      j localj = (j)localRelativeLayout.findViewWithTag(localAdMarvelActivity.e + "BR_VIDEO");
      if (localj != null)
      {
        localj.a();
        localRelativeLayout.removeView(localj);
      }
      if (AdMarvelActivity.q(localAdMarvelActivity) != null)
      {
        localAdMarvelActivity.d.removeCallbacks(AdMarvelActivity.q(localAdMarvelActivity));
        AdMarvelActivity.a(localAdMarvelActivity, null);
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
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.d
 * JD-Core Version:    0.6.2
 */