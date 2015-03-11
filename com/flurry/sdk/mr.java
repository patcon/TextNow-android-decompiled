package com.flurry.sdk;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public final class mr extends mu
{
  protected final Method a;
  protected Class<?>[] c;

  public mr(Method paramMethod, mv parammv, mv[] paramArrayOfmv)
  {
    super(parammv, paramArrayOfmv);
    this.a = paramMethod;
  }

  public final mr a(mv parammv)
  {
    return new mr(this.a, parammv, this.d);
  }

  public final mr a(Method paramMethod)
  {
    return new mr(paramMethod, this.b, this.d);
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
    return this.a.invoke(null, new Object[] { paramObject });
  }

  public final Object a(Object[] paramArrayOfObject)
  {
    return this.a.invoke(null, paramArrayOfObject);
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    try
    {
      this.a.invoke(paramObject1, new Object[] { paramObject2 });
      return;
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      throw new IllegalArgumentException("Failed to setValue() with method " + n() + ": " + localIllegalAccessException.getMessage(), localIllegalAccessException);
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      throw new IllegalArgumentException("Failed to setValue() with method " + n() + ": " + localInvocationTargetException.getMessage(), localInvocationTargetException);
    }
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
    return this.a.getGenericReturnType();
  }

  public final Class<?> d()
  {
    return this.a.getReturnType();
  }

  public final Method e()
  {
    return this.a;
  }

  public final int f()
  {
    return l().length;
  }

  public final Object g()
  {
    return this.a.invoke(null, new Object[0]);
  }

  public final Class<?> h()
  {
    return this.a.getDeclaringClass();
  }

  public final Member i()
  {
    return this.a;
  }

  public final Type[] l()
  {
    return this.a.getGenericParameterTypes();
  }

  public final Class<?>[] m()
  {
    if (this.c == null)
      this.c = this.a.getParameterTypes();
    return this.c;
  }

  public final String n()
  {
    return h().getName() + "#" + b() + "(" + f() + " params)";
  }

  public final String toString()
  {
    return "[method " + b() + ", annotations: " + this.b + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mr
 * JD-Core Version:    0.6.2
 */