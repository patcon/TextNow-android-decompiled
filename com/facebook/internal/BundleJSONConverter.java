package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class BundleJSONConverter
{
  private static final Map<Class<?>, BundleJSONConverter.Setter> SETTERS;

  static
  {
    HashMap localHashMap = new HashMap();
    SETTERS = localHashMap;
    localHashMap.put(Boolean.class, new BundleJSONConverter.Setter()
    {
      public final void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousBundle.putBoolean(paramAnonymousString, ((Boolean)paramAnonymousObject).booleanValue());
      }

      public final void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    SETTERS.put(Integer.class, new BundleJSONConverter.Setter()
    {
      public final void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousBundle.putInt(paramAnonymousString, ((Integer)paramAnonymousObject).intValue());
      }

      public final void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    SETTERS.put(Long.class, new BundleJSONConverter.Setter()
    {
      public final void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousBundle.putLong(paramAnonymousString, ((Long)paramAnonymousObject).longValue());
      }

      public final void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    SETTERS.put(Double.class, new BundleJSONConverter.Setter()
    {
      public final void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousBundle.putDouble(paramAnonymousString, ((Double)paramAnonymousObject).doubleValue());
      }

      public final void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    SETTERS.put(String.class, new BundleJSONConverter.Setter()
    {
      public final void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousBundle.putString(paramAnonymousString, (String)paramAnonymousObject);
      }

      public final void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
      {
        paramAnonymousJSONObject.put(paramAnonymousString, paramAnonymousObject);
      }
    });
    SETTERS.put([Ljava.lang.String.class, new BundleJSONConverter.Setter()
    {
      public final void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
      {
        throw new IllegalArgumentException("Unexpected type from JSON");
      }

      public final void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
      {
        JSONArray localJSONArray = new JSONArray();
        String[] arrayOfString = (String[])paramAnonymousObject;
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
          localJSONArray.put(arrayOfString[j]);
        paramAnonymousJSONObject.put(paramAnonymousString, localJSONArray);
      }
    });
    SETTERS.put(JSONArray.class, new BundleJSONConverter.Setter()
    {
      public final void setOnBundle(Bundle paramAnonymousBundle, String paramAnonymousString, Object paramAnonymousObject)
      {
        JSONArray localJSONArray = (JSONArray)paramAnonymousObject;
        ArrayList localArrayList = new ArrayList();
        if (localJSONArray.length() == 0)
        {
          paramAnonymousBundle.putStringArrayList(paramAnonymousString, localArrayList);
          return;
        }
        int i = 0;
        while (i < localJSONArray.length())
        {
          Object localObject = localJSONArray.get(i);
          if ((localObject instanceof String))
          {
            localArrayList.add((String)localObject);
            i++;
          }
          else
          {
            throw new IllegalArgumentException("Unexpected type in an array: " + localObject.getClass());
          }
        }
        paramAnonymousBundle.putStringArrayList(paramAnonymousString, localArrayList);
      }

      public final void setOnJSON(JSONObject paramAnonymousJSONObject, String paramAnonymousString, Object paramAnonymousObject)
      {
        throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
      }
    });
  }

  public static Bundle convertToBundle(JSONObject paramJSONObject)
  {
    Bundle localBundle = new Bundle();
    Iterator localIterator = paramJSONObject.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramJSONObject.get(str);
      if ((localObject != null) && (localObject != JSONObject.NULL))
        if ((localObject instanceof JSONObject))
        {
          localBundle.putBundle(str, convertToBundle((JSONObject)localObject));
        }
        else
        {
          BundleJSONConverter.Setter localSetter = (BundleJSONConverter.Setter)SETTERS.get(localObject.getClass());
          if (localSetter == null)
            throw new IllegalArgumentException("Unsupported type: " + localObject.getClass());
          localSetter.setOnBundle(localBundle, str, localObject);
        }
    }
    return localBundle;
  }

  public static JSONObject convertToJSON(Bundle paramBundle)
  {
    JSONObject localJSONObject = new JSONObject();
    Iterator localIterator1 = paramBundle.keySet().iterator();
    while (localIterator1.hasNext())
    {
      String str = (String)localIterator1.next();
      Object localObject = paramBundle.get(str);
      if (localObject != null)
        if ((localObject instanceof List))
        {
          JSONArray localJSONArray = new JSONArray();
          Iterator localIterator2 = ((List)localObject).iterator();
          while (localIterator2.hasNext())
            localJSONArray.put((String)localIterator2.next());
          localJSONObject.put(str, localJSONArray);
        }
        else if ((localObject instanceof Bundle))
        {
          localJSONObject.put(str, convertToJSON((Bundle)localObject));
        }
        else
        {
          BundleJSONConverter.Setter localSetter = (BundleJSONConverter.Setter)SETTERS.get(localObject.getClass());
          if (localSetter == null)
            throw new IllegalArgumentException("Unsupported type: " + localObject.getClass());
          localSetter.setOnJSON(localJSONObject, str, localObject);
        }
    }
    return localJSONObject;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.facebook.internal.BundleJSONConverter
 * JD-Core Version:    0.6.2
 */