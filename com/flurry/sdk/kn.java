package com.flurry.sdk;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;

public abstract class kn extends jb
{
  static final HashMap<qj, jg<Object>> b = kw.a();
  static final HashMap<sh, jl> c = mb.a();
  static final HashMap<String, Class<? extends Map>> d;
  static final HashMap<String, Class<? extends Collection>> e;
  protected static final HashMap<sh, jg<Object>> f;
  protected ml g = ml.a;

  static
  {
    HashMap localHashMap1 = new HashMap();
    d = localHashMap1;
    localHashMap1.put(Map.class.getName(), LinkedHashMap.class);
    d.put(ConcurrentMap.class.getName(), ConcurrentHashMap.class);
    d.put(SortedMap.class.getName(), TreeMap.class);
    d.put("java.util.NavigableMap", TreeMap.class);
    try
    {
      Class localClass1 = Class.forName("java.util.ConcurrentNavigableMap");
      Class localClass2 = Class.forName("java.util.ConcurrentSkipListMap");
      d.put(localClass1.getName(), localClass2);
      label103: HashMap localHashMap2 = new HashMap();
      e = localHashMap2;
      localHashMap2.put(Collection.class.getName(), ArrayList.class);
      e.put(List.class.getName(), ArrayList.class);
      e.put(Set.class.getName(), HashSet.class);
      e.put(SortedSet.class.getName(), TreeSet.class);
      e.put(Queue.class.getName(), LinkedList.class);
      e.put("java.util.Deque", LinkedList.class);
      e.put("java.util.NavigableSet", TreeSet.class);
      f = ly.a();
      return;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      break label103;
    }
  }

  public jg<?> a(iy paramiy, jc paramjc, qi paramqi, is paramis)
  {
    sh localsh = paramqi.g();
    jg localjg1 = (jg)localsh.n();
    Object localObject;
    if (localjg1 == null)
    {
      localObject = (jg)f.get(localsh);
      if (localObject != null)
      {
        jg localjg2 = a(paramqi, paramiy, paramjc, paramis, null, null);
        if (localjg2 != null)
          localObject = localjg2;
        return localObject;
      }
      if (localsh.t())
        throw new IllegalArgumentException("Internal error: primitive type (" + paramqi + ") passed, no array deserializer found");
    }
    jy localjy1 = (jy)localsh.o();
    if (localjy1 == null);
    for (jy localjy2 = b(paramiy, localsh, paramis); ; localjy2 = localjy1)
    {
      localObject = a(paramqi, paramiy, paramjc, paramis, localjy2, localjg1);
      if (localObject != null)
        break;
      if (localjg1 == null)
        localjg1 = paramjc.a(paramiy, localsh, paramis);
      return new lx(paramqi, localjg1, localjy2);
    }
  }

  public jg<?> a(iy paramiy, jc paramjc, qk paramqk, is paramis)
  {
    qk localqk1 = (qk)a(paramiy, paramqk);
    mw localmw = (mw)paramiy.c(localqk1.p());
    jg localjg1 = a(paramiy, localmw.c(), paramis);
    if (localjg1 != null)
      return localjg1;
    qk localqk2 = (qk)a(paramiy, localmw.c(), localqk1, null);
    sh localsh = localqk2.g();
    jg localjg2 = (jg)localsh.n();
    jy localjy1 = (jy)localsh.o();
    if (localjy1 == null);
    for (jy localjy2 = b(paramiy, localsh, paramis); ; localjy2 = localjy1)
      return a(localqk2, paramiy, paramjc, localmw, paramis, localjy2, localjg2);
  }

