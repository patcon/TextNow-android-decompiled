package com.mopub.common.util;

import android.annotation.TargetApi;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class AsyncTasks
{
  private static Executor sExecutor;

  static
  {
    init();
  }

  @TargetApi(11)
  private static void init()
  {
    if (Build.VERSION.SDK_INT >= 11)
    {
      sExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      return;
    }
    sExecutor = Executors.newSingleThreadExecutor();
  }

  @TargetApi(11)
  public static <P> void safeExecuteOnExecutor(AsyncTask<P, ?, ?> paramAsyncTask, P[] paramArrayOfP)
  {
    Preconditions.checkNotNull(paramAsyncTask, "Unable to execute null AsyncTask.");
    Preconditions.checkUiThread("AsyncTask must be executed on the main thread");
    if (Build.VERSION.SDK_INT >= 11)
    {
      paramAsyncTask.executeOnExecutor(sExecutor, paramArrayOfP);
      return;
    }
    paramAsyncTask.execute(paramArrayOfP);
  }

  @VisibleForTesting
  public static void setExecutor(Executor paramExecutor)
  {
    sExecutor = paramExecutor;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.AsyncTasks
 * JD-Core Version:    0.6.2
 */