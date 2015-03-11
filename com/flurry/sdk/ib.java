package com.flurry.sdk;

import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;

public final class ib extends ht
{
  protected static final char[] g = sk.g();
  protected static final int[] h = sk.f();
  protected final ie i;
  protected final Writer j;
  protected int[] k = h;
  protected int l;
  protected id m;
  protected hp n;
  protected char[] o;
  protected int p = 0;
  protected int q = 0;
  protected int r;
  protected char[] s;

  public ib(ie paramie, int paramInt, hn paramhn, Writer paramWriter)
  {
    super(paramInt, paramhn);
    this.i = paramie;
    this.j = paramWriter;
    this.o = paramie.h();
    this.r = this.o.length;
    if (a(hf.a.g))
      a(127);
  }

  private final int a(char[] paramArrayOfChar, int paramInt1, int paramInt2, char paramChar, int paramInt3)
  {
    if (paramInt3 >= 0)
    {
      if ((paramInt1 > 1) && (paramInt1 < paramInt2))
      {
        int i13 = paramInt1 - 2;
        paramArrayOfChar[i13] = '\\';
        paramArrayOfChar[(i13 + 1)] = ((char)paramInt3);
        return i13;
      }
      char[] arrayOfChar2 = this.s;
      if (arrayOfChar2 == null)
        arrayOfChar2 = q();
      arrayOfChar2[1] = ((char)paramInt3);
      this.j.write(arrayOfChar2, 0, 2);
      return paramInt1;
    }
    if (paramInt3 != -2)
    {
      if ((paramInt1 > 5) && (paramInt1 < paramInt2))
      {
        int i5 = paramInt1 - 6;
        int i6 = i5 + 1;
        paramArrayOfChar[i5] = '\\';
        int i7 = i6 + 1;
        paramArrayOfChar[i6] = 'u';
        int i9;
        if (paramChar > 'ÿ')
        {
          int i11 = 0xFF & paramChar >> '\b';
          int i12 = i7 + 1;
          paramArrayOfChar[i7] = g[(i11 >> 4)];
          i9 = i12 + 1;
          paramArrayOfChar[i12] = g[(i11 & 0xF)];
          paramChar = (char)(paramChar & 0xFF);
        }
        while (true)
        {
          int i10 = i9 + 1;
          paramArrayOfChar[i9] = g[(paramChar >> '\004')];
          paramArrayOfChar[i10] = g[(paramChar & 0xF)];
          return i10 - 5;
          int i8 = i7 + 1;
          paramArrayOfChar[i7] = '0';
          i9 = i8 + 1;
          paramArrayOfChar[i8] = '0';
        }
      }
      char[] arrayOfChar1 = this.s;
      if (arrayOfChar1 == null)
        arrayOfChar1 = q();
      this.p = this.q;
      if (paramChar > 'ÿ')
      {
        int i3 = 0xFF & paramChar >> '\b';
        int i4 = paramChar & 0xFF;
        arrayOfChar1[10] = g[(i3 >> 4)];
        arrayOfChar1[11] = g[(i3 & 0xF)];
        arrayOfChar1[12] = g[(i4 >> 4)];
        arrayOfChar1[13] = g[(i4 & 0xF)];
        this.j.write(arrayOfChar1, 8, 6);
        return paramInt1;
      }
      arrayOfChar1[6] = g[(paramChar >> '\004')];
      arrayOfChar1[7] = g[(paramChar & 0xF)];
      this.j.write(arrayOfChar1, 2, 6);
      return paramInt1;
    }
    String str;
    if (this.n == null)
      str = this.m.a(paramChar).a();
    while (true)
    {
      int i1 = str.length();
      if ((paramInt1 < i1) || (paramInt1 >= paramInt2))
        break;
      int i2 = paramInt1 - i1;
      str.getChars(0, i1, paramArrayOfChar, i2);
      return i2;
      str = this.n.a();
      this.n = null;
    }
    this.j.write(str);
    return paramInt1;
  }

