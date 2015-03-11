package com.mologiq.analytics;

import org.json.JSONObject;

final class d
{
  private String a;
  private String b;
  private String c;
  private boolean d;
  private String e;
  private int f;
  private String g;
  private String h;
  private e i;
  private e j;
  private e k;
  private boolean l;
  private boolean m;
  private boolean n;

  final String a()
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
    localJSONObject.put("isNetworkCheckEnableInUserSetting", this.l);
    localJSONObject.put("isLocationCheckEnableInUserSetting", this.n);
    localJSONObject.put("isAppInstallCheckEnableInUserSetting", this.m);
    if (this.k != null)
      localJSONObject.put("clicks", this.k.a());
    if (this.i != null)
      localJSONObject.put("impressions", this.i.a());
    if (this.j != null)
      localJSONObject.put("requests", this.j.a());
    return localJSONObject.toString();
  }

  final void a(int paramInt)
  {
    this.f = paramInt;
  }

  final void a(e parame)
  {
    this.i = parame;
  }

  final void a(String paramString)
  {
    this.a = paramString;
  }

  final void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }

  final void b(e parame)
  {
    this.j = parame;
  }

  final void b(String paramString)
  {
    this.b = paramString;
  }

  public final void b(boolean paramBoolean)
  {
    this.l = paramBoolean;
  }

  final void c(e parame)
  {
    this.k = parame;
  }

  final void c(String paramString)
  {
    this.g = paramString;
  }

  public final void c(boolean paramBoolean)
  {
    this.m = paramBoolean;
  }

  final void d(String paramString)
  {
    this.h = paramString;
  }

  public final void d(boolean paramBoolean)
  {
    this.n = paramBoolean;
  }

  final void e(String paramString)
  {
    this.c = paramString;
  }

  final void f(String paramString)
  {
    this.e = paramString;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.d
 * JD-Core Version:    0.6.2
 */