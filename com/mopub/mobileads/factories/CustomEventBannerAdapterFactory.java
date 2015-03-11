package com.mopub.mobileads.factories;

import com.mopub.mobileads.CustomEventBannerAdapter;
import com.mopub.mobileads.MoPubView;

public class CustomEventBannerAdapterFactory
{
  protected static CustomEventBannerAdapterFactory instance = new CustomEventBannerAdapterFactory();

  public static CustomEventBannerAdapter create(MoPubView paramMoPubView, String paramString1, String paramString2)
  {
    return instance.internalCreate(paramMoPubView, paramString1, paramString2);
  }

  @Deprecated
  public static void setInstance(CustomEventBannerAdapterFactory paramCustomEventBannerAdapterFactory)
  {
    instance = paramCustomEventBannerAdapterFactory;
  }

  protected CustomEventBannerAdapter internalCreate(MoPubView paramMoPubView, String paramString1, String paramString2)
  {
    return new CustomEventBannerAdapter(paramMoPubView, paramString1, paramString2);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.CustomEventBannerAdapterFactory
 * JD-Core Version:    0.6.2
 */