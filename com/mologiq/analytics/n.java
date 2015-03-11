package com.mologiq.analytics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class n
{
  private static Object a(Object paramObject)
  {
    if (paramObject == JSONObject.NULL)
      paramObject = null;
    do
    {
      return paramObject;
      if ((paramObject instanceof JSONObject))
        return a((JSONObject)paramObject);
    }
    while (!(paramObject instanceof JSONArray));
    JSONArray localJSONArray = (JSONArray)paramObject;
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; ; i++)
    {
      if (i >= localJSONArray.length())
        return localArrayList;
      localArrayList.add(a(localJSONArray.get(i)));
    }
  }

  public static Map<String, Object> a(JSONObject paramJSONObject)
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramJSONObject.keys();
    while (true)
    {
      if (!localIterator.hasNext())
        return localHashMap;
      String str = (String)localIterator.next();
      localHashMap.put(str, a(paramJSONObject.get(str)));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.n
 * JD-Core Version:    0.6.2
 */