  private final void a(char paramChar, int paramInt)
  {
    if (paramInt >= 0)
    {
      if (this.q >= 2)
      {
        int i12 = -2 + this.q;
        this.p = i12;
        char[] arrayOfChar4 = this.o;
        int i13 = i12 + 1;
        arrayOfChar4[i12] = '\\';
        this.o[i13] = ((char)paramInt);
        return;
      }
      char[] arrayOfChar3 = this.s;
      if (arrayOfChar3 == null)
        arrayOfChar3 = q();
      this.p = this.q;
      arrayOfChar3[1] = ((char)paramInt);
      this.j.write(arrayOfChar3, 0, 2);
      return;
    }
    if (paramInt != -2)
    {
      if (this.q >= 6)
      {
        char[] arrayOfChar2 = this.o;
        int i5 = -6 + this.q;
        this.p = i5;
        arrayOfChar2[i5] = '\\';
        int i6 = i5 + 1;
        arrayOfChar2[i6] = 'u';
        int i8;
        if (paramChar > 'ÿ')
        {
          int i10 = 0xFF & paramChar >> '\b';
          int i11 = i6 + 1;
          arrayOfChar2[i11] = g[(i10 >> 4)];
          i8 = i11 + 1;
          arrayOfChar2[i8] = g[(i10 & 0xF)];
          paramChar = (char)(paramChar & 0xFF);
        }
        while (true)
        {
          int i9 = i8 + 1;
          arrayOfChar2[i9] = g[(paramChar >> '\004')];
          arrayOfChar2[(i9 + 1)] = g[(paramChar & 0xF)];
          return;
          int i7 = i6 + 1;
          arrayOfChar2[i7] = '0';
          i8 = i7 + 1;
          arrayOfChar2[i8] = '0';
        }
      }
      char[] arrayOfChar1 = this.s;
      if (arrayOfChar1 == null)
        arrayOfChar1 = q();
      this.p = this.q;
      if (paramChar > 'ÿ')
      {
        int i3 = 0xFF & paramChar >> '\b';
        int i4 = paramChar & 0xFF;
        arrayOfChar1[10] = g[(i3 >> 4)];
        arrayOfChar1[11] = g[(i3 & 0xF)];
        arrayOfChar1[12] = g[(i4 >> 4)];
        arrayOfChar1[13] = g[(i4 & 0xF)];
        this.j.write(arrayOfChar1, 8, 6);
        return;
      }
      arrayOfChar1[6] = g[(paramChar >> '\004')];
      arrayOfChar1[7] = g[(paramChar & 0xF)];
      this.j.write(arrayOfChar1, 2, 6);
      return;
    }
    String str;
    if (this.n == null)
      str = this.m.a(paramChar).a();
    while (true)
    {
      int i1 = str.length();
      if (this.q < i1)
        break;
      int i2 = this.q - i1;
      this.p = i2;
      str.getChars(0, i1, this.o, i2);
      return;
      str = this.n.a();
      this.n = null;
    }
    this.p = this.q;
    this.j.write(str);
  }

  private void a(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 + this.q;
    int[] arrayOfInt = this.k;
    int i2 = Math.min(arrayOfInt.length, 1 + this.l);
    if (this.q < i1)
    {
      label131: int i4;
      do
      {
        int i3 = this.o[this.q];
        int i5;
        if (i3 < i2)
        {
          i5 = arrayOfInt[i3];
          if (i5 == 0);
        }
        else
        {
          while (true)
          {
            int i6 = this.q - this.p;
            if (i6 > 0)
              this.j.write(this.o, this.p, i6);
            this.q = (1 + this.q);
            a(i3, i5);
            break;
            if (i3 <= paramInt2)
              break label131;
            i5 = -1;
          }
        }
        i4 = 1 + this.q;
        this.q = i4;
      }
      while (i4 < i1);
    }
  }

  private final void a(char[] paramArrayOfChar, int paramInt1, int paramInt2, int paramInt3)
  {
    int i1 = paramInt2 + paramInt1;
    int[] arrayOfInt = this.k;
    int i2 = Math.min(arrayOfInt.length, paramInt3 + 1);
    int i3 = 0;
    int i4 = paramInt1;
    if (i4 < i1)
    {
      int i5 = i4;
      label40: int i6 = paramArrayOfChar[i5];
      label65: int i7;
      if (i6 < i2)
      {
        i3 = arrayOfInt[i6];
        if (i3 == 0)
          break label166;
        i7 = i5 - i4;
        if (i7 >= 32)
          break label179;
        if (i7 + this.q > this.r)
          o();
        if (i7 > 0)
        {
          System.arraycopy(paramArrayOfChar, i4, this.o, this.q, i7);
          this.q = (i7 + this.q);
        }
      }
      while (true)
      {
        if (i5 >= i1)
          return;
        i4 = i5 + 1;
        b(i6, i3);
        break;
        if (i6 > paramInt3)
        {
          i3 = -1;
          break label65;
        }
        label166: i5++;
        if (i5 < i1)
          break label40;
        break label65;
        label179: o();
        this.j.write(paramArrayOfChar, i4, i7);
      }
    }
  }

