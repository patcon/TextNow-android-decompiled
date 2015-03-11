package com.enflick.android.TextNow.customloader;

import android.app.Activity;
import java.util.Map;

public abstract interface ISupersonic
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.video.SupersonicWrapper";

  public abstract void release(Activity paramActivity);

  public abstract void showOfferwall(Activity paramActivity, String paramString1, String paramString2, Map<String, String> paramMap);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.ISupersonic
 * JD-Core Version:    0.6.2
 */