package com.google.android.gms.internal;

import java.io.IOException;

class p
  implements n
{
  private lz kn;
  private byte[] ko;
  private final int kp;

  public p(int paramInt)
  {
    this.kp = paramInt;
    reset();
  }

  public byte[] A()
  {
    int i = this.kn.nQ();
    if (i < 0)
      throw new IOException();
    if (i == 0)
      return this.ko;
    byte[] arrayOfByte = new byte[this.ko.length - i];
    System.arraycopy(this.ko, 0, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }

  public void b(int paramInt, long paramLong)
  {
    this.kn.b(paramInt, paramLong);
  }

  public void b(int paramInt, String paramString)
  {
    this.kn.b(paramInt, paramString);
  }

  public void reset()
  {
    this.ko = new byte[this.kp];
    this.kn = lz.q(this.ko);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.p
 * JD-Core Version:    0.6.2
 */