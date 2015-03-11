package com.admarvel.android.ads;

import android.app.Activity;
import android.os.AsyncTask;
import com.admarvel.android.b.c;
import java.lang.ref.WeakReference;

class AdMarvelInterstitialAds$d
  implements Runnable
{
  private WeakReference<Activity> a;
  private String b;

  public AdMarvelInterstitialAds$d(Activity paramActivity, String paramString)
  {
    this.a = new WeakReference(paramActivity);
    this.b = paramString;
  }

  public void run()
  {
    if (AdMarvelInterstitialAds.access$000() != null)
      AdMarvelInterstitialAds.access$000().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    while ((this.a.get() == null) || (this.b == null))
      return;
    AdMarvelInterstitialAds.access$002(new c(this.b, (Activity)this.a.get()));
    AdMarvelInterstitialAds.access$000().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelInterstitialAds.d
 * JD-Core Version:    0.6.2
 */