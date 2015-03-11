package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ci
{
  private int a;
  private List<cq> b;
  private boolean c;
  private boolean d;

  public static ci a(ci paramci1, ci paramci2)
  {
    if ((paramci1 == null) || (paramci2 == null))
      return null;
    List localList1 = paramci1.a();
    List localList2 = paramci2.a();
    if ((localList1 == null) || (localList1.isEmpty()) || (localList2 == null) || (localList2.isEmpty()))
      return null;
    cq localcq1 = (cq)localList1.get(0);
    cq localcq2 = (cq)localList2.get(0);
    cs localcs1 = localcq1.c();
    cs localcs2 = localcq2.c();
    if ((localcs1 == null) || (localcs2 == null))
      return null;
    if ((!cl.c.equals(localcs1.a())) || ((!cl.b.equals(localcs2.a())) && (!cl.c.equals(localcs2.a()))))
      return null;
    List localList3 = localcs1.g();
    List localList4 = localcs2.g();
    if ((localList4 == null) || (localList4.isEmpty()))
      return null;
    ArrayList localArrayList1 = new ArrayList(1);
    if ((localList3 == null) || (localList3.isEmpty()))
      localArrayList1.addAll(localList4);
    cs.a locala;
    ArrayList localArrayList2;
    List localList6;
    while (true)
    {
      locala = new cs.a();
      locala.a(cl.c);
      locala.a(localcs2.b());
      locala.a(localcs1.c());
      localArrayList2 = new ArrayList();
      List localList5 = localcs1.d();
      if (localList5 != null)
        localArrayList2.addAll(localList5);
      localList6 = localcs2.d();
      if (localList6 == null)
        break label476;
      Iterator localIterator = localList6.iterator();
      do
        if (!localIterator.hasNext())
          break;
      while (!localArrayList2.contains((String)localIterator.next()));
      return null;
      ct localct1 = (ct)localList3.get(0);
      ct localct2 = (ct)localList4.get(0);
      cu localcu1 = localct1.d();
      cu localcu2 = localct2.d();
      if ((localcu1 == null) || (localcu2 == null))
        return null;
      cu localcu3 = cu.a(localcu1, localcu2);
      if (localcu3 == null)
        return null;
      ct.a locala3 = new ct.a();
      locala3.a(localct2.a());
      locala3.a(localct2.b());
      locala3.a(localct2.c());
      locala3.a(localcu3);
      localArrayList1.add(locala3.a());
    }
    localArrayList2.addAll(localList6);
    label476: locala.a(localArrayList2);
    ArrayList localArrayList3 = new ArrayList();
    List localList7 = localcs1.e();
    if (localList7 != null)
      localArrayList3.addAll(localList7);
    List localList8 = localcs2.e();
    if (localList8 != null)
      localArrayList3.addAll(localList8);
    locala.b(localArrayList3);
    ArrayList localArrayList4 = new ArrayList();
    List localList9 = localcs1.f();
    if (localList9 != null)
      localArrayList4.addAll(localList9);
    List localList10 = localcs2.f();
    if (localList10 != null)
      localArrayList4.addAll(localList10);
    locala.c(localArrayList4);
    locala.d(localArrayList1);
    cs localcs3 = locala.a();
    cq.a locala1 = new cq.a();
    locala1.a(localcq1.a());
    locala1.a(localcq1.b());
    locala1.a(localcs3);
    cq localcq3 = locala1.a();
    ArrayList localArrayList5 = new ArrayList(1);
    localArrayList5.add(localcq3);
    ci.a locala2 = new ci.a();
    locala2.a(localArrayList5);
    locala2.a(paramci1.b());
    locala2.a(cl.b.equals(localcs2.a()));
    return locala2.b();
  }

  public String a(cp paramcp)
  {
    List localList1 = a();
    if ((localList1 != null) && (!localList1.isEmpty()))
    {
      cs localcs = ((cq)localList1.get(0)).c();
      if (localcs != null)
      {
        List localList2 = localcs.g();
        if ((localList2 != null) && (!localList2.isEmpty()))
        {
          cu localcu = ((ct)localList2.get(0)).d();
          if (localcu != null)
          {
            Map localMap = localcu.d();
            if (localMap != null)
              return (String)localMap.get(paramcp);
          }
        }
      }
    }
    return null;
  }

  public List<cq> a()
  {
    return this.b;
  }

  public List<String> a(co paramco)
  {
    List localList1 = a();
    if ((localList1 != null) && (!localList1.isEmpty()))
    {
      cs localcs = ((cq)localList1.get(0)).c();
      if (localcs != null)
      {
        List localList2 = localcs.g();
        if ((localList2 != null) && (!localList2.isEmpty()))
        {
          cu localcu = ((ct)localList2.get(0)).d();
          if (localcu != null)
          {
            ds localds = localcu.c();
            if (localds != null)
              return localds.a(paramco);
          }
        }
      }
    }
    return null;
  }

  public int b()
  {
    return this.a;
  }

  public boolean c()
  {
    return this.c;
  }

  public boolean d()
  {
    return this.d;
  }

  public String e()
  {
    List localList1 = a();
    if ((localList1 != null) && (!localList1.isEmpty()))
    {
      cs localcs = ((cq)localList1.get(0)).c();
      if (localcs != null)
      {
        List localList2 = localcs.d();
        if ((localList2 != null) && (!localList2.isEmpty()))
          return (String)localList2.get(-1 + localList2.size());
      }
    }
    return null;
  }

  public String f()
  {
    List localList1 = a();
    if ((localList1 != null) && (!localList1.isEmpty()))
    {
      cs localcs = ((cq)localList1.get(0)).c();
      if (localcs != null)
      {
        List localList2 = localcs.g();
        if ((localList2 != null) && (!localList2.isEmpty()))
        {
          cu localcu = ((ct)localList2.get(0)).d();
          if (localcu != null)
          {
            cv localcv = localcu.e();
            if ((localcv != null) && (localcv.a() != null))
              return localcv.a();
          }
        }
      }
    }
    return null;
  }

  public List<String> g()
  {
    List localList = a();
    if ((localList != null) && (!localList.isEmpty()))
    {
      cs localcs = ((cq)localList.get(0)).c();
      if (localcs != null)
        return localcs.f();
    }
    return null;
  }

  public List<String> h()
  {
    List localList = a();
    if ((localList != null) && (!localList.isEmpty()))
    {
      cs localcs = ((cq)localList.get(0)).c();
      if (localcs != null)
        return localcs.e();
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ci
 * JD-Core Version:    0.6.2
 */