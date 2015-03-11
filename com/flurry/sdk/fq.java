package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class fq<T extends fz>
{
  private static final ConcurrentMap<String, ConcurrentMap<Integer, Object>> a = new ConcurrentHashMap();
  private static final fn.f[] b = new fn.f[0];
  private final fn c;
  private final fn.f[] d;
  private final boolean[] e;
  private final ft f;
  private gc g = null;
  private gb h = null;

  protected fq(fn paramfn, ft paramft)
  {
    this.c = paramfn;
    this.f = paramft;
    this.d = ((fn.f[])paramfn.b().toArray(b));
    this.e = new boolean[this.d.length];
  }

  protected static boolean b(fn.f paramf, Object paramObject)
  {
    if (paramObject != null)
      return true;
    fn localfn = paramf.c();
    fn.v localv = localfn.a();
    if (localv == fn.v.n)
      return true;
    if (localv == fn.v.e)
    {
      Iterator localIterator = localfn.k().iterator();
      while (localIterator.hasNext())
        if (((fn)localIterator.next()).a() == fn.v.n)
          return true;
    }
    return false;
  }

  protected Object a(fn.f paramf)
  {
    hh localhh = paramf.e();
    if (localhh == null)
      throw new fk("Field " + paramf + " not set and has no default value");
    if ((localhh.h()) && ((paramf.c().a() == fn.v.n) || ((paramf.c().a() == fn.v.e) && (((fn)paramf.c().k().get(0)).a() == fn.v.n))))
      return null;
    ConcurrentMap localConcurrentMap = (ConcurrentMap)a.get(this.c.g());
    if (localConcurrentMap == null)
    {
      a.putIfAbsent(this.c.g(), new ConcurrentHashMap(this.d.length));
      localConcurrentMap = (ConcurrentMap)a.get(this.c.g());
    }
    Object localObject1 = localConcurrentMap.get(Integer.valueOf(paramf.b()));
    if (localObject1 == null)
    {
      ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
      this.g = gj.a().a(localByteArrayOutputStream, this.g);
      go.a(this.g, paramf.c(), localhh);
      this.g.flush();
      this.h = gg.a().a(localByteArrayOutputStream.toByteArray(), this.h);
      localObject1 = this.f.a(paramf.c()).a(null, this.h);
      localConcurrentMap.putIfAbsent(Integer.valueOf(paramf.b()), localObject1);
    }
    Object localObject2 = localObject1;
    return this.f.b(paramf.c(), localObject2);
  }

  protected void a(fn.f paramf, Object paramObject)
  {
    if (b(paramf, paramObject));
    while (paramf.e() != null)
      return;
    throw new fk("Field " + paramf + " does not accept null values");
  }

  protected final fn.f[] b()
  {
    return this.d;
  }

  protected final boolean[] c()
  {
    return this.e;
  }

  public boolean equals(Object paramObject)
  {
    if (this == paramObject);
    fq localfq;
    do
    {
      do
      {
        return true;
        if (paramObject == null)
          return false;
        if (getClass() != paramObject.getClass())
          return false;
        localfq = (fq)paramObject;
        if (!Arrays.equals(this.e, localfq.e))
          return false;
        if (this.c != null)
          break;
      }
      while (localfq.c == null);
      return false;
    }
    while (this.c.equals(localfq.c));
    return false;
  }

  public int hashCode()
  {
    int i = 31 * (31 + Arrays.hashCode(this.e));
    if (this.c == null);
    for (int j = 0; ; j = this.c.hashCode())
      return j + i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fq
 * JD-Core Version:    0.6.2
 */