package com.flurry.sdk;

import java.io.InputStream;

abstract class gb$c extends InputStream
{
  protected gb.a a;

  protected void a()
  {
    this.a.a();
  }

  protected void a(int paramInt, gb paramgb)
  {
    gb.a(paramgb, new byte[paramInt]);
    gb.a(paramgb, 0);
    gb.c(paramgb, 0);
    gb.b(paramgb, 0);
    this.a = new gb.a(paramgb, null);
  }

  protected abstract void a(long paramLong);

  protected abstract void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  protected void a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(paramArrayOfByte, paramInt1, paramArrayOfByte, paramInt2, paramInt3);
    this.a.a(paramInt2);
    int i = paramInt3 + b(paramArrayOfByte, paramInt2 + paramInt3, paramArrayOfByte.length - paramInt3);
    this.a.b(i);
  }

  public int available()
  {
    return this.a.c() - this.a.b();
  }

  protected abstract int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  protected abstract long b(long paramLong);

  public int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = this.a.c();
    int j = this.a.b();
    byte[] arrayOfByte = this.a.d();
    int k = i - j;
    if (k >= paramInt2)
    {
      System.arraycopy(arrayOfByte, j, paramArrayOfByte, paramInt1, paramInt2);
      int n = j + paramInt2;
      this.a.a(n);
    }
    do
    {
      return paramInt2;
      System.arraycopy(arrayOfByte, j, paramArrayOfByte, paramInt1, k);
      int m = j + k;
      this.a.a(m);
      paramInt2 = k + b(paramArrayOfByte, paramInt1 + k, paramInt2 - k);
    }
    while (paramInt2 != 0);
    return -1;
  }

  public long skip(long paramLong)
  {
    int i = this.a.c();
    int j = this.a.b();
    int k = i - j;
    if (k > paramLong)
    {
      int m = (int)(paramLong + j);
      this.a.a(m);
      return paramLong;
    }
    this.a.a(i);
    return b(paramLong - k) + k;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gb.c
 * JD-Core Version:    0.6.2
 */