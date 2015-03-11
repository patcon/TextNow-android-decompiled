package com.google.android.gms.common.api;

public class a
{
  static void a(Result paramResult)
  {
    if ((paramResult instanceof Releasable));
    try
    {
      ((Releasable)paramResult).release();
      return;
    }
    catch (RuntimeException localRuntimeException)
    {
      new StringBuilder().append("Unable to release ").append(paramResult).toString();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.api.a
 * JD-Core Version:    0.6.2
 */