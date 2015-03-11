package textnow.bk;

import java.util.AbstractQueue;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

final class j extends AbstractQueue<Runnable>
  implements BlockingQueue<Runnable>
{
  private final n a;
  private final ReentrantLock b = new ReentrantLock(true);
  private final Condition c;
  private int d = 0;

  public j(br[] paramArrayOfbr)
  {
    this.a = new n(paramArrayOfbr);
    this.c = this.b.newCondition();
  }

  private Runnable a()
  {
    try
    {
      this.b.lock();
      try
      {
        Runnable localRunnable = this.a.c();
        this.b.unlock();
        return localRunnable;
      }
      finally
      {
        localObject2 = finally;
        this.b.unlock();
        throw localObject2;
      }
    }
    finally
    {
    }
  }

  private Runnable a(long paramLong, TimeUnit paramTimeUnit)
  {
    long l = paramTimeUnit.toNanos(paramLong);
    this.b.lockInterruptibly();
    Object localObject1 = null;
    while (true)
    {
      if (localObject1 == null)
        if (l <= 0L)
        {
          this.b.unlock();
          return null;
        }
      try
      {
        l = this.c.awaitNanos(l);
        Runnable localRunnable = d();
        localObject1 = localRunnable;
        continue;
        return localObject1;
      }
      finally
      {
        this.b.unlock();
      }
    }
  }

  private static void a(Object paramObject)
  {
    if (paramObject == null)
      throw new NullPointerException();
  }

  private boolean a(Runnable paramRunnable)
  {
    a(paramRunnable);
    this.b.lock();
    try
    {
      c(paramRunnable);
      return true;
    }
    finally
    {
      this.b.unlock();
    }
  }

  private Runnable b()
  {
    this.b.lock();
    try
    {
      Runnable localRunnable = d();
      return localRunnable;
    }
    finally
    {
      this.b.unlock();
    }
  }

  private boolean b(Runnable paramRunnable)
  {
    a(paramRunnable);
    this.b.lockInterruptibly();
    try
    {
      c(paramRunnable);
      return true;
    }
    finally
    {
      this.b.unlock();
    }
  }

  private Runnable c()
  {
    this.b.lockInterruptibly();
    try
    {
      Runnable localRunnable;
      for (Object localObject2 = d(); localObject2 == null; localObject2 = localRunnable)
      {
        this.c.await();
        localRunnable = d();
      }
      return localObject2;
    }
    finally
    {
      this.b.unlock();
    }
  }

  private void c(Runnable paramRunnable)
  {
    this.a.a((bq)paramRunnable);
    this.d = (1 + this.d);
    if (this.d == 1)
      this.c.signal();
  }

  private Runnable d()
  {
    bq localbq;
    do
    {
      localbq = this.a.a();
      if (this.d > 0)
      {
        if (localbq == null)
          break;
        this.d = (-1 + this.d);
      }
    }
    while (((localbq == null) || (localbq.e())) && (this.d > 0));
    if (localbq == null);
    while (localbq.e())
    {
      return null;
      this.d = this.a.b();
      break;
    }
    return localbq;
  }

  public final int drainTo(Collection<? super Runnable> paramCollection)
  {
    a(paramCollection);
    this.b.lock();
    int i = 0;
    try
    {
      while (this.a.b() > 0)
      {
        Runnable localRunnable = d();
        if (localRunnable == null)
          break;
        paramCollection.add(localRunnable);
        i++;
      }
      return i;
    }
    finally
    {
      this.b.unlock();
    }
  }

  public final int drainTo(Collection<? super Runnable> paramCollection, int paramInt)
  {
    int i = 0;
    a(paramCollection);
    this.b.lock();
    int j = 0;
    while (true)
    {
      if (i < paramInt);
      try
      {
        Runnable localRunnable = d();
        if (localRunnable != null)
        {
          paramCollection.add(localRunnable);
          j++;
          i++;
          continue;
        }
        return j;
      }
      finally
      {
        this.b.unlock();
      }
    }
  }

  public final Iterator<Runnable> iterator()
  {
    return null;
  }

  public final int remainingCapacity()
  {
    return 2147483647;
  }

  public final boolean remove(Object paramObject)
  {
    return false;
  }

  public final boolean removeAll(Collection<?> paramCollection)
  {
    return false;
  }

  public final int size()
  {
    this.b.lock();
    try
    {
      int i = this.a.b();
      return i;
    }
    finally
    {
      this.b.unlock();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.bk.j
 * JD-Core Version:    0.6.2
 */