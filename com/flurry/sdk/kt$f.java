package com.flurry.sdk;

import java.lang.reflect.Method;

public final class kt$f extends kt
{
  protected final mr i;
  protected final Method j;

  protected kt$f(f paramf, jg<Object> paramjg)
  {
    super(paramf, paramjg);
    this.i = paramf.i;
    this.j = paramf.j;
  }

  public kt$f(String paramString, sh paramsh, jy paramjy, qv paramqv, mr parammr)
  {
    super(paramString, paramsh, paramjy, paramqv);
    this.i = parammr;
    this.j = parammr.e();
  }

  public final void a(hj paramhj, iz paramiz, Object paramObject)
  {
    if (paramhj.e() == hm.m)
      return;
    Object localObject;
    try
    {
      localObject = this.j.invoke(paramObject, new Object[0]);
      if (localObject == null)
        throw new jh("Problem deserializing 'setterless' property '" + c() + "': get method returned null");
    }
    catch (Exception localException)
    {
      a(localException);
      return;
    }
    this.d.a(paramhj, paramiz, localObject);
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    throw new UnsupportedOperationException("Should never call 'set' on setterless property");
  }

  public final f b(jg<Object> paramjg)
  {
    return new f(this, paramjg);
  }

  public final mq b()
  {
    return this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kt.f
 * JD-Core Version:    0.6.2
 */