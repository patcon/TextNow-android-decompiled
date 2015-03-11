package com.flurry.sdk;

import java.util.HashMap;

public class ly
{
  static final ly b = new ly();
  HashMap<sh, jg<Object>> a = new HashMap();

  protected ly()
  {
    a(Boolean.TYPE, new ly.b());
    a(Byte.TYPE, new ly.c());
    a(Short.TYPE, new ly.i());
    a(Integer.TYPE, new ly.g());
    a(Long.TYPE, new ly.h());
    a(Float.TYPE, new ly.f());
    a(Double.TYPE, new ly.e());
    a(String.class, new ly.j());
    a(Character.TYPE, new ly.d());
  }

  public static HashMap<sh, jg<Object>> a()
  {
    return b.a;
  }

  private void a(Class<?> paramClass, jg<?> paramjg)
  {
    this.a.put(qs.a().a(paramClass), paramjg);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly
 * JD-Core Version:    0.6.2
 */