package com.admarvel.android.util;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;

class a$b
{
  static long a(Context paramContext)
  {
    try
    {
      ActivityManager localActivityManager = (ActivityManager)paramContext.getSystemService("activity");
      ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
      localActivityManager.getMemoryInfo(localMemoryInfo);
      long l = localMemoryInfo.totalMem;
      return l;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return 0L;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.a.b
 * JD-Core Version:    0.6.2
 */