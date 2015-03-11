package com.google.android.gms.internal;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.reflect.Field;

public abstract class ha
  implements SafeParcelable
{
  private static final Object FX = new Object();
  private static ClassLoader FY = null;
  private static Integer FZ = null;
  private boolean Ga = false;

  private static boolean a(Class<?> paramClass)
  {
    try
    {
      boolean bool = "SAFE_PARCELABLE_NULL_STRING".equals(paramClass.getField("NULL").get(null));
      return bool;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      return false;
    }
    catch (NoSuchFieldException localNoSuchFieldException)
    {
    }
    return false;
  }

  protected static boolean aA(String paramString)
  {
    ClassLoader localClassLoader = fp();
    if (localClassLoader == null)
      return true;
    try
    {
      boolean bool = a(localClassLoader.loadClass(paramString));
      return bool;
    }
    catch (Exception localException)
    {
    }
    return false;
  }

  protected static ClassLoader fp()
  {
    synchronized (FX)
    {
      ClassLoader localClassLoader = FY;
      return localClassLoader;
    }
  }

  protected static Integer fq()
  {
    synchronized (FX)
    {
      Integer localInteger = FZ;
      return localInteger;
    }
  }

  protected boolean fr()
  {
    return this.Ga;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ha
 * JD-Core Version:    0.6.2
 */