package com.enflick.android.TextNow.api.common;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import textnow.v.m;
import textnow.z.u;

public final class a
{
  private static final String a = "f8ab2ceca9163724b6d126aea9620339";
  private static final String b = "TN_ANDROID";

  static
  {
    if (textnow.v.a.b)
    {
      a = "1850573d55ae2117a54f3a758cac3c22d35ccf7cfd375aea33380165a21536ca";
      b = "TN_AMAZON";
      return;
    }
  }

  public static String a(Context paramContext, Map<String, String> paramMap)
  {
    u localu = new u(paramContext);
    String str = localu.m();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("?client_type=").append(b);
    if ((localu.l()) && (str != null))
      localStringBuilder.append("&client_id=").append(new u(paramContext).m());
    if (paramMap != null)
    {
      Iterator localIterator = paramMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        localStringBuilder.append("&").append((String)localEntry.getKey()).append("=").append((String)localEntry.getValue());
      }
    }
    return localStringBuilder.toString();
  }

  public static String a(String paramString1, String paramString2, String paramString3)
  {
    return m.a(a + paramString1 + paramString2 + paramString3, "MD5");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.common.a
 * JD-Core Version:    0.6.2
 */