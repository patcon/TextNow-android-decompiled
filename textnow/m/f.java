package textnow.m;

import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

final class f
{
  private static final f a = new f();
  private final ExecutorService b;
  private final Executor c;

  private f()
  {
    String str = System.getProperty("java.runtime.name");
    boolean bool;
    if (str == null)
    {
      bool = false;
      if (bool)
        break label58;
    }
    label58: for (ExecutorService localExecutorService = Executors.newCachedThreadPool(); ; localExecutorService = a.a())
    {
      this.b = localExecutorService;
      this.c = new g((byte)0);
      return;
      bool = str.toLowerCase(Locale.US).contains("android");
      break;
    }
  }

  public static ExecutorService a()
  {
    return a.b;
  }

  static Executor b()
  {
    return a.c;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.m.f
 * JD-Core Version:    0.6.2
 */