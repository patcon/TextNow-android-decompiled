package com.flurry.sdk;

public final class qj
  implements Comparable<qj>
{
  private String a;
  private Class<?> b;
  private int c;

  public qj()
  {
    this.b = null;
    this.a = null;
    this.c = 0;
  }

  public qj(Class<?> paramClass)
  {
    this.b = paramClass;
    this.a = paramClass.getName();
    this.c = this.a.hashCode();
  }

  public final int a(qj paramqj)
  {
    return this.a.compareTo(paramqj.a);
  }

  public final void a(Class<?> paramClass)
  {
    this.b = paramClass;
    this.a = paramClass.getName();
    this.c = this.a.hashCode();
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    do
    {
      return true;
      if (paramObject == null)
        return false;
      if (paramObject.getClass() != getClass())
        return false;
    }
    while (((qj)paramObject).b == this.b);
    return false;
  }

  public final int hashCode()
  {
    return this.c;
  }

  public final String toString()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qj
 * JD-Core Version:    0.6.2
 */