package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class go extends gr
{
  private static gj a = new gj().a(32);

  private static gq a(List<String> paramList1, List<String> paramList2)
  {
    Object[] arrayOfObject = new Object[paramList1.size()];
    int i = 0;
    if (i < arrayOfObject.length)
    {
      int j = paramList2.indexOf(paramList1.get(i));
      if (j == -1);
      for (Object localObject = "No match for " + (String)paramList1.get(i); ; localObject = new Integer(j))
      {
        arrayOfObject[i] = localObject;
        i++;
        break;
      }
    }
    return new gq.c(paramList2.size(), arrayOfObject);
  }

  public static void a(gi paramgi, fn paramfn, hh paramhh)
  {
    byte[] arrayOfByte1;
    byte[] arrayOfByte3;
    int i;
    switch (1.a[paramfn.a().ordinal()])
    {
    default:
      return;
    case 13:
      Iterator localIterator3 = paramfn.b().iterator();
      while (localIterator3.hasNext())
      {
        fn.f localf = (fn.f)localIterator3.next();
        String str2 = localf.a();
        hh localhh2 = paramhh.a(str2);
        if (localhh2 == null)
          localhh2 = localf.e();
        if (localhh2 == null)
          throw new fl("No default value for: " + str2);
        a(paramgi, localf.c(), localhh2);
      }
    case 10:
      paramgi.a(paramfn.c(paramhh.i()));
      return;
    case 11:
      paramgi.b();
      paramgi.a(paramhh.p());
      fn localfn2 = paramfn.i();
      Iterator localIterator2 = paramhh.iterator();
      while (localIterator2.hasNext())
      {
        hh localhh1 = (hh)localIterator2.next();
        paramgi.c();
        a(paramgi, localfn2, localhh1);
      }
      paramgi.d();
      return;
    case 12:
      paramgi.e();
      paramgi.a(paramhh.p());
      fn localfn1 = paramfn.j();
      Iterator localIterator1 = paramhh.r();
      while (localIterator1.hasNext())
      {
        paramgi.c();
        String str1 = (String)localIterator1.next();
        paramgi.a(str1);
        a(paramgi, localfn1, paramhh.a(str1));
      }
      paramgi.f();
      return;
    case 14:
      paramgi.b(0);
      a(paramgi, (fn)paramfn.k().get(0), paramhh);
      return;
    case 9:
      if (!paramhh.f())
        throw new fl("Non-string default value for fixed: " + paramhh);
      arrayOfByte1 = paramhh.i().getBytes("ISO-8859-1");
      if (arrayOfByte1.length != paramfn.l())
      {
        arrayOfByte3 = new byte[paramfn.l()];
        if (paramfn.l() > arrayOfByte1.length)
        {
          i = arrayOfByte1.length;
          System.arraycopy(arrayOfByte1, 0, arrayOfByte3, 0, i);
        }
      }
      break;
    case 7:
    case 8:
    case 3:
    case 4:
    case 5:
    case 6:
    case 2:
    case 1:
    }
    for (byte[] arrayOfByte2 = arrayOfByte3; ; arrayOfByte2 = arrayOfByte1)
    {
      paramgi.b(arrayOfByte2);
      return;
      i = paramfn.l();
      break;
      if (!paramhh.f())
        throw new fl("Non-string default value for string: " + paramhh);
      paramgi.a(paramhh.i());
      return;
      if (!paramhh.f())
        throw new fl("Non-string default value for bytes: " + paramhh);
      paramgi.a(paramhh.i().getBytes("ISO-8859-1"));
      return;
      if (!paramhh.d())
        throw new fl("Non-numeric default value for int: " + paramhh);
      paramgi.c(paramhh.k());
      return;
      if (!paramhh.d())
        throw new fl("Non-numeric default value for long: " + paramhh);
      paramgi.b(paramhh.l());
      return;
      if (!paramhh.d())
        throw new fl("Non-numeric default value for float: " + paramhh);
      paramgi.a((float)paramhh.m());
      return;
      if (!paramhh.d())
        throw new fl("Non-numeric default value for double: " + paramhh);
      paramgi.a(paramhh.m());
      return;
      if (!paramhh.g())
        throw new fl("Non-boolean default for boolean: " + paramhh);
      paramgi.a(paramhh.j());
      return;
      if (!paramhh.h())
        throw new fl("Non-null default value for null type: " + paramhh);
      paramgi.a();
      return;
    }
  }

  private static byte[] a(fn paramfn, hh paramhh)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    gc localgc = a.a(localByteArrayOutputStream, null);
    a(localgc, paramfn, paramhh);
    localgc.flush();
    return localByteArrayOutputStream.toByteArray();
  }

  private static int b(fn paramfn1, fn paramfn2)
  {
    int i = 0;
    fn.v localv = paramfn2.a();
    Iterator localIterator1 = paramfn1.k().iterator();
    for (int j = 0; localIterator1.hasNext(); j++)
    {
      fn localfn2 = (fn)localIterator1.next();
      if (localv == localfn2.a())
        if ((localv == fn.v.a) || (localv == fn.v.b) || (localv == fn.v.f))
        {
          String str1 = paramfn2.g();
          String str2 = localfn2.g();
          if (((str1 == null) || (!str1.equals(str2))) && ((str1 != str2) || (localv != fn.v.a)));
        }
        else
        {
          return j;
        }
    }
    Iterator localIterator2 = paramfn1.k().iterator();
    if (localIterator2.hasNext())
    {
      fn localfn1 = (fn)localIterator2.next();
      switch (1.a[localv.ordinal()])
      {
      default:
      case 3:
      case 4:
      case 5:
      }
      while (true)
      {
        i++;
        break;
        switch (1.a[localfn1.a().ordinal()])
        {
        case 5:
        default:
          break;
        case 4:
        case 6:
          return i;
          switch (1.a[localfn1.a().ordinal()])
          {
          default:
          case 6:
          }
          break;
        }
      }
      return i;
    }
    return -1;
  }

  private gq b(fn paramfn1, fn paramfn2, Map<gr.a, gq> paramMap)
  {
    List localList = paramfn1.k();
    int i = localList.size();
    gq[] arrayOfgq1 = new gq[i];
    String[] arrayOfString = new String[i];
    Iterator localIterator = localList.iterator();
    for (int j = 0; localIterator.hasNext(); j++)
    {
      fn localfn = (fn)localIterator.next();
      arrayOfgq1[j] = a(localfn, paramfn2, paramMap);
      arrayOfString[j] = localfn.g();
    }
    gq[] arrayOfgq2 = new gq[2];
    arrayOfgq2[0] = gq.a(arrayOfgq1, arrayOfString);
    arrayOfgq2[1] = new gq.q();
    return gq.b(arrayOfgq2);
  }

  private gq c(fn paramfn1, fn paramfn2, Map<gr.a, gq> paramMap)
  {
    go.a locala = new go.a(paramfn1, paramfn2);
    gq localgq1 = (gq)paramMap.get(locala);
    List localList1;
    List localList2;
    fn.f[] arrayOff;
    int i;
    int j;
    int i8;
    if (localgq1 == null)
    {
      localList1 = paramfn1.b();
      localList2 = paramfn2.b();
      arrayOff = new fn.f[localList2.size()];
      i = 1 + localList1.size();
      Iterator localIterator1 = localList1.iterator();
      j = 0;
      if (localIterator1.hasNext())
      {
        fn.f localf5 = paramfn2.b(((fn.f)localIterator1.next()).a());
        if (localf5 == null)
          break label581;
        i8 = j + 1;
        arrayOff[j] = localf5;
      }
    }
    while (true)
    {
      j = i8;
      break;
      Iterator localIterator2 = localList2.iterator();
      int k = j;
      int m = i;
      int i7;
      int i5;
      if (localIterator2.hasNext())
      {
        fn.f localf4 = (fn.f)localIterator2.next();
        if (paramfn1.b(localf4.a()) != null)
          break label570;
        if (localf4.e() == null)
        {
          localgq1 = gq.a("Found " + paramfn1.a(true) + ", expecting " + paramfn2.a(true));
          paramMap.put(locala, localgq1);
          return localgq1;
        }
        i7 = k + 1;
        arrayOff[k] = localf4;
        i5 = m + 3;
      }
      for (int i6 = i7; ; i6 = k)
      {
        k = i6;
        m = i5;
        break;
        gq[] arrayOfgq = new gq[m];
        int n = m - 1;
        arrayOfgq[n] = new gq.e(arrayOff);
        gq localgq2 = gq.b(arrayOfgq);
        paramMap.put(locala, localgq2);
        Iterator localIterator3 = localList1.iterator();
        int i1 = n;
        while (localIterator3.hasNext())
        {
          fn.f localf2 = (fn.f)localIterator3.next();
          fn.f localf3 = paramfn2.b(localf2.a());
          if (localf3 == null)
          {
            i1--;
            arrayOfgq[i1] = new gq.n(a(localf2.c(), localf2.c(), paramMap));
          }
          else
          {
            i1--;
            arrayOfgq[i1] = a(localf2.c(), localf3.c(), paramMap);
          }
        }
        Iterator localIterator4 = localList2.iterator();
        if (localIterator4.hasNext())
        {
          fn.f localf1 = (fn.f)localIterator4.next();
          int i2;
          if (paramfn1.b(localf1.a()) == null)
          {
            byte[] arrayOfByte = a(localf1.c(), localf1.e());
            int i3 = i1 - 1;
            arrayOfgq[i3] = new gq.b(arrayOfByte);
            int i4 = i3 - 1;
            arrayOfgq[i4] = a(localf1.c(), localf1.c(), paramMap);
            i2 = i4 - 1;
            arrayOfgq[i2] = gq.x;
          }
          while (true)
          {
            i1 = i2;
            break;
            i2 = i1;
          }
        }
        return localgq2;
        label570: i5 = m;
      }
      label581: i8 = j;
    }
  }

  public final gq a(fn paramfn1, fn paramfn2)
  {
    gq[] arrayOfgq = new gq[1];
    arrayOfgq[0] = a(paramfn1, paramfn2, new HashMap());
    return gq.a(arrayOfgq);
  }

  public gq a(fn paramfn1, fn paramfn2, Map<gr.a, gq> paramMap)
  {
    fn.v localv1 = paramfn1.a();
    fn.v localv2 = paramfn2.a();
    if (localv1 == localv2)
    {
      switch (1.a[localv1.ordinal()])
      {
      default:
        throw new fl("Unkown type for schema: " + localv1);
      case 1:
        return gq.c;
      case 2:
        return gq.d;
      case 3:
        return gq.e;
      case 4:
        return gq.f;
      case 5:
        return gq.g;
      case 6:
        return gq.h;
      case 7:
        return gq.i;
      case 8:
        return gq.j;
      case 9:
        if ((!paramfn1.g().equals(paramfn2.g())) || (paramfn1.l() != paramfn2.l()))
          break;
        gq[] arrayOfgq7 = new gq[2];
        arrayOfgq7[0] = new gq.h(paramfn1.l());
        arrayOfgq7[1] = gq.k;
        return gq.b(arrayOfgq7);
      case 10:
        if ((paramfn1.g() != null) && (!paramfn1.g().equals(paramfn2.g())))
          break;
        gq[] arrayOfgq6 = new gq[2];
        arrayOfgq6[0] = a(paramfn1.c(), paramfn2.c());
        arrayOfgq6[1] = gq.l;
        return gq.b(arrayOfgq6);
      case 11:
        gq[] arrayOfgq4 = new gq[2];
        gq localgq3 = gq.o;
        gq[] arrayOfgq5 = new gq[1];
        arrayOfgq5[0] = a(paramfn1.i(), paramfn2.i(), paramMap);
        arrayOfgq4[0] = gq.a(localgq3, arrayOfgq5);
        arrayOfgq4[1] = gq.n;
        return gq.b(arrayOfgq4);
      case 12:
        gq[] arrayOfgq2 = new gq[2];
        gq localgq2 = gq.q;
        gq[] arrayOfgq3 = new gq[2];
        arrayOfgq3[0] = a(paramfn1.j(), paramfn2.j(), paramMap);
        arrayOfgq3[1] = gq.i;
        arrayOfgq2[0] = gq.a(localgq2, arrayOfgq3);
        arrayOfgq2[1] = gq.p;
        return gq.b(arrayOfgq2);
      case 13:
        return c(paramfn1, paramfn2, paramMap);
      case 14:
        return b(paramfn1, paramfn2, paramMap);
      }
    }
    else
    {
      if (localv1 == fn.v.e)
        return b(paramfn1, paramfn2, paramMap);
      switch (1.a[localv2.ordinal()])
      {
      case 9:
      default:
        throw new RuntimeException("Unexpected schema type: " + localv2);
      case 4:
        switch (1.a[localv1.ordinal()])
        {
        default:
        case 3:
        }
        break;
      case 1:
      case 2:
      case 3:
      case 7:
      case 8:
      case 10:
      case 11:
      case 12:
      case 13:
      case 5:
      case 6:
      case 14:
      }
    }
    int i;
    do
    {
      while (true)
      {
        return gq.a("Found " + paramfn1.a(true) + ", expecting " + paramfn2.a(true));
        return gq.a(super.a(paramfn1, paramMap), gq.f);
        switch (1.a[localv1.ordinal()])
        {
        default:
          break;
        case 3:
        case 4:
          return gq.a(super.a(paramfn1, paramMap), gq.g);
          switch (1.a[localv1.ordinal()])
          {
          default:
          case 3:
          case 4:
          case 5:
          }
          break;
        }
      }
      return gq.a(super.a(paramfn1, paramMap), gq.h);
      i = b(paramfn2, paramfn1);
    }
    while (i < 0);
    gq localgq1 = a(paramfn1, (fn)paramfn2.k().get(i), paramMap);
    gq[] arrayOfgq1 = new gq[2];
    arrayOfgq1[0] = new gq.p(i, localgq1);
    arrayOfgq1[1] = gq.m;
    return gq.b(arrayOfgq1);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.go
 * JD-Core Version:    0.6.2
 */