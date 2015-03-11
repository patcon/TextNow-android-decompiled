package com.flurry.sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public final class mz
{
  static final Class<?>[] a = new Class[0];
  final String b;
  final Class<?>[] c;

  public mz(String paramString, Class<?>[] paramArrayOfClass)
  {
    this.b = paramString;
    if (paramArrayOfClass == null)
      paramArrayOfClass = a;
    this.c = paramArrayOfClass;
  }

  public mz(Constructor<?> paramConstructor)
  {
    this("", paramConstructor.getParameterTypes());
  }

  public mz(Method paramMethod)
  {
    this(paramMethod.getName(), paramMethod.getParameterTypes());
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    while (true)
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
      mz localmz = (mz)paramObject;
      if (!this.b.equals(localmz.b))
        return false;
      Class[] arrayOfClass = localmz.c;
      int i = this.c.length;
      if (arrayOfClass.length != i)
        return false;
      for (int j = 0; j < i; j++)
      {
        Class localClass1 = arrayOfClass[j];
        Class localClass2 = this.c[j];
        if ((localClass1 != localClass2) && (!localClass1.isAssignableFrom(localClass2)) && (!localClass2.isAssignableFrom(localClass1)))
          return false;
      }
    }
  }

  public final int hashCode()
  {
    return this.b.hashCode() + this.c.length;
  }

  public final String toString()
  {
    return this.b + "(" + this.c.length + "-args)";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mz
 * JD-Core Version:    0.6.2
 */