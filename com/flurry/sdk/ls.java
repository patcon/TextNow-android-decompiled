package com.flurry.sdk;

import java.util.EnumSet;

public class ls extends lz<EnumSet<?>>
{
  protected final Class<Enum> a;
  protected final jg<Enum<?>> b;

  public ls(Class<?> paramClass, jg<?> paramjg)
  {
    super(EnumSet.class);
    this.a = paramClass;
    this.b = paramjg;
  }

  private EnumSet d()
  {
    return EnumSet.noneOf(this.a);
  }

  public Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    return paramjy.b(paramhj, paramiz);
  }

  public EnumSet<?> b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      throw paramiz.b(EnumSet.class);
    EnumSet localEnumSet = d();
    while (true)
    {
      hm localhm = paramhj.b();
      if (localhm == hm.e)
        break;
      if (localhm == hm.m)
        throw paramiz.b(this.a);
      localEnumSet.add((Enum)this.b.a(paramhj, paramiz));
    }
    return localEnumSet;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ls
 * JD-Core Version:    0.6.2
 */