package com.flurry.sdk;

import java.lang.reflect.Constructor;

final class ma$l extends ma
{
  protected final Constructor<?> b;

  public ma$l(Constructor<?> paramConstructor)
  {
    super(paramConstructor.getDeclaringClass());
    this.b = paramConstructor;
  }

  public final Object b(String paramString, iz paramiz)
  {
    return this.b.newInstance(new Object[] { paramString });
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ma.l
 * JD-Core Version:    0.6.2
 */