  private final void b(char paramChar, int paramInt)
  {
    if (paramInt >= 0)
    {
      if (2 + this.q > this.r)
        o();
      char[] arrayOfChar2 = this.o;
      int i10 = this.q;
      this.q = (i10 + 1);
      arrayOfChar2[i10] = '\\';
      char[] arrayOfChar3 = this.o;
      int i11 = this.q;
      this.q = (i11 + 1);
      arrayOfChar3[i11] = ((char)paramInt);
      return;
    }
    if (paramInt != -2)
    {
      if (2 + this.q > this.r)
        o();
      int i2 = this.q;
      char[] arrayOfChar1 = this.o;
      int i3 = i2 + 1;
      arrayOfChar1[i2] = '\\';
      int i4 = i3 + 1;
      arrayOfChar1[i3] = 'u';
      int i6;
      if (paramChar > 'ÿ')
      {
        int i8 = 0xFF & paramChar >> '\b';
        int i9 = i4 + 1;
        arrayOfChar1[i4] = g[(i8 >> 4)];
        i6 = i9 + 1;
        arrayOfChar1[i9] = g[(i8 & 0xF)];
        paramChar = (char)(paramChar & 0xFF);
      }
      while (true)
      {
        int i7 = i6 + 1;
        arrayOfChar1[i6] = g[(paramChar >> '\004')];
        arrayOfChar1[i7] = g[(paramChar & 0xF)];
        this.q = i7;
        return;
        int i5 = i4 + 1;
        arrayOfChar1[i4] = '0';
        i6 = i5 + 1;
        arrayOfChar1[i5] = '0';
      }
    }
    String str;
    if (this.n == null)
      str = this.m.a(paramChar).a();
    int i1;
    while (true)
    {
      i1 = str.length();
      if (i1 + this.q <= this.r)
        break;
      o();
      if (i1 <= this.r)
        break;
      this.j.write(str);
      return;
      str = this.n.a();
      this.n = null;
    }
    str.getChars(0, i1, this.o, this.q);
    this.q = (i1 + this.q);
  }

  private final void b(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int[] arrayOfInt = this.k;
    int i2 = Math.min(arrayOfInt.length, 1 + this.l);
    int i3 = 0;
    int i4 = 0;
    if (i4 < paramInt1)
    {
      label34: int i5 = this.o[i4];
      int i6;
      if (i5 < i2)
      {
        i6 = arrayOfInt[i5];
        if (i6 == 0)
          break label144;
      }
      while (true)
      {
        int i7 = i4 - i3;
        if (i7 > 0)
        {
          this.j.write(this.o, i3, i7);
          if (i4 >= paramInt1)
            return;
        }
        int i8 = i4 + 1;
        int i9 = a(this.o, i8, paramInt1, i5, i6);
        i4 = i8;
        i3 = i9;
        i1 = i6;
        break;
        if (i5 > paramInt2)
        {
          i6 = -1;
          continue;
          label144: i1 = i6;
        }
        else
        {
          i4++;
          if (i4 < paramInt1)
            break label34;
          i6 = i1;
        }
      }
    }
  }

  private final void b(long paramLong)
  {
    if (23 + this.q >= this.r)
      o();
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    this.q = ij.a(paramLong, this.o, this.q);
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }

  private final void c(int paramInt)
  {
    if (13 + this.q >= this.r)
      o();
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    this.q = ij.a(paramInt, this.o, this.q);
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }

  private final void c(Object paramObject)
  {
    if (this.q >= this.r)
      o();
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    c(paramObject.toString());
    if (this.q >= this.r)
      o();
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }

