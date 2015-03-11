package com.flurry.sdk;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class gr
{
  public gq a(fn paramfn, Map<gr.a, gq> paramMap)
  {
    gq localgq1;
    gq[] arrayOfgq3;
    gq localgq2;
    Iterator localIterator2;
    int k;
    switch (1.a[paramfn.a().ordinal()])
    {
    default:
      throw new RuntimeException("Unexpected schema type");
    case 1:
      localgq1 = gq.c;
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
      gr.a locala;
      do
      {
        return localgq1;
        return gq.d;
        return gq.e;
        return gq.f;
        return gq.g;
        return gq.h;
        return gq.i;
        return gq.j;
        gq[] arrayOfgq9 = new gq[2];
        arrayOfgq9[0] = new gq.h(paramfn.l());
        arrayOfgq9[1] = gq.k;
        return gq.b(arrayOfgq9);
        gq[] arrayOfgq8 = new gq[2];
        arrayOfgq8[0] = new gq.h(paramfn.c().size());
        arrayOfgq8[1] = gq.l;
        return gq.b(arrayOfgq8);
        gq[] arrayOfgq6 = new gq[2];
        gq localgq4 = gq.o;
        gq[] arrayOfgq7 = new gq[1];
        arrayOfgq7[0] = a(paramfn.i(), paramMap);
        arrayOfgq6[0] = gq.a(localgq4, arrayOfgq7);
        arrayOfgq6[1] = gq.n;
        return gq.b(arrayOfgq6);
        gq[] arrayOfgq4 = new gq[2];
        gq localgq3 = gq.q;
        gq[] arrayOfgq5 = new gq[2];
        arrayOfgq5[0] = a(paramfn.j(), paramMap);
        arrayOfgq5[1] = gq.i;
        arrayOfgq4[0] = gq.a(localgq3, arrayOfgq5);
        arrayOfgq4[1] = gq.p;
        return gq.b(arrayOfgq4);
        locala = new gr.a(paramfn);
        localgq1 = (gq)paramMap.get(locala);
      }
      while (localgq1 != null);
      arrayOfgq3 = new gq[paramfn.b().size()];
      localgq2 = gq.b(arrayOfgq3);
      paramMap.put(locala, localgq2);
      int j = arrayOfgq3.length;
      localIterator2 = paramfn.b().iterator();
      k = j;
    case 14:
    }
    while (localIterator2.hasNext())
    {
      fn.f localf = (fn.f)localIterator2.next();
      k--;
      arrayOfgq3[k] = a(localf.c(), paramMap);
      continue;
      List localList = paramfn.k();
      gq[] arrayOfgq1 = new gq[localList.size()];
      String[] arrayOfString = new String[localList.size()];
      Iterator localIterator1 = paramfn.k().iterator();
      for (int i = 0; localIterator1.hasNext(); i++)
      {
        fn localfn = (fn)localIterator1.next();
        arrayOfgq1[i] = a(localfn, paramMap);
        arrayOfString[i] = localfn.g();
      }
      gq[] arrayOfgq2 = new gq[2];
      arrayOfgq2[0] = gq.a(arrayOfgq1, arrayOfString);
      arrayOfgq2[1] = gq.m;
      return gq.b(arrayOfgq2);
    }
    return localgq2;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gr
 * JD-Core Version:    0.6.2
 */