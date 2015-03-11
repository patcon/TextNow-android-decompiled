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
      localAdMarvelActivity.c = false;
      RelativeLayout localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.b);
      p localp = (p)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(localAdMarvelActivity) + "BR_VIDEO");
      if (localp != null)
      {
        localp.a();
        localRelativeLayout.removeView(localp);
      }
      if (AdMarvelActivity.z(localAdMarvelActivity) != null)
      {
        AdMarvelActivity.f(localAdMarvelActivity).removeCallbacks(AdMarvelActivity.z(localAdMarvelActivity));
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.d
 * JD-Core Version:    0.6.2
 */