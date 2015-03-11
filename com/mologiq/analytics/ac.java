package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

final class ac extends t
{
  private static final ac z = new ac(".567ac581-718b-42d4-82d3-0daa55e13da7");
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
  private ae p;
  private double q;
  private double r;
  private List<Integer> s;
  private Map<Integer, Integer> t;
  private double u;
  private long v;
  private double w;
  private double x;
  private String y;

  private ac(String paramString)
  {
    super(paramString);
  }

  static ac b()
  {
    return z;
  }

  static Map<String, i> e(Context paramContext)
  {
    HashMap localHashMap = new HashMap();
    SparseArray localSparseArray = ab.d(paramContext).n();
    if (localSparseArray != null);
    for (int i1 = 0; ; i1++)
    {
      if (i1 >= localSparseArray.size())
        return localHashMap;
      i locali = (i)localSparseArray.valueAt(i1);
      localHashMap.put(locali.b(), locali);
    }
  }

  private static int f(Context paramContext)
  {
    int i1 = 0;
    SparseArray localSparseArray = ab.d(paramContext).n();
    if (localSparseArray != null)
    {
      int i2 = 0;
      while (true)
      {
        if (i1 >= localSparseArray.size())
          return i2;
        Integer localInteger = Integer.valueOf(localSparseArray.keyAt(i1));
        if (localInteger.intValue() > i2)
          i2 = localInteger.intValue();
        i1++;
      }
    }
    return 0;
  }

