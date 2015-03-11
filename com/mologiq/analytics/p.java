package com.mologiq.analytics;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

final class p
{
  private String a;
  private String b;
  private String c;
  private ah d;

  final String a(Context paramContext)
  {
    ag localag = ag.d(paramContext);
    if (localag.t() == 0)
      return "";
    JSONObject localJSONObject1 = new JSONObject();
    localJSONObject1.put("timestamp", System.currentTimeMillis());
    localJSONObject1.put("product", this.d.d());
    localJSONObject1.put("p", this.c);
    localJSONObject1.put("v", this.a);
    localJSONObject1.put("d", this.b);
    localJSONObject1.put("androidadvertisingid", this.d.m());
    localJSONObject1.put("androidadvertisingidoptout", this.d.n());
    localJSONObject1.put("androidid", this.d.o());
    localJSONObject1.put("os", this.d.e());
    localJSONObject1.put("model", this.d.f());
    if (this.d.B())
    {
      localJSONObject1.put("location", this.d.c());
      localJSONObject1.put("locationAltitude", this.d.s());
      localJSONObject1.put("locationTimestamp", this.d.t());
      localJSONObject1.put("locationAccuracy", this.d.u());
      localJSONObject1.put("locationSpeed", this.d.v());
    }
    localJSONObject1.put("classificationid", this.d.C());
    localJSONObject1.put("isNetworkCheckEnableInUserSetting", this.d.z());
    localJSONObject1.put("isLocationCheckEnableInUserSetting", this.d.B());
    localJSONObject1.put("isAppInstallCheckEnableInUserSetting", this.d.A());
    localJSONObject1.put("device", this.d.g());
    if (this.d.z())
    {
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
          JSONArray localJSONArray2 = new JSONArray();
          Iterator localIterator2 = this.d.r().a().iterator();
          while (localIterator2.hasNext())
          {
            am localam = (am)localIterator2.next();
            JSONObject localJSONObject4 = new JSONObject();
            localJSONObject4.put("ssid", localam.a());
            localJSONArray2.put(localJSONObject4);
          }
          localJSONObject1.put("wifilist", localJSONArray2);
        }
      }
      localJSONObject1.put("carrier", this.d.y());
    }
    localJSONObject1.put("api", this.d.h());
    localJSONObject1.put("brand", this.d.i());
    localJSONObject1.put("language", this.d.j());
    localJSONObject1.put("countryCode", this.d.q());
    localJSONObject1.put("timezone", this.d.p());
    if (localag.h())
    {
      ai localai = this.d.d(paramContext);
      if (localai != null)
      {
        localJSONObject1.put("policy", localai.a());
        if ((localai.b() != null) && (localai.b().size() > 0))
          localJSONObject1.put("audience", new JSONArray(localai.b()));
        localJSONObject1.put("appcount", localai.c());
        localJSONObject1.put("lastappid", localai.h());
        localJSONObject1.put("meanversion", localai.d());
        if ((localai.e() != null) && (localai.e().size() > 0))
          localJSONObject1.put("campaigns", new JSONArray(localai.e()));
        if ((localai.g() != null) && (localai.g().size() > 0))
        {
          JSONArray localJSONArray1 = new JSONArray();
          Iterator localIterator1 = localai.g().keySet().iterator();
          while (localIterator1.hasNext())
          {
            Integer localInteger = (Integer)localIterator1.next();
            JSONObject localJSONObject2 = new JSONObject();
            localJSONObject2.put("classificationid", localInteger);
            localJSONObject2.put("count", localai.g().get(localInteger));
            localJSONArray1.put(localJSONObject2);
          }
          localJSONObject1.put("classifications", localJSONArray1);
        }
        if ((localai.f() != null) && (localai.f().size() > 0))
          localJSONObject1.put("appids", new JSONArray(localai.f()));
      }
    }
    if ((this.d.x() != null) && (this.d.x().size() > 0))
      localJSONObject1.put("urlids", new JSONArray(this.d.x()));
    return localJSONObject1.toString();
  }

  final void a(ah paramah)
  {
    this.d = paramah;
  }

  final void a(String paramString)
  {
    this.a = paramString;
  }

  final void b(String paramString)
  {
    this.b = paramString;
  }

  final void c(String paramString)
  {
    this.c = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.p
 * JD-Core Version:    0.6.2
 */