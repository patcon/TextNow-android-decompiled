package com.admarvel.android.ads;

import android.os.AsyncTask;

class ab$e
  implements Runnable
{
  private String b;

  public ab$e(ab paramab, String paramString)
  {
    this.b = paramString;
  }

  public void run()
  {
    new ab.d(this.a, this.b).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.ab.e
 * JD-Core Version:    0.6.2
 */