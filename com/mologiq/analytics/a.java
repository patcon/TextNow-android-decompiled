package com.mologiq.analytics;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class a
{
  private static a b;
  private final WeakReference<Context> a;

  public a()
  {
    this.a = textnow.as.a.a;
  }

  private a(Context paramContext)
  {
    this.a = new WeakReference(paramContext);
  }

  public static a a(Context paramContext)
  {
    if (b == null)
      b = new a(paramContext);
    return b;
  }

  private static Map<String, Object> a(List<l> paramList, List<Integer> paramList1)
  {
    HashMap localHashMap = null;
    Iterator localIterator1 = paramList.iterator();
    while (localIterator1.hasNext())
    {
      l locall = (l)localIterator1.next();
      int i = 1;
      if (locall.d.size() > 0)
      {
        HashSet localHashSet1 = new HashSet(paramList1);
        localHashSet1.retainAll(locall.d);
        if (localHashSet1.isEmpty())
          i = 0;
      }
      if (locall.c.size() > 0)
      {
        HashSet localHashSet2 = new HashSet(paramList1);
        localHashSet2.retainAll(locall.c);
        if (!localHashSet2.isEmpty())
          i = 0;
      }
      if (i != 0)
      {
        if (localHashMap == null)
          localHashMap = new HashMap();
        Iterator localIterator2 = locall.e.iterator();
        while (localIterator2.hasNext())
        {
          ae localae = (ae)localIterator2.next();
          localHashMap.put(localae.a(), localae.b());
        }
      }
    }
    return localHashMap;
  }

  public static void a(Context paramContext, boolean paramBoolean)
  {
    try
    {
      ah localah = ah.b();
      localah.a(paramContext);
      localah.b(paramBoolean);
      localah.b(paramContext);
      return;
    }
    catch (Exception localException)
    {
      ak.a(ak.a(localException));
    }
  }

  public final Map<String, Object> a(String paramString, Map<String, Object> paramMap)
  {
    while (true)
    {
      Context localContext;
      ag localag;
      ah localah;
      ac localac;
      long l;
      af localaf;
      LocationManager localLocationManager;
      ArrayList localArrayList;
      try
      {
        localContext = (Context)this.a.get();
        if (localContext == null)
          return null;
        localag = ag.d(localContext);
        if (localag.b())
          return null;
        if (paramMap != null)
          break label917;
        localObject = new HashMap();
        localah = ah.b();
        localah.a(localContext);
        if ((localag.s() != null) && (localag.s().size() > 0))
        {
          Map localMap2 = a(localag.s(), localah.w());
          if (localMap2 != null)
            ((Map)localObject).putAll(localMap2);
        }
        localac = ac.b();
        localac.a(localContext);
        l = System.currentTimeMillis();
        if (l - localac.d() <= localag.l())
          break label882;
        new ak(localContext);
        localaf = new af();
        localaf.e(localah.m());
        localaf.a(localah.n());
        localaf.f(localah.o());
        localaf.b("1.3.6");
        localaf.c("2014-11-17");
        if (localContext.getPackageName() == null)
        {
          str1 = "";
          localaf.a(str1);
          localaf.d(paramString);
          if (localag.g())
          {
            localaf.b(true);
            localLocationManager = (LocationManager)localContext.getSystemService("location");
            boolean bool = ak.a(localContext, "android.permission.ACCESS_FINE_LOCATION");
            Location localLocation1 = null;
            if (bool)
              localLocation1 = localLocationManager.getLastKnownLocation("gps");
            if (localLocation1 == null)
              break label599;
            double d1 = localLocation1.getLatitude();
            double d2 = localLocation1.getLongitude();
            String str4 = "" + (int)(d1 * localag.q()) + (int)(d2 * localag.q());
            if (!("" + (int)(localah.k() * localag.q()) + (int)(localah.l() * localag.q())).equals(str4))
            {
              localaf.a(d1);
              localaf.b(d2);
            }
            localaf.d(localLocation1.getAccuracy());
            localaf.c(localLocation1.getAltitude());
            localaf.e(localLocation1.getSpeed());
            localaf.a(localLocation1.getTime());
          }
          if ((localObject == null) || (((Map)localObject).size() <= 0))
            break label823;
          localArrayList = new ArrayList();
          Iterator localIterator = ((Map)localObject).keySet().iterator();
          if (!localIterator.hasNext())
            break label806;
          String str3 = (String)localIterator.next();
          if (!(((Map)localObject).get(str3) instanceof String))
            continue;
          ae localae = new ae();
          localae.a(str3);
          localae.b((String)((Map)localObject).get(str3));
          localArrayList.add(localae);
          continue;
        }
      }
      catch (Exception localException)
      {
        ak.a(ak.a(localException));
        return null;
      }
      String str1 = localContext.getPackageName();
      continue;
      label599: if ((ak.a(localContext, "android.permission.ACCESS_FINE_LOCATION")) || (ak.a(localContext, "android.permission.ACCESS_COARSE_LOCATION")));
      for (Location localLocation2 = localLocationManager.getLastKnownLocation("network"); localLocation2 != null; localLocation2 = null)
      {
        double d3 = localLocation2.getLatitude();
        double d4 = localLocation2.getLongitude();
        String str5 = "" + (int)(d3 * localag.q()) + (int)(d4 * localag.q());
        if (!("" + (int)(localah.k() * localag.q()) + (int)(localah.l() * localag.q())).equals(str5))
        {
          localaf.a(d3);
          localaf.b(d4);
        }
        localaf.d(localLocation2.getAccuracy());
        localaf.c(localLocation2.getAltitude());
        localaf.e(localLocation2.getSpeed());
        localaf.a(localLocation2.getTime());
        break;
        label806: if (localArrayList.size() > 0)
          localaf.a(localArrayList);
        label823: String str2 = ak.a(localag.f(), localaf.a(), localContext, 500, 1000, true);
        if ((str2 != null) && (str2.length() > 0))
          localac.b(str2);
        localac.a(l);
        localac.b(localContext);
        label882: Map localMap1 = localac.c();
        if ((localObject != null) && (localMap1 != null))
          ((Map)localObject).putAll(localMap1);
        return localObject;
      }
      label917: Object localObject = paramMap;
    }
  }

  public final void a()
  {
    Context localContext;
    try
    {
      localContext = (Context)this.a.get();
      if (localContext == null)
        return;
      if (b.a() >= 11)
      {
        new Handler(localContext.getMainLooper()).post(new v(localContext));
        return;
      }
    }
    catch (Exception localException)
    {
      ak.a(ak.a(localException));
      return;
    }
    new Handler(localContext.getMainLooper()).post(new u(localContext));
  }

  public final void a(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2)
  {
    Context localContext;
    ArrayList localArrayList;
    try
    {
      localContext = (Context)this.a.get();
      if (localContext == null)
        return;
      localArrayList = new ArrayList();
      localArrayList.add(z.a);
      if (b.a() >= 11)
      {
        new Handler(localContext.getMainLooper()).post(new ab(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2));
        return;
      }
    }
    catch (Exception localException)
    {
      ak.a(ak.a(localException));
      return;
    }
    new Handler(localContext.getMainLooper()).post(new aa(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2));
  }

  public final void b()
  {
    try
    {
      Context localContext = (Context)this.a.get();
      g.a = null;
      if (localContext == null);
      return;
    }
    catch (Exception localException)
    {
      ak.a(ak.a(localException));
    }
  }

  public final void b(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2)
  {
    Context localContext;
    ArrayList localArrayList;
    try
    {
      localContext = (Context)this.a.get();
      if (localContext == null)
        return;
      localArrayList = new ArrayList();
      localArrayList.add(z.a);
      localArrayList.add(z.b);
      if (b.a() >= 11)
      {
        new Handler(localContext.getMainLooper()).post(new ab(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2));
        return;
      }
    }
    catch (Exception localException)
    {
      ak.a(ak.a(localException));
      return;
    }
    new Handler(localContext.getMainLooper()).post(new aa(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2));
  }

  public final void c(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2)
  {
    Context localContext;
    ArrayList localArrayList;
    try
    {
      localContext = (Context)this.a.get();
      if (localContext == null)
        return;
      localArrayList = new ArrayList();
      localArrayList.add(z.c);
      if (b.a() >= 11)
      {
        new Handler(localContext.getMainLooper()).post(new ab(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2));
        return;
      }
    }
    catch (Exception localException)
    {
      ak.a(ak.a(localException));
      return;
    }
    new Handler(localContext.getMainLooper()).post(new aa(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.a
 * JD-Core Version:    0.6.2
 */