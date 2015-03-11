package com.enflick.android.TextNow.customloader;

import android.app.Activity;

public abstract interface IAdcolony
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.video.AdcolonyWrapper";

  public abstract void configure(Activity paramActivity, String paramString1, String paramString2, String paramString3);

  public abstract boolean isReady(String paramString);

  public abstract void pause();

  public abstract void resume(Activity paramActivity);

  public abstract void setCustomID(String paramString);

  public abstract boolean showAd(String paramString);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.IAdcolony
 * JD-Core Version:    0.6.2
 */