package com.flurry.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.io.Writer;

public final class io extends Writer
{
  protected final ie a;
  OutputStream b;
  byte[] c;
  final int d;
  int e;
  int f = 0;

  public io(ie paramie, OutputStream paramOutputStream)
  {
    this.a = paramie;
    this.b = paramOutputStream;
    this.c = paramie.f();
    this.d = (-4 + this.c.length);
    this.e = 0;
  }

  private int a(int paramInt)
  {
    int i = this.f;
    this.f = 0;
    if ((paramInt < 56320) || (paramInt > 57343))
      throw new IOException("Broken surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(paramInt) + "; illegal combination");
    return 65536 + (i - 55296 << 10) + (paramInt - 56320);
  }

  private void b(int paramInt)
  {
    if (paramInt > 1114111)
      throw new IOException("Illegal character point (0x" + Integer.toHexString(paramInt) + ") to output; max is 0x10FFFF as per RFC 4627");
    if (paramInt >= 55296)
    {
      if (paramInt <= 56319)
        throw new IOException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(paramInt) + ")");
      throw new IOException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(paramInt) + ")");
    }
    throw new IOException("Illegal character point (0x" + Integer.toHexString(paramInt) + ") to output");
  }

  public final Writer append(char paramChar)
  {
    write(paramChar);
    return this;
  }

  public final void close()
  {
    if (this.b != null)
    {
      if (this.e > 0)
      {
        this.b.write(this.c, 0, this.e);
        this.e = 0;
      }
      OutputStream localOutputStream = this.b;
      this.b = null;
      byte[] arrayOfByte = this.c;
      if (arrayOfByte != null)
      {
        this.c = null;
        this.a.b(arrayOfByte);
      }
      localOutputStream.close();
      int i = this.f;
      this.f = 0;
      if (i > 0)
        b(i);
    }
  }

  public final void flush()
  {
    if (this.b != null)
    {
      if (this.e > 0)
      {
        this.b.write(this.c, 0, this.e);
        this.e = 0;
      }
      this.b.flush();
    }
  }

  public final void write(int paramInt)
  {
    if (this.f > 0)
      paramInt = a(paramInt);
    while ((paramInt < 55296) || (paramInt > 57343))
    {
      if (this.e >= this.d)
      {
        this.b.write(this.c, 0, this.e);
        this.e = 0;
      }
      if (paramInt >= 128)
        break;
      byte[] arrayOfByte10 = this.c;
      int i4 = this.e;
      this.e = (i4 + 1);
      arrayOfByte10[i4] = ((byte)paramInt);
      return;
    }
    if (paramInt > 56319)
      b(paramInt);
    this.f = paramInt;
    return;
    int i = this.e;
    int n;
    if (paramInt < 2048)
    {
      byte[] arrayOfByte8 = this.c;
      int i3 = i + 1;
      arrayOfByte8[i] = ((byte)(0xC0 | paramInt >> 6));
      byte[] arrayOfByte9 = this.c;
      n = i3 + 1;
      arrayOfByte9[i3] = ((byte)(0x80 | paramInt & 0x3F));
    }
    while (true)
    {
      this.e = n;
      return;
      if (paramInt <= 65535)
      {
        byte[] arrayOfByte5 = this.c;
        int i1 = i + 1;
        arrayOfByte5[i] = ((byte)(0xE0 | paramInt >> 12));
        byte[] arrayOfByte6 = this.c;
        int i2 = i1 + 1;
        arrayOfByte6[i1] = ((byte)(0x80 | 0x3F & paramInt >> 6));
        byte[] arrayOfByte7 = this.c;
        n = i2 + 1;
        arrayOfByte7[i2] = ((byte)(0x80 | paramInt & 0x3F));
      }
      else
      {
        if (paramInt > 1114111)
          b(paramInt);
        byte[] arrayOfByte1 = this.c;
        int j = i + 1;
        arrayOfByte1[i] = ((byte)(0xF0 | paramInt >> 18));
        byte[] arrayOfByte2 = this.c;
        int k = j + 1;
        arrayOfByte2[j] = ((byte)(0x80 | 0x3F & paramInt >> 12));
        byte[] arrayOfByte3 = this.c;
        int m = k + 1;
        arrayOfByte3[k] = ((byte)(0x80 | 0x3F & paramInt >> 6));
        byte[] arrayOfByte4 = this.c;
        n = m + 1;
        arrayOfByte4[m] = ((byte)(0x80 | paramInt & 0x3F));
      }
    }
  }

  public final void write(String paramString)
  {
    write(paramString, 0, paramString.length());
  }

  public final void write(String paramString, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 2)
    {
      if (paramInt2 == 1)
        write(paramString.charAt(paramInt1));
      return;
    }
    if (this.f > 0)
    {
      int i16 = paramInt1 + 1;
      int i17 = paramString.charAt(paramInt1);
      paramInt2--;
      write(a(i17));
      paramInt1 = i16;
    }
    int i = this.e;
    byte[] arrayOfByte = this.c;
    int j = this.d;
    int k = paramInt2 + paramInt1;
    int m;
    int n;
    int i8;
    int i9;
    int i10;
    if (paramInt1 < k)
    {
      if (i >= j)
      {
        this.b.write(arrayOfByte, 0, i);
        i = 0;
      }
      m = paramInt1 + 1;
      n = paramString.charAt(paramInt1);
      if (n < 128)
      {
        i8 = i + 1;
        arrayOfByte[i] = ((byte)n);
        i9 = k - m;
        i10 = j - i8;
        if (i9 <= i10)
          break label558;
      }
    }
    while (true)
    {
      int i11 = i10 + m;
      int i12 = i8;
      int i13 = m;
      while (true)
        if (i13 < i11)
        {
          m = i13 + 1;
          int i14 = paramString.charAt(i13);
          if (i14 < 128)
          {
            int i15 = i12 + 1;
            arrayOfByte[i12] = ((byte)i14);
            i12 = i15;
            i13 = m;
          }
          else
          {
            i = i12;
            n = i14;
            if (n < 2048)
            {
              int i7 = i + 1;
              arrayOfByte[i] = ((byte)(0xC0 | n >> 6));
              i = i7 + 1;
              arrayOfByte[i7] = ((byte)(0x80 | n & 0x3F));
              paramInt1 = m;
              break;
            }
            if ((n < 55296) || (n > 57343))
            {
              int i1 = i + 1;
              arrayOfByte[i] = ((byte)(0xE0 | n >> 12));
              int i2 = i1 + 1;
              arrayOfByte[i1] = ((byte)(0x80 | 0x3F & n >> 6));
              i = i2 + 1;
              arrayOfByte[i2] = ((byte)(0x80 | n & 0x3F));
              paramInt1 = m;
              break;
            }
            if (n > 56319)
            {
              this.e = i;
              b(n);
            }
            this.f = n;
            if (m < k)
            {
              paramInt1 = m + 1;
              int i3 = a(paramString.charAt(m));
              if (i3 > 1114111)
              {
                this.e = i;
                b(i3);
              }
              int i4 = i + 1;
              arrayOfByte[i] = ((byte)(0xF0 | i3 >> 18));
              int i5 = i4 + 1;
              arrayOfByte[i4] = ((byte)(0x80 | 0x3F & i3 >> 12));
              int i6 = i5 + 1;
              arrayOfByte[i5] = ((byte)(0x80 | 0x3F & i3 >> 6));
              i = i6 + 1;
              arrayOfByte[i6] = ((byte)(0x80 | i3 & 0x3F));
              break;
            }
            this.e = i;
            return;
          }
        }
      paramInt1 = i13;
      i = i12;
      break;
      label558: i10 = i9;
    }
  }

  public final void write(char[] paramArrayOfChar)
  {
    write(paramArrayOfChar, 0, paramArrayOfChar.length);
  }

  public final void write(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 2)
    {
      if (paramInt2 == 1)
        write(paramArrayOfChar[paramInt1]);
      return;
    }
    if (this.f > 0)
    {
      int i16 = paramInt1 + 1;
      int i17 = paramArrayOfChar[paramInt1];
      paramInt2--;
      write(a(i17));
      paramInt1 = i16;
    }
    int i = this.e;
    byte[] arrayOfByte = this.c;
    int j = this.d;
    int k = paramInt2 + paramInt1;
    int m;
    int n;
    int i8;
    int i9;
    int i10;
    if (paramInt1 < k)
    {
      if (i >= j)
      {
        this.b.write(arrayOfByte, 0, i);
        i = 0;
      }
      m = paramInt1 + 1;
      n = paramArrayOfChar[paramInt1];
      if (n < 128)
      {
        i8 = i + 1;
        arrayOfByte[i] = ((byte)n);
        i9 = k - m;
        i10 = j - i8;
        if (i9 <= i10)
          break label548;
      }
    }
    while (true)
    {
      int i11 = i10 + m;
      int i12 = i8;
      int i13 = m;
      while (true)
        if (i13 < i11)
        {
          m = i13 + 1;
          int i14 = paramArrayOfChar[i13];
          if (i14 < 128)
          {
            int i15 = i12 + 1;
            arrayOfByte[i12] = ((byte)i14);
            i12 = i15;
            i13 = m;
          }
          else
          {
            i = i12;
            n = i14;
            if (n < 2048)
            {
              int i7 = i + 1;
              arrayOfByte[i] = ((byte)(0xC0 | n >> 6));
              i = i7 + 1;
              arrayOfByte[i7] = ((byte)(0x80 | n & 0x3F));
              paramInt1 = m;
              break;
            }
            if ((n < 55296) || (n > 57343))
            {
              int i1 = i + 1;
              arrayOfByte[i] = ((byte)(0xE0 | n >> 12));
              int i2 = i1 + 1;
              arrayOfByte[i1] = ((byte)(0x80 | 0x3F & n >> 6));
              i = i2 + 1;
              arrayOfByte[i2] = ((byte)(0x80 | n & 0x3F));
              paramInt1 = m;
              break;
            }
            if (n > 56319)
            {
              this.e = i;
              b(n);
            }
            this.f = n;
            if (m < k)
            {
              paramInt1 = m + 1;
              int i3 = a(paramArrayOfChar[m]);
              if (i3 > 1114111)
              {
                this.e = i;
                b(i3);
              }
              int i4 = i + 1;
              arrayOfByte[i] = ((byte)(0xF0 | i3 >> 18));
              int i5 = i4 + 1;
              arrayOfByte[i4] = ((byte)(0x80 | 0x3F & i3 >> 12));
              int i6 = i5 + 1;
              arrayOfByte[i5] = ((byte)(0x80 | 0x3F & i3 >> 6));
              i = i6 + 1;
              arrayOfByte[i6] = ((byte)(0x80 | i3 & 0x3F));
              break;
            }
            this.e = i;
            return;
          }
        }
      paramInt1 = i13;
      i = i12;
      break;
      label548: i10 = i9;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.io
 * JD-Core Version:    0.6.2
 */