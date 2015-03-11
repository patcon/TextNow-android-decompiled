package com.flurry.sdk;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class mp extends mq
{
  protected final Field a;

  public mp(Field paramField, mv parammv)
  {
    super(parammv);
    this.a = paramField;
  }

  public final mp a(mv parammv)
  {
    return new mp(this.a, parammv);
  }

  public final <A extends Annotation> A a(Class<A> paramClass)
  {
    return this.b.a(paramClass);
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    try
    {
      this.a.set(paramObject1, paramObject2);
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException("Failed to setValue() for field " + f() + ": " + localIllegalAccessException.getMessage(), localIllegalAccessException);
    }
  }

  public final void a(Annotation paramAnnotation)
  {
    this.b.b(paramAnnotation);
  }

  public final String b()
  {
    return this.a.getName();
  }

  public final Type c()
  {
    return this.a.getGenericType();
  }

  public final Class<?> d()
  {
    return this.a.getType();
  }

  public final Field e()
  {
    return this.a;
  }

  public final String f()
  {
    return h().getName() + "#" + b();
  }

  public final Class<?> h()
  {
    return this.a.getDeclaringClass();
  }

  public final Member i()
  {
    return this.a;
  }

  public final String toString()
  {
    return "[field " + b() + ", annotations: " + this.b + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mp
 * JD-Core Version:    0.6.2
 */