  private final void c(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (this.m != null)
      d(paramArrayOfChar, paramInt1, paramInt2);
    label53: label192: label209: 
    while (true)
    {
      return;
      if (this.l != 0)
      {
        a(paramArrayOfChar, paramInt1, paramInt2, this.l);
        return;
      }
      int i1 = paramInt2 + paramInt1;
      int[] arrayOfInt = this.k;
      int i2 = arrayOfInt.length;
      int i3 = paramInt1;
      int i4;
      int i6;
      if (i3 < i1)
      {
        i4 = i3;
        do
        {
          int i5 = paramArrayOfChar[i4];
          if ((i5 < i2) && (arrayOfInt[i5] != 0))
            break;
          i4++;
        }
        while (i4 < i1);
        i6 = i4 - i3;
        if (i6 >= 32)
          break label192;
        if (i6 + this.q > this.r)
          o();
        if (i6 > 0)
        {
          System.arraycopy(paramArrayOfChar, i3, this.o, this.q, i6);
          this.q = (i6 + this.q);
        }
      }
      while (true)
      {
        if (i4 >= i1)
          break label209;
        i3 = i4 + 1;
        char c = paramArrayOfChar[i4];
        b(c, arrayOfInt[c]);
        break label53;
        break;
        o();
        this.j.write(paramArrayOfChar, i3, i6);
      }
    }
  }

  private void d(int paramInt)
  {
    int i1 = paramInt + this.q;
    int[] arrayOfInt = this.k;
    int i2 = arrayOfInt.length;
    while (true)
    {
      if (this.q < i1)
      {
        int i4;
        do
        {
          int i3 = this.o[this.q];
          if ((i3 < i2) && (arrayOfInt[i3] != 0))
            break;
          i4 = 1 + this.q;
          this.q = i4;
        }
        while (i4 < i1);
      }
      return;
      int i5 = this.q - this.p;
      if (i5 > 0)
        this.j.write(this.o, this.p, i5);
      char[] arrayOfChar = this.o;
      int i6 = this.q;
      this.q = (i6 + 1);
      char c = arrayOfChar[i6];
      a(c, arrayOfInt[c]);
    }
  }

  private final void d(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 + paramInt1;
    int[] arrayOfInt = this.k;
    int i2;
    id localid;
    int i4;
    int i5;
    label46: int i6;
    label57: int i7;
    label82: int i8;
    if (this.l <= 0)
    {
      i2 = 65535;
      int i3 = Math.min(arrayOfInt.length, i2 + 1);
      localid = this.m;
      i4 = 0;
      i5 = paramInt1;
      if (i5 >= i1)
        return;
      i6 = i5;
      i7 = paramArrayOfChar[i6];
      if (i7 >= i3)
        break label179;
      i4 = arrayOfInt[i7];
      if (i4 == 0)
        break label219;
      i8 = i6 - i5;
      if (i8 >= 32)
        break label232;
      if (i8 + this.q > this.r)
        o();
      if (i8 > 0)
      {
        System.arraycopy(paramArrayOfChar, i5, this.o, this.q, i8);
        this.q = (i8 + this.q);
      }
    }
    while (true)
    {
      if (i6 >= i1)
        return;
      i5 = i6 + 1;
      b(i7, i4);
      break label46;
      i2 = this.l;
      break;
      label179: if (i7 > i2)
      {
        i4 = -1;
        break label82;
      }
      hp localhp = localid.a(i7);
      this.n = localhp;
      if (localhp != null)
      {
        i4 = -2;
        break label82;
      }
      label219: i6++;
      if (i6 < i1)
        break label57;
      break label82;
      label232: o();
      this.j.write(paramArrayOfChar, i5, i8);
    }
  }

  private final void e(int paramInt)
  {
    int i1 = 0;
    int[] arrayOfInt = this.k;
    int i2 = arrayOfInt.length;
    int i3 = 0;
    while (i1 < paramInt)
    {
      int i4;
      do
      {
        i4 = this.o[i1];
        if ((i4 < i2) && (arrayOfInt[i4] != 0))
          break;
        i1++;
      }
      while (i1 < paramInt);
      int i5 = i1 - i3;
      if (i5 > 0)
      {
        this.j.write(this.o, i3, i5);
        if (i1 >= paramInt)
          break;
      }
      int i6 = i1 + 1;
      i3 = a(this.o, i6, paramInt, i4, arrayOfInt[i4]);
      i1 = i6;
    }
  }

