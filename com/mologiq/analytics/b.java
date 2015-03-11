package com.mologiq.analytics;

import org.json.JSONObject;

public final class b
{
  private String a;
  private String b;
  private String c;
  private boolean d;
  private String e;
  private int f;
  private String g;
  private String h;
  private c i;
  private c j;
  private c k;

  public final String a()
  {
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("androidadvertisingid", this.c);
    localJSONObject.put("androidadvertisingidoptout", this.d);
    localJSONObject.put("androidid", this.e);
    localJSONObject.put("v", this.a);
    localJSONObject.put("d", this.b);
    localJSONObject.put("p", this.g);
    localJSONObject.put("wifi", this.f);
    localJSONObject.put("ip", this.h);
    if (this.k != null)
      localJSONObject.put("clicks", this.k.a());
    if (this.i != null)
      localJSONObject.put("impressions", this.i.a());
    if (this.j != null)
      localJSONObject.put("requests", this.j.a());
    return localJSONObject.toString();
  }

  public final void a(int paramInt)
  {
    this.f = paramInt;
  }

  public final void a(c paramc)
  {
    this.i = paramc;
  }

  public final void a(String paramString)
  {
    this.a = paramString;
  }

  public final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  public final void b(c paramc)
  {
    this.j = paramc;
  }

  public final void b(String paramString)
  {
    this.b = paramString;
  }

  public final void c(c paramc)
  {
    this.k = paramc;
  }

  public final void c(String paramString)
  {
    this.g = paramString;
  }

  public final void d(String paramString)
  {
    this.h = paramString;
  }

  public final void e(String paramString)
  {
    this.c = paramString;
  }

  public final void f(String paramString)
  {
    this.e = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.b
 * JD-Core Version:    0.6.2
 */