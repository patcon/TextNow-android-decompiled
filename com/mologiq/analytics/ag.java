package com.mologiq.analytics;

import android.annotation.SuppressLint;
import android.content.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

final class ag extends w
{
  private static final ag x = new ag(".3ca154f5-9711-475d-819c-7bab4289e4a7");
  private static final AtomicBoolean y = new AtomicBoolean(false);
  private long a = 0L;
  private long b = 0L;
  private String c = "http://a.mologiq.net/mologiq/aea";
  private String d = "http://a.mologiq.net/mologiq/deai";
  private String e = "http://a.mologiq.net/mologiq/dea";
  private String f = "http://a.mologiq.net/mologiq/et";
  private int g = 100;
  private boolean h = true;
  private boolean i = true;
  private boolean j = false;
  private boolean k = false;
  private boolean l = false;
  private boolean m = false;
  private int n;
  private int o = 0;
  private long p = 600000L;
  private long q = 600000L;
  private long r = 0L;
  private long s = 600000L;
  private long t = 0L;
  private s u = q.a().b();
  private List<l> v;
  private Map<Integer, m> w;

  private ag(String paramString)
  {
    super(paramString);
  }

  @SuppressLint({"UseSparseArrays"})
  private void b(String paramString)
  {
    label286: label305: label324: label343: label362: label381: JSONObject localJSONObject2;
    s locals;
    ArrayList localArrayList4;
    int i5;
    label518: r localr;
    ArrayList localArrayList5;
    if (paramString != null)
      try
      {
        if (paramString.length() > 0)
        {
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
            this.p = localJSONObject1.getLong("ttlEnhancedTargetParamsInMs");
          if (!localJSONObject1.isNull("ttlDeviceStateInMs"))
            this.q = localJSONObject1.getLong("ttlDeviceStateInMs");
          if (!localJSONObject1.isNull("ttlAppListSyncInMs"))
            this.s = localJSONObject1.getLong("ttlAppListSyncInMs");
          if (!localJSONObject1.isNull("deviceStateTimestamp"))
            this.r = localJSONObject1.getLong("deviceStateTimestamp");
          if (!localJSONObject1.isNull("appListSyncTimestamp"))
            this.t = localJSONObject1.getLong("appListSyncTimestamp");
          if (!localJSONObject1.isNull("enableLocation"));
          for (this.h = localJSONObject1.getBoolean("enableLocation"); ; this.h = false)
          {
            if (localJSONObject1.isNull("enableInstalledApps"))
              break label652;
            this.i = localJSONObject1.getBoolean("enableInstalledApps");
            if (localJSONObject1.isNull("enableNetworkInfo"))
              break label660;
            this.j = localJSONObject1.getBoolean("enableNetworkInfo");
            if (localJSONObject1.isNull("enableDeviceInfo"))
              break label668;
            this.k = localJSONObject1.getBoolean("enableDeviceInfo");
            if (localJSONObject1.isNull("enableAudience"))
              break label676;
            this.l = localJSONObject1.getBoolean("enableAudience");
            if (localJSONObject1.isNull("enableAdEvent"))
              break label684;
            this.m = localJSONObject1.getBoolean("enableAdEvent");
            if (localJSONObject1.isNull("totalNoOfCategory"))
              break label692;
            this.n = localJSONObject1.getInt("totalNoOfCategory");
            if (localJSONObject1.isNull("policy"))
              break label700;
            this.o = localJSONObject1.getInt("policy");
            if (localJSONObject1.isNull("appfilters"))
              break;
            localJSONObject2 = localJSONObject1.getJSONObject("appfilters");
            if (localJSONObject2.isNull("meandata"))
              break label744;
            JSONObject localJSONObject5 = localJSONObject2.getJSONObject("meandata");
            q localq1 = q.a();
            localq1.getClass();
            locals = new s(localq1);
            locals.a(localJSONObject5.getString("version"));
            locals.a(localJSONObject5.getInt("appcount"));
            if (!localJSONObject5.isNull("totalNoOfCategory"))
              this.n = localJSONObject5.getInt("totalNoOfCategory");
            JSONArray localJSONArray5 = localJSONObject5.getJSONArray("classifications");
            if ((localJSONArray5 == null) || (localJSONArray5.length() <= 0))
              break label738;
            localArrayList4 = new ArrayList();
            i5 = 0;
            if (i5 >= localJSONArray5.length())
              break label731;
            q localq2 = q.a();
            localq2.getClass();
            localr = new r(localq2);
            JSONObject localJSONObject6 = localJSONArray5.getJSONObject(i5);
            localr.a(localJSONObject6.getInt("id"));
            localr.b(localJSONObject6.getInt("mean"));
            JSONArray localJSONArray6 = localJSONObject6.getJSONArray("apps");
            localArrayList5 = new ArrayList();
            for (int i6 = 0; i6 < localJSONArray6.length(); i6++)
              localArrayList5.add(Integer.valueOf(localJSONArray6.getInt(i6)));
          }
        }
      }
      catch (Throwable localThrowable)
      {
        localThrowable.printStackTrace();
      }
    while (true)
    {
      return;
      label652: this.i = false;
      break;
      label660: this.j = false;
      break label286;
      label668: this.k = false;
      break label305;
      label676: this.l = false;
      break label324;
      label684: this.m = false;
      break label343;
      label692: this.n = 0;
      break label362;
      label700: this.o = 1;
      break label381;
      localr.a(localArrayList5);
      localArrayList4.add(localr);
      i5++;
      break label518;
      label731: locals.a(localArrayList4);
      label738: this.u = locals;
      label744: if (!localJSONObject2.isNull("appinstallcampaigns"))
      {
        if (this.v == null)
          this.v = new ArrayList();
        JSONArray localJSONArray1 = localJSONObject2.getJSONArray("appinstallcampaigns");
        for (int i1 = 0; i1 < localJSONArray1.length(); i1++)
        {
          JSONObject localJSONObject3 = localJSONArray1.getJSONObject(i1);
          l locall = new l();
          locall.a = Integer.valueOf(localJSONObject3.getInt("id"));
          locall.b = Integer.valueOf(localJSONObject3.getInt("userid"));
          if (!localJSONObject3.isNull("isnotinstalled"))
          {
            JSONArray localJSONArray4 = localJSONObject3.getJSONArray("isnotinstalled");
            ArrayList localArrayList3 = new ArrayList();
            for (int i4 = 0; i4 < localJSONArray4.length(); i4++)
              localArrayList3.add(Integer.valueOf(localJSONArray4.getInt(i4)));
            locall.c = localArrayList3;
          }
          if (!localJSONObject3.isNull("isinstalled"))
          {
            ArrayList localArrayList1 = new ArrayList();
            JSONArray localJSONArray2 = localJSONObject3.getJSONArray("isinstalled");
            for (int i2 = 0; i2 < localJSONArray2.length(); i2++)
              localArrayList1.add(Integer.valueOf(localJSONArray2.getInt(i2)));
            locall.d = localArrayList1;
          }
          if (!localJSONObject3.isNull("tp"))
          {
            ArrayList localArrayList2 = new ArrayList();
            JSONArray localJSONArray3 = localJSONObject3.getJSONArray("tp");
            for (int i3 = 0; i3 < localJSONArray3.length(); i3++)
            {
              JSONObject localJSONObject4 = localJSONArray3.getJSONObject(i3);
              ae localae = new ae();
              localae.a(localJSONObject4.getString("n"));
              localae.b(localJSONObject4.getString("v"));
              localArrayList2.add(localae);
            }
            locall.e = localArrayList2;
          }
          this.v.add(locall);
        }
      }
    }
  }

