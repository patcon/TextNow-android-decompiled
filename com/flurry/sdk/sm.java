package com.flurry.sdk;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public final class sm extends LinkedHashMap<String, String>
{
  public static final sm a = new sm();

  private sm()
  {
    super(192, 0.8F, true);
  }

  public final String a(String paramString)
  {
    try
    {
      String str = (String)get(paramString);
      if (str == null)
      {
        str = paramString.intern();
        put(str, str);
      }
      return str;
    }
    finally
    {
    }
  }

  protected final boolean removeEldestEntry(Map.Entry<String, String> paramEntry)
  {
    return size() > 192;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sm
 * JD-Core Version:    0.6.2
 */