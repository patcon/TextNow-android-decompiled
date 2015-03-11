package com.google.android.gms.internal;

import android.database.CharArrayBuffer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

public final class ik
{
  public static byte[] a(InputStream paramInputStream, boolean paramBoolean)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[10000];
    try
    {
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte, 0, i);
      }
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException(localIOException);
    }
    if (paramBoolean)
      paramInputStream.close();
    return localByteArrayOutputStream.toByteArray();
  }

  public static void b(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    if ((paramCharArrayBuffer.data == null) || (paramCharArrayBuffer.data.length < paramString.length()))
      paramCharArrayBuffer.data = paramString.toCharArray();
    while (true)
    {
      paramCharArrayBuffer.sizeCopied = paramString.length();
      return;
      paramString.getChars(0, paramString.length(), paramCharArrayBuffer.data, 0);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ik
 * JD-Core Version:    0.6.2
 */