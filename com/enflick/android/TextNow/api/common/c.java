package com.enflick.android.TextNow.api.common;

import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import textnow.t.a;
import textnow.t.f;

public abstract class c
{
  private String a;
  private Map<String, String> b;

  private void c()
  {
    JSONObject localJSONObject = new JSONObject();
    HashMap localHashMap = new HashMap();
    Field[] arrayOfField = getClass().getFields();
    int i = arrayOfField.length;
    label228: label362: label369: for (int j = 0; ; j++)
      if (j < i)
      {
        Field localField = arrayOfField[j];
        try
        {
          if (this.a == null)
          {
            locala = (a)localField.getAnnotation(a.class);
            if (locala != null)
            {
              localObject = localField.get(this);
              if ((localObject == null) || (!localObject.getClass().isArray()))
                break label228;
              JSONArray localJSONArray = new JSONArray();
              Object[] arrayOfObject = (Object[])localObject;
              int k = arrayOfObject.length;
              for (int m = 0; m < k; m++)
                localJSONArray.put(arrayOfObject[m]);
              localJSONObject.putOpt(locala.a(), localJSONArray);
            }
          }
          while (true)
          {
            if (this.b != null)
              break label369;
            f localf = (f)localField.getAnnotation(f.class);
            if (localf == null)
              break label369;
            String str2 = String.valueOf(localField.get(this));
            if (localf.b().equals(str2))
              break label369;
            localHashMap.put(localf.a(), URLEncoder.encode(str2, "UTF-8"));
            break label369;
            if (!(localObject instanceof String))
              break;
            String str3 = String.valueOf(localObject);
            if (!locala.b().equals(str3))
              localJSONObject.put(locala.a(), str3);
          }
        }
        catch (ClassCastException localClassCastException)
        {
          while (true)
          {
            a locala;
            Object localObject;
            localClassCastException.printStackTrace();
            break;
            if (!locala.b().equals(String.valueOf(localObject)))
              localJSONObject.put(locala.a(), localObject);
          }
        }
        catch (Exception localException)
        {
          localException.printStackTrace();
        }
      }
      else
      {
        if (this.a == null)
          if (localJSONObject.length() <= 0)
            break label362;
        for (String str1 = localJSONObject.toString(); ; str1 = "")
        {
          this.a = str1;
          this.b = localHashMap;
          return;
        }
      }
  }

  public final String a()
  {
    this.a = null;
    if (this.a == null)
      c();
    return this.a;
  }

  public final Map<String, String> b()
  {
    if (this.b == null)
      c();
    if (this.b.isEmpty())
      return null;
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.enflick.android.TextNow.api.common.c
 * JD-Core Version:    0.6.2
 */