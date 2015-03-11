package com.appsflyer;

import android.content.Context;
import android.content.SharedPreferences;
import com.appsflyer.cache.CacheManager;
import com.appsflyer.cache.RequestCacheData;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;

class AppsFlyerLib$SendToServerRunnable
  implements Runnable
{
  private WeakReference<Context> ctxReference = null;
  boolean isLaunch;
  Map<String, String> params;
  private String urlString;

  private AppsFlyerLib$SendToServerRunnable(String paramString, Map<String, String> paramMap, Context paramContext, boolean paramBoolean)
  {
    this.urlString = paramString;
    this.params = paramMap;
    this.ctxReference = new WeakReference(paramContext);
    this.isLaunch = paramBoolean;
  }

  public void run()
  {
    String str1 = AppsFlyerLib.access$300(this.params);
    while (true)
    {
      try
      {
        Context localContext = (Context)this.ctxReference.get();
        if (localContext != null)
        {
          String str3 = AppsFlyerProperties.getInstance().getReferrer(localContext);
          if ((str3 != null) && (str3.length() > 0) && (this.params.get("referrer") == null))
            this.params.put("referrer", str3);
          boolean bool1 = "true".equals(localContext.getSharedPreferences("appsflyer-data", 0).getString("sentSuccessfully", ""));
          String str4 = (String)this.params.get("eventName");
          Map localMap1 = this.params;
          if (str4 != null)
            break label358;
          bool2 = true;
          localMap1.put("counter", Integer.toString(AppsFlyerLib.access$400(localContext, bool2)));
          bool3 = bool1;
          Map localMap2 = this.params;
          if (bool3)
            break label364;
          bool4 = true;
          localMap2.put("isFirstCall", Boolean.toString(bool4));
          String str5 = (String)this.params.get("appsflyerKey");
          if (str5 == null)
            break label357;
          if (str5.length() == 0)
            return;
          String str6 = new HashUtils().getHashCode(this.params);
          this.params.put("af_v", str6);
          String str7 = AppsFlyerLib.access$500(this.params);
          str2 = str7;
          try
          {
            AppsFlyerLib.access$600(this.urlString, str2, str5, this.ctxReference, null, str1, this.isLaunch);
            return;
          }
          catch (IOException localIOException1)
          {
          }
          if ((str2 == null) || (this.ctxReference == null) || (this.urlString.contains("&isCachedRequest=true")))
            break label357;
          localIOException1.getMessage();
          CacheManager.getInstance().cacheRequest(new RequestCacheData(this.urlString, str2, "1.13"), (Context)this.ctxReference.get());
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.getMessage();
        return;
      }
      catch (IOException localIOException2)
      {
        String str2 = null;
        continue;
        boolean bool3 = false;
        continue;
      }
      label357: return;
      label358: boolean bool2 = false;
      continue;
      label364: boolean bool4 = false;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.AppsFlyerLib.SendToServerRunnable
 * JD-Core Version:    0.6.2
 */