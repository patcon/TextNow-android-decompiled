package com.flurry.sdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class az extends FilterInputStream
{
  private final long a;
  private long b;

  public az(InputStream paramInputStream, long paramLong)
  {
    super(paramInputStream);
    this.a = paramLong;
  }

  private int a(int paramInt)
  {
    this.b += paramInt;
    if (this.b > this.a)
      throw new IOException("Size limit exceeded: " + this.a + " bytes, read " + this.b + " bytes!");
    return paramInt;
  }

  public void close()
  {
    this.in = null;
  }

  public int read()
  {
    return a(super.read());
  }

  public int read(byte[] paramArrayOfByte)
  {
    return a(super.read(paramArrayOfByte));
  }

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return a(super.read(paramArrayOfByte, paramInt1, paramInt2));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.az
 * JD-Core Version:    0.6.2
 */