package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JsonTypeInfo.As;

public class np extends nv
{
  public np(sh paramsh, nh paramnh, is paramis, Class<?> paramClass)
  {
    super(paramsh, paramnh, paramis, null);
  }

  private final Object e(hj paramhj, iz paramiz)
  {
    if (paramhj.e() != hm.b)
      throw paramiz.a(paramhj, hm.b, "need JSON Object to contain As.WRAPPER_OBJECT type information for class " + c());
    if (paramhj.b() != hm.f)
      throw paramiz.a(paramhj, hm.f, "need JSON String that contains type id (for subtype of " + c() + ")");
    jg localjg = a(paramiz, paramhj.k());
    paramhj.b();
    Object localObject = localjg.a(paramhj, paramiz);
    if (paramhj.b() != hm.c)
      throw paramiz.a(paramhj, hm.c, "expected closing END_OBJECT after type information and deserialized value");
    return localObject;
  }

  public JsonTypeInfo.As a()
  {
    return JsonTypeInfo.As.WRAPPER_OBJECT;
  }

  public Object a(hj paramhj, iz paramiz)
  {
    return e(paramhj, paramiz);
  }

  public Object b(hj paramhj, iz paramiz)
  {
    return e(paramhj, paramiz);
  }

  public Object c(hj paramhj, iz paramiz)
  {
    return e(paramhj, paramiz);
  }

  public Object d(hj paramhj, iz paramiz)
  {
    return e(paramhj, paramiz);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.np
 * JD-Core Version:    0.6.2
 */