package com.google.android.gms.internal;

import android.os.SystemClock;

public final class jw
  implements ju
{
  private static jw MS;

  public static ju hA()
  {
    try
    {
      if (MS == null)
        MS = new jw();
      jw localjw = MS;
      return localjw;
    }
    finally
    {
    }
  }

  public final long currentTimeMillis()
  {
    return System.currentTimeMillis();
  }

  public final long elapsedRealtime()
  {
    return SystemClock.elapsedRealtime();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.jw
 * JD-Core Version:    0.6.2
 */