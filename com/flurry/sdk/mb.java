package com.flurry.sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.HashMap;

public class mb
{
  protected final HashMap<sh, jl> a = new HashMap();

  protected mb()
  {
    a(new ma.a());
    a(new ma.b());
    a(new ma.d());
    a(new ma.k());
    a(new ma.i());
    a(new ma.j());
    a(new ma.h());
    a(new ma.f());
    a(new ma.e());
    a(new ma.c());
    a(new ma.o());
  }

  public static jl a(iy paramiy, sh paramsh)
  {
    return ma.n.a(paramsh.getClass());
  }

  public static jl a(ra<?> paramra)
  {
    return new ma.g(paramra, null);
  }

  public static jl a(ra<?> paramra, mr parammr)
  {
    return new ma.g(paramra, parammr);
  }

  public static HashMap<sh, jl> a()
  {
    return new mb().a;
  }

  private void a(ma paramma)
  {
    Class localClass = paramma.a();
    this.a.put(qs.a().a(localClass), paramma);
  }

  public static jl b(iy paramiy, sh paramsh)
  {
    mw localmw = (mw)paramiy.b(paramsh);
    Constructor localConstructor = localmw.a(new Class[] { String.class });
    if (localConstructor != null)
    {
      if (paramiy.a(iy.a.f))
        qy.a(localConstructor);
      return new ma.l(localConstructor);
    }
    Method localMethod = localmw.b(new Class[] { String.class });
    if (localMethod != null)
    {
      if (paramiy.a(iy.a.f))
        qy.a(localMethod);
      return new ma.m(localMethod);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mb
 * JD-Core Version:    0.6.2
 */