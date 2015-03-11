package com.google.android.gms.internal;

import android.os.Looper;
import android.text.TextUtils;

public final class hm
{
  public static void A(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalStateException();
  }

  public static void C(boolean paramBoolean)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException();
  }

  public static void a(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
      throw new IllegalStateException(String.valueOf(paramObject));
  }

  public static void a(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    if (!paramBoolean)
      throw new IllegalStateException(String.format(paramString, paramArrayOfObject));
  }

  public static String aE(String paramString)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException("Given String is empty or null");
    return paramString;
  }

  public static void ay(String paramString)
  {
    if (Looper.myLooper() != Looper.getMainLooper())
      throw new IllegalStateException(paramString);
  }

  public static void az(String paramString)
  {
    if (Looper.myLooper() == Looper.getMainLooper())
      throw new IllegalStateException(paramString);
  }

  public static <T> T b(T paramT, Object paramObject)
  {
    if (paramT == null)
      throw new NullPointerException(String.valueOf(paramObject));
    return paramT;
  }

  public static String b(String paramString, Object paramObject)
  {
    if (TextUtils.isEmpty(paramString))
      throw new IllegalArgumentException(String.valueOf(paramObject));
    return paramString;
  }

  public static void b(boolean paramBoolean, Object paramObject)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.valueOf(paramObject));
  }

  public static void b(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    if (!paramBoolean)
      throw new IllegalArgumentException(String.format(paramString, paramArrayOfObject));
  }

  public static <T> T f(T paramT)
  {
    if (paramT == null)
      throw new NullPointerException("null reference");
    return paramT;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.hm
 * JD-Core Version:    0.6.2
 */