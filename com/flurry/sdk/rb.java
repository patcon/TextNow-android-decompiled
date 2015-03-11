package com.flurry.sdk;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public final class rb
{
  private final EnumMap<?, im> a;

  private rb(Map<Enum<?>, im> paramMap)
  {
    this.a = new EnumMap(paramMap);
  }

  public static rb a(Class<Enum<?>> paramClass, iq paramiq)
  {
    return b(paramClass, paramiq);
  }

  public static rb b(Class<Enum<?>> paramClass, iq paramiq)
  {
    Enum[] arrayOfEnum = (Enum[])qy.g(paramClass).getEnumConstants();
    if (arrayOfEnum != null)
    {
      HashMap localHashMap = new HashMap();
      int i = arrayOfEnum.length;
      for (int j = 0; j < i; j++)
      {
        Enum localEnum = arrayOfEnum[j];
        localHashMap.put(localEnum, new im(paramiq.a(localEnum)));
      }
      return new rb(localHashMap);
    }
    throw new IllegalArgumentException("Can not determine enum constants for Class " + paramClass.getName());
  }

  public static rb c(Class<Enum<?>> paramClass, iq paramiq)
  {
    Enum[] arrayOfEnum = (Enum[])qy.g(paramClass).getEnumConstants();
    if (arrayOfEnum != null)
    {
      HashMap localHashMap = new HashMap();
      int i = arrayOfEnum.length;
      for (int j = 0; j < i; j++)
      {
        Enum localEnum = arrayOfEnum[j];
        localHashMap.put(localEnum, new im(localEnum.toString()));
      }
      return new rb(localHashMap);
    }
    throw new IllegalArgumentException("Can not determine enum constants for Class " + paramClass.getName());
  }

  public final im a(Enum<?> paramEnum)
  {
    return (im)this.a.get(paramEnum);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.rb
 * JD-Core Version:    0.6.2
 */