package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ew
  implements ex<byte[]>
{
  public void a(OutputStream paramOutputStream, byte[] paramArrayOfByte)
  {
    if ((paramOutputStream == null) || (paramArrayOfByte == null))
      return;
    paramOutputStream.write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public byte[] b(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      return null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    fe.a(paramInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ew
 * JD-Core Version:    0.6.2
 */