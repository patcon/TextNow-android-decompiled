package com.admarvel.android.ads;

import android.annotation.SuppressLint;
import android.os.Build;

class AdFetcher$a
{
  @SuppressLint({"InlinedApi", "NewApi"})
  public static String a()
  {
    int i = 0;
    String[] arrayOfString1 = Build.SUPPORTED_32_BIT_ABIS;
    if (arrayOfString1.length > 0)
    {
      StringBuilder localStringBuilder1 = new StringBuilder();
      int j = arrayOfString1.length;
      while (i < j)
      {
        localStringBuilder1.append(arrayOfString1[i]).append(",");
        i++;
      }
      localStringBuilder1.deleteCharAt(-1 + localStringBuilder1.length());
      return localStringBuilder1.toString();
    }
    String[] arrayOfString2 = Build.SUPPORTED_64_BIT_ABIS;
    StringBuilder localStringBuilder2 = new StringBuilder();
    int k = arrayOfString2.length;
    while (i < k)
    {
      localStringBuilder2.append(arrayOfString2[i]).append(",");
      i++;
    }
    localStringBuilder2.deleteCharAt(-1 + localStringBuilder2.length());
    return localStringBuilder2.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.ads.AdFetcher.a
 * JD-Core Version:    0.6.2
 */