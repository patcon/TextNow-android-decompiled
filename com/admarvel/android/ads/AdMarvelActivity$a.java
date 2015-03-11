package com.admarvel.android.ads;

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

class AdMarvelActivity$a extends AsyncTask<Object, Object, Object>
{
  private final WeakReference<AdMarvelActivity> a;
  private final AdMarvelAd b;

  public AdMarvelActivity$a(AdMarvelActivity paramAdMarvelActivity, AdMarvelAd paramAdMarvelAd)
  {
    this.a = new WeakReference(paramAdMarvelActivity);
    this.b = paramAdMarvelAd;
  }

  protected Object doInBackground(Object[] paramArrayOfObject)
  {
    if (this.a != null);
    for (AdMarvelActivity localAdMarvelActivity = (AdMarvelActivity)this.a.get(); localAdMarvelActivity == null; localAdMarvelActivity = null)
      return null;
    try
    {
      AdMarvelActivity.p(localAdMarvelActivity).sendEmptyMessage(0);
      return null;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
      localAdMarvelActivity.finish();
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdMarvelActivity.a
 * JD-Core Version:    0.6.2
 */