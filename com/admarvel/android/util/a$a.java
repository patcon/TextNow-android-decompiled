package com.admarvel.android.util;

import android.os.AsyncTask;
import android.util.Log;
import java.util.concurrent.Executor;

class a$a
  implements Runnable
{
  private final String b;
  private final int c;

  public a$a(a parama, String paramString, int paramInt)
  {
    this.b = paramString;
    this.c = paramInt;
  }

  public void run()
  {
    try
    {
      a.c localc = new a.c(this.a, this.b);
      Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
      Integer[] arrayOfInteger = new Integer[1];
      arrayOfInteger[0] = Integer.valueOf(this.c);
      localc.executeOnExecutor(localExecutor, arrayOfInteger);
      return;
    }
    catch (Exception localException)
    {
      Logging.log(Log.getStackTraceString(localException));
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.a.a
 * JD-Core Version:    0.6.2
 */