package com.flurry.sdk;

import java.io.IOException;
import java.io.OutputStream;

public class gd extends gc
{
  private byte[] a;
  private int b;
  private gd.a c;
  private int d;

  gd(OutputStream paramOutputStream, int paramInt)
  {
    a(paramOutputStream, paramInt);
  }

  private void d(int paramInt)
  {
    if (this.a.length - this.b < paramInt)
      h();
  }

  private void e(int paramInt)
  {
    if (this.b == this.a.length)
      h();
    byte[] arrayOfByte = this.a;
    int i = this.b;
    this.b = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt & 0xFF));
  }

  private void h()
  {
    if (this.b > 0)
    {
      this.c.a(this.a, 0, this.b);
      this.b = 0;
    }
  }

  gd a(OutputStream paramOutputStream, int paramInt)
  {
    if (paramOutputStream == null)
      throw new NullPointerException("OutputStream cannot be null!");
    if ((this.c != null) && (this.b > 0));
    try
    {
      h();
      this.c = new gd.b(paramOutputStream, null);
      this.b = 0;
      if ((this.a == null) || (this.a.length != paramInt))
        this.a = new byte[paramInt];
      this.d = (this.a.length >>> 1);
      if (this.d > 512)
        this.d = 512;
      return this;
    }
    catch (IOException localIOException)
    {
      throw new fk("Failure flushing old output", localIOException);
    }
  }

  public void a(double paramDouble)
  {
    d(8);
    this.b += ga.a(paramDouble, this.a, this.b);
  }

  public void a(float paramFloat)
  {
    d(4);
    this.b += ga.a(paramFloat, this.a, this.b);
  }

  public void a(boolean paramBoolean)
  {
    if (this.a.length == this.b)
      h();
    this.b += ga.a(paramBoolean, this.a, this.b);
  }

  public void b(long paramLong)
  {
    d(10);
    this.b += ga.a(paramLong, this.a, this.b);
  }

  public void b(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 > this.d)
    {
      h();
      this.c.a(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    d(paramInt2);
    System.arraycopy(paramArrayOfByte, paramInt1, this.a, this.b, paramInt2);
    this.b = (paramInt2 + this.b);
  }

  public void c(int paramInt)
  {
    d(5);
    this.b += ga.a(paramInt, this.a, this.b);
  }

  public void flush()
  {
    h();
    this.c.a();
  }

  protected void g()
  {
    e(0);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gd
 * JD-Core Version:    0.6.2
 */