package com.flurry.sdk;

import android.os.Build.VERSION;
import android.text.TextUtils;

public final class eq extends es
{
  private final int a;

  public eq(String paramString, int paramInt)
  {
    super(a(paramString, paramInt));
    this.a = paramInt;
  }

  private static et a(String paramString, int paramInt)
  {
    boolean bool = b(paramString, paramInt);
    et localet = null;
    if (bool)
      localet = er.a(paramString);
    return localet;
  }

  private static boolean b(String paramString, int paramInt)
  {
    return (!TextUtils.isEmpty(paramString)) && (Build.VERSION.SDK_INT >= paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.eq
 * JD-Core Version:    0.6.2
 */