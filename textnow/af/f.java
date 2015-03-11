package textnow.af;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import textnow.ah.q;
import textnow.ai.j;
import textnow.ak.c;

public final class f
{
  final k a = new k()
  {
  };
  final s b = new s()
  {
  };
  private final ThreadLocal<Map<textnow.aj.a<?>, g<?>>> c = new ThreadLocal();
  private final Map<textnow.aj.a<?>, y<?>> d = Collections.synchronizedMap(new HashMap());
  private final List<z> e;
  private final textnow.ah.f f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;

  public f()
  {
    this(textnow.ah.g.a, d.a, Collections.emptyMap(), false, false, false, true, false, false, v.a, Collections.emptyList());
  }

  f(textnow.ah.g paramg, e parame, Map<Type, i<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, v paramv, List<z> paramList)
  {
    this.f = new textnow.ah.f(paramMap);
    this.g = paramBoolean1;
    this.i = paramBoolean3;
    this.h = paramBoolean4;
    this.j = paramBoolean5;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(textnow.ai.p.Q);
    localArrayList.add(textnow.ai.i.a);
    localArrayList.add(paramg);
    localArrayList.addAll(paramList);
    localArrayList.add(textnow.ai.p.x);
    localArrayList.add(textnow.ai.p.m);
    localArrayList.add(textnow.ai.p.g);
    localArrayList.add(textnow.ai.p.i);
    localArrayList.add(textnow.ai.p.k);
    Class localClass1 = Long.TYPE;
    Object localObject1;
    Object localObject2;
    label244: Class localClass3;
    if (paramv == v.a)
    {
      localObject1 = textnow.ai.p.n;
      localArrayList.add(textnow.ai.p.a(localClass1, Long.class, (y)localObject1));
      Class localClass2 = Double.TYPE;
      if (!paramBoolean6)
        break label607;
      localObject2 = textnow.ai.p.p;
      localArrayList.add(textnow.ai.p.a(localClass2, Double.class, (y)localObject2));
      localClass3 = Float.TYPE;
      if (!paramBoolean6)
        break label620;
    }
    label607: label620: for (Object localObject3 = textnow.ai.p.o; ; localObject3 = new y()
    {
    })
    {
      localArrayList.add(textnow.ai.p.a(localClass3, Float.class, (y)localObject3));
      localArrayList.add(textnow.ai.p.r);
      localArrayList.add(textnow.ai.p.t);
      localArrayList.add(textnow.ai.p.z);
      localArrayList.add(textnow.ai.p.B);
      localArrayList.add(textnow.ai.p.a(BigDecimal.class, textnow.ai.p.v));
      localArrayList.add(textnow.ai.p.a(BigInteger.class, textnow.ai.p.w));
      localArrayList.add(textnow.ai.p.D);
      localArrayList.add(textnow.ai.p.F);
      localArrayList.add(textnow.ai.p.J);
      localArrayList.add(textnow.ai.p.O);
      localArrayList.add(textnow.ai.p.H);
      localArrayList.add(textnow.ai.p.d);
      localArrayList.add(textnow.ai.d.a);
      localArrayList.add(textnow.ai.p.M);
      localArrayList.add(textnow.ai.n.a);
      localArrayList.add(textnow.ai.m.a);
      localArrayList.add(textnow.ai.p.K);
      localArrayList.add(textnow.ai.a.a);
      localArrayList.add(textnow.ai.p.R);
      localArrayList.add(textnow.ai.p.b);
      localArrayList.add(new textnow.ai.b(this.f));
      localArrayList.add(new textnow.ai.g(this.f, paramBoolean2));
      localArrayList.add(new j(this.f, parame, paramg));
      this.e = Collections.unmodifiableList(localArrayList);
      return;
      localObject1 = new y()
      {
      };
      break;
      localObject2 = new y()
      {
      };
      break label244;
    }
  }

  private c a(Writer paramWriter)
  {
    if (this.i)
      paramWriter.write(")]}'\n");
    c localc = new c(paramWriter);
    if (this.j)
      localc.c("  ");
    localc.d(this.g);
    return localc;
  }

  private void a(Object paramObject, Type paramType, Appendable paramAppendable)
  {
    try
    {
      c localc = a(q.a(paramAppendable));
      y localy = a(textnow.aj.a.a(paramType));
      boolean bool1 = localc.g();
      localc.b(true);
      boolean bool2 = localc.h();
      localc.c(this.h);
      boolean bool3 = localc.i();
      localc.d(this.g);
      try
      {
        localy.a(localc, paramObject);
        return;
      }
      catch (IOException localIOException2)
      {
        throw new n(localIOException2);
      }
      finally
      {
        localc.b(bool1);
        localc.c(bool2);
        localc.d(bool3);
      }
    }
    catch (IOException localIOException1)
    {
      throw new n(localIOException1);
    }
  }

  private static void a(Object paramObject, textnow.ak.a parama)
  {
    if (paramObject != null)
      try
      {
        if (parama.f() != textnow.ak.b.j)
          throw new n("JSON document was not fully consumed.");
      }
      catch (textnow.ak.d locald)
      {
        throw new u(locald);
      }
      catch (IOException localIOException)
      {
        throw new n(localIOException);
      }
  }

  private void a(m paramm, Appendable paramAppendable)
  {
    try
    {
      c localc = a(q.a(paramAppendable));
      boolean bool1 = localc.g();
      localc.b(true);
      boolean bool2 = localc.h();
      localc.c(this.h);
      boolean bool3 = localc.i();
      localc.d(this.g);
      try
      {
        q.a(paramm, localc);
        return;
      }
      catch (IOException localIOException2)
      {
        throw new n(localIOException2);
      }
      finally
      {
        localc.b(bool1);
        localc.c(bool2);
        localc.d(bool3);
      }
    }
    catch (IOException localIOException1)
    {
      throw new RuntimeException(localIOException1);
    }
  }

