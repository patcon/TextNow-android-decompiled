package com.flurry.sdk;

import java.io.OutputStream;

public class gh extends gc
{
  private OutputStream a;
  private final byte[] b = new byte[12];

  gh(OutputStream paramOutputStream)
  {
    a(paramOutputStream);
  }

  gh a(OutputStream paramOutputStream)
  {
    if (paramOutputStream == null)
      throw new NullPointerException("OutputStream cannot be null!");
    this.a = paramOutputStream;
    return this;
  }

  public void a(double paramDouble)
  {
    byte[] arrayOfByte = new byte[8];
    int i = ga.a(paramDouble, arrayOfByte, 0);
    this.a.write(arrayOfByte, 0, i);
  }

  public void a(float paramFloat)
  {
    int i = ga.a(paramFloat, this.b, 0);
    this.a.write(this.b, 0, i);
  }

  public void a(boolean paramBoolean)
  {
    OutputStream localOutputStream = this.a;
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      localOutputStream.write(i);
      return;
    }
  }

  public void b(long paramLong)
  {
    long l = paramLong << 1 ^ paramLong >> 63;
    if ((0x80000000 & l) == 0L)
    {
      int j = (int)l;
      while ((j & 0xFFFFFF80) != 0)
      {
        this.a.write((byte)(0xFF & (j | 0x80)));
        j >>>= 7;
      }
      this.a.write((byte)j);
      return;
    }
    int i = ga.a(paramLong, this.b, 0);
    this.a.write(this.b, 0, i);
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.a.write(paramArrayOfByte, paramInt1, paramInt2);
  }

  public void c(int paramInt)
  {
    int i = paramInt << 1 ^ paramInt >> 31;
    if ((i & 0xFFFFFF80) == 0)
    {
      this.a.write(i);
      return;
    }
    if ((i & 0xFFFFC000) == 0)
    {
      this.a.write(i | 0x80);
      this.a.write(i >>> 7);
      return;
    }
    int j = ga.a(paramInt, this.b, 0);
    this.a.write(this.b, 0, j);
  }

  public void flush()
  {
    this.a.flush();
  }

  protected void g()
  {
    this.a.write(0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gh
 * JD-Core Version:    0.6.2
 */