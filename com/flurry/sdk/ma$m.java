package com.flurry.sdk;

import java.lang.reflect.Method;

final class ma$m extends ma
{
  final Method b;

  public ma$m(Method paramMethod)
  {
    super(paramMethod.getDeclaringClass());
    this.b = paramMethod;
  }

  public final Object b(String paramString, iz paramiz)
  {
    return this.b.invoke(null, new Object[] { paramString });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.m
 * JD-Core Version:    0.6.2
 */