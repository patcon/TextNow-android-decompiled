package com.mologiq.analytics;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class af
{
  private String a;
  private boolean b;
  private String c;
  private String d;
  private String e;
  private List<ae> f;
  private String g;
  private String h;
  private double i;
  private double j;
  private double k;
  private long l;
  private double m;
  private double n;
  private boolean o;

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
    if (this.o)
    {
      localJSONObject1.put("location", this.i + "," + this.j);
      localJSONObject1.put("locationAltitude", this.k);
      localJSONObject1.put("locationTimestamp", this.l);
      localJSONObject1.put("locationAccuracy", this.m);
      localJSONObject1.put("locationSpeed", this.n);
    }
    if ((this.f != null) && (this.f.size() > 0))
    {
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = this.f.iterator();
      while (localIterator.hasNext())
      {
        ae localae = (ae)localIterator.next();
        JSONObject localJSONObject2 = new JSONObject();
        localJSONObject2.put("n", localae.a());
        localJSONObject2.put("v", localae.b());
        localJSONArray.put(localJSONObject2);
      }
      localJSONObject1.put("tp", localJSONArray);
    }
    return localJSONObject1.toString();
  }

  public final void a(double paramDouble)
  {
    this.i = paramDouble;
  }

  public final void a(long paramLong)
  {
    this.l = paramLong;
  }

  public final void a(String paramString)
  {
    this.h = paramString;
  }

  public final void a(List<ae> paramList)
  {
    this.f = paramList;
  }

  public final void a(boolean paramBoolean)
  {
    this.b = paramBoolean;
  }

  public final void b(double paramDouble)
  {
    this.j = paramDouble;
  }

  public final void b(String paramString)
  {
    this.d = paramString;
  }

  public final void b(boolean paramBoolean)
  {
    this.o = true;
  }

  public final void c(double paramDouble)
  {
    this.k = paramDouble;
  }

  public final void c(String paramString)
  {
    this.e = paramString;
  }

  public final void d(double paramDouble)
  {
    this.m = paramDouble;
  }

  public final void d(String paramString)
  {
    this.g = paramString;
  }

  public final void e(double paramDouble)
  {
    this.n = paramDouble;
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

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.af
 * JD-Core Version:    0.6.2
 */