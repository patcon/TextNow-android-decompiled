package com.flurry.sdk;

import java.lang.reflect.Type;
import java.util.Date;

public abstract class jw
{
  protected static final sh a = qs.a().a(Object.class);
  protected final ju b;
  protected final Class<?> c;

  protected jw(ju paramju)
  {
    this.b = paramju;
    if (paramju == null);
    for (Class localClass = null; ; localClass = this.b.f())
    {
      this.c = localClass;
      return;
    }
  }

  public abstract jk<Object> a(sh paramsh, is paramis);

  public abstract jk<Object> a(sh paramsh, boolean paramBoolean, is paramis);

  public abstract jk<Object> a(Class<?> paramClass, is paramis);

  public abstract jk<Object> a(Class<?> paramClass, boolean paramBoolean, is paramis);

  public sh a(sh paramsh, Class<?> paramClass)
  {
    return this.b.a(paramsh, paramClass);
  }

  public sh a(Type paramType)
  {
    return this.b.m().a(paramType);
  }

  public final Class<?> a()
  {
    return this.c;
  }

  public abstract void a(long paramLong, hf paramhf);

  public final void a(hf paramhf)
  {
    d().a(null, paramhf, this);
  }

  public abstract void a(ju paramju, hf paramhf, Object paramObject, jv paramjv);

  public final void a(Object paramObject, hf paramhf)
  {
    if (paramObject == null)
    {
      d().a(null, paramhf, this);
      return;
    }
    a(paramObject.getClass(), true, null).a(paramObject, paramhf, this);
  }

  public abstract void a(Date paramDate, hf paramhf);

  public final boolean a(ju.a parama)
  {
    return this.b.a(parama);
  }

  public abstract jk<Object> b(sh paramsh, is paramis);

  public final on b()
  {
    return this.b.h();
  }

  public abstract void b(long paramLong, hf paramhf);

  public abstract void b(Date paramDate, hf paramhf);

  public abstract jk<Object> c();

  public abstract jk<Object> d();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.jw
 * JD-Core Version:    0.6.2
 */