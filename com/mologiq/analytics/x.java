package com.mologiq.analytics;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

final class x extends t
{
  private static final x c = new x(".f4532369-bca8-4847-bd88-d1779ee05f8f");
  private List<y> a = new ArrayList();
  private long b = 0L;

  private x(String paramString)
  {
    super(paramString);
  }

  static x b()
  {
    return c;
  }

  protected final String a()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("timestamp", this.b);
    JSONArray localJSONArray;
    Iterator localIterator;
    if ((this.a != null) && (this.a.size() > 0))
    {
      localJSONArray = new JSONArray();
      localIterator = this.a.iterator();
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localJSONObject1.put("tp", localJSONArray);
        return localJSONObject1.toString();
      }
      y localy = (y)localIterator.next();
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("n", localy.a());
      localJSONObject2.put("v", localy.b());
      localJSONArray.put(localJSONObject2);
    }
  }

  final void a(long paramLong)
  {
    this.b = paramLong;
  }

  protected final void a(String paramString)
  {
    JSONObject localJSONObject1 = new JSONObject(paramString);
    JSONArray localJSONArray;
    if (!localJSONObject1.isNull("core"))
    {
      JSONObject localJSONObject2 = localJSONObject1.getJSONObject("core");
      this.b = localJSONObject2.getLong("timestamp");
      if (!localJSONObject2.isNull("tp"))
      {
        localJSONArray = localJSONObject2.getJSONArray("tp");
        if ((localJSONArray != null) && (localJSONArray.length() > 0))
          this.a = new ArrayList();
      }
    }
    for (int i = 0; ; i++)
    {
      if (i >= localJSONArray.length())
        return;
      JSONObject localJSONObject3 = localJSONArray.getJSONObject(i);
      y localy = new y(this);
      localy.a(localJSONObject3.getString("n"));
      localy.b(localJSONObject3.getString("v"));
      this.a.add(localy);
    }
  }

  protected final void b(String paramString)
  {
    JSONArray localJSONArray;
    if ((paramString != null) && (paramString.length() > 0))
    {
      JSONObject localJSONObject1 = new JSONObject(paramString);
      if (!localJSONObject1.isNull("tp"))
      {
        localJSONArray = localJSONObject1.getJSONArray("tp");
        if ((localJSONArray != null) && (localJSONArray.length() > 0))
          this.a = new ArrayList();
      }
    }
    for (int i = 0; ; i++)
    {
      if (i >= localJSONArray.length())
        return;
      JSONObject localJSONObject2 = localJSONArray.getJSONObject(i);
      y localy = new y(this);
      localy.a(localJSONObject2.getString("n"));
      localy.b(localJSONObject2.getString("v"));
      this.a.add(localy);
    }
  }

  public final Map<String, Object> c()
  {
    if ((this.a != null) && (this.a.size() > 0))
    {
      HashMap localHashMap = new HashMap();
      Iterator localIterator = this.a.iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          return localHashMap;
        y localy = (y)localIterator.next();
        localHashMap.put(localy.a(), localy.b());
      }
    }
    return null;
  }

  public final void c(Context paramContext)
  {
    String str1 = af.a(paramContext) + System.getProperty("line.separator") + ".f4532369-bca8-4847-bd88-d1779ee05f8f";
    JSONObject localJSONObject = new JSONObject();
    String str2 = a();
    if ((str2 != null) && (str2.length() > 0))
      localJSONObject.put("core", new JSONObject(str2));
    if (("" != null) && ("".length() > 0))
      localJSONObject.put("extra", new JSONObject(""));
    af.a(str1, localJSONObject.toString());
  }

  final long d()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.x
 * JD-Core Version:    0.6.2
 */