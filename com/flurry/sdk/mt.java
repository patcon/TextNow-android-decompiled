package com.flurry.sdk;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class mt extends mq
{
  protected final mu a;
  protected final Type c;
  protected final int d;

  public mt(mu parammu, Type paramType, mv parammv, int paramInt)
  {
    super(parammv);
    this.a = parammu;
    this.c = paramType;
    this.d = paramInt;
  }

  public final mt a(mv parammv)
  {
    if (parammv == this.b)
      return this;
    return this.a.a(this.d, parammv);
  }

  public final <A extends Annotation> A a(Class<A> paramClass)
  {
    return this.b.a(paramClass);
  }

  public final AnnotatedElement a()
  {
    return null;
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException("Cannot call setValue() on constructor parameter of " + h().getName());
  }

  public final String b()
  {
    return "";
  }

  public final Type c()
  {
    return this.c;
  }

  public final Class<?> d()
  {
    if ((this.c instanceof Class))
      return (Class)this.c;
    return qs.a().a(this.c).p();
  }

  public final Type e()
  {
    return this.c;
  }

  public final mu f()
  {
    return this.a;
  }

  public final int g()
  {
    return this.d;
  }

  public final Class<?> h()
  {
    return this.a.h();
  }

  public final Member i()
  {
    return this.a.i();
  }

  public final String toString()
  {
    return "[parameter #" + g() + ", annotations: " + this.b + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mt
 * JD-Core Version:    0.6.2
 */