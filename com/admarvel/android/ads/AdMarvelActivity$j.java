package com.admarvel.android.ads;

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.admarvel.android.util.Logging;

class AdMarvelActivity$j
  implements Runnable
{
  private final AdMarvelAd b;

  public AdMarvelActivity$j(AdMarvelActivity paramAdMarvelActivity, AdMarvelAd paramAdMarvelAd)
  {
    this.b = paramAdMarvelAd;
  }

  public void run()
  {
    try
    {
      new AdMarvelActivity.a(this.a, this.b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
      return;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      AdMarvelActivity.q(this.a).sendEmptyMessage(0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.j
 * JD-Core Version:    0.6.2
 */