package com.mopub.mobileads.factories;

import com.mopub.mobileads.CustomEventBanner;
import java.lang.reflect.Constructor;

public class CustomEventBannerFactory
{
  private static CustomEventBannerFactory instance = new CustomEventBannerFactory();

  public static CustomEventBanner create(String paramString)
  {
    return instance.internalCreate(paramString);
  }

  @Deprecated
  public static void setInstance(CustomEventBannerFactory paramCustomEventBannerFactory)
  {
    instance = paramCustomEventBannerFactory;
  }

  protected CustomEventBanner internalCreate(String paramString)
  {
    Constructor localConstructor = Class.forName(paramString).asSubclass(CustomEventBanner.class).getDeclaredConstructor(null);
    localConstructor.setAccessible(true);
    return (CustomEventBanner)localConstructor.newInstance(new Object[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.CustomEventBannerFactory
 * JD-Core Version:    0.6.2
 */