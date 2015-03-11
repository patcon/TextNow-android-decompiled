package com.flurry.sdk;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.ConcurrentHashMap;

public class jq extends hn
{
  protected static final iu<? extends ir> a = mx.i;
  protected static final iq b = new my();
  protected static final ne<?> c = ne.a.a();
  private static final sh n = qp.d(hh.class);
  protected final hd d;
  protected ng e;
  protected qs f;
  protected jf g;
  protected ju h;
  protected jw i;
  protected jv j;
  protected iy k;
  protected jc l;
  protected final ConcurrentHashMap<sh, jg<Object>> m = new ConcurrentHashMap(64, 0.6F, 2);

  public jq()
  {
    this(null, null, null);
  }

  public jq(hd paramhd)
  {
    this(paramhd, null, null);
  }

  public jq(hd paramhd, jw paramjw, jc paramjc)
  {
    this(paramhd, paramjw, paramjc, null, null);
  }

  public jq(hd paramhd, jw paramjw, jc paramjc, ju paramju, iy paramiy)
  {
    if (paramhd == null)
    {
      this.d = new jo(this);
      this.f = qs.a();
      if (paramju == null)
        break label131;
      label48: this.h = paramju;
      if (paramiy == null)
        break label159;
    }
    while (true)
    {
      this.k = paramiy;
      if (paramjw == null)
        paramjw = new or();
      this.i = paramjw;
      if (paramjc == null)
        paramjc = new kv();
      this.l = paramjc;
      this.j = ol.e;
      return;
      this.d = paramhd;
      if (paramhd.a() != null)
        break;
      this.d.a(this);
      break;
      label131: paramju = new ju(a, b, c, null, null, this.f, null);
      break label48;
      label159: paramiy = new iy(a, b, c, null, null, this.f, null);
    }
  }

  // ERROR //
  private final void a(hf paramhf, Object paramObject, ju paramju)
  {
    // Byte code:
    //   0: aload_2
    //   1: checkcast 139	java/io/Closeable
    //   4: astore 4
    //   6: aload_0
    //   7: getfield 106	com/flurry/sdk/jq:i	Lcom/flurry/sdk/jw;
    //   10: aload_3
    //   11: aload_1
    //   12: aload_2
    //   13: aload_0
    //   14: getfield 118	com/flurry/sdk/jq:j	Lcom/flurry/sdk/jv;
    //   17: invokevirtual 144	com/flurry/sdk/jw:a	(Lcom/flurry/sdk/ju;Lcom/flurry/sdk/hf;Ljava/lang/Object;Lcom/flurry/sdk/jv;)V
    //   20: aload_1
    //   21: invokevirtual 149	com/flurry/sdk/hf:close	()V
    //   24: aload 4
    //   26: invokeinterface 150 1 0
    //   31: return
    //   32: astore 5
    //   34: aload 4
    //   36: astore 6
    //   38: aload 5
    //   40: astore 7
    //   42: aload_1
    //   43: ifnull +7 -> 50
    //   46: aload_1
    //   47: invokevirtual 149	com/flurry/sdk/hf:close	()V
    //   50: aload 6
    //   52: ifnull +10 -> 62
    //   55: aload 6
    //   57: invokeinterface 150 1 0
    //   62: aload 7
    //   64: athrow
    //   65: astore 9
    //   67: goto -17 -> 50
    //   70: astore 8
    //   72: goto -10 -> 62
    //   75: astore 10
    //   77: aload 10
    //   79: astore 7
    //   81: aload 4
    //   83: astore 6
    //   85: aconst_null
    //   86: astore_1
    //   87: goto -45 -> 42
    //   90: astore 7
    //   92: aconst_null
    //   93: astore 6
    //   95: aconst_null
    //   96: astore_1
    //   97: goto -55 -> 42
    //
    // Exception table:
    //   from	to	target	type
    //   6	20	32	finally
    //   46	50	65	java/io/IOException
    //   55	62	70	java/io/IOException
    //   20	24	75	finally
    //   24	31	90	finally
  }

