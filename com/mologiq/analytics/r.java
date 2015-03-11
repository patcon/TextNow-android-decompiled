package com.mologiq.analytics;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class r
{
  private static r b;
  private final WeakReference<Context> a;

  private r(Context paramContext)
  {
    this.a = new WeakReference(paramContext);
  }

  public static r a(Context paramContext)
  {
    if (b == null)
      b = new r(paramContext);
    return b;
  }

  private static Map<String, Object> a(List<j> paramList, List<Integer> paramList1)
  {
    Object localObject = null;
    Iterator localIterator1 = paramList.iterator();
    while (true)
    {
      if (!localIterator1.hasNext())
        return localObject;
      j localj = (j)localIterator1.next();
      int i = 1;
      if (localj.d.size() > 0)
      {
        HashSet localHashSet1 = new HashSet(paramList1);
        localHashSet1.retainAll(localj.d);
        if (localHashSet1.isEmpty())
          i = 0;
      }
      if (localj.c.size() > 0)
      {
        HashSet localHashSet2 = new HashSet(paramList1);
        localHashSet2.retainAll(localj.c);
        if (!localHashSet2.isEmpty())
          i = 0;
      }
      if (i != 0)
      {
        if (localObject == null)
          localObject = new HashMap();
        Iterator localIterator2 = localj.e.iterator();
        while (localIterator2.hasNext())
        {
          z localz = (z)localIterator2.next();
          ((Map)localObject).put(localz.a(), localz.b());
        }
      }
    }
  }

  public final Map<String, Object> a(String paramString, Map<String, Object> paramMap)
  {
    Object localObject;
    while (true)
    {
      try
      {
        Context localContext = (Context)this.a.get();
        if (localContext == null)
          return null;
        ab localab = ab.d(localContext);
        if (localab.b())
          return null;
        if (paramMap == null)
        {
          localObject = new HashMap();
          ac localac = ac.b();
          localac.a(localContext);
          if ((localab.p() != null) && (localab.p().size() > 0))
          {
            Map localMap2 = a(localab.p(), localac.w());
            if (localMap2 != null)
              ((Map)localObject).putAll(localMap2);
          }
          x localx = x.b();
          localx.a(localContext);
          long l = System.currentTimeMillis();
          ArrayList localArrayList;
          Iterator localIterator;
          if (l - localx.d() > localab.j())
          {
            new af(localContext);
            aa localaa = new aa();
            localaa.e(localac.m());
            localaa.a(localac.n());
            localaa.f(localac.o());
            localaa.b("1.2.9");
            localaa.c("2014-07-08");
            if (localContext.getPackageName() == null)
            {
              str1 = "";
              localaa.a(str1);
              localaa.d(paramString);
              if ((localObject != null) && (((Map)localObject).size() > 0))
              {
                localArrayList = new ArrayList();
                localIterator = ((Map)localObject).keySet().iterator();
                if (localIterator.hasNext())
                  continue;
                if (localArrayList.size() > 0)
                  localaa.a(localArrayList);
              }
              String str3 = af.a(localab.f(), localaa.a(), localContext, 500, 1000, true);
              if ((str3 != null) && (str3.length() > 0))
                localx.b(str3);
              localx.a(l);
              localx.b(localContext);
            }
          }
          else
          {
            Map localMap1 = localx.c();
            if ((localObject == null) || (localMap1 == null))
              break;
            ((Map)localObject).putAll(localMap1);
            break;
          }
          String str1 = localContext.getPackageName();
          continue;
          String str2 = (String)localIterator.next();
          if (!(((Map)localObject).get(str2) instanceof String))
            continue;
          z localz = new z();
          localz.a(str2);
          localz.b((String)((Map)localObject).get(str2));
          localArrayList.add(localz);
          continue;
        }
      }
      catch (Exception localException)
      {
        af.a(localException.getStackTrace().toString());
        return null;
      }
      localObject = paramMap;
    }
    return localObject;
  }

  public final void a()
  {
    try
    {
      Context localContext = (Context)this.a.get();
      if (localContext == null)
        return;
      new Thread(new s(localContext)).start();
      return;
    }
    catch (Exception localException)
    {
      af.a("MologiqAnalytics" + localException.getStackTrace().toString());
    }
  }

  public final void a(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2)
  {
    try
    {
      Context localContext = (Context)this.a.get();
      if (localContext == null)
        return;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(w.a);
      new Thread(new v(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2)).start();
      return;
    }
    catch (Exception localException)
    {
      af.a(localException.getStackTrace().toString());
    }
  }

  public final void b()
  {
    try
    {
      Context localContext = (Context)this.a.get();
      e.a = null;
      if (localContext == null);
      return;
    }
    catch (Exception localException)
    {
      af.a(localException.getStackTrace().toString());
    }
  }

  public final void b(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2)
  {
    try
    {
      Context localContext = (Context)this.a.get();
      if (localContext == null)
        return;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(w.a);
      localArrayList.add(w.b);
      new Thread(new v(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2)).start();
      return;
    }
    catch (Exception localException)
    {
      af.a(localException.getStackTrace().toString());
    }
  }

  public final void c(String paramString1, int paramInt, Map<String, Object> paramMap, String paramString2)
  {
    try
    {
      Context localContext = (Context)this.a.get();
      if (localContext == null)
        return;
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(w.c);
      new Thread(new v(localContext, localArrayList, paramMap, paramString1, paramInt, paramString2)).start();
      return;
    }
    catch (Exception localException)
    {
      af.a(localException.getStackTrace().toString());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.r
 * JD-Core Version:    0.6.2
 */