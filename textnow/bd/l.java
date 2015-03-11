package textnow.bd;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class l extends ThreadPoolExecutor
{
  private l(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue)
  {
    super(paramInt2, paramLong, ???, paramBlockingQueue, localBlockingQueue);
  }

  protected final void beforeExecute(Thread paramThread, Runnable paramRunnable)
  {
    k.a(this.a, paramRunnable);
    super.beforeExecute(paramThread, paramRunnable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     textnow.bd.l
 * JD-Core Version:    0.6.2
 */