  static ag d(Context paramContext)
  {
    if (y.compareAndSet(false, true))
      x.a(paramContext);
    return x;
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
    localJSONObject1.put("ttlEnhancedTargetParamsInMs", this.p);
    localJSONObject1.put("ttlDeviceStateInMs", this.q);
    localJSONObject1.put("deviceStateTimestamp", this.r);
    localJSONObject1.put("ttlAppListSyncInMs", this.s);
    localJSONObject1.put("appListSyncTimestamp", this.t);
    localJSONObject1.put("enableLocation", this.h);
    localJSONObject1.put("enableInstalledApps", this.i);
    localJSONObject1.put("enableNetworkInfo", this.j);
    localJSONObject1.put("enableDeviceInfo", this.k);
    localJSONObject1.put("enableAudience", this.l);
    localJSONObject1.put("enableAdEvent", this.m);
    localJSONObject1.put("policy", this.o);
    JSONObject localJSONObject2 = new JSONObject();
    JSONObject localJSONObject3 = new JSONObject();
    if (this.u != null)
    {
      localJSONObject3.put("version", this.u.a());
      localJSONObject3.put("appcount", this.u.b());
      localJSONObject3.put("totalNoOfCategory", this.n);
      JSONArray localJSONArray4 = new JSONArray();
      if ((this.u.c() != null) && (this.u.c().size() > 0))
      {
        Iterator localIterator4 = this.u.c().iterator();
        while (localIterator4.hasNext())
        {
          r localr = (r)localIterator4.next();
          JSONObject localJSONObject7 = new JSONObject();
          localJSONObject7.put("id", localr.a());
          localJSONObject7.put("mean", localr.b());
          localJSONObject7.put("apps", new JSONArray(localr.c()));
          localJSONArray4.put(localJSONObject7);
        }
      }
      localJSONObject3.put("classifications", localJSONArray4);
      localJSONObject2.put("meandata", localJSONObject3);
    }
    if (this.v != null)
    {
      JSONArray localJSONArray1 = new JSONArray();
      Iterator localIterator1 = this.v.iterator();
      while (localIterator1.hasNext())
      {
        l locall = (l)localIterator1.next();
        JSONObject localJSONObject5 = new JSONObject();
        localJSONObject5.put("id", locall.a);
        localJSONObject5.put("userid", locall.b);
        localJSONObject5.put("isnotinstalled", new JSONArray(locall.c));
        localJSONObject5.put("isinstalled", new JSONArray(locall.d));
        if (locall.e != null)
        {
          JSONArray localJSONArray3 = new JSONArray();
          Iterator localIterator3 = locall.e.iterator();
          while (localIterator3.hasNext())
          {
            ae localae = (ae)localIterator3.next();
            JSONObject localJSONObject6 = new JSONObject();
            localJSONObject6.put("n", localae.a());
            localJSONObject6.put("v", localae.b());
            localJSONArray3.put(localJSONObject6);
          }
          localJSONObject5.put("tp", localJSONArray3);
        }
        localJSONArray1.put(localJSONObject5);
      }
      localJSONObject2.put("appinstallcampaigns", localJSONArray1);
    }
    if (this.w != null)
    {
      JSONArray localJSONArray2 = new JSONArray();
      Iterator localIterator2 = this.w.values().iterator();
      while (localIterator2.hasNext())
      {
        m localm = (m)localIterator2.next();
        JSONObject localJSONObject4 = new JSONObject();
        localJSONObject4.put("id", localm.a);
        localJSONObject4.put("url", localm.b);
        localJSONArray2.put(localJSONObject4);
      }
      localJSONObject1.put("appurls", localJSONArray2);
    }
    localJSONObject1.put("appfilters", localJSONObject2);
    return localJSONObject1.toString();
  }

