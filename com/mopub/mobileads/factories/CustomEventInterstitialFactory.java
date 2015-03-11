package com.mopub.mobileads.factories;

import com.mopub.mobileads.CustomEventInterstitial;
import java.lang.reflect.Constructor;

public class CustomEventInterstitialFactory
{
  private static CustomEventInterstitialFactory instance = new CustomEventInterstitialFactory();

  public static CustomEventInterstitial create(String paramString)
  {
    return instance.internalCreate(paramString);
  }

  @Deprecated
  public static void setInstance(CustomEventInterstitialFactory paramCustomEventInterstitialFactory)
  {
    instance = paramCustomEventInterstitialFactory;
  }

  protected CustomEventInterstitial internalCreate(String paramString)
  {
    Constructor localConstructor = Class.forName(paramString).asSubclass(CustomEventInterstitial.class).getDeclaredConstructor(null);
    localConstructor.setAccessible(true);
    return (CustomEventInterstitial)localConstructor.newInstance(new Object[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.factories.CustomEventInterstitialFactory
 * JD-Core Version:    0.6.2
 */