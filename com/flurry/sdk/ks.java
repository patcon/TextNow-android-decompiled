package com.flurry.sdk;

import java.io.IOException;
import java.lang.reflect.Method;

public final class ks
{
  protected final is a;
  protected final Method b;
  protected final sh c;
  protected jg<Object> d;

  public ks(is paramis, mr parammr, sh paramsh, jg<Object> paramjg)
  {
    this(paramis, parammr.e(), paramsh, paramjg);
  }

  public ks(is paramis, Method paramMethod, sh paramsh, jg<Object> paramjg)
  {
    this.a = paramis;
    this.c = paramsh;
    this.b = paramMethod;
    this.d = paramjg;
  }

  private String d()
  {
    return this.b.getDeclaringClass().getName();
  }

  public final is a()
  {
    return this.a;
  }

  public final ks a(jg<Object> paramjg)
  {
    return new ks(this.a, this.b, this.c, paramjg);
  }

  public final Object a(hj paramhj, iz paramiz)
  {
    if (paramhj.e() == hm.m)
      return null;
    return this.d.a(paramhj, paramiz);
  }

  public final void a(hj paramhj, iz paramiz, Object paramObject, String paramString)
  {
    a(paramObject, paramString, a(paramhj, paramiz));
  }

  protected final void a(Exception paramException, String paramString, Object paramObject)
  {
    if ((paramException instanceof IllegalArgumentException))
    {
      String str1;
      StringBuilder localStringBuilder;
      if (paramObject == null)
      {
        str1 = "[NULL]";
        localStringBuilder = new StringBuilder("Problem deserializing \"any\" property '").append(paramString);
        localStringBuilder.append("' of class " + d() + " (expected type: ").append(this.c);
        localStringBuilder.append("; actual type: ").append(str1).append(")");
        String str2 = paramException.getMessage();
        if (str2 == null)
          break label139;
        localStringBuilder.append(", problem: ").append(str2);
      }
      while (true)
      {
        throw new jh(localStringBuilder.toString(), null, paramException);
        str1 = paramObject.getClass().getName();
        break;
        label139: localStringBuilder.append(" (no error message provided)");
      }
    }
    if ((paramException instanceof IOException))
      throw ((IOException)paramException);
    if ((paramException instanceof RuntimeException))
      throw ((RuntimeException)paramException);
    while (paramException.getCause() != null)
      paramException = paramException.getCause();
    throw new jh(paramException.getMessage(), null, paramException);
  }

  public final void a(Object paramObject1, String paramString, Object paramObject2)
  {
    try
    {
      this.b.invoke(paramObject1, new Object[] { paramString, paramObject2 });
      return;
    }
    catch (Exception localException)
    {
      a(localException, paramString, paramObject2);
    }
  }

  public final boolean b()
  {
    return this.d != null;
  }

  public final sh c()
  {
    return this.c;
  }

  public final String toString()
  {
    return "[any property on class " + d() + "]";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ks
 * JD-Core Version:    0.6.2
 */