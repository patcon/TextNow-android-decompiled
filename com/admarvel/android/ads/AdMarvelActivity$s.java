package com.admarvel.android.ads;

import android.os.Handler;
import android.util.Log;
import android.widget.RelativeLayout;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$s
  implements Runnable
{
  private final WeakReference<AdMarvelActivity> a;
  private final WeakReference<AdMarvelInternalWebView> b;

  public AdMarvelActivity$s(AdMarvelActivity paramAdMarvelActivity, AdMarvelInternalWebView paramAdMarvelInternalWebView)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = new WeakReference(paramAdMarvelInternalWebView);
  }

  public void run()
  {
    while (true)
    {
      final p localp;
      try
      {
        final AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get();
        final AdMarvelInternalWebView localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.b.get();
        if (localAdMarvelActivity == null)
          break;
        if (localAdMarvelInternalWebView == null)
          return;
        localp = (p)((RelativeLayout)localAdMarvelActivity.findViewById(AdMarvelActivity.b)).findViewWithTag(AdMarvelActivity.c(localAdMarvelActivity) + "BR_VIDEO");
        if (localp == null)
          break;
        if (localp.getHeight() == 0)
        {
          AdMarvelActivity.f(localAdMarvelActivity).postDelayed(new Runnable()
          {
            public void run()
            {
              if (localp.getHeight() == 0)
              {
                localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.y(localAdMarvelActivity) + "()");
                return;
              }
              localp.start();
            }
          }
          , 500L);
          if (AdMarvelActivity.z(localAdMarvelActivity) == null)
          {
            AdMarvelActivity.a(localAdMarvelActivity, new AdMarvelActivity.aa(localAdMarvelActivity, localAdMarvelInternalWebView));
            AdMarvelActivity.f(localAdMarvelActivity).postDelayed(AdMarvelActivity.z(localAdMarvelActivity), 1000L);
          }
          if ((!localAdMarvelActivity.d) || (AdMarvelActivity.A(localAdMarvelActivity) == null) || (AdMarvelActivity.A(localAdMarvelActivity).length() <= 0))
            break;
          localAdMarvelInternalWebView.loadUrl("javascript:" + AdMarvelActivity.A(localAdMarvelActivity) + "()");
          return;
        }
      }
      catch (Exception localException)
      {
        Logging.log(Log.getStackTraceString(localException));
        return;
      }
      localp.start();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.s
 * JD-Core Version:    0.6.2
 */