package com.mopub.common;

import android.os.Looper;
import com.mopub.common.logging.MoPubLog;
import java.util.IllegalFormatException;

public final class Preconditions
{
  public static final String EMPTY_ARGUMENTS = "";

  public static void checkArgument(boolean paramBoolean)
  {
    checkArgumentInternal(paramBoolean, true, "Illegal argument.", new Object[] { "" });
  }

  public static void checkArgument(boolean paramBoolean, String paramString)
  {
    checkArgumentInternal(paramBoolean, true, paramString, new Object[] { "" });
  }

  public static void checkArgument(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    checkArgumentInternal(paramBoolean, true, paramString, paramArrayOfObject);
  }

  private static boolean checkArgumentInternal(boolean paramBoolean1, boolean paramBoolean2, String paramString, Object[] paramArrayOfObject)
  {
    if (paramBoolean1)
      return true;
    String str = format(paramString, paramArrayOfObject);
    if (paramBoolean2)
      throw new IllegalArgumentException(str);
    MoPubLog.e(str);
    return false;
  }

  public static void checkNotNull(Object paramObject)
  {
    checkNotNullInternal(paramObject, true, "Object can not be null.", new Object[] { "" });
  }

  public static void checkNotNull(Object paramObject, String paramString)
  {
    checkNotNullInternal(paramObject, true, paramString, new Object[] { "" });
  }

  public static void checkNotNull(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    checkNotNullInternal(paramObject, true, paramString, paramArrayOfObject);
  }

  private static boolean checkNotNullInternal(Object paramObject, boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    if (paramObject != null)
      return true;
    String str = format(paramString, paramArrayOfObject);
    if (paramBoolean)
      throw new NullPointerException(str);
    MoPubLog.e(str);
    return false;
  }

  public static void checkState(boolean paramBoolean)
  {
    checkStateInternal(paramBoolean, true, "Illegal state.", new Object[] { "" });
  }

  public static void checkState(boolean paramBoolean, String paramString)
  {
    checkStateInternal(paramBoolean, true, paramString, new Object[] { "" });
  }

  public static void checkState(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    checkStateInternal(paramBoolean, true, paramString, paramArrayOfObject);
  }

  private static boolean checkStateInternal(boolean paramBoolean1, boolean paramBoolean2, String paramString, Object[] paramArrayOfObject)
  {
    if (paramBoolean1)
      return true;
    String str = format(paramString, paramArrayOfObject);
    if (paramBoolean2)
      throw new IllegalStateException(str);
    MoPubLog.e(str);
    return false;
  }

  public static void checkUiThread()
  {
    checkUiThreadInternal(true, "This method must be called from the UI thread.", new Object[] { "" });
  }

  public static void checkUiThread(String paramString)
  {
    checkUiThreadInternal(true, paramString, new Object[] { "" });
  }

  public static void checkUiThread(String paramString, Object[] paramArrayOfObject)
  {
    checkUiThreadInternal(true, paramString, paramArrayOfObject);
  }

  private static boolean checkUiThreadInternal(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    if (Looper.getMainLooper().equals(Looper.myLooper()))
      return true;
    String str = format(paramString, paramArrayOfObject);
    if (paramBoolean)
      throw new IllegalStateException(str);
    MoPubLog.e(str);
    return false;
  }

  private static String format(String paramString, Object[] paramArrayOfObject)
  {
    String str1 = String.valueOf(paramString);
    try
    {
      String str2 = String.format(str1, paramArrayOfObject);
      return str2;
    }
    catch (IllegalFormatException localIllegalFormatException)
    {
      MoPubLog.e("MoPub preconditions had a format exception: " + localIllegalFormatException.getMessage());
    }
    return str1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.Preconditions
 * JD-Core Version:    0.6.2
 */