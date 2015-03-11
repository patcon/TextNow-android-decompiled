package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class bg
  implements bc
{
  private final bd nd;

  public bg(bd parambd)
  {
    this.nd = parambd;
  }

  private static boolean a(Map<String, String> paramMap)
  {
    return "1".equals(paramMap.get("custom_close"));
  }

  private static int b(Map<String, String> paramMap)
  {
    String str = (String)paramMap.get("o");
    if (str != null)
    {
      if ("p".equalsIgnoreCase(str))
        return eo.bS();
      if ("l".equalsIgnoreCase(str))
        return eo.bR();
    }
    return -1;
  }

  public final void b(ex paramex, Map<String, String> paramMap)
  {
    String str1 = (String)paramMap.get("a");
    if (str1 == null)
      eu.D("Action missing from an open GMSG.");
    ey localey;
    String str2;
    String str3;
    do
    {
      return;
      localey = paramex.cb();
      if ("expand".equalsIgnoreCase(str1))
      {
        if (paramex.ce())
        {
          eu.D("Cannot expand WebView that is already expanded.");
          return;
        }
        localey.a(a(paramMap), b(paramMap));
        return;
      }
      if ("webapp".equalsIgnoreCase(str1))
      {
        String str4 = (String)paramMap.get("u");
        if (str4 != null)
        {
          localey.a(a(paramMap), b(paramMap), str4);
          return;
        }
        localey.a(a(paramMap), b(paramMap), (String)paramMap.get("html"), (String)paramMap.get("baseurl"));
        return;
      }
      if (!"in_app_purchase".equalsIgnoreCase(str1))
        break;
      str2 = (String)paramMap.get("product_id");
      str3 = (String)paramMap.get("report_urls");
    }
    while (this.nd == null);
    if ((str3 != null) && (!str3.isEmpty()))
    {
      String[] arrayOfString = str3.split(" ");
      this.nd.a(str2, new ArrayList(Arrays.asList(arrayOfString)));
      return;
    }
    this.nd.a(str2, new ArrayList());
    return;
    localey.a(new ce((String)paramMap.get("i"), (String)paramMap.get("u"), (String)paramMap.get("m"), (String)paramMap.get("p"), (String)paramMap.get("c"), (String)paramMap.get("f"), (String)paramMap.get("e")));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.bg
 * JD-Core Version:    0.6.2
 */