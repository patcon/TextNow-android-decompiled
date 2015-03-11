package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$ae
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private float c;

  public AdMarvelWebView$ae(AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView, float paramFloat)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
    this.c = paramFloat;
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
          localf.seekTo((int)(1000.0F * this.c));
          return;
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
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.ae
 * JD-Core Version:    0.6.2
 */