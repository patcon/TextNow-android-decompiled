package com.mopub.common.util;

import java.io.InputStream;

public class Strings
{
  public static String fromStream(InputStream paramInputStream)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    byte[] arrayOfByte = new byte[4096];
    for (int i = 0; i != -1; i = paramInputStream.read(arrayOfByte))
      localStringBuffer.append(new String(arrayOfByte, 0, i));
    paramInputStream.close();
    return localStringBuffer.toString();
  }

  public static boolean isEmpty(String paramString)
  {
    if (paramString == null);
    while (paramString.length() != 0)
      return false;
    return true;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.Strings
 * JD-Core Version:    0.6.2
 */