  private void f(int paramInt)
  {
    int i1 = paramInt + this.q;
    int[] arrayOfInt = this.k;
    int i2;
    int i3;
    id localid;
    if (this.l <= 0)
    {
      i2 = 65535;
      i3 = Math.min(arrayOfInt.length, i2 + 1);
      localid = this.m;
      label40: if (this.q >= i1);
    }
    else
    {
      label180: int i5;
      do
      {
        int i4 = this.o[this.q];
        int i6;
        if (i4 < i3)
        {
          i6 = arrayOfInt[i4];
          if (i6 == 0);
        }
        else
        {
          while (true)
          {
            int i7 = this.q - this.p;
            if (i7 > 0)
              this.j.write(this.o, this.p, i7);
            this.q = (1 + this.q);
            a(i4, i6);
            break label40;
            i2 = this.l;
            break;
            if (i4 > i2)
            {
              i6 = -1;
            }
            else
            {
              hp localhp = localid.a(i4);
              this.n = localhp;
              if (localhp == null)
                break label180;
              i6 = -2;
            }
          }
        }
        i5 = 1 + this.q;
        this.q = i5;
      }
      while (i5 < i1);
    }
  }

  private final void g(int paramInt)
  {
    int i1 = 0;
    int[] arrayOfInt = this.k;
    int i2;
    id localid;
    int i4;
    int i5;
    label43: label48: int i6;
    int i7;
    if (this.l <= 0)
    {
      i2 = 65535;
      int i3 = Math.min(arrayOfInt.length, 1 + this.l);
      localid = this.m;
      i4 = 0;
      i5 = 0;
      if (i1 >= paramInt)
        return;
      i6 = this.o[i1];
      if (i6 >= i3)
        break label150;
      i7 = arrayOfInt[i6];
      if (i7 == 0)
        break label190;
    }
    while (true)
    {
      int i8 = i1 - i4;
      if (i8 > 0)
      {
        this.j.write(this.o, i4, i8);
        if (i1 >= paramInt)
          return;
      }
      int i9 = i1 + 1;
      int i10 = a(this.o, i9, paramInt, i6, i7);
      i1 = i9;
      i4 = i10;
      i5 = i7;
      break label43;
      i2 = this.l;
      break;
      label150: if (i6 > i2)
      {
        i7 = -1;
      }
      else
      {
        hp localhp = localid.a(i6);
        this.n = localhp;
        if (localhp != null)
        {
          i7 = -2;
          continue;
          label190: i5 = i7;
        }
        else
        {
          i1++;
          if (i1 < paramInt)
            break label48;
          i7 = i5;
        }
      }
    }
  }

  private void j(String paramString)
  {
    int i1 = this.r - this.q;
    paramString.getChars(0, i1, this.o, this.q);
    this.q = (i1 + this.q);
    o();
    int i2 = paramString.length() - i1;
    while (i2 > this.r)
    {
      int i3 = this.r;
      paramString.getChars(i1, i1 + i3, this.o, 0);
      this.p = 0;
      this.q = i3;
      o();
      i1 += i3;
      i2 -= i3;
    }
    paramString.getChars(i1, i1 + i2, this.o, 0);
    this.p = 0;
    this.q = i2;
  }

  private void k(String paramString)
  {
    int i1 = paramString.length();
    if (i1 > this.r)
    {
      l(paramString);
      return;
    }
    if (i1 + this.q > this.r)
      o();
    paramString.getChars(0, i1, this.o, this.q);
    if (this.m != null)
    {
      f(i1);
      return;
    }
    if (this.l != 0)
    {
      a(i1, this.l);
      return;
    }
    d(i1);
  }

  private void l(String paramString)
  {
    o();
    int i1 = paramString.length();
    int i2 = 0;
    int i3 = this.r;
    if (i2 + i3 > i1)
      i3 = i1 - i2;
    paramString.getChars(i2, i2 + i3, this.o, 0);
    if (this.m != null)
      g(i3);
    while (true)
    {
      i2 += i3;
      if (i2 < i1)
        break;
      return;
      if (this.l != 0)
        b(i3, this.l);
      else
        e(i3);
    }
  }

  private final void p()
  {
    if (4 + this.q >= this.r)
      o();
    int i1 = this.q;
    char[] arrayOfChar = this.o;
    arrayOfChar[i1] = 'n';
    int i2 = i1 + 1;
    arrayOfChar[i2] = 'u';
    int i3 = i2 + 1;
    arrayOfChar[i3] = 'l';
    int i4 = i3 + 1;
    arrayOfChar[i4] = 'l';
    this.q = (i4 + 1);
  }

