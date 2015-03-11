package com.flurry.sdk;

import java.util.LinkedHashMap;
import java.util.Map;

class fn$o extends LinkedHashMap<fn.m, fn>
{
  private String a;

  public fn$o()
  {
  }

  public fn$o(String paramString)
  {
    this.a = paramString;
  }

  public fn a(fn.m paramm, fn paramfn)
  {
    if (containsKey(paramm))
      throw new fo("Can't redefine: " + paramm);
    return (fn)super.put(paramm, paramfn);
  }

  public fn a(Object paramObject)
  {
    if ((paramObject instanceof String))
    {
      fn.v localv = (fn.v)fn.e.get((String)paramObject);
      if (localv != null)
        return fn.a(localv);
    }
    for (fn.m localm = new fn.m((String)paramObject, this.a); ; localm = (fn.m)paramObject)
      return (fn)super.get(localm);
  }

  public String a()
  {
    return this.a;
  }

  public void a(String paramString)
  {
    this.a = paramString;
  }

  public boolean a(fn paramfn)
  {
    return a(((fn.n)paramfn).f) != null;
  }

  public void b(fn paramfn)
  {
    a(((fn.n)paramfn).f, paramfn);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.o
 * JD-Core Version:    0.6.2
 */