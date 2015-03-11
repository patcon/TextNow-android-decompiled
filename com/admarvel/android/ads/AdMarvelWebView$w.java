package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$w
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<AdMarvelInternalWebView> b;
  private String c;

  public AdMarvelWebView$w(String paramString, AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.c = paramString;
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    try
    {
      AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
      AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
      if ((localAdMarvelWebView != null) && (localAdMarvelInternalWebView != null) && (this.c != null))
      {
        if (this.c.length() <= 0)
          return;
        f localf = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
        if (localf != null)
        {
          localf.e(this.c);
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
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.w
 * JD-Core Version:    0.6.2
 */