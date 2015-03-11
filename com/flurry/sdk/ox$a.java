package com.flurry.sdk;

public final class ox$a
{
  protected int a;
  protected Class<?> b;
  protected sh c;
  protected boolean d;

  public ox$a(sh paramsh, boolean paramBoolean)
  {
    this.c = paramsh;
    this.b = null;
    this.d = paramBoolean;
    this.a = a(paramsh, paramBoolean);
  }

  public ox$a(Class<?> paramClass, boolean paramBoolean)
  {
    this.b = paramClass;
    this.c = null;
    this.d = paramBoolean;
    this.a = a(paramClass, paramBoolean);
  }

  private static final int a(sh paramsh, boolean paramBoolean)
  {
    int i = -1 + paramsh.hashCode();
    if (paramBoolean)
      i--;
    return i;
  }

  private static final int a(Class<?> paramClass, boolean paramBoolean)
  {
    int i = paramClass.getName().hashCode();
    if (paramBoolean)
      i++;
    return i;
  }

  public final void a(sh paramsh)
  {
    this.c = paramsh;
    this.b = null;
    this.d = true;
    this.a = a(paramsh, true);
  }

  public final void a(Class<?> paramClass)
  {
    this.c = null;
    this.b = paramClass;
    this.d = true;
    this.a = a(paramClass, true);
  }

  public final void b(sh paramsh)
  {
    this.c = paramsh;
    this.b = null;
    this.d = false;
    this.a = a(paramsh, false);
  }

  public final void b(Class<?> paramClass)
  {
    this.c = null;
    this.b = paramClass;
    this.d = false;
    this.a = a(paramClass, false);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    a locala;
    do
    {
      return true;
      locala = (a)paramObject;
      if (locala.d != this.d)
        break label55;
      if (this.b == null)
        break;
    }
    while (locala.b == this.b);
    return false;
    return this.c.equals(locala.c);
    label55: return false;
  }

  public final int hashCode()
  {
    return this.a;
  }

  public final String toString()
  {
    if (this.b != null)
      return "{class: " + this.b.getName() + ", typed? " + this.d + "}";
    return "{type: " + this.c + ", typed? " + this.d + "}";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ox.a
 * JD-Core Version:    0.6.2
 */