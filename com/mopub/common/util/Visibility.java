package com.mopub.common.util;

public class Visibility
{
  public static boolean hasScreenVisibilityChanged(int paramInt1, int paramInt2)
  {
    return isScreenVisible(paramInt1) != isScreenVisible(paramInt2);
  }

  public static boolean isScreenVisible(int paramInt)
  {
    return paramInt == 0;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.Visibility
 * JD-Core Version:    0.6.2
 */