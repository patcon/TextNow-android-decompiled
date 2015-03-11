package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

final class ah extends w
{
  private static final ah F = new ah(".567ac581-718b-42d4-82d3-0daa55e13da7");
  private String A;
  private boolean B = true;
  private boolean C = true;
  private boolean D = true;
  private int E = 1;
  private String a;
  private String b;
  private boolean c = false;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private String m;
  private String n;
  private String o;
  private aj p;
  private double q;
  private double r;
  private List<Integer> s;
  private List<Integer> t;
  private List<m> u;
  private Map<Integer, Integer> v;
  private double w;
  private long x;
  private double y;
  private double z;

  private ah(String paramString)
  {
    super(paramString);
  }

  private String D()
  {
    JSONObject localJSONObject1 = new JSONObject();
    if (this.p != null)
    {
      aj localaj = this.p;
      JSONObject localJSONObject2 = new JSONObject();
      if (localaj.b() != null)
      {
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject3.put("ssid", localaj.b().a());
        localJSONObject2.put("wificurrent", localJSONObject3);
      }
      if (localaj.a() != null)
      {
        JSONArray localJSONArray = new JSONArray();
        Iterator localIterator = localaj.a().iterator();
        while (localIterator.hasNext())
        {
          am localam = (am)localIterator.next();
          JSONObject localJSONObject4 = new JSONObject();
          localJSONObject4.put("ssid", localam.a());
          localJSONArray.put(localJSONObject4);
        }
        localJSONObject2.put("wifilist", localJSONArray);
      }
      localJSONObject1.put("NetworkInfo", localJSONObject2);
    }
    return localJSONObject1.toString();
  }

  static ah b()
  {
    return F;
  }

  private static int e(Context paramContext)
  {
    int i1;
    try
    {
      o localo = o.a(paramContext);
      try
      {
        int i2 = localo.c();
        i1 = i2;
        return i1;
      }
      finally
      {
        if (localo != null)
          localo.a();
      }
    }
    catch (Throwable localThrowable)
    {
      ak.a(ak.a(localThrowable));
      i1 = 0;
    }
    return i1;
  }

  private static int f(Context paramContext)
  {
    int i1;
    try
    {
      o localo = o.a(paramContext);
      try
      {
        int i2 = localo.b();
        i1 = i2;
        return i1;
      }
      finally
      {
        if (localo != null)
          localo.a();
      }
    }
    catch (Throwable localThrowable)
    {
      ak.a(ak.a(localThrowable));
      i1 = 0;
    }
    return i1;
  }

  public final boolean A()
  {
    return this.C;
  }

  public final boolean B()
  {
    return this.D;
  }

  public final int C()
  {
    return this.E;
  }