  public jg<?> a(iy paramiy, jc paramjc, ql paramql, is paramis)
  {
    ql localql1 = (ql)a(paramiy, paramql);
    Class localClass1 = localql1.p();
    mw localmw = (mw)paramiy.c(localql1);
    jg localjg1 = a(paramiy, localmw.c(), paramis);
    jg localjg3;
    if (localjg1 != null)
    {
      localjg3 = localjg1;
      return localjg3;
    }
    Object localObject = (ql)a(paramiy, localmw.c(), localql1, null);
    sh localsh = ((ql)localObject).g();
    jg localjg2 = (jg)localsh.n();
    jy localjy1 = (jy)localsh.o();
    if (localjy1 == null);
    for (jy localjy2 = b(paramiy, localsh, paramis); ; localjy2 = localjy1)
    {
      localjg3 = a((ql)localObject, paramiy, paramjc, localmw, paramis, localjy2, localjg2);
      if (localjg3 != null)
        break;
      if (localjg2 == null)
      {
        if (EnumSet.class.isAssignableFrom(localClass1))
          return new ls(localsh.p(), b(paramiy, paramjc, localsh, paramis));
        localjg2 = paramjc.a(paramiy, localsh, paramis);
      }
      if ((((ql)localObject).s()) || (((ql)localObject).c()))
      {
        Class localClass2 = (Class)e.get(localClass1.getName());
        if (localClass2 == null)
          throw new IllegalArgumentException("Can not find a deserializer for non-concrete Collection type " + localObject);
        ql localql2 = (ql)paramiy.a((sh)localObject, localClass2);
        localmw = (mw)paramiy.c(localql2);
        localObject = localql2;
      }
      kx localkx = a(paramiy, localmw);
      if (localsh.p() == String.class)
        return new me((sh)localObject, localjg2, localkx);
      return new ln((sh)localObject, localjg2, localjy2, localkx);
    }
  }

  public jg<?> a(iy paramiy, jc paramjc, qn paramqn, is paramis)
  {
    qn localqn1 = (qn)a(paramiy, paramqn);
    mw localmw = (mw)paramiy.c(localqn1);
    jg localjg1 = a(paramiy, localmw.c(), paramis);
    if (localjg1 != null)
      return localjg1;
    qn localqn2 = (qn)a(paramiy, localmw.c(), localqn1, null);
    sh localsh1 = localqn2.k();
    sh localsh2 = localqn2.g();
    jg localjg2 = (jg)localsh2.n();
    jl localjl1 = (jl)localsh1.n();
    if (localjl1 == null);
    for (jl localjl2 = paramjc.c(paramiy, localsh1, paramis); ; localjl2 = localjl1)
    {
      jy localjy1 = (jy)localsh2.o();
      if (localjy1 == null);
      for (jy localjy2 = b(paramiy, localsh2, paramis); ; localjy2 = localjy1)
        return a(localqn2, paramiy, paramjc, localmw, paramis, localjl2, localjy2, localjg2);
    }
  }

  public jg<?> a(iy paramiy, jc paramjc, qo paramqo, is paramis)
  {
    qo localqo1 = (qo)a(paramiy, paramqo);
    mw localmw1 = (mw)paramiy.c(localqo1);
    jg localjg1 = a(paramiy, localmw1.c(), paramis);
    jg localjg3;
    if (localjg1 != null)
    {
      localjg3 = localjg1;
      return localjg3;
    }
    Object localObject = (qo)a(paramiy, localmw1.c(), localqo1, null);
    sh localsh1 = ((qo)localObject).k();
    sh localsh2 = ((qo)localObject).g();
    jg localjg2 = (jg)localsh2.n();
    jl localjl1 = (jl)localsh1.n();
    if (localjl1 == null);
    for (jl localjl2 = paramjc.c(paramiy, localsh1, paramis); ; localjl2 = localjl1)
    {
      jy localjy1 = (jy)localsh2.o();
      if (localjy1 == null);
      for (jy localjy2 = b(paramiy, localsh2, paramis); ; localjy2 = localjy1)
      {
        localjg3 = a((qo)localObject, paramiy, paramjc, localmw1, paramis, localjl2, localjy2, localjg2);
        if (localjg3 != null)
          break;
        if (localjg2 == null)
          localjg2 = paramjc.a(paramiy, localsh2, paramis);
        Class localClass1 = ((qo)localObject).p();
        if (EnumMap.class.isAssignableFrom(localClass1))
        {
          Class localClass3 = localsh1.p();
          if ((localClass3 == null) || (!localClass3.isEnum()))
            throw new IllegalArgumentException("Can not construct EnumMap; generic (key) type not available");
          return new lr(localsh1.p(), b(paramiy, paramjc, localsh1, paramis), localjg2);
        }
        mw localmw2;
        if ((((qo)localObject).s()) || (((qo)localObject).c()))
        {
          Class localClass2 = (Class)d.get(localClass1.getName());
          if (localClass2 == null)
            throw new IllegalArgumentException("Can not find a deserializer for non-concrete Map type " + localObject);
          qo localqo2 = (qo)paramiy.a((sh)localObject, localClass2);
          localmw2 = (mw)paramiy.c(localqo2);
          localObject = localqo2;
        }
        while (true)
        {
          lw locallw = new lw((sh)localObject, a(paramiy, localmw2), localjl2, localjg2, localjy2);
          locallw.a(paramiy.a().c(localmw2.c()));
          return locallw;
          localmw2 = localmw1;
        }
      }
    }
  }

