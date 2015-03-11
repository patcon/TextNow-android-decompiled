package com.mologiq.analytics;

import android.content.Context;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ab extends t
{
  private static final ab s = new ab(".3ca154f5-9711-475d-819c-7bab4289e4a7");
  private static final AtomicBoolean t = new AtomicBoolean(false);
  private long a = 0L;
  private long b = 0L;
  private String c = "http://a.mologiq.net/mologiq/aea";
  private String d = "http://a.mologiq.net/mologiq/deai";
  private String e = "http://a.mologiq.net/mologiq/dea";
  private String f = "http://a.mologiq.net/mologiq/et";
  private int g = 100;
  private boolean h = false;
  private boolean i = false;
  private boolean j = false;
  private boolean k = false;
  private int l = 0;
  private long m = 600000L;
  private long n = 600000L;
  private long o = 0L;
  private SparseArray<i> p = k.a().b();
  private q q = o.a().b();
  private List<j> r;

  private ab(String paramString)
  {
    super(paramString);
  }

  private void c(String paramString)
  {
    if (paramString != null);
    while (true)
    {
      JSONArray localJSONArray7;
      SparseArray localSparseArray;
      int i7;
      JSONArray localJSONArray5;
      ArrayList localArrayList4;
      int i5;
      JSONArray localJSONArray1;
      int i1;
      try
      {
        if (paramString.length() <= 0)
          break label1152;
        JSONObject localJSONObject1 = new JSONObject(paramString);
        if (!localJSONObject1.isNull("adEventsAndroidUrl"))
          this.c = localJSONObject1.getString("adEventsAndroidUrl");
        if (!localJSONObject1.isNull("deviceEventsInitAndroidUrl"))
          this.d = localJSONObject1.getString("deviceEventsInitAndroidUrl");
        if (!localJSONObject1.isNull("deviceEventsAndroidUrl"))
          this.e = localJSONObject1.getString("deviceEventsAndroidUrl");
        if (!localJSONObject1.isNull("targetParamsAndroidUrl"))
          this.f = localJSONObject1.getString("targetParamsAndroidUrl");
        if (!localJSONObject1.isNull("stopForPeriodInMs"))
          this.a = localJSONObject1.getLong("stopForPeriodInMs");
        if (!localJSONObject1.isNull("locationMask"))
          this.g = localJSONObject1.getInt("locationMask");
        if (!localJSONObject1.isNull("ttlEnhancedTargetParamsInMs"))
          this.m = localJSONObject1.getLong("ttlEnhancedTargetParamsInMs");
        if (!localJSONObject1.isNull("ttlDeviceStateInMs"))
          this.n = localJSONObject1.getLong("ttlDeviceStateInMs");
        if (!localJSONObject1.isNull("deviceStateTimestamp"))
          this.o = localJSONObject1.getLong("deviceStateTimestamp");
        if (!localJSONObject1.isNull("enableLocation"))
        {
          this.h = localJSONObject1.getBoolean("enableLocation");
          if (!localJSONObject1.isNull("enableInstalledApps"))
          {
            this.i = localJSONObject1.getBoolean("enableInstalledApps");
            if (localJSONObject1.isNull("enableNetworkInfo"))
              break label558;
            this.j = localJSONObject1.getBoolean("enableNetworkInfo");
            if (localJSONObject1.isNull("enableDeviceInfo"))
              break label566;
            this.k = localJSONObject1.getBoolean("enableDeviceInfo");
            if (localJSONObject1.isNull("policy"))
              break label574;
            this.l = localJSONObject1.getInt("policy");
            if (localJSONObject1.isNull("appfilters"))
              break label1152;
            JSONObject localJSONObject2 = localJSONObject1.getJSONObject("appfilters");
            if (!localJSONObject2.isNull("applistdata"))
            {
              localJSONArray7 = localJSONObject2.getJSONArray("applistdata");
              if ((localJSONArray7 != null) && (localJSONArray7.length() > 0))
              {
                localSparseArray = new SparseArray();
                i7 = 0;
                if (i7 < localJSONArray7.length())
                  break label582;
                this.p = localSparseArray;
              }
            }
            if (!localJSONObject2.isNull("meandata"))
            {
              JSONObject localJSONObject5 = localJSONObject2.getJSONObject("meandata");
              o localo1 = o.a();
              localo1.getClass();
              q localq = new q(localo1);
              localq.a(localJSONObject5.getString("version"));
              localq.a(localJSONObject5.getInt("appcount"));
              localJSONArray5 = localJSONObject5.getJSONArray("classifications");
              if ((localJSONArray5 != null) && (localJSONArray5.length() > 0))
              {
                localArrayList4 = new ArrayList();
                i5 = 0;
                if (i5 < localJSONArray5.length())
                  break label693;
                localq.a(localArrayList4);
              }
              this.q = localq;
            }
            if (localJSONObject2.isNull("appinstallcampaigns"))
              break label1152;
            if (this.r == null)
              this.r = new ArrayList();
            localJSONArray1 = localJSONObject2.getJSONArray("appinstallcampaigns");
            i1 = 0;
            if (i1 < localJSONArray1.length())
              break label827;
          }
        }
        else
        {
          this.h = false;
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        return;
      }
      this.i = false;
      continue;
      label558: this.j = false;
      continue;
      label566: this.k = false;
      continue;
      label574: this.l = 1;
      continue;
      label582: JSONObject localJSONObject7 = localJSONArray7.getJSONObject(i7);
      i locali = new i();
      if (!localJSONObject7.isNull("name"))
        locali.a(localJSONObject7.getString("name"));
      if (!localJSONObject7.isNull("classificationid"))
        locali.a(localJSONObject7.getInt("classificationid"));
      if (!localJSONObject7.isNull("id"))
        locali.b(localJSONObject7.getInt("id"));
      if (!localJSONObject7.isNull("id"))
      {
        localSparseArray.put(localJSONObject7.getInt("id"), locali);
        break label1153;
        label693: o localo2 = o.a();
        localo2.getClass();
        p localp = new p(localo2);
        JSONObject localJSONObject6 = localJSONArray5.getJSONObject(i5);
        localp.a(localJSONObject6.getInt("id"));
        localp.b(localJSONObject6.getInt("mean"));
        JSONArray localJSONArray6 = localJSONObject6.getJSONArray("apps");
        ArrayList localArrayList5 = new ArrayList();
        for (int i6 = 0; ; i6++)
        {
          if (i6 >= localJSONArray6.length())
          {
            localp.a(localArrayList5);
            localArrayList4.add(localp);
            i5++;
            break;
          }
          localArrayList5.add(Integer.valueOf(localJSONArray6.getInt(i6)));
        }
        label827: JSONObject localJSONObject3 = localJSONArray1.getJSONObject(i1);
        j localj = new j();
        localj.a = Integer.valueOf(localJSONObject3.getInt("id"));
        localj.b = Integer.valueOf(localJSONObject3.getInt("userid"));
        JSONArray localJSONArray4;
        ArrayList localArrayList3;
        int i4;
        label909: ArrayList localArrayList1;
        JSONArray localJSONArray2;
        int i2;
        label959: ArrayList localArrayList2;
        JSONArray localJSONArray3;
        if (!localJSONObject3.isNull("isnotinstalled"))
        {
          localJSONArray4 = localJSONObject3.getJSONArray("isnotinstalled");
          localArrayList3 = new ArrayList();
          i4 = 0;
          if (i4 >= localJSONArray4.length())
            localj.c = localArrayList3;
        }
        else
        {
          if (!localJSONObject3.isNull("isinstalled"))
          {
            localArrayList1 = new ArrayList();
            localJSONArray2 = localJSONObject3.getJSONArray("isinstalled");
            i2 = 0;
            if (i2 < localJSONArray2.length())
              break label1068;
            localj.d = localArrayList1;
          }
          if (!localJSONObject3.isNull("tp"))
          {
            localArrayList2 = new ArrayList();
            localJSONArray3 = localJSONObject3.getJSONArray("tp");
          }
        }
        for (int i3 = 0; ; i3++)
        {
          if (i3 >= localJSONArray3.length())
          {
            localj.e = localArrayList2;
            this.r.add(localj);
            i1++;
            break;
            localArrayList3.add(Integer.valueOf(localJSONArray4.getInt(i4)));
            i4++;
            break label909;
            label1068: localArrayList1.add(Integer.valueOf(localJSONArray2.getInt(i2)));
            i2++;
            break label959;
          }
          JSONObject localJSONObject4 = localJSONArray3.getJSONObject(i3);
          z localz = new z();
          localz.a(localJSONObject4.getString("n"));
          localz.b(localJSONObject4.getString("v"));
          localArrayList2.add(localz);
        }
        label1152: return;
      }
      label1153: i7++;
    }
  }

  public static ab d(Context paramContext)
  {
    if (t.compareAndSet(false, true))
      s.a(paramContext);
    return s;
  }

  protected final String a()
  {
    JSONObject localJSONObject1 = new JSONObject();
    if (this.c != null)
      localJSONObject1.put("adEventsAndroidUrl", this.c);
    if (this.e != null)
      localJSONObject1.put("deviceEventsAndroidUrl", this.e);
    if (this.d != null)
      localJSONObject1.put("deviceEventsInitAndroidUrl", this.d);
    if (this.f != null)
      localJSONObject1.put("targetParamsAndroidUrl", this.f);
    localJSONObject1.put("stopForPeriodInMs", this.a);
    localJSONObject1.put("locationMask", this.g);
    localJSONObject1.put("ttlEnhancedTargetParamsInMs", this.m);
    localJSONObject1.put("ttlDeviceStateInMs", this.n);
    localJSONObject1.put("deviceStateTimestamp", this.o);
    localJSONObject1.put("enableLocation", this.h);
    localJSONObject1.put("enableInstalledApps", this.i);
    localJSONObject1.put("enableNetworkInfo", this.j);
    localJSONObject1.put("enableDeviceInfo", this.k);
    localJSONObject1.put("policy", this.l);
    JSONObject localJSONObject2 = new JSONObject();
    JSONArray localJSONArray1 = new JSONArray();
    int i1 = 0;
    JSONObject localJSONObject4;
    JSONArray localJSONArray2;
    Iterator localIterator1;
    if (i1 >= this.p.size())
    {
      localJSONObject2.put("applistdata", localJSONArray1);
      localJSONObject4 = new JSONObject();
      localJSONObject4.put("version", this.q.a());
      localJSONObject4.put("appcount", this.q.b());
      localJSONArray2 = new JSONArray();
      localIterator1 = this.q.c().iterator();
    }
    JSONArray localJSONArray3;
    Iterator localIterator2;
    while (true)
    {
      if (!localIterator1.hasNext())
      {
        localJSONObject4.put("classifications", localJSONArray2);
        localJSONObject2.put("meandata", localJSONObject4);
        if (this.r != null)
        {
          localJSONArray3 = new JSONArray();
          localIterator2 = this.r.iterator();
          if (localIterator2.hasNext())
            break label541;
          localJSONObject2.put("appinstallcampaigns", localJSONArray3);
        }
        localJSONObject1.put("appfilters", localJSONObject2);
        return localJSONObject1.toString();
        i locali = (i)this.p.valueAt(i1);
        JSONObject localJSONObject3 = new JSONObject();
        localJSONObject3.put("name", locali.b());
        localJSONObject3.put("classificationid", locali.a());
        localJSONObject3.put("id", locali.c());
        localJSONArray1.put(localJSONObject3);
        i1++;
        break;
      }
      p localp = (p)localIterator1.next();
      JSONObject localJSONObject5 = new JSONObject();
      localJSONObject5.put("id", localp.a());
      localJSONObject5.put("mean", localp.b());
      localJSONObject5.put("apps", new JSONArray(localp.c()));
      localJSONArray2.put(localJSONObject5);
    }
    label541: j localj = (j)localIterator2.next();
    JSONObject localJSONObject6 = new JSONObject();
    localJSONObject6.put("id", localj.a);
    localJSONObject6.put("userid", localj.b);
    localJSONObject6.put("isnotinstalled", new JSONArray(localj.c));
    localJSONObject6.put("isinstalled", new JSONArray(localj.d));
    JSONArray localJSONArray4;
    Iterator localIterator3;
    if (localj.e != null)
    {
      localJSONArray4 = new JSONArray();
      localIterator3 = localj.e.iterator();
    }
    while (true)
    {
      if (!localIterator3.hasNext())
      {
        localJSONObject6.put("tp", localJSONArray4);
        localJSONArray3.put(localJSONObject6);
        break;
      }
      z localz = (z)localIterator3.next();
      JSONObject localJSONObject7 = new JSONObject();
      localJSONObject7.put("n", localz.a());
      localJSONObject7.put("v", localz.b());
      localJSONArray4.put(localJSONObject7);
    }
  }

  public final void a(int paramInt)
  {
    this.l = paramInt;
  }

  public final void a(long paramLong)
  {
    this.o = paramLong;
  }

  protected final void a(String paramString)
  {
    if (!b())
      this.b = System.currentTimeMillis();
    if ((paramString != null) && (paramString.length() > 0))
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      if (!localJSONObject.isNull("core"))
        c(localJSONObject.getJSONObject("core").toString());
    }
  }

  protected final void b(String paramString)
  {
    if (paramString != null);
    while (true)
    {
      JSONArray localJSONArray9;
      int i9;
      JSONArray localJSONArray7;
      ArrayList localArrayList5;
      int i7;
      JSONArray localJSONArray1;
      int i1;
      try
      {
        if (paramString.length() <= 0)
          break label1385;
        JSONObject localJSONObject1 = new JSONObject(paramString);
        if (!localJSONObject1.isNull("adEventsAndroidUrl"))
          this.c = localJSONObject1.getString("adEventsAndroidUrl");
        if (!localJSONObject1.isNull("deviceEventsInitAndroidUrl"))
          this.d = localJSONObject1.getString("deviceEventsInitAndroidUrl");
        if (!localJSONObject1.isNull("deviceEventsAndroidUrl"))
          this.e = localJSONObject1.getString("deviceEventsAndroidUrl");
        if (!localJSONObject1.isNull("targetParamsAndroidUrl"))
          this.f = localJSONObject1.getString("targetParamsAndroidUrl");
        if (!localJSONObject1.isNull("stopForPeriodInMs"))
          this.a = localJSONObject1.getLong("stopForPeriodInMs");
        if (!localJSONObject1.isNull("locationMask"))
          this.g = localJSONObject1.getInt("locationMask");
        if (!localJSONObject1.isNull("ttlEnhancedTargetParamsInMs"))
          this.m = localJSONObject1.getLong("ttlEnhancedTargetParamsInMs");
        if (!localJSONObject1.isNull("ttlDeviceStateInMs"))
          this.n = localJSONObject1.getLong("ttlDeviceStateInMs");
        if (!localJSONObject1.isNull("deviceStateTimestamp"))
          this.o = localJSONObject1.getLong("deviceStateTimestamp");
        if (!localJSONObject1.isNull("enableLocation"))
        {
          this.h = localJSONObject1.getBoolean("enableLocation");
          if (!localJSONObject1.isNull("enableInstalledApps"))
          {
            this.i = localJSONObject1.getBoolean("enableInstalledApps");
            if (localJSONObject1.isNull("enableNetworkInfo"))
              break label549;
            this.j = localJSONObject1.getBoolean("enableNetworkInfo");
            if (localJSONObject1.isNull("enableDeviceInfo"))
              break label557;
            this.k = localJSONObject1.getBoolean("enableDeviceInfo");
            if (localJSONObject1.isNull("policy"))
              break label565;
            this.l = localJSONObject1.getInt("policy");
            if (localJSONObject1.isNull("appFilters"))
              break label1385;
            JSONObject localJSONObject2 = localJSONObject1.getJSONObject("appFilters");
            if (!localJSONObject2.isNull("appList"))
            {
              localJSONArray9 = localJSONObject2.getJSONArray("appList");
              if ((localJSONArray9 != null) && (localJSONArray9.length() > 0))
              {
                i9 = 0;
                if (i9 < localJSONArray9.length())
                  break label573;
              }
            }
            if (!localJSONObject2.isNull("mean"))
            {
              JSONObject localJSONObject6 = localJSONObject2.getJSONObject("mean");
              o localo1 = o.a();
              localo1.getClass();
              q localq = new q(localo1);
              localq.a(localJSONObject6.getString("version"));
              localq.a(localJSONObject6.getInt("appcount"));
              localJSONArray7 = localJSONObject6.getJSONArray("classifications");
              if ((localJSONArray7 != null) && (localJSONArray7.length() > 0))
              {
                localArrayList5 = new ArrayList();
                i7 = 0;
                if (i7 < localJSONArray7.length())
                  break label686;
                localq.a(localArrayList5);
              }
              this.q = localq;
            }
            if (localJSONObject2.isNull("campaigns"))
              break label1385;
            if (this.r == null)
              this.r = new ArrayList();
            localJSONArray1 = localJSONObject2.getJSONArray("campaigns");
            i1 = 0;
            if (i1 < localJSONArray1.length())
              break label820;
          }
        }
        else
        {
          this.h = false;
          continue;
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
        return;
      }
      this.i = false;
      continue;
      label549: this.j = false;
      continue;
      label557: this.k = false;
      continue;
      label565: this.l = 0;
      continue;
      label573: JSONObject localJSONObject8 = localJSONArray9.getJSONObject(i9);
      i locali = new i();
      if (!localJSONObject8.isNull("name"))
        locali.a(localJSONObject8.getString("name"));
      if (!localJSONObject8.isNull("classificationid"))
        locali.a(localJSONObject8.getInt("classificationid"));
      if (!localJSONObject8.isNull("id"))
        locali.b(localJSONObject8.getInt("id"));
      if (!localJSONObject8.isNull("id"))
      {
        this.p.put(localJSONObject8.getInt("id"), locali);
        break label1386;
        label686: o localo2 = o.a();
        localo2.getClass();
        p localp = new p(localo2);
        JSONObject localJSONObject7 = localJSONArray7.getJSONObject(i7);
        localp.a(localJSONObject7.getInt("id"));
        localp.b(localJSONObject7.getInt("mean"));
        JSONArray localJSONArray8 = localJSONObject7.getJSONArray("apps");
        ArrayList localArrayList6 = new ArrayList();
        for (int i8 = 0; ; i8++)
        {
          if (i8 >= localJSONArray8.length())
          {
            localp.a(localArrayList6);
            localArrayList5.add(localp);
            i7++;
            break;
          }
          localArrayList6.add(Integer.valueOf(localJSONArray8.getInt(i8)));
        }
        label820: JSONObject localJSONObject3 = localJSONArray1.getJSONObject(i1);
        if (localJSONObject3.isNull("action"))
          break label1392;
        String str = localJSONObject3.getString("action");
        if (str.equals("add"))
        {
          if (localJSONObject3.isNull("data"))
            break label1392;
          JSONArray localJSONArray3 = localJSONObject3.getJSONArray("data");
          int i3 = 0;
          if (i3 >= localJSONArray3.length())
            break label1392;
          JSONObject localJSONObject4 = localJSONArray3.getJSONObject(i3);
          j localj2 = new j();
          localj2.a = Integer.valueOf(localJSONObject4.getInt("id"));
          localj2.b = Integer.valueOf(localJSONObject4.getInt("userid"));
          JSONArray localJSONArray6;
          ArrayList localArrayList4;
          int i6;
          label980: ArrayList localArrayList2;
          JSONArray localJSONArray4;
          int i4;
          label1030: ArrayList localArrayList3;
          JSONArray localJSONArray5;
          if (!localJSONObject4.isNull("notinstall"))
          {
            localJSONArray6 = localJSONObject4.getJSONArray("notinstall");
            localArrayList4 = new ArrayList();
            i6 = 0;
            if (i6 >= localJSONArray6.length())
              localj2.c = localArrayList4;
          }
          else
          {
            if (!localJSONObject4.isNull("install"))
            {
              localArrayList2 = new ArrayList();
              localJSONArray4 = localJSONObject4.getJSONArray("install");
              i4 = 0;
              if (i4 < localJSONArray4.length())
                break label1139;
              localj2.d = localArrayList2;
            }
            if (!localJSONObject4.isNull("tp"))
            {
              localArrayList3 = new ArrayList();
              localJSONArray5 = localJSONObject4.getJSONArray("tp");
            }
          }
          for (int i5 = 0; ; i5++)
          {
            if (i5 >= localJSONArray5.length())
            {
              localj2.e = localArrayList3;
              this.r.add(localj2);
              i3++;
              break;
              localArrayList4.add(Integer.valueOf(localJSONArray6.getInt(i6)));
              i6++;
              break label980;
              label1139: localArrayList2.add(Integer.valueOf(localJSONArray4.getInt(i4)));
              i4++;
              break label1030;
            }
            JSONObject localJSONObject5 = localJSONArray5.getJSONObject(i5);
            z localz = new z();
            localz.a(localJSONObject5.getString("n"));
            localz.b(localJSONObject5.getString("v"));
            localArrayList3.add(localz);
          }
        }
        if (!str.equals("delete"))
          break label1392;
        HashSet localHashSet = new HashSet();
        if (localJSONObject3.isNull("data"))
          break label1392;
        JSONArray localJSONArray2 = localJSONObject3.getJSONArray("data");
        int i2 = 0;
        ArrayList localArrayList1;
        Iterator localIterator;
        if (i2 >= localJSONArray2.length())
        {
          localArrayList1 = new ArrayList();
          localIterator = this.r.iterator();
        }
        while (true)
        {
          if (!localIterator.hasNext())
          {
            this.r = localArrayList1;
            break label1392;
            localHashSet.add(Integer.valueOf(localJSONArray2.getJSONObject(i1).getInt("id")));
            i2++;
            break;
          }
          j localj1 = (j)localIterator.next();
          if (!localHashSet.contains(localj1.a))
            localArrayList1.add(localj1);
        }
        label1385: return;
      }
      label1386: i9++;
      continue;
      label1392: i1++;
    }
  }

  public final boolean b()
  {
    if (this.a == -1L);
    while (System.currentTimeMillis() - this.b < this.a)
      return true;
    return false;
  }

  public final String c()
  {
    return this.d;
  }

  public final void c(Context paramContext)
  {
    String str1 = af.a(paramContext) + System.getProperty("line.separator") + ".3ca154f5-9711-475d-819c-7bab4289e4a7";
    JSONObject localJSONObject1 = new JSONObject();
    String str2 = a();
    if ((str2 != null) && (str2.length() > 0))
      localJSONObject1.put("core", new JSONObject(str2));
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("stopForPeriodTimestamp", this.b);
    String str3 = localJSONObject2.toString();
    if ((str3 != null) && (str3.length() > 0))
      localJSONObject1.put("extra", new JSONObject(str3));
    af.a(str1, localJSONObject1.toString());
  }

  public final String d()
  {
    return this.c;
  }

  public final String e()
  {
    return this.e;
  }

  public final String f()
  {
    return this.f;
  }

  public final boolean g()
  {
    return this.h;
  }

  public final boolean h()
  {
    return this.i;
  }

  public final boolean i()
  {
    return this.j;
  }

  public final long j()
  {
    return this.m;
  }

  public final long k()
  {
    return this.n;
  }

  public final long l()
  {
    return this.o;
  }

  public final int m()
  {
    return this.g;
  }

  public final SparseArray<i> n()
  {
    return this.p;
  }

  public final q o()
  {
    return this.q;
  }

  public final List<j> p()
  {
    return this.r;
  }

  public final int q()
  {
    return this.l;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.ab
 * JD-Core Version:    0.6.2
 */