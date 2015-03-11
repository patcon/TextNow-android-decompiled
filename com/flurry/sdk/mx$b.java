package com.flurry.sdk;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class mx$b
  implements na
{
  public boolean a(Method paramMethod)
  {
    if (Modifier.isStatic(paramMethod.getModifiers()));
    while (paramMethod.getParameterTypes().length > 2)
      return false;
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mx.b
 * JD-Core Version:    0.6.2
 */