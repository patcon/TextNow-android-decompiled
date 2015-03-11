package com.flurry.sdk;

import java.util.Calendar;
import java.util.Date;

public abstract class iz
{
  protected final iy a;
  protected final int b;

  protected iz(iy paramiy)
  {
    this.a = paramiy;
    this.b = paramiy.i;
  }

  public iy a()
  {
    return this.a;
  }

  public abstract jh a(hj paramhj, hm paramhm, String paramString);

  public abstract jh a(sh paramsh, String paramString);

  public abstract jh a(Class<?> paramClass, hm paramhm);

  public abstract jh a(Class<?> paramClass, String paramString);

  public abstract jh a(Class<?> paramClass, String paramString1, String paramString2);

  public abstract jh a(Class<?> paramClass, Throwable paramThrowable);

  public abstract jh a(Object paramObject, String paramString);

  public sh a(Class<?> paramClass)
  {
    return this.a.b(paramClass);
  }

  public abstract Object a(Object paramObject1, is paramis, Object paramObject2);

  public abstract Calendar a(Date paramDate);

  public abstract Date a(String paramString);

  public abstract void a(re paramre);

  public abstract boolean a(hj paramhj, jg<?> paramjg, Object paramObject, String paramString);

  public boolean a(iy.a parama)
  {
    return (this.b & parama.b()) != 0;
  }

  public jc b()
  {
    return null;
  }

  public abstract jh b(Class<?> paramClass);

  public abstract jh b(Class<?> paramClass, String paramString);

  public jh b(String paramString)
  {
    return jh.a(d(), paramString);
  }

  public ha c()
  {
    return this.a.g();
  }

  public abstract jh c(Class<?> paramClass, String paramString);

  public abstract hj d();

  public final rs e()
  {
    return this.a.h();
  }

  public qs f()
  {
    return this.a.m();
  }

  public abstract re g();

  public abstract qw h();
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.iz
 * JD-Core Version:    0.6.2
 */