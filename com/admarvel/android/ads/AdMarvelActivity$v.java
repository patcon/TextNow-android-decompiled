package com.admarvel.android.ads;

import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$v
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private float c;

  public AdMarvelActivity$v(AdMarvelActivity paramAdMarvelActivity, AdMarvelInternalWebView paramAdMarvelInternalWebView, float paramFloat)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
    this.c = paramFloat;
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
        RelativeLayout localRelativeLayout = (RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.b);
        if (localRelativeLayout != null)
        {
          p localp = (p)localRelativeLayout.findViewWithTag(AdMarvelActivity.c(localAdMarvelActivity) + "BR_VIDEO");
          if (localp != null)
          {
            localp.seekTo((int)(1000.0F * this.c));
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
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.v
 * JD-Core Version:    0.6.2
 */