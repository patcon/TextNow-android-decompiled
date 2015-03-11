package com.flurry.sdk;

public class lb extends kt
{
  protected final mt i;
  protected final Object j;

  protected lb(lb paramlb, jg<Object> paramjg)
  {
    super(paramlb, paramjg);
    this.i = paramlb.i;
    this.j = paramlb.j;
  }

  public lb(String paramString, sh paramsh, jy paramjy, qv paramqv, mt parammt, int paramInt, Object paramObject)
  {
    super(paramString, paramsh, paramjy, paramqv);
    this.i = parammt;
    this.h = paramInt;
    this.j = paramObject;
  }

  public void a(hj paramhj, iz paramiz, Object paramObject)
  {
    a(paramObject, a(paramhj, paramiz));
  }

  public void a(Object paramObject1, Object paramObject2)
  {
  }

  public lb b(jg<Object> paramjg)
  {
    return new lb(this, paramjg);
  }

  public mq b()
  {
    return this.i;
  }

  public Object k()
  {
    return this.j;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lb
 * JD-Core Version:    0.6.2
 */