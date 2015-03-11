package com.flurry.sdk;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

@kb
public class lw extends lo<Map<Object, Object>>
  implements js
{
  protected final sh a;
  protected final jl b;
  protected final jg<Object> c;
  protected final jy d;
  protected final kx e;
  protected final boolean f;
  protected ld g;
  protected jg<Object> h;
  protected HashSet<String> i;

  public lw(sh paramsh, kx paramkx, jl paramjl, jg<Object> paramjg, jy paramjy)
  {
    super(Map.class);
    this.a = paramsh;
    this.b = paramjl;
    this.c = paramjg;
    this.d = paramjy;
    this.e = paramkx;
    if (paramkx.j());
    for (this.g = new ld(paramkx); ; this.g = null)
    {
      this.f = paramkx.h();
      return;
    }
  }

  public Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    return paramjy.a(paramhj, paramiz);
  }

  public Map<Object, Object> a(hj paramhj, iz paramiz, Map<Object, Object> paramMap)
  {
    hm localhm = paramhj.e();
    if ((localhm != hm.b) && (localhm != hm.f))
      throw paramiz.b(e());
    b(paramhj, paramiz, paramMap);
    return paramMap;
  }

  public void a(iy paramiy, jc paramjc)
  {
    if (this.e.i())
    {
      sh localsh = this.e.l();
      if (localsh == null)
        throw new IllegalArgumentException("Invalid delegate-creator definition for " + this.a + ": value instantiator (" + this.e.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
      this.h = a(paramiy, paramjc, localsh, new is.a(null, localsh, null, this.e.o()));
    }
    if (this.g != null)
    {
      Iterator localIterator = this.g.a().iterator();
      while (localIterator.hasNext())
      {
        kt localkt = (kt)localIterator.next();
        if (!localkt.f())
          this.g.a(localkt, a(paramiy, paramjc, localkt.a(), localkt));
      }
    }
  }

  protected void a(Throwable paramThrowable, Object paramObject)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if (((localThrowable instanceof IOException)) && (!(localThrowable instanceof jh)))
      throw ((IOException)localThrowable);
    throw jh.a(localThrowable, paramObject, null);
  }

  public void a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0));
    for (HashSet localHashSet = null; ; localHashSet = qw.a(paramArrayOfString))
    {
      this.i = localHashSet;
      return;
    }
  }

  public Map<Object, Object> b(hj paramhj, iz paramiz)
  {
    if (this.g != null)
      return c(paramhj, paramiz);
    if (this.h != null)
      return (Map)this.e.a(this.h.a(paramhj, paramiz));
    if (!this.f)
      throw paramiz.a(e(), "No default constructor found");
    hm localhm = paramhj.e();
    if ((localhm != hm.b) && (localhm != hm.f) && (localhm != hm.c))
    {
      if (localhm == hm.h)
        return (Map)this.e.a(paramhj.k());
      throw paramiz.b(e());
    }
    Map localMap = (Map)this.e.m();
    b(paramhj, paramiz, localMap);
    return localMap;
  }

  protected final void b(hj paramhj, iz paramiz, Map<Object, Object> paramMap)
  {
    hm localhm1 = paramhj.e();
    if (localhm1 == hm.b)
      localhm1 = paramhj.b();
    jl localjl = this.b;
    jg localjg = this.c;
    jy localjy = this.d;
    while (localhm1 == hm.f)
    {
      String str = paramhj.g();
      Object localObject1 = localjl.a(str, paramiz);
      hm localhm2 = paramhj.b();
      if ((this.i != null) && (this.i.contains(str)))
      {
        paramhj.d();
        localhm1 = paramhj.b();
      }
      else
      {
        Object localObject2;
        if (localhm2 == hm.m)
          localObject2 = null;
        while (true)
        {
          paramMap.put(localObject1, localObject2);
          break;
          if (localjy == null)
            localObject2 = localjg.a(paramhj, paramiz);
          else
            localObject2 = localjg.a(paramhj, paramiz, localjy);
        }
      }
    }
  }

  public Map<Object, Object> c(hj paramhj, iz paramiz)
  {
    ld localld = this.g;
    lf locallf = localld.a(paramhj, paramiz);
    hm localhm1 = paramhj.e();
    if (localhm1 == hm.b)
      localhm1 = paramhj.b();
    jg localjg = this.c;
    jy localjy = this.d;
    if (localhm1 == hm.f)
    {
      String str1 = paramhj.g();
      hm localhm2 = paramhj.b();
      if ((this.i != null) && (this.i.contains(str1)))
        paramhj.d();
      kt localkt;
      Object localObject3;
      do
      {
        localhm1 = paramhj.b();
        break;
        localkt = localld.a(str1);
        if (localkt == null)
          break label179;
        localObject3 = localkt.a(paramhj, paramiz);
      }
      while (!locallf.a(localkt.j(), localObject3));
      paramhj.b();
      try
      {
        Map localMap2 = (Map)localld.a(locallf);
        b(paramhj, paramiz, localMap2);
        return localMap2;
      }
      catch (Exception localException2)
      {
        a(localException2, this.a.p());
        return null;
      }
      label179: String str2 = paramhj.g();
      Object localObject1 = this.b.a(str2, paramiz);
      Object localObject2;
      if (localhm2 == hm.m)
        localObject2 = null;
      while (true)
      {
        locallf.a(localObject1, localObject2);
        break;
        if (localjy == null)
          localObject2 = localjg.a(paramhj, paramiz);
        else
          localObject2 = localjg.a(paramhj, paramiz, localjy);
      }
    }
    try
    {
      Map localMap1 = (Map)localld.a(locallf);
      return localMap1;
    }
    catch (Exception localException1)
    {
      a(localException1, this.a.p());
    }
    return null;
  }

  public jg<Object> d()
  {
    return this.c;
  }

  public final Class<?> e()
  {
    return this.a.p();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lw
 * JD-Core Version:    0.6.2
 */