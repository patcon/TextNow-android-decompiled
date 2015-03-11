package com.enflick.android.TextNow.customloader;

import android.app.Activity;

public abstract interface ITremor
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.video.TremorWrapper";

  public abstract void destroy();

  public abstract void initialize(Activity paramActivity, String paramString);

  public abstract boolean showAd(Activity paramActivity, int paramInt);

  public abstract void start();

  public abstract void updateSettings(int paramInt1, int paramInt2);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.ITremor
 * JD-Core Version:    0.6.2
 */