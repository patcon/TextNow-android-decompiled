package com.flurry.sdk;

import java.lang.reflect.Field;

public final class kt$a extends kt
{
  protected final mp i;
  protected final Field j;

  protected kt$a(a parama, jg<Object> paramjg)
  {
    super(parama, paramjg);
    this.i = parama.i;
    this.j = parama.j;
  }

  public kt$a(String paramString, sh paramsh, jy paramjy, qv paramqv, mp parammp)
  {
    super(paramString, paramsh, paramjy, paramqv);
    this.i = parammp;
    this.j = parammp.e();
  }

  public final void a(hj paramhj, iz paramiz, Object paramObject)
  {
    a(paramObject, a(paramhj, paramiz));
  }

  public final void a(Object paramObject1, Object paramObject2)
  {
    try
    {
      this.j.set(paramObject1, paramObject2);
      return;
    }
    catch (Exception localException)
    {
      a(localException, paramObject2);
    }
  }

  public final a b(jg<Object> paramjg)
  {
    return new a(this, paramjg);
  }

  public final mq b()
  {
    return this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kt.a
 * JD-Core Version:    0.6.2
 */