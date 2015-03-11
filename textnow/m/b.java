package textnow.m;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class b
  implements Executor
{
  public final void execute(Runnable paramRunnable)
  {
    new Handler(Looper.getMainLooper()).post(paramRunnable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.m.b
 * JD-Core Version:    0.6.2
 */