package com.mopub.common;

import android.content.Context;
import android.os.AsyncTask;
import com.mopub.common.factories.MethodBuilderFactory;
import com.mopub.common.logging.MoPubLog;
import com.mopub.common.util.Reflection.MethodBuilder;
import java.lang.ref.WeakReference;

class GpsHelper$FetchAdvertisingInfoTask extends AsyncTask<Void, Void, Void>
{
  private WeakReference<Context> mContextWeakReference;
  private WeakReference<GpsHelper.GpsHelperListener> mGpsHelperListenerWeakReference;

  public GpsHelper$FetchAdvertisingInfoTask(Context paramContext, GpsHelper.GpsHelperListener paramGpsHelperListener)
  {
    this.mContextWeakReference = new WeakReference(paramContext);
    this.mGpsHelperListenerWeakReference = new WeakReference(paramGpsHelperListener);
  }

  protected Void doInBackground(Void[] paramArrayOfVoid)
  {
    try
    {
      Context localContext = (Context)this.mContextWeakReference.get();
      if (localContext == null)
        return null;
      Object localObject = MethodBuilderFactory.create(null, "getAdvertisingIdInfo").setStatic(Class.forName(GpsHelper.access$000())).addParam(Context.class, localContext).execute();
      if (localObject != null)
      {
        GpsHelper.updateSharedPreferences(localContext, localObject);
        return null;
      }
    }
    catch (Exception localException)
    {
      MoPubLog.d("Unable to obtain AdvertisingIdClient.getAdvertisingIdInfo()");
    }
    return null;
  }

  protected void onPostExecute(Void paramVoid)
  {
    GpsHelper.GpsHelperListener localGpsHelperListener = (GpsHelper.GpsHelperListener)this.mGpsHelperListenerWeakReference.get();
    if (localGpsHelperListener != null)
      localGpsHelperListener.onFetchAdInfoCompleted();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.GpsHelper.FetchAdvertisingInfoTask
 * JD-Core Version:    0.6.2
 */