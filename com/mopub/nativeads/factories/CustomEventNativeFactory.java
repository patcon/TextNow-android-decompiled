package com.mopub.nativeads.factories;

import com.mopub.nativeads.CustomEventNative;
import com.mopub.nativeads.MoPubCustomEventNative;
import java.lang.reflect.Constructor;

public class CustomEventNativeFactory
{
  protected static CustomEventNativeFactory instance = new CustomEventNativeFactory();

  public static CustomEventNative create(String paramString)
  {
    if (paramString != null)
    {
      Class localClass = Class.forName(paramString).asSubclass(CustomEventNative.class);
      return instance.internalCreate(localClass);
    }
    return new MoPubCustomEventNative();
  }

  @Deprecated
  public static void setInstance(CustomEventNativeFactory paramCustomEventNativeFactory)
  {
    instance = paramCustomEventNativeFactory;
  }

  protected CustomEventNative internalCreate(Class<? extends CustomEventNative> paramClass)
  {
    Constructor localConstructor = paramClass.getDeclaredConstructor(null);
    localConstructor.setAccessible(true);
    return (CustomEventNative)localConstructor.newInstance(new Object[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.nativeads.factories.CustomEventNativeFactory
 * JD-Core Version:    0.6.2
 */