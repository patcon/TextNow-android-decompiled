package com.admarvel.android.ads;

import android.os.AsyncTask;

class r$o
  implements Runnable
{
  private String b;

  public r$o(r paramr, String paramString)
  {
    this.b = paramString;
  }

  public void run()
  {
    new r.n(this.a, this.b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.r.o
 * JD-Core Version:    0.6.2
 */