  private char[] q()
  {
    char[] arrayOfChar = new char[14];
    arrayOfChar[0] = '\\';
    arrayOfChar[2] = '\\';
    arrayOfChar[3] = 'u';
    arrayOfChar[4] = '0';
    arrayOfChar[5] = '0';
    arrayOfChar[8] = '\\';
    arrayOfChar[9] = 'u';
    this.s = arrayOfChar;
    return arrayOfChar;
  }

  public final hf a(int paramInt)
  {
    if (paramInt < 0)
      paramInt = 0;
    this.l = paramInt;
    return this;
  }

  public final hf a(id paramid)
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

  public final void a(char paramChar)
  {
    if (this.q >= this.r)
      o();
    char[] arrayOfChar = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar[i1] = paramChar;
  }

  public final void a(double paramDouble)
  {
    if ((this.d) || (((Double.isNaN(paramDouble)) || (Double.isInfinite(paramDouble))) && (a(hf.a.d))))
    {
      b(String.valueOf(paramDouble));
      return;
    }
    h("write number");
    c(String.valueOf(paramDouble));
  }

  public final void a(float paramFloat)
  {
    if ((this.d) || (((Float.isNaN(paramFloat)) || (Float.isInfinite(paramFloat))) && (a(hf.a.d))))
    {
      b(String.valueOf(paramFloat));
      return;
    }
    h("write number");
    c(String.valueOf(paramFloat));
  }

  public final void a(long paramLong)
  {
    h("write number");
    if (this.d)
    {
      b(paramLong);
      return;
    }
    if (21 + this.q >= this.r)
      o();
    this.q = ij.a(paramLong, this.o, this.q);
  }

  public final void a(ha paramha, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    h("write binary value");
    if (this.q >= this.r)
      o();
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    b(paramha, paramArrayOfByte, paramInt1, paramInt1 + paramInt2);
    if (this.q >= this.r)
      o();
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }

  public final void a(hp paramhp)
  {
    int i1 = 1;
    int i2 = this.e.a(paramhp.a());
    if (i2 == 4)
      i("Can not write a field name, expecting a value");
    if (i2 == i1);
    while (true)
    {
      a(paramhp, i1);
      return;
      i1 = 0;
    }
  }

  public final void a(hp paramhp, boolean paramBoolean)
  {
    if (this.a != null)
    {
      b(paramhp, paramBoolean);
      return;
    }
    if (1 + this.q >= this.r)
      o();
    if (paramBoolean)
    {
      char[] arrayOfChar5 = this.o;
      int i5 = this.q;
      this.q = (i5 + 1);
      arrayOfChar5[i5] = ',';
    }
    char[] arrayOfChar1 = paramhp.b();
    if (!a(hf.a.c))
    {
      b(arrayOfChar1, 0, arrayOfChar1.length);
      return;
    }
    char[] arrayOfChar2 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar2[i1] = '"';
    int i2 = arrayOfChar1.length;
    if (1 + (i2 + this.q) >= this.r)
    {
      b(arrayOfChar1, 0, i2);
      if (this.q >= this.r)
        o();
      char[] arrayOfChar4 = this.o;
      int i4 = this.q;
      this.q = (i4 + 1);
      arrayOfChar4[i4] = '"';
      return;
    }
    System.arraycopy(arrayOfChar1, 0, this.o, this.q, i2);
    this.q = (i2 + this.q);
    char[] arrayOfChar3 = this.o;
    int i3 = this.q;
    this.q = (i3 + 1);
    arrayOfChar3[i3] = '"';
  }

  public final void a(im paramim)
  {
    int i1 = 1;
    int i2 = this.e.a(paramim.a());
    if (i2 == 4)
      i("Can not write a field name, expecting a value");
    if (i2 == i1);
    while (true)
    {
      a(paramim, i1);
      return;
      i1 = 0;
    }
  }

  public final void a(String paramString)
  {
    int i1 = 1;
    int i2 = this.e.a(paramString);
    if (i2 == 4)
      i("Can not write a field name, expecting a value");
    if (i2 == i1);
    while (true)
    {
      b(paramString, i1);
      return;
      i1 = 0;
    }
  }

