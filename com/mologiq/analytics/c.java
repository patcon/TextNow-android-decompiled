package com.mologiq.analytics;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c
{
  private Long b;
  private Long c;
  private String d;
  private String e;
  private String f;
  private List<d> g;

  public c(b paramb)
  {
  }

  final JSONObject a()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("ts", this.b);
    localJSONObject1.put("bid", this.c);
    localJSONObject1.put("sid", this.d);
    localJSONObject1.put("pid", this.e);
    localJSONObject1.put("p", this.f);
    JSONArray localJSONArray;
    Iterator localIterator;
    if ((this.g != null) && (this.g.size() > 0))
    {
      localJSONArray = new JSONArray();
      localIterator = this.g.iterator();
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localJSONObject1.put("tp", localJSONArray);
        return localJSONObject1;
      }
      d locald = (d)localIterator.next();
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("n", locald.a());
      localJSONObject2.put("v", locald.b());
      localJSONArray.put(localJSONObject2);
    }
  }

  public final void a(Long paramLong)
  {
    this.b = paramLong;
  }

  public final void a(String paramString)
  {
    this.d = paramString;
  }

  public final void a(List<d> paramList)
  {
    this.g = paramList;
  }

  public final void b(Long paramLong)
  {
    this.c = paramLong;
  }

  public final void b(String paramString)
  {
    this.f = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.c
 * JD-Core Version:    0.6.2
 */