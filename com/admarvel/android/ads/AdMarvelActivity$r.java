package com.admarvel.android.ads;

import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$r
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<AdMarvelInternalWebView> b;

  public AdMarvelActivity$r(AdMarvelActivity paramAdMarvelActivity, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    try
    {
      AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get();
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
      if (localAdMarvelActivity != null)
      {
        if (localAdMarvelInternalWebView == null)
          return;
        p localp = (p)((RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.b)).findViewWithTag(AdMarvelActivity.c(localAdMarvelActivity) + "BR_VIDEO");
        if ((localp != null) && (localp.isPlaying()))
        {
          localp.pause();
          if ((localAdMarvelActivity.d) && (AdMarvelActivity.B(localAdMarvelActivity) != null) && (AdMarvelActivity.B(localAdMarvelActivity).length() > 0))
          {
            localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.B(localAdMarvelActivity) + "()");
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.r
 * JD-Core Version:    0.6.2
 */