package com.flurry.sdk;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;

@Deprecated
public final class mx$c extends mx.d
{
  public final boolean a(Method paramMethod)
  {
    if (super.a(paramMethod));
    Class localClass;
    do
    {
      return true;
      if (!qy.a(paramMethod))
        return false;
      localClass = paramMethod.getReturnType();
    }
    while ((Collection.class.isAssignableFrom(localClass)) || (Map.class.isAssignableFrom(localClass)));
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mx.c
 * JD-Core Version:    0.6.2
 */