package com.admarvel.android.ads;

import android.os.Handler;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$aa
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;
  private final WeakReference<AdMarvelInternalWebView> b;

  public AdMarvelWebView$aa(AdMarvelWebView paramAdMarvelWebView, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.a = new WeakReference(paramAdMarvelWebView);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    while (true)
    {
      final f localf;
      try
      {
        final AdMarvelWebView localAdMarvelWebView = (AdMarvelWebView)this.a.get();
        final AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
        if (localAdMarvelWebView == null)
          break;
        if (localAdMarvelInternalWebView == null)
          return;
        localf = (f)localAdMarvelWebView.findViewWithTag(localAdMarvelWebView.e + "EMBEDDED_VIDEO");
        if (localf == null)
          break;
        if (localf.getHeight() == 0)
        {
          AdMarvelWebView.d(localAdMarvelWebView).postDelayed(new Runnable()
          {
            public void run()
            {
              if ((localf.getHeight() == 0) && (AdMarvelWebView.J(localAdMarvelWebView) != null) && (AdMarvelWebView.J(localAdMarvelWebView).length() > 0))
              {
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.J(localAdMarvelWebView) + "()");
                return;
              }
              localf.f();
            }
          }
          , 500L);
          if ((AdMarvelWebView.K(localAdMarvelWebView) == null) || (AdMarvelWebView.K(localAdMarvelWebView).length() <= 0))
            break;
          localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelWebView.K(localAdMarvelWebView) + "()");
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      localf.f();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.aa
 * JD-Core Version:    0.6.2
 */