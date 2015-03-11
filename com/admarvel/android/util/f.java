package com.admarvel.android.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class f
{
  private static f c = null;
  private ExecutorService a = null;
  private ScheduledExecutorService b = null;

  public static f a()
  {
    if (c == null)
      c = new f();
    return c;
  }

  public ExecutorService b()
  {
    if (this.a == null)
      this.a = Executors.newCachedThreadPool();
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.f
 * JD-Core Version:    0.6.2
 */