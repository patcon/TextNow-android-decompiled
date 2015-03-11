package com.flurry.sdk;

import java.lang.reflect.Array;

public final class qi extends qq
{
  protected final sh a;
  protected final Object b;

  private qi(sh paramsh, Object paramObject1, Object paramObject2, Object paramObject3)
  {
    super(paramObject1.getClass(), paramsh.hashCode(), paramObject2, paramObject3);
    this.a = paramsh;
    this.b = paramObject1;
  }

  public static qi a(sh paramsh, Object paramObject1, Object paramObject2)
  {
    return new qi(paramsh, Array.newInstance(paramsh.p(), 0), null, null);
  }

  public final qi a(Object paramObject)
  {
    if (paramObject == this.g)
      return this;
    return new qi(this.a, this.b, this.f, paramObject);
  }

  protected final sh a(Class<?> paramClass)
  {
    if (!paramClass.isArray())
      throw new IllegalArgumentException("Incompatible narrowing operation: trying to narrow " + toString() + " to class " + paramClass.getName());
    Class localClass = paramClass.getComponentType();
    return a(qs.a().a(localClass), this.f, this.g);
  }

  protected final String a()
  {
    return this.d.getName();
  }

  public final String a(int paramInt)
  {
    if (paramInt == 0)
      return "E";
    return null;
  }

  public final qi b(Object paramObject)
  {
    if (paramObject == this.a.o())
      return this;
    return new qi(this.a.f(paramObject), this.b, this.f, this.g);
  }

  public final sh b(int paramInt)
  {
    if (paramInt == 0)
      return this.a;
    return null;
  }

  public final sh b(Class<?> paramClass)
  {
    if (paramClass == this.a.p())
      return this;
    return a(this.a.f(paramClass), this.f, this.g);
  }

  public final boolean b()
  {
    return true;
  }

  public final qi c(Object paramObject)
  {
    if (paramObject == this.f)
      return this;
    return new qi(this.a, this.b, paramObject, this.g);
  }

  public final sh c(Class<?> paramClass)
  {
    if (paramClass == this.a.p())
      return this;
    return a(this.a.h(paramClass), this.f, this.g);
  }

  public final boolean c()
  {
    return false;
  }

  public final boolean d()
  {
    return true;
  }

  public final boolean e()
  {
    return this.a.e();
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool;
    if (paramObject == this)
      bool = true;
    Class localClass1;
    Class localClass2;
    do
    {
      do
      {
        return bool;
        bool = false;
      }
      while (paramObject == null);
      localClass1 = paramObject.getClass();
      localClass2 = getClass();
      bool = false;
    }
    while (localClass1 != localClass2);
    qi localqi = (qi)paramObject;
    return this.a.equals(localqi.a);
  }

  public final boolean f()
  {
    return true;
  }

  public final sh g()
  {
    return this.a;
  }

  public final int h()
  {
    return 1;
  }

  public final String toString()
  {
    return "[array type, component type: " + this.a + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qi
 * JD-Core Version:    0.6.2
 */