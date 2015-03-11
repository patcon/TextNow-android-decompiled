package com.flurry.sdk;

import java.lang.reflect.Modifier;

public abstract class sh
{
  protected final Class<?> d;
  protected final int e;
  protected Object f;
  protected Object g;

  protected sh(Class<?> paramClass, int paramInt)
  {
    this.d = paramClass;
    this.e = (paramInt + paramClass.getName().hashCode());
    this.f = null;
    this.g = null;
  }

  protected abstract sh a(Class<?> paramClass);

  public String a(int paramInt)
  {
    return null;
  }

  protected void a(Class<?> paramClass1, Class<?> paramClass2)
  {
    if (!this.d.isAssignableFrom(paramClass1))
      throw new IllegalArgumentException("Class " + paramClass1.getName() + " is not assignable to " + this.d.getName());
  }

  public sh b(int paramInt)
  {
    return null;
  }

  public abstract sh b(Class<?> paramClass);

  public boolean b()
  {
    return false;
  }

  public abstract sh c(Class<?> paramClass);

  public boolean c()
  {
    return Modifier.isAbstract(this.d.getModifiers());
  }

  public sh d(Object paramObject)
  {
    j(paramObject);
    return this;
  }

  public boolean d()
  {
    if ((0x600 & this.d.getModifiers()) == 0);
    while (this.d.isPrimitive())
      return true;
    return false;
  }

  public abstract sh e(Object paramObject);

  public boolean e()
  {
    return h() > 0;
  }

  public abstract boolean equals(Object paramObject);

  public sh f(Class<?> paramClass)
  {
    if (paramClass == this.d)
      return this;
    a(paramClass, this.d);
    sh localsh = a(paramClass);
    if (this.f != localsh.n())
      localsh = localsh.d(this.f);
    if (this.g != localsh.o())
      localsh = localsh.f(this.g);
    return localsh;
  }

  public abstract sh f(Object paramObject);

  public abstract boolean f();

  public sh g()
  {
    return null;
  }

  public sh g(Class<?> paramClass)
  {
    if (paramClass == this.d)
      return this;
    sh localsh = a(paramClass);
    if (this.f != localsh.n())
      localsh = localsh.d(this.f);
    if (this.g != localsh.o())
      localsh = localsh.f(this.g);
    return localsh;
  }

  public int h()
  {
    return 0;
  }

  public sh h(Class<?> paramClass)
  {
    if (paramClass == this.d)
      return this;
    a(this.d, paramClass);
    return i(paramClass);
  }

  public final int hashCode()
  {
    return this.e;
  }

  protected sh i(Class<?> paramClass)
  {
    return a(paramClass);
  }

  public boolean i()
  {
    return false;
  }

  @Deprecated
  public void j(Object paramObject)
  {
    if ((paramObject != null) && (this.f != null))
      throw new IllegalStateException("Trying to reset value handler for type [" + toString() + "]; old handler of type " + this.f.getClass().getName() + ", new handler of type " + paramObject.getClass().getName());
    this.f = paramObject;
  }

  public boolean j()
  {
    return false;
  }

  public sh k()
  {
    return null;
  }

  public abstract String m();

  public <T> T n()
  {
    return this.f;
  }

  public <T> T o()
  {
    return this.g;
  }

  public final Class<?> p()
  {
    return this.d;
  }

  public boolean q()
  {
    return Throwable.class.isAssignableFrom(this.d);
  }

  public final boolean r()
  {
    return this.d.isEnum();
  }

  public final boolean s()
  {
    return this.d.isInterface();
  }

  public final boolean t()
  {
    return this.d.isPrimitive();
  }

  public abstract String toString();

  public final boolean u()
  {
    return Modifier.isFinal(this.d.getModifiers());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sh
 * JD-Core Version:    0.6.2
 */