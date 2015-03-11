package com.flurry.sdk;

import java.util.HashMap;

public class od extends jx.a
{
  protected HashMap<qj, jk<?>> a;
  protected HashMap<qj, jk<?>> b;

  public jk<?> a(ju paramju, qk paramqk, ir paramir, is paramis, jz paramjz, jk<Object> paramjk)
  {
    return a(paramju, paramqk, paramir, paramis);
  }

  public jk<?> a(ju paramju, ql paramql, ir paramir, is paramis, jz paramjz, jk<Object> paramjk)
  {
    return a(paramju, paramql, paramir, paramis);
  }

  public jk<?> a(ju paramju, qn paramqn, ir paramir, is paramis, jk<Object> paramjk1, jz paramjz, jk<Object> paramjk2)
  {
    return a(paramju, paramqn, paramir, paramis);
  }

  public jk<?> a(ju paramju, qo paramqo, ir paramir, is paramis, jk<Object> paramjk1, jz paramjz, jk<Object> paramjk2)
  {
    return a(paramju, paramqo, paramir, paramis);
  }

  public jk<?> a(ju paramju, sh paramsh, ir paramir, is paramis)
  {
    Class localClass1 = paramsh.p();
    qj localqj = new qj(localClass1);
    jk localjk1;
    if (localClass1.isInterface())
    {
      if (this.b == null)
        break label125;
      localjk1 = (jk)this.b.get(localqj);
      if (localjk1 == null)
        break label125;
    }
    label125: 
    do
    {
      do
      {
        return localjk1;
        if (this.a == null)
          break;
        localjk1 = (jk)this.a.get(localqj);
      }
      while (localjk1 != null);
      for (Class localClass3 = localClass1; ; localClass3 = localClass3.getSuperclass())
      {
        if (localClass3 == null)
          break label125;
        localqj.a(localClass3);
        localjk1 = (jk)this.a.get(localqj);
        if (localjk1 != null)
          break;
      }
      if (this.b == null)
        break;
      localjk1 = a(localClass1, localqj);
    }
    while (localjk1 != null);
    if (!localClass1.isInterface())
    {
      Class localClass2 = localClass1;
      jk localjk2;
      do
      {
        localClass2 = localClass2.getSuperclass();
        if (localClass2 == null)
          break;
        localjk2 = a(localClass2, localqj);
      }
      while (localjk2 == null);
      return localjk2;
    }
    return null;
  }

  protected jk<?> a(Class<?> paramClass, qj paramqj)
  {
    for (Class localClass : paramClass.getInterfaces())
    {
      paramqj.a(localClass);
      jk localjk = (jk)this.b.get(paramqj);
      if (localjk != null);
      do
      {
        return localjk;
        localjk = a(localClass, paramqj);
      }
      while (localjk != null);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.od
 * JD-Core Version:    0.6.2
 */