package com.flurry.sdk;

import java.io.EOFException;

class gb$b extends gb.c
{
  private byte[] b;
  private int c;
  private int d;
  private boolean e = false;

  private gb$b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if ((paramArrayOfByte.length < 16) || (paramInt2 < 16))
    {
      this.b = new byte[16];
      System.arraycopy(paramArrayOfByte, paramInt1, this.b, 0, paramInt2);
      this.c = 0;
      this.d = paramInt2;
      return;
    }
    this.b = paramArrayOfByte;
    this.c = paramInt1;
    this.d = (paramInt1 + paramInt2);
  }

  protected void a(int paramInt, gb paramgb)
  {
    gb.a(paramgb, this.b);
    gb.a(paramgb, this.c);
    gb.c(paramgb, this.c);
    gb.b(paramgb, this.d);
    this.a = new gb.a(paramgb, null);
  }

  protected void a(long paramLong)
  {
    if (b(paramLong) < paramLong)
      throw new EOFException();
  }

  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (b(paramArrayOfByte, paramInt1, paramInt2) < paramInt2)
      throw new EOFException();
  }

  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    if (!this.e)
    {
      byte[] arrayOfByte = new byte[paramInt3 + 16];
      System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt3);
      this.a.a(arrayOfByte, 0, paramInt3);
      this.e = true;
    }
  }

  protected int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return 0;
  }

  protected long b(long paramLong)
  {
    this.d = this.a.c();
    this.c = this.a.b();
    long l = this.d - this.c;
    if (l >= paramLong)
    {
      this.c = ((int)(paramLong + this.c));
      this.a.a(this.c);
      return paramLong;
    }
    this.c = ((int)(l + this.c));
    this.a.a(this.c);
    return l;
  }

  public void close()
  {
    this.a.a(this.a.c());
  }

  public int read()
  {
    this.d = this.a.c();
    this.c = this.a.b();
    if (this.c >= this.d)
      return -1;
    byte[] arrayOfByte = this.a.d();
    int i = this.c;
    this.c = (i + 1);
    int j = 0xFF & arrayOfByte[i];
    this.a.a(this.c);
    return j;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gb.b
 * JD-Core Version:    0.6.2
 */