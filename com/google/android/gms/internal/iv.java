package com.google.android.gms.internal;

import android.content.Context;

public abstract class iv<T>
{
  private static iv.a JN = null;
  private static final Object mw = new Object();
  protected final String JO;
  protected final T JP;
  private T JQ = null;

  protected iv(String paramString, T paramT)
  {
    this.JO = paramString;
    this.JP = paramT;
  }

  public static void H(Context paramContext)
  {
    synchronized (mw)
    {
      if (JN == null)
        JN = new iv.b(paramContext.getContentResolver());
      return;
    }
  }

  public static iv<Integer> a(String paramString, Integer paramInteger)
  {
    return new iv(paramString, paramInteger)
    {
    };
  }

  public static iv<Boolean> g(String paramString, boolean paramBoolean)
  {
    return new iv(paramString, Boolean.valueOf(paramBoolean))
    {
    };
  }

  public static iv<String> m(String paramString1, String paramString2)
  {
    return new iv(paramString1, paramString2)
    {
    };
  }

  public String getKey()
  {
    return this.JO;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iv
 * JD-Core Version:    0.6.2
 */