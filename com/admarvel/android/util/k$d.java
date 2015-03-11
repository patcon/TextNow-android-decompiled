package com.admarvel.android.util;

import android.content.Context;

public class k$d
  implements Runnable
{
  private final Context b;

  public k$d(k paramk, Context paramContext)
  {
    this.b = paramContext;
  }

  public void run()
  {
    if (this.b != null);
    try
    {
      k.d(this.b);
      return;
    }
    catch (Exception localException)
    {
      Logging.log("FetchAndroidAdvertisingIdUsingIntentRunnable error " + localException.getMessage());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.k.d
 * JD-Core Version:    0.6.2
 */