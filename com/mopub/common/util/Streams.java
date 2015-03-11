package com.mopub.common.util;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Streams
{
  public static void closeStream(Closeable paramCloseable)
  {
    if (paramCloseable == null)
      return;
    try
    {
      paramCloseable.close();
      return;
    }
    catch (IOException localIOException)
    {
    }
  }

  public static void copyContent(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    if ((paramInputStream == null) || (paramOutputStream == null))
      throw new IOException("Unable to copy from or to a null stream.");
    byte[] arrayOfByte = new byte[16384];
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }

  public static void copyContent(InputStream paramInputStream, OutputStream paramOutputStream, long paramLong)
  {
    if ((paramInputStream == null) || (paramOutputStream == null))
      throw new IOException("Unable to copy from or to a null stream.");
    byte[] arrayOfByte = new byte[16384];
    long l = 0L;
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      l += i;
      if (l >= paramLong)
        throw new IOException("Error copying content: attempted to copy " + l + " bytes, with " + paramLong + " maximum.");
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }

  public static void readStream(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    int i = 0;
    int j = paramArrayOfByte.length;
    do
    {
      int k = paramInputStream.read(paramArrayOfByte, i, j);
      if (k == -1)
        break;
      i += k;
      j -= k;
    }
    while (j > 0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.common.util.Streams
 * JD-Core Version:    0.6.2
 */