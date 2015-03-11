package com.mologiq.analytics;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aa
{
  private String a;
  private boolean b;
  private String c;
  private String d;
  private String e;
  private List<z> f;
  private String g;
  private String h;

  public final String a()
  {
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("androidadvertisingid", this.a);
    localJSONObject1.put("androidadvertisingidoptout", this.b);
    localJSONObject1.put("androidid", this.c);
    localJSONObject1.put("v", this.d);
    localJSONObject1.put("d", this.e);
    localJSONObject1.put("siteid", this.g);
    localJSONObject1.put("p", this.h);
    JSONArray localJSONArray;
    Iterator localIterator;
    if ((this.f != null) && (this.f.size() > 0))
    {
      localJSONArray = new JSONArray();
      localIterator = this.f.iterator();
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localJSONObject1.put("tp", localJSONArray);
        return localJSONObject1.toString();
      }
      z localz = (z)localIterator.next();
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("n", localz.a());
      localJSONObject2.put("v", localz.b());
      localJSONArray.put(localJSONObject2);
    }
  }

  public final void a(String paramString)
  {
    this.h = paramString;
  }

  public final void a(List<z> paramList)
  {
    this.f = paramList;
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final void b(String paramString)
  {
    this.d = paramString;
  }

  public final void c(String paramString)
  {
    this.e = paramString;
  }

  public final void d(String paramString)
  {
    this.g = paramString;
  }

  public final void e(String paramString)
  {
    this.a = paramString;
  }

  public final void f(String paramString)
  {
    this.c = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.aa
 * JD-Core Version:    0.6.2
 */