package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class fu<D>
  implements ge<D>
{
  private static final ThreadLocal<Map<fn, Map<fn, gl>>> f = new ThreadLocal()
  {
    protected final Map<fn, Map<fn, gl>> a()
    {
      return new gz();
    }
  };
  private final ft a;
  private fn b;
  private fn c;
  private gl d = null;
  private final Thread e;

  public fu()
  {
    this(null, null, ft.a());
  }

  protected fu(fn paramfn1, fn paramfn2, ft paramft)
  {
    this.b = paramfn1;
    this.c = paramfn2;
    this.a = paramft;
    this.e = Thread.currentThread();
  }

  public ft a()
  {
    return this.a;
  }

  protected final gl a(fn paramfn1, fn paramfn2)
  {
    Thread localThread = Thread.currentThread();
    gl localgl;
    if ((localThread == this.e) && (this.d != null))
    {
      localgl = this.d;
      return localgl;
    }
    Map localMap = (Map)((Map)f.get()).get(paramfn1);
    Object localObject;
    if (localMap == null)
    {
      localObject = new gz();
      ((Map)f.get()).put(paramfn1, localObject);
    }
    while (true)
    {
      localgl = (gl)((Map)localObject).get(paramfn2);
      if (localgl == null)
      {
        localgl = gg.a().a(fn.a(paramfn1, paramfn2), paramfn2, null);
        ((Map)localObject).put(paramfn2, localgl);
      }
      if (localThread != this.e)
        break;
      this.d = localgl;
      return localgl;
      localObject = localMap;
    }
  }

  protected Object a(fn paramfn, gf paramgf)
  {
    return a((String)paramfn.c().get(paramgf.k()), paramfn);
  }

  protected Object a(Object paramObject)
  {
    if ((paramObject instanceof fr))
      return ((fr)paramObject).b();
    return null;
  }

  protected Object a(Object paramObject, int paramInt)
  {
    if ((paramObject instanceof Map))
    {
      ((Map)paramObject).clear();
      return paramObject;
    }
    return new HashMap(paramInt);
  }

  protected Object a(Object paramObject, int paramInt, fn paramfn)
  {
    if ((paramObject instanceof Collection))
    {
      ((Collection)paramObject).clear();
      return paramObject;
    }
    return new ft.a(paramInt, paramfn);
  }

  protected Object a(Object paramObject, fn paramfn, gf paramgf)
  {
    fx localfx = (fx)this.a.c(paramObject, paramfn);
    paramgf.b(localfx.b(), 0, paramfn.l());
    return localfx;
  }

  protected Object a(Object paramObject, fn paramfn, gl paramgl)
  {
    switch (2.a[paramfn.a().ordinal()])
    {
    default:
      throw new fk("Unknown type: " + paramfn);
    case 1:
      return b(paramObject, paramfn, paramgl);
    case 2:
      return a(paramfn, paramgl);
    case 3:
      return c(paramObject, paramfn, paramgl);
    case 4:
      return d(paramObject, paramfn, paramgl);
    case 5:
      return a(paramObject, (fn)paramfn.k().get(paramgl.s()), paramgl);
    case 6:
      return a(paramObject, paramfn, paramgl);
    case 7:
      return b(paramObject, paramfn, paramgl);
    case 8:
      return c(paramObject, paramgl);
    case 9:
      return c(paramObject, paramfn, paramgl);
    case 10:
      return Long.valueOf(paramgl.e());
    case 11:
      return Float.valueOf(paramgl.f());
    case 12:
      return Double.valueOf(paramgl.g());
    case 13:
      return Boolean.valueOf(paramgl.c());
    case 14:
    }
    paramgl.b();
    return null;
  }

  public D a(D paramD, gf paramgf)
  {
    gl localgl = a(this.b, this.c);
    localgl.a(paramgf);
    Object localObject = a(paramD, this.c, localgl);
    localgl.v();
    return localObject;
  }

  protected Object a(String paramString, fn paramfn)
  {
    return new ft.b(paramfn, paramString);
  }

  protected void a(Object paramObject1, long paramLong, Object paramObject2)
  {
    ((Collection)paramObject1).add(paramObject2);
  }

  protected void a(Object paramObject1, Object paramObject2, Object paramObject3)
  {
    ((Map)paramObject1).put(paramObject2, paramObject3);
  }

  protected Object b(Object paramObject, fn paramfn, gf paramgf)
  {
    if ("String".equals(paramfn.a("avro.java.string")))
      return paramgf.h();
    return b(paramObject, paramgf);
  }

  protected Object b(Object paramObject, fn paramfn, gl paramgl)
  {
    Object localObject1 = this.a.d(paramObject, paramfn);
    Object localObject2 = this.a.a(localObject1, paramfn);
    fn.f[] arrayOff = paramgl.u();
    int i = arrayOff.length;
    int j = 0;
    if (j < i)
    {
      fn.f localf = arrayOff[j];
      int k = localf.b();
      String str = localf.a();
      if (paramObject != null);
      for (Object localObject3 = this.a.b(localObject1, str, k, localObject2); ; localObject3 = null)
      {
        this.a.a(localObject1, str, k, a(localObject3, localf.c(), paramgl), localObject2);
        j++;
        break;
      }
    }
    return localObject1;
  }

  protected Object b(Object paramObject, gf paramgf)
  {
    if ((paramObject instanceof gy));
    for (gy localgy = (gy)paramObject; ; localgy = null)
      return paramgf.a(localgy);
  }

  protected Object c(Object paramObject, fn paramfn, gf paramgf)
  {
    return Integer.valueOf(paramgf.d());
  }

  protected Object c(Object paramObject, fn paramfn, gl paramgl)
  {
    fn localfn = paramfn.i();
    long l1 = paramgl.m();
    long l2 = 0L;
    if (l1 > 0L)
    {
      Object localObject = a(paramObject, (int)l1, paramfn);
      do
      {
        for (long l3 = 0L; l3 < l1; l3 += 1L)
          a(localObject, l2 + l3, a(a(localObject), localfn, paramgl));
        l2 += l1;
        l1 = paramgl.n();
      }
      while (l1 > 0L);
      return localObject;
    }
    return a(paramObject, 0, paramfn);
  }

  protected Object c(Object paramObject, gf paramgf)
  {
    if ((paramObject instanceof ByteBuffer));
    for (ByteBuffer localByteBuffer = (ByteBuffer)paramObject; ; localByteBuffer = null)
      return paramgf.a(localByteBuffer);
  }

  protected Object d(Object paramObject, fn paramfn, gl paramgl)
  {
    fn localfn = paramfn.j();
    long l = paramgl.p();
    Object localObject = a(paramObject, (int)l);
    if (l > 0L)
      do
      {
        for (int i = 0; i < l; i++)
          a(localObject, b(null, paramfn, paramgl), a(null, localfn, paramgl));
        l = paramgl.q();
      }
      while (l > 0L);
    return localObject;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fu
 * JD-Core Version:    0.6.2
 */