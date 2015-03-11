package com.appsflyer;

import java.util.Map;

public abstract interface ConversionDataListener
{
  public abstract void onConversionDataLoaded(Map<String, String> paramMap);

  public abstract void onConversionFailure(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.ConversionDataListener
 * JD-Core Version:    0.6.2
 */