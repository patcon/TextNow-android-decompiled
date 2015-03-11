package com.mologiq.analytics;

import android.os.Build.VERSION;

public final class b
{
  static int a()
  {
    if (Build.VERSION.RELEASE.contains("1.5"))
      return 3;
    return Build.VERSION.SDK_INT;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mologiq.analytics.b
 * JD-Core Version:    0.6.2
 */