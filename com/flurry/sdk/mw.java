package com.flurry.sdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mw extends ir
{
  protected final jn<?> b;
  protected final iq c;
  protected final mn d;
  protected qr e;
  protected final List<it> f;
  protected mr g;
  protected Map<Object, mq> h;
  protected Set<String> i;
  protected Set<String> j;
  protected mr k;
  protected mr l;

  protected mw(jn<?> paramjn, sh paramsh, mn parammn, List<it> paramList)
  {
    super(paramsh);
    this.b = paramjn;
    if (paramjn == null);
    for (iq localiq = null; ; localiq = paramjn.a())
    {
      this.c = localiq;
      this.d = parammn;
      this.f = paramList;
      return;
    }
  }

  public static mw a(jn<?> paramjn, sh paramsh, mn parammn)
  {
    return new mw(paramjn, paramsh, parammn, Collections.emptyList());
  }

  public static mw a(nc paramnc)
  {
    mw localmw = new mw(paramnc.a(), paramnc.b(), paramnc.c(), paramnc.d());
    localmw.g = paramnc.h();
    localmw.i = paramnc.i();
    localmw.j = paramnc.j();
    localmw.h = paramnc.e();
    return localmw;
  }

  public static mw b(nc paramnc)
  {
    mw localmw = new mw(paramnc.a(), paramnc.b(), paramnc.c(), paramnc.d());
    localmw.k = paramnc.f();
    localmw.l = paramnc.g();
    return localmw;
  }

  public kg.a a(kg.a parama)
  {
    if (this.c == null)
      return parama;
    return this.c.a(this.d, parama);
  }

  public mr a(String paramString, Class<?>[] paramArrayOfClass)
  {
    return this.d.a(paramString, paramArrayOfClass);
  }

  public sh a(Type paramType)
  {
    if (paramType == null)
      return null;
    return j().a(paramType);
  }

  public Object a(boolean paramBoolean)
  {
    mo localmo = this.d.h();
    if (localmo == null)
      return null;
    if (paramBoolean)
      localmo.k();
    try
    {
      Object localObject = localmo.e().newInstance(new Object[0]);
      return localObject;
      label38: Throwable localThrowable;
      while (localThrowable.getCause() != null)
        localThrowable = localThrowable.getCause();
      if ((localThrowable instanceof Error))
        throw ((Error)localThrowable);
      if ((localThrowable instanceof RuntimeException))
        throw ((RuntimeException)localThrowable);
      throw new IllegalArgumentException("Failed to instantiate bean of type " + this.d.e().getName() + ": (" + localThrowable.getClass().getName() + ") " + localThrowable.getMessage(), localThrowable);
    }
    catch (Exception localException)
    {
      break label38;
    }
  }

  public Constructor<?> a(Class<?>[] paramArrayOfClass)
  {
    Iterator localIterator = this.d.i().iterator();
    while (localIterator.hasNext())
    {
      mo localmo = (mo)localIterator.next();
      if (localmo.f() == 1)
      {
        Class localClass = localmo.a(0);
        int m = paramArrayOfClass.length;
        for (int n = 0; n < m; n++)
          if (paramArrayOfClass[n] == localClass)
            return localmo.e();
      }
    }
    return null;
  }

  protected boolean a(mr parammr)
  {
    Class localClass = parammr.d();
    if (!b().isAssignableFrom(localClass));
    do
    {
      return false;
      if (this.c.k(parammr))
        return true;
    }
    while (!"valueOf".equals(parammr.b()));
    return true;
  }

  public Method b(Class<?>[] paramArrayOfClass)
  {
    Iterator localIterator = this.d.j().iterator();
    while (localIterator.hasNext())
    {
      mr localmr = (mr)localIterator.next();
      if (a(localmr))
      {
        Class localClass = localmr.a(0);
        int m = paramArrayOfClass.length;
        for (int n = 0; n < m; n++)
          if (localClass.isAssignableFrom(paramArrayOfClass[n]))
            return localmr.e();
      }
    }
    return null;
  }

  public mn c()
  {
    return this.d;
  }

  public List<it> d()
  {
    return this.f;
  }

  public mr e()
  {
    return this.k;
  }

  public Set<String> f()
  {
    if (this.i == null)
      return Collections.emptySet();
    return this.i;
  }

  public Set<String> g()
  {
    return this.j;
  }

  public boolean h()
  {
    return this.d.g();
  }

  public qv i()
  {
    return this.d.f();
  }

  public qr j()
  {
    if (this.e == null)
      this.e = new qr(this.b.m(), this.a);
    return this.e;
  }

  public mo k()
  {
    return this.d.h();
  }

  public mr l()
  {
    if (this.g != null)
    {
      Class localClass = this.g.a(0);
      if ((localClass != String.class) && (localClass != Object.class))
        throw new IllegalArgumentException("Invalid 'any-setter' annotation on method " + this.g.b() + "(): first argument not of type String or Object, but " + localClass.getName());
    }
    return this.g;
  }

  public Map<Object, mq> m()
  {
    return this.h;
  }

  public List<mo> n()
  {
    return this.d.i();
  }

  public List<mr> o()
  {
    List localList = this.d.j();
    if (localList.isEmpty())
      return localList;
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      mr localmr = (mr)localIterator.next();
      if (a(localmr))
        localArrayList.add(localmr);
    }
    return localArrayList;
  }

  public mr p()
  {
    if ((this.l != null) && (!Map.class.isAssignableFrom(this.l.d())))
      throw new IllegalArgumentException("Invalid 'any-getter' annotation on method " + this.l.b() + "(): return type is not instance of java.util.Map");
    return this.l;
  }

  public Map<String, mq> q()
  {
    Object localObject1 = null;
    Iterator localIterator = this.f.iterator();
    while (true)
    {
      mq localmq;
      iq.a locala;
      if (localIterator.hasNext())
      {
        localmq = ((it)localIterator.next()).k();
        if (localmq != null)
        {
          locala = this.c.a(localmq);
          if ((locala != null) && (locala.c()))
            if (localObject1 != null);
        }
      }
      else
      {
        for (Object localObject2 = new HashMap(); ; localObject2 = localObject1)
        {
          String str = locala.a();
          if (((HashMap)localObject2).put(str, localmq) == null)
            break;
          throw new IllegalArgumentException("Multiple back-reference properties with name '" + str + "'");
          return localObject1;
        }
        localObject1 = localObject2;
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.mw
 * JD-Core Version:    0.6.2
 */