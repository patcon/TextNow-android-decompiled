package com.flurry.sdk;

import java.lang.reflect.Method;
import java.util.Map;

public class of
{
  protected final Method a;
  protected final po b;

  public of(mr parammr, po parampo)
  {
    this.a = parammr.e();
    this.b = parampo;
  }

  public void a(jw paramjw)
  {
    this.b.a(paramjw);
  }

  public void a(Object paramObject, hf paramhf, jw paramjw)
  {
    Object localObject = this.a.invoke(paramObject, new Object[0]);
    if (localObject == null)
      return;
    if (!(localObject instanceof Map))
      throw new jh("Value returned by 'any-getter' (" + this.a.getName() + "()) not java.util.Map but " + localObject.getClass().getName());
    this.b.b((Map)localObject, paramhf, paramjw);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.of
 * JD-Core Version:    0.6.2
 */