  protected jg<Object> a(iy paramiy, mm parammm, is paramis)
  {
    Object localObject = paramiy.a().h(parammm);
    if (localObject != null)
      return a(paramiy, parammm, paramis, localObject);
    return null;
  }

  jg<Object> a(iy paramiy, mm parammm, is paramis, Object paramObject)
  {
    if ((paramObject instanceof jg))
    {
      jg localjg2 = (jg)paramObject;
      if ((localjg2 instanceof iv))
        localjg2 = ((iv)localjg2).a(paramiy, paramis);
      return localjg2;
    }
    if (!(paramObject instanceof Class))
      throw new IllegalStateException("AnnotationIntrospector returned deserializer definition of type " + paramObject.getClass().getName() + "; expected type JsonDeserializer or Class<JsonDeserializer> instead");
    Class localClass = (Class)paramObject;
    if (!jg.class.isAssignableFrom(localClass))
      throw new IllegalStateException("AnnotationIntrospector returned Class " + localClass.getName() + "; expected Class<JsonDeserializer>");
    jg localjg1 = paramiy.a(parammm, localClass);
    if ((localjg1 instanceof iv))
      localjg1 = ((iv)localjg1).a(paramiy, paramis);
    return localjg1;
  }

  protected abstract jg<?> a(qi paramqi, iy paramiy, jc paramjc, is paramis, jy paramjy, jg<?> paramjg);

  protected abstract jg<?> a(qk paramqk, iy paramiy, jc paramjc, mw parammw, is paramis, jy paramjy, jg<?> paramjg);

  protected abstract jg<?> a(ql paramql, iy paramiy, jc paramjc, mw parammw, is paramis, jy paramjy, jg<?> paramjg);

  protected abstract jg<?> a(qn paramqn, iy paramiy, jc paramjc, mw parammw, is paramis, jl paramjl, jy paramjy, jg<?> paramjg);

  protected abstract jg<?> a(qo paramqo, iy paramiy, jc paramjc, mw parammw, is paramis, jl paramjl, jy paramjy, jg<?> paramjg);

  protected abstract jg<?> a(Class<? extends hh> paramClass, iy paramiy, is paramis);

  protected abstract jg<?> a(Class<?> paramClass, iy paramiy, mw parammw, is paramis);

  public jy a(iy paramiy, sh paramsh, mq parammq, is paramis)
  {
    iq localiq = paramiy.a();
    ni localni = localiq.a(paramiy, parammq, paramsh);
    if (localni == null)
      return b(paramiy, paramsh, paramis);
    return localni.a(paramiy, paramsh, paramiy.l().a(parammq, paramiy, localiq), paramis);
  }

  public abstract kx a(iy paramiy, mw parammw);

  protected ra<?> a(Class<?> paramClass, iy paramiy)
  {
    if (paramiy.a(iy.a.j))
      return ra.b(paramClass);
    return ra.b(paramClass, paramiy.a());
  }