  public final void a(String paramString1, String paramString2)
  {
    a(paramString1);
    b(paramString2);
  }

  public final void a(BigDecimal paramBigDecimal)
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

  public final void a(BigInteger paramBigInteger)
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

  public final void a(boolean paramBoolean)
  {
    h("write boolean value");
    if (5 + this.q >= this.r)
      o();
    int i1 = this.q;
    char[] arrayOfChar = this.o;
    int i5;
    if (paramBoolean)
    {
      arrayOfChar[i1] = 't';
      int i6 = i1 + 1;
      arrayOfChar[i6] = 'r';
      int i7 = i6 + 1;
      arrayOfChar[i7] = 'u';
      i5 = i7 + 1;
      arrayOfChar[i5] = 'e';
    }
    while (true)
    {
      this.q = (i5 + 1);
      return;
      arrayOfChar[i1] = 'f';
      int i2 = i1 + 1;
      arrayOfChar[i2] = 'a';
      int i3 = i2 + 1;
      arrayOfChar[i3] = 'l';
      int i4 = i3 + 1;
      arrayOfChar[i4] = 's';
      i5 = i4 + 1;
      arrayOfChar[i5] = 'e';
    }
  }

  public final void a(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    h("write text value");
    if (this.q >= this.r)
      o();
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    c(paramArrayOfChar, paramInt1, paramInt2);
    if (this.q >= this.r)
      o();
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
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
    if (this.q >= this.r)
      o();
    char[] arrayOfChar = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar[i1] = '[';
  }

  public final void b(int paramInt)
  {
    h("write number");
    if (this.d)
    {
      c(paramInt);
      return;
    }
    if (11 + this.q >= this.r)
      o();
    this.q = ij.a(paramInt, this.o, this.q);
  }

  protected final void b(ha paramha, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i1 = paramInt2 - 3;
    int i2 = -6 + this.r;
    int i3 = paramha.c() >> 2;
    while (paramInt1 <= i1)
    {
      if (this.q > i2)
        o();
      int i7 = paramInt1 + 1;
      int i8 = paramArrayOfByte[paramInt1] << 8;
      int i9 = i7 + 1;
      int i10 = (i8 | 0xFF & paramArrayOfByte[i7]) << 8;
      paramInt1 = i9 + 1;
      this.q = paramha.a(i10 | 0xFF & paramArrayOfByte[i9], this.o, this.q);
      i3--;
      if (i3 <= 0)
      {
        char[] arrayOfChar1 = this.o;
        int i11 = this.q;
        this.q = (i11 + 1);
        arrayOfChar1[i11] = '\\';
        char[] arrayOfChar2 = this.o;
        int i12 = this.q;
        this.q = (i12 + 1);
        arrayOfChar2[i12] = 'n';
        i3 = paramha.c() >> 2;
      }
    }
    int i4 = paramInt2 - paramInt1;
    if (i4 > 0)
    {
      if (this.q > i2)
        o();
      int i5 = paramInt1 + 1;
      int i6 = paramArrayOfByte[paramInt1] << 16;
      if (i4 == 2)
        i6 |= (0xFF & paramArrayOfByte[i5]) << 8;
      this.q = paramha.a(i6, i4, this.o, this.q);
    }
  }

  public final void b(hp paramhp)
  {
    h("write text value");
    if (this.q >= this.r)
      o();
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    char[] arrayOfChar2 = paramhp.b();
    int i2 = arrayOfChar2.length;
    if (i2 < 32)
    {
      if (i2 > this.r - this.q)
        o();
      System.arraycopy(arrayOfChar2, 0, this.o, this.q, i2);
      this.q = (i2 + this.q);
    }
    while (true)
    {
      if (this.q >= this.r)
        o();
      char[] arrayOfChar3 = this.o;
      int i3 = this.q;
      this.q = (i3 + 1);
      arrayOfChar3[i3] = '"';
      return;
      o();
      this.j.write(arrayOfChar2, 0, i2);
    }
  }

