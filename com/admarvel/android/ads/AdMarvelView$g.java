package com.admarvel.android.ads;

import android.app.Activity;
import android.os.AsyncTask;
import com.admarvel.android.b.c;
import java.lang.ref.WeakReference;

class AdMarvelView$g
  implements Runnable
{
  private WeakReference<Activity> a;
  private String b;

  public AdMarvelView$g(Activity paramActivity, String paramString)
  {
    this.a = new WeakReference(paramActivity);
    this.b = paramString;
  }

  public void run()
  {
    if (AdMarvelView.c() != null)
      AdMarvelView.c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    while ((this.a.get() == null) || (this.b == null))
      return;
    AdMarvelView.a(new c(this.b, (Activity)this.a.get()));
    AdMarvelView.c().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelView.g
 * JD-Core Version:    0.6.2
 */