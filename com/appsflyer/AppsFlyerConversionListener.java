package com.appsflyer;

import java.util.Map;

public abstract interface AppsFlyerConversionListener
{
  public abstract void onAppOpenAttribution(Map<String, String> paramMap);

  public abstract void onInstallConversionDataLoaded(Map<String, String> paramMap);

  public abstract void onInstallConversionFailure(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.AppsFlyerConversionListener
 * JD-Core Version:    0.6.2
 */