package com.flurry.sdk;

import java.util.EnumMap;
import java.util.EnumSet;

public class nr extends nw
{
  public nr(sh paramsh, qs paramqs)
  {
    super(paramsh, paramqs);
  }

  public sh a(String paramString)
  {
    if (paramString.indexOf('<') > 0)
      return qs.a(paramString);
    try
    {
      Class localClass = Class.forName(paramString, true, Thread.currentThread().getContextClassLoader());
      sh localsh = this.c.a(this.d, localClass);
      return localsh;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      throw new IllegalArgumentException("Invalid type id '" + paramString + "' (for id type 'Id.class'): no such class found");
    }
    catch (Exception localException)
    {
      throw new IllegalArgumentException("Invalid type id '" + paramString + "' (for id type 'Id.class'): " + localException.getMessage(), localException);
    }
  }

  public String a(Object paramObject)
  {
    return b(paramObject, paramObject.getClass());
  }

  public String a(Object paramObject, Class<?> paramClass)
  {
    return b(paramObject, paramClass);
  }

  protected final String b(Object paramObject, Class<?> paramClass)
  {
    if ((Enum.class.isAssignableFrom(paramClass)) && (!paramClass.isEnum()))
      paramClass = paramClass.getSuperclass();
    String str1 = paramClass.getName();
    if (str1.startsWith("java.util"))
      if ((paramObject instanceof EnumSet))
      {
        localClass2 = qy.a((EnumSet)paramObject);
        str1 = qs.a().b(EnumSet.class, localClass2).m();
      }
    while ((str1.indexOf('$') < 0) || (qy.b(paramClass) == null) || (qy.b(this.d.p()) != null))
    {
      String str2;
      do
      {
        Class localClass2;
        return str1;
        if ((paramObject instanceof EnumMap))
        {
          Class localClass1 = qy.a((EnumMap)paramObject);
          return qs.a().a(EnumMap.class, localClass1, Object.class).m();
        }
        str2 = str1.substring(9);
      }
      while (((!str2.startsWith(".Arrays$")) && (!str2.startsWith(".Collections$"))) || (str1.indexOf("List") < 0));
      return "java.util.ArrayList";
    }
    return this.d.p().getName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.nr
 * JD-Core Version:    0.6.2
 */