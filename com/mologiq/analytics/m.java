package com.mologiq.analytics;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public final class m
{
  private String a;
  private String b;
  private String c;
  private ac d;

  public final String a(Context paramContext)
  {
    ab localab = ab.d(paramContext);
    if (localab.q() == 0)
      return "";
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("timestamp", System.currentTimeMillis());
    localJSONObject1.put("product", this.d.d());
    localJSONObject1.put("p", this.c);
    localJSONObject1.put("v", this.a);
    localJSONObject1.put("d", this.b);
    localJSONObject1.put("androidadvertiserid", this.d.m());
    localJSONObject1.put("androidadvertiseridoptout", this.d.n());
    localJSONObject1.put("androidid", this.d.o());
    localJSONObject1.put("os", this.d.e());
    localJSONObject1.put("model", this.d.f());
    localJSONObject1.put("location", this.d.c());
    localJSONObject1.put("locationAltitude", this.d.s());
    localJSONObject1.put("locationTimestamp", this.d.t());
    localJSONObject1.put("locationAccuracy", this.d.u());
    localJSONObject1.put("locationSpeed", this.d.v());
    localJSONObject1.put("device", this.d.g());
    JSONArray localJSONArray2;
    Iterator localIterator2;
    if (this.d.r() != null)
    {
      if (this.d.r().b() != null)
      {
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject3.put("ssid", this.d.r().b().a());
        localJSONObject1.put("wificurrent", localJSONObject3);
      }
      if (this.d.r().a() != null)
      {
        localJSONArray2 = new JSONArray();
        localIterator2 = this.d.r().a().iterator();
        if (localIterator2.hasNext())
          break label687;
        localJSONObject1.put("wifilist", localJSONArray2);
      }
    }
    localJSONObject1.put("api", this.d.h());
    localJSONObject1.put("brand", this.d.i());
    localJSONObject1.put("language", this.d.j());
    localJSONObject1.put("countryCode", this.d.q());
    localJSONObject1.put("timezone", this.d.p());
    localJSONObject1.put("carrier", this.d.x());
    ad localad;
    JSONArray localJSONArray1;
    Iterator localIterator1;
    if (localab.h())
    {
      localad = this.d.d(paramContext);
      if (localad != null)
      {
        localJSONObject1.put("policy", localad.a());
        if ((localad.b() != null) && (localad.b().size() > 0))
          localJSONObject1.put("audience", new JSONArray(localad.b()));
        localJSONObject1.put("appcount", localad.c());
        localJSONObject1.put("meanversion", localad.d());
        if ((localad.e() != null) && (localad.e().size() > 0))
          localJSONObject1.put("campaigns", new JSONArray(localad.e()));
        if ((localad.g() != null) && (localad.g().size() > 0))
        {
          localJSONArray1 = new JSONArray();
          localIterator1 = localad.g().keySet().iterator();
        }
      }
    }
    while (true)
    {
      if (!localIterator1.hasNext())
      {
        localJSONObject1.put("classifications", localJSONArray1);
        if ((localad.f() != null) && (localad.f().size() > 0))
          localJSONObject1.put("appids", new JSONArray(localad.f()));
        return localJSONObject1.toString();
        label687: ah localah = (ah)localIterator2.next();
        JSONObject localJSONObject4 = new JSONObject();
        localJSONObject4.put("ssid", localah.a());
        localJSONArray2.put(localJSONObject4);
        break;
      }
      Integer localInteger = (Integer)localIterator1.next();
      JSONObject localJSONObject2 = new JSONObject();
      localJSONObject2.put("classificationid", localInteger);
      localJSONObject2.put("count", localad.g().get(localInteger));
      localJSONArray1.put(localJSONObject2);
    }
  }

  public final void a(ac paramac)
  {
    this.d = paramac;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  public final void b(String paramString)
  {
    this.b = paramString;
  }

  public final void c(String paramString)
  {
    this.c = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.m
 * JD-Core Version:    0.6.2
 */