package com.flurry.sdk;

import java.lang.reflect.Method;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.RandomAccess;
import java.util.TimeZone;

public abstract class og extends jv
{
  protected static final HashMap<String, jk<?>> a = new HashMap();
  protected static final HashMap<String, Class<? extends jk<?>>> b = new HashMap();
  protected static final HashMap<String, jk<?>> c;
  protected ml d = ml.a;

  static
  {
    a.put(String.class.getName(), new qe());
    qg localqg = qg.a;
    a.put(StringBuffer.class.getName(), localqg);
    a.put(StringBuilder.class.getName(), localqg);
    a.put(Character.class.getName(), localqg);
    a.put(Character.TYPE.getName(), localqg);
    a.put(Boolean.TYPE.getName(), new os.a(true));
    a.put(Boolean.class.getName(), new os.a(false));
    os.e locale = new os.e();
    a.put(Integer.class.getName(), locale);
    a.put(Integer.TYPE.getName(), locale);
    a.put(Long.class.getName(), os.f.a);
    a.put(Long.TYPE.getName(), os.f.a);
    a.put(Byte.class.getName(), os.d.a);
    a.put(Byte.TYPE.getName(), os.d.a);
    a.put(Short.class.getName(), os.d.a);
    a.put(Short.TYPE.getName(), os.d.a);
    a.put(Float.class.getName(), os.c.a);
    a.put(Float.TYPE.getName(), os.c.a);
    a.put(Double.class.getName(), os.b.a);
    a.put(Double.TYPE.getName(), os.b.a);
    os.g localg = new os.g();
    a.put(BigInteger.class.getName(), localg);
    a.put(BigDecimal.class.getName(), localg);
    a.put(Calendar.class.getName(), pd.a);
    pg localpg = pg.a;
    a.put(java.util.Date.class.getName(), localpg);
    a.put(Timestamp.class.getName(), localpg);
    a.put(java.sql.Date.class.getName(), new os.h());
    a.put(Time.class.getName(), new os.i());
    Iterator localIterator = new qa().a().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      Object localObject = localEntry.getValue();
      if ((localObject instanceof jk))
      {
        a.put(((Class)localEntry.getKey()).getName(), (jk)localObject);
      }
      else if ((localObject instanceof Class))
      {
        Class localClass = (Class)localObject;
        b.put(((Class)localEntry.getKey()).getName(), localClass);
      }
      else
      {
        throw new IllegalStateException("Internal error: unrecognized value of type " + localEntry.getClass().getName());
      }
    }
    b.put(sq.class.getName(), qh.class);
    HashMap localHashMap = new HashMap();
    c = localHashMap;
    localHashMap.put([Z.class.getName(), new py.b());
    c.put([B.class.getName(), new py.c());
    c.put([C.class.getName(), new py.d());
    c.put([S.class.getName(), new py.i());
    c.put([I.class.getName(), new py.g());
    c.put([J.class.getName(), new py.h());
    c.put([F.class.getName(), new py.f());
    c.put([D.class.getName(), new py.e());
  }

  protected static jk<Object> b(ju paramju, mm parammm, is paramis)
  {
    iq localiq = paramju.a();
    Class localClass = localiq.c(parammm);
    if (((localClass == null) || (localClass == jk.a.class)) && (paramis != null))
      localClass = localiq.c(paramis.b());
    if ((localClass != null) && (localClass != jk.a.class))
      return paramju.a(parammm, localClass);
    return null;
  }

  // ERROR //
  protected static <T extends sh> T b(ju paramju, mm parammm, T paramT)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 247	com/flurry/sdk/ju:a	()Lcom/flurry/sdk/iq;
    //   4: astore_3
    //   5: aload_2
    //   6: invokevirtual 270	com/flurry/sdk/sh:f	()Z
    //   9: ifeq +101 -> 110
    //   12: aload_3
    //   13: aload_1
    //   14: aload_2
    //   15: invokevirtual 274	com/flurry/sdk/sh:k	()Lcom/flurry/sdk/sh;
    //   18: invokevirtual 277	com/flurry/sdk/iq:a	(Lcom/flurry/sdk/mm;Lcom/flurry/sdk/sh;)Ljava/lang/Class;
    //   21: astore 4
    //   23: aload 4
    //   25: ifnull +58 -> 83
    //   28: aload_2
    //   29: instanceof 279
    //   32: ifne +37 -> 69
    //   35: new 265	java/lang/IllegalArgumentException
    //   38: dup
    //   39: new 47	java/lang/StringBuilder
    //   42: dup
    //   43: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   46: ldc_w 281
    //   49: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   52: aload_2
    //   53: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   56: ldc_w 286
    //   59: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   62: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   65: invokespecial 287	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   68: athrow
    //   69: aload_2
    //   70: checkcast 279	com/flurry/sdk/qo
    //   73: aload 4
    //   75: invokevirtual 291	com/flurry/sdk/qo:e	(Ljava/lang/Class;)Lcom/flurry/sdk/sh;
    //   78: astore 9
    //   80: aload 9
    //   82: astore_2
    //   83: aload_3
    //   84: aload_1
    //   85: aload_2
    //   86: invokevirtual 294	com/flurry/sdk/sh:g	()Lcom/flurry/sdk/sh;
    //   89: invokevirtual 296	com/flurry/sdk/iq:b	(Lcom/flurry/sdk/mm;Lcom/flurry/sdk/sh;)Ljava/lang/Class;
    //   92: astore 5
    //   94: aload 5
    //   96: ifnull +14 -> 110
    //   99: aload_2
    //   100: aload 5
    //   102: invokevirtual 298	com/flurry/sdk/sh:c	(Ljava/lang/Class;)Lcom/flurry/sdk/sh;
    //   105: astore 7
    //   107: aload 7
    //   109: astore_2
    //   110: aload_2
    //   111: areturn
    //   112: astore 8
    //   114: new 265	java/lang/IllegalArgumentException
    //   117: dup
    //   118: new 47	java/lang/StringBuilder
    //   121: dup
    //   122: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   125: ldc_w 300
    //   128: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   131: aload_2
    //   132: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   135: ldc_w 302
    //   138: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: aload 4
    //   143: invokevirtual 31	java/lang/Class:getName	()Ljava/lang/String;
    //   146: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: ldc_w 304
    //   152: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: aload 8
    //   157: invokevirtual 307	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   160: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   166: invokespecial 287	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   169: athrow
    //   170: astore 6
    //   172: new 265	java/lang/IllegalArgumentException
    //   175: dup
    //   176: new 47	java/lang/StringBuilder
    //   179: dup
    //   180: invokespecial 170	java/lang/StringBuilder:<init>	()V
    //   183: ldc_w 309
    //   186: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: aload_2
    //   190: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   193: ldc_w 311
    //   196: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   199: aload 5
    //   201: invokevirtual 31	java/lang/Class:getName	()Ljava/lang/String;
    //   204: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   207: ldc_w 304
    //   210: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: aload 6
    //   215: invokevirtual 307	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   218: invokevirtual 176	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   221: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   224: invokespecial 287	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   227: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   69	80	112	java/lang/IllegalArgumentException
    //   99	107	170	java/lang/IllegalArgumentException
  }

  protected static jk<Object> c(ju paramju, mm parammm, is paramis)
  {
    iq localiq = paramju.a();
    Class localClass = localiq.d(parammm);
    if (((localClass == null) || (localClass == jk.a.class)) && (paramis != null))
      localClass = localiq.d(paramis.b());
    if ((localClass != null) && (localClass != jk.a.class))
      return paramju.a(parammm, localClass);
    return null;
  }

  protected jk<Object> a(ju paramju, mm parammm, is paramis)
  {
    Object localObject1 = paramju.a().b(parammm);
    Object localObject2;
    if (localObject1 == null)
      localObject2 = null;
    do
    {
      do
      {
        return localObject2;
        if (!(localObject1 instanceof jk))
          break;
        localObject2 = (jk)localObject1;
      }
      while (!(localObject2 instanceof ix));
      return ((ix)localObject2).a(paramju, paramis);
      if (!(localObject1 instanceof Class))
        throw new IllegalStateException("AnnotationIntrospector returned value of type " + localObject1.getClass().getName() + "; expected type JsonSerializer or Class<JsonSerializer> instead");
      Class localClass = (Class)localObject1;
      if (!jk.class.isAssignableFrom(localClass))
        throw new IllegalStateException("AnnotationIntrospector returned Class " + localClass.getName() + "; expected Class<JsonSerializer>");
      localObject2 = paramju.a(parammm, localClass);
    }
    while (!(localObject2 instanceof ix));
    return ((ix)localObject2).a(paramju, paramis);
  }

  protected jk<?> a(ju paramju, qi paramqi, mw parammw, is paramis, boolean paramBoolean, jz paramjz, jk<Object> paramjk)
  {
    Class localClass = paramqi.p();
    Object localObject;
    if ([Ljava.lang.String.class == localClass)
      localObject = new py.j(paramis);
    do
    {
      return localObject;
      localObject = (jk)c.get(localClass.getName());
    }
    while (localObject != null);
    return new pr(paramqi.g(), paramBoolean, paramjz, paramis, paramjk);
  }

  protected jk<?> a(ju paramju, qk paramqk, mw parammw, is paramis, boolean paramBoolean, jz paramjz, jk<Object> paramjk)
  {
    Iterator localIterator = b().iterator();
    while (localIterator.hasNext())
    {
      jk localjk = ((jx)localIterator.next()).a(paramju, paramqk, parammw, paramis, paramjz, paramjk);
      if (localjk != null)
        return localjk;
    }
    return null;
  }

  protected jk<?> a(ju paramju, ql paramql, mw parammw, is paramis, boolean paramBoolean, jz paramjz, jk<Object> paramjk)
  {
    Iterator localIterator = b().iterator();
    while (localIterator.hasNext())
    {
      jk localjk = ((jx)localIterator.next()).a(paramju, paramql, parammw, paramis, paramjz, paramjk);
      if (localjk != null)
        return localjk;
    }
    Class localClass1 = paramql.p();
    if (EnumSet.class.isAssignableFrom(localClass1))
      return a(paramju, paramql, parammw, paramis, paramBoolean, paramjz, paramjk);
    Class localClass2 = paramql.g().p();
    if (a(localClass1))
    {
      if (localClass2 == String.class)
        return new pk(paramis);
      return pz.a(paramql.g(), paramBoolean, paramjz, paramis, paramjk);
    }
    if (localClass2 == String.class)
      return new qd(paramis);
    return pz.b(paramql.g(), paramBoolean, paramjz, paramis, paramjk);
  }

  protected jk<?> a(ju paramju, qn paramqn, mw parammw, is paramis, boolean paramBoolean, jk<Object> paramjk1, jz paramjz, jk<Object> paramjk2)
  {
    Iterator localIterator = b().iterator();
    while (localIterator.hasNext())
    {
      jk localjk = ((jx)localIterator.next()).a(paramju, paramqn, parammw, paramis, paramjk1, paramjz, paramjk2);
      if (localjk != null)
        return localjk;
    }
    return null;
  }

  protected jk<?> a(ju paramju, qo paramqo, mw parammw, is paramis, boolean paramBoolean, jk<Object> paramjk1, jz paramjz, jk<Object> paramjk2)
  {
    Iterator localIterator = b().iterator();
    while (localIterator.hasNext())
    {
      jk localjk = ((jx)localIterator.next()).a(paramju, paramqo, parammw, paramis, paramjk1, paramjz, paramjk2);
      if (localjk != null)
        return localjk;
    }
    if (EnumMap.class.isAssignableFrom(paramqo.p()))
      return b(paramju, paramqo, parammw, paramis, paramBoolean, paramjz, paramjk2);
    return po.a(paramju.a().c(parammw.c()), paramqo, paramBoolean, paramjz, paramis, paramjk1, paramjk2);
  }

  public final jk<?> a(ju paramju, sh paramsh, mw parammw, is paramis, boolean paramBoolean)
  {
    Class localClass = paramsh.p();
    if (Iterator.class.isAssignableFrom(localClass))
      return c(paramju, paramsh, parammw, paramis, paramBoolean);
    if (Iterable.class.isAssignableFrom(localClass))
      return d(paramju, paramsh, parammw, paramis, paramBoolean);
    if (CharSequence.class.isAssignableFrom(localClass))
      return qg.a;
    return null;
  }

  protected jk<?> a(ju paramju, sh paramsh, mw parammw, is paramis, boolean paramBoolean, jz paramjz, jk<Object> paramjk)
  {
    sh localsh = paramsh.g();
    if (!localsh.r())
      localsh = null;
    return pz.a(localsh, paramis);
  }

  public final jk<?> a(sh paramsh, ju paramju, mw parammw, is paramis, boolean paramBoolean)
  {
    String str = paramsh.p().getName();
    jk localjk1 = (jk)a.get(str);
    if (localjk1 != null)
      return localjk1;
    Class localClass = (Class)b.get(str);
    if (localClass != null)
      try
      {
        jk localjk2 = (jk)localClass.newInstance();
        return localjk2;
      }
      catch (Exception localException)
      {
        throw new IllegalStateException("Failed to instantiate standard serializer (of type " + localClass.getName() + "): " + localException.getMessage(), localException);
      }
    return null;
  }

  protected <T extends sh> T a(ju paramju, mm parammm, T paramT)
  {
    Class localClass = paramju.a().e(parammm);
    if (localClass != null);
    try
    {
      sh localsh = paramT.h(localClass);
      paramT = localsh;
      return b(paramju, parammm, paramT);
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      throw new IllegalArgumentException("Failed to widen type " + paramT + " with concrete-type annotation (value " + localClass.getName() + "), method '" + parammm.b() + "': " + localIllegalArgumentException.getMessage());
    }
  }

  protected boolean a(ju paramju, mw parammw, jz paramjz, is paramis)
  {
    if (paramjz != null);
    iq localiq;
    sh localsh;
    do
    {
      do
      {
        do
        {
          return false;
          localiq = paramju.a();
          kg.b localb = localiq.f(parammw.c());
          if (localb != null)
          {
            if (localb == kg.b.b)
              return true;
          }
          else if (paramju.a(ju.a.h))
            return true;
        }
        while (paramis == null);
        localsh = paramis.a();
      }
      while (!localsh.f());
      if (localiq.b(paramis.b(), paramis.a()) != null)
        return true;
    }
    while ((!(localsh instanceof qo)) || (localiq.a(paramis.b(), paramis.a()) == null));
    return true;
  }

  protected boolean a(Class<?> paramClass)
  {
    return RandomAccess.class.isAssignableFrom(paramClass);
  }

  public jk<?> b(ju paramju, sh paramsh, mw parammw, is paramis, boolean paramBoolean)
  {
    jz localjz = b(paramju, paramsh.g(), paramis);
    boolean bool;
    if (localjz != null)
      bool = false;
    while (true)
    {
      jk localjk1 = c(paramju, parammw.c(), paramis);
      if (paramsh.j())
      {
        qn localqn = (qn)paramsh;
        jk localjk2 = b(paramju, parammw.c(), paramis);
        if (localqn.l())
        {
          return a(paramju, (qo)localqn, parammw, paramis, bool, localjk2, localjz, localjk1);
          if (!paramBoolean)
            bool = a(paramju, parammw, localjz, paramis);
        }
        else
        {
          return a(paramju, localqn, parammw, paramis, bool, localjk2, localjz, localjk1);
        }
      }
      else
      {
        if (paramsh.i())
        {
          qk localqk = (qk)paramsh;
          if (localqk.a_())
            return a(paramju, (ql)localqk, parammw, paramis, bool, localjz, localjk1);
          return a(paramju, localqk, parammw, paramis, bool, localjz, localjk1);
        }
        if (paramsh.b())
          return a(paramju, (qi)paramsh, parammw, paramis, bool, localjz, localjk1);
        return null;
        bool = paramBoolean;
      }
    }
  }

  protected jk<?> b(ju paramju, sh paramsh, mw parammw, is paramis, boolean paramBoolean, jz paramjz, jk<Object> paramjk)
  {
    sh localsh = paramsh.k();
    boolean bool = localsh.r();
    rb localrb = null;
    if (bool)
      localrb = rb.a(localsh.p(), paramju.a());
    return new ph(paramsh.g(), paramBoolean, localrb, paramjz, paramis, paramjk);
  }

  public final jk<?> b(sh paramsh, ju paramju, mw parammw, is paramis, boolean paramBoolean)
  {
    Class localClass = paramsh.p();
    Object localObject;
    if (ji.class.isAssignableFrom(localClass))
      if (jj.class.isAssignableFrom(localClass))
        localObject = pv.a;
    do
    {
      return localObject;
      return pu.a;
      mr localmr = parammw.e();
      if (localmr != null)
      {
        Method localMethod = localmr.e();
        if (paramju.a(ju.a.e))
          qy.a(localMethod);
        return new pn(localMethod, a(paramju, localmr, paramis), paramis);
      }
      if (InetAddress.class.isAssignableFrom(localClass))
        return pl.a;
      if (TimeZone.class.isAssignableFrom(localClass))
        return qf.a;
      if (Charset.class.isAssignableFrom(localClass))
        return qg.a;
      localObject = this.d.a(paramju, paramsh);
    }
    while (localObject != null);
    if (Number.class.isAssignableFrom(localClass))
      return os.g.a;
    if (Enum.class.isAssignableFrom(localClass))
      return pi.a(localClass, paramju, parammw);
    if (Calendar.class.isAssignableFrom(localClass))
      return pd.a;
    if (java.util.Date.class.isAssignableFrom(localClass))
      return pg.a;
    return null;
  }

  public jz b(ju paramju, sh paramsh, is paramis)
  {
    mn localmn = ((mw)paramju.c(paramsh.p())).c();
    iq localiq = paramju.a();
    ni localni = localiq.a(paramju, localmn, paramsh);
    if (localni == null)
      localni = paramju.d(paramsh);
    for (Collection localCollection = null; localni == null; localCollection = paramju.l().a(localmn, paramju, localiq))
      return null;
    return localni.a(paramju, paramsh, localCollection, paramis);
  }

  protected abstract Iterable<jx> b();

  protected jk<?> c(ju paramju, sh paramsh, mw parammw, is paramis, boolean paramBoolean)
  {
    sh localsh = paramsh.b(0);
    if (localsh == null)
      localsh = qs.b();
    jz localjz = b(paramju, localsh, paramis);
    return pz.a(localsh, a(paramju, parammw, localjz, paramis), localjz, paramis);
  }

  protected jk<?> d(ju paramju, sh paramsh, mw parammw, is paramis, boolean paramBoolean)
  {
    sh localsh = paramsh.b(0);
    if (localsh == null)
      localsh = qs.b();
    jz localjz = b(paramju, localsh, paramis);
    return pz.b(localsh, a(paramju, parammw, localjz, paramis), localjz, paramis);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.og
 * JD-Core Version:    0.6.2
 */