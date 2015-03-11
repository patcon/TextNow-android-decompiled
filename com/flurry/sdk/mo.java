package com.flurry.sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

public final class mo extends mu
{
  protected final Constructor<?> a;

  public mo(Constructor<?> paramConstructor, mv parammv, mv[] paramArrayOfmv)
  {
    super(parammv, paramArrayOfmv);
    if (paramConstructor == null)
      throw new IllegalArgumentException("Null constructor not allowed");
    this.a = paramConstructor;
  }

  public final sh a(qr paramqr)
  {
    return a(paramqr, this.a.getTypeParameters());
  }

  public final Class<?> a(int paramInt)
  {
    Class[] arrayOfClass = this.a.getParameterTypes();
    if (paramInt >= arrayOfClass.length)
      return null;
    return arrayOfClass[paramInt];
  }

  public final Object a(Object paramObject)
  {
    return this.a.newInstance(new Object[] { paramObject });
  }

  public final Object a(Object[] paramArrayOfObject)
  {
    return this.a.newInstance(paramArrayOfObject);
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException("Cannot call setValue() on constructor of " + h().getName());
  }

  public final String b()
  {
    return this.a.getName();
  }

  public final Type b(int paramInt)
  {
    Type[] arrayOfType = this.a.getGenericParameterTypes();
    if (paramInt >= arrayOfType.length)
      return null;
    return arrayOfType[paramInt];
  }

  public final Type c()
  {
    return d();
  }

  public final Class<?> d()
  {
    return this.a.getDeclaringClass();
  }

  public final Constructor<?> e()
  {
    return this.a;
  }

  public final int f()
  {
    return this.a.getParameterTypes().length;
  }

  public final Object g()
  {
    return this.a.newInstance(new Object[0]);
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
    return "[constructor for " + b() + ", annotations: " + this.b + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mo
 * JD-Core Version:    0.6.2
 */