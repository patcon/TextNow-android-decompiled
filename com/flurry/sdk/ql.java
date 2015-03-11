package com.flurry.sdk;

public final class ql extends qk
{
  private ql(Class<?> paramClass, sh paramsh, Object paramObject1, Object paramObject2)
  {
    super(paramClass, paramsh, paramObject1, paramObject2);
  }

  public static ql a(Class<?> paramClass, sh paramsh)
  {
    return new ql(paramClass, paramsh, null, null);
  }

  protected final sh a(Class<?> paramClass)
  {
    return new ql(paramClass, this.a, null, null);
  }

  public final sh b(Class<?> paramClass)
  {
    if (paramClass == this.a.p())
      return this;
    return new ql(this.d, this.a.f(paramClass), this.f, this.g);
  }

  public final sh c(Class<?> paramClass)
  {
    if (paramClass == this.a.p())
      return this;
    return new ql(this.d, this.a.h(paramClass), this.f, this.g);
  }

  public final ql g(Object paramObject)
  {
    return new ql(this.d, this.a, this.f, paramObject);
  }

  public final ql h(Object paramObject)
  {
    return new ql(this.d, this.a.f(paramObject), this.f, this.g);
  }

  public final ql i(Object paramObject)
  {
    return new ql(this.d, this.a, paramObject, this.g);
  }

  public final String toString()
  {
    return "[collection type; class " + this.d.getName() + ", contains " + this.a + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ql
 * JD-Core Version:    0.6.2
 */