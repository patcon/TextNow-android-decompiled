package com.flurry.sdk;

import java.lang.reflect.Method;

public final class kt$d extends kt
{
  protected final mr i;
  protected final Method j;

  protected kt$d(d paramd, jg<Object> paramjg)
  {
    super(paramd, paramjg);
    this.i = paramd.i;
    this.j = paramd.j;
  }

  public kt$d(String paramString, sh paramsh, jy paramjy, qv paramqv, mr parammr)
  {
    super(paramString, paramsh, paramjy, paramqv);
    this.i = parammr;
    this.j = parammr.e();
  }

  public final void a(hj paramhj, iz paramiz, Object paramObject)
  {
    a(paramObject, a(paramhj, paramiz));
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    try
    {
      this.j.invoke(paramObject1, new Object[] { paramObject2 });
      return;
    }
    catch (Exception localException)
    {
      a(localException, paramObject2);
    }
  }

  public final d b(jg<Object> paramjg)
  {
    return new d(this, paramjg);
  }

  public final mq b()
  {
    return this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kt.d
 * JD-Core Version:    0.6.2
 */