package com.flurry.sdk;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardPolicy;
import java.util.concurrent.TimeUnit;

public class eg<T extends fg>
{
  private static final String a = eg.class.getSimpleName();
  private final ds<Object, T> b = new ds();
  private final HashMap<T, Object> c = new HashMap();
  private final HashMap<T, Future<?>> d = new HashMap();
  private final ThreadPoolExecutor e;

  public eg(String paramString, int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue)
  {
    this.e = new ThreadPoolExecutor(paramInt1, paramInt2, paramLong, paramTimeUnit, paramBlockingQueue)
    {
      protected void afterExecute(Runnable paramAnonymousRunnable, Throwable paramAnonymousThrowable)
      {
        super.afterExecute(paramAnonymousRunnable, paramAnonymousThrowable);
        final fg localfg = eg.a(eg.this, paramAnonymousRunnable);
        if (localfg == null)
          return;
        synchronized (eg.a(eg.this))
        {
          eg.a(eg.this).remove(localfg);
          eg.a(eg.this, localfg);
          new ff()
          {
            public void a()
            {
              localfg.k();
            }
          }
          .run();
          return;
        }
      }

      protected void beforeExecute(Thread paramAnonymousThread, Runnable paramAnonymousRunnable)
      {
        super.beforeExecute(paramAnonymousThread, paramAnonymousRunnable);
        final fg localfg = eg.a(eg.this, paramAnonymousRunnable);
        if (localfg == null)
          return;
        new ff()
        {
          public void a()
          {
            localfg.j();
          }
        }
        .run();
      }

      protected <V> RunnableFuture<V> newTaskFor(Runnable paramAnonymousRunnable, V paramAnonymousV)
      {
        ef localef = new ef(paramAnonymousRunnable, paramAnonymousV);
        synchronized (eg.a(eg.this))
        {
          eg.a(eg.this).put((fg)paramAnonymousRunnable, localef);
          return localef;
        }
      }

      protected <V> RunnableFuture<V> newTaskFor(Callable<V> paramAnonymousCallable)
      {
        throw new UnsupportedOperationException("Callable not supported");
      }
    };
    this.e.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardPolicy()
    {
      public void rejectedExecution(Runnable paramAnonymousRunnable, ThreadPoolExecutor paramAnonymousThreadPoolExecutor)
      {
        super.rejectedExecution(paramAnonymousRunnable, paramAnonymousThreadPoolExecutor);
        final fg localfg = eg.a(eg.this, paramAnonymousRunnable);
        if (localfg == null)
          return;
        synchronized (eg.a(eg.this))
        {
          eg.a(eg.this).remove(localfg);
          eg.a(eg.this, localfg);
          new ff()
          {
            public void a()
            {
              localfg.l();
            }
          }
          .run();
          return;
        }
      }
    });
    ez localez = new ez(paramString, 1);
    this.e.setThreadFactory(localez);
  }

  private T a(Runnable paramRunnable)
  {
    if ((paramRunnable instanceof ef))
      return (fg)((ef)paramRunnable).a();
    if ((paramRunnable instanceof fg))
      return (fg)paramRunnable;
    eo.a(6, a, "Unknown runnable class: " + paramRunnable.getClass().getName());
    return null;
  }

  private void b(T paramT)
  {
    try
    {
      c(this.c.get(paramT), paramT);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void b(Object paramObject, T paramT)
  {
    try
    {
      this.b.a(paramObject, paramT);
      this.c.put(paramT, paramObject);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void c(Object paramObject, T paramT)
  {
    try
    {
      this.b.b(paramObject, paramT);
      this.c.remove(paramT);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  // ERROR //
  public void a(final T paramT)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnonnull +6 -> 9
    //   6: aload_0
    //   7: monitorexit
    //   8: return
    //   9: aload_0
    //   10: getfield 43	com/flurry/sdk/eg:d	Ljava/util/HashMap;
    //   13: astore_3
    //   14: aload_3
    //   15: monitorenter
    //   16: aload_0
    //   17: getfield 43	com/flurry/sdk/eg:d	Ljava/util/HashMap;
    //   20: aload_1
    //   21: invokevirtual 130	java/util/HashMap:remove	(Ljava/lang/Object;)Ljava/lang/Object;
    //   24: checkcast 132	java/util/concurrent/Future
    //   27: astore 5
    //   29: aload_3
    //   30: monitorexit
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial 110	com/flurry/sdk/eg:b	(Lcom/flurry/sdk/fg;)V
    //   36: aload 5
    //   38: ifnull +12 -> 50
    //   41: aload 5
    //   43: iconst_1
    //   44: invokeinterface 136 2 0
    //   49: pop
    //   50: new 138	com/flurry/sdk/eg$3
    //   53: dup
    //   54: aload_0
    //   55: aload_1
    //   56: invokespecial 140	com/flurry/sdk/eg$3:<init>	(Lcom/flurry/sdk/eg;Lcom/flurry/sdk/fg;)V
    //   59: invokevirtual 143	com/flurry/sdk/eg$3:run	()V
    //   62: goto -56 -> 6
    //   65: astore_2
    //   66: aload_0
    //   67: monitorexit
    //   68: aload_2
    //   69: athrow
    //   70: astore 4
    //   72: aload_3
    //   73: monitorexit
    //   74: aload 4
    //   76: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   9	16	65	finally
    //   31	36	65	finally
    //   41	50	65	finally
    //   50	62	65	finally
    //   72	77	65	finally
    //   16	31	70	finally
  }

  public void a(Object paramObject)
  {
    if (paramObject == null);
    while (true)
    {
      return;
      try
      {
        HashSet localHashSet = new HashSet();
        localHashSet.addAll(this.b.a(paramObject));
        Iterator localIterator = localHashSet.iterator();
        while (localIterator.hasNext())
          a((fg)localIterator.next());
      }
      finally
      {
      }
    }
  }

  public void a(Object paramObject, T paramT)
  {
    if ((paramObject == null) || (paramT == null));
    while (true)
    {
      return;
      try
      {
        b(paramObject, paramT);
        this.e.submit(paramT);
      }
      finally
      {
      }
    }
  }

  public long b(Object paramObject)
  {
    long l;
    if (paramObject == null)
      l = 0L;
    while (true)
    {
      return l;
      try
      {
        int i = this.b.a(paramObject).size();
        l = i;
      }
      finally
      {
      }
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.eg
 * JD-Core Version:    0.6.2
 */