  // ERROR //
  protected <T extends sh> T a(iy paramiy, mm parammm, T paramT, String paramString)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 303	com/flurry/sdk/iy:a	()Lcom/flurry/sdk/iq;
    //   4: astore 5
    //   6: aload 5
    //   8: aload_2
    //   9: aload_3
    //   10: aload 4
    //   12: invokevirtual 383	com/flurry/sdk/iq:a	(Lcom/flurry/sdk/mm;Lcom/flurry/sdk/sh;Ljava/lang/String;)Ljava/lang/Class;
    //   15: astore 6
    //   17: aload 6
    //   19: ifnull +440 -> 459
    //   22: aload_3
    //   23: aload 6
    //   25: invokevirtual 386	com/flurry/sdk/sh:f	(Ljava/lang/Class;)Lcom/flurry/sdk/sh;
    //   28: astore 19
    //   30: aload 19
    //   32: astore 7
    //   34: aload 7
    //   36: invokevirtual 388	com/flurry/sdk/sh:f	()Z
    //   39: ifeq +293 -> 332
    //   42: aload 5
    //   44: aload_2
    //   45: aload 7
    //   47: invokevirtual 389	com/flurry/sdk/sh:k	()Lcom/flurry/sdk/sh;
    //   50: aload 4
    //   52: invokevirtual 391	com/flurry/sdk/iq:b	(Lcom/flurry/sdk/mm;Lcom/flurry/sdk/sh;Ljava/lang/String;)Ljava/lang/Class;
    //   55: astore 8
    //   57: aload 8
    //   59: ifnull +136 -> 195
    //   62: aload 7
    //   64: instanceof 258
    //   67: ifne +112 -> 179
    //   70: new 393	com/flurry/sdk/jh
    //   73: dup
    //   74: new 138	java/lang/StringBuilder
    //   77: dup
    //   78: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   81: ldc_w 395
    //   84: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   87: aload 7
    //   89: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   92: ldc_w 397
    //   95: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   98: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   101: invokespecial 398	com/flurry/sdk/jh:<init>	(Ljava/lang/String;)V
    //   104: athrow
    //   105: astore 18
    //   107: new 393	com/flurry/sdk/jh
    //   110: dup
    //   111: new 138	java/lang/StringBuilder
    //   114: dup
    //   115: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   118: ldc_w 400
    //   121: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   124: aload_3
    //   125: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   128: ldc_w 402
    //   131: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload 6
    //   136: invokevirtual 49	java/lang/Class:getName	()Ljava/lang/String;
    //   139: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   142: ldc_w 404
    //   145: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   148: aload_2
    //   149: invokevirtual 408	com/flurry/sdk/mm:b	()Ljava/lang/String;
    //   152: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc_w 410
    //   158: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: aload 18
    //   163: invokevirtual 413	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   166: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   169: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   172: aconst_null
    //   173: aload 18
    //   175: invokespecial 416	com/flurry/sdk/jh:<init>	(Ljava/lang/String;Lcom/flurry/sdk/hg;Ljava/lang/Throwable;)V
    //   178: athrow
    //   179: aload 7
    //   181: checkcast 258	com/flurry/sdk/qn
    //   184: aload 8
    //   186: invokevirtual 418	com/flurry/sdk/qn:d	(Ljava/lang/Class;)Lcom/flurry/sdk/sh;
    //   189: astore 17
    //   191: aload 17
    //   193: astore 7
    //   195: aload 7
    //   197: invokevirtual 389	com/flurry/sdk/sh:k	()Lcom/flurry/sdk/sh;
    //   200: astore 9
    //   202: aload 9
    //   204: ifnull +44 -> 248
    //   207: aload 9
    //   209: invokevirtual 121	com/flurry/sdk/sh:n	()Ljava/lang/Object;
    //   212: ifnonnull +36 -> 248
    //   215: aload 5
    //   217: aload_2
    //   218: invokevirtual 422	com/flurry/sdk/iq:i	(Lcom/flurry/sdk/mm;)Ljava/lang/Class;
    //   221: astore 15
    //   223: aload 15
    //   225: ifnull +23 -> 248
    //   228: aload 15
    //   230: ldc_w 424
    //   233: if_acmpeq +15 -> 248
    //   236: aload 9
    //   238: aload_1
    //   239: aload_2
    //   240: aload 15
    //   242: invokevirtual 427	com/flurry/sdk/iy:b	(Lcom/flurry/sdk/mm;Ljava/lang/Class;)Lcom/flurry/sdk/jl;
    //   245: invokevirtual 430	com/flurry/sdk/sh:j	(Ljava/lang/Object;)V
    //   248: aload 5
    //   250: aload_2
    //   251: aload 7
    //   253: invokevirtual 431	com/flurry/sdk/sh:g	()Lcom/flurry/sdk/sh;
    //   256: aload 4
    //   258: invokevirtual 433	com/flurry/sdk/iq:c	(Lcom/flurry/sdk/mm;Lcom/flurry/sdk/sh;Ljava/lang/String;)Ljava/lang/Class;
    //   261: astore 10
    //   263: aload 10
    //   265: ifnull +16 -> 281
    //   268: aload 7
    //   270: aload 10
    //   272: invokevirtual 435	com/flurry/sdk/sh:b	(Ljava/lang/Class;)Lcom/flurry/sdk/sh;
    //   275: astore 14
    //   277: aload 14
    //   279: astore 7
    //   281: aload 7
    //   283: invokevirtual 431	com/flurry/sdk/sh:g	()Lcom/flurry/sdk/sh;
    //   286: invokevirtual 121	com/flurry/sdk/sh:n	()Ljava/lang/Object;
    //   289: ifnonnull +43 -> 332
    //   292: aload 5
    //   294: aload_2
    //   295: invokevirtual 437	com/flurry/sdk/iq:j	(Lcom/flurry/sdk/mm;)Ljava/lang/Class;
    //   298: astore 11
    //   300: aload 11
    //   302: ifnull +30 -> 332
    //   305: aload 11
    //   307: ldc_w 439
    //   310: if_acmpeq +22 -> 332
    //   313: aload_1
    //   314: aload_2
    //   315: aload 11
    //   317: invokevirtual 342	com/flurry/sdk/iy:a	(Lcom/flurry/sdk/mm;Ljava/lang/Class;)Lcom/flurry/sdk/jg;
    //   320: astore 12
    //   322: aload 7
    //   324: invokevirtual 431	com/flurry/sdk/sh:g	()Lcom/flurry/sdk/sh;
    //   327: aload 12
    //   329: invokevirtual 430	com/flurry/sdk/sh:j	(Ljava/lang/Object;)V
    //   332: aload 7
    //   334: areturn
    //   335: astore 16
    //   337: new 393	com/flurry/sdk/jh
    //   340: dup
    //   341: new 138	java/lang/StringBuilder
    //   344: dup
    //   345: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   348: ldc_w 441
    //   351: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   354: aload 7
    //   356: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   359: ldc_w 443
    //   362: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   365: aload 8
    //   367: invokevirtual 49	java/lang/Class:getName	()Ljava/lang/String;
    //   370: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   373: ldc_w 445
    //   376: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: aload 16
    //   381: invokevirtual 413	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   384: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   387: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   390: aconst_null
    //   391: aload 16
    //   393: invokespecial 416	com/flurry/sdk/jh:<init>	(Ljava/lang/String;Lcom/flurry/sdk/hg;Ljava/lang/Throwable;)V
    //   396: athrow
    //   397: astore 13
    //   399: new 393	com/flurry/sdk/jh
    //   402: dup
    //   403: new 138	java/lang/StringBuilder
    //   406: dup
    //   407: invokespecial 139	java/lang/StringBuilder:<init>	()V
    //   410: ldc_w 447
    //   413: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   416: aload 7
    //   418: invokevirtual 148	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   421: ldc_w 449
    //   424: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: aload 10
    //   429: invokevirtual 49	java/lang/Class:getName	()Ljava/lang/String;
    //   432: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: ldc_w 445
    //   438: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   441: aload 13
    //   443: invokevirtual 413	java/lang/IllegalArgumentException:getMessage	()Ljava/lang/String;
    //   446: invokevirtual 145	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: invokevirtual 153	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   452: aconst_null
    //   453: aload 13
    //   455: invokespecial 416	com/flurry/sdk/jh:<init>	(Ljava/lang/String;Lcom/flurry/sdk/hg;Ljava/lang/Throwable;)V
    //   458: athrow
    //   459: aload_3
    //   460: astore 7
    //   462: goto -428 -> 34
    //
    // Exception table:
    //   from	to	target	type
    //   22	30	105	java/lang/IllegalArgumentException
    //   179	191	335	java/lang/IllegalArgumentException
    //   268	277	397	java/lang/IllegalArgumentException
  }

  protected sh a(iy paramiy, mw parammw, sh paramsh, mq parammq, is paramis)
  {
    if (paramsh.f())
    {
      iq localiq = paramiy.a();
      sh localsh = paramsh.k();
      if (localsh != null)
      {
        Class localClass2 = localiq.i(parammq);
        if ((localClass2 != null) && (localClass2 != jl.a.class))
          localsh.j(paramiy.b(parammq, localClass2));
      }
      Class localClass1 = localiq.j(parammq);
      if ((localClass1 != null) && (localClass1 != jg.a.class))
      {
        jg localjg = paramiy.a(parammq, localClass1);
        paramsh.g().j(localjg);
      }
      if ((parammq instanceof mq))
      {
        jy localjy2 = b(paramiy, paramsh, parammq, paramis);
        if (localjy2 != null)
          paramsh = paramsh.e(localjy2);
      }
    }
    if ((parammq instanceof mq));
    for (jy localjy1 = a(paramiy, paramsh, parammq, paramis); ; localjy1 = b(paramiy, paramsh, null))
    {
      if (localjy1 != null)
        paramsh = paramsh.f(localjy1);
      return paramsh;
    }
  }

  public abstract sh a(iy paramiy, sh paramsh);

  public jg<?> b(iy paramiy, jc paramjc, sh paramsh, is paramis)
  {
    mw localmw = (mw)paramiy.c(paramsh);
    jg localjg1 = a(paramiy, localmw.c(), paramis);
    if (localjg1 != null)
      return localjg1;
    Class localClass = paramsh.p();
    jg localjg2 = a(localClass, paramiy, localmw, paramis);
    if (localjg2 != null)
      return localjg2;
    Iterator localIterator = localmw.o().iterator();
    while (localIterator.hasNext())
    {
      mr localmr = (mr)localIterator.next();
      if (paramiy.a().k(localmr))
      {
        if ((localmr.f() == 1) && (localmr.d().isAssignableFrom(localClass)))
          return lq.a(paramiy, localClass, localmr);
        throw new IllegalArgumentException("Unsuitable method (" + localmr + ") decorated with @JsonCreator (for Enum type " + localClass.getName() + ")");
      }
    }
    return new lq(a(localClass, paramiy));
  }

  public jy b(iy paramiy, sh paramsh, is paramis)
  {
    mn localmn = ((mw)paramiy.c(paramsh.p())).c();
    iq localiq = paramiy.a();
    ni localni1 = localiq.a(paramiy, localmn, paramsh);
    ni localni3;
    Collection localCollection;
    ni localni2;
    if (localni1 == null)
    {
      localni3 = paramiy.d(paramsh);
      if (localni3 == null)
        return null;
    }
    else
    {
      localCollection = paramiy.l().a(localmn, paramiy, localiq);
      localni2 = localni1;
    }
    while (true)
    {
      if ((localni2.a() == null) && (paramsh.c()))
      {
        sh localsh = a(paramiy, paramsh);
        if ((localsh != null) && (localsh.p() != paramsh.p()))
          localni2 = localni2.a(localsh.p());
      }
      return localni2.a(paramiy, paramsh, localCollection, paramis);
      localni2 = localni3;
      localCollection = null;
    }
  }

  public jy b(iy paramiy, sh paramsh, mq parammq, is paramis)
  {
    iq localiq = paramiy.a();
    ni localni = localiq.b(paramiy, parammq, paramsh);
    sh localsh = paramsh.g();
    if (localni == null)
      return b(paramiy, localsh, paramis);
    return localni.a(paramiy, localsh, paramiy.l().a(parammq, paramiy, localiq), paramis);
  }

  public jg<?> c(iy paramiy, jc paramjc, sh paramsh, is paramis)
  {
    Class localClass = paramsh.p();
    jg localjg = a(localClass, paramiy, paramis);
    if (localjg != null)
      return localjg;
    return lv.a(localClass);
  }

  protected jg<Object> d(iy paramiy, jc paramjc, sh paramsh, is paramis)
  {
    Class localClass = paramsh.p();
    jg localjg = (jg)b.get(new qj(localClass));
    if (localjg != null);
    do
    {
      return localjg;
      if (AtomicReference.class.isAssignableFrom(localClass))
      {
        sh[] arrayOfsh = paramiy.m().b(paramsh, AtomicReference.class);
        if ((arrayOfsh == null) || (arrayOfsh.length <= 0));
        for (sh localsh = qs.b(); ; localsh = arrayOfsh[0])
          return new lj(localsh, paramis);
      }
      localjg = this.g.a(paramsh, paramiy, paramjc);
    }
    while (localjg != null);
    return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.kn
 * JD-Core Version:    0.6.2
 */