  private String y()
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2;
    JSONArray localJSONArray;
    Iterator localIterator;
    if (this.p != null)
    {
      ae localae = this.p;
      localJSONObject2 = new JSONObject();
      if (localae.b() != null)
      {
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject3.put("ssid", localae.b().a());
        localJSONObject2.put("wificurrent", localJSONObject3);
      }
      if (localae.a() != null)
      {
        localJSONArray = new JSONArray();
        localIterator = localae.a().iterator();
      }
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localJSONObject2.put("wifilist", localJSONArray);
        localJSONObject1.put("NetworkInfo", localJSONObject2);
        return localJSONObject1.toString();
      }
      ah localah = (ah)localIterator.next();
      JSONObject localJSONObject4 = new JSONObject();
      localJSONObject4.put("ssid", localah.a());
      localJSONArray.put(localJSONObject4);
    }
  }

  protected final String a()
  {
    JSONObject localJSONObject1 = new JSONObject();
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("product", this.a);
    localJSONObject2.put("androidadvertiserid", this.b);
    localJSONObject2.put("androidadvertiseridoptout", this.c);
    localJSONObject2.put("androidid", this.d);
    if ((this.s != null) && (this.s.size() > 0))
      localJSONObject2.put("installedapps", new JSONArray(this.s));
    JSONArray localJSONArray;
    Iterator localIterator;
    if ((this.t != null) && (this.t.size() > 0))
    {
      localJSONArray = new JSONArray();
      localIterator = this.t.keySet().iterator();
    }
    while (true)
    {
      if (!localIterator.hasNext())
      {
        localJSONObject2.put("classifications", localJSONArray);
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
        localJSONObject2.put("DeviceInfo", localJSONObject3);
        localJSONObject1.put("DeviceEvent", localJSONObject2);
        JSONObject localJSONObject4 = new JSONObject();
        localJSONObject4.put("latitude", this.q);
        localJSONObject4.put("longitude", this.r);
        localJSONObject2.put("LocationInfo", localJSONObject4);
        return localJSONObject1.toString();
      }
      Integer localInteger = (Integer)localIterator.next();
      JSONObject localJSONObject5 = new JSONObject();
      localJSONObject5.put("classificationid", localInteger);
      localJSONObject5.put("count", this.t.get(localInteger));
      localJSONArray.put(localJSONObject5);
    }
  }

  final void a(double paramDouble)
  {
    this.q = paramDouble;
  }

  public final void a(long paramLong)
  {
    this.v = paramLong;
  }

  public final void a(ae paramae)
  {
    this.p = paramae;
  }

  @SuppressLint({"UseSparseArrays"})
  protected final void a(String paramString)
  {
    int i1 = 0;
    JSONArray localJSONArray3;
    ArrayList localArrayList2;
    int i3;
    JSONArray localJSONArray2;
    HashMap localHashMap;
    int i2;
    label223: ae localae;
    JSONArray localJSONArray1;
    ArrayList localArrayList1;
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
          if (!localJSONObject3.isNull("androidadvertiserid"))
            this.b = localJSONObject3.getString("androidadvertiserid");
          if (!localJSONObject3.isNull("androidadvertiseridout"))
            this.c = localJSONObject3.getBoolean("androidadvertiseridoptout");
          if (!localJSONObject3.isNull("androidid"))
            this.d = localJSONObject3.getString("androidid");
          if (!localJSONObject3.isNull("installedapps"))
          {
            localJSONArray3 = localJSONObject3.getJSONArray("installedapps");
            localArrayList2 = new ArrayList();
            i3 = 0;
            if (i3 < localJSONArray3.length())
              break label782;
            this.s = localArrayList2;
          }
          if (!localJSONObject3.isNull("classifications"))
          {
            localJSONArray2 = localJSONObject3.getJSONArray("classifications");
            localHashMap = new HashMap();
            i2 = 0;
            if (i2 < localJSONArray2.length())
              break label806;
            this.t = localHashMap;
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
          }
          if (!localJSONObject3.isNull("LocationInfo"))
          {
            JSONObject localJSONObject7 = localJSONObject3.getJSONObject("LocationInfo");
            if (!localJSONObject7.isNull("latitude"))
              this.q = localJSONObject7.getDouble("latitude");
            if (!localJSONObject7.isNull("longitude"))
              this.r = localJSONObject7.getDouble("longitude");
            if (!localJSONObject7.isNull("locationAltitude"))
              this.u = localJSONObject7.getDouble("locationAltitude");
            if (!localJSONObject7.isNull("locationTimestamp"))
              this.v = localJSONObject7.getLong("locationTimestamp");
            if (!localJSONObject7.isNull("locationAccuracy"))
              this.w = localJSONObject7.getDouble("locationAccuracy");
            if (!localJSONObject7.isNull("locationSpeed"))
              this.x = localJSONObject7.getDouble("locationSpeed");
          }
          if (!localJSONObject3.isNull("NetworkInfo"))
          {
            JSONObject localJSONObject4 = localJSONObject3.getJSONObject("NetworkInfo");
            localae = new ae(this);
            if (!localJSONObject4.isNull("wificurrent"))
            {
              JSONObject localJSONObject6 = localJSONObject4.getJSONObject("wificurrent");
              ah localah2 = new ah();
              localah2.a(localJSONObject6.getString("ssid"));
              localae.a(localah2);
            }
            if (!localJSONObject4.isNull("wifilist"))
            {
              localJSONArray1 = localJSONObject4.getJSONArray("wifilist");
              if ((localJSONArray1 != null) && (localJSONArray1.length() > 0))
                localArrayList1 = new ArrayList();
            }
          }
        }
      }
    }
    while (true)
    {
      if (i1 >= localJSONArray1.length())
      {
        localae.a(localArrayList1);
        this.p = localae;
        return;
        label782: localArrayList2.add(Integer.valueOf(localJSONArray3.getInt(i3)));
        i3++;
        break;
        label806: JSONObject localJSONObject9 = localJSONArray2.getJSONObject(i2);
        localHashMap.put(Integer.valueOf(localJSONObject9.getInt("classificationid")), Integer.valueOf(localJSONObject9.getInt("count")));
        i2++;
        break label223;
      }
      JSONObject localJSONObject5 = localJSONArray1.getJSONObject(i1);
      ah localah1 = new ah();
      localah1.a(localJSONObject5.getString("ssid"));
      localArrayList1.add(localah1);
      i1++;
    }
  }

  public final void a(List<Integer> paramList)
  {
    this.s = paramList;
  }

  public final void a(Map<Integer, Integer> paramMap)
  {
    this.t = paramMap;
  }

  public final void a(boolean paramBoolean)
  {
    this.c = paramBoolean;
  }

  final void b(double paramDouble)
  {
    this.r = paramDouble;
  }

  public final void b(String paramString)
  {
    this.a = paramString;
  }

  final String c()
  {
    return this.q + "," + this.r;
  }

  public final void c(double paramDouble)
  {
    this.u = paramDouble;
  }

  public final void c(Context paramContext)
  {
    String str1 = af.a(paramContext) + System.getProperty("line.separator") + ".567ac581-718b-42d4-82d3-0daa55e13da7";
    JSONObject localJSONObject = new JSONObject();
    String str2 = a();
    if ((str2 != null) && (str2.length() > 0))
      localJSONObject.put("core", new JSONObject(str2));
    String str3 = y();
    if ((str3 != null) && (str3.length() > 0))
      localJSONObject.put("extra", new JSONObject(str3));
    af.a(str1, localJSONObject.toString());
  }

  public final void c(String paramString)
  {
    this.e = paramString;
  }

  @SuppressLint({"UseSparseArrays"})
  public final ad d(Context paramContext)
  {
    ab localab = ab.d(paramContext);
    ad localad = new ad(this);
    localad.a(localab.q());
    ArrayList localArrayList1;
    Iterator localIterator3;
    HashMap localHashMap;
    Iterator localIterator1;
    label134: ArrayList localArrayList2;
    Iterator localIterator2;
    if (localab.q() > 1)
    {
      List localList = ab.d(paramContext).p();
      localArrayList1 = new ArrayList();
      if (localList != null)
      {
        localIterator3 = localList.iterator();
        if (localIterator3.hasNext())
          break label227;
      }
      localad.b(localArrayList1);
      localad.b(f(paramContext));
      q localq = localab.o();
      if ((localq != null) && (this.t != null))
      {
        localad.a(localq.a());
        localHashMap = new HashMap();
        localIterator1 = localq.c().iterator();
        if (localIterator1.hasNext())
          break label251;
        Map localMap = af.a(localHashMap, af.b);
        localArrayList2 = new ArrayList();
        localIterator2 = localMap.entrySet().iterator();
      }
    }
    while (true)
    {
      if (!localIterator2.hasNext())
      {
        localad.a(localArrayList2);
        if (localab.q() == 3)
          localad.a(this.t);
        if (localab.q() >= 4)
          localad.c(this.s);
        return localad;
        label227: localArrayList1.add(((j)localIterator3.next()).a);
        break;
        label251: p localp = (p)localIterator1.next();
        int i1 = localp.a();
        if (!this.t.containsKey(Integer.valueOf(i1)))
          break label134;
        int i2 = ((Integer)this.t.get(Integer.valueOf(localp.a()))).intValue() - localp.b();
        localHashMap.put(Integer.valueOf(i1), Integer.valueOf(i2));
        break label134;
      }
      localArrayList2.add((Integer)((Map.Entry)localIterator2.next()).getKey());
    }
  }

  public final String d()
  {
    return this.a;
  }

  public final void d(double paramDouble)
  {
    this.w = paramDouble;
  }

  public final void d(String paramString)
  {
    this.f = paramString;
  }

  public final String e()
  {
    return this.e;
  }

  public final void e(double paramDouble)
  {
    this.x = paramDouble;
  }

  public final void e(String paramString)
  {
    this.g = paramString;
  }

  public final String f()
  {
    return this.f;
  }

  public final void f(String paramString)
  {
    this.y = paramString;
  }

  public final String g()
  {
    return this.g;
  }

  public final void g(String paramString)
  {
    this.i = paramString;
  }

  public final String h()
  {
    return this.y;
  }

  public final void h(String paramString)
  {
    this.n = paramString;
  }

  public final String i()
  {
    return this.i;
  }

  public final void i(String paramString)
  {
    this.b = paramString;
  }

  public final String j()
  {
    return this.n;
  }

  public final void j(String paramString)
  {
    this.d = paramString;
  }

  final double k()
  {
    return this.q;
  }

  public final void k(String paramString)
  {
    this.h = paramString;
  }

  final double l()
  {
    return this.r;
  }

  public final void l(String paramString)
  {
    this.j = paramString;
  }

  public final String m()
  {
    return this.b;
  }

  public final void m(String paramString)
  {
    this.k = paramString;
  }

  public final void n(String paramString)
  {
    this.l = paramString;
  }

  public final boolean n()
  {
    return this.c;
  }

  public final String o()
  {
    return this.d;
  }

  public final void o(String paramString)
  {
    this.m = paramString;
  }

  public final String p()
  {
    return this.j;
  }

  public final void p(String paramString)
  {
    this.o = paramString;
  }

  public final String q()
  {
    return this.l;
  }

  public final ae r()
  {
    return this.p;
  }

  public final double s()
  {
    return this.u;
  }

  public final long t()
  {
    return this.v;
  }

  public final double u()
  {
    return this.w;
  }

  public final double v()
  {
    return this.x;
  }

  public final List<Integer> w()
  {
    return this.s;
  }

  public final String x()
  {
    return this.o;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.ac
 * JD-Core Version:    0.6.2
 */