  // ERROR //
  private final void b(hf paramhf, Object paramObject, ju paramju)
  {
    // Byte code:
    //   0: aload_2
    //   1: checkcast 139	java/io/Closeable
    //   4: astore 4
    //   6: aload_0
    //   7: getfield 106	com/flurry/sdk/jq:i	Lcom/flurry/sdk/jw;
    //   10: aload_3
    //   11: aload_1
    //   12: aload_2
    //   13: aload_0
    //   14: getfield 118	com/flurry/sdk/jq:j	Lcom/flurry/sdk/jv;
    //   17: invokevirtual 144	com/flurry/sdk/jw:a	(Lcom/flurry/sdk/ju;Lcom/flurry/sdk/hf;Ljava/lang/Object;Lcom/flurry/sdk/jv;)V
    //   20: aload_3
    //   21: getstatic 156	com/flurry/sdk/ju$a:p	Lcom/flurry/sdk/ju$a;
    //   24: invokevirtual 159	com/flurry/sdk/ju:a	(Lcom/flurry/sdk/ju$a;)Z
    //   27: ifeq +7 -> 34
    //   30: aload_1
    //   31: invokevirtual 161	com/flurry/sdk/hf:g	()V
    //   34: aload 4
    //   36: invokeinterface 150 1 0
    //   41: return
    //   42: astore 5
    //   44: aload 4
    //   46: astore 6
    //   48: aload 5
    //   50: astore 7
    //   52: aload 6
    //   54: ifnull +10 -> 64
    //   57: aload 6
    //   59: invokeinterface 150 1 0
    //   64: aload 7
    //   66: athrow
    //   67: astore 8
    //   69: goto -5 -> 64
    //   72: astore 7
    //   74: aconst_null
    //   75: astore 6
    //   77: goto -25 -> 52
    //
    // Exception table:
    //   from	to	target	type
    //   6	34	42	finally
    //   57	64	67	java/io/IOException
    //   34	41	72	finally
  }

  public hh a(hj paramhj)
  {
    iy localiy = b();
    hh localhh;
    if ((paramhj.e() == null) && (paramhj.b() == null))
      localhh = null;
    do
    {
      return localhh;
      localhh = (hh)a(localiy, paramhj, n);
    }
    while (localhh != null);
    return c().a();
  }

  protected iz a(hj paramhj, iy paramiy)
  {
    return new ku(paramiy, paramhj, this.l, this.g);
  }

  protected jg<Object> a(iy paramiy, sh paramsh)
  {
    jg localjg1 = (jg)this.m.get(paramsh);
    if (localjg1 != null)
      return localjg1;
    jg localjg2 = this.l.b(paramiy, paramsh, null);
    if (localjg2 == null)
      throw new jh("Can not find a deserializer for type " + paramsh);
    this.m.put(paramsh, localjg2);
    return localjg2;
  }

  public jq a(ju.a parama, boolean paramBoolean)
  {
    this.h.a(parama, paramBoolean);
    return this;
  }

  public ju a()
  {
    return this.h.a(this.e);
  }

