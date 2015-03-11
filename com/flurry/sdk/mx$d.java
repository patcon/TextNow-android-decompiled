package com.flurry.sdk;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@Deprecated
public class mx$d
  implements na
{
  public boolean a(Method paramMethod)
  {
    if (Modifier.isStatic(paramMethod.getModifiers()))
      return false;
    switch (paramMethod.getParameterTypes().length)
    {
    default:
      return false;
    case 1:
      return true;
    case 2:
    }
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mx.d
 * JD-Core Version:    0.6.2
 */