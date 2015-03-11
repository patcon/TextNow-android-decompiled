package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.b.a;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$l
  implements Runnable
{
  private final WeakReference<AdMarvelInternalWebView> a;
  private final WeakReference<AdMarvelActivity> b;
  private final String c;

  public AdMarvelActivity$l(AdMarvelInternalWebView paramAdMarvelInternalWebView, AdMarvelActivity paramAdMarvelActivity, String paramString)
  {
    this.a = new WeakReference(paramAdMarvelInternalWebView);
    this.b = new WeakReference(paramAdMarvelActivity);
    this.c = paramString;
  }

  public void run()
  {
    AdMarvelActivity localAdMarvelActivity;
    try
    {
      if ((AdMarvelInternalWebView)this.a.get() == null)
        return;
      localAdMarvelActivity = (AdMarvelActivity)this.b.get();
      if ((localAdMarvelActivity == null) || (this.c == null) || (this.c.length() <= 0))
        return;
      if (AdMarvelInterstitialAds.enableOfflineSDK)
      {
        new a().a(this.c, localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity));
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    new ab(localAdMarvelActivity, AdMarvelActivity.f(localAdMarvelActivity)).a(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.l
 * JD-Core Version:    0.6.2
 */