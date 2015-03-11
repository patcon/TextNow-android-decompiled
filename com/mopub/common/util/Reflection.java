package com.mopub.common.util;

import java.lang.reflect.Method;

public class Reflection
{
  public static boolean classFound(String paramString)
  {
    try
    {
      Class.forName(paramString);
      return true;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
    }
    return false;
  }

  public static Method getDeclaredMethodWithTraversal(Class<?> paramClass, String paramString, Class<?>[] paramArrayOfClass)
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
 * Qualified Name:     com.mopub.common.util.Reflection
 * JD-Core Version:    0.6.2
 */