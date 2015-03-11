package com.flurry.sdk;

import com.flurry.org.codehaus.jackson.annotate.JsonTypeInfo.As;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@kc
public class ko extends lz<Object>
  implements js
{
  protected final mn a;
  protected final sh b;
  protected final is c;
  protected final kx d;
  protected jg<Object> e;
  protected final ld f;
  protected boolean g;
  protected final kz h;
  protected final lh[] i;
  protected ks j;
  protected final HashSet<String> k;
  protected final boolean l;
  protected final Map<String, kt> m;
  protected HashMap<qj, jg<Object>> n;
  protected lg o;
  protected lc p;

  public ko(ir paramir, is paramis, kx paramkx, kz paramkz, Map<String, kt> paramMap, HashSet<String> paramHashSet, boolean paramBoolean, ks paramks, List<lh> paramList)
  {
    this(paramir.c(), paramir.a(), paramis, paramkx, paramkz, paramMap, paramHashSet, paramBoolean, paramks, paramList);
  }

  protected ko(ko paramko)
  {
    this(paramko, paramko.l);
  }

  protected ko(ko paramko, boolean paramBoolean)
  {
    super(paramko.b);
    this.a = paramko.a;
    this.b = paramko.b;
    this.c = paramko.c;
    this.d = paramko.d;
    this.e = paramko.e;
    this.f = paramko.f;
    this.h = paramko.h;
    this.m = paramko.m;
    this.k = paramko.k;
    this.l = paramBoolean;
    this.j = paramko.j;
    this.i = paramko.i;
    this.g = paramko.g;
    this.o = paramko.o;
  }

  protected ko(mn parammn, sh paramsh, is paramis, kx paramkx, kz paramkz, Map<String, kt> paramMap, HashSet<String> paramHashSet, boolean paramBoolean, ks paramks, List<lh> paramList)
  {
    super(paramsh);
    this.a = parammn;
    this.b = paramsh;
    this.c = paramis;
    this.d = paramkx;
    lh[] arrayOflh;
    if (paramkx.j())
    {
      this.f = new ld(paramkx);
      this.h = paramkz;
      this.m = paramMap;
      this.k = paramHashSet;
      this.l = paramBoolean;
      this.j = paramks;
      arrayOflh = null;
      if (paramList != null)
      {
        boolean bool2 = paramList.isEmpty();
        arrayOflh = null;
        if (!bool2)
          break label156;
      }
      label102: this.i = arrayOflh;
      if ((!paramkx.i()) && (this.f == null) && (paramkx.h()) && (this.o == null))
        break label181;
    }
    label156: label181: for (boolean bool1 = true; ; bool1 = false)
    {
      this.g = bool1;
      return;
      this.f = null;
      break;
      arrayOflh = (lh[])paramList.toArray(new lh[paramList.size()]);
      break label102;
    }
  }

  private final void b(hj paramhj, iz paramiz, Object paramObject, String paramString)
  {
    if ((this.k != null) && (this.k.contains(paramString)))
    {
      paramhj.d();
      return;
    }
    if (this.j != null)
      try
      {
        this.j.a(paramhj, paramiz, paramObject, paramString);
        return;
      }
      catch (Exception localException)
      {
        a(localException, paramObject, paramString, paramiz);
        return;
      }
    a(paramhj, paramiz, paramObject, paramString);
  }

  public jg<Object> a()
  {
    if (getClass() != ko.class)
      return this;
    return new ko(this, true);
  }

  protected kt a(iy paramiy, kt paramkt)
  {
    String str = paramkt.e();
    if (str == null)
      return paramkt;
    jg localjg1 = paramkt.h();
    boolean bool = false;
    kt localkt;
    if ((localjg1 instanceof ko))
      localkt = ((ko)localjg1).a(str);
    while (localkt == null)
    {
      throw new IllegalArgumentException("Can not handle managed/back reference '" + str + "': no back reference property found from type " + paramkt.a());
      if ((localjg1 instanceof lo))
      {
        jg localjg2 = ((lo)localjg1).d();
        if (!(localjg2 instanceof ko))
          throw new IllegalArgumentException("Can not handle managed/back reference '" + str + "': value deserializer is of type ContainerDeserializerBase, but content type is not handled by a BeanDeserializer " + " (instead it's of type " + localjg2.getClass().getName() + ")");
        localkt = ((ko)localjg2).a(str);
        bool = true;
      }
      else
      {
        if ((localjg1 instanceof km))
          throw new IllegalArgumentException("Can not handle managed/back reference for abstract types (property " + this.b.p().getName() + "." + paramkt.c() + ")");
        throw new IllegalArgumentException("Can not handle managed/back reference '" + str + "': type for value deserializer is not BeanDeserializer or ContainerDeserializerBase, but " + localjg1.getClass().getName());
      }
    }
    sh localsh1 = this.b;
    sh localsh2 = localkt.a();
    if (!localsh2.p().isAssignableFrom(localsh1.p()))
      throw new IllegalArgumentException("Can not handle managed/back reference '" + str + "': back reference type (" + localsh2.p().getName() + ") not compatible with managed type (" + localsh1.p().getName() + ")");
    return new kt.c(str, paramkt, localkt, this.a.f(), bool);
  }

  public kt a(String paramString)
  {
    if (this.m == null)
      return null;
    return (kt)this.m.get(paramString);
  }

  public final Object a(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.b)
    {
      paramhj.b();
      return b(paramhj, paramiz);
    }
    switch (1.a[localhm.ordinal()])
    {
    default:
      throw paramiz.b(d());
    case 1:
      return d(paramhj, paramiz);
    case 2:
      return e(paramhj, paramiz);
    case 3:
      return f(paramhj, paramiz);
    case 4:
      return paramhj.z();
    case 5:
    case 6:
      return g(paramhj, paramiz);
    case 7:
      return h(paramhj, paramiz);
    case 8:
    case 9:
    }
    return b(paramhj, paramiz);
  }

  public Object a(hj paramhj, iz paramiz, jy paramjy)
  {
    return paramjy.a(paramhj, paramiz);
  }

  public Object a(hj paramhj, iz paramiz, Object paramObject)
  {
    if (this.i != null)
      a(paramiz, paramObject);
    if (this.o != null)
      paramObject = b(paramhj, paramiz, paramObject);
    hm localhm;
    do
    {
      return paramObject;
      if (this.p != null)
        return c(paramhj, paramiz, paramObject);
      localhm = paramhj.e();
      if (localhm == hm.b)
        localhm = paramhj.b();
    }
    while (localhm != hm.f);
    String str = paramhj.g();
    paramhj.b();
    kt localkt = this.h.a(str);
    if (localkt != null);
    while (true)
    {
      try
      {
        localkt.a(paramhj, paramiz, paramObject);
        localhm = paramhj.b();
      }
      catch (Exception localException)
      {
        a(localException, paramObject, str, paramiz);
        continue;
      }
      if ((this.k != null) && (this.k.contains(str)))
        paramhj.d();
      else if (this.j != null)
        this.j.a(paramhj, paramiz, paramObject, str);
      else
        a(paramhj, paramiz, paramObject, str);
    }
  }

  protected Object a(hj paramhj, iz paramiz, Object paramObject, sq paramsq)
  {
    jg localjg = b(paramiz, paramObject, paramsq);
    hj localhj;
    if (localjg != null)
    {
      if (paramsq == null)
        break label101;
      paramsq.e();
      localhj = paramsq.h();
      localhj.b();
    }
    label101: for (Object localObject = localjg.a(localhj, paramiz, paramObject); ; localObject = paramObject)
    {
      if (paramhj != null)
        localObject = localjg.a(paramhj, paramiz, localObject);
      while (true)
      {
        return localObject;
        if (paramsq != null);
        for (localObject = a(paramiz, paramObject, paramsq); paramhj != null; localObject = paramObject)
          return a(paramhj, paramiz, localObject);
      }
    }
  }

  protected Object a(iz paramiz, Object paramObject, sq paramsq)
  {
    paramsq.e();
    hj localhj = paramsq.h();
    while (localhj.b() != hm.c)
    {
      String str = localhj.g();
      localhj.b();
      a(localhj, paramiz, paramObject, str);
    }
    return paramObject;
  }

  protected void a(hj paramhj, iz paramiz, Object paramObject, String paramString)
  {
    if ((this.l) || ((this.k != null) && (this.k.contains(paramString))))
    {
      paramhj.d();
      return;
    }
    super.a(paramhj, paramiz, paramObject, paramString);
  }

  public void a(iy paramiy, jc paramjc)
  {
    Iterator localIterator1 = this.h.c();
    Object localObject1 = null;
    lg locallg = null;
    kt localkt2;
    if (localIterator1.hasNext())
    {
      localkt2 = (kt)localIterator1.next();
      if (localkt2.f())
        break label493;
    }
    label493: for (kt localkt3 = localkt2.a(a(paramiy, paramjc, localkt2.a(), localkt2)); ; localkt3 = localkt2)
    {
      kt localkt4 = a(paramiy, localkt3);
      kt localkt5 = b(paramiy, localkt4);
      if (localkt5 != null)
      {
        if (locallg == null)
          locallg = new lg();
        locallg.a(localkt5);
      }
      while (true)
      {
        kt localkt6 = c(paramiy, localkt5);
        if (localkt6 != localkt2)
          this.h.a(localkt6);
        if (!localkt6.g())
          break;
        jy localjy = localkt6.i();
        if (localjy.a() != JsonTypeInfo.As.EXTERNAL_PROPERTY)
          break;
        if (localObject1 == null);
        for (Object localObject2 = new lc.a(); ; localObject2 = localObject1)
        {
          ((lc.a)localObject2).a(localkt6, localjy.b());
          this.h.b(localkt6);
          localObject1 = localObject2;
          break;
          if ((this.j != null) && (!this.j.b()))
            this.j = this.j.a(a(paramiy, paramjc, this.j.c(), this.j.a()));
          if (this.d.i())
          {
            sh localsh = this.d.l();
            if (localsh == null)
              throw new IllegalArgumentException("Invalid delegate-creator definition for " + this.b + ": value instantiator (" + this.d.getClass().getName() + ") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'");
            mu localmu = this.d.o();
            this.e = a(paramiy, paramjc, localsh, new is.a(null, localsh, this.a.f(), localmu));
          }
          if (this.f != null)
          {
            Iterator localIterator2 = this.f.a().iterator();
            while (localIterator2.hasNext())
            {
              kt localkt1 = (kt)localIterator2.next();
              if (!localkt1.f())
                this.f.a(localkt1, a(paramiy, paramjc, localkt1.a(), localkt1));
            }
          }
          if (localObject1 != null)
          {
            this.p = localObject1.a();
            this.g = true;
          }
          this.o = locallg;
          if (locallg != null)
            this.g = true;
          return;
        }
        localkt5 = localkt4;
      }
    }
  }

  protected void a(iz paramiz, Object paramObject)
  {
    lh[] arrayOflh = this.i;
    int i1 = arrayOflh.length;
    for (int i2 = 0; i2 < i1; i2++)
      arrayOflh[i2].b(paramiz, paramObject);
  }

  protected void a(Throwable paramThrowable, iz paramiz)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if ((paramiz == null) || (paramiz.a(iy.a.n)));
    for (int i1 = 1; (localThrowable instanceof IOException); i1 = 0)
      throw ((IOException)localThrowable);
    if ((i1 == 0) && ((localThrowable instanceof RuntimeException)))
      throw ((RuntimeException)localThrowable);
    throw paramiz.a(this.b.p(), localThrowable);
  }

  public void a(Throwable paramThrowable, Object paramObject, String paramString, iz paramiz)
  {
    for (Throwable localThrowable = paramThrowable; ((localThrowable instanceof InvocationTargetException)) && (localThrowable.getCause() != null); localThrowable = localThrowable.getCause());
    if ((localThrowable instanceof Error))
      throw ((Error)localThrowable);
    if ((paramiz == null) || (paramiz.a(iy.a.n)));
    for (int i1 = 1; (localThrowable instanceof IOException); i1 = 0)
    {
      if ((i1 != 0) && ((localThrowable instanceof jh)))
        break label114;
      throw ((IOException)localThrowable);
    }
    if ((i1 == 0) && ((localThrowable instanceof RuntimeException)))
      throw ((RuntimeException)localThrowable);
    label114: throw jh.a(localThrowable, paramObject, paramString);
  }

  protected jg<Object> b(iz paramiz, Object paramObject, sq paramsq)
  {
    Object localObject2;
    try
    {
      if (this.n == null);
      for (localObject2 = null; ; localObject2 = (jg)this.n.get(new qj(paramObject.getClass())))
      {
        if (localObject2 == null)
          break;
        return localObject2;
      }
    }
    finally
    {
    }
    jc localjc = paramiz.b();
    if (localjc != null)
    {
      sh localsh = paramiz.a(paramObject.getClass());
      localObject2 = localjc.a(paramiz.a(), localsh, this.c);
      if (localObject2 != null)
        try
        {
          if (this.n == null)
            this.n = new HashMap();
          this.n.put(new qj(paramObject.getClass()), localObject2);
          return localObject2;
        }
        finally
        {
        }
    }
    return localObject2;
  }

  protected kt b(iy paramiy, kt paramkt)
  {
    mq localmq = paramkt.b();
    if ((localmq != null) && (paramiy.a().b(localmq) == Boolean.TRUE))
    {
      jg localjg1 = paramkt.h();
      jg localjg2 = localjg1.a();
      if ((localjg2 != localjg1) && (localjg2 != null))
        return paramkt.a(localjg2);
    }
    return null;
  }

  public Object b(hj paramhj, iz paramiz)
  {
    Object localObject;
    if (this.g)
      if (this.o != null)
        localObject = j(paramhj, paramiz);
    do
    {
      return localObject;
      if (this.p != null)
        return l(paramhj, paramiz);
      return c(paramhj, paramiz);
      localObject = this.d.m();
      if (this.i != null)
        a(paramiz, localObject);
    }
    while (paramhj.e() == hm.c);
    String str = paramhj.g();
    paramhj.b();
    kt localkt = this.h.a(str);
    if (localkt != null);
    while (true)
    {
      try
      {
        localkt.a(paramhj, paramiz, localObject);
        paramhj.b();
      }
      catch (Exception localException)
      {
        a(localException, localObject, str, paramiz);
        continue;
      }
      b(paramhj, paramiz, localObject, str);
    }
  }

  protected Object b(hj paramhj, iz paramiz, Object paramObject)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.b)
      localhm = paramhj.b();
    sq localsq = new sq(paramhj.a());
    localsq.d();
    if (localhm == hm.f)
    {
      String str = paramhj.g();
      kt localkt = this.h.a(str);
      paramhj.b();
      if (localkt != null);
      while (true)
      {
        try
        {
          localkt.a(paramhj, paramiz, paramObject);
          localhm = paramhj.b();
        }
        catch (Exception localException)
        {
          a(localException, paramObject, str, paramiz);
          continue;
        }
        if ((this.k != null) && (this.k.contains(str)))
        {
          paramhj.d();
        }
        else
        {
          localsq.a(str);
          localsq.c(paramhj);
          if (this.j != null)
            this.j.a(paramhj, paramiz, paramObject, str);
        }
      }
    }
    localsq.e();
    this.o.a(paramhj, paramiz, paramObject, localsq);
    return paramObject;
  }

  protected kt c(iy paramiy, kt paramkt)
  {
    jg localjg = paramkt.h();
    Class localClass2;
    Constructor[] arrayOfConstructor;
    int i1;
    if (((localjg instanceof ko)) && (!((ko)localjg).e().h()))
    {
      Class localClass1 = paramkt.a().p();
      localClass2 = qy.b(localClass1);
      if ((localClass2 != null) && (localClass2 == this.b.p()))
      {
        arrayOfConstructor = localClass1.getConstructors();
        i1 = arrayOfConstructor.length;
      }
    }
    for (int i2 = 0; ; i2++)
      if (i2 < i1)
      {
        Constructor localConstructor = arrayOfConstructor[i2];
        Class[] arrayOfClass = localConstructor.getParameterTypes();
        if ((arrayOfClass.length == 1) && (arrayOfClass[0] == localClass2))
        {
          if (paramiy.a(iy.a.f))
            qy.a(localConstructor);
          paramkt = new kt.b(paramkt, localConstructor);
        }
      }
      else
      {
        return paramkt;
      }
  }

  protected Object c(hj paramhj, iz paramiz)
  {
    if (this.e != null)
      return this.d.a(this.e.a(paramhj, paramiz));
    if (this.f != null)
      return i(paramhj, paramiz);
    if (this.b.c())
      throw jh.a(paramhj, "Can not instantiate abstract type " + this.b + " (need to add/enable type information?)");
    throw jh.a(paramhj, "No suitable constructor found for type " + this.b + ": can not instantiate from JSON object (need to add/enable type information?)");
  }

  protected Object c(hj paramhj, iz paramiz, Object paramObject)
  {
    lc locallc = this.p.a();
    if (paramhj.e() != hm.c)
    {
      String str = paramhj.g();
      paramhj.b();
      kt localkt = this.h.a(str);
      if (localkt != null);
      while (true)
      {
        try
        {
          localkt.a(paramhj, paramiz, paramObject);
          paramhj.b();
        }
        catch (Exception localException2)
        {
          a(localException2, paramObject, str, paramiz);
          continue;
        }
        if ((this.k != null) && (this.k.contains(str)))
          paramhj.d();
        else if (!locallc.a(paramhj, paramiz, str, paramObject))
          if (this.j != null)
            try
            {
              this.j.a(paramhj, paramiz, paramObject, str);
            }
            catch (Exception localException1)
            {
              a(localException1, paramObject, str, paramiz);
            }
          else
            a(paramhj, paramiz, paramObject, str);
      }
    }
    return locallc.a(paramhj, paramiz, paramObject);
  }

  public final Class<?> d()
  {
    return this.b.p();
  }

  public Object d(hj paramhj, iz paramiz)
  {
    if ((this.e != null) && (!this.d.c()))
    {
      Object localObject = this.d.a(this.e.a(paramhj, paramiz));
      if (this.i != null)
        a(paramiz, localObject);
      return localObject;
    }
    return this.d.a(paramhj.k());
  }

  public kx e()
  {
    return this.d;
  }

  public Object e(hj paramhj, iz paramiz)
  {
    Object localObject;
    switch (1.b[paramhj.q().ordinal()])
    {
    default:
      if (this.e == null)
        break label193;
      localObject = this.d.a(this.e.a(paramhj, paramiz));
      if (this.i != null)
        a(paramiz, localObject);
      break;
    case 1:
    case 2:
    }
    do
    {
      do
      {
        return localObject;
        if ((this.e == null) || (this.d.d()))
          break;
        localObject = this.d.a(this.e.a(paramhj, paramiz));
      }
      while (this.i == null);
      a(paramiz, localObject);
      return localObject;
      return this.d.a(paramhj.t());
      if ((this.e == null) || (this.d.d()))
        break;
      localObject = this.d.a(this.e.a(paramhj, paramiz));
    }
    while (this.i == null);
    a(paramiz, localObject);
    return localObject;
    return this.d.a(paramhj.u());
    label193: throw paramiz.a(d(), "no suitable creator method found to deserialize from JSON integer number");
  }

  public Object f(hj paramhj, iz paramiz)
  {
    Object localObject;
    switch (1.b[paramhj.q().ordinal()])
    {
    default:
      if (this.e != null)
        localObject = this.d.a(this.e.a(paramhj, paramiz));
      break;
    case 3:
    case 4:
      do
      {
        return localObject;
        if ((this.e == null) || (this.d.f()))
          break;
        localObject = this.d.a(this.e.a(paramhj, paramiz));
      }
      while (this.i == null);
      a(paramiz, localObject);
      return localObject;
      return this.d.a(paramhj.x());
    }
    throw paramiz.a(d(), "no suitable creator method found to deserialize from JSON floating-point number");
  }

  public Object g(hj paramhj, iz paramiz)
  {
    if ((this.e != null) && (!this.d.g()))
    {
      Object localObject = this.d.a(this.e.a(paramhj, paramiz));
      if (this.i != null)
        a(paramiz, localObject);
      return localObject;
    }
    if (paramhj.e() == hm.k);
    for (boolean bool = true; ; bool = false)
      return this.d.a(bool);
  }

  public Object h(hj paramhj, iz paramiz)
  {
    if (this.e != null)
      try
      {
        Object localObject = this.d.a(this.e.a(paramhj, paramiz));
        if (this.i != null)
          a(paramiz, localObject);
        return localObject;
      }
      catch (Exception localException)
      {
        a(localException, paramiz);
      }
    throw paramiz.b(d());
  }

  protected final Object i(hj paramhj, iz paramiz)
  {
    ld localld = this.f;
    lf locallf = localld.a(paramhj, paramiz);
    hm localhm = paramhj.e();
    sq localsq = null;
    String str;
    Object localObject3;
    while (true)
      if (localhm == hm.f)
      {
        str = paramhj.g();
        paramhj.b();
        kt localkt1 = localld.a(str);
        if (localkt1 != null)
        {
          Object localObject2 = localkt1.a(paramhj, paramiz);
          if (locallf.a(localkt1.j(), localObject2))
          {
            paramhj.b();
            try
            {
              localObject3 = localld.a(locallf);
              if (localObject3.getClass() == this.b.p())
                break label144;
              return a(paramhj, paramiz, localObject3, localsq);
            }
            catch (Exception localException2)
            {
              a(localException2, this.b.p(), str, paramiz);
            }
          }
          else
          {
            localhm = paramhj.b();
            continue;
          }
          label144: if (localsq == null)
            break label356;
        }
      }
    label353: label356: for (Object localObject4 = a(paramiz, localObject3, localsq); ; localObject4 = localObject3)
    {
      return a(paramhj, paramiz, localObject4);
      kt localkt2 = this.h.a(str);
      if (localkt2 != null)
      {
        locallf.a(localkt2, localkt2.a(paramhj, paramiz));
        break;
      }
      if ((this.k != null) && (this.k.contains(str)))
      {
        paramhj.d();
        break;
      }
      if (this.j != null)
      {
        locallf.a(this.j, str, this.j.a(paramhj, paramiz));
        break;
      }
      if (localsq == null)
        localsq = new sq(paramhj.a());
      localsq.a(str);
      localsq.c(paramhj);
      break;
      Object localObject1;
      try
      {
        localObject1 = localld.a(locallf);
        if (localsq == null)
          break label353;
        if (localObject1.getClass() != this.b.p())
          return a(null, paramiz, localObject1, localsq);
      }
      catch (Exception localException1)
      {
        a(localException1, paramiz);
        return null;
      }
      return a(paramiz, localObject1, localsq);
      return localObject1;
    }
  }

  protected Object j(hj paramhj, iz paramiz)
  {
    if (this.e != null)
      return this.d.a(this.e.a(paramhj, paramiz));
    if (this.f != null)
      return k(paramhj, paramiz);
    sq localsq = new sq(paramhj.a());
    localsq.d();
    Object localObject = this.d.m();
    if (this.i != null)
      a(paramiz, localObject);
    if (paramhj.e() != hm.c)
    {
      String str = paramhj.g();
      paramhj.b();
      kt localkt = this.h.a(str);
      if (localkt != null);
      while (true)
      {
        try
        {
          localkt.a(paramhj, paramiz, localObject);
          paramhj.b();
        }
        catch (Exception localException2)
        {
          a(localException2, localObject, str, paramiz);
          continue;
        }
        if ((this.k != null) && (this.k.contains(str)))
        {
          paramhj.d();
        }
        else
        {
          localsq.a(str);
          localsq.c(paramhj);
          if (this.j != null)
            try
            {
              this.j.a(paramhj, paramiz, localObject, str);
            }
            catch (Exception localException1)
            {
              a(localException1, localObject, str, paramiz);
            }
        }
      }
    }
    localsq.e();
    this.o.a(paramhj, paramiz, localObject, localsq);
    return localObject;
  }

  protected Object k(hj paramhj, iz paramiz)
  {
    ld localld = this.f;
    lf locallf = localld.a(paramhj, paramiz);
    sq localsq = new sq(paramhj.a());
    localsq.d();
    hm localhm1 = paramhj.e();
    if (localhm1 == hm.f)
    {
      String str = paramhj.g();
      paramhj.b();
      kt localkt1 = localld.a(str);
      Object localObject3;
      if (localkt1 != null)
      {
        Object localObject2 = localkt1.a(paramhj, paramiz);
        if (locallf.a(localkt1.j(), localObject2))
        {
          hm localhm2 = paramhj.b();
          try
          {
            localObject3 = localld.a(locallf);
            while (localhm2 == hm.f)
            {
              paramhj.b();
              localsq.c(paramhj);
              localhm2 = paramhj.b();
            }
          }
          catch (Exception localException2)
          {
            a(localException2, this.b.p(), str, paramiz);
          }
        }
      }
      while (true)
      {
        localhm1 = paramhj.b();
        break;
        localsq.e();
        if (localObject3.getClass() != this.b.p())
          throw paramiz.b("Can not create polymorphic instances with unwrapped values");
        return this.o.a(paramhj, paramiz, localObject3, localsq);
        kt localkt2 = this.h.a(str);
        if (localkt2 != null)
        {
          locallf.a(localkt2, localkt2.a(paramhj, paramiz));
        }
        else if ((this.k != null) && (this.k.contains(str)))
        {
          paramhj.d();
        }
        else
        {
          localsq.a(str);
          localsq.c(paramhj);
          if (this.j != null)
            locallf.a(this.j, str, this.j.a(paramhj, paramiz));
        }
      }
    }
    try
    {
      Object localObject1 = localld.a(locallf);
      return this.o.a(paramhj, paramiz, localObject1, localsq);
    }
    catch (Exception localException1)
    {
      a(localException1, paramiz);
    }
    return null;
  }

  protected Object l(hj paramhj, iz paramiz)
  {
    if (this.f != null)
      return m(paramhj, paramiz);
    return c(paramhj, paramiz, this.d.m());
  }

  protected Object m(hj paramhj, iz paramiz)
  {
    lc locallc = this.p.a();
    ld localld = this.f;
    lf locallf = localld.a(paramhj, paramiz);
    sq localsq = new sq(paramhj.a());
    localsq.d();
    hm localhm1 = paramhj.e();
    if (localhm1 == hm.f)
    {
      String str = paramhj.g();
      paramhj.b();
      kt localkt1 = localld.a(str);
      Object localObject3;
      if (localkt1 != null)
      {
        Object localObject2 = localkt1.a(paramhj, paramiz);
        if (locallf.a(localkt1.j(), localObject2))
        {
          hm localhm2 = paramhj.b();
          try
          {
            localObject3 = localld.a(locallf);
            while (localhm2 == hm.f)
            {
              paramhj.b();
              localsq.c(paramhj);
              localhm2 = paramhj.b();
            }
          }
          catch (Exception localException2)
          {
            a(localException2, this.b.p(), str, paramiz);
          }
        }
      }
      while (true)
      {
        localhm1 = paramhj.b();
        break;
        if (localObject3.getClass() != this.b.p())
          throw paramiz.b("Can not create polymorphic instances with unwrapped values");
        return locallc.a(paramhj, paramiz, localObject3);
        kt localkt2 = this.h.a(str);
        if (localkt2 != null)
          locallf.a(localkt2, localkt2.a(paramhj, paramiz));
        else if (!locallc.a(paramhj, paramiz, str, null))
          if ((this.k != null) && (this.k.contains(str)))
            paramhj.d();
          else if (this.j != null)
            locallf.a(this.j, str, this.j.a(paramhj, paramiz));
      }
    }
    try
    {
      Object localObject1 = localld.a(locallf);
      return locallc.a(paramhj, paramiz, localObject1);
    }
    catch (Exception localException1)
    {
      a(localException1, paramiz);
    }
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ko
 * JD-Core Version:    0.6.2
 */