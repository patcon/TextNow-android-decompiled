package com.flurry.sdk;

import java.util.concurrent.ThreadFactory;

public class ez
  implements ThreadFactory
{
  private final ThreadGroup a;
  private final int b;

  public ez(String paramString, int paramInt)
  {
    this.a = new ThreadGroup(paramString);
    this.b = paramInt;
  }

  public Thread newThread(Runnable paramRunnable)
  {
    Thread localThread = new Thread(this.a, paramRunnable);
    localThread.setName(this.a.getName() + ":" + localThread.getId());
    localThread.setPriority(this.b);
    return localThread;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ez
 * JD-Core Version:    0.6.2
 */