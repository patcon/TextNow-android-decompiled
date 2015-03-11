package com.flurry.sdk;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class cz
{
  private static final String a = cz.class.getSimpleName();

  public Map<String, List<String>> a(String paramString)
  {
    eo.a(3, a, "Parsing referrer map");
    if (paramString == null)
      return Collections.emptyMap();
    HashMap localHashMap = new HashMap();
    String[] arrayOfString1 = paramString.split("&");
    int i = arrayOfString1.length;
    int j = 0;
    if (j < i)
    {
      String[] arrayOfString2 = arrayOfString1[j].split("=");
      if (arrayOfString2.length != 2)
        eo.a(5, a, "Invalid referrer Element: " + arrayOfString1[j] + " in referrer tag " + paramString);
      while (true)
      {
        j++;
        break;
        String str1 = URLDecoder.decode(arrayOfString2[0]);
        String str2 = URLDecoder.decode(arrayOfString2[1]);
        if (localHashMap.get(str1) == null)
          localHashMap.put(str1, new ArrayList());
        ((List)localHashMap.get(str1)).add(str2);
      }
    }
    Iterator localIterator = localHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      eo.a(3, a, "entry: " + (String)localEntry.getKey() + "=" + localEntry.getValue());
    }
    StringBuilder localStringBuilder = new StringBuilder();
    if (localHashMap.get("utm_source") == null)
      localStringBuilder.append("Campaign Source is missing.\n");
    if (localHashMap.get("utm_medium") == null)
      localStringBuilder.append("Campaign Medium is missing.\n");
    if (localHashMap.get("utm_campaign") == null)
      localStringBuilder.append("Campaign Name is missing.\n");
    if (localStringBuilder.length() > 0)
      eo.a(5, a, "Detected missing referrer keys : " + localStringBuilder.toString());
    return localHashMap;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.cz
 * JD-Core Version:    0.6.2
 */