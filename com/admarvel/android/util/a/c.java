package com.admarvel.android.util.a;

import java.lang.reflect.Method;

public class c
{
  public static Method a(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
  {
    while (paramClass != null)
      try
      {
        Method localMethod = paramClass.getDeclaredMethod(paramString, paramArrayOfClass);
        return localMethod;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        paramClass = paramClass.getSuperclass();
      }
    throw new NoSuchMethodException();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.a.c
 * JD-Core Version:    0.6.2
 */