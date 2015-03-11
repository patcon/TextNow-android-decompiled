package com.flurry.sdk;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class kq extends kn
{
  public static final kq h = new kq(null);
  private static final Class<?>[] j = { Throwable.class };
  protected final jb.a i;

  @Deprecated
  public kq()
  {
    this(null);
  }

  public kq(jb.a parama)
  {
    if (parama == null)
      parama = new kq.a();
    this.i = parama;
  }

  private jl c(iy paramiy, sh paramsh, is paramis)
  {
    mw localmw = (mw)paramiy.b(paramsh);
    Class localClass = paramsh.p();
    ra localra = a(localClass, paramiy);
    Iterator localIterator = localmw.o().iterator();
    while (localIterator.hasNext())
    {
      mr localmr = (mr)localIterator.next();
      if (paramiy.a().k(localmr))
      {
        if ((localmr.f() == 1) && (localmr.d().isAssignableFrom(localClass)))
        {
          if (localmr.b(0) != String.class)
            throw new IllegalArgumentException("Parameter #0 type for factory method (" + localmr + ") not suitable, must be java.lang.String");
          if (paramiy.c())
            qy.a(localmr.i());
          return mb.a(localra, localmr);
        }
        throw new IllegalArgumentException("Unsuitable method (" + localmr + ") decorated with @JsonCreator (for Enum type " + localClass.getName() + ")");
      }
    }
    return mb.a(localra);
  }

  public final jb.a a()
  {
    return this.i;
  }

  public jb a(jb.a parama)
  {
    if (this.i == parama)
      return this;
    if (getClass() != kq.class)
      throw new IllegalStateException("Subtype of BeanDeserializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalDeserializers': can not instantiate subtype with " + "additional deserializer definitions");
    return new kq(parama);
  }

  public jg<Object> a(iy paramiy, jc paramjc, sh paramsh, is paramis)
  {
    if (paramsh.c())
      paramsh = a(paramiy, paramsh);
    mw localmw1 = (mw)paramiy.b(paramsh);
    jg localjg1 = a(paramiy, localmw1.c(), paramis);
    jg localjg2;
    if (localjg1 != null)
    {
      localjg2 = localjg1;
      return localjg2;
    }
    sh localsh1 = a(paramiy, localmw1.c(), paramsh, null);
    mw localmw2;
    if (localsh1.p() != paramsh.p())
      localmw2 = (mw)paramiy.b(localsh1);
    while (true)
    {
      localjg2 = a(localsh1, paramiy, paramjc, localmw2, paramis);
      if (localjg2 != null)
        break;
      if (localsh1.q())
        return b(paramiy, localsh1, localmw2, paramis);
      if (localsh1.c())
      {
        sh localsh2 = b(paramiy, localmw2);
        if (localsh2 != null)
          return a(paramiy, localsh2, (mw)paramiy.b(localsh2), paramis);
      }
      localjg2 = d(paramiy, paramjc, localsh1, paramis);
      if (localjg2 != null)
        break;
      if (!a(localsh1.p()))
        return null;
      return a(paramiy, localsh1, localmw2, paramis);
      localmw2 = localmw1;
      localsh1 = paramsh;
    }
  }

  public jg<Object> a(iy paramiy, sh paramsh, mw parammw, is paramis)
  {
    kx localkx = a(paramiy, parammw);
    Object localObject;
    if ((paramsh.c()) && (!localkx.b()))
      localObject = new km(paramsh);
    jg localjg;
    while (true)
    {
      return localObject;
      kp localkp1 = a(parammw);
      localkp1.a(localkx);
      a(paramiy, parammw, localkp1);
      b(paramiy, parammw, localkp1);
      c(paramiy, parammw, localkp1);
      if (this.i.g())
      {
        Iterator localIterator2 = this.i.c().iterator();
        for (localkp2 = localkp1; localIterator2.hasNext(); localkp2 = ((kr)localIterator2.next()).a(paramiy, parammw, localkp2));
      }
      kp localkp2 = localkp1;
      localjg = localkp2.a(paramis);
      if (!this.i.g())
        break;
      Iterator localIterator1 = this.i.c().iterator();
      for (localObject = localjg; localIterator1.hasNext(); localObject = ((kr)localIterator1.next()).a(paramiy, parammw, (jg)localObject));
    }
    return localjg;
  }

  protected jg<?> a(qi paramqi, iy paramiy, jc paramjc, is paramis, jy paramjy, jg<?> paramjg)
  {
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext())
    {
      jg localjg = ((jd)localIterator.next()).a(paramqi, paramiy, paramjc, paramis, paramjy, paramjg);
      if (localjg != null)
        return localjg;
    }
    return null;
  }

  protected jg<?> a(qk paramqk, iy paramiy, jc paramjc, mw parammw, is paramis, jy paramjy, jg<?> paramjg)
  {
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext())
    {
      jg localjg = ((jd)localIterator.next()).a(paramqk, paramiy, paramjc, parammw, paramis, paramjy, paramjg);
      if (localjg != null)
        return localjg;
    }
    return null;
  }

  protected jg<?> a(ql paramql, iy paramiy, jc paramjc, mw parammw, is paramis, jy paramjy, jg<?> paramjg)
  {
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext())
    {
      jg localjg = ((jd)localIterator.next()).a(paramql, paramiy, paramjc, parammw, paramis, paramjy, paramjg);
      if (localjg != null)
        return localjg;
    }
    return null;
  }

  protected jg<?> a(qn paramqn, iy paramiy, jc paramjc, mw parammw, is paramis, jl paramjl, jy paramjy, jg<?> paramjg)
  {
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext())
    {
      jg localjg = ((jd)localIterator.next()).a(paramqn, paramiy, paramjc, parammw, paramis, paramjl, paramjy, paramjg);
      if (localjg != null)
        return localjg;
    }
    return null;
  }

  protected jg<?> a(qo paramqo, iy paramiy, jc paramjc, mw parammw, is paramis, jl paramjl, jy paramjy, jg<?> paramjg)
  {
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext())
    {
      jg localjg = ((jd)localIterator.next()).a(paramqo, paramiy, paramjc, parammw, paramis, paramjl, paramjy, paramjg);
      if (localjg != null)
        return localjg;
    }
    return null;
  }

  protected jg<Object> a(sh paramsh, iy paramiy, jc paramjc, mw parammw, is paramis)
  {
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext())
    {
      jg localjg = ((jd)localIterator.next()).a(paramsh, paramiy, paramjc, parammw, paramis);
      if (localjg != null)
        return localjg;
    }
    return null;
  }

  protected jg<?> a(Class<? extends hh> paramClass, iy paramiy, is paramis)
  {
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext())
    {
      jg localjg = ((jd)localIterator.next()).a(paramClass, paramiy, paramis);
      if (localjg != null)
        return localjg;
    }
    return null;
  }

  protected jg<?> a(Class<?> paramClass, iy paramiy, mw parammw, is paramis)
  {
    Iterator localIterator = this.i.a().iterator();
    while (localIterator.hasNext())
    {
      jg localjg = ((jd)localIterator.next()).a(paramClass, paramiy, parammw, paramis);
      if (localjg != null)
        return localjg;
    }
    return null;
  }

  public jl a(iy paramiy, sh paramsh, is paramis)
  {
    jl localjl1;
    if (this.i.f())
    {
      mw localmw = (mw)paramiy.c(paramsh.p());
      Iterator localIterator = this.i.b().iterator();
      while (localIterator.hasNext())
      {
        jl localjl2 = ((jm)localIterator.next()).a(paramsh, paramiy, localmw, paramis);
        if (localjl2 != null)
          localjl1 = localjl2;
      }
    }
    do
    {
      return localjl1;
      Class localClass = paramsh.p();
      if ((localClass == String.class) || (localClass == Object.class))
        return mb.a(paramiy, paramsh);
      localjl1 = (jl)c.get(paramsh);
    }
    while (localjl1 != null);
    if (paramsh.r())
      return c(paramiy, paramsh, paramis);
    return mb.b(paramiy, paramsh);
  }

  protected kp a(mw parammw)
  {
    return new kp(parammw);
  }

  protected ks a(iy paramiy, mw parammw, mr parammr)
  {
    if (paramiy.a(iy.a.f))
      parammr.k();
    sh localsh1 = parammw.j().a(parammr.b(1));
    is.a locala = new is.a(parammr.b(), localsh1, parammw.i(), parammr);
    sh localsh2 = a(paramiy, parammw, localsh1, parammr, locala);
    jg localjg = a(paramiy, parammr, locala);
    if (localjg != null)
      return new ks(locala, parammr, localsh2, localjg);
    return new ks(locala, parammr, a(paramiy, parammr, localsh2, locala.c()), null);
  }

  protected kt a(iy paramiy, mw parammw, String paramString, mp parammp)
  {
    if (paramiy.a(iy.a.f))
      parammp.k();
    sh localsh1 = parammw.j().a(parammp.c());
    is.a locala = new is.a(paramString, localsh1, parammw.i(), parammp);
    sh localsh2 = a(paramiy, parammw, localsh1, parammp, locala);
    if (localsh2 != localsh1)
      locala = locala.a(localsh2);
    jg localjg = a(paramiy, parammp, locala);
    sh localsh3 = a(paramiy, parammp, localsh2, paramString);
    Object localObject = new kt.a(paramString, localsh3, (jy)localsh3.o(), parammw.i(), parammp);
    if (localjg != null)
      localObject = ((kt)localObject).a(localjg);
    iq.a locala1 = paramiy.a().a(parammp);
    if ((locala1 != null) && (locala1.b()))
      ((kt)localObject).a(locala1.a());
    return localObject;
  }

  protected kt a(iy paramiy, mw parammw, String paramString, mr parammr)
  {
    if (paramiy.a(iy.a.f))
      parammr.k();
    sh localsh1 = parammw.j().a(parammr.b(0));
    is.a locala = new is.a(paramString, localsh1, parammw.i(), parammr);
    sh localsh2 = a(paramiy, parammw, localsh1, parammr, locala);
    if (localsh2 != localsh1)
      locala = locala.a(localsh2);
    jg localjg = a(paramiy, parammr, locala);
    sh localsh3 = a(paramiy, parammr, localsh2, paramString);
    Object localObject = new kt.d(paramString, localsh3, (jy)localsh3.o(), parammw.i(), parammr);
    if (localjg != null)
      localObject = ((kt)localObject).a(localjg);
    iq.a locala1 = paramiy.a().a(parammr);
    if ((locala1 != null) && (locala1.b()))
      ((kt)localObject).a(locala1.a());
    return localObject;
  }

  public kx a(iy paramiy, mw parammw)
  {
    mn localmn = parammw.c();
    Object localObject = paramiy.a().j(localmn);
    kx localkx1;
    if (localObject != null)
      if ((localObject instanceof kx))
        localkx1 = (kx)localObject;
    while (this.i.i())
    {
      Iterator localIterator = this.i.e().iterator();
      localkx2 = localkx1;
      ky localky;
      do
      {
        if (!localIterator.hasNext())
          break;
        localky = (ky)localIterator.next();
        localkx2 = localky.a(paramiy, parammw, localkx2);
      }
      while (localkx2 != null);
      throw new jh("Broken registered ValueInstantiators (of type " + localky.getClass().getName() + "): returned null ValueInstantiator");
      if (!(localObject instanceof Class))
        throw new IllegalStateException("Invalid value instantiator returned for type " + parammw + ": neither a Class nor ValueInstantiator");
      Class localClass = (Class)localObject;
      if (!kx.class.isAssignableFrom(localClass))
        throw new IllegalStateException("Invalid instantiator Class<?> returned for type " + parammw + ": " + localClass.getName() + " not a ValueInstantiator");
      localkx1 = paramiy.c(localmn, localClass);
      continue;
      localkx1 = c(paramiy, parammw);
    }
    kx localkx2 = localkx1;
    return localkx2;
  }

  protected lb a(iy paramiy, mw parammw, String paramString, int paramInt, mt parammt, Object paramObject)
  {
    sh localsh1 = paramiy.m().a(parammt.e(), parammw.j());
    is.a locala = new is.a(paramString, localsh1, parammw.i(), parammt);
    sh localsh2 = a(paramiy, parammw, localsh1, parammt, locala);
    if (localsh2 != localsh1)
      locala = locala.a(localsh2);
    jg localjg = a(paramiy, parammt, locala);
    sh localsh3 = a(paramiy, parammt, localsh2, paramString);
    jy localjy1 = (jy)localsh3.o();
    if (localjy1 == null);
    for (jy localjy2 = b(paramiy, localsh3, locala); ; localjy2 = localjy1)
    {
      lb locallb = new lb(paramString, localsh3, localjy2, parammw.i(), parammt, paramInt, paramObject);
      if (localjg != null)
        locallb = locallb.b(localjg);
      return locallb;
    }
  }

  public sh a(iy paramiy, sh paramsh)
  {
    while (true)
    {
      sh localsh = b(paramiy, paramsh);
      if (localsh == null)
        return paramsh;
      Class localClass1 = paramsh.p();
      Class localClass2 = localsh.p();
      if ((localClass1 == localClass2) || (!localClass1.isAssignableFrom(localClass2)))
        throw new IllegalArgumentException("Invalid abstract type resolution from " + paramsh + " to " + localsh + ": latter is not a subtype of former");
      paramsh = localsh;
    }
  }

  protected void a(iy paramiy, mw parammw, kp paramkp)
  {
    List localList = parammw.d();
    iq localiq = paramiy.a();
    Boolean localBoolean = localiq.d(parammw.c());
    if (localBoolean != null)
      paramkp.a(localBoolean.booleanValue());
    HashSet localHashSet = qw.a(localiq.c(parammw.c()));
    Iterator localIterator1 = localHashSet.iterator();
    while (localIterator1.hasNext())
      paramkp.a((String)localIterator1.next());
    mr localmr1 = parammw.l();
    if (localmr1 == null);
    for (Set localSet = parammw.f(); localSet != null; localSet = parammw.g())
    {
      Iterator localIterator4 = localSet.iterator();
      while (localIterator4.hasNext())
        paramkp.a((String)localIterator4.next());
    }
    HashMap localHashMap = new HashMap();
    Iterator localIterator2 = localList.iterator();
    while (localIterator2.hasNext())
    {
      it localit2 = (it)localIterator2.next();
      String str2 = localit2.a();
      if (!localHashSet.contains(str2))
        if (localit2.e())
        {
          paramkp.a(localit2);
        }
        else if (localit2.c())
        {
          mr localmr3 = localit2.h();
          if (a(paramiy, parammw, localmr3.a(0), localHashMap))
          {
            paramkp.a(str2);
          }
          else
          {
            kt localkt2 = a(paramiy, parammw, str2, localmr3);
            if (localkt2 != null)
              paramkp.a(localkt2);
          }
        }
        else if (localit2.d())
        {
          mp localmp = localit2.i();
          if (a(paramiy, parammw, localmp.d(), localHashMap))
          {
            paramkp.a(str2);
          }
          else
          {
            kt localkt1 = a(paramiy, parammw, str2, localmp);
            if (localkt1 != null)
              paramkp.a(localkt1);
          }
        }
    }
    if (localmr1 != null)
      paramkp.a(a(paramiy, parammw, localmr1));
    if (paramiy.a(iy.a.e))
    {
      Iterator localIterator3 = localList.iterator();
      while (localIterator3.hasNext())
      {
        it localit1 = (it)localIterator3.next();
        if (localit1.b())
        {
          String str1 = localit1.a();
          if ((!paramkp.b(str1)) && (!localHashSet.contains(str1)))
          {
            mr localmr2 = localit1.g();
            Class localClass = localmr2.d();
            if (((Collection.class.isAssignableFrom(localClass)) || (Map.class.isAssignableFrom(localClass))) && (!localHashSet.contains(str1)) && (!paramkp.b(str1)))
              paramkp.a(b(paramiy, parammw, str1, localmr2));
          }
        }
      }
    }
  }

  protected void a(iy paramiy, mw parammw, ne<?> paramne, iq paramiq, la paramla)
  {
    Iterator localIterator = parammw.n().iterator();
    while (localIterator.hasNext())
    {
      mo localmo = (mo)localIterator.next();
      int k = localmo.f();
      if (k > 0)
      {
        boolean bool1 = paramiq.k(localmo);
        boolean bool2 = paramne.a(localmo);
        if (k == 1)
        {
          a(paramiy, parammw, paramne, paramiq, paramla, localmo, bool1, bool2);
        }
        else if ((bool1) || (bool2))
        {
          Object localObject1 = null;
          int m = 0;
          int n = 0;
          lb[] arrayOflb = new lb[k];
          int i1 = 0;
          if (i1 < k)
          {
            Object localObject2 = localmo.c(i1);
            String str;
            label144: Object localObject3;
            if (localObject2 == null)
            {
              str = null;
              localObject3 = paramiq.d((mq)localObject2);
              if ((str == null) || (str.length() <= 0))
                break label214;
              m++;
              arrayOflb[i1] = a(paramiy, parammw, str, i1, (mt)localObject2, localObject3);
              localObject2 = localObject1;
            }
            while (true)
            {
              i1++;
              localObject1 = localObject2;
              break;
              str = paramiq.a((mt)localObject2);
              break label144;
              label214: if (localObject3 != null)
              {
                n++;
                arrayOflb[i1] = a(paramiy, parammw, str, i1, (mt)localObject2, localObject3);
                localObject2 = localObject1;
              }
              else if (localObject1 != null)
              {
                localObject2 = localObject1;
              }
            }
          }
          if ((bool1) || (m > 0) || (n > 0))
            if (m + n == k)
            {
              paramla.a(localmo, arrayOflb);
            }
            else
            {
              if ((m == 0) && (n + 1 == k))
                throw new IllegalArgumentException("Delegated constructor with Injectables not yet supported (see [JACKSON-712]) for " + localmo);
              throw new IllegalArgumentException("Argument #" + localObject1.g() + " of constructor " + localmo + " has no property name annotation; must have name when multiple-paramater constructor annotated as Creator");
            }
        }
      }
    }
  }

  protected boolean a(iy paramiy, mw parammw, ne<?> paramne, iq paramiq, la paramla, mo parammo, boolean paramBoolean1, boolean paramBoolean2)
  {
    mt localmt = parammo.c(0);
    String str = paramiq.a(localmt);
    Object localObject = paramiq.d(localmt);
    if ((localObject != null) || ((str != null) && (str.length() > 0)))
    {
      lb[] arrayOflb = new lb[1];
      arrayOflb[0] = a(paramiy, parammw, str, 0, localmt, localObject);
      paramla.a(parammo, arrayOflb);
      return true;
    }
    Class localClass = parammo.a(0);
    if (localClass == String.class)
    {
      if ((paramBoolean1) || (paramBoolean2))
        paramla.a(parammo);
      return true;
    }
    if ((localClass == Integer.TYPE) || (localClass == Integer.class))
    {
      if ((paramBoolean1) || (paramBoolean2))
        paramla.b(parammo);
      return true;
    }
    if ((localClass == Long.TYPE) || (localClass == Long.class))
    {
      if ((paramBoolean1) || (paramBoolean2))
        paramla.c(parammo);
      return true;
    }
    if ((localClass == Double.TYPE) || (localClass == Double.class))
    {
      if ((paramBoolean1) || (paramBoolean2))
        paramla.d(parammo);
      return true;
    }
    if (paramBoolean1)
    {
      paramla.f(parammo);
      return true;
    }
    return false;
  }

  protected boolean a(iy paramiy, mw parammw, ne<?> paramne, iq paramiq, la paramla, mr parammr, boolean paramBoolean)
  {
    Class localClass = parammr.a(0);
    if (localClass == String.class)
      if ((paramBoolean) || (paramne.a(parammr)))
        paramla.a(parammr);
    do
    {
      do
      {
        do
        {
          do
          {
            return true;
            if ((localClass != Integer.TYPE) && (localClass != Integer.class))
              break;
          }
          while ((!paramBoolean) && (!paramne.a(parammr)));
          paramla.b(parammr);
          return true;
          if ((localClass != Long.TYPE) && (localClass != Long.class))
            break;
        }
        while ((!paramBoolean) && (!paramne.a(parammr)));
        paramla.c(parammr);
        return true;
        if ((localClass != Double.TYPE) && (localClass != Double.class))
          break;
      }
      while ((!paramBoolean) && (!paramne.a(parammr)));
      paramla.d(parammr);
      return true;
      if ((localClass != Boolean.TYPE) && (localClass != Boolean.class))
        break;
    }
    while ((!paramBoolean) && (!paramne.a(parammr)));
    paramla.e(parammr);
    return true;
    if (paramiq.k(parammr))
    {
      paramla.f(parammr);
      return true;
    }
    return false;
  }

  protected boolean a(iy paramiy, mw parammw, Class<?> paramClass, Map<Class<?>, Boolean> paramMap)
  {
    Boolean localBoolean = (Boolean)paramMap.get(paramClass);
    if (localBoolean == null)
    {
      mw localmw = (mw)paramiy.c(paramClass);
      localBoolean = paramiy.a().e(localmw.c());
      if (localBoolean == null)
        localBoolean = Boolean.FALSE;
    }
    return localBoolean.booleanValue();
  }

  protected boolean a(Class<?> paramClass)
  {
    String str1 = qy.a(paramClass);
    if (str1 != null)
      throw new IllegalArgumentException("Can not deserialize Class " + paramClass.getName() + " (of type " + str1 + ") as a Bean");
    if (qy.c(paramClass))
      throw new IllegalArgumentException("Can not deserialize Proxy class " + paramClass.getName() + " as a Bean");
    String str2 = qy.a(paramClass, true);
    if (str2 != null)
      throw new IllegalArgumentException("Can not deserialize Class " + paramClass.getName() + " (of type " + str2 + ") as a Bean");
    return true;
  }

  public jg<Object> b(iy paramiy, sh paramsh, mw parammw, is paramis)
  {
    kp localkp1 = a(parammw);
    localkp1.a(a(paramiy, parammw));
    a(paramiy, parammw, localkp1);
    mr localmr = parammw.a("initCause", j);
    if (localmr != null)
    {
      kt localkt = a(paramiy, parammw, "cause", localmr);
      if (localkt != null)
        localkp1.a(localkt, true);
    }
    localkp1.a("localizedMessage");
    localkp1.a("message");
    if (this.i.g())
    {
      Iterator localIterator2 = this.i.c().iterator();
      for (localkp2 = localkp1; localIterator2.hasNext(); localkp2 = ((kr)localIterator2.next()).a(paramiy, parammw, localkp2));
    }
    kp localkp2 = localkp1;
    Object localObject1 = localkp2.a(paramis);
    if ((localObject1 instanceof ko))
      localObject1 = new mg((ko)localObject1);
    if (this.i.g())
    {
      Iterator localIterator1 = this.i.c().iterator();
      for (localObject2 = localObject1; localIterator1.hasNext(); localObject2 = ((kr)localIterator1.next()).a(paramiy, parammw, (jg)localObject2));
    }
    Object localObject2 = localObject1;
    return localObject2;
  }

  protected kt b(iy paramiy, mw parammw, String paramString, mr parammr)
  {
    if (paramiy.a(iy.a.f))
      parammr.k();
    sh localsh1 = parammr.a(parammw.j());
    jg localjg = a(paramiy, parammr, new is.a(paramString, localsh1, parammw.i(), parammr));
    sh localsh2 = a(paramiy, parammr, localsh1, paramString);
    Object localObject = new kt.f(paramString, localsh2, (jy)localsh2.o(), parammw.i(), parammr);
    if (localjg != null)
      localObject = ((kt)localObject).a(localjg);
    return localObject;
  }

  protected sh b(iy paramiy, mw parammw)
  {
    sh localsh1 = parammw.a();
    Iterator localIterator = this.i.d().iterator();
    while (localIterator.hasNext())
    {
      sh localsh2 = ((ip)localIterator.next()).b(paramiy, localsh1);
      if (localsh2 != null)
        return localsh2;
    }
    return null;
  }

  protected sh b(iy paramiy, sh paramsh)
  {
    Class localClass = paramsh.p();
    if (this.i.h())
    {
      Iterator localIterator = this.i.d().iterator();
      while (localIterator.hasNext())
      {
        sh localsh = ((ip)localIterator.next()).a(paramiy, paramsh);
        if ((localsh != null) && (localsh.p() != localClass))
          return localsh;
      }
    }
    return null;
  }

  protected void b(iy paramiy, mw parammw, kp paramkp)
  {
    Map localMap = parammw.q();
    if (localMap != null)
    {
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        String str = (String)localEntry.getKey();
        mq localmq = (mq)localEntry.getValue();
        if ((localmq instanceof mr))
          paramkp.a(str, a(paramiy, parammw, localmq.b(), (mr)localmq));
        else
          paramkp.a(str, a(paramiy, parammw, localmq.b(), (mp)localmq));
      }
    }
  }

  protected void b(iy paramiy, mw parammw, ne<?> paramne, iq paramiq, la paramla)
  {
    Iterator localIterator = parammw.o().iterator();
    while (localIterator.hasNext())
    {
      mr localmr = (mr)localIterator.next();
      int k = localmr.f();
      if (k > 0)
      {
        boolean bool = paramiq.k(localmr);
        if (k == 1)
        {
          mt localmt2 = localmr.c(0);
          String str2 = paramiq.a(localmt2);
          if ((paramiq.d(localmt2) == null) && ((str2 == null) || (str2.length() == 0)))
            a(paramiy, parammw, paramne, paramiq, paramla, localmr, bool);
        }
        else if (paramiq.k(localmr))
        {
          lb[] arrayOflb = new lb[k];
          for (int m = 0; m < k; m++)
          {
            mt localmt1 = localmr.c(m);
            String str1 = paramiq.a(localmt1);
            Object localObject = paramiq.d(localmt1);
            if (((str1 == null) || (str1.length() == 0)) && (localObject == null))
              throw new IllegalArgumentException("Argument #" + m + " of factory method " + localmr + " has no property name annotation; must have when multiple-paramater static method annotated as Creator");
            arrayOflb[m] = a(paramiy, parammw, str1, m, localmt1, localObject);
          }
          paramla.a(localmr, arrayOflb);
        }
      }
    }
  }

  protected kx c(iy paramiy, mw parammw)
  {
    boolean bool = paramiy.a(iy.a.f);
    la localla = new la(parammw, bool);
    iq localiq = paramiy.a();
    if (parammw.a().d())
    {
      mo localmo = parammw.k();
      if (localmo != null)
      {
        if (bool)
          qy.a(localmo.e());
        localla.a(localmo);
      }
    }
    ne localne1 = paramiy.e();
    ne localne2 = paramiy.a().a(parammw.c(), localne1);
    b(paramiy, parammw, localne2, localiq, localla);
    a(paramiy, parammw, localne2, localiq, localla);
    return localla.a(paramiy);
  }

  protected void c(iy paramiy, mw parammw, kp paramkp)
  {
    Map localMap = parammw.m();
    if (localMap != null)
    {
      boolean bool = paramiy.a(iy.a.f);
      Iterator localIterator = localMap.entrySet().iterator();
      while (localIterator.hasNext())
      {
        Map.Entry localEntry = (Map.Entry)localIterator.next();
        mq localmq = (mq)localEntry.getValue();
        if (bool)
          localmq.k();
        paramkp.a(localmq.b(), parammw.a(localmq.c()), parammw.i(), localmq, localEntry.getKey());
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kq
 * JD-Core Version:    0.6.2
 */