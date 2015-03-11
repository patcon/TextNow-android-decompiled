package com.flurry.sdk;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class fn
{
  static final hd a = new hd();
  static final jq b = new jq(a);
  static final Map<String, fn.v> e;
  private static final Set<String> g;
  private static final Set<String> h;
  private static final ThreadLocal<Set> i;
  private static final ThreadLocal<Map> j;
  private static ThreadLocal<Boolean> k = new ThreadLocal()
  {
    protected final Boolean a()
    {
      return Boolean.valueOf(true);
    }
  };
  fn.r c = new fn.r(g);
  int d = -2147483648;
  private final fn.v f;

  static
  {
    a.a(hj.a.b);
    a.a(b);
    HashSet localHashSet1 = new HashSet();
    g = localHashSet1;
    Collections.addAll(localHashSet1, new String[] { "doc", "fields", "items", "name", "namespace", "size", "symbols", "values", "type" });
    HashSet localHashSet2 = new HashSet();
    h = localHashSet2;
    Collections.addAll(localHashSet2, new String[] { "default", "doc", "name", "order", "type" });
    i = new ThreadLocal()
    {
      protected final Set a()
      {
        return new HashSet();
      }
    };
    j = new ThreadLocal()
    {
      protected final Map a()
      {
        return new IdentityHashMap();
      }
    };
    HashMap localHashMap = new HashMap();
    e = localHashMap;
    localHashMap.put("string", fn.v.g);
    e.put("bytes", fn.v.h);
    e.put("int", fn.v.i);
    e.put("long", fn.v.j);
    e.put("float", fn.v.k);
    e.put("double", fn.v.l);
    e.put("boolean", fn.v.m);
    e.put("null", fn.v.n);
  }

  fn(fn.v paramv)
  {
    this.f = paramv;
  }

  public static fn a(fn.v paramv)
  {
    switch (4.a[paramv.ordinal()])
    {
    default:
      throw new fk("Can't create a: " + paramv);
    case 1:
      return new fn.u();
    case 2:
      return new fn.c();
    case 3:
      return new fn.i();
    case 4:
      return new fn.k();
    case 5:
      return new fn.h();
    case 6:
      return new fn.d();
    case 7:
      return new fn.b();
    case 8:
    }
    return new fn.p();
  }

  public static fn a(fn paramfn)
  {
    return new fn.a(paramfn);
  }

  public static fn a(fn paramfn1, fn paramfn2)
  {
    if (paramfn1 == paramfn2);
    IdentityHashMap localIdentityHashMap;
    HashMap localHashMap1;
    HashMap localHashMap2;
    do
    {
      return paramfn1;
      localIdentityHashMap = new IdentityHashMap(1);
      localHashMap1 = new HashMap(1);
      localHashMap2 = new HashMap(1);
      b(paramfn2, localIdentityHashMap, localHashMap1, localHashMap2);
    }
    while ((localHashMap1.size() == 0) && (localHashMap2.size() == 0));
    localIdentityHashMap.clear();
    return a(paramfn1, localIdentityHashMap, localHashMap1, localHashMap2);
  }

  private static fn a(fn paramfn, Map<fn, fn> paramMap, Map<fn.m, fn.m> paramMap1, Map<fn.m, Map<String, String>> paramMap2)
  {
    if ((paramfn instanceof fn.n));
    Object localObject;
    for (fn.m localm1 = ((fn.n)paramfn).f; ; localm1 = null)
      switch (4.a[paramfn.a().ordinal()])
      {
      default:
        localObject = paramfn;
        label67: if (localObject != paramfn)
          ((fn)localObject).c.putAll(paramfn.c);
        return localObject;
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      }
    if (paramMap.containsKey(paramfn))
      return (fn)paramMap.get(paramfn);
    if (paramMap1.containsKey(localm1));
    for (fn.m localm2 = (fn.m)paramMap1.get(localm1); ; localm2 = localm1)
    {
      fn localfn3 = a(fn.m.a(localm2), paramfn.e(), null, paramfn.h());
      paramMap.put(paramfn, localfn3);
      ArrayList localArrayList2 = new ArrayList();
      Iterator localIterator2 = paramfn.b().iterator();
      while (localIterator2.hasNext())
      {
        fn.f localf1 = (fn.f)localIterator2.next();
        fn localfn4 = a(fn.f.d(localf1), paramMap, paramMap1, paramMap2);
        fn.f localf2 = new fn.f(a(localm2, fn.f.e(localf1), paramMap2), localfn4, fn.f.f(localf1), fn.f.g(localf1), fn.f.h(localf1));
        fn.f.c(localf2).putAll(fn.f.c(localf1));
        localArrayList2.add(localf2);
      }
      localfn3.c(localArrayList2);
      localObject = localfn3;
      break label67;
      if (!paramMap1.containsKey(localm1))
        break;
      localObject = a(fn.m.a((fn.m)paramMap1.get(localm1)), paramfn.e(), null, paramfn.c());
      break label67;
      fn localfn2 = a(paramfn.i(), paramMap, paramMap1, paramMap2);
      if (localfn2 == paramfn.i())
        break;
      localObject = a(localfn2);
      break label67;
      fn localfn1 = a(paramfn.j(), paramMap, paramMap1, paramMap2);
      if (localfn1 == paramfn.j())
        break;
      localObject = b(localfn1);
      break label67;
      ArrayList localArrayList1 = new ArrayList();
      Iterator localIterator1 = paramfn.k().iterator();
      while (localIterator1.hasNext())
        localArrayList1.add(a((fn)localIterator1.next(), paramMap, paramMap1, paramMap2));
      localObject = b(localArrayList1);
      break label67;
      if (!paramMap1.containsKey(localm1))
        break;
      localObject = a(fn.m.a((fn.m)paramMap1.get(localm1)), paramfn.e(), null, paramfn.l());
      break label67;
    }
  }

  static fn a(hh paramhh, fn.o paramo)
  {
    Object localObject1;
    String str1;
    String str3;
    fn.m localm1;
    String str5;
    fn.m localm2;
    String str4;
    if (paramhh.f())
    {
      localObject1 = paramo.a(paramhh.i());
      if (localObject1 == null)
        throw new fo("Undefined name: " + paramhh);
    }
    else if (paramhh.c())
    {
      str1 = a(paramhh, "type", "No type");
      if ((!str1.equals("record")) && (!str1.equals("error")) && (!str1.equals("enum")) && (!str1.equals("fixed")))
        break label1391;
      String str2 = a(paramhh, "namespace");
      str3 = a(paramhh, "doc");
      if (str2 == null)
        str2 = paramo.a();
      localm1 = new fn.m(a(paramhh, "name", "No name in schema"), str2);
      if (fn.m.c(localm1) == null)
        break label1377;
      String str12 = paramo.a();
      paramo.a(fn.m.c(localm1));
      str5 = str12;
      localm2 = localm1;
      str4 = str3;
    }
    while (true)
    {
      if (e.containsKey(str1))
        localObject1 = a((fn.v)e.get(str1));
      while (true)
      {
        Iterator localIterator3 = paramhh.r();
        while (localIterator3.hasNext())
        {
          String str6 = (String)localIterator3.next();
          String str7 = paramhh.a(str6).i();
          if ((!g.contains(str6)) && (str7 != null))
            ((fn)localObject1).a(str6, str7);
        }
        if ((str1.equals("record")) || (str1.equals("error")))
        {
          ArrayList localArrayList = new ArrayList();
          fn.s locals = new fn.s(localm2, str4, str1.equals("error"));
          if (localm2 != null)
            paramo.b(locals);
          hh localhh1 = paramhh.a("fields");
          if ((localhh1 == null) || (!localhh1.b()))
            throw new fo("Record has no fields: " + paramhh);
          Iterator localIterator2 = localhh1.iterator();
          while (localIterator2.hasNext())
          {
            hh localhh2 = (hh)localIterator2.next();
            String str8 = a(localhh2, "name", "No field name");
            String str9 = a(localhh2, "doc");
            hh localhh3 = localhh2.a("type");
            if (localhh3 == null)
              throw new fo("No field type: " + localhh2);
            if ((localhh3.f()) && (paramo.a(localhh3.i()) == null))
              throw new fo(localhh3 + " is not a defined name." + " The type of the \"" + str8 + "\" field must be" + " a defined name or a {\"type\": ...} expression.");
            fn localfn = a(localhh3, paramo);
            fn.f.a locala = fn.f.a.a;
            hh localhh4 = localhh2.a("order");
            if (localhh4 != null)
              locala = fn.f.a.valueOf(localhh4.i().toUpperCase());
            Object localObject2 = localhh2.a("default");
            if ((localObject2 != null) && ((fn.v.k.equals(localfn.a())) || (fn.v.l.equals(localfn.a()))) && (((hh)localObject2).f()))
              localObject2 = new rq(Double.valueOf(((hh)localObject2).i()).doubleValue());
            fn.f localf = new fn.f(str8, localfn, str9, (hh)localObject2, locala);
            Iterator localIterator5 = localhh2.r();
            while (localIterator5.hasNext())
            {
              String str10 = (String)localIterator5.next();
              String str11 = localhh2.a(str10).i();
              if ((!h.contains(str10)) && (str11 != null))
                localf.a(str10, str11);
            }
            fn.f.a(localf, a(localhh2));
            localArrayList.add(localf);
          }
          locals.c(localArrayList);
          localObject1 = locals;
        }
        else if (str1.equals("enum"))
        {
          hh localhh8 = paramhh.a("symbols");
          if ((localhh8 == null) || (!localhh8.b()))
            throw new fo("Enum has no symbols: " + paramhh);
          fn.j localj2 = new fn.j();
          Iterator localIterator6 = localhh8.iterator();
          while (localIterator6.hasNext())
            localj2.add(((hh)localIterator6.next()).i());
          fn.e locale = new fn.e(localm2, str4, localj2);
          if (localm2 != null)
            paramo.b(locale);
          localObject1 = locale;
        }
        else if (str1.equals("array"))
        {
          hh localhh7 = paramhh.a("items");
          if (localhh7 == null)
            throw new fo("Array has no items type: " + paramhh);
          localObject1 = new fn.a(a(localhh7, paramo));
        }
        else if (str1.equals("map"))
        {
          hh localhh6 = paramhh.a("values");
          if (localhh6 == null)
            throw new fo("Map has no values type: " + paramhh);
          localObject1 = new fn.l(a(localhh6, paramo));
        }
        else
        {
          if (!str1.equals("fixed"))
            break;
          hh localhh5 = paramhh.a("size");
          if ((localhh5 == null) || (!localhh5.e()))
            throw new fo("Invalid or no size: " + paramhh);
          fn.g localg = new fn.g(localm2, str4, localhh5.k());
          if (localm2 != null)
            paramo.b(localg);
          localObject1 = localg;
        }
      }
      throw new fo("Type not supported: " + str1);
      if (str5 != null)
        paramo.a(str5);
      if ((localObject1 instanceof fn.n))
      {
        Set localSet = a(paramhh);
        if (localSet != null)
        {
          Iterator localIterator4 = localSet.iterator();
          while (localIterator4.hasNext())
          {
            ((fn)localObject1).d((String)localIterator4.next());
            continue;
            if (!paramhh.b())
              break label1349;
            fn.j localj1 = new fn.j(paramhh.p());
            Iterator localIterator1 = paramhh.iterator();
            while (localIterator1.hasNext())
              localj1.add(a((hh)localIterator1.next(), paramo));
            localObject1 = new fn.w(localj1);
          }
        }
      }
      return localObject1;
      label1349: throw new fo("Schema not yet supported: " + paramhh);
      label1377: localm2 = localm1;
      str4 = str3;
      str5 = null;
      continue;
      label1391: localm2 = null;
      str4 = null;
      str5 = null;
    }
  }

  public static fn a(String paramString1, String paramString2, String paramString3, int paramInt)
  {
    return new fn.g(new fn.m(paramString1, paramString3), paramString2, paramInt);
  }

  public static fn a(String paramString1, String paramString2, String paramString3, List<String> paramList)
  {
    return new fn.e(new fn.m(paramString1, paramString3), paramString2, new fn.j(paramList));
  }

  public static fn a(String paramString1, String paramString2, String paramString3, boolean paramBoolean)
  {
    return new fn.s(new fn.m(paramString1, paramString3), paramString2, paramBoolean);
  }

  public static fn a(List<fn.f> paramList)
  {
    fn localfn = a(null, null, null, false);
    localfn.c(paramList);
    return localfn;
  }

  private static String a(fn.m paramm, String paramString, Map<fn.m, Map<String, String>> paramMap)
  {
    Map localMap = (Map)paramMap.get(paramm);
    if (localMap == null);
    String str;
    do
    {
      return paramString;
      str = (String)localMap.get(paramString);
    }
    while (str == null);
    return str;
  }

  private static String a(hh paramhh, String paramString)
  {
    hh localhh = paramhh.a(paramString);
    if (localhh != null)
      return localhh.i();
    return null;
  }

  private static String a(hh paramhh, String paramString1, String paramString2)
  {
    String str = a(paramhh, paramString1);
    if (str == null)
      throw new fo(paramString2 + ": " + paramhh);
    return str;
  }

  private static Set<String> a(hh paramhh)
  {
    hh localhh1 = paramhh.a("aliases");
    if (localhh1 == null)
      return null;
    if (!localhh1.b())
      throw new fo("aliases not an array: " + paramhh);
    LinkedHashSet localLinkedHashSet = new LinkedHashSet();
    Iterator localIterator = localhh1.iterator();
    while (localIterator.hasNext())
    {
      hh localhh2 = (hh)localIterator.next();
      if (!localhh2.f())
        throw new fo("alias not a string: " + localhh2);
      localLinkedHashSet.add(localhh2.i());
    }
    return localLinkedHashSet;
  }

  public static fn b(fn paramfn)
  {
    return new fn.l(paramfn);
  }

  public static fn b(List<fn> paramList)
  {
    return new fn.w(new fn.j(paramList));
  }

  private static void b(fn paramfn, Map<fn, fn> paramMap, Map<fn.m, fn.m> paramMap1, Map<fn.m, Map<String, String>> paramMap2)
  {
    if ((paramfn instanceof fn.n))
    {
      fn.n localn = (fn.n)paramfn;
      if (localn.h != null)
      {
        Iterator localIterator5 = localn.h.iterator();
        while (localIterator5.hasNext())
          paramMap1.put((fn.m)localIterator5.next(), localn.f);
      }
    }
    switch (4.a[paramfn.a().ordinal()])
    {
    case 10:
    default:
    case 9:
    case 11:
    case 12:
    case 13:
    }
    while (true)
    {
      return;
      if (!paramMap.containsKey(paramfn))
      {
        paramMap.put(paramfn, paramfn);
        fn.s locals = (fn.s)paramfn;
        Iterator localIterator2 = paramfn.b().iterator();
        while (localIterator2.hasNext())
        {
          fn.f localf = (fn.f)localIterator2.next();
          if (fn.f.b(localf) != null)
          {
            Iterator localIterator4 = fn.f.b(localf).iterator();
            while (localIterator4.hasNext())
            {
              String str = (String)localIterator4.next();
              Object localObject = (Map)paramMap2.get(locals.f);
              if (localObject == null)
              {
                fn.m localm = locals.f;
                localObject = new HashMap();
                paramMap2.put(localm, localObject);
              }
              ((Map)localObject).put(str, fn.f.e(localf));
            }
          }
          b(fn.f.d(localf), paramMap, paramMap1, paramMap2);
        }
        if ((locals.h != null) && (paramMap2.containsKey(locals.f)))
        {
          Iterator localIterator3 = locals.h.iterator();
          while (localIterator3.hasNext())
            paramMap2.put((fn.m)localIterator3.next(), paramMap2.get(locals.f));
          continue;
          b(paramfn.i(), paramMap, paramMap1, paramMap2);
          return;
          b(paramfn.j(), paramMap, paramMap1, paramMap2);
          return;
          Iterator localIterator1 = paramfn.k().iterator();
          while (localIterator1.hasNext())
            b((fn)localIterator1.next(), paramMap, paramMap1, paramMap2);
        }
      }
    }
  }

  public static fn f(String paramString)
  {
    return new fn.q().a(paramString);
  }

  private static String h(String paramString)
  {
    if (!((Boolean)k.get()).booleanValue());
    while (true)
    {
      return paramString;
      int m = paramString.length();
      if (m == 0)
        throw new fo("Empty name");
      char c1 = paramString.charAt(0);
      if ((!Character.isLetter(c1)) && (c1 != '_'))
        throw new fo("Illegal initial character: " + paramString);
      for (int n = 1; n < m; n++)
      {
        char c2 = paramString.charAt(n);
        if ((!Character.isLetterOrDigit(c2)) && (c2 != '_'))
          throw new fo("Illegal character in: " + paramString);
      }
    }
  }

  public fn.v a()
  {
    return this.f;
  }

  public String a(String paramString)
  {
    try
    {
      String str = (String)this.c.get(paramString);
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public String a(boolean paramBoolean)
  {
    try
    {
      StringWriter localStringWriter = new StringWriter();
      hf localhf = a.a(localStringWriter);
      if (paramBoolean)
        localhf.a();
      a(new fn.o(), localhf);
      localhf.g();
      String str = localStringWriter.toString();
      return str;
    }
    catch (IOException localIOException)
    {
      throw new fk(localIOException);
    }
  }

  void a(fn.o paramo, hf paramhf)
  {
    if (this.c.size() == 0)
    {
      paramhf.b(d());
      return;
    }
    paramhf.d();
    paramhf.a("type", d());
    this.c.a(paramhf);
    paramhf.e();
  }

  public void a(String paramString1, String paramString2)
  {
    try
    {
      this.c.a(paramString1, paramString2);
      this.d = -2147483648;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public fn.f b(String paramString)
  {
    throw new fk("Not a record: " + this);
  }

  public List<fn.f> b()
  {
    throw new fk("Not a record: " + this);
  }

  void b(fn.o paramo, hf paramhf)
  {
    throw new fk("Not a record: " + this);
  }

  public int c(String paramString)
  {
    throw new fk("Not an enum: " + this);
  }

  public List<String> c()
  {
    throw new fk("Not an enum: " + this);
  }

  public void c(List<fn.f> paramList)
  {
    throw new fk("Not a record: " + this);
  }

  final boolean c(fn paramfn)
  {
    return (this.d == paramfn.d) || (this.d == -2147483648) || (paramfn.d == -2147483648);
  }

  public String d()
  {
    return fn.v.a(this.f);
  }

  public void d(String paramString)
  {
    throw new fk("Not a named type: " + this);
  }

  public Integer e(String paramString)
  {
    throw new fk("Not a union: " + this);
  }

  public String e()
  {
    return null;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    fn localfn;
    do
    {
      return true;
      if (!(paramObject instanceof fn))
        return false;
      localfn = (fn)paramObject;
      if (this.f != localfn.f)
        return false;
    }
    while ((c(localfn)) && (this.c.equals(localfn.c)));
    return false;
  }

  public String f()
  {
    throw new fk("Not a named type: " + this);
  }

  public String g()
  {
    return d();
  }

  public boolean h()
  {
    throw new fk("Not a record: " + this);
  }

  public final int hashCode()
  {
    if (this.d == -2147483648)
      this.d = m();
    return this.d;
  }

  public fn i()
  {
    throw new fk("Not an array: " + this);
  }

  public fn j()
  {
    throw new fk("Not a map: " + this);
  }

  public List<fn> k()
  {
    throw new fk("Not a union: " + this);
  }

  public int l()
  {
    throw new fk("Not fixed: " + this);
  }

  int m()
  {
    return a().hashCode() + this.c.hashCode();
  }

  public String toString()
  {
    return a(false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn
 * JD-Core Version:    0.6.2
 */