package com.google.android.gms.internal;

import android.os.Handler;

public class ab$a
{
  private final Handler mHandler;

  public ab$a(Handler paramHandler)
  {
    this.mHandler = paramHandler;
  }

  public boolean postDelayed(Runnable paramRunnable, long paramLong)
  {
    return this.mHandler.postDelayed(paramRunnable, paramLong);
  }

  public void removeCallbacks(Runnable paramRunnable)
  {
    this.mHandler.removeCallbacks(paramRunnable);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ab.a
 * JD-Core Version:    0.6.2
 */