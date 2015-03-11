package com.flurry.sdk;

import android.text.TextUtils;
import com.flurry.android.impl.ads.FlurryAdModule;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ao
{
  private static final String b = ao.class.getSimpleName();
  final Map<String, aq> a = new HashMap();
  private final Map<String, aq> c = new LinkedHashMap();
  private final Map<String, as> d = new LinkedHashMap();
  private final av<byte[]> e;
  private final long f;
  private final int g;
  private boolean h = false;
  private WeakReference<ao.a> i = new WeakReference(null);

  ao(String paramString, long paramLong1, long paramLong2, boolean paramBoolean)
  {
    this.e = new av(new ew(), paramString, paramLong1, paramBoolean);
    this.f = paramLong2;
    if (Runtime.getRuntime().availableProcessors() > j)
      j = 2;
    this.g = j;
  }

  private void a(aq paramaq)
  {
    if (paramaq == null);
    while ((TextUtils.isEmpty(paramaq.a())) || (this.a.containsKey(paramaq.a())))
      return;
    eo.a(3, b, "Precaching: adding cached asset info from persisted storage: " + paramaq.a() + " asset exp: " + paramaq.c() + " saved time: " + paramaq.f());
    synchronized (this.a)
    {
      this.a.put(paramaq.a(), paramaq);
      return;
    }
  }

  private void a(final aq paramaq, final ar paramar)
  {
    if ((paramaq == null) || (paramar == null));
    final ao.a locala;
    do
    {
      do
        return;
      while (paramar.equals(paramaq.b()));
      eo.a(3, b, "Asset status changed for asset:" + paramaq.a() + " from:" + paramaq.b() + " to:" + paramar);
      paramaq.a(paramar);
      locala = (ao.a)this.i.get();
    }
    while (locala == null);
    do.a().c(new ff()
    {
      public void a()
      {
        locala.a(paramaq.a(), paramar);
      }
    });
  }

  private void b(aq paramaq)
  {
    if (paramaq == null);
    ar localar;
    do
    {
      return;
      localar = c(paramaq);
    }
    while (ar.d.equals(localar));
    if ((ar.c.equals(localar)) || (ar.b.equals(localar)));
    while (true)
    {
      synchronized (this.c)
      {
        if (!this.c.containsKey(paramaq.a()))
          this.c.put(paramaq.a(), paramaq);
        do.a().c(new ff()
        {
          public void a()
          {
            ao.a(ao.this);
          }
        });
        return;
      }
      eo.a(3, b, "Precaching: Queueing asset:" + paramaq.a());
      FlurryAdModule.getInstance().a("precachingDownloadRequested", 1);
      a(paramaq, ar.b);
      synchronized (this.c)
      {
        this.c.put(paramaq.a(), paramaq);
      }
    }
  }

  private ar c(aq paramaq)
  {
    if (paramaq == null)
      return ar.a;
    if (paramaq.d())
      return ar.a;
    if ((ar.d.equals(paramaq.b())) && (!this.e.d(paramaq.a())))
      a(paramaq, ar.f);
    return paramaq.b();
  }

  private aq d(String paramString)
  {
    if (!this.h);
    while (TextUtils.isEmpty(paramString))
      return null;
    while (true)
    {
      aq localaq;
      synchronized (this.a)
      {
        localaq = (aq)this.a.get(paramString);
        if (localaq != null)
        {
          if (localaq.d())
          {
            eo.a(3, b, "Precaching: expiring cached asset: " + localaq.a() + " asset exp: " + localaq.c() + " device epoch" + System.currentTimeMillis());
            a(localaq.a());
            localaq = null;
          }
        }
        else
          return localaq;
      }
      c(localaq);
      localaq.e();
    }
  }

  private void d(final aq paramaq)
  {
    FlurryAdModule.getInstance().a("precachingDownloadStarted", 1);
    eo.a(3, b, "Precaching: Submitting for download: " + paramaq.a());
    ax localax = new ax(this.e, paramaq.a());
    localax.a(paramaq.a());
    localax.a(this.e);
    localax.a(new as.a()
    {
      public void a(as paramAnonymousas)
      {
        while (true)
        {
          synchronized (ao.b(ao.this))
          {
            ao.b(ao.this).remove(paramaq.a());
            ao.a(ao.this, paramaq);
            if (paramAnonymousas.a())
            {
              long l = paramAnonymousas.c();
              eo.a(3, ao.i(), "Precaching: Download success: " + paramaq.a() + " size: " + l);
              paramaq.a(l);
              ao.a(ao.this, paramaq, ar.d);
              FlurryAdModule.getInstance().a("precachingDownloadSuccess", 1);
              do.a().c(new ff()
              {
                public void a()
                {
                  ao.a(ao.this);
                }
              });
              return;
            }
          }
          eo.a(3, ao.i(), "Precaching: Download error: " + paramaq.a());
          ao.a(ao.this, paramaq, ar.g);
          FlurryAdModule.getInstance().a("precachingDownloadError", 1);
        }
      }
    });
    localax.d();
    synchronized (this.d)
    {
      this.d.put(paramaq.a(), localax);
      a(paramaq, ar.c);
      return;
    }
  }

  private void e(aq paramaq)
  {
    if (paramaq == null)
      return;
    synchronized (this.c)
    {
      this.c.remove(paramaq.a());
      return;
    }
  }

  private void j()
  {
    if (!this.h)
      return;
    eo.a(3, b, "Precaching: Download files");
    while (true)
    {
      aq localaq;
      synchronized (this.c)
      {
        Iterator localIterator = this.c.values().iterator();
        if (!localIterator.hasNext())
          break;
        localaq = (aq)localIterator.next();
        if (this.e.d(localaq.a()))
        {
          eo.a(3, b, "Precaching: Asset already cached.  Skipping download:" + localaq.a());
          localIterator.remove();
          a(localaq, ar.d);
        }
      }
      if (!ar.c.equals(c(localaq)))
      {
        if (em.a().b(this) >= this.g)
        {
          eo.a(3, b, "Precaching: Download limit reached");
          return;
        }
        d(localaq);
      }
    }
    eo.a(3, b, "Precaching: No more files to download");
  }

  private void k()
  {
    eo.a(3, b, "Precaching: Cancelling in-progress downloads");
    synchronized (this.d)
    {
      Iterator localIterator1 = this.d.entrySet().iterator();
      if (localIterator1.hasNext())
        ((as)((Map.Entry)localIterator1.next()).getValue()).e();
    }
    this.d.clear();
    synchronized (this.c)
    {
      Iterator localIterator2 = this.c.entrySet().iterator();
      while (localIterator2.hasNext())
      {
        aq localaq = (aq)((Map.Entry)localIterator2.next()).getValue();
        if (!ar.d.equals(c(localaq)))
        {
          eo.a(3, b, "Precaching: Download cancelled: " + localaq.f());
          a(localaq, ar.e);
        }
      }
    }
  }

  private void l()
  {
    Iterator localIterator = g().iterator();
    while (localIterator.hasNext())
    {
      aq localaq = (aq)localIterator.next();
      if (!ar.d.equals(c(localaq)))
      {
        eo.a(3, b, "Precaching: expiring cached asset: " + localaq.a() + " asset exp: " + localaq.c() + " device epoch: " + System.currentTimeMillis());
        a(localaq.a());
      }
    }
  }

  public void a()
  {
    try
    {
      boolean bool = this.h;
      if (bool);
      while (true)
      {
        return;
        eo.a(3, b, "Precaching: Starting AssetCache");
        this.e.a();
        do.a().c(new ff()
        {
          public void a()
          {
            ao.a(ao.this);
          }
        });
        this.h = true;
      }
    }
    finally
    {
    }
  }

  public void a(ao.a parama)
  {
    this.i = new WeakReference(parama);
  }

  // ERROR //
  public void a(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnonnull +21 -> 24
    //   6: new 347	java/io/IOException
    //   9: dup
    //   10: ldc_w 349
    //   13: invokespecial 351	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   16: athrow
    //   17: astore 4
    //   19: aload_0
    //   20: monitorexit
    //   21: aload 4
    //   23: athrow
    //   24: new 353	java/io/DataInputStream
    //   27: dup
    //   28: aload_1
    //   29: invokespecial 355	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   32: astore_2
    //   33: aload_2
    //   34: invokevirtual 359	java/io/DataInputStream:readShort	()S
    //   37: istore 5
    //   39: iconst_0
    //   40: istore 6
    //   42: iload 6
    //   44: iload 5
    //   46: if_icmpge +21 -> 67
    //   49: aload_0
    //   50: new 97	com/flurry/sdk/aq
    //   53: dup
    //   54: aload_2
    //   55: invokespecial 362	com/flurry/sdk/aq:<init>	(Ljava/io/DataInput;)V
    //   58: invokespecial 364	com/flurry/sdk/ao:a	(Lcom/flurry/sdk/aq;)V
    //   61: iinc 6 1
    //   64: goto -22 -> 42
    //   67: aload_0
    //   68: invokespecial 366	com/flurry/sdk/ao:l	()V
    //   71: aload_2
    //   72: invokestatic 371	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: astore_3
    //   79: aconst_null
    //   80: astore_2
    //   81: aload_2
    //   82: invokestatic 371	com/flurry/sdk/fe:a	(Ljava/io/Closeable;)V
    //   85: aload_3
    //   86: athrow
    //   87: astore_3
    //   88: goto -7 -> 81
    //
    // Exception table:
    //   from	to	target	type
    //   6	17	17	finally
    //   71	75	17	finally
    //   81	87	17	finally
    //   24	33	78	finally
    //   33	39	87	finally
    //   49	61	87	finally
    //   67	71	87	finally
  }

  public void a(OutputStream paramOutputStream)
  {
    if (paramOutputStream == null)
      try
      {
        throw new IOException("Invalid output stream!");
      }
      finally
      {
      }
    try
    {
      localDataOutputStream = new DataOutputStream(paramOutputStream);
      try
      {
        List localList = g();
        localDataOutputStream.writeShort(localList.size());
        Iterator localIterator = localList.iterator();
        while (localIterator.hasNext())
          ((aq)localIterator.next()).a(localDataOutputStream);
      }
      finally
      {
      }
      fe.a(localDataOutputStream);
      throw localObject1;
      fe.a(localDataOutputStream);
      return;
    }
    finally
    {
      while (true)
      {
        localObject2 = finally;
        DataOutputStream localDataOutputStream = null;
      }
    }
  }

  public void a(String paramString)
  {
    if (!this.h);
    while (TextUtils.isEmpty(paramString))
      return;
    synchronized (this.a)
    {
      this.a.remove(paramString);
      this.e.c(paramString);
      return;
    }
  }

  public boolean a(String paramString, ay paramay, long paramLong)
  {
    if (!this.h);
    while ((TextUtils.isEmpty(paramString)) || (paramay == null) || (!ay.b.equals(paramay)))
      return false;
    aq localaq1 = d(paramString);
    aq localaq2;
    if (localaq1 == null)
      localaq2 = new aq(paramString, paramay, paramLong);
    while (true)
    {
      synchronized (this.a)
      {
        this.a.put(localaq2.a(), localaq2);
        b(localaq2);
        return true;
      }
      if (!ar.d.equals(c(localaq1)))
        b(localaq1);
    }
  }

  public ar b(String paramString)
  {
    if (!this.h)
      return ar.a;
    return c(d(paramString));
  }

  public void b()
  {
    try
    {
      boolean bool = this.h;
      if (!bool);
      while (true)
      {
        return;
        eo.a(3, b, "Precaching: Stopping AssetCache");
        k();
        this.e.b();
        this.h = false;
      }
    }
    finally
    {
    }
  }

  public aw.b c(String paramString)
  {
    if (!this.h);
    while (TextUtils.isEmpty(paramString))
      return null;
    return this.e.a(paramString);
  }

  public void c()
  {
    try
    {
      boolean bool = this.h;
      if (!bool);
      while (true)
      {
        return;
        eo.a(3, b, "Precaching: Pausing AssetCache");
        k();
      }
    }
    finally
    {
    }
  }

  public void d()
  {
    try
    {
      boolean bool = this.h;
      if (!bool);
      while (true)
      {
        return;
        eo.a(3, b, "Precaching: Resuming AssetCache");
        do.a().c(new ff()
        {
          public void a()
          {
            ao.a(ao.this);
          }
        });
      }
    }
    finally
    {
    }
  }

  public void e()
  {
    if (!this.h)
      return;
    Iterator localIterator = g().iterator();
    while (localIterator.hasNext())
      a(((aq)localIterator.next()).a());
    this.e.c();
  }

  public void f()
  {
    if (!this.h);
    while (true)
    {
      return;
      Iterator localIterator = g().iterator();
      while (localIterator.hasNext())
        c((aq)localIterator.next());
    }
  }

  public List<aq> g()
  {
    synchronized (this.a)
    {
      ArrayList localArrayList = new ArrayList(this.a.values());
      return localArrayList;
    }
  }

  public List<aq> h()
  {
    f();
    return g();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ao
 * JD-Core Version:    0.6.2
 */