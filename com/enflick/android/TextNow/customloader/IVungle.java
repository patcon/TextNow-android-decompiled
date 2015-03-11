package com.enflick.android.TextNow.customloader;

import android.content.Context;

public abstract interface IVungle
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.video.VungleWrapper";

  public abstract void init(Context paramContext, String paramString);

  public abstract boolean isVideoAvailable();

  public abstract void onPause();

  public abstract void onResume();

  public abstract boolean playAd();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.IVungle
 * JD-Core Version:    0.6.2
 */