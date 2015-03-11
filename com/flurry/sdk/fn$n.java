package com.flurry.sdk;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

abstract class fn$n extends fn
{
  final fn.m f;
  final String g;
  Set<fn.m> h;

  public fn$n(fn.v paramv, fn.m paramm, String paramString)
  {
    super(paramv);
    this.f = paramm;
    this.g = paramString;
    if (e.containsKey(fn.m.a(paramm)))
      throw new fl("Schemas may not be named after primitives: " + fn.m.a(paramm));
  }

  public void a(hf paramhf)
  {
    if ((this.h == null) || (this.h.size() == 0))
      return;
    paramhf.a("aliases");
    paramhf.b();
    Iterator localIterator = this.h.iterator();
    while (localIterator.hasNext())
      paramhf.b(((fn.m)localIterator.next()).a(fn.m.c(this.f)));
    paramhf.c();
  }

  public boolean a(n paramn)
  {
    return this.f.equals(paramn.f);
  }

  public boolean c(fn.o paramo, hf paramhf)
  {
    if (equals(paramo.a(this.f)))
    {
      paramhf.b(this.f.a(paramo.a()));
      return true;
    }
    if (fn.m.b(this.f) != null)
      paramo.a(this.f, this);
    return false;
  }

  public String d()
  {
    return fn.m.b(this.f);
  }

  public void d(fn.o paramo, hf paramhf)
  {
    this.f.a(paramo, paramhf);
  }

  public void d(String paramString)
  {
    if (this.h == null)
      this.h = new LinkedHashSet();
    this.h.add(new fn.m(paramString, fn.m.c(this.f)));
  }

  public String e()
  {
    return this.g;
  }

  public String f()
  {
    return fn.m.c(this.f);
  }

  public String g()
  {
    return fn.m.a(this.f);
  }

  int m()
  {
    return super.m() + this.f.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.n
 * JD-Core Version:    0.6.2
 */