package textnow.am;

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
import textnow.ap.m;
import textnow.ap.n;

public final class e
{
  final i a = new i()
  {
  };
  final p b = new p()
  {
  };
  private final ThreadLocal<Map<textnow.aq.a<?>, f<?>>> c = new ThreadLocal();
  private final Map<textnow.aq.a<?>, s<?>> d = Collections.synchronizedMap(new HashMap());
  private final List<t> e;
  private final textnow.ao.f f;
  private final boolean g;
  private final boolean h;
  private final boolean i;
  private final boolean j;

  public e()
  {
    this(textnow.ao.g.a, c.a, Collections.emptyMap(), false, false, false, true, false, false, r.a, Collections.emptyList());
  }

  private e(textnow.ao.g paramg, d paramd, Map<Type, g<?>> paramMap, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, r paramr, List<t> paramList)
  {
    this.f = new textnow.ao.f(paramMap);
    this.g = false;
    this.i = false;
    this.h = true;
    this.j = false;
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(textnow.ap.p.Q);
    localArrayList.add(textnow.ap.i.a);
    localArrayList.add(paramg);
    localArrayList.addAll(paramList);
    localArrayList.add(textnow.ap.p.x);
    localArrayList.add(textnow.ap.p.m);
    localArrayList.add(textnow.ap.p.g);
    localArrayList.add(textnow.ap.p.i);
    localArrayList.add(textnow.ap.p.k);
    Class localClass = Long.TYPE;
    if (paramr == r.a);
    for (Object localObject = textnow.ap.p.n; ; localObject = new s()
    {
    })
    {
      localArrayList.add(textnow.ap.p.a(localClass, Long.class, (s)localObject));
      localArrayList.add(textnow.ap.p.a(Double.TYPE, Double.class, new s()
      {
      }));
      localArrayList.add(textnow.ap.p.a(Float.TYPE, Float.class, new s()
      {
      }));
      localArrayList.add(textnow.ap.p.r);
      localArrayList.add(textnow.ap.p.t);
      localArrayList.add(textnow.ap.p.z);
      localArrayList.add(textnow.ap.p.B);
      localArrayList.add(textnow.ap.p.a(BigDecimal.class, textnow.ap.p.v));
      localArrayList.add(textnow.ap.p.a(BigInteger.class, textnow.ap.p.w));
      localArrayList.add(textnow.ap.p.D);
      localArrayList.add(textnow.ap.p.F);
      localArrayList.add(textnow.ap.p.J);
      localArrayList.add(textnow.ap.p.O);
      localArrayList.add(textnow.ap.p.H);
      localArrayList.add(textnow.ap.p.d);
      localArrayList.add(textnow.ap.d.a);
      localArrayList.add(textnow.ap.p.M);
      localArrayList.add(n.a);
      localArrayList.add(m.a);
      localArrayList.add(textnow.ap.p.K);
      localArrayList.add(textnow.ap.a.a);
      localArrayList.add(textnow.ap.p.R);
      localArrayList.add(textnow.ap.p.b);
      localArrayList.add(new textnow.ap.b(this.f));
      localArrayList.add(new textnow.ap.g(this.f, false));
      localArrayList.add(new textnow.ap.j(this.f, paramd, paramg));
      this.e = Collections.unmodifiableList(localArrayList);
      return;
    }
  }

  // ERROR //
  private <T> T a(textnow.ar.a parama, Type paramType)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_3
    //   2: aload_1
    //   3: invokevirtual 260	textnow/ar/a:p	()Z
    //   6: istore 4
    //   8: aload_1
    //   9: iload_3
    //   10: invokevirtual 263	textnow/ar/a:a	(Z)V
    //   13: aload_1
    //   14: invokevirtual 266	textnow/ar/a:f	()Ltextnow/ar/b;
    //   17: pop
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_0
    //   21: aload_2
    //   22: invokestatic 271	textnow/aq/a:a	(Ljava/lang/reflect/Type;)Ltextnow/aq/a;
    //   25: invokevirtual 274	textnow/am/e:a	(Ltextnow/aq/a;)Ltextnow/am/s;
    //   28: aload_1
    //   29: invokevirtual 279	textnow/am/s:a	(Ltextnow/ar/a;)Ljava/lang/Object;
    //   32: astore 10
    //   34: aload_1
    //   35: iload 4
    //   37: invokevirtual 263	textnow/ar/a:a	(Z)V
    //   40: aload 10
    //   42: areturn
    //   43: astore 8
    //   45: iload_3
    //   46: ifeq +11 -> 57
    //   49: aload_1
    //   50: iload 4
    //   52: invokevirtual 263	textnow/ar/a:a	(Z)V
    //   55: aconst_null
    //   56: areturn
    //   57: new 281	textnow/am/q
    //   60: dup
    //   61: aload 8
    //   63: invokespecial 284	textnow/am/q:<init>	(Ljava/lang/Throwable;)V
    //   66: athrow
    //   67: astore 6
    //   69: aload_1
    //   70: iload 4
    //   72: invokevirtual 263	textnow/ar/a:a	(Z)V
    //   75: aload 6
    //   77: athrow
    //   78: astore 7
    //   80: new 281	textnow/am/q
    //   83: dup
    //   84: aload 7
    //   86: invokespecial 284	textnow/am/q:<init>	(Ljava/lang/Throwable;)V
    //   89: athrow
    //   90: astore 5
    //   92: new 281	textnow/am/q
    //   95: dup
    //   96: aload 5
    //   98: invokespecial 284	textnow/am/q:<init>	(Ljava/lang/Throwable;)V
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

