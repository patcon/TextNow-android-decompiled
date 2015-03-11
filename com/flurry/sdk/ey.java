package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class ey
  implements ex<String>
{
  public void a(OutputStream paramOutputStream, String paramString)
  {
    if ((paramOutputStream == null) || (paramString == null))
      return;
    byte[] arrayOfByte = paramString.getBytes("utf-8");
    paramOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
  }

  public String b(InputStream paramInputStream)
  {
    if (paramInputStream == null)
      return null;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    fe.a(paramInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toString();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ey
 * JD-Core Version:    0.6.2
 */