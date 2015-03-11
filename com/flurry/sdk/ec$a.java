package com.flurry.sdk;

final class ec$a
  implements Thread.UncaughtExceptionHandler
{
  private ec$a(ec paramec)
  {
  }

  public final void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    ec.a(this.a, paramThread, paramThrowable);
    ec.b(this.a, paramThread, paramThrowable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ec.a
 * JD-Core Version:    0.6.2
 */