  protected final void b(hp paramhp, boolean paramBoolean)
  {
    if (paramBoolean)
      this.a.c(this);
    char[] arrayOfChar1;
    while (true)
    {
      arrayOfChar1 = paramhp.b();
      if (!a(hf.a.c))
        break;
      if (this.q >= this.r)
        o();
      char[] arrayOfChar2 = this.o;
      int i1 = this.q;
      this.q = (i1 + 1);
      arrayOfChar2[i1] = '"';
      b(arrayOfChar1, 0, arrayOfChar1.length);
      if (this.q >= this.r)
        o();
      char[] arrayOfChar3 = this.o;
      int i2 = this.q;
      this.q = (i2 + 1);
      arrayOfChar3[i2] = '"';
      return;
      this.a.h(this);
    }
    b(arrayOfChar1, 0, arrayOfChar1.length);
  }

  public final void b(String paramString)
  {
    h("write text value");
    if (paramString == null)
    {
      p();
      return;
    }
    if (this.q >= this.r)
      o();
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    k(paramString);
    if (this.q >= this.r)
      o();
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
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
    if (this.a != null)
    {
      c(paramString, paramBoolean);
      return;
    }
    if (1 + this.q >= this.r)
      o();
    if (paramBoolean)
    {
      char[] arrayOfChar3 = this.o;
      int i3 = this.q;
      this.q = (i3 + 1);
      arrayOfChar3[i3] = ',';
    }
    if (!a(hf.a.c))
    {
      k(paramString);
      return;
    }
    char[] arrayOfChar1 = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar1[i1] = '"';
    k(paramString);
    if (this.q >= this.r)
      o();
    char[] arrayOfChar2 = this.o;
    int i2 = this.q;
    this.q = (i2 + 1);
    arrayOfChar2[i2] = '"';
  }

  public final void b(char[] paramArrayOfChar, int paramInt1, int paramInt2)
  {
    if (paramInt2 < 32)
    {
      if (paramInt2 > this.r - this.q)
        o();
      System.arraycopy(paramArrayOfChar, paramInt1, this.o, this.q, paramInt2);
      this.q = (paramInt2 + this.q);
      return;
    }
    o();
    this.j.write(paramArrayOfChar, paramInt1, paramInt2);
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
      if (this.q >= this.r)
        o();
      char[] arrayOfChar = this.o;
      int i1 = this.q;
      this.q = (i1 + 1);
      arrayOfChar[i1] = ']';
    }
  }

  public final void c(String paramString)
  {
    int i1 = paramString.length();
    int i2 = this.r - this.q;
    if (i2 == 0)
    {
      o();
      i2 = this.r - this.q;
    }
    if (i2 >= i1)
    {
      paramString.getChars(0, i1, this.o, this.q);
      this.q = (i1 + this.q);
      return;
    }
    j(paramString);
  }

  protected final void c(String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
      this.a.c(this);
    while (a(hf.a.c))
    {
      if (this.q >= this.r)
        o();
      char[] arrayOfChar1 = this.o;
      int i1 = this.q;
      this.q = (i1 + 1);
      arrayOfChar1[i1] = '"';
      k(paramString);
      if (this.q >= this.r)
        o();
      char[] arrayOfChar2 = this.o;
      int i2 = this.q;
      this.q = (i2 + 1);
      arrayOfChar2[i2] = '"';
      return;
      this.a.h(this);
    }
    k(paramString);
  }

  public final void close()
  {
    super.close();
    if ((this.o != null) && (a(hf.a.b)))
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
    if (this.q >= this.r)
      o();
    char[] arrayOfChar = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar[i1] = '{';
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
    if (this.q >= this.r)
      o();
    char[] arrayOfChar = this.o;
    int i1 = this.q;
    this.q = (i1 + 1);
    arrayOfChar[i1] = '}';
  }

  public final void e(String paramString)
  {
    h("write number");
    if (this.d)
    {
      c(paramString);
      return;
    }
    c(paramString);
  }

  public final void f()
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
        if (this.q >= this.r)
          o();
        this.o[this.q] = i2;
        this.q = (1 + this.q);
        return;
        i2 = 58;
        continue;
        i2 = 32;
      }
    }
    b(paramString, i1);
  }

  protected final void n()
  {
    char[] arrayOfChar = this.o;
    if (arrayOfChar != null)
    {
      this.o = null;
      this.i.b(arrayOfChar);
    }
  }

  protected final void o()
  {
    int i1 = this.q - this.p;
    if (i1 > 0)
    {
      int i2 = this.p;
      this.p = 0;
      this.q = 0;
      this.j.write(this.o, i2, i1);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ib
 * JD-Core Version:    0.6.2
 */