package com.flurry.sdk;

import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class hz extends ht
{
  static final byte[] g = sk.h();
  protected static final int[] h = sk.f();
  private static final byte[] u = { 110, 117, 108, 108 };
  private static final byte[] v = { 116, 114, 117, 101 };
  private static final byte[] w = { 102, 97, 108, 115, 101 };
  protected final ie i;
  protected final OutputStream j;
  protected int[] k = h;
  protected int l;
  protected id m;
  protected byte[] n;
  protected int o = 0;
  protected final int p;
  protected final int q;
  protected char[] r;
  protected final int s;
  protected boolean t;

  public hz(ie paramie, int paramInt, hn paramhn, OutputStream paramOutputStream)
  {
    super(paramInt, paramhn);
    this.i = paramie;
    this.j = paramOutputStream;
    this.t = true;
    this.n = paramie.f();
    this.p = this.n.length;
    this.q = (this.p >> 3);
    this.r = paramie.h();
    this.s = this.r.length;
    if (a(hf.a.g))
      a(127);
  }

  private final int a(int paramInt1, char[] paramArrayOfChar, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 55296) && (paramInt1 <= 57343))
    {
      if (paramInt2 >= paramInt3)
        i("Split surrogate on writeRaw() input (last character)");
      a(paramInt1, paramArrayOfChar[paramInt2]);
      return paramInt2 + 1;
    }
    byte[] arrayOfByte = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte[i1] = ((byte)(0xE0 | paramInt1 >> 12));
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte[i2] = ((byte)(0x80 | 0x3F & paramInt1 >> 6));
    int i3 = this.o;
    this.o = (i3 + 1);
    arrayOfByte[i3] = ((byte)(0x80 | paramInt1 & 0x3F));
    return paramInt2;
  }

  private int a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3)
  {
    int i1 = paramArrayOfByte2.length;
    int i2;
    if (paramInt1 + i1 > paramInt2)
    {
      this.o = paramInt1;
      o();
      i2 = this.o;
      if (i1 > paramArrayOfByte1.length)
        this.j.write(paramArrayOfByte2, 0, i1);
    }
    while (true)
    {
      return i2;
      System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, i2, i1);
      i2 += i1;
      while (i2 + paramInt3 * 6 > paramInt2)
      {
        o();
        return this.o;
        i2 = paramInt1;
      }
    }
  }

  private int a(byte[] paramArrayOfByte, int paramInt1, hp paramhp, int paramInt2)
  {
    byte[] arrayOfByte = paramhp.c();
    int i1 = arrayOfByte.length;
    if (i1 > 6)
      return a(paramArrayOfByte, paramInt1, this.p, arrayOfByte, paramInt2);
    System.arraycopy(arrayOfByte, 0, paramArrayOfByte, paramInt1, i1);
    return i1 + paramInt1;
  }

  private final void b(long paramLong)
  {
    if (23 + this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    this.o = ij.a(paramLong, this.n, this.o);
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }

  private final void b(byte[] paramArrayOfByte)
  {
    int i1 = paramArrayOfByte.length;
    if (i1 + this.o > this.p)
    {
      o();
      if (i1 > 512)
      {
        this.j.write(paramArrayOfByte, 0, i1);
        return;
      }
    }
    System.arraycopy(paramArrayOfByte, 0, this.n, this.o, i1);
    this.o = (i1 + this.o);
  }

  private final int c(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.n;
    if ((paramInt1 >= 55296) && (paramInt1 <= 57343))
    {
      int i4 = paramInt2 + 1;
      arrayOfByte[paramInt2] = 92;
      int i5 = i4 + 1;
      arrayOfByte[i4] = 117;
      int i6 = i5 + 1;
      arrayOfByte[i5] = g[(0xF & paramInt1 >> 12)];
      int i7 = i6 + 1;
      arrayOfByte[i6] = g[(0xF & paramInt1 >> 8)];
      int i8 = i7 + 1;
      arrayOfByte[i7] = g[(0xF & paramInt1 >> 4)];
      int i9 = i8 + 1;
      arrayOfByte[i8] = g[(paramInt1 & 0xF)];
      return i9;
    }
    int i1 = paramInt2 + 1;
    arrayOfByte[paramInt2] = ((byte)(0xE0 | paramInt1 >> 12));
    int i2 = i1 + 1;
    arrayOfByte[i1] = ((byte)(0x80 | 0x3F & paramInt1 >> 6));
    int i3 = i2 + 1;
    arrayOfByte[i2] = ((byte)(0x80 | paramInt1 & 0x3F));
    return i3;
  }

  private final void c(int paramInt)
  {
    if (13 + this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    this.o = ij.a(paramInt, this.n, this.o);
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }

  private final void c(Object paramObject)
  {
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    c(paramObject.toString());
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }

  private final void c(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    e(this.r, 0, paramInt2);
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }

  private int d(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = this.n;
    int i1 = paramInt2 + 1;
    arrayOfByte[paramInt2] = 92;
    int i2 = i1 + 1;
    arrayOfByte[i1] = 117;
    int i4;
    if (paramInt1 > 255)
    {
      int i7 = 0xFF & paramInt1 >> 8;
      int i8 = i2 + 1;
      arrayOfByte[i2] = g[(i7 >> 4)];
      i4 = i8 + 1;
      arrayOfByte[i8] = g[(i7 & 0xF)];
      paramInt1 &= 255;
    }
    while (true)
    {
      int i5 = i4 + 1;
      arrayOfByte[i4] = g[(paramInt1 >> 4)];
      int i6 = i5 + 1;
      arrayOfByte[i5] = g[(paramInt1 & 0xF)];
      return i6;
      int i3 = i2 + 1;
      arrayOfByte[i2] = 48;
      i4 = i3 + 1;
      arrayOfByte[i3] = 48;
    }
  }

  private final void d(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i1 = this.p;
    byte[] arrayOfByte = this.n;
    int i2 = paramInt1;
    while (true)
    {
      if (i2 < paramInt2)
        do
        {
          int i3 = paramArrayOfChar[i2];
          if (i3 >= 128)
            break;
          if (this.o >= i1)
            o();
          int i8 = this.o;
          this.o = (i8 + 1);
          arrayOfByte[i8] = ((byte)i3);
          i2++;
        }
        while (i2 < paramInt2);
      return;
      if (3 + this.o >= this.p)
        o();
      int i4 = i2 + 1;
      int i5 = paramArrayOfChar[i2];
      if (i5 < 2048)
      {
        int i6 = this.o;
        this.o = (i6 + 1);
        arrayOfByte[i6] = ((byte)(0xC0 | i5 >> 6));
        int i7 = this.o;
        this.o = (i7 + 1);
        arrayOfByte[i7] = ((byte)(0x80 | i5 & 0x3F));
        i2 = i4;
      }
      else
      {
        a(i5, paramArrayOfChar, i4, paramInt2);
        i2 = i4;
      }
    }
  }

  private final void e(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    do
    {
      int i1 = Math.min(this.q, paramInt2);
      if (i1 + this.o > this.p)
        o();
      f(paramArrayOfChar, paramInt1, i1);
      paramInt1 += i1;
      paramInt2 -= i1;
    }
    while (paramInt2 > 0);
  }

  private final void f(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 + paramInt1;
    int i2 = this.o;
    byte[] arrayOfByte = this.n;
    int[] arrayOfInt = this.k;
    while (paramInt1 < i1)
    {
      int i3 = paramArrayOfChar[paramInt1];
      if ((i3 > 127) || (arrayOfInt[i3] != 0))
        break;
      int i4 = i2 + 1;
      arrayOfByte[i2] = ((byte)i3);
      paramInt1++;
      i2 = i4;
    }
    this.o = i2;
    if (paramInt1 < i1)
    {
      if (this.m != null)
        i(paramArrayOfChar, paramInt1, i1);
    }
    else
      return;
    if (this.l == 0)
    {
      g(paramArrayOfChar, paramInt1, i1);
      return;
    }
    h(paramArrayOfChar, paramInt1, i1);
  }

  private final void g(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.o + 6 * (paramInt2 - paramInt1) > this.p)
      o();
    int i1 = this.o;
    byte[] arrayOfByte = this.n;
    int[] arrayOfInt = this.k;
    while (paramInt1 < paramInt2)
    {
      int i2 = paramInt1 + 1;
      int i3 = paramArrayOfChar[paramInt1];
      if (i3 <= 127)
      {
        if (arrayOfInt[i3] == 0)
        {
          int i7 = i1 + 1;
          arrayOfByte[i1] = ((byte)i3);
          i1 = i7;
          paramInt1 = i2;
        }
        else
        {
          int i5 = arrayOfInt[i3];
          if (i5 > 0)
          {
            int i6 = i1 + 1;
            arrayOfByte[i1] = 92;
            i1 = i6 + 1;
            arrayOfByte[i6] = ((byte)i5);
            paramInt1 = i2;
          }
          else
          {
            i1 = d(i3, i1);
            paramInt1 = i2;
          }
        }
      }
      else if (i3 <= 2047)
      {
        int i4 = i1 + 1;
        arrayOfByte[i1] = ((byte)(0xC0 | i3 >> 6));
        i1 = i4 + 1;
        arrayOfByte[i4] = ((byte)(0x80 | i3 & 0x3F));
        paramInt1 = i2;
      }
      else
      {
        i1 = c(i3, i1);
        paramInt1 = i2;
      }
    }
    this.o = i1;
  }

  private final void h(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.o + 6 * (paramInt2 - paramInt1) > this.p)
      o();
    int i1 = this.o;
    byte[] arrayOfByte = this.n;
    int[] arrayOfInt = this.k;
    int i2 = this.l;
    while (paramInt1 < paramInt2)
    {
      int i3 = paramInt1 + 1;
      int i4 = paramArrayOfChar[paramInt1];
      if (i4 <= 127)
      {
        if (arrayOfInt[i4] == 0)
        {
          int i8 = i1 + 1;
          arrayOfByte[i1] = ((byte)i4);
          i1 = i8;
          paramInt1 = i3;
        }
        else
        {
          int i6 = arrayOfInt[i4];
          if (i6 > 0)
          {
            int i7 = i1 + 1;
            arrayOfByte[i1] = 92;
            i1 = i7 + 1;
            arrayOfByte[i7] = ((byte)i6);
            paramInt1 = i3;
          }
          else
          {
            i1 = d(i4, i1);
            paramInt1 = i3;
          }
        }
      }
      else if (i4 > i2)
      {
        i1 = d(i4, i1);
        paramInt1 = i3;
      }
      else if (i4 <= 2047)
      {
        int i5 = i1 + 1;
        arrayOfByte[i1] = ((byte)(0xC0 | i4 >> 6));
        i1 = i5 + 1;
        arrayOfByte[i5] = ((byte)(0x80 | i4 & 0x3F));
        paramInt1 = i3;
      }
      else
      {
        i1 = c(i4, i1);
        paramInt1 = i3;
      }
    }
    this.o = i1;
  }

  private final void i(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.o + 6 * (paramInt2 - paramInt1) > this.p)
      o();
    int i1 = this.o;
    byte[] arrayOfByte = this.n;
    int[] arrayOfInt = this.k;
    int i2;
    id localid;
    if (this.l <= 0)
    {
      i2 = 65535;
      localid = this.m;
    }
    while (true)
    {
      if (paramInt1 >= paramInt2)
        break label391;
      int i3 = paramInt1 + 1;
      int i4 = paramArrayOfChar[paramInt1];
      if (i4 <= 127)
      {
        if (arrayOfInt[i4] == 0)
        {
          int i8 = i1 + 1;
          arrayOfByte[i1] = ((byte)i4);
          i1 = i8;
          paramInt1 = i3;
          continue;
          i2 = this.l;
          break;
        }
        int i6 = arrayOfInt[i4];
        if (i6 > 0)
        {
          int i7 = i1 + 1;
          arrayOfByte[i1] = 92;
          i1 = i7 + 1;
          arrayOfByte[i7] = ((byte)i6);
          paramInt1 = i3;
          continue;
        }
        if (i6 == -2)
        {
          hp localhp2 = localid.a(i4);
          if (localhp2 == null)
            throw new he("Invalid custom escape definitions; custom escape not found for character code 0x" + Integer.toHexString(i4) + ", although was supposed to have one");
          i1 = a(arrayOfByte, i1, localhp2, paramInt2 - i3);
          paramInt1 = i3;
          continue;
        }
        i1 = d(i4, i1);
        paramInt1 = i3;
        continue;
      }
      if (i4 > i2)
      {
        i1 = d(i4, i1);
        paramInt1 = i3;
      }
      else
      {
        hp localhp1 = localid.a(i4);
        if (localhp1 != null)
        {
          i1 = a(arrayOfByte, i1, localhp1, paramInt2 - i3);
          paramInt1 = i3;
        }
        else if (i4 <= 2047)
        {
          int i5 = i1 + 1;
          arrayOfByte[i1] = ((byte)(0xC0 | i4 >> 6));
          i1 = i5 + 1;
          arrayOfByte[i5] = ((byte)(0x80 | i4 & 0x3F));
          paramInt1 = i3;
        }
        else
        {
          i1 = c(i4, i1);
          paramInt1 = i3;
        }
      }
    }
    label391: this.o = i1;
  }

  private final void k(String paramString)
  {
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    l(paramString);
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }

  private final void l(String paramString)
  {
    int i1 = paramString.length();
    char[] arrayOfChar = this.r;
    int i2 = i1;
    int i3 = 0;
    while (i2 > 0)
    {
      int i4 = Math.min(this.q, i2);
      paramString.getChars(i3, i3 + i4, arrayOfChar, 0);
      if (i4 + this.o > this.p)
        o();
      f(arrayOfChar, 0, i4);
      i3 += i4;
      i2 -= i4;
    }
  }

  private final void p()
  {
    if (4 + this.o >= this.p)
      o();
    System.arraycopy(u, 0, this.n, this.o, 4);
    this.o = (4 + this.o);
  }

  public hf a(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 0;
    this.l = paramInt;
    return this;
  }

  public hf a(id paramid)
  {
    this.m = paramid;
    if (paramid == null)
    {
      this.k = h;
      return this;
    }
    this.k = paramid.a();
    return this;
  }

  public void a(char paramChar)
  {
    if (3 + this.o >= this.p)
      o();
    byte[] arrayOfByte = this.n;
    if (paramChar <= '')
    {
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte[i3] = ((byte)paramChar);
      return;
    }
    if (paramChar < 'ࠀ')
    {
      int i1 = this.o;
      this.o = (i1 + 1);
      arrayOfByte[i1] = ((byte)(0xC0 | paramChar >> '\006'));
      int i2 = this.o;
      this.o = (i2 + 1);
      arrayOfByte[i2] = ((byte)(0x80 | paramChar & 0x3F));
      return;
    }
    a(paramChar, null, 0, 0);
  }

  public void a(double paramDouble)
  {
    if ((this.d) || (((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble))) && (a(hf.a.d))))
    {
      b(String.valueOf(paramDouble));
      return;
    }
    h("write number");
    c(String.valueOf(paramDouble));
  }

  public void a(float paramFloat)
  {
    if ((this.d) || (((Float.isNaN(paramFloat)) || (Float.isInfinite(paramFloat))) && (a(hf.a.d))))
    {
      b(String.valueOf(paramFloat));
      return;
    }
    h("write number");
    c(String.valueOf(paramFloat));
  }

  protected final void a(int paramInt1, int paramInt2)
  {
    int i1 = b(paramInt1, paramInt2);
    if (4 + this.o > this.p)
      o();
    byte[] arrayOfByte = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte[i2] = ((byte)(0xF0 | i1 >> 18));
    int i3 = this.o;
    this.o = (i3 + 1);
    arrayOfByte[i3] = ((byte)(0x80 | 0x3F & i1 >> 12));
    int i4 = this.o;
    this.o = (i4 + 1);
    arrayOfByte[i4] = ((byte)(0x80 | 0x3F & i1 >> 6));
    int i5 = this.o;
    this.o = (i5 + 1);
    arrayOfByte[i5] = ((byte)(0x80 | i1 & 0x3F));
  }

  public void a(long paramLong)
  {
    h("write number");
    if (this.d)
    {
      b(paramLong);
      return;
    }
    if (21 + this.o >= this.p)
      o();
    this.o = ij.a(paramLong, this.n, this.o);
  }

  public void a(ha paramha, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    h("write binary value");
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    b(paramha, paramArrayOfByte, paramInt1, paramInt1 + paramInt2);
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }

  public final void a(hp paramhp)
  {
    int i1 = 1;
    int i2 = this.e.a(paramhp.a());
    if (i2 == 4)
      i("Can not write a field name, expecting a value");
    if (this.a != null)
    {
      if (i2 == i1);
      while (true)
      {
        a(paramhp, i1);
        return;
        i1 = 0;
      }
    }
    if (i2 == i1)
    {
      if (this.o >= this.p)
        o();
      byte[] arrayOfByte = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte[i3] = 44;
    }
    c(paramhp);
  }

  protected final void a(hp paramhp, boolean paramBoolean)
  {
    if (paramBoolean)
      this.a.c(this);
    while (true)
    {
      boolean bool = a(hf.a.c);
      if (bool)
      {
        if (this.o >= this.p)
          o();
        byte[] arrayOfByte2 = this.n;
        int i2 = this.o;
        this.o = (i2 + 1);
        arrayOfByte2[i2] = 34;
      }
      b(paramhp.d());
      if (bool)
      {
        if (this.o >= this.p)
          o();
        byte[] arrayOfByte1 = this.n;
        int i1 = this.o;
        this.o = (i1 + 1);
        arrayOfByte1[i1] = 34;
      }
      return;
      this.a.h(this);
    }
  }

  public final void a(im paramim)
  {
    int i1 = 1;
    int i2 = this.e.a(paramim.a());
    if (i2 == 4)
      i("Can not write a field name, expecting a value");
    if (this.a != null)
    {
      if (i2 == i1);
      while (true)
      {
        a(paramim, i1);
        return;
        i1 = 0;
      }
    }
    if (i2 == i1)
    {
      if (this.o >= this.p)
        o();
      byte[] arrayOfByte = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte[i3] = 44;
    }
    c(paramim);
  }

  public final void a(String paramString)
  {
    int i1 = 1;
    int i2 = this.e.a(paramString);
    if (i2 == 4)
      i("Can not write a field name, expecting a value");
    if (this.a != null)
    {
      if (i2 == i1);
      while (true)
      {
        b(paramString, i1);
        return;
        i1 = 0;
      }
    }
    if (i2 == i1)
    {
      if (this.o >= this.p)
        o();
      byte[] arrayOfByte = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte[i3] = 44;
    }
    j(paramString);
  }

  public final void a(String paramString1, String paramString2)
  {
    a(paramString1);
    b(paramString2);
  }

  public void a(BigDecimal paramBigDecimal)
  {
    h("write number");
    if (paramBigDecimal == null)
    {
      p();
      return;
    }
    if (this.d)
    {
      c(paramBigDecimal);
      return;
    }
    c(paramBigDecimal.toString());
  }

  public void a(BigInteger paramBigInteger)
  {
    h("write number");
    if (paramBigInteger == null)
    {
      p();
      return;
    }
    if (this.d)
    {
      c(paramBigInteger);
      return;
    }
    c(paramBigInteger.toString());
  }

  public void a(boolean paramBoolean)
  {
    h("write boolean value");
    if (5 + this.o >= this.p)
      o();
    if (paramBoolean);
    for (byte[] arrayOfByte = v; ; arrayOfByte = w)
    {
      int i1 = arrayOfByte.length;
      System.arraycopy(arrayOfByte, 0, this.n, this.o, i1);
      this.o = (i1 + this.o);
      return;
    }
  }

  public void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    h("write text value");
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    if (paramInt2 <= this.q)
    {
      if (paramInt2 + this.o > this.p)
        o();
      f(paramArrayOfChar, paramInt1, paramInt2);
    }
    while (true)
    {
      if (this.o >= this.p)
        o();
      byte[] arrayOfByte2 = this.n;
      int i2 = this.o;
      this.o = (i2 + 1);
      arrayOfByte2[i2] = 34;
      return;
      e(paramArrayOfChar, paramInt1, paramInt2);
    }
  }

  protected final int b(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 56320) || (paramInt2 > 57343))
      i("Incomplete surrogate pair: first char 0x" + Integer.toHexString(paramInt1) + ", second 0x" + Integer.toHexString(paramInt2));
    return 65536 + (paramInt1 - 55296 << 10) + (paramInt2 - 56320);
  }

  public final void b()
  {
    h("start an array");
    this.e = this.e.h();
    if (this.a != null)
    {
      this.a.e(this);
      return;
    }
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte[i1] = 91;
  }

  public void b(int paramInt)
  {
    h("write number");
    if (11 + this.o >= this.p)
      o();
    if (this.d)
    {
      c(paramInt);
      return;
    }
    this.o = ij.a(paramInt, this.n, this.o);
  }

  protected void b(ha paramha, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 - 3;
    int i2 = -6 + this.p;
    int i3 = paramha.c() >> 2;
    while (paramInt1 <= i1)
    {
      if (this.o > i2)
        o();
      int i7 = paramInt1 + 1;
      int i8 = paramArrayOfByte[paramInt1] << 8;
      int i9 = i7 + 1;
      int i10 = (i8 | 0xFF & paramArrayOfByte[i7]) << 8;
      paramInt1 = i9 + 1;
      this.o = paramha.a(i10 | 0xFF & paramArrayOfByte[i9], this.n, this.o);
      i3--;
      if (i3 <= 0)
      {
        byte[] arrayOfByte1 = this.n;
        int i11 = this.o;
        this.o = (i11 + 1);
        arrayOfByte1[i11] = 92;
        byte[] arrayOfByte2 = this.n;
        int i12 = this.o;
        this.o = (i12 + 1);
        arrayOfByte2[i12] = 110;
        i3 = paramha.c() >> 2;
      }
    }
    int i4 = paramInt2 - paramInt1;
    if (i4 > 0)
    {
      if (this.o > i2)
        o();
      int i5 = paramInt1 + 1;
      int i6 = paramArrayOfByte[paramInt1] << 16;
      if (i4 == 2)
        i6 |= (0xFF & paramArrayOfByte[i5]) << 8;
      this.o = paramha.a(i6, i4, this.n, this.o);
    }
  }

  public final void b(hp paramhp)
  {
    h("write text value");
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    b(paramhp.d());
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte2 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte2[i2] = 34;
  }

  public void b(String paramString)
  {
    h("write text value");
    if (paramString == null)
    {
      p();
      return;
    }
    int i1 = paramString.length();
    if (i1 > this.s)
    {
      k(paramString);
      return;
    }
    paramString.getChars(0, i1, this.r, 0);
    if (i1 > this.q)
    {
      c(this.r, 0, i1);
      return;
    }
    if (i1 + this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i2 = this.o;
    this.o = (i2 + 1);
    arrayOfByte1[i2] = 34;
    f(this.r, 0, i1);
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte2 = this.n;
    int i3 = this.o;
    this.o = (i3 + 1);
    arrayOfByte2[i3] = 34;
  }

  protected final void b(String paramString, int paramInt)
  {
    switch (paramInt)
    {
    default:
      m();
    case 1:
    case 2:
    case 3:
    case 0:
    }
    do
    {
      return;
      this.a.f(this);
      return;
      this.a.d(this);
      return;
      this.a.a(this);
      return;
      if (this.e.a())
      {
        this.a.g(this);
        return;
      }
    }
    while (!this.e.c());
    this.a.h(this);
  }

  protected final void b(String paramString, boolean paramBoolean)
  {
    int i2;
    if (paramBoolean)
    {
      this.a.c(this);
      if (!a(hf.a.c))
        break label207;
      if (this.o >= this.p)
        o();
      byte[] arrayOfByte1 = this.n;
      int i1 = this.o;
      this.o = (i1 + 1);
      arrayOfByte1[i1] = 34;
      i2 = paramString.length();
      if (i2 > this.s)
        break label199;
      paramString.getChars(0, i2, this.r, 0);
      if (i2 > this.q)
        break label185;
      if (i2 + this.o > this.p)
        o();
      f(this.r, 0, i2);
    }
    while (true)
    {
      if (this.o >= this.p)
        o();
      byte[] arrayOfByte2 = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte2[i3] = 34;
      return;
      this.a.h(this);
      break;
      label185: e(this.r, 0, i2);
      continue;
      label199: l(paramString);
    }
    label207: l(paramString);
  }

  public final void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 + (paramInt2 + paramInt2);
    if (i1 + this.o > this.p)
      if (this.p < i1)
        d(paramArrayOfChar, paramInt1, paramInt2);
    label225: 
    while (true)
    {
      return;
      o();
      int i2 = paramInt2 + paramInt1;
      int i3 = paramInt1;
      while (true)
      {
        if (i3 >= i2)
          break label225;
        while (true)
        {
          int i4 = paramArrayOfChar[i3];
          if (i4 > 127)
            break label111;
          byte[] arrayOfByte3 = this.n;
          int i9 = this.o;
          this.o = (i9 + 1);
          arrayOfByte3[i9] = ((byte)i4);
          i3++;
          if (i3 >= i2)
            break;
        }
        label111: int i5 = i3 + 1;
        int i6 = paramArrayOfChar[i3];
        if (i6 < 2048)
        {
          byte[] arrayOfByte1 = this.n;
          int i7 = this.o;
          this.o = (i7 + 1);
          arrayOfByte1[i7] = ((byte)(0xC0 | i6 >> 6));
          byte[] arrayOfByte2 = this.n;
          int i8 = this.o;
          this.o = (i8 + 1);
          arrayOfByte2[i8] = ((byte)(0x80 | i6 & 0x3F));
          i3 = i5;
        }
        else
        {
          a(i6, paramArrayOfChar, i5, i2);
          i3 = i5;
        }
      }
    }
  }

  public final void c()
  {
    if (!this.e.a())
      i("Current context not an ARRAY but " + this.e.d());
    if (this.a != null)
      this.a.b(this, this.e.e());
    while (true)
    {
      this.e = this.e.j();
      return;
      if (this.o >= this.p)
        o();
      byte[] arrayOfByte = this.n;
      int i1 = this.o;
      this.o = (i1 + 1);
      arrayOfByte[i1] = 93;
    }
  }

  protected final void c(hp paramhp)
  {
    byte[] arrayOfByte1 = paramhp.d();
    if (!a(hf.a.c))
    {
      b(arrayOfByte1);
      return;
    }
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte2 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte2[i1] = 34;
    int i2 = arrayOfByte1.length;
    if (1 + (i2 + this.o) < this.p)
    {
      System.arraycopy(arrayOfByte1, 0, this.n, this.o, i2);
      this.o = (i2 + this.o);
    }
    while (true)
    {
      byte[] arrayOfByte3 = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte3[i3] = 34;
      return;
      b(arrayOfByte1);
      if (this.o >= this.p)
        o();
    }
  }

  public void c(String paramString)
  {
    int i1 = paramString.length();
    int i2 = 0;
    while (i1 > 0)
    {
      char[] arrayOfChar = this.r;
      int i3 = arrayOfChar.length;
      if (i1 < i3)
        i3 = i1;
      paramString.getChars(i2, i2 + i3, arrayOfChar, 0);
      b(arrayOfChar, 0, i3);
      i2 += i3;
      i1 -= i3;
    }
  }

  public void close()
  {
    super.close();
    if ((this.n != null) && (a(hf.a.b)))
      while (true)
      {
        hx localhx = h();
        if (localhx.a())
        {
          c();
        }
        else
        {
          if (!localhx.c())
            break;
          e();
        }
      }
    o();
    if (this.j != null)
    {
      if ((!this.i.c()) && (!a(hf.a.a)))
        break label97;
      this.j.close();
    }
    while (true)
    {
      n();
      return;
      label97: if (a(hf.a.f))
        this.j.flush();
    }
  }

  public final void d()
  {
    h("start an object");
    this.e = this.e.i();
    if (this.a != null)
    {
      this.a.b(this);
      return;
    }
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte[i1] = 123;
  }

  public final void e()
  {
    if (!this.e.c())
      i("Current context not an object but " + this.e.d());
    this.e = this.e.j();
    if (this.a != null)
    {
      this.a.a(this, this.e.e());
      return;
    }
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte[i1] = 125;
  }

  public void e(String paramString)
  {
    h("write number");
    if (this.d)
    {
      c(paramString);
      return;
    }
    c(paramString);
  }

  public void f()
  {
    h("write null value");
    p();
  }

  public final void g()
  {
    o();
    if ((this.j != null) && (a(hf.a.f)))
      this.j.flush();
  }

  protected final void h(String paramString)
  {
    int i1 = this.e.k();
    if (i1 == 5)
      i("Can not " + paramString + ", expecting field name");
    if (this.a == null)
    {
      int i2;
      switch (i1)
      {
      default:
        return;
      case 1:
        i2 = 44;
      case 2:
      case 3:
      }
      while (true)
      {
        if (this.o >= this.p)
          o();
        this.n[this.o] = i2;
        this.o = (1 + this.o);
        return;
        i2 = 58;
        continue;
        i2 = 32;
      }
    }
    b(paramString, i1);
  }

  protected final void j(String paramString)
  {
    if (!a(hf.a.c))
    {
      l(paramString);
      return;
    }
    if (this.o >= this.p)
      o();
    byte[] arrayOfByte1 = this.n;
    int i1 = this.o;
    this.o = (i1 + 1);
    arrayOfByte1[i1] = 34;
    int i2 = paramString.length();
    if (i2 <= this.s)
    {
      paramString.getChars(0, i2, this.r, 0);
      if (i2 <= this.q)
      {
        if (i2 + this.o > this.p)
          o();
        f(this.r, 0, i2);
      }
    }
    while (true)
    {
      if (this.o >= this.p)
        o();
      byte[] arrayOfByte2 = this.n;
      int i3 = this.o;
      this.o = (i3 + 1);
      arrayOfByte2[i3] = 34;
      return;
      e(this.r, 0, i2);
      continue;
      l(paramString);
    }
  }

  protected void n()
  {
    byte[] arrayOfByte = this.n;
    if ((arrayOfByte != null) && (this.t))
    {
      this.n = null;
      this.i.b(arrayOfByte);
    }
    char[] arrayOfChar = this.r;
    if (arrayOfChar != null)
    {
      this.r = null;
      this.i.b(arrayOfChar);
    }
  }

  protected final void o()
  {
    int i1 = this.o;
    if (i1 > 0)
    {
      this.o = 0;
      this.j.write(this.n, 0, i1);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hz
 * JD-Core Version:    0.6.2
 */