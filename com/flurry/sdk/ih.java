package com.flurry.sdk;

import java.io.InputStream;

public final class ih extends InputStream
{
  protected final ie a;
  final InputStream b;
  byte[] c;
  int d;
  final int e;

  public ih(ie paramie, InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a = paramie;
    this.b = paramInputStream;
    this.c = paramArrayOfByte;
    this.d = paramInt1;
    this.e = paramInt2;
  }

  private void a()
  {
    byte[] arrayOfByte = this.c;
    if (arrayOfByte != null)
    {
      this.c = null;
      if (this.a != null)
        this.a.a(arrayOfByte);
    }
  }

  public final int available()
  {
    if (this.c != null)
      return this.e - this.d;
    return this.b.available();
  }

  public final void close()
  {
    a();
    this.b.close();
  }

  public final void mark(int paramInt)
  {
    if (this.c == null)
      this.b.mark(paramInt);
  }

  public final boolean markSupported()
  {
    return (this.c == null) && (this.b.markSupported());
  }

  public final int read()
  {
    if (this.c != null)
    {
      byte[] arrayOfByte = this.c;
      int i = this.d;
      this.d = (i + 1);
      int j = 0xFF & arrayOfByte[i];
      if (this.d >= this.e)
        a();
      return j;
    }
    return this.b.read();
  }

  public final int read(byte[] paramArrayOfByte)
  {
    return read(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public final int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.c != null)
    {
      int i = this.e - this.d;
      if (paramInt2 > i)
        paramInt2 = i;
      System.arraycopy(this.c, this.d, paramArrayOfByte, paramInt1, paramInt2);
      this.d = (paramInt2 + this.d);
      if (this.d >= this.e)
        a();
      return paramInt2;
    }
    return this.b.read(paramArrayOfByte, paramInt1, paramInt2);
  }

  public final void reset()
  {
    if (this.c == null)
      this.b.reset();
  }

  public final long skip(long paramLong)
  {
    long l;
    if (this.c != null)
    {
      int i = this.e - this.d;
      if (i > paramLong)
      {
        this.d += (int)paramLong;
        return paramLong;
      }
      a();
      l = 0L + i;
      paramLong -= i;
    }
    while (true)
    {
      if (paramLong > 0L)
        l += this.b.skip(paramLong);
      return l;
      l = 0L;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ih
 * JD-Core Version:    0.6.2
 */