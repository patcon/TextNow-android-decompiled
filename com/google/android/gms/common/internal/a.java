package com.google.android.gms.common.internal;

import android.os.Looper;

public final class a
{
  public static void I(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalStateException();
  }

  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
      throw new IllegalStateException(String.valueOf(paramObject));
  }

  public static void aT(String paramString)
  {
    if (Looper.getMainLooper().getThread() != Thread.currentThread())
    {
      new StringBuilder().append("checkMainThread: current thread ").append(Thread.currentThread()).append(" IS NOT the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString();
      throw new IllegalStateException(paramString);
    }
  }

  public static void aU(String paramString)
  {
    if (Looper.getMainLooper().getThread() == Thread.currentThread())
    {
      new StringBuilder().append("checkNotMainThread: current thread ").append(Thread.currentThread()).append(" IS the main thread ").append(Looper.getMainLooper().getThread()).append("!").toString();
      throw new IllegalStateException(paramString);
    }
  }

  public static void f(Object paramObject)
  {
    if (paramObject == null)
      throw new IllegalArgumentException("null reference");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.a
 * JD-Core Version:    0.6.2
 */