package com.mologiq.analytics;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

final class e
{
  private Long b;
  private Long c;
  private String d;
  private String e;
  private String f;
  private List<f> g;

  e(d paramd)
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
    if ((this.g != null) && (this.g.size() > 0))
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.g.iterator();
      while (localIterator.hasNext())
      {
        f localf = (f)localIterator.next();
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("n", localf.a());
        localJSONObject2.put("v", localf.b());
        localJSONArray.put(localJSONObject2);
      }
      localJSONObject1.put("tp", localJSONArray);
    }
    return localJSONObject1;
  }

  final void a(Long paramLong)
  {
    this.b = paramLong;
  }

  final void a(String paramString)
  {
    this.d = paramString;
  }

  final void a(List<f> paramList)
  {
    this.g = paramList;
  }

  final void b(Long paramLong)
  {
    this.c = paramLong;
  }

  final void b(String paramString)
  {
    this.f = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.e
 * JD-Core Version:    0.6.2
 */