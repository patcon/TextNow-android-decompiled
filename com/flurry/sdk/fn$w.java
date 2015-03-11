package com.flurry.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class fn$w extends fn
{
  private final List<fn> f;
  private final Map<String, Integer> g = new HashMap();

  public fn$w(fn.j<fn> paramj)
  {
    super(fn.v.e);
    this.f = paramj.a();
    Iterator localIterator = paramj.iterator();
    int j;
    for (int i = 0; localIterator.hasNext(); i = j)
    {
      fn localfn = (fn)localIterator.next();
      if (localfn.a() == fn.v.e)
        throw new fk("Nested union: " + this);
      String str = localfn.g();
      if (str == null)
        throw new fk("Nameless in union:" + this);
      Map localMap = this.g;
      j = i + 1;
      if (localMap.put(str, Integer.valueOf(i)) != null)
        throw new fk("Duplicate in union:" + str);
    }
  }

  void a(fn.o paramo, hf paramhf)
  {
    paramhf.b();
    Iterator localIterator = this.f.iterator();
    while (localIterator.hasNext())
      ((fn)localIterator.next()).a(paramo, paramhf);
    paramhf.c();
  }

  public void a(String paramString1, String paramString2)
  {
    throw new fk("Can't set properties on a union: " + this);
  }

  public Integer e(String paramString)
  {
    return (Integer)this.g.get(paramString);
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    w localw;
    do
    {
      return true;
      if (!(paramObject instanceof w))
        return false;
      localw = (w)paramObject;
    }
    while ((c(localw)) && (this.f.equals(localw.f)) && (this.c.equals(localw.c)));
    return false;
  }

  public List<fn> k()
  {
    return this.f;
  }

  int m()
  {
    int i = super.m();
    Iterator localIterator = this.f.iterator();
    int j = i;
    while (localIterator.hasNext())
      j += ((fn)localIterator.next()).m();
    return j;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.w
 * JD-Core Version:    0.6.2
 */