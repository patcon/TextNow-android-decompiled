package com.flurry.sdk;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class qm
{
  protected final Type a;
  protected final Class<?> b;
  protected final ParameterizedType c;
  protected qm d;
  protected qm e;

  public qm(Type paramType)
  {
    this.a = paramType;
    if ((paramType instanceof Class))
    {
      this.b = ((Class)paramType);
      this.c = null;
      return;
    }
    if ((paramType instanceof ParameterizedType))
    {
      this.c = ((ParameterizedType)paramType);
      this.b = ((Class)this.c.getRawType());
      return;
    }
    throw new IllegalArgumentException("Type " + paramType.getClass().getName() + " can not be used to construct HierarchicType");
  }

  private qm(Type paramType, Class<?> paramClass, ParameterizedType paramParameterizedType, qm paramqm1, qm paramqm2)
  {
    this.a = paramType;
    this.b = paramClass;
    this.c = paramParameterizedType;
    this.d = paramqm1;
    this.e = paramqm2;
  }

  public qm a()
  {
    if (this.d == null);
    for (qm localqm1 = null; ; localqm1 = this.d.a())
    {
      qm localqm2 = new qm(this.a, this.b, this.c, localqm1, null);
      if (localqm1 != null)
        localqm1.b(localqm2);
      return localqm2;
    }
  }

  public void a(qm paramqm)
  {
    this.d = paramqm;
  }

  public final qm b()
  {
    return this.d;
  }

  public void b(qm paramqm)
  {
    this.e = paramqm;
  }

  public final boolean c()
  {
    return this.c != null;
  }

  public final ParameterizedType d()
  {
    return this.c;
  }

  public final Class<?> e()
  {
    return this.b;
  }

  public String toString()
  {
    if (this.c != null)
      return this.c.toString();
    return this.b.getName();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.qm
 * JD-Core Version:    0.6.2
 */