package com.flurry.sdk;

import java.io.PrintStream;
import java.io.PrintWriter;

public abstract class ff
  implements Runnable
{
  private static final String a = ff.class.getSimpleName();
  PrintStream g;
  PrintWriter h;

  public abstract void a();

  public final void run()
  {
    try
    {
      a();
      return;
    }
    catch (Throwable localThrowable)
    {
      if (this.g == null)
        break label33;
    }
    localThrowable.printStackTrace(this.g);
    while (true)
    {
      eo.a(6, a, "", localThrowable);
      return;
      label33: if (this.h != null)
        localThrowable.printStackTrace(this.h);
      else
        localThrowable.printStackTrace();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ff
 * JD-Core Version:    0.6.2
 */