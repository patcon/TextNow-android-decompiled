package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

@ez
public final class gi
{
  private static final ThreadFactory wh = new ThreadFactory()
  {
    private final AtomicInteger wl = new AtomicInteger(1);

    public final Thread newThread(Runnable paramAnonymousRunnable)
    {
      return new Thread(paramAnonymousRunnable, "AdWorker #" + this.wl.getAndIncrement());
    }
  };
  private static final ExecutorService wi = Executors.newFixedThreadPool(10, wh);

  public static Future<Void> a(Runnable paramRunnable)
  {
    return submit(new Callable()
    {
      public final Void dj()
      {
        gi.this.run();
        return null;
      }
    });
  }

  public static <T> Future<T> submit(Callable<T> paramCallable)
  {
    try
    {
      Future localFuture = wi.submit(new Callable()
      {
        public final T call()
        {
          try
          {
            Process.setThreadPriority(10);
            Object localObject = gi.this.call();
            return localObject;
          }
          catch (Exception localException)
          {
            gb.e(localException);
          }
          return null;
        }
      });
      return localFuture;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      gs.d("Thread execution is rejected.", localRejectedExecutionException);
    }
    return new gl(null);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gi
 * JD-Core Version:    0.6.2
 */