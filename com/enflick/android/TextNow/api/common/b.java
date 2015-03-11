package com.enflick.android.TextNow.api.common;

import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import textnow.t.c;

public final class b
{
  public static <T> T a(Object paramObject, Class<T> paramClass)
  {
    int i = 0;
    Object localObject1 = null;
    try
    {
      boolean bool1 = Map.class.isAssignableFrom(paramClass);
      localObject1 = null;
      if ((bool1) && ((paramObject instanceof JSONObject)))
      {
        localObject1 = paramClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        Map localMap = (Map)localObject1;
        JSONObject localJSONObject2 = (JSONObject)paramObject;
        Iterator localIterator = localJSONObject2.keys();
        while (localIterator.hasNext())
        {
          String str2 = (String)localIterator.next();
          localMap.put(str2, localJSONObject2.get(str2));
        }
      }
    }
    catch (Throwable localThrowable)
    {
      Log.getStackTraceString(localThrowable);
    }
    label408: label414: label417: label421: 
    while (true)
    {
      return localObject1;
      boolean bool2 = paramClass.isArray();
      localObject1 = null;
      Object[] arrayOfObject;
      if (bool2)
      {
        boolean bool3 = paramObject instanceof JSONArray;
        localObject1 = null;
        if (bool3)
        {
          Class localClass = paramClass.getComponentType();
          JSONArray localJSONArray = (JSONArray)paramObject;
          int j = localJSONArray.length();
          arrayOfObject = (Object[])Array.newInstance(localClass, j);
          localObject1 = null;
          if (i >= j)
            break label414;
          Object localObject2 = localJSONArray.get(i);
          boolean bool4 = localObject2 instanceof JSONObject;
          localObject1 = null;
          if ((bool4) || ((localObject2 instanceof JSONArray)))
          {
            arrayOfObject[i] = a(localObject2, localClass);
            break label408;
          }
          arrayOfObject[i] = localObject2;
          break label408;
        }
      }
      JSONObject localJSONObject1;
      Field[] arrayOfField;
      int k;
      if ((paramObject instanceof JSONObject))
      {
        localObject1 = paramClass.getConstructor(new Class[0]).newInstance(new Object[0]);
        localJSONObject1 = (JSONObject)paramObject;
        arrayOfField = paramClass.getDeclaredFields();
        k = arrayOfField.length;
      }
      while (true)
      {
        if (i >= k)
          break label421;
        Field localField = arrayOfField[i];
        c localc = (c)localField.getAnnotation(c.class);
        if (localc != null)
        {
          String str1 = localc.a();
          if (!localJSONObject1.isNull(str1))
          {
            Object localObject3 = localJSONObject1.get(str1);
            if (((localObject3 instanceof JSONObject)) || ((localObject3 instanceof JSONArray)))
            {
              localField.set(localObject1, a(localObject3, localField.getType()));
            }
            else
            {
              localField.set(localObject1, localObject3);
              break label417;
              new StringBuilder().append("Unable to parse object ").append(paramObject).append(" into type ").append(paramClass.getName()).toString();
              return null;
              i++;
              break;
              return arrayOfObject;
            }
          }
        }
        i++;
      }
    }
  }

  public static String a(Object paramObject)
  {
    JSONObject localJSONObject = b(paramObject);
    if (localJSONObject == null)
      return null;
    return localJSONObject.toString();
  }

  public static JSONObject b(Object paramObject)
  {
    try
    {
      JSONObject localJSONObject = new JSONObject();
      for (Field localField : paramObject.getClass().getDeclaredFields())
      {
        c localc = (c)localField.getAnnotation(c.class);
        if (localc != null)
          localJSONObject.put(localc.a(), localField.get(paramObject));
      }
      return localJSONObject;
    }
    catch (Exception localException)
    {
      new StringBuilder().append("error serializing object").append(paramObject.getClass().getSimpleName()).toString();
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.common.b
 * JD-Core Version:    0.6.2
 */