  // ERROR //
  protected Object a(hj paramhj, sh paramsh)
  {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: invokevirtual 242	com/flurry/sdk/jq:b	(Lcom/flurry/sdk/hj;)Lcom/flurry/sdk/hm;
    //   5: astore 5
    //   7: aload 5
    //   9: getstatic 247	com/flurry/sdk/hm:m	Lcom/flurry/sdk/hm;
    //   12: if_acmpne +28 -> 40
    //   15: aload_0
    //   16: aload_0
    //   17: getfield 101	com/flurry/sdk/jq:k	Lcom/flurry/sdk/iy;
    //   20: aload_2
    //   21: invokevirtual 249	com/flurry/sdk/jq:a	(Lcom/flurry/sdk/iy;Lcom/flurry/sdk/sh;)Lcom/flurry/sdk/jg;
    //   24: invokevirtual 252	com/flurry/sdk/jg:b	()Ljava/lang/Object;
    //   27: astore 6
    //   29: aload_1
    //   30: invokevirtual 254	com/flurry/sdk/hj:f	()V
    //   33: aload_1
    //   34: invokevirtual 255	com/flurry/sdk/hj:close	()V
    //   37: aload 6
    //   39: areturn
    //   40: aload 5
    //   42: getstatic 257	com/flurry/sdk/hm:e	Lcom/flurry/sdk/hm;
    //   45: if_acmpeq +98 -> 143
    //   48: aload 5
    //   50: getstatic 259	com/flurry/sdk/hm:c	Lcom/flurry/sdk/hm;
    //   53: if_acmpne +6 -> 59
    //   56: goto +87 -> 143
    //   59: aload_0
    //   60: invokevirtual 165	com/flurry/sdk/jq:b	()Lcom/flurry/sdk/iy;
    //   63: astore 8
    //   65: aload_0
    //   66: aload_1
    //   67: aload 8
    //   69: invokevirtual 261	com/flurry/sdk/jq:a	(Lcom/flurry/sdk/hj;Lcom/flurry/sdk/iy;)Lcom/flurry/sdk/iz;
    //   72: astore 9
    //   74: aload_0
    //   75: aload 8
    //   77: aload_2
    //   78: invokevirtual 249	com/flurry/sdk/jq:a	(Lcom/flurry/sdk/iy;Lcom/flurry/sdk/sh;)Lcom/flurry/sdk/jg;
    //   81: astore 10
    //   83: aload 8
    //   85: getstatic 266	com/flurry/sdk/iy$a:p	Lcom/flurry/sdk/iy$a;
    //   88: invokevirtual 269	com/flurry/sdk/iy:a	(Lcom/flurry/sdk/iy$a;)Z
    //   91: ifeq +18 -> 109
    //   94: aload_0
    //   95: aload_1
    //   96: aload_2
    //   97: aload 9
    //   99: aload 10
    //   101: invokevirtual 272	com/flurry/sdk/jq:a	(Lcom/flurry/sdk/hj;Lcom/flurry/sdk/sh;Lcom/flurry/sdk/iz;Lcom/flurry/sdk/jg;)Ljava/lang/Object;
    //   104: astore 6
    //   106: goto -77 -> 29
    //   109: aload 10
    //   111: aload_1
    //   112: aload 9
    //   114: invokevirtual 275	com/flurry/sdk/jg:a	(Lcom/flurry/sdk/hj;Lcom/flurry/sdk/iz;)Ljava/lang/Object;
    //   117: astore 11
    //   119: aload 11
    //   121: astore 6
    //   123: goto -94 -> 29
    //   126: astore_3
    //   127: aload_1
    //   128: invokevirtual 255	com/flurry/sdk/hj:close	()V
    //   131: aload_3
    //   132: athrow
    //   133: astore 7
    //   135: aload 6
    //   137: areturn
    //   138: astore 4
    //   140: goto -9 -> 131
    //   143: aconst_null
    //   144: astore 6
    //   146: goto -117 -> 29
    //
    // Exception table:
    //   from	to	target	type
    //   0	29	126	finally
    //   29	33	126	finally
    //   40	56	126	finally
    //   59	106	126	finally
    //   109	119	126	finally
    //   33	37	133	java/io/IOException
    //   127	131	138	java/io/IOException
  }

  protected Object a(hj paramhj, sh paramsh, iz paramiz, jg<Object> paramjg)
  {
    im localim = this.l.a(paramiz.a(), paramsh);
    if (paramhj.e() != hm.b)
      throw jh.a(paramhj, "Current token not START_OBJECT (needed to unwrap root name '" + localim + "'), but " + paramhj.e());
    if (paramhj.b() != hm.f)
      throw jh.a(paramhj, "Current token not FIELD_NAME (to contain expected root name '" + localim + "'), but " + paramhj.e());
    String str = paramhj.g();
    if (!localim.a().equals(str))
      throw jh.a(paramhj, "Root name '" + str + "' does not match expected ('" + localim + "') for type " + paramsh);
    paramhj.b();
    Object localObject = paramjg.a(paramhj, paramiz);
    if (paramhj.b() != hm.c)
      throw jh.a(paramhj, "Current token not END_OBJECT (to match wrapper object with root name '" + localim + "'), but " + paramhj.e());
    return localObject;
  }

