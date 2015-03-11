package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

public final class pg
{
  private final int awI;
  private final byte[] buffer;
  private int position;

  private pg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.position = paramInt1;
    this.awI = (paramInt1 + paramInt2);
  }

  public static int D(long paramLong)
  {
    return G(paramLong);
  }

  public static int E(long paramLong)
  {
    return G(I(paramLong));
  }

  public static int G(long paramLong)
  {
    if ((0xFFFFFF80 & paramLong) == 0L)
      return 1;
    if ((0xFFFFC000 & paramLong) == 0L)
      return 2;
    if ((0xFFE00000 & paramLong) == 0L)
      return 3;
    if ((0xF0000000 & paramLong) == 0L)
      return 4;
    if ((0x0 & paramLong) == 0L)
      return 5;
    if ((0x0 & paramLong) == 0L)
      return 6;
    if ((0x0 & paramLong) == 0L)
      return 7;
    if ((0x0 & paramLong) == 0L)
      return 8;
    if ((0x0 & paramLong) == 0L)
      return 9;
    return 10;
  }

  public static long I(long paramLong)
  {
    return paramLong << 1 ^ paramLong >> 63;
  }

  public static int V(boolean paramBoolean)
  {
    return 1;
  }

  public static int b(int paramInt, double paramDouble)
  {
    return gz(paramInt) + f(paramDouble);
  }

  public static int b(int paramInt, pn parampn)
  {
    return 2 * gz(paramInt) + d(parampn);
  }

  public static int b(int paramInt, byte[] paramArrayOfByte)
  {
    return gz(paramInt) + s(paramArrayOfByte);
  }

  public static pg b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new pg(paramArrayOfByte, paramInt1, paramInt2);
  }

  public static int c(int paramInt, float paramFloat)
  {
    return gz(paramInt) + e(paramFloat);
  }

  public static int c(int paramInt, pn parampn)
  {
    return gz(paramInt) + e(parampn);
  }

  public static int c(int paramInt, boolean paramBoolean)
  {
    return gz(paramInt) + V(paramBoolean);
  }

  public static int d(int paramInt, long paramLong)
  {
    return gz(paramInt) + D(paramLong);
  }

  public static int d(pn parampn)
  {
    return parampn.qI();
  }

  public static int di(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      int i = gB(arrayOfByte.length);
      int j = arrayOfByte.length;
      return j + i;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
    }
    throw new RuntimeException("UTF-8 not supported.");
  }

  public static int e(float paramFloat)
  {
    return 4;
  }

  public static int e(int paramInt, long paramLong)
  {
    return gz(paramInt) + E(paramLong);
  }

  public static int e(pn parampn)
  {
    int i = parampn.qI();
    return i + gB(i);
  }

  public static int f(double paramDouble)
  {
    return 8;
  }

  public static int gB(int paramInt)
  {
    if ((paramInt & 0xFFFFFF80) == 0)
      return 1;
    if ((paramInt & 0xFFFFC000) == 0)
      return 2;
    if ((0xFFE00000 & paramInt) == 0)
      return 3;
    if ((0xF0000000 & paramInt) == 0)
      return 4;
    return 5;
  }

  public static int gD(int paramInt)
  {
    return paramInt << 1 ^ paramInt >> 31;
  }

  public static int gw(int paramInt)
  {
    if (paramInt >= 0)
      return gB(paramInt);
    return 10;
  }

  public static int gx(int paramInt)
  {
    return gB(gD(paramInt));
  }

  public static int gz(int paramInt)
  {
    return gB(pq.x(paramInt, 0));
  }

  public static int j(int paramInt, String paramString)
  {
    return gz(paramInt) + di(paramString);
  }

  public static pg q(byte[] paramArrayOfByte)
  {
    return b(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public static int s(byte[] paramArrayOfByte)
  {
    return gB(paramArrayOfByte.length) + paramArrayOfByte.length;
  }

  public static int u(int paramInt1, int paramInt2)
  {
    return gz(paramInt1) + gw(paramInt2);
  }

  public static int v(int paramInt1, int paramInt2)
  {
    return gz(paramInt1) + gx(paramInt2);
  }

  public final void B(long paramLong)
  {
    F(paramLong);
  }

  public final void C(long paramLong)
  {
    F(I(paramLong));
  }

  public final void F(long paramLong)
  {
    while (true)
    {
      if ((0xFFFFFF80 & paramLong) == 0L)
      {
        b((byte)(int)paramLong);
        return;
      }
      b((byte)(0x80 | 0x7F & (int)paramLong));
      paramLong >>>= 7;
    }
  }

  public final void H(long paramLong)
  {
    b((byte)(0xFF & (int)paramLong));
    b((byte)(0xFF & (int)(paramLong >> 8)));
    b((byte)(0xFF & (int)(paramLong >> 16)));
    b((byte)(0xFF & (int)(paramLong >> 24)));
    b((byte)(0xFF & (int)(paramLong >> 32)));
    b((byte)(0xFF & (int)(paramLong >> 40)));
    b((byte)(0xFF & (int)(paramLong >> 48)));
    b((byte)(0xFF & (int)(paramLong >> 56)));
  }

  public final void U(boolean paramBoolean)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      b((byte)i);
      return;
    }
  }

  public final void a(int paramInt, double paramDouble)
  {
    w(paramInt, 1);
    e(paramDouble);
  }

  public final void a(int paramInt, pn parampn)
  {
    w(paramInt, 2);
    c(parampn);
  }

  public final void a(int paramInt, byte[] paramArrayOfByte)
  {
    w(paramInt, 2);
    r(paramArrayOfByte);
  }

  public final void b(byte paramByte)
  {
    if (this.position == this.awI)
      throw new pg.a(this.position, this.awI);
    byte[] arrayOfByte = this.buffer;
    int i = this.position;
    this.position = (i + 1);
    arrayOfByte[i] = paramByte;
  }

  public final void b(int paramInt, float paramFloat)
  {
    w(paramInt, 5);
    d(paramFloat);
  }

  public final void b(int paramInt, long paramLong)
  {
    w(paramInt, 0);
    F(paramLong);
  }

  public final void b(int paramInt, String paramString)
  {
    w(paramInt, 2);
    dh(paramString);
  }

  public final void b(int paramInt, boolean paramBoolean)
  {
    w(paramInt, 0);
    U(paramBoolean);
  }

  public final void b(pn parampn)
  {
    parampn.a(this);
  }

  public final void c(int paramInt, long paramLong)
  {
    w(paramInt, 0);
    C(paramLong);
  }

  public final void c(pn parampn)
  {
    gA(parampn.qH());
    parampn.a(this);
  }

  public final void c(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.awI - this.position >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.position, paramInt2);
      this.position = (paramInt2 + this.position);
      return;
    }
    throw new pg.a(this.position, this.awI);
  }

  public final void d(float paramFloat)
  {
    gC(Float.floatToIntBits(paramFloat));
  }

  public final void dh(String paramString)
  {
    byte[] arrayOfByte = paramString.getBytes("UTF-8");
    gA(arrayOfByte.length);
    t(arrayOfByte);
  }

  public final void e(double paramDouble)
  {
    H(Double.doubleToLongBits(paramDouble));
  }

  public final void gA(int paramInt)
  {
    while (true)
    {
      if ((paramInt & 0xFFFFFF80) == 0)
      {
        b((byte)paramInt);
        return;
      }
      b((byte)(0x80 | paramInt & 0x7F));
      paramInt >>>= 7;
    }
  }

  public final void gC(int paramInt)
  {
    b((byte)(paramInt & 0xFF));
    b((byte)(0xFF & paramInt >> 8));
    b((byte)(0xFF & paramInt >> 16));
    b((byte)(0xFF & paramInt >> 24));
  }

  public final void gu(int paramInt)
  {
    if (paramInt >= 0)
    {
      gA(paramInt);
      return;
    }
    F(paramInt);
  }

  public final void gv(int paramInt)
  {
    gA(gD(paramInt));
  }

  public final void gy(int paramInt)
  {
    b((byte)paramInt);
  }

  public final int qx()
  {
    return this.awI - this.position;
  }

  public final void qy()
  {
    if (qx() != 0)
      throw new IllegalStateException("Did not write as much data as expected.");
  }

  public final void r(byte[] paramArrayOfByte)
  {
    gA(paramArrayOfByte.length);
    t(paramArrayOfByte);
  }

  public final void s(int paramInt1, int paramInt2)
  {
    w(paramInt1, 0);
    gu(paramInt2);
  }

  public final void t(int paramInt1, int paramInt2)
  {
    w(paramInt1, 0);
    gv(paramInt2);
  }

  public final void t(byte[] paramArrayOfByte)
  {
    c(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public final void w(int paramInt1, int paramInt2)
  {
    gA(pq.x(paramInt1, paramInt2));
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pg
 * JD-Core Version:    0.6.2
 */