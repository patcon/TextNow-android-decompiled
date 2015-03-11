package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$c
  implements Runnable
{
  private final WeakReference<AdMarvelInternalWebView> a;
  private final String b;

  public AdMarvelActivity$c(AdMarvelInternalWebView paramAdMarvelInternalWebView, String paramString)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = paramString;
  }

  public void run()
  {
    AdMarvelInternalWebView localAdMarvelInternalWebView;
    try
    {
      localAdMarvelInternalWebView = (AdMarvelInternalWebView)this.a.get();
      if (localAdMarvelInternalWebView == null)
        return;
      if (ab.f(localAdMarvelInternalWebView.getContext()))
      {
        localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(\"YES\")");
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    localAdMarvelInternalWebView.loadUrl("javascript:" + this.b + "(\"NO\")");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.c
 * JD-Core Version:    0.6.2
 */