  public final <T> T a(String paramString, Class<T> paramClass)
  {
    Object localObject = a(paramString, paramClass);
    return textnow.ah.p.a(paramClass).cast(localObject);
  }

  public final <T> T a(String paramString, Type paramType)
  {
    if (paramString == null)
      return null;
    textnow.ak.a locala = new textnow.ak.a(new StringReader(paramString));
    Object localObject = a(locala, paramType);
    a(localObject, locala);
    return localObject;
  }

  // ERROR //
  public final <T> T a(textnow.ak.a parama, Type paramType)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 401	textnow/ak/a:p	()Z
    //   6: istore 4
    //   8: aload_1
    //   9: iload_3
    //   10: invokevirtual 403	textnow/ak/a:a	(Z)V
    //   13: aload_1
    //   14: invokevirtual 321	textnow/ak/a:f	()Ltextnow/ak/b;
    //   17: pop
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_0
    //   21: aload_2
    //   22: invokestatic 289	textnow/aj/a:a	(Ljava/lang/reflect/Type;)Ltextnow/aj/a;
    //   25: invokevirtual 292	textnow/af/f:a	(Ltextnow/aj/a;)Ltextnow/af/y;
    //   28: aload_1
    //   29: invokevirtual 406	textnow/af/y:a	(Ltextnow/ak/a;)Ljava/lang/Object;
    //   32: astore 10
    //   34: aload_1
    //   35: iload 4
    //   37: invokevirtual 403	textnow/ak/a:a	(Z)V
    //   40: aload 10
    //   42: areturn
    //   43: astore 8
    //   45: iload_3
    //   46: ifeq +11 -> 57
    //   49: aload_1
    //   50: iload 4
    //   52: invokevirtual 403	textnow/ak/a:a	(Z)V
    //   55: aconst_null
    //   56: areturn
    //   57: new 332	textnow/af/u
    //   60: dup
    //   61: aload 8
    //   63: invokespecial 333	textnow/af/u:<init>	(Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore 6
    //   69: aload_1
    //   70: iload 4
    //   72: invokevirtual 403	textnow/ak/a:a	(Z)V
    //   75: aload 6
    //   77: athrow
    //   78: astore 7
    //   80: new 332	textnow/af/u
    //   83: dup
    //   84: aload 7
    //   86: invokespecial 333	textnow/af/u:<init>	(Ljava/lang/Throwable;)V
    //   89: athrow
    //   90: astore 5
    //   92: new 332	textnow/af/u
    //   95: dup
    //   96: aload 5
    //   98: invokespecial 333	textnow/af/u:<init>	(Ljava/lang/Throwable;)V
    //   101: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   13	18	43	java/io/EOFException
    //   20	34	43	java/io/EOFException
    //   13	18	67	finally
    //   20	34	67	finally
    //   57	67	67	finally
    //   80	90	67	finally
    //   92	102	67	finally
    //   13	18	78	java/lang/IllegalStateException
    //   20	34	78	java/lang/IllegalStateException
    //   13	18	90	java/io/IOException
    //   20	34	90	java/io/IOException
  }

  public final String a(Object paramObject)
  {
    if (paramObject == null)
    {
      o localo = o.a;
      StringWriter localStringWriter2 = new StringWriter();
      a(localo, localStringWriter2);
      return localStringWriter2.toString();
    }
    Class localClass = paramObject.getClass();
    StringWriter localStringWriter1 = new StringWriter();
    a(paramObject, localClass, localStringWriter1);
    return localStringWriter1.toString();
  }

  public final <T> y<T> a(Class<T> paramClass)
  {
    return a(textnow.aj.a.a(paramClass));
  }

  public final <T> y<T> a(z paramz, textnow.aj.a<T> parama)
  {
    Iterator localIterator = this.e.iterator();
    int k = 0;
    while (localIterator.hasNext())
    {
      z localz = (z)localIterator.next();
      if (k == 0)
      {
        if (localz == paramz)
          k = 1;
      }
      else
      {
        y localy = localz.a(this, parama);
        if (localy != null)
          return localy;
      }
    }
    throw new IllegalArgumentException("GSON cannot serialize " + parama);
  }

  public final <T> y<T> a(textnow.aj.a<T> parama)
  {
    Object localObject1 = (y)this.d.get(parama);
    if (localObject1 != null)
      return localObject1;
    Map localMap = (Map)this.c.get();
    Object localObject2;
    if (localMap == null)
    {
      HashMap localHashMap = new HashMap();
      this.c.set(localHashMap);
      localObject2 = localHashMap;
    }
    for (int k = 1; ; k = 0)
    {
      while (true)
      {
        localObject1 = (g)((Map)localObject2).get(parama);
        if (localObject1 != null)
          break;
        try
        {
          g localg = new g();
          ((Map)localObject2).put(parama, localg);
          Iterator localIterator = this.e.iterator();
          while (localIterator.hasNext())
          {
            localObject1 = ((z)localIterator.next()).a(this, parama);
            if (localObject1 != null)
            {
              localg.a((y)localObject1);
              this.d.put(parama, localObject1);
              return localObject1;
            }
          }
          throw new IllegalArgumentException("GSON cannot handle " + parama);
        }
        finally
        {
          ((Map)localObject2).remove(parama);
          if (k != 0)
            this.c.remove();
        }
      }
      localObject2 = localMap;
    }
  }

  public final String toString()
  {
    return "{serializeNulls:" + this.g + "factories:" + this.e + ",instanceCreators:" + this.f + "}";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.af.f
 * JD-Core Version:    0.6.2
 */