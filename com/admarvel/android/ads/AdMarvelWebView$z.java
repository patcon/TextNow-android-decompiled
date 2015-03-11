package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$z
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<AdMarvelInternalWebView> b;

  public AdMarvelWebView$z(AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    while (true)
    {
      f localf;
      try
      {
        AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
        AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
        if (localAdMarvelWebView == null)
          break;
        if (localAdMarvelInternalWebView == null)
          return;
        localf = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
        if (localf == null)
          break;
        Logging.log("#### PauseAdMarvelEmbeddedVideo: " + localf.isPlaying());
        if (localf.isPlaying())
        {
          localf.pause();
          if ((AdMarvelWebView.L(localAdMarvelWebView) == null) || (AdMarvelWebView.L(localAdMarvelWebView).length() <= 0))
            break;
          localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.L(localAdMarvelWebView) + "()");
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      localf.c();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.z
 * JD-Core Version:    0.6.2
 */