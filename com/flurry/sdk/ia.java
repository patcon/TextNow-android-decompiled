package com.flurry.sdk;

import java.io.IOException;
import java.io.InputStream;

public final class ia extends hu
{
  private static final int[] P = sk.b();
  private static final int[] Q = sk.a();
  protected hn I;
  protected final sa J;
  protected int[] K = new int[16];
  protected boolean L = false;
  protected InputStream M;
  protected byte[] N;
  protected boolean O;
  private int R;

  public ia(ie paramie, int paramInt1, InputStream paramInputStream, hn paramhn, sa paramsa, byte[] paramArrayOfByte, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    super(paramie, paramInt1);
    this.M = paramInputStream;
    this.I = paramhn;
    this.J = paramsa;
    this.N = paramArrayOfByte;
    this.f = paramInt2;
    this.g = paramInt3;
    this.O = paramBoolean;
    if (!hj.a.j.a(paramInt1))
      U();
  }

  private final hm a(char[] paramArrayOfChar, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
  {
    int i = 0;
    int i14;
    int k;
    label40: int m;
    int j;
    char[] arrayOfChar;
    if (paramInt2 == 46)
    {
      i14 = paramInt1 + 1;
      paramArrayOfChar[paramInt1] = ((char)paramInt2);
      if ((this.f >= this.g) && (!E()))
      {
        k = 1;
        if (i == 0)
          a(paramInt2, "Decimal point not followed by a digit");
        m = i;
        j = i14;
        arrayOfChar = paramArrayOfChar;
      }
    }
    while (true)
    {
      int n;
      int i2;
      int i3;
      label188: int i6;
      int i7;
      label255: int i12;
      int i11;
      int i8;
      int i10;
      if ((paramInt2 == 101) || (paramInt2 == 69))
      {
        if (j >= arrayOfChar.length)
        {
          arrayOfChar = this.p.m();
          j = 0;
        }
        n = j + 1;
        arrayOfChar[j] = ((char)paramInt2);
        if (this.f >= this.g)
          D();
        byte[] arrayOfByte1 = this.N;
        int i1 = this.f;
        this.f = (i1 + 1);
        i2 = 0xFF & arrayOfByte1[i1];
        if ((i2 == 45) || (i2 == 43))
          if (n >= arrayOfChar.length)
          {
            arrayOfChar = this.p.m();
            i3 = 0;
            int i4 = i3 + 1;
            arrayOfChar[i3] = ((char)i2);
            if (this.f >= this.g)
              D();
            byte[] arrayOfByte2 = this.N;
            int i5 = this.f;
            this.f = (i5 + 1);
            i2 = 0xFF & arrayOfByte2[i5];
            i6 = i4;
            i7 = 0;
            if ((i2 <= 57) && (i2 >= 48))
            {
              i7++;
              if (i6 >= arrayOfChar.length)
              {
                arrayOfChar = this.p.m();
                i6 = 0;
              }
              i12 = i6 + 1;
              arrayOfChar[i6] = ((char)i2);
              if ((this.f >= this.g) && (!E()))
              {
                i11 = i7;
                i8 = 1;
                i10 = i12;
                label335: if (i11 == 0)
                  a(i2, "Exponent indicator not followed by a digit");
                label348: if (i8 == 0)
                  this.f = (-1 + this.f);
                this.p.a(i10);
                return b(paramBoolean, paramInt3, m, i11);
                byte[] arrayOfByte4 = this.N;
                int i15 = this.f;
                this.f = (i15 + 1);
                paramInt2 = 0xFF & arrayOfByte4[i15];
                k = 0;
                if (paramInt2 < 48)
                  break label40;
                k = 0;
                if (paramInt2 > 57)
                  break label40;
                i++;
                if (i14 < paramArrayOfChar.length)
                  break label557;
                paramArrayOfChar = this.p.m();
              }
            }
          }
      }
      label557: for (int i16 = 0; ; i16 = i14)
      {
        i14 = i16 + 1;
        paramArrayOfChar[i16] = ((char)paramInt2);
        break;
        byte[] arrayOfByte3 = this.N;
        int i13 = this.f;
        this.f = (i13 + 1);
        i2 = 0xFF & arrayOfByte3[i13];
        i6 = i12;
        break label255;
        i8 = k;
        int i9 = i7;
        i10 = i6;
        i11 = i9;
        break label335;
        i3 = n;
        break label188;
        i6 = n;
        i7 = 0;
        break label255;
        i8 = k;
        i10 = j;
        i11 = 0;
        break label348;
      }
      arrayOfChar = paramArrayOfChar;
      j = paramInt1;
      k = 0;
      m = 0;
    }
  }

  private final hm a(char[] paramArrayOfChar, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    int i = paramInt2;
    int j = paramInt1;
    char[] arrayOfChar = paramArrayOfChar;
    if ((this.f >= this.g) && (!E()))
    {
      this.p.a(j);
      return a(paramBoolean, i);
    }
    byte[] arrayOfByte = this.N;
    int k = this.f;
    this.f = (k + 1);
    int m = 0xFF & arrayOfByte[k];
    if ((m > 57) || (m < 48))
    {
      if ((m == 46) || (m == 101) || (m == 69))
        return a(arrayOfChar, j, m, paramBoolean, i);
    }
    else
    {
      if (j < arrayOfChar.length)
        break label192;
      arrayOfChar = this.p.m();
    }
    label192: for (int n = 0; ; n = j)
    {
      j = n + 1;
      arrayOfChar[n] = ((char)m);
      i++;
      break;
      this.f = (-1 + this.f);
      this.p.a(j);
      return a(paramBoolean, i);
    }
  }

  private final sc a(int paramInt1, int paramInt2, int paramInt3)
  {
    return a(this.K, 0, paramInt1, paramInt2, paramInt3);
  }

  private final sc a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.K[0] = paramInt1;
    return a(this.K, 1, paramInt2, paramInt3, paramInt4);
  }

