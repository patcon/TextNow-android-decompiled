package com.admarvel.android.ads;

import android.annotation.TargetApi;
import android.os.Build;

class AdFetcher$c
{
  @TargetApi(8)
  public static String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    String str1 = Build.CPU_ABI;
    String str2 = Build.CPU_ABI2;
    if (("x86".equals(str1)) || ("x86".equals(str2)))
      localStringBuilder.append("x86");
    if (("armeabi-v7a".equals(str1)) || ("armeabi-v7a".equals(str2)))
    {
      if (localStringBuilder.length() > 0)
        localStringBuilder.append(",").append("armeabi-v7a");
    }
    else if (("armeabi".equals(str1)) || ("armeabi".equals(str2)))
    {
      if (localStringBuilder.length() <= 0)
        break label130;
      localStringBuilder.append(",").append("armeabi");
    }
    while (true)
    {
      return localStringBuilder.toString();
      localStringBuilder.append("armeabi-v7a");
      break;
      label130: localStringBuilder.append("armeabi");
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdFetcher.c
 * JD-Core Version:    0.6.2
 */