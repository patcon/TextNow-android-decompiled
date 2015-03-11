package com.flurry.sdk;

import java.util.Collection;

@kb
public final class me extends lo<Collection<String>>
  implements js
{
  protected final sh a;
  protected final jg<String> b;
  protected final boolean c;
  protected final kx d;
  protected jg<Object> e;

  public me(sh paramsh, jg<?> paramjg, kx paramkx)
  {
    super(paramsh.p());
    this.a = paramsh;
    this.b = paramjg;
    this.d = paramkx;
    this.c = a(paramjg);
  }

  private Collection<String> b(hj paramhj, iz paramiz, Collection<String> paramCollection)
  {
    jg localjg = this.b;
    hm localhm = paramhj.b();
    if (localhm != hm.e)
    {
      if (localhm == hm.m);
      for (Object localObject = null; ; localObject = (String)localjg.a(paramhj, paramiz))
      {
        paramCollection.add(localObject);
        break;
      }
    }
    return paramCollection;
  }

  private final Collection<String> c(hj paramhj, iz paramiz, Collection<String> paramCollection)
  {
    if (!paramiz.a(iy.a.o))
      throw paramiz.b(this.a.p());
    jg localjg = this.b;
    Object localObject;
    if (paramhj.e() == hm.m)
      localObject = null;
    while (true)
    {
      paramCollection.add(localObject);
      return paramCollection;
      if (localjg == null)
        localObject = paramhj.k();
      else
        localObject = (String)localjg.a(paramhj, paramiz);
    }
  }

  public final Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    return paramjy.b(paramhj, paramiz);
  }

  public final Collection<String> a(hj paramhj, iz paramiz, Collection<String> paramCollection)
  {
    if (!paramhj.j())
      paramCollection = c(paramhj, paramiz, paramCollection);
    hm localhm;
    do
    {
      return paramCollection;
      if (!this.c)
        return b(paramhj, paramiz, paramCollection);
      localhm = paramhj.b();
    }
    while (localhm == hm.e);
    if (localhm == hm.m);
    for (Object localObject = null; ; localObject = paramhj.k())
    {
      paramCollection.add(localObject);
      break;
    }
  }

  public final void a(iy paramiy, jc paramjc)
  {
    mu localmu = this.d.o();
    if (localmu != null)
    {
      sh localsh = this.d.l();
      this.e = a(paramiy, paramjc, localsh, new is.a(null, localsh, null, localmu));
    }
  }

  public final Collection<String> b(hj paramhj, iz paramiz)
  {
    if (this.e != null)
      return (Collection)this.d.a(this.e.a(paramhj, paramiz));
    return a(paramhj, paramiz, (Collection)this.d.m());
  }

  public final jg<Object> d()
  {
    return this.b;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.me
 * JD-Core Version:    0.6.2
 */