package com.admarvel.android.ads;

import android.os.Handler;
import android.util.Log;
import android.widget.LinearLayout.LayoutParams;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelWebView$h
  implements Runnable
{
  private final WeakReference<AdMarvelWebView> a;

  public AdMarvelWebView$h(AdMarvelWebView paramAdMarvelWebView)
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
        localf.b();
        localAdMarvelWebView.removeView(localf);
        localf.a = null;
      }
      if (AdMarvelWebView.H(localAdMarvelWebView) != null)
      {
        AdMarvelWebView.d(localAdMarvelWebView).removeCallbacks(AdMarvelWebView.H(localAdMarvelWebView));
        AdMarvelWebView.a(localAdMarvelWebView, null);
      }
      ab.m(localAdMarvelWebView.getContext());
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localAdMarvelWebView.getLayoutParams();
      localLayoutParams.height = -2;
      localAdMarvelWebView.setLayoutParams(localLayoutParams);
      localAdMarvelWebView.forceLayout();
      this.a.clear();
      return;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelWebView.h
 * JD-Core Version:    0.6.2
 */