package com.flurry.sdk;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

public class or extends jw
{
  public static final jk<Object> d = new ot("Null key for a Map not allowed in JSON (use a converting NullKeySerializer?)");

  @Deprecated
  public static final jk<Object> e = new qb();
  public static final jk<Object> f = new oy();
  protected final jv g;
  protected final ox h;
  protected final rh i;
  protected jk<Object> j = f;
  protected jk<Object> k;
  protected jk<Object> l = pq.a;
  protected jk<Object> m = d;
  protected final ow n;
  protected DateFormat o;

  public or()
  {
    super(null);
    this.g = null;
    this.h = new ox();
    this.n = null;
    this.i = new rh();
  }

  protected or(ju paramju, or paramor, jv paramjv)
  {
    super(paramju);
    if (paramju == null)
      throw new NullPointerException();
    this.g = paramjv;
    this.h = paramor.h;
    this.j = paramor.j;
    this.k = paramor.k;
    this.l = paramor.l;
    this.m = paramor.m;
    this.i = paramor.i;
    this.n = this.h.a();
  }

  protected jk<Object> a(jk<Object> paramjk, is paramis)
  {
    if (!(paramjk instanceof ix))
      return paramjk;
    Object localObject = ((ix)paramjk).a(this.b, paramis);
    if (localObject != paramjk)
      if ((localObject instanceof jt))
        ((jt)localObject).a(this);
    while (true)
    {
      return localObject;
      localObject = paramjk;
    }
  }

  public jk<Object> a(sh paramsh, is paramis)
  {
    jk localjk = this.n.b(paramsh);
    if (localjk == null)
    {
      localjk = this.h.a(paramsh);
      if (localjk == null)
      {
        localjk = c(paramsh, paramis);
        if (localjk == null)
          return a(paramsh.p());
      }
    }
    return a(localjk, paramis);
  }

  public jk<Object> a(sh paramsh, boolean paramBoolean, is paramis)
  {
    Object localObject = this.n.a(paramsh);
    if (localObject != null);
    while (true)
    {
      return localObject;
      localObject = this.h.b(paramsh);
      if (localObject == null)
      {
        jk localjk = a(paramsh, paramis);
        jz localjz = this.g.b(this.b, paramsh, paramis);
        if (localjz != null);
        for (localObject = new or.a(localjz, localjk); paramBoolean; localObject = localjk)
        {
          this.h.a(paramsh, (jk)localObject);
          return localObject;
        }
      }
    }
  }

  public jk<Object> a(Class<?> paramClass)
  {
    return this.j;
  }

  public jk<Object> a(Class<?> paramClass, is paramis)
  {
    jk localjk = this.n.b(paramClass);
    if (localjk == null)
    {
      localjk = this.h.a(paramClass);
      if (localjk == null)
      {
        localjk = this.h.a(this.b.b(paramClass));
        if (localjk == null)
        {
          localjk = b(paramClass, paramis);
          if (localjk == null)
            return a(paramClass);
        }
      }
    }
    return a(localjk, paramis);
  }

  public jk<Object> a(Class<?> paramClass, boolean paramBoolean, is paramis)
  {
    Object localObject = this.n.a(paramClass);
    if (localObject != null);
    while (true)
    {
      return localObject;
      localObject = this.h.b(paramClass);
      if (localObject == null)
      {
        jk localjk = a(paramClass, paramis);
        jz localjz = this.g.b(this.b, this.b.b(paramClass), paramis);
        if (localjz != null);
        for (localObject = new or.a(localjz, localjk); paramBoolean; localObject = localjk)
        {
          this.h.a(paramClass, (jk)localObject);
          return localObject;
        }
      }
    }
  }

  protected or a(ju paramju, jv paramjv)
  {
    return new or(paramju, this, paramjv);
  }

  public final void a(long paramLong, hf paramhf)
  {
    if (a(ju.a.q))
    {
      paramhf.a(paramLong);
      return;
    }
    if (this.o == null)
      this.o = ((DateFormat)this.b.n().clone());
    paramhf.b(this.o.format(new Date(paramLong)));
  }

  protected void a(hf paramhf, Object paramObject)
  {
    jk localjk;
    boolean bool;
    if (paramObject == null)
    {
      localjk = d();
      bool = false;
    }
    try
    {
      while (true)
      {
        localjk.a(paramObject, paramhf, this);
        if (bool)
          paramhf.e();
        return;
        localjk = a(paramObject.getClass(), true, null);
        bool = this.b.a(ju.a.j);
        if (bool)
        {
          paramhf.d();
          paramhf.a(this.i.a(paramObject.getClass(), this.b));
        }
      }
    }
    catch (IOException localIOException)
    {
      throw localIOException;
    }
    catch (Exception localException)
    {
      String str = localException.getMessage();
      if (str == null)
        str = "[no message for " + localException.getClass().getName() + "]";
      throw new jh(str, localException);
    }
  }

  public final void a(ju paramju, hf paramhf, Object paramObject, jv paramjv)
  {
    if (paramjv == null)
      throw new IllegalArgumentException("Can not pass null serializerFactory");
    or localor = a(paramju, paramjv);
    if (localor.getClass() != getClass())
      throw new IllegalStateException("Broken serializer provider: createInstance returned instance of type " + localor.getClass() + "; blueprint of type " + getClass());
    localor.a(paramhf, paramObject);
  }

  public final void a(Date paramDate, hf paramhf)
  {
    if (a(ju.a.q))
    {
      paramhf.a(paramDate.getTime());
      return;
    }
    if (this.o == null)
      this.o = ((DateFormat)this.b.n().clone());
    paramhf.b(this.o.format(paramDate));
  }

  public jk<Object> b(sh paramsh, is paramis)
  {
    jk localjk = this.g.c(this.b, paramsh, paramis);
    if (localjk == null)
      if (this.k != null)
        break label54;
    label54: for (localjk = qc.a(paramsh); ; localjk = this.k)
    {
      if ((localjk instanceof ix))
        localjk = ((ix)localjk).a(this.b, paramis);
      return localjk;
    }
  }

  protected jk<Object> b(Class<?> paramClass, is paramis)
  {
    try
    {
      jk localjk = d(this.b.b(paramClass), paramis);
      if (localjk != null)
        this.h.a(paramClass, localjk, this);
      return localjk;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new jh(localIllegalArgumentException.getMessage(), null, localIllegalArgumentException);
    }
  }

  public void b(long paramLong, hf paramhf)
  {
    if (a(ju.a.r))
    {
      paramhf.a(String.valueOf(paramLong));
      return;
    }
    if (this.o == null)
      this.o = ((DateFormat)this.b.n().clone());
    paramhf.a(this.o.format(new Date(paramLong)));
  }

  public void b(Date paramDate, hf paramhf)
  {
    if (a(ju.a.r))
    {
      paramhf.a(String.valueOf(paramDate.getTime()));
      return;
    }
    if (this.o == null)
      this.o = ((DateFormat)this.b.n().clone());
    paramhf.a(this.o.format(paramDate));
  }

  public jk<Object> c()
  {
    return this.m;
  }

  protected jk<Object> c(sh paramsh, is paramis)
  {
    try
    {
      jk localjk = d(paramsh, paramis);
      if (localjk != null)
        this.h.a(paramsh, localjk, this);
      return localjk;
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new jh(localIllegalArgumentException.getMessage(), null, localIllegalArgumentException);
    }
  }

  public jk<Object> d()
  {
    return this.l;
  }

  protected jk<Object> d(sh paramsh, is paramis)
  {
    return this.g.a(this.b, paramsh, paramis);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.or
 * JD-Core Version:    0.6.2
 */