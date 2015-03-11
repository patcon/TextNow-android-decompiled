package com.flurry.sdk;

public final class kv$a extends jg<Object>
{
  final jy a;
  final jg<Object> b;

  public kv$a(jy paramjy, jg<Object> paramjg)
  {
    this.a = paramjy;
    this.b = paramjg;
  }

  public final Object a(hj paramhj, iz paramiz)
  {
    return this.b.a(paramhj, paramiz, this.a);
  }

  public final Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    throw new IllegalStateException("Type-wrapped deserializer's deserializeWithType should never get called");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kv.a
 * JD-Core Version:    0.6.2
 */