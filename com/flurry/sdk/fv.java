package com.flurry.sdk;

import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class fv<D>
{
  private final ft a;
  private fn b;

  protected fv(fn paramfn, ft paramft)
  {
    this(paramft);
    a(paramfn);
  }

  protected fv(ft paramft)
  {
    this.a = paramft;
  }

  private void b(fn paramfn, Object paramObject)
  {
    throw new fl("Not a " + paramfn + ": " + paramObject);
  }

  protected int a(fn paramfn, Object paramObject)
  {
    return this.a.a(paramfn, paramObject);
  }

  protected long a(Object paramObject)
  {
    return ((Collection)paramObject).size();
  }

  protected NullPointerException a(NullPointerException paramNullPointerException, String paramString)
  {
    NullPointerException localNullPointerException = new NullPointerException(paramNullPointerException.getMessage() + paramString);
    if (paramNullPointerException.getCause() == null);
    while (true)
    {
      localNullPointerException.initCause(paramNullPointerException);
      return localNullPointerException;
      paramNullPointerException = paramNullPointerException.getCause();
    }
  }

  public void a(fn paramfn)
  {
    this.b = paramfn;
  }

  protected void a(fn paramfn, Object paramObject, gi paramgi)
  {
    try
    {
      switch (1.a[paramfn.a().ordinal()])
      {
      default:
        b(paramfn, paramObject);
        return;
      case 1:
        b(paramfn, paramObject, paramgi);
        return;
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      throw a(localNullPointerException, " of " + paramfn.g());
    }
    c(paramfn, paramObject, paramgi);
    return;
    d(paramfn, paramObject, paramgi);
    return;
    e(paramfn, paramObject, paramgi);
    return;
    int i = a(paramfn, paramObject);
    paramgi.b(i);
    a((fn)paramfn.k().get(i), paramObject, paramgi);
    return;
    g(paramfn, paramObject, paramgi);
    return;
    f(paramfn, paramObject, paramgi);
    return;
    c(paramObject, paramgi);
    return;
    paramgi.c(((Number)paramObject).intValue());
    return;
    paramgi.b(((Long)paramObject).longValue());
    return;
    paramgi.a(((Float)paramObject).floatValue());
    return;
    paramgi.a(((Double)paramObject).doubleValue());
    return;
    paramgi.a(((Boolean)paramObject).booleanValue());
    return;
    paramgi.a();
  }

  public void a(D paramD, gi paramgi)
  {
    a(this.b, paramD, paramgi);
  }

  protected Iterator<? extends Object> b(Object paramObject)
  {
    return ((Collection)paramObject).iterator();
  }

  protected void b(fn paramfn, Object paramObject, gi paramgi)
  {
    Object localObject1 = this.a.a(paramObject, paramfn);
    Iterator localIterator = paramfn.b().iterator();
    while (localIterator.hasNext())
    {
      fn.f localf = (fn.f)localIterator.next();
      Object localObject2 = this.a.b(paramObject, localf.a(), localf.b(), localObject1);
      try
      {
        a(localf.c(), localObject2, paramgi);
      }
      catch (NullPointerException localNullPointerException)
      {
        throw a(localNullPointerException, " in field " + localf.a());
      }
    }
  }

  protected void b(Object paramObject, gi paramgi)
  {
    paramgi.a((CharSequence)paramObject);
  }

  protected int c(Object paramObject)
  {
    return ((Map)paramObject).size();
  }

  protected void c(fn paramfn, Object paramObject, gi paramgi)
  {
    paramgi.a(paramfn.c(paramObject.toString()));
  }

  protected void c(Object paramObject, gi paramgi)
  {
    paramgi.a((ByteBuffer)paramObject);
  }

  protected Iterable<Map.Entry<Object, Object>> d(Object paramObject)
  {
    return ((Map)paramObject).entrySet();
  }

  protected void d(fn paramfn, Object paramObject, gi paramgi)
  {
    fn localfn = paramfn.i();
    long l = a(paramObject);
    paramgi.b();
    paramgi.a(l);
    Iterator localIterator = b(paramObject);
    while (localIterator.hasNext())
    {
      paramgi.c();
      a(localfn, localIterator.next(), paramgi);
    }
    paramgi.d();
  }

  protected void e(fn paramfn, Object paramObject, gi paramgi)
  {
    fn localfn = paramfn.j();
    int i = c(paramObject);
    paramgi.e();
    paramgi.a(i);
    Iterator localIterator = d(paramObject).iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      paramgi.c();
      b(localEntry.getKey(), paramgi);
      a(localfn, localEntry.getValue(), paramgi);
    }
    paramgi.f();
  }

  protected void f(fn paramfn, Object paramObject, gi paramgi)
  {
    b(paramObject, paramgi);
  }

  protected void g(fn paramfn, Object paramObject, gi paramgi)
  {
    paramgi.b(((fx)paramObject).b(), 0, paramfn.l());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fv
 * JD-Core Version:    0.6.2
 */