  private final sc a(int[] paramArrayOfInt, int paramInt1, int paramInt2)
  {
    int i = paramInt2 + (-4 + (paramInt1 << 2));
    int j;
    Object localObject1;
    int k;
    int m;
    label50: int n;
    int i1;
    int i5;
    int i6;
    label113: int i3;
    int i4;
    Object localObject2;
    int i2;
    if (paramInt2 < 4)
    {
      j = paramArrayOfInt[(paramInt1 - 1)];
      paramArrayOfInt[(paramInt1 - 1)] = (j << (4 - paramInt2 << 3));
      localObject1 = this.p.k();
      k = 0;
      m = 0;
      if (m >= i)
        break label489;
      n = 0xFF & paramArrayOfInt[(m >> 2)] >> (3 - (m & 0x3) << 3);
      i1 = m + 1;
      if (n <= 127)
        break label527;
      if ((n & 0xE0) != 192)
        break label423;
      i5 = n & 0x1F;
      i6 = 1;
      if (i1 + i6 > i)
        c(" in field name");
      int i7 = paramArrayOfInt[(i1 >> 2)] >> (3 - (i1 & 0x3) << 3);
      i1++;
      if ((i7 & 0xC0) != 128)
        l(i7);
      n = i5 << 6 | i7 & 0x3F;
      if (i6 > 1)
      {
        int i11 = paramArrayOfInt[(i1 >> 2)] >> (3 - (i1 & 0x3) << 3);
        i1++;
        if ((i11 & 0xC0) != 128)
          l(i11);
        n = n << 6 | i11 & 0x3F;
        if (i6 > 2)
        {
          int i12 = paramArrayOfInt[(i1 >> 2)] >> (3 - (i1 & 0x3) << 3);
          i1++;
          if ((i12 & 0xC0) != 128)
            l(i12 & 0xFF);
          n = n << 6 | i12 & 0x3F;
        }
      }
      if (i6 <= 2)
        break label527;
      int i8 = n - 65536;
      if (k >= localObject1.length)
        localObject1 = this.p.n();
      int i9 = k + 1;
      localObject1[k] = ((char)(55296 + (i8 >> 10)));
      int i10 = 0xDC00 | i8 & 0x3FF;
      i3 = i1;
      i4 = i9;
      localObject2 = localObject1;
      i2 = i10;
    }
    while (true)
    {
      if (i4 >= localObject2.length)
        localObject2 = this.p.n();
      k = i4 + 1;
      localObject2[i4] = ((char)i2);
      m = i3;
      localObject1 = localObject2;
      break label50;
      j = 0;
      break;
      label423: if ((n & 0xF0) == 224)
      {
        i5 = n & 0xF;
        i6 = 2;
        break label113;
      }
      if ((n & 0xF8) == 240)
      {
        i5 = n & 0x7;
        i6 = 3;
        break label113;
      }
      k(n);
      i5 = 1;
      i6 = i5;
      break label113;
      label489: String str = new String((char[])localObject1, 0, k);
      if (paramInt2 < 4)
        paramArrayOfInt[(paramInt1 - 1)] = j;
      return this.J.a(str, paramArrayOfInt, paramInt1);
      label527: localObject2 = localObject1;
      i2 = n;
      i3 = i1;
      i4 = k;
    }
  }

