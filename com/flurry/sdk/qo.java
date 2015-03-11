package com.flurry.sdk;

public final class qo extends qn
{
  private qo(Class<?> paramClass, sh paramsh1, sh paramsh2, Object paramObject1, Object paramObject2)
  {
    super(paramClass, paramsh1, paramsh2, paramObject1, paramObject2);
  }

  public static qo a(Class<?> paramClass, sh paramsh1, sh paramsh2)
  {
    return new qo(paramClass, paramsh1, paramsh2, null, null);
  }

  protected final sh a(Class<?> paramClass)
  {
    return new qo(paramClass, this.a, this.b, this.f, this.g);
  }

  public final sh b(Class<?> paramClass)
  {
    if (paramClass == this.b.p())
      return this;
    return new qo(this.d, this.a, this.b.f(paramClass), this.f, this.g);
  }

  public final sh c(Class<?> paramClass)
  {
    if (paramClass == this.b.p())
      return this;
    return new qo(this.d, this.a, this.b.h(paramClass), this.f, this.g);
  }

  public final sh d(Class<?> paramClass)
  {
    if (paramClass == this.a.p())
      return this;
    return new qo(this.d, this.a.f(paramClass), this.b, this.f, this.g);
  }

  public final sh e(Class<?> paramClass)
  {
    if (paramClass == this.a.p())
      return this;
    return new qo(this.d, this.a.h(paramClass), this.b, this.f, this.g);
  }

  public final qo g(Object paramObject)
  {
    return new qo(this.d, this.a, this.b, this.f, paramObject);
  }

  public final qo h(Object paramObject)
  {
    return new qo(this.d, this.a, this.b.f(paramObject), this.f, this.g);
  }

  public final qo i(Object paramObject)
  {
    return new qo(this.d, this.a, this.b, paramObject, this.g);
  }

  public final String toString()
  {
    return "[map type; class " + this.d.getName() + ", " + this.a + " -> " + this.b + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qo
 * JD-Core Version:    0.6.2
 */