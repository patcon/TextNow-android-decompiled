package com.flurry.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class fn$e extends fn.n
{
  private final List<String> i;
  private final Map<String, Integer> j;

  public fn$e(fn.m paramm, String paramString, fn.j<String> paramj)
  {
    super(fn.v.b, paramm, paramString);
    this.i = paramj.a();
    this.j = new HashMap();
    Iterator localIterator = paramj.iterator();
    int m;
    for (int k = 0; localIterator.hasNext(); k = m)
    {
      String str1 = (String)localIterator.next();
      Map localMap = this.j;
      String str2 = fn.g(str1);
      m = k + 1;
      if (localMap.put(str2, Integer.valueOf(k)) != null)
        throw new fo("Duplicate enum symbol: " + str1);
    }
  }

  void a(fn.o paramo, hf paramhf)
  {
    if (c(paramo, paramhf))
      return;
    paramhf.d();
    paramhf.a("type", "enum");
    d(paramo, paramhf);
    if (e() != null)
      paramhf.a("doc", e());
    paramhf.f("symbols");
    Iterator localIterator = this.i.iterator();
    while (localIterator.hasNext())
      paramhf.b((String)localIterator.next());
    paramhf.c();
    this.c.a(paramhf);
    a(paramhf);
    paramhf.e();
  }

  public int c(String paramString)
  {
    return ((Integer)this.j.get(paramString)).intValue();
  }

  public List<String> c()
  {
    return this.i;
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    e locale;
    do
    {
      return true;
      if (!(paramObject instanceof e))
        return false;
      locale = (e)paramObject;
    }
    while ((c(locale)) && (a(locale)) && (this.i.equals(locale.i)) && (this.c.equals(locale.c)));
    return false;
  }

  int m()
  {
    return super.m() + this.i.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.e
 * JD-Core Version:    0.6.2
 */