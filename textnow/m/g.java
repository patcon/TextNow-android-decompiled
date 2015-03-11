package textnow.m;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

final class g
  implements Executor
{
  private ThreadLocal<Integer> a = new ThreadLocal();

  private int a()
  {
    Integer localInteger = (Integer)this.a.get();
    if (localInteger == null)
      localInteger = Integer.valueOf(0);
    int i = -1 + localInteger.intValue();
    if (i == 0)
    {
      this.a.remove();
      return i;
    }
    this.a.set(Integer.valueOf(i));
    return i;
  }

  public final void execute(Runnable paramRunnable)
  {
    Integer localInteger = (Integer)this.a.get();
    if (localInteger == null)
      localInteger = Integer.valueOf(0);
    int i = 1 + localInteger.intValue();
    this.a.set(Integer.valueOf(i));
    if (i <= 15);
    try
    {
      paramRunnable.run();
      while (true)
      {
        return;
        f.a().execute(paramRunnable);
      }
    }
    finally
    {
      a();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.m.g
 * JD-Core Version:    0.6.2
 */