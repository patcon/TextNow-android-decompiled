package com.flurry.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ol extends og
{
  public static final ol e = new ol(null);
  protected final jv.a f;

  protected ol(jv.a parama)
  {
    if (parama == null)
      parama = new ol.a();
    this.f = parama;
  }

  protected jk<Object> a(ju paramju, mw parammw, is paramis)
  {
    if (parammw.b() == Object.class)
      throw new IllegalArgumentException("Can not create bean serializer for Object.class");
    ok localok1 = a(parammw);
    Object localObject1 = c(paramju, parammw);
    if (localObject1 == null)
      localObject1 = new ArrayList();
    if (this.f.b())
    {
      Iterator localIterator3 = this.f.e().iterator();
      for (localObject2 = localObject1; localIterator3.hasNext(); localObject2 = ((om)localIterator3.next()).a(paramju, parammw, (List)localObject2));
    }
    Object localObject2 = localObject1;
    List localList1 = b(paramju, parammw, a(paramju, parammw, (List)localObject2));
    if (this.f.b())
    {
      Iterator localIterator2 = this.f.e().iterator();
      for (localList2 = localList1; localIterator2.hasNext(); localList2 = ((om)localIterator2.next()).b(paramju, parammw, localList2));
    }
    List localList2 = localList1;
    localok1.a(localList2);
    localok1.a(b(paramju, parammw));
    mr localmr = parammw.p();
    if (localmr != null)
    {
      if (paramju.a(ju.a.e))
        localmr.k();
      sh localsh = localmr.a(parammw.j());
      localok1.a(new of(localmr, po.a(null, localsh, paramju.a(ju.a.h), b(paramju, localsh.g(), paramis), paramis, null, null)));
    }
    a(paramju, localok1);
    if (this.f.b())
    {
      Iterator localIterator1 = this.f.e().iterator();
      for (localok2 = localok1; localIterator1.hasNext(); localok2 = ((om)localIterator1.next()).a(paramju, parammw, localok2));
    }
    ok localok2 = localok1;
    Object localObject3 = localok2.b();
    if ((localObject3 == null) && (parammw.h()))
      localObject3 = localok2.c();
    return localObject3;
  }

  public jk<Object> a(ju paramju, sh paramsh, is paramis)
  {
    mw localmw = (mw)paramju.b(paramsh);
    jk localjk1 = a(paramju, localmw.c(), paramis);
    if (localjk1 != null);
    sh localsh;
    boolean bool;
    do
    {
      do
      {
        do
        {
          return localjk1;
          localsh = a(paramju, localmw.c(), paramsh);
          if (localsh != paramsh);
          for (bool = true; paramsh.f(); bool = false)
            return b(paramju, localsh, localmw, paramis, bool);
          Iterator localIterator = this.f.c().iterator();
          while (localIterator.hasNext())
          {
            jk localjk2 = ((jx)localIterator.next()).a(paramju, localsh, localmw, paramis);
            if (localjk2 != null)
              return localjk2;
          }
          localjk1 = a(localsh, paramju, localmw, paramis, bool);
        }
        while (localjk1 != null);
        localjk1 = b(localsh, paramju, localmw, paramis, bool);
      }
      while (localjk1 != null);
      localjk1 = a(paramju, localsh, localmw, paramis);
    }
    while (localjk1 != null);
    return a(paramju, localsh, localmw, paramis, bool);
  }

  public jk<Object> a(ju paramju, sh paramsh, mw parammw, is paramis)
  {
    Object localObject;
    if (!b(paramsh.p()))
      localObject = null;
    jk localjk;
    while (true)
    {
      return localObject;
      localjk = a(paramju, parammw, paramis);
      if (!this.f.b())
        break;
      Iterator localIterator = this.f.e().iterator();
      for (localObject = localjk; localIterator.hasNext(); localObject = ((om)localIterator.next()).a(paramju, parammw, (jk)localObject));
    }
    return localjk;
  }

  public jv.a a()
  {
    return this.f;
  }

  public jv a(jv.a parama)
  {
    if (this.f == parama)
      return this;
    if (getClass() != ol.class)
      throw new IllegalStateException("Subtype of BeanSerializerFactory (" + getClass().getName() + ") has not properly overridden method 'withAdditionalSerializers': can not instantiate subtype with " + "additional serializer definitions");
    return new ol(parama);
  }

  public jz a(sh paramsh, ju paramju, mq parammq, is paramis)
  {
    iq localiq = paramju.a();
    ni localni = localiq.a(paramju, parammq, paramsh);
    if (localni == null)
      return b(paramju, paramsh, paramis);
    return localni.a(paramju, paramsh, paramju.l().a(parammq, paramju, localiq), paramis);
  }

  protected oi a(ju paramju, qr paramqr, op paramop, boolean paramBoolean, String paramString, mq parammq)
  {
    if (paramju.a(ju.a.e))
      parammq.k();
    sh localsh = parammq.a(paramqr);
    is.a locala = new is.a(paramString, localsh, paramop.a(), parammq);
    jk localjk = a(paramju, parammq, locala);
    boolean bool = qy.e(localsh.p());
    jz localjz = null;
    if (bool)
      localjz = b(localsh, paramju, parammq, locala);
    oi localoi = paramop.a(paramString, localsh, localjk, a(localsh, paramju, parammq, locala), localjz, parammq, paramBoolean);
    localoi.a(paramju.a().g(parammq));
    return localoi;
  }

  protected oi a(oi paramoi, Class<?>[] paramArrayOfClass)
  {
    return oo.a(paramoi, paramArrayOfClass);
  }

  protected ok a(mw parammw)
  {
    return new ok(parammw);
  }

  protected op a(ju paramju, mw parammw)
  {
    return new op(paramju, parammw);
  }

  protected List<oi> a(ju paramju, mw parammw, List<oi> paramList)
  {
    String[] arrayOfString = paramju.a().c(parammw.c());
    if ((arrayOfString != null) && (arrayOfString.length > 0))
    {
      HashSet localHashSet = qw.a(arrayOfString);
      Iterator localIterator = paramList.iterator();
      while (localIterator.hasNext())
        if (localHashSet.contains(((oi)localIterator.next()).d()))
          localIterator.remove();
    }
    return paramList;
  }

  protected void a(ju paramju, ok paramok)
  {
    List localList = paramok.a();
    boolean bool = paramju.a(ju.a.i);
    int i = localList.size();
    oi[] arrayOfoi = new oi[i];
    int j = 0;
    int k = 0;
    if (j < i)
    {
      oi localoi = (oi)localList.get(j);
      Class[] arrayOfClass = localoi.h();
      if (arrayOfClass == null)
      {
        if (!bool)
          break label109;
        arrayOfoi[j] = localoi;
      }
      label109: for (int m = k; ; m = k)
      {
        j++;
        k = m;
        break;
        k++;
        arrayOfoi[j] = a(localoi, arrayOfClass);
      }
    }
    if ((bool) && (k == 0))
      return;
    paramok.a(arrayOfoi);
  }

  public jz b(sh paramsh, ju paramju, mq parammq, is paramis)
  {
    sh localsh = paramsh.g();
    iq localiq = paramju.a();
    ni localni = localiq.b(paramju, parammq, paramsh);
    if (localni == null)
      return b(paramju, localsh, paramis);
    return localni.a(paramju, localsh, paramju.l().a(parammq, paramju, localiq), paramis);
  }

  protected Iterable<jx> b()
  {
    return this.f.c();
  }

  protected Object b(ju paramju, mw parammw)
  {
    return paramju.a().f(parammw.c());
  }

  @Deprecated
  protected List<oi> b(ju paramju, mw parammw, List<oi> paramList)
  {
    return paramList;
  }

  protected boolean b(Class<?> paramClass)
  {
    return (qy.a(paramClass) == null) && (!qy.c(paramClass));
  }

  public jk<Object> c(ju paramju, sh paramsh, is paramis)
  {
    boolean bool = this.f.a();
    Object localObject = null;
    if (!bool);
    label85: 
    while (true)
    {
      return localObject;
      mw localmw = (mw)paramju.c(paramsh.p());
      Iterator localIterator = this.f.d().iterator();
      while (true)
      {
        if (!localIterator.hasNext())
          break label85;
        localObject = ((jx)localIterator.next()).a(paramju, paramsh, localmw, paramis);
        if (localObject != null)
          break;
      }
    }
  }

  protected List<oi> c(ju paramju, mw parammw)
  {
    List localList = parammw.d();
    iq localiq = paramju.a();
    c(paramju, parammw, localList);
    if (paramju.a(ju.a.f))
      d(paramju, parammw, localList);
    if (localList.isEmpty())
      return null;
    boolean bool = a(paramju, parammw, null, null);
    op localop = a(paramju, parammw);
    ArrayList localArrayList = new ArrayList(localList.size());
    qr localqr = parammw.j();
    Iterator localIterator = localList.iterator();
    while (localIterator.hasNext())
    {
      it localit = (it)localIterator.next();
      mq localmq = localit.j();
      iq.a locala = localiq.a(localmq);
      if ((locala == null) || (!locala.c()))
      {
        String str = localit.a();
        if ((localmq instanceof mr))
          localArrayList.add(a(paramju, localqr, localop, bool, str, (mr)localmq));
        else
          localArrayList.add(a(paramju, localqr, localop, bool, str, (mp)localmq));
      }
    }
    return localArrayList;
  }

  protected void c(ju paramju, mw parammw, List<it> paramList)
  {
    iq localiq = paramju.a();
    HashMap localHashMap = new HashMap();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      mq localmq = ((it)localIterator.next()).j();
      if (localmq == null)
      {
        localIterator.remove();
      }
      else
      {
        Class localClass = localmq.d();
        Boolean localBoolean = (Boolean)localHashMap.get(localClass);
        if (localBoolean == null)
        {
          localBoolean = localiq.e(((mw)paramju.c(localClass)).c());
          if (localBoolean == null)
            localBoolean = Boolean.FALSE;
          localHashMap.put(localClass, localBoolean);
        }
        if (localBoolean.booleanValue())
          localIterator.remove();
      }
    }
  }

  protected void d(ju paramju, mw parammw, List<it> paramList)
  {
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
      if (!((it)localIterator.next()).f())
        localIterator.remove();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ol
 * JD-Core Version:    0.6.2
 */