package com.flurry.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

class fn$s extends fn.n
{
  private List<fn.f> i;
  private Map<String, fn.f> j;
  private final boolean k;

  public fn$s(fn.m paramm, String paramString, boolean paramBoolean)
  {
    super(fn.v.a, paramm, paramString);
    this.k = paramBoolean;
  }

  void a(fn.o paramo, hf paramhf)
  {
    if (c(paramo, paramhf))
      return;
    String str1 = fn.o.a(paramo);
    paramhf.d();
    if (this.k);
    for (String str2 = "error"; ; str2 = "record")
    {
      paramhf.a("type", str2);
      d(paramo, paramhf);
      fn.o.a(paramo, fn.m.c(this.f));
      if (e() != null)
        paramhf.a("doc", e());
      paramhf.a("fields");
      b(paramo, paramhf);
      this.c.a(paramhf);
      a(paramhf);
      paramhf.e();
      fn.o.a(paramo, str1);
      return;
    }
  }

  public fn.f b(String paramString)
  {
    if (this.j == null)
      throw new fk("Schema fields not set yet");
    return (fn.f)this.j.get(paramString);
  }

  public List<fn.f> b()
  {
    if (this.i == null)
      throw new fk("Schema fields not set yet");
    return this.i;
  }

  void b(fn.o paramo, hf paramhf)
  {
    paramhf.b();
    Iterator localIterator1 = this.i.iterator();
    while (localIterator1.hasNext())
    {
      fn.f localf = (fn.f)localIterator1.next();
      paramhf.d();
      paramhf.a("name", localf.a());
      paramhf.a("type");
      localf.c().a(paramo, paramhf);
      if (localf.d() != null)
        paramhf.a("doc", localf.d());
      if (localf.e() != null)
      {
        paramhf.a("default");
        paramhf.a(localf.e());
      }
      if (localf.f() != fn.f.a.a)
        paramhf.a("order", fn.f.a.a(localf.f()));
      if ((fn.f.b(localf) != null) && (fn.f.b(localf).size() != 0))
      {
        paramhf.a("aliases");
        paramhf.b();
        Iterator localIterator2 = fn.f.b(localf).iterator();
        while (localIterator2.hasNext())
          paramhf.b((String)localIterator2.next());
        paramhf.c();
      }
      fn.f.c(localf).a(paramhf);
      paramhf.e();
    }
    paramhf.c();
  }

  public void c(List<fn.f> paramList)
  {
    if (this.i != null)
      throw new fk("Fields are already set");
    this.j = new HashMap();
    fn.j localj = new fn.j();
    Iterator localIterator = paramList.iterator();
    int n;
    for (int m = 0; localIterator.hasNext(); m = n)
    {
      fn.f localf = (fn.f)localIterator.next();
      if (fn.f.a(localf) != -1)
        throw new fk("Field already used: " + localf);
      n = m + 1;
      fn.f.a(localf, m);
      this.j.put(localf.a(), localf);
      localj.add(localf);
    }
    this.i = localj.a();
    this.d = -2147483648;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this)
      return true;
    if (!(paramObject instanceof s))
      return false;
    s locals = (s)paramObject;
    if (!c(locals))
      return false;
    if (!a(locals))
      return false;
    if (!this.c.equals(locals.c))
      return false;
    Set localSet = (Set)fn.o().get();
    fn.t localt = new fn.t(this, paramObject, null);
    if (localSet.contains(localt))
      return true;
    boolean bool1 = localSet.isEmpty();
    try
    {
      localSet.add(localt);
      boolean bool2 = this.i.equals(((s)paramObject).i);
      return bool2;
    }
    finally
    {
      if (bool1)
        localSet.clear();
    }
  }

  public boolean h()
  {
    return this.k;
  }

  int m()
  {
    Map localMap = (Map)fn.p().get();
    if (localMap.containsKey(this))
      return 0;
    boolean bool = localMap.isEmpty();
    try
    {
      localMap.put(this, this);
      int m = super.m();
      int n = this.i.hashCode();
      int i1 = m + n;
      return i1;
    }
    finally
    {
      if (bool)
        localMap.clear();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.s
 * JD-Core Version:    0.6.2
 */