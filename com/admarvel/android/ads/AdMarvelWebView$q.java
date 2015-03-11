package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$q
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;

  public AdMarvelWebView$q(AdMarvelWebView paramAdMarvelWebView)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
  }

  public void run()
  {
    try
    {
      AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
      if (localAdMarvelWebView == null)
        return;
      f localf = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
      if (localf != null)
      {
        localf.c();
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
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.q
 * JD-Core Version:    0.6.2
 */