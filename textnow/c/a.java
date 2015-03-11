package textnow.c;

import android.os.AsyncTask;
import android.os.Build.VERSION;

public final class a
{
  public static <Params, Progress, Result> AsyncTask<Params, Progress, Result> a(AsyncTask<Params, Progress, Result> paramAsyncTask, Params[] paramArrayOfParams)
  {
    if (paramAsyncTask == null)
      throw new IllegalArgumentException("task can not be null");
    if (Build.VERSION.SDK_INT >= 11)
    {
      paramAsyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, paramArrayOfParams);
      return paramAsyncTask;
    }
    paramAsyncTask.execute(paramArrayOfParams);
    return paramAsyncTask;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.c.a
 * JD-Core Version:    0.6.2
 */