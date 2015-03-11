package com.flurry.sdk;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class gb extends gf
{
  private gb.c a = null;
  private byte[] b = null;
  private int c = 0;
  private int d = 0;
  private int e = 0;
  private final gy f = new gy();

  protected gb()
  {
  }

  gb(InputStream paramInputStream, int paramInt)
  {
    a(paramInputStream, paramInt);
  }

  gb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(paramArrayOfByte, paramInt1, paramInt2);
  }

  private void a(int paramInt, gb.c paramc)
  {
    if (this.a != null)
      this.a.a();
    paramc.a(paramInt, this);
    this.a = paramc;
  }

  private long b(long paramLong)
  {
    int i = 1;
    int j = 0xFF & this.b[this.d];
    long l = paramLong ^ (0x7F & j) << 28;
    if (j > 127)
    {
      byte[] arrayOfByte1 = this.b;
      int k = this.d;
      i = 2;
      int m = 0xFF & arrayOfByte1[(k + 1)];
      l ^= (0x7F & m) << 35;
      if (m > 127)
      {
        byte[] arrayOfByte2 = this.b;
        int n = this.d;
        i = 3;
        int i1 = 0xFF & arrayOfByte2[(n + 2)];
        l ^= (0x7F & i1) << 42;
        if (i1 > 127)
        {
          byte[] arrayOfByte3 = this.b;
          int i2 = this.d;
          i = 4;
          int i3 = 0xFF & arrayOfByte3[(i2 + 3)];
          l ^= (0x7F & i3) << 49;
          if (i3 > 127)
          {
            byte[] arrayOfByte4 = this.b;
            int i4 = this.d;
            i = 5;
            int i5 = 0xFF & arrayOfByte4[(i4 + 4)];
            l ^= (0x7F & i5) << 56;
            if (i5 > 127)
            {
              byte[] arrayOfByte5 = this.b;
              int i6 = this.d;
              i = 6;
              int i7 = 0xFF & arrayOfByte5[(i6 + 5)];
              l ^= (0x7F & i7) << 63;
              if (i7 > 127)
                throw new IOException("Invalid long encoding");
            }
          }
        }
      }
    }
    this.d = (i + this.d);
    return l;
  }

  private void b(int paramInt)
  {
    int i = this.e - this.d;
    if (i < paramInt)
      this.a.a(this.b, this.d, this.c, i);
  }

  private long t()
  {
    for (long l = d(); l < 0L; l = d())
      a(e());
    return l;
  }

  gb.a a()
  {
    return new gb.a(this, null);
  }

  gb a(InputStream paramInputStream, int paramInt)
  {
    a(paramInt, new gb.d(paramInputStream, null));
    return this;
  }

  gb a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    a(8192, new gb.b(paramArrayOfByte, paramInt1, paramInt2, null));
    return this;
  }

  public gy a(gy paramgy)
  {
    int i = d();
    if (paramgy != null);
    while (true)
    {
      paramgy.a(i);
      if (i != 0)
        c(paramgy.a(), 0, i);
      return paramgy;
      paramgy = new gy();
    }
  }

  public ByteBuffer a(ByteBuffer paramByteBuffer)
  {
    int i = d();
    if ((paramByteBuffer != null) && (i <= paramByteBuffer.capacity()))
      paramByteBuffer.clear();
    while (true)
    {
      c(paramByteBuffer.array(), paramByteBuffer.position(), i);
      paramByteBuffer.limit(i);
      return paramByteBuffer;
      paramByteBuffer = ByteBuffer.allocate(i);
    }
  }

  public void a(int paramInt)
  {
    a(paramInt);
  }

  protected void a(long paramLong)
  {
    int i = this.e - this.d;
    if (paramLong <= i)
    {
      this.d = ((int)(paramLong + this.d));
      return;
    }
    this.d = 0;
    this.e = 0;
    long l = paramLong - i;
    this.a.a(l);
  }

  public void b()
  {
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    c(paramArrayOfByte, paramInt1, paramInt2);
  }

  protected void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.e - this.d;
    if (paramInt2 <= i)
    {
      System.arraycopy(this.b, this.d, paramArrayOfByte, paramInt1, paramInt2);
      this.d = (paramInt2 + this.d);
      return;
    }
    System.arraycopy(this.b, this.d, paramArrayOfByte, paramInt1, i);
    int j = paramInt1 + i;
    int k = paramInt2 - i;
    this.d = this.e;
    this.a.a(paramArrayOfByte, j, k);
  }

  public boolean c()
  {
    if (this.e == this.d)
    {
      this.e = this.a.b(this.b, 0, this.b.length);
      this.d = 0;
      if (this.e == 0)
        throw new EOFException();
    }
    byte[] arrayOfByte = this.b;
    int i = this.d;
    this.d = (i + 1);
    return (0xFF & arrayOfByte[i]) == 1;
  }

  public int d()
  {
    int i = 5;
    b(i);
    int j = 1;
    int k = 0xFF & this.b[this.d];
    int m = k & 0x7F;
    if (k > 127)
    {
      byte[] arrayOfByte1 = this.b;
      int n = this.d;
      j = 2;
      int i1 = 0xFF & arrayOfByte1[(n + 1)];
      m ^= (i1 & 0x7F) << 7;
      if (i1 > 127)
      {
        byte[] arrayOfByte2 = this.b;
        int i2 = this.d;
        j = 3;
        int i3 = 0xFF & arrayOfByte2[(i2 + 2)];
        m ^= (i3 & 0x7F) << 14;
        if (i3 > 127)
        {
          byte[] arrayOfByte3 = this.b;
          int i4 = this.d;
          j = 4;
          int i5 = 0xFF & arrayOfByte3[(i4 + 3)];
          m ^= (i5 & 0x7F) << 21;
          if (i5 > 127)
          {
            int i6 = 0xFF & this.b[(4 + this.d)];
            m ^= (i6 & 0x7F) << 28;
            if (i6 <= 127)
              break label225;
            throw new IOException("Invalid int encoding");
          }
        }
      }
    }
    i = j;
    label225: this.d = (i + this.d);
    if (this.d > this.e)
      throw new EOFException();
    return m >>> 1 ^ -(m & 0x1);
  }

  public long e()
  {
    b(10);
    byte[] arrayOfByte1 = this.b;
    int i = this.d;
    this.d = (i + 1);
    int j = 0xFF & arrayOfByte1[i];
    int k = j & 0x7F;
    int i1;
    int i4;
    int i7;
    long l;
    if (j > 127)
    {
      byte[] arrayOfByte2 = this.b;
      int m = this.d;
      this.d = (m + 1);
      int n = 0xFF & arrayOfByte2[m];
      i1 = k ^ (n & 0x7F) << 7;
      if (n > 127)
      {
        byte[] arrayOfByte3 = this.b;
        int i2 = this.d;
        this.d = (i2 + 1);
        int i3 = 0xFF & arrayOfByte3[i2];
        i4 = i1 ^ (i3 & 0x7F) << 14;
        if (i3 > 127)
        {
          byte[] arrayOfByte4 = this.b;
          int i5 = this.d;
          this.d = (i5 + 1);
          int i6 = 0xFF & arrayOfByte4[i5];
          i7 = i4 ^ (i6 & 0x7F) << 21;
          if (i6 > 127)
            l = b(i7);
        }
      }
    }
    while (this.d > this.e)
    {
      throw new EOFException();
      l = i7;
      continue;
      l = i4;
      continue;
      l = i1;
      continue;
      l = k;
    }
    return l >>> 1 ^ -(l & 1L);
  }

  public float f()
  {
    b(4);
    int i = 0xFF & this.b[this.d] | (0xFF & this.b[(1 + this.d)]) << 8 | (0xFF & this.b[(2 + this.d)]) << 16 | (0xFF & this.b[(3 + this.d)]) << 24;
    if (4 + this.d > this.e)
      throw new EOFException();
    this.d = (4 + this.d);
    return Float.intBitsToFloat(i);
  }

  public double g()
  {
    b(8);
    int i = 0xFF & this.b[this.d] | (0xFF & this.b[(1 + this.d)]) << 8 | (0xFF & this.b[(2 + this.d)]) << 16 | (0xFF & this.b[(3 + this.d)]) << 24;
    int j = 0xFF & this.b[(4 + this.d)] | (0xFF & this.b[(5 + this.d)]) << 8 | (0xFF & this.b[(6 + this.d)]) << 16 | (0xFF & this.b[(7 + this.d)]) << 24;
    if (8 + this.d > this.e)
      throw new EOFException();
    this.d = (8 + this.d);
    return Double.longBitsToDouble(0xFFFFFFFF & i | j << 32);
  }

  public String h()
  {
    return a(this.f).toString();
  }

  public void i()
  {
    a(d());
  }

  public void j()
  {
    a(d());
  }

  public int k()
  {
    return d();
  }

  protected long l()
  {
    long l = e();
    if (l < 0L)
    {
      e();
      l = -l;
    }
    return l;
  }

  public long m()
  {
    return l();
  }

  public long n()
  {
    return l();
  }

  public long o()
  {
    return t();
  }

  public long p()
  {
    return l();
  }

  public long q()
  {
    return l();
  }

  public long r()
  {
    return t();
  }

  public int s()
  {
    return d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gb
 * JD-Core Version:    0.6.2
 */