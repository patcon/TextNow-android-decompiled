package com.flurry.sdk;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;

public final class sj extends OutputStream
{
  private static final byte[] a = new byte[0];
  private final si b;
  private final LinkedList<byte[]> c = new LinkedList();
  private int d;
  private byte[] e;
  private int f;

  public sj()
  {
    this(null);
  }

  public sj(int paramInt)
  {
    this(null, paramInt);
  }

  public sj(si paramsi)
  {
    this(paramsi, 500);
  }

  public sj(si paramsi, int paramInt)
  {
    this.b = paramsi;
    if (paramsi == null)
    {
      this.e = new byte[paramInt];
      return;
    }
    this.e = paramsi.a(si.a.c);
  }

  private void g()
  {
    int i = 262144;
    this.d += this.e.length;
    int j = Math.max(this.d >> 1, 1000);
    if (j > i);
    while (true)
    {
      this.c.add(this.e);
      this.e = new byte[i];
      this.f = 0;
      return;
      i = j;
    }
  }

  public final void a()
  {
    this.d = 0;
    this.f = 0;
    if (!this.c.isEmpty())
      this.c.clear();
  }

  public final void a(int paramInt)
  {
    if (this.f >= this.e.length)
      g();
    byte[] arrayOfByte = this.e;
    int i = this.f;
    this.f = (i + 1);
    arrayOfByte[i] = ((byte)paramInt);
  }

  public final void b(int paramInt)
  {
    if (1 + this.f < this.e.length)
    {
      byte[] arrayOfByte1 = this.e;
      int i = this.f;
      this.f = (i + 1);
      arrayOfByte1[i] = ((byte)(paramInt >> 8));
      byte[] arrayOfByte2 = this.e;
      int j = this.f;
      this.f = (j + 1);
      arrayOfByte2[j] = ((byte)paramInt);
      return;
    }
    a(paramInt >> 8);
    a(paramInt);
  }

  public final byte[] b()
  {
    int i = this.d + this.f;
    if (i == 0)
      return a;
    byte[] arrayOfByte1 = new byte[i];
    Iterator localIterator = this.c.iterator();
    int j = 0;
    while (localIterator.hasNext())
    {
      byte[] arrayOfByte2 = (byte[])localIterator.next();
      int m = arrayOfByte2.length;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, j, m);
      j += m;
    }
    System.arraycopy(this.e, 0, arrayOfByte1, j, this.f);
    int k = j + this.f;
    if (k != i)
      throw new RuntimeException("Internal error: total len assumed to be " + i + ", copied " + k + " bytes");
    if (!this.c.isEmpty())
      a();
    return arrayOfByte1;
  }

  public final void c(int paramInt)
  {
    if (2 + this.f < this.e.length)
    {
      byte[] arrayOfByte1 = this.e;
      int i = this.f;
      this.f = (i + 1);
      arrayOfByte1[i] = ((byte)(paramInt >> 16));
      byte[] arrayOfByte2 = this.e;
      int j = this.f;
      this.f = (j + 1);
      arrayOfByte2[j] = ((byte)(paramInt >> 8));
      byte[] arrayOfByte3 = this.e;
      int k = this.f;
      this.f = (k + 1);
      arrayOfByte3[k] = ((byte)paramInt);
      return;
    }
    a(paramInt >> 16);
    a(paramInt >> 8);
    a(paramInt);
  }

  public final byte[] c()
  {
    a();
    return this.e;
  }

  public final void close()
  {
  }

  public final byte[] d()
  {
    g();
    return this.e;
  }

  public final byte[] d(int paramInt)
  {
    this.f = paramInt;
    return b();
  }

  public final void e(int paramInt)
  {
    this.f = paramInt;
  }

  public final byte[] e()
  {
    return this.e;
  }

  public final int f()
  {
    return this.f;
  }

  public final void flush()
  {
  }

  public final void write(int paramInt)
  {
    a(paramInt);
  }

  public final void write(byte[] paramArrayOfByte)
  {
    write(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public final void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while (true)
    {
      int i = Math.min(this.e.length - this.f, paramInt2);
      if (i > 0)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, this.e, this.f, i);
        paramInt1 += i;
        this.f = (i + this.f);
        paramInt2 -= i;
      }
      if (paramInt2 <= 0)
        break;
      g();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sj
 * JD-Core Version:    0.6.2
 */