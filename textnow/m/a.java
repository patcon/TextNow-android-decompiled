package textnow.m;

import android.os.Build.VERSION;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

final class a
{
  static final int a = i + 1;
  static final int b = 1 + 2 * e;
  private static final a c = new a();
  private static final int e;
  private final Executor d = new b((byte)0);

  static
  {
    int i = Runtime.getRuntime().availableProcessors();
    e = i;
  }

  public static ExecutorService a()
  {
    ThreadPoolExecutor localThreadPoolExecutor = new ThreadPoolExecutor(a, b, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(128));
    if (Build.VERSION.SDK_INT >= 9)
      localThreadPoolExecutor.allowCoreThreadTimeOut(true);
    return localThreadPoolExecutor;
  }

  public static Executor b()
  {
    return c.d;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.m.a
 * JD-Core Version:    0.6.2
 */