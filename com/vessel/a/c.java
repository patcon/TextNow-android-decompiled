package com.vessel.a;

import android.text.TextUtils;
import com.vessel.VesselSDK;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  public static String a(f paramf)
  {
    try
    {
      JSONObject localJSONObject = a("activate_test");
      localJSONObject.put("test", paramf.e());
      String str = localJSONObject.toString();
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String a(String paramString, JSONArray paramJSONArray, JSONObject paramJSONObject)
  {
    if ((paramString == null) || (paramJSONArray == null) || (paramJSONArray.length() == 0))
      return null;
    try
    {
      JSONObject localJSONObject = a("checkpoint");
      localJSONObject.put("name", paramString);
      localJSONObject.put("active_tests", paramJSONArray);
      if (paramJSONObject != null)
        localJSONObject.put("meta_data", paramJSONObject);
      String str = localJSONObject.toString();
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static String a(JSONObject paramJSONObject)
  {
    try
    {
      JSONObject localJSONObject = a("init");
      localJSONObject.put("device_state", paramJSONObject);
      String str = localJSONObject.toString();
      return str;
    }
    catch (Exception localException)
    {
    }
    return null;
  }

  public static List<String> a(HashMap<String, Long> paramHashMap, long paramLong, JSONArray paramJSONArray)
  {
    if ((paramHashMap == null) || (paramHashMap.isEmpty()))
      return null;
    ArrayList localArrayList = new ArrayList(paramHashMap.size());
    Iterator localIterator = paramHashMap.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      JSONObject localJSONObject = a((String)localEntry.getKey(), ((Long)localEntry.getValue()).longValue(), paramLong, paramJSONArray);
      if (localJSONObject != null)
        localArrayList.add(localJSONObject.toString());
    }
    return localArrayList;
  }

  private static JSONObject a(String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("event_type", paramString);
    localJSONObject.put("timestamp", System.currentTimeMillis() / 1000L);
    String str = VesselSDK.getUserId();
    if (!TextUtils.isEmpty(str))
      localJSONObject.put("userid", str);
    return localJSONObject;
  }

  public static JSONObject a(String paramString, long paramLong1, long paramLong2, JSONArray paramJSONArray)
  {
    long l1 = paramLong2 - paramLong1;
    try
    {
      long l2 = TimeUnit.SECONDS.convert(l1, TimeUnit.NANOSECONDS);
      if (l2 <= 0L)
        return null;
      JSONObject localJSONObject = a("session");
      localJSONObject.put("name", paramString);
      localJSONObject.put("active_tests", paramJSONArray);
      localJSONObject.put("duration", l2);
      return localJSONObject;
    }
    catch (Exception localException)
    {
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.vessel.a.c
 * JD-Core Version:    0.6.2
 */