package com.appsflyer;

import android.content.Context;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

class AppsFlyerLib$CachedRequestSender
  implements Runnable
{
  private WeakReference<Context> ctxReference = null;

  public AppsFlyerLib$CachedRequestSender(Context paramContext)
  {
    this.ctxReference = new WeakReference(paramContext);
  }

  public void run()
  {
    if (AppsFlyerLib.access$1200());
    do
    {
      return;
      AppsFlyerLib.access$1302(System.currentTimeMillis());
    }
    while (this.ctxReference == null);
    AppsFlyerLib.access$1202(true);
    try
    {
      String str = AppsFlyerLib.getProperty("AppsFlyerKey");
      synchronized (this.ctxReference)
      {
        Iterator localIterator = CacheManager.getInstance().getCachedRequests((Context)this.ctxReference.get()).iterator();
        while (localIterator.hasNext())
        {
          RequestCacheData localRequestCacheData = (RequestCacheData)localIterator.next();
          if (AppsFlyerLib.access$900((Context)this.ctxReference.get()))
            new StringBuilder().append("resending request: ").append(localRequestCacheData.getRequestURL()).toString();
          try
          {
            AppsFlyerLib.access$600(localRequestCacheData.getRequestURL() + "&isCachedRequest=true", localRequestCacheData.getPostData(), str, this.ctxReference, localRequestCacheData.getCacheKey(), "AppsFlyer_1.13", false);
          }
          catch (Exception localException2)
          {
          }
        }
        AppsFlyerLib.access$1202(false);
        AppsFlyerLib.access$1400().shutdown();
        return;
      }
    }
    catch (Exception localException1)
    {
      while (true)
        AppsFlyerLib.access$1202(false);
    }
    finally
    {
      AppsFlyerLib.access$1202(false);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.AppsFlyerLib.CachedRequestSender
 * JD-Core Version:    0.6.2
 */