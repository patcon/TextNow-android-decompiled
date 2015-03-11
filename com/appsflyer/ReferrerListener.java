package com.appsflyer;

import java.util.Map;

public abstract interface ReferrerListener
{
  public abstract void onReferrerNotFound();

  public abstract void onReferrerReceived(Map<String, String> paramMap);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.appsflyer.ReferrerListener
 * JD-Core Version:    0.6.2
 */