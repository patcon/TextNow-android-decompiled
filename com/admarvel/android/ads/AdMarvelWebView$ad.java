package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$ad
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<AdMarvelInternalWebView> b;

  public AdMarvelWebView$ad(AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    try
    {
      AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
      if (localAdMarvelWebView != null)
      {
        if (localAdMarvelInternalWebView == null)
          return;
        f localf = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
        if (localf != null)
        {
          Logging.log("#### ResumeAdMarvelEmbeddedVideo");
          if (!localf.isPlaying())
          {
            localf.g();
            if ((AdMarvelWebView.M(localAdMarvelWebView) != null) && (AdMarvelWebView.M(localAdMarvelWebView).length() > 0))
            {
              localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.M(localAdMarvelWebView) + "()");
              return;
            }
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
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.ad
 * JD-Core Version:    0.6.2
 */