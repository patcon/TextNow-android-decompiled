package com.admarvel.android.ads;

import android.util.Log;
import com.admarvel.android.util.Logging;
import com.admarvel.android.util.a.b;
import java.lang.ref.WeakReference;

class AdMarvelActivity$i
  implements Runnable
{
  private final WeakReference<d> a;
  private final WeakReference<AdMarvelActivity> b;
  private final String c;

  public AdMarvelActivity$i(d paramd, AdMarvelActivity paramAdMarvelActivity, String paramString)
  {
    this.a = new WeakReference(paramd);
    this.b = new WeakReference(paramAdMarvelActivity);
    this.c = paramString;
  }

  public void run()
  {
    AdMarvelActivity localAdMarvelActivity;
    try
    {
      if ((d)this.a.get() == null)
        return;
      localAdMarvelActivity = (AdMarvelActivity)this.b.get();
      if ((localAdMarvelActivity == null) || (this.c == null) || (this.c.length() <= 0))
        return;
      if (AdMarvelInterstitialAds.enableOfflineSDK)
      {
        new b().a(this.c, localAdMarvelActivity, localAdMarvelActivity.d);
        return;
      }
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      return;
    }
    new r(localAdMarvelActivity).b(this.c);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.i
 * JD-Core Version:    0.6.2
 */