  private final sc a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 >= paramArrayOfInt.length)
    {
      paramArrayOfInt = a(paramArrayOfInt, paramArrayOfInt.length);
      this.K = paramArrayOfInt;
    }
    int i = paramInt1 + 1;
    paramArrayOfInt[paramInt1] = paramInt2;
    sc localsc = this.J.a(paramArrayOfInt, i);
    if (localsc == null)
      localsc = a(paramArrayOfInt, i, paramInt3);
    return localsc;
  }

  private final void a(char[] paramArrayOfChar, int paramInt)
  {
    int[] arrayOfInt = P;
    byte[] arrayOfByte = this.N;
    int i = this.f;
    if (i >= this.g)
    {
      D();
      i = this.f;
    }
    if (paramInt >= paramArrayOfChar.length)
    {
      paramArrayOfChar = this.p.m();
      paramInt = 0;
    }
    int j = Math.min(this.g, i + (paramArrayOfChar.length - paramInt));
    label67: int k;
    int m;
    if (i < j)
    {
      k = i + 1;
      m = 0xFF & arrayOfByte[i];
      if (arrayOfInt[m] != 0)
      {
        this.f = k;
        if (m == 34)
          break label349;
        switch (arrayOfInt[m])
        {
        default:
          if (m < 32)
          {
            c(m, "string value");
            label159: if (paramInt < paramArrayOfChar.length)
              break label358;
            paramArrayOfChar = this.p.m();
          }
          break;
        case 1:
        case 2:
        case 3:
        case 4:
        }
      }
    }
    label349: label358: for (int i4 = 0; ; i4 = paramInt)
    {
      paramInt = i4 + 1;
      paramArrayOfChar[i4] = ((char)m);
      break;
      int n = paramInt + 1;
      paramArrayOfChar[paramInt] = ((char)m);
      i = k;
      paramInt = n;
      break label67;
      this.f = i;
      break;
      m = Q();
      break label159;
      m = n(m);
      break label159;
      if (this.g - this.f >= 2)
      {
        m = p(m);
        break label159;
      }
      m = o(m);
      break label159;
      int i1 = q(m);
      int i2 = paramInt + 1;
      paramArrayOfChar[paramInt] = ((char)(0xD800 | i1 >> 10));
      if (i2 >= paramArrayOfChar.length)
      {
        paramArrayOfChar = this.p.m();
        i2 = 0;
      }
      int i3 = 0xDC00 | i1 & 0x3FF;
      paramInt = i2;
      m = i3;
      break label159;
      j(m);
      break label159;
      this.p.a(paramInt);
      return;
    }
  }

  public static int[] a(int[] paramArrayOfInt, int paramInt)
  {
    if (paramArrayOfInt == null)
      return new int[paramInt];
    int i = paramArrayOfInt.length;
    int[] arrayOfInt = new int[i + paramInt];
    System.arraycopy(paramArrayOfInt, 0, arrayOfInt, 0, i);
    return arrayOfInt;
  }

  private final hm ac()
  {
    this.r = false;
    hm localhm = this.o;
    this.o = null;
    if (localhm == hm.d)
      this.n = this.n.b(this.l, this.m);
    while (true)
    {
      this.b = localhm;
      return localhm;
      if (localhm == hm.b)
        this.n = this.n.c(this.l, this.m);
    }
  }

  private final int ad()
  {
    if ((this.f >= this.g) && (!E()));
    int i;
    do
    {
      i = 48;
      while ((this.f >= this.g) && (!E()))
        do
        {
          return i;
          i = 0xFF & this.N[this.f];
          if ((i < 48) || (i > 57))
            return 48;
          if (!a(hj.a.g))
            b("Leading zeroes not allowed");
          this.f = (1 + this.f);
        }
        while (i != 48);
      i = 0xFF & this.N[this.f];
      if ((i < 48) || (i > 57))
        return 48;
      this.f = (1 + this.f);
    }
    while (i == 48);
    return i;
  }

  private final int ae()
  {
    while ((this.f < this.g) || (E()))
    {
      byte[] arrayOfByte = this.N;
      int i = this.f;
      this.f = (i + 1);
      int j = 0xFF & arrayOfByte[i];
      if (j > 32)
      {
        if (j != 47)
          return j;
        ag();
      }
      else if (j != 32)
      {
        if (j == 10)
          ab();
        else if (j == 13)
          aa();
        else if (j != 9)
          b(j);
      }
    }
    throw a("Unexpected end-of-input within/between " + this.n.d() + " entries");
  }

  private final int af()
  {
    while ((this.f < this.g) || (E()))
    {
      byte[] arrayOfByte = this.N;
      int i = this.f;
      this.f = (i + 1);
      int j = 0xFF & arrayOfByte[i];
      if (j > 32)
      {
        if (j != 47)
          return j;
        ag();
      }
      else if (j != 32)
      {
        if (j == 10)
          ab();
        else if (j == 13)
          aa();
        else if (j != 9)
          b(j);
      }
    }
    H();
    return -1;
  }

  private final void ag()
  {
    if (!a(hj.a.b))
      b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
    if ((this.f >= this.g) && (!E()))
      c(" in a comment");
    byte[] arrayOfByte = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = 0xFF & arrayOfByte[i];
    if (j == 47)
    {
      ai();
      return;
    }
    if (j == 42)
    {
      ah();
      return;
    }
    b(j, "was expecting either '*' or '/' for a comment");
  }

  private final void ah()
  {
    int[] arrayOfInt = sk.e();
    while ((this.f < this.g) || (E()))
    {
      byte[] arrayOfByte = this.N;
      int i = this.f;
      this.f = (i + 1);
      int j = 0xFF & arrayOfByte[i];
      int k = arrayOfInt[j];
      if (k != 0)
        switch (k)
        {
        default:
          j(j);
          break;
        case 42:
          if (this.N[this.f] == 47)
          {
            this.f = (1 + this.f);
            return;
          }
          break;
        case 10:
          ab();
          break;
        case 13:
          aa();
          break;
        case 2:
          r(j);
          break;
        case 3:
          s(j);
          break;
        case 4:
          t(j);
        }
    }
    c(" in a comment");
  }

  private final void ai()
  {
    int[] arrayOfInt = sk.e();
    while (true)
    {
      int j;
      int k;
      if ((this.f < this.g) || (E()))
      {
        byte[] arrayOfByte = this.N;
        int i = this.f;
        this.f = (i + 1);
        j = 0xFF & arrayOfByte[i];
        k = arrayOfInt[j];
        if (k == 0);
      }
      else
      {
        switch (k)
        {
        case 42:
        default:
          j(j);
          break;
        case 10:
          ab();
          return;
        case 13:
          aa();
          return;
        case 2:
          r(j);
          break;
        case 3:
          s(j);
          break;
        case 4:
          t(j);
        }
      }
    }
  }

  private int aj()
  {
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte = this.N;
    int i = this.f;
    this.f = (i + 1);
    return 0xFF & arrayOfByte[i];
  }

  private final sc b(int paramInt1, int paramInt2)
  {
    sc localsc = this.J.a(paramInt1);
    if (localsc != null)
      return localsc;
    this.K[0] = paramInt1;
    return a(this.K, 1, paramInt2);
  }

  private final sc b(int paramInt1, int paramInt2, int paramInt3)
  {
    sc localsc = this.J.a(paramInt1, paramInt2);
    if (localsc != null)
      return localsc;
    this.K[0] = paramInt1;
    this.K[1] = paramInt2;
    return a(this.K, 2, paramInt3);
  }

  private final hm m(int paramInt)
  {
    if (paramInt == 34)
    {
      this.L = true;
      hm localhm8 = hm.h;
      this.b = localhm8;
      return localhm8;
    }
    switch (paramInt)
    {
    default:
      hm localhm7 = h(paramInt);
      this.b = localhm7;
      return localhm7;
    case 91:
      this.n = this.n.b(this.l, this.m);
      hm localhm6 = hm.d;
      this.b = localhm6;
      return localhm6;
    case 123:
      this.n = this.n.c(this.l, this.m);
      hm localhm5 = hm.b;
      this.b = localhm5;
      return localhm5;
    case 93:
    case 125:
      b(paramInt, "expected a value");
    case 116:
      a("true", 1);
      hm localhm4 = hm.k;
      this.b = localhm4;
      return localhm4;
    case 102:
      a("false", 1);
      hm localhm3 = hm.l;
      this.b = localhm3;
      return localhm3;
    case 110:
      a("null", 1);
      hm localhm2 = hm.m;
      this.b = localhm2;
      return localhm2;
    case 45:
    case 48:
    case 49:
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 56:
    case 57:
    }
    hm localhm1 = d(paramInt);
    this.b = localhm1;
    return localhm1;
  }

  private final int n(int paramInt)
  {
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = arrayOfByte[i];
    if ((j & 0xC0) != 128)
      a(j & 0xFF, this.f);
    return (paramInt & 0x1F) << 6 | j & 0x3F;
  }

  private final int o(int paramInt)
  {
    if (this.f >= this.g)
      D();
    int i = paramInt & 0xF;
    byte[] arrayOfByte1 = this.N;
    int j = this.f;
    this.f = (j + 1);
    int k = arrayOfByte1[j];
    if ((k & 0xC0) != 128)
      a(k & 0xFF, this.f);
    int m = i << 6 | k & 0x3F;
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte2 = this.N;
    int n = this.f;
    this.f = (n + 1);
    int i1 = arrayOfByte2[n];
    if ((i1 & 0xC0) != 128)
      a(i1 & 0xFF, this.f);
    return m << 6 | i1 & 0x3F;
  }

  private final int p(int paramInt)
  {
    int i = paramInt & 0xF;
    byte[] arrayOfByte1 = this.N;
    int j = this.f;
    this.f = (j + 1);
    int k = arrayOfByte1[j];
    if ((k & 0xC0) != 128)
      a(k & 0xFF, this.f);
    int m = i << 6 | k & 0x3F;
    byte[] arrayOfByte2 = this.N;
    int n = this.f;
    this.f = (n + 1);
    int i1 = arrayOfByte2[n];
    if ((i1 & 0xC0) != 128)
      a(i1 & 0xFF, this.f);
    return m << 6 | i1 & 0x3F;
  }

  private final int q(int paramInt)
  {
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte1 = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = arrayOfByte1[i];
    if ((j & 0xC0) != 128)
      a(j & 0xFF, this.f);
    int k = (paramInt & 0x7) << 6 | j & 0x3F;
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte2 = this.N;
    int m = this.f;
    this.f = (m + 1);
    int n = arrayOfByte2[m];
    if ((n & 0xC0) != 128)
      a(n & 0xFF, this.f);
    int i1 = k << 6 | n & 0x3F;
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte3 = this.N;
    int i2 = this.f;
    this.f = (i2 + 1);
    int i3 = arrayOfByte3[i2];
    if ((i3 & 0xC0) != 128)
      a(i3 & 0xFF, this.f);
    return (i1 << 6 | i3 & 0x3F) - 65536;
  }

  private final void r(int paramInt)
  {
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = arrayOfByte[i];
    if ((j & 0xC0) != 128)
      a(j & 0xFF, this.f);
  }

  private final void s(int paramInt)
  {
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte1 = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = arrayOfByte1[i];
    if ((j & 0xC0) != 128)
      a(j & 0xFF, this.f);
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte2 = this.N;
    int k = this.f;
    this.f = (k + 1);
    int m = arrayOfByte2[k];
    if ((m & 0xC0) != 128)
      a(m & 0xFF, this.f);
  }

  private final void t(int paramInt)
  {
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte1 = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = arrayOfByte1[i];
    if ((j & 0xC0) != 128)
      a(j & 0xFF, this.f);
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte2 = this.N;
    int k = this.f;
    this.f = (k + 1);
    int m = arrayOfByte2[k];
    if ((m & 0xC0) != 128)
      a(m & 0xFF, this.f);
    if (this.f >= this.g)
      D();
    byte[] arrayOfByte3 = this.N;
    int n = this.f;
    this.f = (n + 1);
    int i1 = arrayOfByte3[n];
    if ((i1 & 0xC0) != 128)
      a(i1 & 0xFF, this.f);
  }

  protected final boolean E()
  {
    this.h += this.g;
    this.j -= this.g;
    InputStream localInputStream = this.M;
    boolean bool = false;
    int i;
    if (localInputStream != null)
    {
      i = this.M.read(this.N, 0, this.N.length);
      if (i <= 0)
        break label74;
      this.f = 0;
      this.g = i;
      bool = true;
    }
    label74: 
    do
    {
      return bool;
      F();
      bool = false;
    }
    while (i != 0);
    throw new IOException("InputStream.read() returned 0 characters when trying to read " + this.N.length + " bytes");
  }

  protected final void F()
  {
    if (this.M != null)
    {
      if ((this.d.c()) || (a(hj.a.a)))
        this.M.close();
      this.M = null;
    }
  }

  protected final void G()
  {
    super.G();
    if (this.O)
    {
      byte[] arrayOfByte = this.N;
      if (arrayOfByte != null)
      {
        this.N = null;
        this.d.a(arrayOfByte);
      }
    }
  }

  protected final char Q()
  {
    int i = 0;
    if ((this.f >= this.g) && (!E()))
      c(" in character escape sequence");
    byte[] arrayOfByte1 = this.N;
    int j = this.f;
    this.f = (j + 1);
    int k = arrayOfByte1[j];
    switch (k)
    {
    default:
      return a((char)i(k));
    case 98:
      return '\b';
    case 116:
      return '\t';
    case 110:
      return '\n';
    case 102:
      return '\f';
    case 114:
      return '\r';
    case 34:
    case 47:
    case 92:
      return (char)k;
    case 117:
    }
    int m = 0;
    while (i < 4)
    {
      if ((this.f >= this.g) && (!E()))
        c(" in character escape sequence");
      byte[] arrayOfByte2 = this.N;
      int n = this.f;
      this.f = (n + 1);
      int i1 = arrayOfByte2[n];
      int i2 = sk.a(i1);
      if (i2 < 0)
        b(i1, "expected a hex-digit for character escape sequence");
      m = i2 | m << 4;
      i++;
    }
    return (char)m;
  }

  protected final sc V()
  {
    if ((this.f >= this.g) && (!E()))
      c(": was expecting closing '\"' for name");
    byte[] arrayOfByte = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = 0xFF & arrayOfByte[i];
    if (j == 34)
      return sa.e();
    return a(this.K, 0, 0, j, 0);
  }

  protected final sc W()
  {
    if ((this.f >= this.g) && (!E()))
      c(": was expecting closing ''' for name");
    byte[] arrayOfByte1 = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = 0xFF & arrayOfByte1[i];
    if (j == 39)
      return sa.e();
    Object localObject1 = this.K;
    int[] arrayOfInt = Q;
    int k = 0;
    int m = 0;
    int n = 0;
    label113: int i16;
    int i4;
    int i15;
    label172: int i22;
    Object localObject5;
    int i23;
    int i25;
    int i3;
    int i5;
    if (j != 39)
    {
      if ((j == 34) || (arrayOfInt[j] == 0))
        break label663;
      if (j != 92)
      {
        c(j, "name");
        if (j <= 127)
          break label663;
        if (k < 4)
          break label644;
        if (n >= localObject1.length)
        {
          localObject1 = a((int[])localObject1, localObject1.length);
          this.K = ((int[])localObject1);
        }
        int i29 = n + 1;
        localObject1[n] = m;
        i16 = 0;
        i4 = i29;
        i15 = 0;
        if (j >= 2048)
          break label358;
        int i27 = i15 << 8 | (0xC0 | j >> 6);
        int i28 = i16 + 1;
        i22 = i27;
        localObject5 = localObject1;
        i23 = i28;
        i25 = 0x80 | j & 0x3F;
        i3 = i22;
        i5 = i23;
        localObject1 = localObject5;
      }
    }
    for (int i6 = i25; ; i6 = j)
    {
      int i9;
      int i10;
      Object localObject3;
      int i8;
      label273: label358: int i17;
      int i18;
      int i20;
      Object localObject4;
      int i21;
      int i19;
      if (i5 < 4)
      {
        int i13 = i5 + 1;
        i9 = i6 | i3 << 8;
        i10 = i4;
        localObject3 = localObject1;
        i8 = i13;
        if ((this.f >= this.g) && (!E()))
          c(" in field name");
        byte[] arrayOfByte2 = this.N;
        int i11 = this.f;
        this.f = (i11 + 1);
        j = 0xFF & arrayOfByte2[i11];
        int i12 = i8;
        localObject1 = localObject3;
        m = i9;
        n = i10;
        k = i12;
        break;
        j = Q();
        break label113;
        i17 = i15 << 8 | (0xE0 | j >> 12);
        i18 = i16 + 1;
        if (i18 < 4)
          break label625;
        if (i4 >= localObject1.length)
        {
          localObject1 = a((int[])localObject1, localObject1.length);
          this.K = ((int[])localObject1);
        }
        int i26 = i4 + 1;
        localObject1[i4] = i17;
        i20 = i26;
        localObject4 = localObject1;
        i21 = 0;
        i19 = 0;
      }
      while (true)
      {
        i22 = i19 << 8 | (0x80 | 0x3F & j >> 6);
        i23 = i21 + 1;
        int i24 = i20;
        localObject5 = localObject4;
        i4 = i24;
        break;
        if (i4 >= localObject1.length)
        {
          localObject1 = a((int[])localObject1, localObject1.length);
          this.K = ((int[])localObject1);
        }
        int i7 = i4 + 1;
        localObject1[i4] = i3;
        localObject3 = localObject1;
        i8 = 1;
        i9 = i6;
        i10 = i7;
        break label273;
        int i2;
        Object localObject2;
        if (k > 0)
        {
          if (n >= localObject1.length)
          {
            localObject1 = a((int[])localObject1, localObject1.length);
            this.K = ((int[])localObject1);
          }
          i2 = n + 1;
          localObject1[n] = m;
          localObject2 = localObject1;
        }
        for (int i1 = i2; ; i1 = n)
        {
          sc localsc = this.J.a(localObject2, i1);
          if (localsc == null)
            return a(localObject2, i1, k);
          return localsc;
          localObject2 = localObject1;
        }
        label625: i19 = i17;
        i20 = i4;
        localObject4 = localObject1;
        i21 = i18;
      }
      label644: int i14 = k;
      i15 = m;
      i4 = n;
      i16 = i14;
      break label172;
      label663: i3 = m;
      i4 = n;
      i5 = k;
    }
  }

  protected final void X()
  {
    int i = this.f;
    if (i >= this.g)
    {
      D();
      i = this.f;
    }
    char[] arrayOfChar = this.p.k();
    int[] arrayOfInt = P;
    int j = Math.min(this.g, i + arrayOfChar.length);
    byte[] arrayOfByte = this.N;
    int k = i;
    int m = 0;
    while (k < j)
    {
      int n = 0xFF & arrayOfByte[k];
      if (arrayOfInt[n] != 0)
      {
        if (n != 34)
          break;
        this.f = (k + 1);
        this.p.a(m);
        return;
      }
      int i1 = k + 1;
      int i2 = m + 1;
      arrayOfChar[m] = ((char)n);
      m = i2;
      k = i1;
    }
    this.f = k;
    a(arrayOfChar, m);
  }

  protected final void Y()
  {
    this.L = false;
    int[] arrayOfInt = P;
    byte[] arrayOfByte = this.N;
    int i = this.f;
    int j = this.g;
    if (i >= j)
    {
      D();
      i = this.f;
      j = this.g;
    }
    while (true)
    {
      int k;
      int m;
      if (i < j)
      {
        k = i + 1;
        m = 0xFF & arrayOfByte[i];
        if (arrayOfInt[m] == 0)
          break label191;
        this.f = k;
        if (m == 34);
      }
      else
      {
        switch (arrayOfInt[m])
        {
        default:
          if (m < 32)
          {
            c(m, "string value");
            break;
            this.f = i;
          }
          break;
        case 1:
          Q();
          break;
        case 2:
          r(m);
          break;
        case 3:
          s(m);
          break;
        case 4:
          t(m);
          break;
          j(m);
          break;
        }
      }
      return;
      label191: i = k;
    }
  }

  protected final hm Z()
  {
    char[] arrayOfChar = this.p.k();
    int[] arrayOfInt = P;
    byte[] arrayOfByte = this.N;
    int i = 0;
    label388: label400: 
    while (true)
    {
      if (this.f >= this.g)
        D();
      if (i >= arrayOfChar.length)
      {
        arrayOfChar = this.p.m();
        i = 0;
      }
      int j = this.g;
      int k = this.f + (arrayOfChar.length - i);
      if (k < j);
      while (true)
      {
        if (this.f >= k)
          break label400;
        int m = this.f;
        this.f = (m + 1);
        int n = 0xFF & arrayOfByte[m];
        if ((n != 39) && (arrayOfInt[n] == 0))
        {
          int i5 = i + 1;
          arrayOfChar[i] = ((char)n);
          i = i5;
        }
        else
        {
          label209: int i3;
          int i4;
          label231: int i1;
          int i2;
          if (n != 39)
          {
            switch (arrayOfInt[n])
            {
            default:
              if (n < 32)
                c(n, "string value");
              j(n);
              i3 = n;
            case 1:
            case 2:
            case 3:
            case 4:
            }
            while (true)
              if (i >= arrayOfChar.length)
              {
                arrayOfChar = this.p.m();
                i4 = 0;
                i = i4 + 1;
                arrayOfChar[i4] = ((char)i3);
                break;
                if (n == 34)
                  break label209;
                i3 = Q();
                continue;
                i3 = n(n);
                continue;
                if (this.g - this.f >= 2)
                {
                  i3 = p(n);
                }
                else
                {
                  i3 = o(n);
                  continue;
                  i1 = q(n);
                  i2 = i + 1;
                  arrayOfChar[i] = ((char)(0xD800 | i1 >> 10));
                  if (i2 < arrayOfChar.length)
                    break label388;
                  arrayOfChar = this.p.m();
                }
              }
          }
          for (i = 0; ; i = i2)
          {
            i3 = 0xDC00 | i1 & 0x3FF;
            break;
            this.p.a(i);
            return hm.h;
            i4 = i;
            break label231;
          }
          k = j;
        }
      }
    }
  }

  protected final hm a(int paramInt, boolean paramBoolean)
  {
    double d = (-1.0D / 0.0D);
    if (paramInt == 73)
    {
      if ((this.f >= this.g) && (!E()))
        T();
      byte[] arrayOfByte = this.N;
      int i = this.f;
      this.f = (i + 1);
      paramInt = arrayOfByte[i];
      if (paramInt != 78)
        break label158;
      String str2;
      if (paramBoolean)
      {
        str2 = "-INF";
        a(str2, 3);
        if (!a(hj.a.h))
          break label117;
        if (!paramBoolean)
          break label110;
      }
      while (true)
      {
        return a(str2, d);
        str2 = "+INF";
        break;
        label110: d = (1.0D / 0.0D);
      }
      label117: d("Non-standard token '" + str2 + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
    }
    while (true)
    {
      a(paramInt, "expected digit (0-9) to follow minus sign, for valid numeric value");
      return null;
      label158: if (paramInt == 110)
      {
        String str1;
        if (paramBoolean)
        {
          str1 = "-Infinity";
          a(str1, 3);
          if (!a(hj.a.h))
            break label217;
          if (!paramBoolean)
            break label210;
        }
        while (true)
        {
          return a(str1, d);
          str1 = "+Infinity";
          break;
          label210: d = (1.0D / 0.0D);
        }
        label217: d("Non-standard token '" + str1 + "': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
      }
    }
  }

  public final hn a()
  {
    return this.I;
  }

  protected final sc a(int paramInt, int[] paramArrayOfInt)
  {
    byte[] arrayOfByte1 = this.N;
    int i = this.f;
    this.f = (i + 1);
    int j = 0xFF & arrayOfByte1[i];
    if (paramArrayOfInt[j] != 0)
    {
      if (j == 34)
        return b(this.R, paramInt, 1);
      return a(this.R, paramInt, j, 1);
    }
    int k = j | paramInt << 8;
    byte[] arrayOfByte2 = this.N;
    int m = this.f;
    this.f = (m + 1);
    int n = 0xFF & arrayOfByte2[m];
    if (paramArrayOfInt[n] != 0)
    {
      if (n == 34)
        return b(this.R, k, 2);
      return a(this.R, k, n, 2);
    }
    int i1 = n | k << 8;
    byte[] arrayOfByte3 = this.N;
    int i2 = this.f;
    this.f = (i2 + 1);
    int i3 = 0xFF & arrayOfByte3[i2];
    if (paramArrayOfInt[i3] != 0)
    {
      if (i3 == 34)
        return b(this.R, i1, 3);
      return a(this.R, i1, i3, 3);
    }
    int i4 = i3 | i1 << 8;
    byte[] arrayOfByte4 = this.N;
    int i5 = this.f;
    this.f = (i5 + 1);
    int i6 = 0xFF & arrayOfByte4[i5];
    if (paramArrayOfInt[i6] != 0)
    {
      if (i6 == 34)
        return b(this.R, i4, 4);
      return a(this.R, i4, i6, 4);
    }
    this.K[0] = this.R;
    this.K[1] = i4;
    return f(i6);
  }

  protected final sc a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int[] arrayOfInt1 = Q;
    label36: int n;
    int[] arrayOfInt2;
    label84: int i6;
    Object localObject2;
    int i7;
    Object localObject1;
    int i;
    if (arrayOfInt1[paramInt3] != 0)
      if (paramInt3 != 34)
        if (paramInt3 != 92)
        {
          c(paramInt3, "name");
          if (paramInt3 <= 127)
            break label496;
          if (paramInt4 < 4)
            break label487;
          if (paramInt1 >= paramArrayOfInt.length)
          {
            paramArrayOfInt = a(paramArrayOfInt, paramArrayOfInt.length);
            this.K = paramArrayOfInt;
          }
          n = paramInt1 + 1;
          paramArrayOfInt[paramInt1] = paramInt2;
          paramInt4 = 0;
          paramInt2 = 0;
          arrayOfInt2 = paramArrayOfInt;
          if (paramInt3 >= 2048)
            break label238;
          int i10 = paramInt2 << 8 | (0xC0 | paramInt3 >> 6);
          int i11 = paramInt4 + 1;
          i6 = i10;
          localObject2 = arrayOfInt2;
          i7 = i11;
          paramInt2 = 0x80 | paramInt3 & 0x3F;
          paramInt4 = i7;
          paramInt1 = n;
          localObject1 = localObject2;
          i = i6;
        }
    while (true)
    {
      label171: label238: int i1;
      int i2;
      int i4;
      int[] arrayOfInt3;
      int i5;
      int i3;
      if (paramInt4 < 4)
      {
        paramInt4++;
        paramInt2 |= i << 8;
        paramArrayOfInt = (int[])localObject1;
        if ((this.f >= this.g) && (!E()))
          c(" in field name");
        byte[] arrayOfByte = this.N;
        int k = this.f;
        this.f = (k + 1);
        paramInt3 = 0xFF & arrayOfByte[k];
        break;
        paramInt3 = Q();
        break label36;
        i1 = paramInt2 << 8 | (0xE0 | paramInt3 >> 12);
        i2 = paramInt4 + 1;
        if (i2 < 4)
          break label468;
        if (n >= arrayOfInt2.length)
        {
          arrayOfInt2 = a(arrayOfInt2, arrayOfInt2.length);
          this.K = arrayOfInt2;
        }
        int i9 = n + 1;
        arrayOfInt2[n] = i1;
        i4 = i9;
        arrayOfInt3 = arrayOfInt2;
        i5 = 0;
        i3 = 0;
      }
      while (true)
      {
        i6 = i3 << 8 | (0x80 | 0x3F & paramInt3 >> 6);
        i7 = i5 + 1;
        int i8 = i4;
        localObject2 = arrayOfInt3;
        n = i8;
        break;
        if (paramInt1 >= localObject1.length)
        {
          localObject1 = a((int[])localObject1, localObject1.length);
          this.K = ((int[])localObject1);
        }
        int j = paramInt1 + 1;
        localObject1[paramInt1] = i;
        paramInt4 = 1;
        paramInt1 = j;
        paramArrayOfInt = (int[])localObject1;
        break label171;
        if (paramInt4 > 0)
        {
          if (paramInt1 >= paramArrayOfInt.length)
          {
            paramArrayOfInt = a(paramArrayOfInt, paramArrayOfInt.length);
            this.K = paramArrayOfInt;
          }
          int m = paramInt1 + 1;
          paramArrayOfInt[paramInt1] = paramInt2;
          paramInt1 = m;
        }
        sc localsc = this.J.a(paramArrayOfInt, paramInt1);
        if (localsc == null)
          localsc = a(paramArrayOfInt, paramInt1, paramInt4);
        return localsc;
        label468: i3 = i1;
        i4 = n;
        arrayOfInt3 = arrayOfInt2;
        i5 = i2;
      }
      label487: n = paramInt1;
      arrayOfInt2 = paramArrayOfInt;
      break label84;
      label496: i = paramInt2;
      localObject1 = paramArrayOfInt;
      paramInt2 = paramInt3;
    }
  }

  protected final String a(hm paramhm)
  {
    if (paramhm == null)
      return null;
    switch (1.a[paramhm.ordinal()])
    {
    default:
      return paramhm.a();
    case 1:
      return this.n.h();
    case 2:
    case 3:
    case 4:
    }
    return this.p.f();
  }

  protected final void a(int paramInt1, int paramInt2)
  {
    this.f = paramInt2;
    l(paramInt1);
  }

  protected final void a(String paramString, int paramInt)
  {
    int i = paramString.length();
    do
    {
      if ((this.f >= this.g) && (!E()))
        c(" in a value");
      if (this.N[this.f] != paramString.charAt(paramInt))
        a(paramString.substring(0, paramInt), "'null', 'true', 'false' or NaN");
      this.f = (1 + this.f);
      paramInt++;
    }
    while (paramInt < i);
    if ((this.f >= this.g) && (!E()));
    int j;
    do
    {
      return;
      j = 0xFF & this.N[this.f];
    }
    while ((j < 48) || (j == 93) || (j == 125) || (!Character.isJavaIdentifierPart((char)i(j))));
    this.f = (1 + this.f);
    a(paramString.substring(0, paramInt), "'null', 'true', 'false' or NaN");
  }

  protected final void a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString1);
    while ((this.f < this.g) || (E()))
    {
      byte[] arrayOfByte = this.N;
      int i = this.f;
      this.f = (i + 1);
      char c = (char)i(arrayOfByte[i]);
      if (!Character.isJavaIdentifierPart(c))
        break;
      this.f = (1 + this.f);
      localStringBuilder.append(c);
    }
    d("Unrecognized token '" + localStringBuilder.toString() + "': was expecting " + paramString2);
  }

  public final byte[] a(ha paramha)
  {
    if ((this.b != hm.h) && ((this.b != hm.g) || (this.t == null)))
      d("Current token (" + this.b + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
    if (this.L);
    while (true)
    {
      try
      {
        this.t = b(paramha);
        this.L = false;
        return this.t;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        throw a("Failed to decode VALUE_STRING as base64 (" + paramha + "): " + localIllegalArgumentException.getMessage());
      }
      if (this.t == null)
      {
        sj localsj = I();
        a(k(), localsj, paramha);
        this.t = localsj.b();
      }
    }
  }

  protected final void aa()
  {
    if (((this.f < this.g) || (E())) && (this.N[this.f] == 10))
      this.f = (1 + this.f);
    this.i = (1 + this.i);
    this.j = this.f;
  }

  protected final void ab()
  {
    this.i = (1 + this.i);
    this.j = this.f;
  }

  public final hm b()
  {
    this.y = 0;
    if (this.b == hm.f)
      return ac();
    if (this.L)
      Y();
    int i = af();
    if (i < 0)
    {
      close();
      this.b = null;
      return null;
    }
    this.k = (this.h + this.f - 1L);
    this.l = this.i;
    this.m = (-1 + (this.f - this.j));
    this.t = null;
    if (i == 93)
    {
      if (!this.n.a())
        a(i, '}');
      this.n = this.n.i();
      hm localhm3 = hm.e;
      this.b = localhm3;
      return localhm3;
    }
    if (i == 125)
    {
      if (!this.n.c())
        a(i, ']');
      this.n = this.n.i();
      hm localhm2 = hm.c;
      this.b = localhm2;
      return localhm2;
    }
    if (this.n.j())
    {
      if (i != 44)
        b(i, "was expecting comma to separate " + this.n.d() + " entries");
      i = ae();
    }
    if (!this.n.c())
      return m(i);
    sc localsc = e(i);
    this.n.a(localsc.a());
    this.b = hm.f;
    int j = ae();
    if (j != 58)
      b(j, "was expecting a colon to separate field name and value");
    int k = ae();
    if (k == 34)
    {
      this.L = true;
      this.o = hm.h;
      return this.b;
    }
    hm localhm1;
    switch (k)
    {
    default:
      localhm1 = h(k);
    case 91:
    case 123:
    case 93:
    case 125:
    case 116:
    case 102:
    case 110:
    case 45:
    case 48:
    case 49:
    case 50:
    case 51:
    case 52:
    case 53:
    case 54:
    case 55:
    case 56:
    case 57:
    }
    while (true)
    {
      this.o = localhm1;
      return this.b;
      localhm1 = hm.d;
      continue;
      localhm1 = hm.b;
      continue;
      b(k, "expected a value");
      a("true", 1);
      localhm1 = hm.k;
      continue;
      a("false", 1);
      localhm1 = hm.l;
      continue;
      a("null", 1);
      localhm1 = hm.m;
      continue;
      localhm1 = d(k);
    }
  }

  protected final byte[] b(ha paramha)
  {
    sj localsj = I();
    while (true)
    {
      if (this.f >= this.g)
        D();
      byte[] arrayOfByte1 = this.N;
      int i = this.f;
      this.f = (i + 1);
      int j = 0xFF & arrayOfByte1[i];
      if (j > 32)
      {
        int k = paramha.b(j);
        if (k < 0)
        {
          if (j == 34)
            return localsj.b();
          k = a(paramha, j, 0);
          if (k < 0);
        }
        else
        {
          if (this.f >= this.g)
            D();
          byte[] arrayOfByte2 = this.N;
          int m = this.f;
          this.f = (m + 1);
          int n = 0xFF & arrayOfByte2[m];
          int i1 = paramha.b(n);
          if (i1 < 0)
            i1 = a(paramha, n, 1);
          int i2 = i1 | k << 6;
          if (this.f >= this.g)
            D();
          byte[] arrayOfByte3 = this.N;
          int i3 = this.f;
          this.f = (i3 + 1);
          int i4 = 0xFF & arrayOfByte3[i3];
          int i5 = paramha.b(i4);
          if (i5 < 0)
          {
            if (i5 != -2)
            {
              if ((i4 == 34) && (!paramha.a()))
              {
                localsj.a(i2 >> 4);
                return localsj.b();
              }
              i5 = a(paramha, i4, 2);
            }
            if (i5 == -2)
            {
              if (this.f >= this.g)
                D();
              byte[] arrayOfByte5 = this.N;
              int i10 = this.f;
              this.f = (i10 + 1);
              int i11 = 0xFF & arrayOfByte5[i10];
              if (!paramha.a(i11))
                throw a(paramha, i11, 3, "expected padding character '" + paramha.b() + "'");
              localsj.a(i2 >> 4);
            }
          }
          else
          {
            int i6 = i5 | i2 << 6;
            if (this.f >= this.g)
              D();
            byte[] arrayOfByte4 = this.N;
            int i7 = this.f;
            this.f = (i7 + 1);
            int i8 = 0xFF & arrayOfByte4[i7];
            int i9 = paramha.b(i8);
            if (i9 < 0)
            {
              if (i9 != -2)
              {
                if ((i8 == 34) && (!paramha.a()))
                {
                  localsj.b(i6 >> 2);
                  return localsj.b();
                }
                i9 = a(paramha, i8, 3);
              }
              if (i9 == -2)
                localsj.b(i6 >> 2);
            }
            else
            {
              localsj.c(i9 | i6 << 6);
            }
          }
        }
      }
    }
  }

  public final void close()
  {
    super.close();
    this.J.b();
  }

  protected final hm d(int paramInt)
  {
    int i = 1;
    char[] arrayOfChar = this.p.k();
    if (paramInt == 45);
    int k;
    boolean bool;
    for (int j = i; ; bool = false)
    {
      if (j == 0)
        break label305;
      arrayOfChar[0] = '-';
      if (this.f >= this.g)
        D();
      byte[] arrayOfByte2 = this.N;
      int i6 = this.f;
      this.f = (i6 + 1);
      k = 0xFF & arrayOfByte2[i6];
      if ((k >= 48) && (k <= 57))
        break;
      return a(k, i);
    }
    label305: int n;
    for (int m = i; ; n = 0)
    {
      if (k == 48)
        k = ad();
      int i1 = m + 1;
      arrayOfChar[m] = ((char)k);
      int i2 = this.f + arrayOfChar.length;
      if (i2 > this.g)
        i2 = this.g;
      int i4;
      while (true)
      {
        if (this.f >= i2)
          return a(arrayOfChar, i1, bool, i);
        byte[] arrayOfByte1 = this.N;
        int i3 = this.f;
        this.f = (i3 + 1);
        i4 = 0xFF & arrayOfByte1[i3];
        if ((i4 < 48) || (i4 > 57))
          break;
        i++;
        int i5 = i1 + 1;
        arrayOfChar[i1] = ((char)i4);
        i1 = i5;
      }
      if ((i4 == 46) || (i4 == 101) || (i4 == 69))
        return a(arrayOfChar, i1, i4, bool, i);
      this.f = (-1 + this.f);
      this.p.a(i1);
      return a(bool, i);
      k = paramInt;
    }
  }

  protected final sc e(int paramInt)
  {
    if (paramInt != 34)
      return g(paramInt);
    if (9 + this.f > this.g)
      return V();
    byte[] arrayOfByte = this.N;
    int[] arrayOfInt = Q;
    int i = this.f;
    this.f = (i + 1);
    int j = 0xFF & arrayOfByte[i];
    if (arrayOfInt[j] == 0)
    {
      int k = this.f;
      this.f = (k + 1);
      int m = 0xFF & arrayOfByte[k];
      if (arrayOfInt[m] == 0)
      {
        int n = m | j << 8;
        int i1 = this.f;
        this.f = (i1 + 1);
        int i2 = 0xFF & arrayOfByte[i1];
        if (arrayOfInt[i2] == 0)
        {
          int i3 = i2 | n << 8;
          int i4 = this.f;
          this.f = (i4 + 1);
          int i5 = 0xFF & arrayOfByte[i4];
          if (arrayOfInt[i5] == 0)
          {
            int i6 = i5 | i3 << 8;
            int i7 = this.f;
            this.f = (i7 + 1);
            int i8 = 0xFF & arrayOfByte[i7];
            if (arrayOfInt[i8] == 0)
            {
              this.R = i6;
              return a(i8, arrayOfInt);
            }
            if (i8 == 34)
              return b(i6, 4);
            return a(i6, i8, 4);
          }
          if (i5 == 34)
            return b(i3, 3);
          return a(i3, i5, 3);
        }
        if (i2 == 34)
          return b(n, 2);
        return a(n, i2, 2);
      }
      if (m == 34)
        return b(j, 1);
      return a(j, m, 1);
    }
    if (j == 34)
      return sa.e();
    return a(0, j, 0);
  }

  protected final sc f(int paramInt)
  {
    int[] arrayOfInt1 = Q;
    int i = 2;
    int j = paramInt;
    while (true)
    {
      if (this.g - this.f < 4)
        return a(this.K, i, 0, j, 0);
      byte[] arrayOfByte1 = this.N;
      int k = this.f;
      this.f = (k + 1);
      int m = 0xFF & arrayOfByte1[k];
      if (arrayOfInt1[m] != 0)
      {
        if (m == 34)
          return a(this.K, i, j, 1);
        return a(this.K, i, j, m, 1);
      }
      int n = m | j << 8;
      byte[] arrayOfByte2 = this.N;
      int i1 = this.f;
      this.f = (i1 + 1);
      int i2 = 0xFF & arrayOfByte2[i1];
      if (arrayOfInt1[i2] != 0)
      {
        if (i2 == 34)
          return a(this.K, i, n, 2);
        return a(this.K, i, n, i2, 2);
      }
      int i3 = i2 | n << 8;
      byte[] arrayOfByte3 = this.N;
      int i4 = this.f;
      this.f = (i4 + 1);
      int i5 = 0xFF & arrayOfByte3[i4];
      if (arrayOfInt1[i5] != 0)
      {
        if (i5 == 34)
          return a(this.K, i, i3, 3);
        return a(this.K, i, i3, i5, 3);
      }
      int i6 = i5 | i3 << 8;
      byte[] arrayOfByte4 = this.N;
      int i7 = this.f;
      this.f = (i7 + 1);
      j = 0xFF & arrayOfByte4[i7];
      if (arrayOfInt1[j] != 0)
      {
        if (j == 34)
          return a(this.K, i, i6, 4);
        return a(this.K, i, i6, j, 4);
      }
      if (i >= this.K.length)
        this.K = a(this.K, i);
      int[] arrayOfInt2 = this.K;
      int i8 = i + 1;
      arrayOfInt2[i] = i6;
      i = i8;
    }
  }

  protected final sc g(int paramInt)
  {
    if ((paramInt == 39) && (a(hj.a.d)))
      return W();
    if (!a(hj.a.c))
      b(paramInt, "was expecting double-quote to start field name");
    int[] arrayOfInt1 = sk.d();
    if (arrayOfInt1[paramInt] != 0)
      b(paramInt, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
    int[] arrayOfInt2 = this.K;
    int i = 0;
    int j = 0;
    int k = paramInt;
    int m = 0;
    Object localObject1 = arrayOfInt2;
    int i2;
    int i3;
    Object localObject2;
    int i1;
    if (i < 4)
    {
      int i6 = i + 1;
      i2 = k | j << 8;
      i3 = m;
      localObject2 = localObject1;
      i1 = i6;
    }
    while (true)
    {
      if ((this.f >= this.g) && (!E()))
        c(" in field name");
      int i4 = 0xFF & this.N[this.f];
      if (arrayOfInt1[i4] != 0)
        break label245;
      this.f = (1 + this.f);
      j = i2;
      i = i1;
      localObject1 = localObject2;
      m = i3;
      k = i4;
      break;
      if (m >= localObject1.length)
      {
        localObject1 = a((int[])localObject1, localObject1.length);
        this.K = ((int[])localObject1);
      }
      int n = m + 1;
      localObject1[m] = j;
      localObject2 = localObject1;
      i1 = 1;
      i2 = k;
      i3 = n;
    }
    label245: if (i1 > 0)
    {
      if (i3 >= localObject2.length)
      {
        localObject2 = a((int[])localObject2, localObject2.length);
        this.K = ((int[])localObject2);
      }
      int i5 = i3 + 1;
      localObject2[i3] = i2;
      i3 = i5;
    }
    sc localsc = this.J.a((int[])localObject2, i3);
    if (localsc == null)
      return a((int[])localObject2, i3, i1);
    return localsc;
  }

  protected final hm h(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 39:
    case 78:
      while (true)
      {
        b(paramInt, "expected a valid value (number, String, array, object, 'true', 'false' or 'null')");
        return null;
        if (a(hj.a.d))
        {
          return Z();
          a("NaN", 1);
          if (a(hj.a.h))
            return a("NaN", (0.0D / 0.0D));
          d("Non-standard token 'NaN': enable JsonParser.Feature.ALLOW_NON_NUMERIC_NUMBERS to allow");
        }
      }
    case 43:
    }
    if ((this.f >= this.g) && (!E()))
      T();
    byte[] arrayOfByte = this.N;
    int i = this.f;
    this.f = (i + 1);
    return a(0xFF & arrayOfByte[i], false);
  }

  protected final int i(int paramInt)
  {
    int i;
    if (paramInt < 0)
    {
      if ((paramInt & 0xE0) != 192)
        break label147;
      paramInt &= 31;
      i = 1;
    }
    while (true)
    {
      int j = aj();
      if ((j & 0xC0) != 128)
        l(j & 0xFF);
      paramInt = paramInt << 6 | j & 0x3F;
      if (i > 1)
      {
        int k = aj();
        if ((k & 0xC0) != 128)
          l(k & 0xFF);
        paramInt = paramInt << 6 | k & 0x3F;
        if (i > 2)
        {
          int m = aj();
          if ((m & 0xC0) != 128)
            l(m & 0xFF);
          paramInt = paramInt << 6 | m & 0x3F;
        }
      }
      return paramInt;
      label147: if ((paramInt & 0xF0) == 224)
      {
        paramInt &= 15;
        i = 2;
      }
      else if ((paramInt & 0xF8) == 240)
      {
        paramInt &= 7;
        i = 3;
      }
      else
      {
        k(paramInt & 0xFF);
        i = 1;
      }
    }
  }

  protected final void j(int paramInt)
  {
    if (paramInt < 32)
      b(paramInt);
    k(paramInt);
  }

  public final String k()
  {
    hm localhm = this.b;
    if (localhm == hm.h)
    {
      if (this.L)
      {
        this.L = false;
        X();
      }
      return this.p.f();
    }
    return a(localhm);
  }

  protected final void k(int paramInt)
  {
    d("Invalid UTF-8 start byte 0x" + Integer.toHexString(paramInt));
  }

  protected final void l(int paramInt)
  {
    d("Invalid UTF-8 middle byte 0x" + Integer.toHexString(paramInt));
  }

  public final char[] l()
  {
    if (this.b != null)
    {
      switch (1.a[this.b.ordinal()])
      {
      default:
        return this.b.b();
      case 1:
        String str;
        int i;
        if (!this.r)
        {
          str = this.n.h();
          i = str.length();
          if (this.q != null)
            break label116;
          this.q = this.d.a(i);
        }
        while (true)
        {
          str.getChars(0, i, this.q, 0);
          this.r = true;
          return this.q;
          if (this.q.length < i)
            this.q = new char[i];
        }
      case 2:
        label116: if (this.L)
        {
          this.L = false;
          X();
        }
        break;
      case 3:
      case 4:
      }
      return this.p.e();
    }
    return null;
  }

  public final int m()
  {
    hm localhm = this.b;
    int i = 0;
    if (localhm != null);
    switch (1.a[this.b.ordinal()])
    {
    default:
      i = this.b.b().length;
      return i;
    case 1:
      return this.n.h().length();
    case 2:
      if (this.L)
      {
        this.L = false;
        X();
      }
      break;
    case 3:
    case 4:
    }
    return this.p.c();
  }

  public final int n()
  {
    if (this.b != null);
    switch (1.a[this.b.ordinal()])
    {
    case 1:
    default:
      return 0;
    case 2:
      if (this.L)
      {
        this.L = false;
        X();
      }
      break;
    case 3:
    case 4:
    }
    return this.p.d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ia
 * JD-Core Version:    0.6.2
 */