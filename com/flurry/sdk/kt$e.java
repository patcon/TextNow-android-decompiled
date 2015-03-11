package com.flurry.sdk;

public final class kt$e
{
  private final Object a;
  private final boolean b;
  private final Class<?> c;

  protected kt$e(sh paramsh, Object paramObject)
  {
    this.a = paramObject;
    this.b = paramsh.t();
    this.c = paramsh.p();
  }

  public final Object a(iz paramiz)
  {
    if ((this.b) && (paramiz.a(iy.a.l)))
      throw paramiz.b("Can not map JSON null into type " + this.c.getName() + " (set DeserializationConfig.Feature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)");
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kt.e
 * JD-Core Version:    0.6.2
 */