  private textnow.ar.c a(Writer paramWriter)
  {
    if (this.i)
      paramWriter.write(")]}'\n");
    textnow.ar.c localc = new textnow.ar.c(paramWriter);
    if (this.j)
      localc.c("  ");
    localc.d(this.g);
    return localc;
  }

  private void a(Object paramObject, Type paramType, Appendable paramAppendable)
  {
    try
    {
      textnow.ar.c localc = a(textnow.ao.s.a(paramAppendable));
      s locals = a(textnow.aq.a.a(paramType));
      boolean bool1 = localc.g();
      localc.b(true);
      boolean bool2 = localc.h();
      localc.c(this.h);
      boolean bool3 = localc.i();
      localc.d(this.g);
      try
      {
        locals.a(localc, paramObject);
        return;
      }
      catch (IOException localIOException2)
      {
        throw new k(localIOException2);
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
      throw new k(localIOException1);
    }
  }

  private static void a(Object paramObject, textnow.ar.a parama)
  {
    if (paramObject != null)
      try
      {
        if (parama.f() != textnow.ar.b.j)
          throw new k("JSON document was not fully consumed.");
      }
      catch (textnow.ar.d locald)
      {
        throw new q(locald);
      }
      catch (IOException localIOException)
      {
        throw new k(localIOException);
      }
  }

  private void a(j paramj, Appendable paramAppendable)
  {
    try
    {
      textnow.ar.c localc = a(textnow.ao.s.a(paramAppendable));
      boolean bool1 = localc.g();
      localc.b(true);
      boolean bool2 = localc.h();
      localc.c(this.h);
      boolean bool3 = localc.i();
      localc.d(this.g);
      try
      {
        textnow.ao.s.a(paramj, localc);
        return;
      }
      catch (IOException localIOException2)
      {
        throw new k(localIOException2);
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
    Object localObject;
    if (paramString == null)
      localObject = null;
    while (true)
    {
      return textnow.ao.r.a(paramClass).cast(localObject);
      textnow.ar.a locala = new textnow.ar.a(new StringReader(paramString));
      localObject = a(locala, paramClass);
      a(localObject, locala);
    }
  }

  public final String a(Object paramObject)
  {
    if (paramObject == null)
    {
      l locall = l.a;
      StringWriter localStringWriter2 = new StringWriter();
      a(locall, localStringWriter2);
      return localStringWriter2.toString();
    }
    Class localClass = paramObject.getClass();
    StringWriter localStringWriter1 = new StringWriter();
    a(paramObject, localClass, localStringWriter1);
    return localStringWriter1.toString();
  }

  public final <T> s<T> a(Class<T> paramClass)
  {
    return a(textnow.aq.a.a(paramClass));
  }

  public final <T> s<T> a(t paramt, textnow.aq.a<T> parama)
  {
    Iterator localIterator = this.e.iterator();
    int k = 0;
    while (localIterator.hasNext())
    {
      t localt = (t)localIterator.next();
      if (k == 0)
      {
        if (localt == paramt)
          k = 1;
      }
      else
      {
        s locals = localt.a(this, parama);
        if (locals != null)
          return locals;
      }
    }
    throw new IllegalArgumentException("GSON cannot serialize " + parama);
  }

  public final <T> s<T> a(textnow.aq.a<T> parama)
  {
    Object localObject1 = (s)this.d.get(parama);
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
        localObject1 = (f)((Map)localObject2).get(parama);
        if (localObject1 != null)
          break;
        try
        {
          f localf = new f();
          ((Map)localObject2).put(parama, localf);
          Iterator localIterator = this.e.iterator();
          while (localIterator.hasNext())
          {
            localObject1 = ((t)localIterator.next()).a(this, parama);
            if (localObject1 != null)
            {
              localf.a((s)localObject1);
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
 * Qualified Name:     textnow.am.e
 * JD-Core Version:    0.6.2
 */