  protected Object a(iy paramiy, hj paramhj, sh paramsh)
  {
    hm localhm = b(paramhj);
    Object localObject;
    if (localhm == hm.m)
      localObject = a(paramiy, paramsh).b();
    while (true)
    {
      paramhj.f();
      return localObject;
      if ((localhm == hm.e) || (localhm == hm.c))
      {
        localObject = null;
      }
      else
      {
        iz localiz = a(paramhj, paramiy);
        jg localjg = a(paramiy, paramsh);
        if (paramiy.a(iy.a.p))
          localObject = a(paramhj, paramsh, localiz, localjg);
        else
          localObject = localjg.a(paramhj, localiz);
      }
    }
  }

  public <T> T a(InputStream paramInputStream, Class<T> paramClass)
  {
    return a(this.d.a(paramInputStream), this.f.a(paramClass));
  }

  public String a(Object paramObject)
  {
    il localil = new il(this.d.b());
    b(this.d.a(localil), paramObject);
    return localil.a();
  }

  public void a(hf paramhf, hh paramhh)
  {
    ju localju = a();
    this.i.a(localju, paramhf, paramhh, this.j);
    if (localju.a(ju.a.p))
      paramhf.g();
  }

  public void a(hf paramhf, Object paramObject)
  {
    ju localju = a();
    if ((localju.a(ju.a.o)) && ((paramObject instanceof Closeable)))
      b(paramhf, paramObject, localju);
    do
    {
      return;
      this.i.a(localju, paramhf, paramObject, this.j);
    }
    while (!localju.a(ju.a.p));
    paramhf.g();
  }

  public void a(jp paramjp)
  {
    if (paramjp.a() == null)
      throw new IllegalArgumentException("Module without defined name");
    if (paramjp.b() == null)
      throw new IllegalArgumentException("Module without defined version");
    paramjp.a(new jp.a()
    {
      public void a(ip paramAnonymousip)
      {
        jdField_this.l = jdField_this.l.a(paramAnonymousip);
      }

      public void a(jd paramAnonymousjd)
      {
        jdField_this.l = jdField_this.l.a(paramAnonymousjd);
      }

      public void a(jm paramAnonymousjm)
      {
        jdField_this.l = jdField_this.l.a(paramAnonymousjm);
      }

      public void a(jx paramAnonymousjx)
      {
        jdField_this.j = jdField_this.j.a(paramAnonymousjx);
      }

      public void a(ky paramAnonymousky)
      {
        jdField_this.l = jdField_this.l.a(paramAnonymousky);
      }

      public void a(Class<?> paramAnonymousClass1, Class<?> paramAnonymousClass2)
      {
        jdField_this.k.a(paramAnonymousClass1, paramAnonymousClass2);
        jdField_this.h.a(paramAnonymousClass1, paramAnonymousClass2);
      }

      public void b(jx paramAnonymousjx)
      {
        jdField_this.j = jdField_this.j.b(paramAnonymousjx);
      }
    });
  }

  public void a(OutputStream paramOutputStream, Object paramObject)
  {
    b(this.d.a(paramOutputStream, hc.a), paramObject);
  }

  protected hm b(hj paramhj)
  {
    hm localhm = paramhj.e();
    if (localhm == null)
    {
      localhm = paramhj.b();
      if (localhm == null)
        throw new EOFException("No content to map to Object due to end of input");
    }
    return localhm;
  }

  public iy b()
  {
    return this.k.a(this.e).a(this.h.i);
  }

  protected final void b(hf paramhf, Object paramObject)
  {
    ju localju = a();
    if (localju.a(ju.a.k))
      paramhf.a();
    if ((localju.a(ju.a.o)) && ((paramObject instanceof Closeable)))
    {
      a(paramhf, paramObject, localju);
      return;
    }
    int i1 = 0;
    try
    {
      this.i.a(localju, paramhf, paramObject, this.j);
      i1 = 1;
      paramhf.close();
      return;
    }
    finally
    {
      if (i1 != 0);
    }
    try
    {
      paramhf.close();
      label81: throw localObject;
    }
    catch (IOException localIOException)
    {
      break label81;
    }
  }

  public rs c()
  {
    return this.k.h();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.jq
 * JD-Core Version:    0.6.2
 */