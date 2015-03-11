package com.google.android.gms.internal;

import android.os.Process;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class en
{
  private static final ThreadFactory sh = new ThreadFactory()
  {
    private final AtomicInteger sk = new AtomicInteger(1);

    public final Thread newThread(Runnable paramAnonymousRunnable)
    {
      return new Thread(paramAnonymousRunnable, "AdWorker #" + this.sk.getAndIncrement());
    }
  };
  private static final ThreadPoolExecutor si = new ThreadPoolExecutor(0, 10, 65L, TimeUnit.SECONDS, new SynchronousQueue(true), sh);

  public static void execute(Runnable paramRunnable)
  {
    try
    {
      si.execute(new Runnable()
      {
        public final void run()
        {
          Process.setThreadPriority(10);
          en.this.run();
        }
      });
      return;
    }
    catch (RejectedExecutionException localRejectedExecutionException)
    {
      eu.c("Too many background threads already running. Aborting task.  Current pool size: " + getPoolSize(), localRejectedExecutionException);
    }
  }

  public static int getPoolSize()
  {
    return si.getPoolSize();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.en
 * JD-Core Version:    0.6.2
 */