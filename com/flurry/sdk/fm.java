package com.flurry.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class fm
{
  public static final fn a;
  public static final fn b;
  private static final Set<String> d;
  private static final Set<String> j;
  fn.r c = new fn.r(j);
  private String e;
  private String f;
  private String g;
  private fn.o h = new fn.o();
  private Map<String, fm.a> i = new LinkedHashMap();

  static
  {
    HashSet localHashSet1 = new HashSet();
    d = localHashSet1;
    Collections.addAll(localHashSet1, new String[] { "doc", "response", "request", "errors", "one-way" });
    a = fn.a(fn.v.g);
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(a);
    b = fn.b(localArrayList);
    HashSet localHashSet2 = new HashSet();
    j = localHashSet2;
    Collections.addAll(localHashSet2, new String[] { "namespace", "protocol", "doc", "messages", "types", "errors" });
  }

  private fm.a a(String paramString, hh paramhh)
  {
    String str1 = d(paramhh);
    LinkedHashMap localLinkedHashMap = new LinkedHashMap();
    Iterator localIterator1 = paramhh.r();
    while (localIterator1.hasNext())
    {
      String str3 = (String)localIterator1.next();
      if (!d.contains(str3))
      {
        hh localhh8 = paramhh.a(str3);
        if ((localhh8.a()) && (localhh8.f()))
          localLinkedHashMap.put(str3, localhh8.i());
      }
    }
    hh localhh1 = paramhh.a("request");
    if ((localhh1 == null) || (!localhh1.b()))
      throw new fo("No request specified: " + paramhh);
    ArrayList localArrayList1 = new ArrayList();
    Iterator localIterator2 = localhh1.iterator();
    while (localIterator2.hasNext())
    {
      hh localhh5 = (hh)localIterator2.next();
      hh localhh6 = localhh5.a("name");
      if (localhh6 == null)
        throw new fo("No param name: " + localhh5);
      hh localhh7 = localhh5.a("type");
      if (localhh7 == null)
        throw new fo("No param type: " + localhh5);
      localArrayList1.add(new fn.f(localhh6.i(), fn.a(localhh7, this.h), null, localhh5.a("default")));
    }
    fn localfn1 = fn.a(localArrayList1);
    hh localhh2 = paramhh.a("one-way");
    boolean bool = false;
    if (localhh2 != null)
    {
      if (!localhh2.g())
        throw new fo("one-way must be boolean: " + paramhh);
      bool = localhh2.j();
    }
    hh localhh3 = paramhh.a("response");
    if ((!bool) && (localhh3 == null))
      throw new fo("No response specified: " + paramhh);
    hh localhh4 = paramhh.a("errors");
    if (bool)
    {
      if (localhh4 != null)
        throw new fo("one-way can't have errors: " + paramhh);
      if ((localhh3 != null) && (fn.a(localhh3, this.h).a() != fn.v.n))
        throw new fo("One way response must be null: " + paramhh);
      return new fm.a(this, paramString, str1, localLinkedHashMap, localfn1, null);
    }
    fn localfn2 = fn.a(localhh3, this.h);
    ArrayList localArrayList2 = new ArrayList();
    localArrayList2.add(a);
    if (localhh4 != null)
    {
      if (!localhh4.b())
        throw new fo("Errors not an array: " + paramhh);
      Iterator localIterator3 = localhh4.iterator();
      while (localIterator3.hasNext())
      {
        String str2 = ((hh)localIterator3.next()).i();
        fn localfn3 = this.h.a(str2);
        if (localfn3 == null)
          throw new fo("Undefined error: " + str2);
        if (!localfn3.h())
          throw new fo("Not an error: " + str2);
        localArrayList2.add(localfn3);
      }
    }
    return new fm.b(this, paramString, str1, localLinkedHashMap, localfn1, localfn2, fn.b(localArrayList2), null);
  }

  private static fm a(hj paramhj)
  {
    try
    {
      fm localfm = new fm();
      localfm.a(fn.b.a(paramhj));
      return localfm;
    }
    catch (IOException localIOException)
    {
      throw new fo(localIOException);
    }
  }

  public static fm a(String paramString)
  {
    try
    {
      fm localfm = a(fn.a.a(new ByteArrayInputStream(paramString.getBytes("UTF-8"))));
      return localfm;
    }
    catch (IOException localIOException)
    {
      throw new fk(localIOException);
    }
  }

  private void a(hh paramhh)
  {
    b(paramhh);
    e(paramhh);
    f(paramhh);
    h(paramhh);
    c(paramhh);
    g(paramhh);
  }

  private void b(hh paramhh)
  {
    hh localhh = paramhh.a("namespace");
    if (localhh == null)
      return;
    this.f = localhh.i();
    this.h.a(this.f);
  }

  private void c(hh paramhh)
  {
    this.g = d(paramhh);
  }

  private String d(hh paramhh)
  {
    hh localhh = paramhh.a("doc");
    if (localhh == null)
      return null;
    return localhh.i();
  }

  private void e(hh paramhh)
  {
    hh localhh = paramhh.a("protocol");
    if (localhh == null)
      throw new fo("No protocol name specified: " + paramhh);
    this.e = localhh.i();
  }

  private void f(hh paramhh)
  {
    hh localhh1 = paramhh.a("types");
    if (localhh1 == null);
    while (true)
    {
      return;
      if (!localhh1.b())
        throw new fo("Types not an array: " + localhh1);
      Iterator localIterator = localhh1.iterator();
      while (localIterator.hasNext())
      {
        hh localhh2 = (hh)localIterator.next();
        if (!localhh2.c())
          throw new fo("Type not an object: " + localhh2);
        fn.a(localhh2, this.h);
      }
    }
  }

  private void g(hh paramhh)
  {
    Iterator localIterator = paramhh.r();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (!j.contains(str))
      {
        hh localhh = paramhh.a(str);
        if ((localhh.a()) && (localhh.f()))
          a(str, localhh.i());
      }
    }
  }

  private void h(hh paramhh)
  {
    hh localhh = paramhh.a("messages");
    if (localhh == null);
    while (true)
    {
      return;
      Iterator localIterator = localhh.r();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        this.i.put(str, a(str, localhh.a(str)));
      }
    }
  }

  public String a(boolean paramBoolean)
  {
    try
    {
      StringWriter localStringWriter = new StringWriter();
      hf localhf = fn.a.a(localStringWriter);
      if (paramBoolean)
        localhf.a();
      a(localhf);
      localhf.g();
      String str = localStringWriter.toString();
      return str;
    }
    catch (IOException localIOException)
    {
      throw new fk(localIOException);
    }
  }

  void a(hf paramhf)
  {
    this.h.a(this.f);
    paramhf.d();
    paramhf.a("protocol", this.e);
    paramhf.a("namespace", this.f);
    if (this.g != null)
      paramhf.a("doc", this.g);
    this.c.a(paramhf);
    paramhf.f("types");
    fn.o localo = new fn.o(this.f);
    Iterator localIterator1 = this.h.values().iterator();
    while (localIterator1.hasNext())
    {
      fn localfn = (fn)localIterator1.next();
      if (!localo.a(localfn))
        localfn.a(localo, paramhf);
    }
    paramhf.c();
    paramhf.g("messages");
    Iterator localIterator2 = this.i.entrySet().iterator();
    while (localIterator2.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator2.next();
      paramhf.a((String)localEntry.getKey());
      ((fm.a)localEntry.getValue()).a(paramhf);
    }
    paramhf.e();
    paramhf.e();
  }

  public void a(String paramString1, String paramString2)
  {
    try
    {
      this.c.a(paramString1, paramString2);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    fm localfm;
    do
    {
      return true;
      if (!(paramObject instanceof fm))
        return false;
      localfm = (fm)paramObject;
    }
    while ((this.e.equals(localfm.e)) && (this.f.equals(localfm.f)) && (this.h.equals(localfm.h)) && (this.i.equals(localfm.i)) && (this.c.equals(this.c)));
    return false;
  }

  public int hashCode()
  {
    return this.e.hashCode() + this.f.hashCode() + this.h.hashCode() + this.i.hashCode() + this.c.hashCode();
  }

  public String toString()
  {
    return a(false);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fm
 * JD-Core Version:    0.6.2
 */