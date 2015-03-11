package com.admarvel.android.util;

import android.content.Context;

public class e$d
  implements Runnable
{
  private final Context b;

  public e$d(e parame, Context paramContext)
  {
    this.b = paramContext;
  }

  public void run()
  {
    if (this.b != null);
    try
    {
      e.d(this.b);
      return;
    }
    catch (Exception localException)
    {
      Logging.log("FetchAndroidAdvertisingIdUsingIntentRunnable error " + localException.getMessage());
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.e.d
 * JD-Core Version:    0.6.2
 */