  protected final String a()
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("product", this.a);
    localJSONObject2.put("androidadvertisingid", this.b);
    localJSONObject2.put("androidadvertisingoptout", this.c);
    localJSONObject2.put("androidid", this.d);
    if ((this.s != null) && (this.s.size() > 0))
      localJSONObject2.put("installedapps", new JSONArray(this.s));
    if ((this.u != null) && (this.u.size() > 0))
    {
      JSONArray localJSONArray2 = new JSONArray();
      Iterator localIterator2 = this.u.iterator();
      while (localIterator2.hasNext())
      {
        m localm = (m)localIterator2.next();
        JSONObject localJSONObject6 = new JSONObject();
        localJSONObject6.put("id", localm.a);
        localJSONObject6.put("url", localm.b);
        localJSONArray2.put(localJSONObject6);
      }
      localJSONObject2.put("appurls", localJSONArray2);
    }
    if ((this.v != null) && (this.v.size() > 0))
    {
      JSONArray localJSONArray1 = new JSONArray();
      Iterator localIterator1 = this.v.keySet().iterator();
      while (localIterator1.hasNext())
      {
        Integer localInteger = (Integer)localIterator1.next();
        JSONObject localJSONObject5 = new JSONObject();
        localJSONObject5.put("classificationid", localInteger);
        localJSONObject5.put("count", this.v.get(localInteger));
        localJSONArray1.put(localJSONObject5);
      }
      localJSONObject2.put("classifications", localJSONArray1);
    }
    JSONObject localJSONObject3 = new JSONObject();
    localJSONObject3.put("os", this.e);
    localJSONObject3.put("model", this.f);
    localJSONObject3.put("device", this.g);
    localJSONObject3.put("manufacturer", this.h);
    localJSONObject3.put("brand", this.i);
    localJSONObject3.put("timezone", this.j);
    localJSONObject3.put("timezoneId", this.k);
    localJSONObject3.put("country_code", this.l);
    localJSONObject3.put("device_resolution", this.m);
    localJSONObject3.put("language", this.n);
    localJSONObject3.put("carrier", this.o);
    localJSONObject3.put("classificationid", this.E);
    localJSONObject3.put("isAppInstallCheckEnableInUserSetting", this.C);
    localJSONObject3.put("isLocationCheckEnableInUserSetting", this.D);
    localJSONObject3.put("isNetworkCheckEnableInUserSetting", this.B);
    localJSONObject2.put("DeviceInfo", localJSONObject3);
    localJSONObject1.put("DeviceEvent", localJSONObject2);
    JSONObject localJSONObject4 = new JSONObject();
    localJSONObject4.put("latitude", this.q);
    localJSONObject4.put("longitude", this.r);
    localJSONObject2.put("LocationInfo", localJSONObject4);
    return localJSONObject1.toString();
  }

  final void a(double paramDouble)
  {
    this.q = paramDouble;
  }

  public final void a(int paramInt)
  {
    this.E = paramInt;
  }

  final void a(long paramLong)
  {
    this.x = paramLong;
  }

  final void a(aj paramaj)
  {
    this.p = paramaj;
  }

  @SuppressLint({"UseSparseArrays"})
  protected final void a(String paramString)
  {
    int i1 = 0;
    if ((paramString != null) && (paramString.length() > 0))
    {
      JSONObject localJSONObject1 = new JSONObject(paramString);
      if (!localJSONObject1.isNull("core"))
      {
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("core");
        if (!localJSONObject2.isNull("DeviceEvent"))
        {
          JSONObject localJSONObject3 = localJSONObject2.getJSONObject("DeviceEvent");
          if (!localJSONObject3.isNull("product"))
            this.a = localJSONObject3.getString("product");
          if (!localJSONObject3.isNull("androidadvertisingid"))
            this.b = localJSONObject3.getString("androidadvertisingid");
          if (!localJSONObject3.isNull("androidadvertisingidout"))
            this.c = localJSONObject3.getBoolean("androidadvertisingidoptout");
          if (!localJSONObject3.isNull("androidid"))
            this.d = localJSONObject3.getString("androidid");
          if (!localJSONObject3.isNull("installedapps"))
          {
            JSONArray localJSONArray4 = localJSONObject3.getJSONArray("installedapps");
            ArrayList localArrayList3 = new ArrayList();
            for (int i4 = 0; i4 < localJSONArray4.length(); i4++)
              localArrayList3.add(Integer.valueOf(localJSONArray4.getInt(i4)));
            this.s = localArrayList3;
          }
          if (!localJSONObject3.isNull("appurls"))
          {
            JSONArray localJSONArray3 = localJSONObject3.getJSONArray("appurls");
            ArrayList localArrayList2 = new ArrayList();
            for (int i3 = 0; i3 < localJSONArray3.length(); i3++)
            {
              JSONObject localJSONObject10 = localJSONArray3.getJSONObject(i3);
              m localm = new m();
              localm.a = localJSONObject10.getInt("id");
              localm.b = localJSONObject10.getString("url");
              localArrayList2.add(localm);
            }
            this.u = localArrayList2;
          }
          if (!localJSONObject3.isNull("classifications"))
          {
            JSONArray localJSONArray2 = localJSONObject3.getJSONArray("classifications");
            HashMap localHashMap = new HashMap();
            for (int i2 = 0; i2 < localJSONArray2.length(); i2++)
            {
              JSONObject localJSONObject9 = localJSONArray2.getJSONObject(i2);
              localHashMap.put(Integer.valueOf(localJSONObject9.getInt("classificationid")), Integer.valueOf(localJSONObject9.getInt("count")));
            }
            this.v = localHashMap;
          }
          if (!localJSONObject3.isNull("DeviceInfo"))
          {
            JSONObject localJSONObject8 = localJSONObject3.getJSONObject("DeviceInfo");
            if (!localJSONObject8.isNull("os"))
              this.e = localJSONObject8.getString("os");
            if (!localJSONObject8.isNull("model"))
              this.f = localJSONObject8.getString("model");
            if (!localJSONObject8.isNull("device"))
              this.g = localJSONObject8.getString("device");
            if (!localJSONObject8.isNull("manufacturer"))
              this.h = localJSONObject8.getString("manufacturer");
            if (!localJSONObject8.isNull("brand"))
              this.i = localJSONObject8.getString("brand");
            if (!localJSONObject8.isNull("timezone"))
              this.j = localJSONObject8.getString("timezone");
            if (!localJSONObject8.isNull("timezoneId"))
              this.k = localJSONObject8.getString("timezoneId");
            if (!localJSONObject8.isNull("country_code"))
              this.l = localJSONObject8.getString("country_code");
            if (!localJSONObject8.isNull("device_resolution"))
              this.m = localJSONObject8.getString("device_resolution");
            if (!localJSONObject8.isNull("language"))
              this.n = localJSONObject8.getString("language");
            if (!localJSONObject8.isNull("carrier"))
              this.o = localJSONObject8.getString("carrier");
            if (!localJSONObject8.isNull("classificationid"))
              this.E = localJSONObject8.getInt("classificationid");
            if (!localJSONObject8.isNull("isNetworkCheckEnableInUserSetting"))
              this.B = localJSONObject8.getBoolean("isNetworkCheckEnableInUserSetting");
            if (!localJSONObject8.isNull("isLocationCheckEnableInUserSetting"))
              this.D = localJSONObject8.getBoolean("isLocationCheckEnableInUserSetting");
            if (!localJSONObject8.isNull("isAppInstallCheckEnableInUserSetting"))
              this.C = localJSONObject8.getBoolean("isAppInstallCheckEnableInUserSetting");
          }
          if (!localJSONObject3.isNull("LocationInfo"))
          {
            JSONObject localJSONObject7 = localJSONObject3.getJSONObject("LocationInfo");
            if (!localJSONObject7.isNull("latitude"))
              this.q = localJSONObject7.getDouble("latitude");
            if (!localJSONObject7.isNull("longitude"))
              this.r = localJSONObject7.getDouble("longitude");
            if (!localJSONObject7.isNull("locationAltitude"))
              this.w = localJSONObject7.getDouble("locationAltitude");
            if (!localJSONObject7.isNull("locationTimestamp"))
              this.x = localJSONObject7.getLong("locationTimestamp");
            if (!localJSONObject7.isNull("locationAccuracy"))
              this.y = localJSONObject7.getDouble("locationAccuracy");
            if (!localJSONObject7.isNull("locationSpeed"))
              this.z = localJSONObject7.getDouble("locationSpeed");
          }
          if (!localJSONObject3.isNull("NetworkInfo"))
          {
            JSONObject localJSONObject4 = localJSONObject3.getJSONObject("NetworkInfo");
            aj localaj = new aj(this);
            if (!localJSONObject4.isNull("wificurrent"))
            {
              JSONObject localJSONObject6 = localJSONObject4.getJSONObject("wificurrent");
              am localam2 = new am();
              localam2.a(localJSONObject6.getString("ssid"));
              localaj.a(localam2);
            }
            if (!localJSONObject4.isNull("wifilist"))
            {
              JSONArray localJSONArray1 = localJSONObject4.getJSONArray("wifilist");
              if ((localJSONArray1 != null) && (localJSONArray1.length() > 0))
              {
                ArrayList localArrayList1 = new ArrayList();
                while (i1 < localJSONArray1.length())
                {
                  JSONObject localJSONObject5 = localJSONArray1.getJSONObject(i1);
                  am localam1 = new am();
                  localam1.a(localJSONObject5.getString("ssid"));
                  localArrayList1.add(localam1);
                  i1++;
                }
                localaj.a(localArrayList1);
              }
            }
            this.p = localaj;
          }
        }
      }
    }
  }

  final void a(List<Integer> paramList)
  {
    this.s = paramList;
  }

  final void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  final void b(double paramDouble)
  {
    this.r = paramDouble;
  }

  final void b(String paramString)
  {
    this.a = paramString;
  }

  final void b(List<Integer> paramList)
  {
    this.t = paramList;
  }

  public final void b(boolean paramBoolean)
  {
    this.C = paramBoolean;
  }

  final String c()
  {
    return this.q + "," + this.r;
  }

  final void c(double paramDouble)
  {
    this.w = paramDouble;
  }

  final void c(Context paramContext)
  {
    String str1 = ak.a(paramContext) + System.getProperty("line.separator") + ".567ac581-718b-42d4-82d3-0daa55e13da7";
    JSONObject localJSONObject = new JSONObject();
    String str2 = a();
    if ((str2 != null) && (str2.length() > 0))
      localJSONObject.put("core", new JSONObject(str2));
    String str3 = D();
    if ((str3 != null) && (str3.length() > 0))
      localJSONObject.put("extra", new JSONObject(str3));
    ak.a(str1, localJSONObject.toString());
  }

  final void c(String paramString)
  {
    this.e = paramString;
  }

  @SuppressLint({"UseSparseArrays"})
  final ai d(Context paramContext)
  {
    ag localag;
    ai localai;
    ArrayList localArrayList;
    try
    {
      localag = ag.d(paramContext);
      localai = new ai(this);
      localai.a(localag.t());
      if (localag.t() <= 1)
        break label216;
      List localList = ag.d(paramContext).s();
      localArrayList = new ArrayList();
      if (localList != null)
      {
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
          localArrayList.add(((l)localIterator.next()).a);
      }
    }
    catch (Throwable localThrowable)
    {
      ak.a(ak.a(localThrowable));
      return null;
    }
    localai.b(localArrayList);
    localai.b(e(paramContext));
    localai.c(f(paramContext));
    o localo = o.a(paramContext);
    s locals = localo.e();
    ak.a("===== Total Number of Category Id:= " + localag.u());
    if (locals != null)
    {
      localai.a(locals.a());
      if ((localag.j()) && (localag.u() <= localo.d()))
        localai.a(localo.g());
    }
    label216: if (localag.t() == 3)
      localai.a(this.v);
    if (localag.t() >= 4)
      localai.c(this.s);
    return localai;
  }

  final String d()
  {
    return this.a;
  }

  final void d(double paramDouble)
  {
    this.y = paramDouble;
  }

  final void d(String paramString)
  {
    this.f = paramString;
  }

  final String e()
  {
    return this.e;
  }

  final void e(double paramDouble)
  {
    this.z = paramDouble;
  }

  final void e(String paramString)
  {
    this.g = paramString;
  }

  final String f()
  {
    return this.f;
  }

  final void f(String paramString)
  {
    this.A = paramString;
  }

  final String g()
  {
    return this.g;
  }

  final void g(String paramString)
  {
    this.i = paramString;
  }

  final String h()
  {
    return this.A;
  }

  final void h(String paramString)
  {
    this.n = paramString;
  }

  final String i()
  {
    return this.i;
  }

  final void i(String paramString)
  {
    this.b = paramString;
  }

  final String j()
  {
    return this.n;
  }

  final void j(String paramString)
  {
    this.d = paramString;
  }

  final double k()
  {
    return this.q;
  }

  final void k(String paramString)
  {
    this.h = paramString;
  }

  final double l()
  {
    return this.r;
  }

  final void l(String paramString)
  {
    this.j = paramString;
  }

  final String m()
  {
    return this.b;
  }

  final void m(String paramString)
  {
    this.k = paramString;
  }

  final void n(String paramString)
  {
    this.l = paramString;
  }

  final boolean n()
  {
    return this.c;
  }

  final String o()
  {
    return this.d;
  }

  final void o(String paramString)
  {
    this.m = paramString;
  }

  final String p()
  {
    return this.j;
  }

  final void p(String paramString)
  {
    this.o = paramString;
  }

  final String q()
  {
    return this.l;
  }

  final aj r()
  {
    return this.p;
  }

  final double s()
  {
    return this.w;
  }

  final long t()
  {
    return this.x;
  }

  final double u()
  {
    return this.y;
  }

  final double v()
  {
    return this.z;
  }

  final List<Integer> w()
  {
    return this.s;
  }

  final List<Integer> x()
  {
    return this.t;
  }

  final String y()
  {
    return this.o;
  }

  public final boolean z()
  {
    return this.B;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.ah
 * JD-Core Version:    0.6.2
 */