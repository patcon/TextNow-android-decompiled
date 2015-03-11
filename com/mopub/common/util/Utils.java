package com.mopub.common.util;

import java.security.MessageDigest;
import java.util.concurrent.atomic.AtomicLong;

public class Utils
{
  private static final AtomicLong sNextGeneratedId = new AtomicLong(1L);

  public static boolean bitMaskContainsFlag(int paramInt1, int paramInt2)
  {
    return (paramInt1 & paramInt2) != 0;
  }

  public static long generateUniqueId()
  {
    long l1;
    long l2;
    do
    {
      l1 = sNextGeneratedId.get();
      l2 = l1 + 1L;
      if (l2 > 9223372036854775806L)
        l2 = 1L;
    }
    while (!sNextGeneratedId.compareAndSet(l1, l2));
    return l1;
  }

  public static String sha1(String paramString)
  {
    int i = 0;
    StringBuilder localStringBuilder = new StringBuilder();
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      byte[] arrayOfByte1 = paramString.getBytes("UTF-8");
      localMessageDigest.update(arrayOfByte1, 0, arrayOfByte1.length);
      byte[] arrayOfByte2 = localMessageDigest.digest();
      int j = arrayOfByte2.length;
      while (i < j)
      {
        byte b = arrayOfByte2[i];
        Object[] arrayOfObject = new Object[1];
        arrayOfObject[0] = Byte.valueOf(b);
        localStringBuilder.append(String.format("%02X", arrayOfObject));
        i++;
      }
      String str = localStringBuilder.toString().toLowerCase();
      return str;
    }
    catch (Exception localException)
    {
    }
    return "";
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.Utils
 * JD-Core Version:    0.6.2
 */