  final void a(int paramInt)
  {
    this.o = paramInt;
  }

  final void a(long paramLong)
  {
    this.r = paramLong;
  }

  protected final void a(String paramString)
  {
    if (!b())
      this.b = System.currentTimeMillis();
    if ((paramString != null) && (paramString.length() > 0))
    {
      JSONObject localJSONObject = new JSONObject(paramString);
      if (!localJSONObject.isNull("core"))
        b(localJSONObject.getJSONObject("core").toString());
    }
  }

  @SuppressLint({"UseSparseArrays"})
  protected final void a(String paramString, Context paramContext)
  {
    JSONObject localJSONObject1;
    if (paramString != null)
      try
      {
        if (paramString.length() > 0)
        {
          localJSONObject1 = new JSONObject(paramString);
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
            this.p = localJSONObject1.getLong("ttlEnhancedTargetParamsInMs");
          if (!localJSONObject1.isNull("ttlDeviceStateInMs"))
            this.q = localJSONObject1.getLong("ttlDeviceStateInMs");
          if (!localJSONObject1.isNull("ttlAppListSyncInMs"))
            this.s = localJSONObject1.getLong("ttlAppListSyncInMs");
          if (!localJSONObject1.isNull("deviceStateTimestamp"))
            this.r = localJSONObject1.getLong("deviceStateTimestamp");
          if (!localJSONObject1.isNull("appListSyncTimestamp"))
            this.t = localJSONObject1.getLong("appListSyncTimestamp");
          if (!localJSONObject1.isNull("enableLocation"));
          for (this.h = localJSONObject1.getBoolean("enableLocation"); !localJSONObject1.isNull("enableInstalledApps"); this.h = false)
          {
            this.i = localJSONObject1.getBoolean("enableInstalledApps");
            if (localJSONObject1.isNull("enableNetworkInfo"))
              break label600;
            this.j = localJSONObject1.getBoolean("enableNetworkInfo");
            label315: if (localJSONObject1.isNull("enableDeviceInfo"))
              break label608;
            this.k = localJSONObject1.getBoolean("enableDeviceInfo");
            label336: if (localJSONObject1.isNull("enableAudience"))
              break label616;
            this.l = localJSONObject1.getBoolean("enableAudience");
            label357: if (localJSONObject1.isNull("enableAdEvent"))
              break label624;
            this.m = localJSONObject1.getBoolean("enableAdEvent");
            label378: if (localJSONObject1.isNull("totalNoOfCategory"))
              break label632;
            this.n = localJSONObject1.getInt("totalNoOfCategory");
            label399: if (localJSONObject1.isNull("policy"))
              break label640;
            this.o = localJSONObject1.getInt("policy");
            label420: if (localJSONObject1.isNull("urlpackagesAndroid"))
              break label648;
            JSONObject localJSONObject9 = localJSONObject1.getJSONObject("urlpackagesAndroid");
            if (localJSONObject9.isNull("appUrlPackageAndroid"))
              break label648;
            JSONArray localJSONArray10 = localJSONObject9.getJSONArray("appUrlPackageAndroid");
            if ((localJSONArray10 == null) || (localJSONArray10.length() <= 0))
              break label648;
            for (int i11 = 0; i11 < localJSONArray10.length(); i11++)
            {
              if (this.w == null)
                this.w = new HashMap();
              JSONObject localJSONObject10 = localJSONArray10.getJSONObject(i11);
              m localm = new m();
              localm.a = localJSONObject10.getInt("id");
              localm.b = localJSONObject10.getString("url");
              this.w.put(Integer.valueOf(localm.a), localm);
            }
          }
        }
      }
      catch (Throwable localThrowable1)
      {
        ak.a(ak.a(localThrowable1));
      }
    while (true)
    {
      return;
      this.i = false;
      break;
      label600: this.j = false;
      break label315;
      label608: this.k = false;
      break label336;
      label616: this.l = false;
      break label357;
      label624: this.m = false;
      break label378;
      label632: this.n = 0;
      break label399;
      label640: this.o = 0;
      break label420;
      label648: if (!localJSONObject1.isNull("appFilters"))
      {
        o localo = o.a(paramContext);
        JSONObject localJSONObject2 = localJSONObject1.getJSONObject("appFilters");
        if (!localJSONObject2.isNull("appList"))
        {
          JSONArray localJSONArray9 = localJSONObject2.getJSONArray("appList");
          if ((localJSONArray9 != null) && (localJSONArray9.length() > 0))
          {
            int i9 = 0;
            while (true)
            {
              int i10 = localJSONArray9.length();
              if (i9 < i10)
                try
                {
                  JSONObject localJSONObject8 = localJSONArray9.getJSONObject(i9);
                  k localk = new k();
                  if (!localJSONObject8.isNull("name"))
                    localk.a(localJSONObject8.getString("name"));
                  if (!localJSONObject8.isNull("classificationid"))
                    localk.a(localJSONObject8.getInt("classificationid"));
                  if (!localJSONObject8.isNull("id"))
                    localk.b(localJSONObject8.getInt("id"));
                  localo.a(localk);
                  i9++;
                }
                catch (Throwable localThrowable2)
                {
                  while (true)
                    ak.a("AppList Error: " + localThrowable2.getMessage());
                }
            }
          }
        }
        if (!localJSONObject2.isNull("mean"))
        {
          JSONObject localJSONObject6 = localJSONObject2.getJSONObject("mean");
          q localq1 = q.a();
          localq1.getClass();
          s locals = new s(localq1);
          locals.a(localJSONObject6.getString("version"));
          locals.a(localJSONObject6.getInt("appcount"));
          if (!localJSONObject6.isNull("totalNoOfCategory"))
            this.n = localJSONObject6.getInt("totalNoOfCategory");
          JSONArray localJSONArray7 = localJSONObject6.getJSONArray("classifications");
          if ((localJSONArray7 != null) && (localJSONArray7.length() > 0))
          {
            ArrayList localArrayList5 = new ArrayList();
            for (int i7 = 0; i7 < localJSONArray7.length(); i7++)
            {
              q localq2 = q.a();
              localq2.getClass();
              r localr = new r(localq2);
              JSONObject localJSONObject7 = localJSONArray7.getJSONObject(i7);
              localr.a(localJSONObject7.getInt("id"));
              localr.b(localJSONObject7.getInt("mean"));
              JSONArray localJSONArray8 = localJSONObject7.getJSONArray("apps");
              ArrayList localArrayList6 = new ArrayList();
              for (int i8 = 0; i8 < localJSONArray8.length(); i8++)
                localArrayList6.add(Integer.valueOf(localJSONArray8.getInt(i8)));
              localr.a(localArrayList6);
              localArrayList5.add(localr);
              localo.a(localr);
            }
            locals.a(localArrayList5);
          }
          localo.a(locals);
          this.u = locals;
        }
        if (!localJSONObject2.isNull("campaigns"))
        {
          if (this.v == null)
            this.v = new ArrayList();
          JSONArray localJSONArray1 = localJSONObject2.getJSONArray("campaigns");
          for (int i1 = 0; i1 < localJSONArray1.length(); i1++)
          {
            JSONObject localJSONObject3 = localJSONArray1.getJSONObject(i1);
            if (!localJSONObject3.isNull("action"))
            {
              String str = localJSONObject3.getString("action");
              if (str.equals("add"))
              {
                if (!localJSONObject3.isNull("data"))
                {
                  JSONArray localJSONArray3 = localJSONObject3.getJSONArray("data");
                  for (int i3 = 0; i3 < localJSONArray3.length(); i3++)
                  {
                    JSONObject localJSONObject4 = localJSONArray3.getJSONObject(i3);
                    l locall2 = new l();
                    locall2.a = Integer.valueOf(localJSONObject4.getInt("id"));
                    locall2.b = Integer.valueOf(localJSONObject4.getInt("userid"));
                    if (!localJSONObject4.isNull("notinstall"))
                    {
                      JSONArray localJSONArray6 = localJSONObject4.getJSONArray("notinstall");
                      ArrayList localArrayList4 = new ArrayList();
                      for (int i6 = 0; i6 < localJSONArray6.length(); i6++)
                        localArrayList4.add(Integer.valueOf(localJSONArray6.getInt(i6)));
                      locall2.c = localArrayList4;
                    }
                    if (!localJSONObject4.isNull("install"))
                    {
                      ArrayList localArrayList2 = new ArrayList();
                      JSONArray localJSONArray4 = localJSONObject4.getJSONArray("install");
                      for (int i4 = 0; i4 < localJSONArray4.length(); i4++)
                        localArrayList2.add(Integer.valueOf(localJSONArray4.getInt(i4)));
                      locall2.d = localArrayList2;
                    }
                    if (!localJSONObject4.isNull("tp"))
                    {
                      ArrayList localArrayList3 = new ArrayList();
                      JSONArray localJSONArray5 = localJSONObject4.getJSONArray("tp");
                      for (int i5 = 0; i5 < localJSONArray5.length(); i5++)
                      {
                        JSONObject localJSONObject5 = localJSONArray5.getJSONObject(i5);
                        ae localae = new ae();
                        localae.a(localJSONObject5.getString("n"));
                        localae.b(localJSONObject5.getString("v"));
                        localArrayList3.add(localae);
                      }
                      locall2.e = localArrayList3;
                    }
                    this.v.add(locall2);
                  }
                }
              }
              else if (str.equals("delete"))
              {
                HashSet localHashSet = new HashSet();
                if (!localJSONObject3.isNull("data"))
                {
                  JSONArray localJSONArray2 = localJSONObject3.getJSONArray("data");
                  for (int i2 = 0; i2 < localJSONArray2.length(); i2++)
                    localHashSet.add(Integer.valueOf(localJSONArray2.getJSONObject(i1).getInt("id")));
                  ArrayList localArrayList1 = new ArrayList();
                  Iterator localIterator = this.v.iterator();
                  while (localIterator.hasNext())
                  {
                    l locall1 = (l)localIterator.next();
                    if (!localHashSet.contains(locall1.a))
                      localArrayList1.add(locall1);
                  }
                  this.v = localArrayList1;
                }
              }
            }
          }
        }
      }
    }
  }

