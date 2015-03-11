package com.flurry.sdk;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class ht extends hf
{
  protected hn b;
  protected int c;
  protected boolean d;
  protected hx e;
  protected boolean f;

  protected ht(int paramInt, hn paramhn)
  {
    this.c = paramInt;
    this.e = hx.g();
    this.b = paramhn;
    this.d = a(hf.a.e);
  }

  public hf a()
  {
    return a(new sl());
  }

  public void a(hh paramhh)
  {
    if (paramhh == null)
    {
      f();
      return;
    }
    if (this.b == null)
      throw new IllegalStateException("No ObjectCodec defined for the generator, can not serialize JsonNode-based trees");
    this.b.a(this, paramhh);
  }

  public void a(Object paramObject)
  {
    if (paramObject == null)
    {
      f();
      return;
    }
    if (this.b != null)
    {
      this.b.a(this, paramObject);
      return;
    }
    b(paramObject);
  }

  public final boolean a(hf.a parama)
  {
    return (this.c & parama.c()) != 0;
  }

  public void b()
  {
    h("start an array");
    this.e = this.e.h();
    if (this.a != null)
    {
      this.a.e(this);
      return;
    }
    i();
  }

  protected void b(Object paramObject)
  {
    if (paramObject == null)
    {
      f();
      return;
    }
    if ((paramObject instanceof String))
    {
      b((String)paramObject);
      return;
    }
    if ((paramObject instanceof Number))
    {
      Number localNumber = (Number)paramObject;
      if ((localNumber instanceof Integer))
      {
        b(localNumber.intValue());
        return;
      }
      if ((localNumber instanceof Long))
      {
        a(localNumber.longValue());
        return;
      }
      if ((localNumber instanceof Double))
      {
        a(localNumber.doubleValue());
        return;
      }
      if ((localNumber instanceof Float))
      {
        a(localNumber.floatValue());
        return;
      }
      if ((localNumber instanceof Short))
      {
        b(localNumber.shortValue());
        return;
      }
      if ((localNumber instanceof Byte))
      {
        b(localNumber.byteValue());
        return;
      }
      if ((localNumber instanceof BigInteger))
      {
        a((BigInteger)localNumber);
        return;
      }
      if ((localNumber instanceof BigDecimal))
      {
        a((BigDecimal)localNumber);
        return;
      }
      if ((localNumber instanceof AtomicInteger))
      {
        b(((AtomicInteger)localNumber).get());
        return;
      }
      if ((localNumber instanceof AtomicLong))
        a(((AtomicLong)localNumber).get());
    }
    else
    {
      if ((paramObject instanceof byte[]))
      {
        a((byte[])paramObject);
        return;
      }
      if ((paramObject instanceof Boolean))
      {
        a(((Boolean)paramObject).booleanValue());
        return;
      }
      if ((paramObject instanceof AtomicBoolean))
      {
        a(((AtomicBoolean)paramObject).get());
        return;
      }
    }
    throw new IllegalStateException("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed " + paramObject.getClass().getName() + ")");
  }

  public void c()
  {
    if (!this.e.a())
      i("Current context not an ARRAY but " + this.e.d());
    if (this.a != null)
      this.a.b(this, this.e.e());
    while (true)
    {
      this.e = this.e.j();
      return;
      j();
    }
  }

  public void close()
  {
    this.f = true;
  }

  public void d()
  {
    h("start an object");
    this.e = this.e.i();
    if (this.a != null)
    {
      this.a.b(this);
      return;
    }
    k();
  }

  public void d(String paramString)
  {
    h("write raw value");
    c(paramString);
  }

  public void e()
  {
    if (!this.e.c())
      i("Current context not an object but " + this.e.d());
    this.e = this.e.j();
    if (this.a != null)
    {
      this.a.a(this, this.e.e());
      return;
    }
    l();
  }

  public final hx h()
  {
    return this.e;
  }

  protected abstract void h(String paramString);

  @Deprecated
  protected void i()
  {
  }

  protected void i(String paramString)
  {
    throw new he(paramString);
  }

  @Deprecated
  protected void j()
  {
  }

  @Deprecated
  protected void k()
  {
  }

  @Deprecated
  protected void l()
  {
  }

  protected void m()
  {
    throw new RuntimeException("Internal error: should never end up through this code path");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ht
 * JD-Core Version:    0.6.2
 */