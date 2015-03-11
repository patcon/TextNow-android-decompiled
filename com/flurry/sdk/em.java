package com.flurry.sdk;

import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

public final class em extends eg<en>
{
  private static em a = null;

  protected em()
  {
    super(em.class.getName(), 0, 5, 5000L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(11, new ee()));
  }

  public static em a()
  {
    try
    {
      if (a == null)
        a = new em();
      em localem = a;
      return localem;
    }
    finally
    {
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.em
 * JD-Core Version:    0.6.2
 */