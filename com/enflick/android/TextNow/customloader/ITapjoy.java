package com.enflick.android.TextNow.customloader;

import android.content.Context;

public abstract interface ITapjoy
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.video.TapjoyWrapper";

  public abstract void enableLogging(boolean paramBoolean);

  public abstract void requestTapjoyConnect(Context paramContext, String paramString1, String paramString2);

  public abstract void setUserID(String paramString);

  public abstract void showOffersWithCurrencyID(String paramString, boolean paramBoolean);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.ITapjoy
 * JD-Core Version:    0.6.2
 */