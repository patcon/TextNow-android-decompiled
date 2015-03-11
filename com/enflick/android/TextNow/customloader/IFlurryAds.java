package com.enflick.android.TextNow.customloader;

import android.content.Context;
import android.view.ViewGroup;
import com.flurry.android.FlurryAdListener;
import java.util.Map;

public abstract interface IFlurryAds
{
  public static final String CLASSNAME = "com.enflick.android.TextNow.customloader.wrappers.video.FlurryAdsWrapper";

  public abstract void displayAd(Context paramContext, String paramString, ViewGroup paramViewGroup);

  public abstract void fetchAd(Context paramContext, String paramString, ViewGroup paramViewGroup);

  public abstract boolean isAdReady(String paramString);

  public abstract void removeAd(Context paramContext, String paramString, ViewGroup paramViewGroup);

  public abstract void setAdListener(FlurryAdListener paramFlurryAdListener);

  public abstract void setUserCookies(Map<String, String> paramMap);
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.customloader.IFlurryAds
 * JD-Core Version:    0.6.2
 */