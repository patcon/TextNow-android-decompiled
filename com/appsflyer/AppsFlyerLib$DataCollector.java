package com.appsflyer;

import android.content.Context;
import java.util.concurrent.ExecutorService;

class AppsFlyerLib$DataCollector
  implements Runnable
{
  private String appsFlyerKey;
  private Context context;
  private String eventName;
  private String eventValue;
  private ExecutorService executor;
  private String referrer;

  private AppsFlyerLib$DataCollector(Context paramContext, String paramString1, String paramString2, String paramString3, String paramString4, ExecutorService paramExecutorService)
  {
    this.context = paramContext;
    this.appsFlyerKey = paramString1;
    this.eventName = paramString2;
    this.eventValue = paramString3;
    this.referrer = paramString4;
    this.executor = paramExecutorService;
  }

  public void run()
  {
    AppsFlyerLib.access$200(this.context, this.appsFlyerKey, this.eventName, this.eventValue, this.referrer);
    this.executor.shutdown();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.AppsFlyerLib.DataCollector
 * JD-Core Version:    0.6.2
 */