  public final void b(long paramLong)
  {
    this.t = paramLong;
  }

  final boolean b()
  {
    if (this.a == -1L);
    while (System.currentTimeMillis() - this.b < this.a)
      return true;
    return false;
  }

  final String c()
  {
    return this.d;
  }

  final void c(Context paramContext)
  {
    String str1 = ak.a(paramContext) + System.getProperty("line.separator") + ".3ca154f5-9711-475d-819c-7bab4289e4a7";
    JSONObject localJSONObject1 = new JSONObject();
    String str2 = a();
    if ((str2 != null) && (str2.length() > 0))
      localJSONObject1.put("core", new JSONObject(str2));
    JSONObject localJSONObject2 = new JSONObject();
    localJSONObject2.put("stopForPeriodTimestamp", this.b);
    String str3 = localJSONObject2.toString();
    if ((str3 != null) && (str3.length() > 0))
      localJSONObject1.put("extra", new JSONObject(str3));
    ak.a(str1, localJSONObject1.toString());
  }

  final String d()
  {
    return this.c;
  }

  final String e()
  {
    return this.e;
  }

  final String f()
  {
    return this.f;
  }

  final boolean g()
  {
    return this.h;
  }

  final boolean h()
  {
    return this.i;
  }

  final boolean i()
  {
    return this.j;
  }

  final boolean j()
  {
    return this.l;
  }

  final boolean k()
  {
    return this.m;
  }

  final long l()
  {
    return this.p;
  }

  final long m()
  {
    return this.q;
  }

  final long n()
  {
    return this.s;
  }

  final long o()
  {
    return this.r;
  }

  public final long p()
  {
    return this.t;
  }

  final int q()
  {
    return this.g;
  }

  final Map<Integer, m> r()
  {
    return this.w;
  }

  final List<l> s()
  {
    return this.v;
  }

  final int t()
  {
    return this.o;
  }

  public final int u()
  {
    return this.n;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.ag
 * JD-Core Version:    0.6.2
 */