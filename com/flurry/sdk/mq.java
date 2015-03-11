package com.flurry.sdk;

import java.lang.reflect.Member;

public abstract class mq extends mm
{
  protected final mv b;

  protected mq(mv parammv)
  {
    this.b = parammv;
  }

  public abstract void a(Object paramObject1, Object paramObject2);

  public abstract Class<?> h();

  public abstract Member i();

  protected mv j()
  {
    return this.b;
  }

  public final void k()
  {
    qy.a(i());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mq
 * JD-Core Version:    0.6.2
 */