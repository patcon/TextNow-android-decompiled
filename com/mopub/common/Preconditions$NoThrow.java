package com.mopub.common;

public final class Preconditions$NoThrow
{
  private static volatile boolean sStrictMode = false;

  public static boolean checkArgument(boolean paramBoolean)
  {
    return Preconditions.access$000(paramBoolean, sStrictMode, "Illegal argument", new Object[] { "" });
  }

  public static boolean checkArgument(boolean paramBoolean, String paramString)
  {
    return Preconditions.access$000(paramBoolean, sStrictMode, paramString, new Object[] { "" });
  }

  public static boolean checkArgument(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    return Preconditions.access$000(paramBoolean, sStrictMode, paramString, paramArrayOfObject);
  }

  public static boolean checkNotNull(Object paramObject)
  {
    return Preconditions.access$200(paramObject, sStrictMode, "Object can not be null.", new Object[] { "" });
  }

  public static boolean checkNotNull(Object paramObject, String paramString)
  {
    return Preconditions.access$200(paramObject, sStrictMode, paramString, new Object[] { "" });
  }

  public static boolean checkNotNull(Object paramObject, String paramString, Object[] paramArrayOfObject)
  {
    return Preconditions.access$200(paramObject, sStrictMode, paramString, paramArrayOfObject);
  }

  public static boolean checkState(boolean paramBoolean)
  {
    return Preconditions.access$100(paramBoolean, sStrictMode, "Illegal state.", new Object[] { "" });
  }

  public static boolean checkState(boolean paramBoolean, String paramString)
  {
    return Preconditions.access$100(paramBoolean, sStrictMode, paramString, new Object[] { "" });
  }

  public static boolean checkState(boolean paramBoolean, String paramString, Object[] paramArrayOfObject)
  {
    return Preconditions.access$100(paramBoolean, sStrictMode, paramString, paramArrayOfObject);
  }

  public static boolean checkUiThread()
  {
    return Preconditions.access$300(sStrictMode, "This method must be called from the UI thread.", new Object[] { "" });
  }

  public static boolean checkUiThread(String paramString)
  {
    return Preconditions.access$300(sStrictMode, paramString, new Object[] { "" });
  }

  public static boolean checkUiThread(String paramString, Object[] paramArrayOfObject)
  {
    return Preconditions.access$300(false, paramString, paramArrayOfObject);
  }

  public static void setStrictMode(boolean paramBoolean)
  {
    sStrictMode = paramBoolean;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.Preconditions.NoThrow
 * JD-Core Version:    0.6.2
 */