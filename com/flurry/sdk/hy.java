package com.flurry.sdk;

import java.io.IOException;
import java.io.Reader;

public final class hy extends hu
{
  protected Reader I;
  protected char[] J;
  protected hn K;
  protected final sb L;
  protected boolean M = false;

  public hy(ie paramie, int paramInt, Reader paramReader, hn paramhn, sb paramsb)
  {
    super(paramie, paramInt);
    this.I = paramReader;
    this.J = paramie.g();
    this.K = paramhn;
    this.L = paramsb;
  }

  private final hm a(boolean paramBoolean)
  {
    char[] arrayOfChar1 = this.p.k();
    if (paramBoolean)
      arrayOfChar1[0] = '-';
    for (int i = 1; ; i = 0)
    {
      int j;
      int k;
      char[] arrayOfChar2;
      int n;
      label84: int i31;
      int i4;
      int i3;
      int i1;
      char[] arrayOfChar3;
      int i2;
      if (this.f < this.g)
      {
        char[] arrayOfChar12 = this.J;
        int i33 = this.f;
        this.f = (i33 + 1);
        j = arrayOfChar12[i33];
        if (j == 48)
          j = ad();
        k = 0;
        int m = j;
        arrayOfChar2 = arrayOfChar1;
        n = m;
        if ((n < 48) || (n > 57))
          break label882;
        k++;
        if (i >= arrayOfChar2.length)
        {
          arrayOfChar2 = this.p.m();
          i = 0;
        }
        i31 = i + 1;
        arrayOfChar2[i] = n;
        if ((this.f < this.g) || (E()))
          break label616;
        i4 = 1;
        i3 = 0;
        i1 = k;
        arrayOfChar3 = arrayOfChar2;
        i2 = i31;
      }
      while (true)
      {
        if (i1 == 0)
          b("Missing integer part (next char " + c(i3) + ")");
        char[] arrayOfChar9;
        int i25;
        int i26;
        int i27;
        int i5;
        label259: int i9;
        int i8;
        char[] arrayOfChar4;
        int i7;
        if (i3 == 46)
        {
          int i24 = i2 + 1;
          arrayOfChar3[i2] = i3;
          arrayOfChar9 = arrayOfChar3;
          i25 = i24;
          i26 = i3;
          i27 = 0;
          if ((this.f >= this.g) && (!E()))
          {
            i5 = 1;
            if (i27 == 0)
              a(i26, "Decimal point not followed by a digit");
            i9 = i27;
            i8 = i25;
            int i29 = i26;
            arrayOfChar4 = arrayOfChar9;
            i7 = i29;
          }
        }
        while (true)
        {
          int i10;
          int i11;
          label377: int i12;
          label411: int i14;
          char[] arrayOfChar5;
          int i15;
          label469: int i16;
          int i17;
          label477: int i18;
          int i20;
          int i19;
          if ((i7 == 101) || (i7 == 69))
          {
            if (i8 >= arrayOfChar4.length)
            {
              arrayOfChar4 = this.p.m();
              i8 = 0;
            }
            i10 = i8 + 1;
            arrayOfChar4[i8] = i7;
            if (this.f < this.g)
            {
              char[] arrayOfChar8 = this.J;
              int i23 = this.f;
              this.f = (i23 + 1);
              i11 = arrayOfChar8[i23];
              if ((i11 != 45) && (i11 != 43))
                break label810;
              if (i10 < arrayOfChar4.length)
                break label803;
              arrayOfChar4 = this.p.m();
              i12 = 0;
              int i13 = i12 + 1;
              arrayOfChar4[i12] = i11;
              if (this.f >= this.g)
                break label740;
              char[] arrayOfChar7 = this.J;
              int i22 = this.f;
              this.f = (i22 + 1);
              i14 = arrayOfChar7[i22];
              arrayOfChar5 = arrayOfChar4;
              i15 = 0;
              i16 = i14;
              i17 = i13;
              if ((i16 > 57) || (i16 < 48))
                break label788;
              i15++;
              if (i17 >= arrayOfChar5.length)
              {
                arrayOfChar5 = this.p.m();
                i17 = 0;
              }
              i13 = i17 + 1;
              arrayOfChar5[i17] = i16;
              if ((this.f < this.g) || (E()))
                break label758;
              i18 = i15;
              i20 = 1;
              i19 = i13;
              label556: if (i18 == 0)
                a(i16, "Exponent indicator not followed by a digit");
              label569: if (i20 == 0)
                this.f = (-1 + this.f);
              this.p.a(i19);
              return a(paramBoolean, i1, i9, i18);
              j = e("No digit following minus sign");
              break;
              label616: char[] arrayOfChar11 = this.J;
              int i32 = this.f;
              this.f = (i32 + 1);
              n = arrayOfChar11[i32];
              i = i31;
              break label84;
              char[] arrayOfChar10 = this.J;
              int i28 = this.f;
              this.f = (i28 + 1);
              i26 = arrayOfChar10[i28];
              if ((i26 < 48) || (i26 > 57))
                break label849;
              i27++;
              if (i25 < arrayOfChar9.length)
                break label842;
              arrayOfChar9 = this.p.m();
            }
          }
          label788: label803: label810: label842: for (int i30 = 0; ; i30 = i25)
          {
            i25 = i30 + 1;
            arrayOfChar9[i30] = i26;
            break;
            i11 = e("expected a digit for number exponent");
            break label377;
            label740: i14 = e("expected a digit for number exponent");
            arrayOfChar5 = arrayOfChar4;
            i15 = 0;
            break label469;
            label758: char[] arrayOfChar6 = this.J;
            int i21 = this.f;
            this.f = (i21 + 1);
            i14 = arrayOfChar6[i21];
            break label469;
            i18 = i15;
            i19 = i17;
            i20 = i5;
            break label556;
            i12 = i10;
            break label411;
            i16 = i11;
            i17 = i10;
            arrayOfChar5 = arrayOfChar4;
            i15 = 0;
            break label477;
            i19 = i8;
            i20 = i5;
            i18 = 0;
            break label569;
          }
          label849: i5 = i4;
          break label259;
          i5 = i4;
          arrayOfChar4 = arrayOfChar3;
          int i6 = i2;
          i7 = i3;
          i8 = i6;
          i9 = 0;
        }
        label882: i1 = k;
        i2 = i;
        i3 = n;
        arrayOfChar3 = arrayOfChar2;
        i4 = 0;
      }
    }
  }

  private String a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.p.a(this.J, paramInt1, this.f - paramInt1);
    char[] arrayOfChar1 = this.p.j();
    int i = this.p.l();
    while (true)
    {
      if ((this.f >= this.g) && (!E()))
        c(": was expecting closing '" + (char)paramInt3 + "' for name");
      char[] arrayOfChar2 = this.J;
      int j = this.f;
      this.f = (j + 1);
      int k = arrayOfChar2[j];
      if (k <= 92)
        if (k != 92);
      int n;
      for (int m = Q(); ; m = k)
      {
        paramInt2 = k + paramInt2 * 31;
        n = i + 1;
        arrayOfChar1[i] = m;
        if (n < arrayOfChar1.length)
          break label259;
        arrayOfChar1 = this.p.m();
        i = 0;
        break;
        if (k <= paramInt3)
        {
          if (k == paramInt3)
            break label208;
          if (k < 32)
            c(k, "name");
        }
      }
      label208: this.p.a(i);
      sp localsp = this.p;
      char[] arrayOfChar3 = localsp.e();
      int i1 = localsp.d();
      int i2 = localsp.c();
      return this.L.a(arrayOfChar3, i1, i2, paramInt2);
      label259: i = n;
    }
  }

  private String a(int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    this.p.a(this.J, paramInt1, this.f - paramInt1);
    char[] arrayOfChar1 = this.p.j();
    int i = this.p.l();
    int j = paramArrayOfInt.length;
    while (true)
    {
      int k;
      if ((this.f < this.g) || (E()))
      {
        k = this.J[this.f];
        if (k > j)
          break label134;
        if (paramArrayOfInt[k] == 0)
          break label142;
      }
      label134: 
      while (!Character.isJavaIdentifierPart(k))
      {
        this.p.a(i);
        sp localsp = this.p;
        char[] arrayOfChar2 = localsp.e();
        int n = localsp.d();
        int i1 = localsp.c();
        return this.L.a(arrayOfChar2, n, i1, paramInt2);
      }
      label142: this.f = (1 + this.f);
      paramInt2 = k + paramInt2 * 31;
      int m = i + 1;
      arrayOfChar1[i] = k;
      if (m >= arrayOfChar1.length)
      {
        arrayOfChar1 = this.p.m();
        i = 0;
      }
      else
      {
        i = m;
      }
    }
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

  private final char ad()
  {
    if ((this.f >= this.g) && (!E()));
    char c;
    do
    {
      c = '0';
      while ((this.f >= this.g) && (!E()))
        do
        {
          return c;
          c = this.J[this.f];
          if ((c < '0') || (c > '9'))
            return '0';
          if (!a(hj.a.g))
            b("Leading zeroes not allowed");
          this.f = (1 + this.f);
        }
        while (c != '0');
      c = this.J[this.f];
      if ((c < '0') || (c > '9'))
        return '0';
      this.f = (1 + this.f);
    }
    while (c == '0');
    return c;
  }

  private final int ae()
  {
    while ((this.f < this.g) || (E()))
    {
      char[] arrayOfChar = this.J;
      int i = this.f;
      this.f = (i + 1);
      int j = arrayOfChar[i];
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
      char[] arrayOfChar = this.J;
      int i = this.f;
      this.f = (i + 1);
      j = arrayOfChar[i];
      if (j > 32)
      {
        if (j != 47)
          break label110;
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
    int j = -1;
    label110: return j;
  }

  private final void ag()
  {
    if (!a(hj.a.b))
      b(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
    if ((this.f >= this.g) && (!E()))
      c(" in a comment");
    char[] arrayOfChar = this.J;
    int i = this.f;
    this.f = (i + 1);
    int j = arrayOfChar[i];
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
    while ((this.f < this.g) || (E()))
    {
      char[] arrayOfChar = this.J;
      int i = this.f;
      this.f = (i + 1);
      int j = arrayOfChar[i];
      if (j <= 42)
        if (j == 42)
        {
          if ((this.f >= this.g) && (!E()))
            break;
          if (this.J[this.f] == '/')
            this.f = (1 + this.f);
        }
        else if (j < 32)
        {
          if (j == 10)
            ab();
          else if (j == 13)
            aa();
          else if (j != 9)
            b(j);
        }
    }
    c(" in a comment");
  }

  private final void ai()
  {
    while (true)
    {
      int j;
      if ((this.f < this.g) || (E()))
      {
        char[] arrayOfChar = this.J;
        int i = this.f;
        this.f = (i + 1);
        j = arrayOfChar[i];
        if (j < 32)
          if (j == 10)
            ab();
      }
      else
      {
        return;
        if (j == 13)
        {
          aa();
          return;
        }
        if (j != 9)
          b(j);
      }
    }
  }

  protected final boolean E()
  {
    this.h += this.g;
    this.j -= this.g;
    Reader localReader = this.I;
    boolean bool = false;
    int i;
    if (localReader != null)
    {
      i = this.I.read(this.J, 0, this.J.length);
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
    throw new IOException("Reader returned 0 characters when trying to read " + this.g);
  }

  protected final void F()
  {
    if (this.I != null)
    {
      if ((this.d.c()) || (a(hj.a.a)))
        this.I.close();
      this.I = null;
    }
  }

  protected final void G()
  {
    super.G();
    char[] arrayOfChar = this.J;
    if (arrayOfChar != null)
    {
      this.J = null;
      this.d.a(arrayOfChar);
    }
  }

  protected final char Q()
  {
    int i = 0;
    if ((this.f >= this.g) && (!E()))
      c(" in character escape sequence");
    char[] arrayOfChar1 = this.J;
    int j = this.f;
    this.f = (j + 1);
    char c = arrayOfChar1[j];
    switch (c)
    {
    default:
      c = a(c);
    case '"':
    case '/':
    case '\\':
      return c;
    case 'b':
      return '\b';
    case 't':
      return '\t';
    case 'n':
      return '\n';
    case 'f':
      return '\f';
    case 'r':
      return '\r';
    case 'u':
    }
    for (int k = 0; k < 4; k++)
    {
      if ((this.f >= this.g) && (!E()))
        c(" in character escape sequence");
      char[] arrayOfChar2 = this.J;
      int m = this.f;
      this.f = (m + 1);
      int n = arrayOfChar2[m];
      int i1 = sk.a(n);
      if (i1 < 0)
        b(n, "expected a hex-digit for character escape sequence");
      i = i1 | i << 4;
    }
    return (char)i;
  }

  protected final String V()
  {
    int i = this.f;
    int j = this.g;
    int k = 0;
    if (i < j)
    {
      int[] arrayOfInt = sk.a();
      int n = arrayOfInt.length;
      do
      {
        int i1 = this.J[i];
        if (i1 == 39)
        {
          int i2 = this.f;
          this.f = (i + 1);
          return this.L.a(this.J, i2, i - i2, k);
        }
        if ((i1 < n) && (arrayOfInt[i1] != 0))
          break;
        k = i1 + k * 31;
        i++;
      }
      while (i < j);
    }
    int m = this.f;
    this.f = i;
    return a(m, k, 39);
  }

  protected final hm W()
  {
    char[] arrayOfChar1 = this.p.k();
    int i = this.p.l();
    if ((this.f >= this.g) && (!E()))
      c(": was expecting closing quote for a string value");
    char[] arrayOfChar2 = this.J;
    int j = this.f;
    this.f = (j + 1);
    int k = arrayOfChar2[j];
    if (k <= 92)
    {
      if (k == 92)
        k = Q();
    }
    else
    {
      label86: if (i < arrayOfChar1.length)
        break label162;
      arrayOfChar1 = this.p.m();
    }
    label162: for (int m = 0; ; m = i)
    {
      i = m + 1;
      arrayOfChar1[m] = k;
      break;
      if (k > 39)
        break label86;
      if (k != 39)
      {
        if (k >= 32)
          break label86;
        c(k, "string value");
        break label86;
      }
      this.p.a(i);
      return hm.h;
    }
  }

  protected final void X()
  {
    int i = this.f;
    int j = this.g;
    if (i < j)
    {
      int[] arrayOfInt = sk.a();
      int k = arrayOfInt.length;
      do
      {
        int m = this.J[i];
        if ((m < k) && (arrayOfInt[m] != 0))
        {
          if (m != 34)
            break;
          this.p.a(this.J, this.f, i - this.f);
          this.f = (i + 1);
          return;
        }
        i++;
      }
      while (i < j);
    }
    this.p.b(this.J, this.f, i - this.f);
    this.f = i;
    Y();
  }

  protected final void Y()
  {
    char[] arrayOfChar1 = this.p.j();
    int i = this.p.l();
    if ((this.f >= this.g) && (!E()))
      c(": was expecting closing quote for a string value");
    char[] arrayOfChar2 = this.J;
    int j = this.f;
    this.f = (j + 1);
    int k = arrayOfChar2[j];
    if (k <= 92)
    {
      if (k == 92)
        k = Q();
    }
    else
    {
      label86: if (i < arrayOfChar1.length)
        break label159;
      arrayOfChar1 = this.p.m();
    }
    label159: for (int m = 0; ; m = i)
    {
      i = m + 1;
      arrayOfChar1[m] = k;
      break;
      if (k > 34)
        break label86;
      if (k != 34)
      {
        if (k >= 32)
          break label86;
        c(k, "string value");
        break label86;
      }
      this.p.a(i);
      return;
    }
  }

  protected final void Z()
  {
    this.M = false;
    int i = this.f;
    int j = this.g;
    char[] arrayOfChar = this.J;
    while (true)
    {
      if (i >= j)
      {
        this.f = i;
        if (!E())
          c(": was expecting closing quote for a string value");
        i = this.f;
        j = this.g;
      }
      int k = i + 1;
      int m = arrayOfChar[i];
      if (m <= 92)
      {
        if (m == 92)
        {
          this.f = k;
          Q();
          i = this.f;
          j = this.g;
        }
        else if (m <= 34)
        {
          if (m == 34)
          {
            this.f = k;
            return;
          }
          if (m < 32)
          {
            this.f = k;
            c(m, "string value");
          }
        }
      }
      else
        i = k;
    }
  }

  protected final hm a(int paramInt, boolean paramBoolean)
  {
    double d = (-1.0D / 0.0D);
    if (paramInt == 73)
    {
      if ((this.f >= this.g) && (!E()))
        T();
      char[] arrayOfChar = this.J;
      int i = this.f;
      this.f = (i + 1);
      paramInt = arrayOfChar[i];
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
    return this.K;
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

  protected final void a(String paramString, int paramInt)
  {
    int i = paramString.length();
    do
    {
      if ((this.f >= this.g) && (!E()))
        T();
      if (this.J[this.f] != paramString.charAt(paramInt))
        a(paramString.substring(0, paramInt), "'null', 'true', 'false' or NaN");
      this.f = (1 + this.f);
      paramInt++;
    }
    while (paramInt < i);
    if ((this.f >= this.g) && (!E()));
    char c;
    do
    {
      return;
      c = this.J[this.f];
    }
    while ((c < '0') || (c == ']') || (c == '}') || (!Character.isJavaIdentifierPart(c)));
    this.f = (1 + this.f);
    a(paramString.substring(0, paramInt), "'null', 'true', 'false' or NaN");
  }

  protected final void a(String paramString1, String paramString2)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString1);
    while ((this.f < this.g) || (E()))
    {
      char c = this.J[this.f];
      if (!Character.isJavaIdentifierPart(c))
        break;
      this.f = (1 + this.f);
      localStringBuilder.append(c);
    }
    d("Unrecognized token '" + localStringBuilder.toString() + "': was expecting ");
  }

  public final byte[] a(ha paramha)
  {
    if ((this.b != hm.h) && ((this.b != hm.g) || (this.t == null)))
      d("Current token (" + this.b + ") not VALUE_STRING or VALUE_EMBEDDED_OBJECT, can not access as binary");
    if (this.M);
    while (true)
    {
      try
      {
        this.t = b(paramha);
        this.M = false;
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
    if (((this.f < this.g) || (E())) && (this.J[this.f] == '\n'))
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
    if (this.M)
      Z();
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
    boolean bool = this.n.c();
    if (bool)
    {
      String str = e(i);
      this.n.a(str);
      this.b = hm.f;
      int j = ae();
      if (j != 58)
        b(j, "was expecting a colon to separate field name and value");
      i = ae();
    }
    hm localhm1;
    switch (i)
    {
    default:
      localhm1 = g(i);
    case 34:
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
    while (bool)
    {
      this.o = localhm1;
      return this.b;
      this.M = true;
      localhm1 = hm.h;
      continue;
      if (!bool)
        this.n = this.n.b(this.l, this.m);
      localhm1 = hm.d;
      continue;
      if (!bool)
        this.n = this.n.c(this.l, this.m);
      localhm1 = hm.b;
      continue;
      b(i, "expected a value");
      a("true", 1);
      localhm1 = hm.k;
      continue;
      a("false", 1);
      localhm1 = hm.l;
      continue;
      a("null", 1);
      localhm1 = hm.m;
      continue;
      localhm1 = d(i);
    }
    this.b = localhm1;
    return localhm1;
  }

  protected final byte[] b(ha paramha)
  {
    sj localsj = I();
    while (true)
    {
      if (this.f >= this.g)
        D();
      char[] arrayOfChar1 = this.J;
      int i = this.f;
      this.f = (i + 1);
      char c1 = arrayOfChar1[i];
      if (c1 > ' ')
      {
        int j = paramha.b(c1);
        if (j < 0)
        {
          if (c1 == '"')
            return localsj.b();
          j = a(paramha, c1, 0);
          if (j < 0);
        }
        else
        {
          if (this.f >= this.g)
            D();
          char[] arrayOfChar2 = this.J;
          int k = this.f;
          this.f = (k + 1);
          char c2 = arrayOfChar2[k];
          int m = paramha.b(c2);
          if (m < 0)
            m = a(paramha, c2, 1);
          int n = m | j << 6;
          if (this.f >= this.g)
            D();
          char[] arrayOfChar3 = this.J;
          int i1 = this.f;
          this.f = (i1 + 1);
          char c3 = arrayOfChar3[i1];
          int i2 = paramha.b(c3);
          if (i2 < 0)
          {
            if (i2 != -2)
            {
              if ((c3 == '"') && (!paramha.a()))
              {
                localsj.a(n >> 4);
                return localsj.b();
              }
              i2 = a(paramha, c3, 2);
            }
            if (i2 == -2)
            {
              if (this.f >= this.g)
                D();
              char[] arrayOfChar5 = this.J;
              int i6 = this.f;
              this.f = (i6 + 1);
              char c5 = arrayOfChar5[i6];
              if (!paramha.a(c5))
                throw a(paramha, c5, 3, "expected padding character '" + paramha.b() + "'");
              localsj.a(n >> 4);
            }
          }
          else
          {
            int i3 = i2 | n << 6;
            if (this.f >= this.g)
              D();
            char[] arrayOfChar4 = this.J;
            int i4 = this.f;
            this.f = (i4 + 1);
            char c4 = arrayOfChar4[i4];
            int i5 = paramha.b(c4);
            if (i5 < 0)
            {
              if (i5 != -2)
              {
                if ((c4 == '"') && (!paramha.a()))
                {
                  localsj.b(i3 >> 2);
                  return localsj.b();
                }
                i5 = a(paramha, c4, 3);
              }
              if (i5 == -2)
                localsj.b(i3 >> 2);
            }
            else
            {
              localsj.c(i5 | i3 << 6);
            }
          }
        }
      }
    }
  }

  public final void close()
  {
    super.close();
    this.L.b();
  }

  protected final hm d(int paramInt)
  {
    int i = 1;
    int j = 0;
    if (paramInt == 45);
    int m;
    int n;
    int i1;
    boolean bool;
    for (int k = i; ; bool = false)
    {
      m = this.f;
      n = m - 1;
      i1 = this.g;
      if (k == 0)
        break;
      if (m >= this.g)
        break label438;
      char[] arrayOfChar6 = this.J;
      i2 = m + 1;
      paramInt = arrayOfChar6[m];
      if ((paramInt <= 57) && (paramInt >= 48))
        break label98;
      this.f = i2;
      return a(paramInt, i);
    }
    int i2 = m;
    label98: int i4;
    int i5;
    int i19;
    int i7;
    int i6;
    if (paramInt != 48)
      while (i2 < this.g)
      {
        char[] arrayOfChar1 = this.J;
        i4 = i2 + 1;
        i5 = arrayOfChar1[i2];
        if ((i5 >= 48) && (i5 <= 57))
        {
          i++;
          i2 = i4;
        }
        else
        {
          if (i5 != 46)
            break label482;
          int i15 = 0;
          int i16 = i4;
          while (i16 < i1)
          {
            char[] arrayOfChar5 = this.J;
            int i17 = i16 + 1;
            int i18 = arrayOfChar5[i16];
            if ((i18 >= 48) && (i18 <= 57))
            {
              i15++;
              i16 = i17;
            }
            else
            {
              if (i15 == 0)
                a(i18, "Decimal point not followed by a digit");
              i19 = i15;
              i7 = i17;
              i6 = i18;
            }
          }
        }
      }
    for (int i8 = i19; ; i8 = 0)
    {
      int i11;
      int i12;
      int i13;
      if (i6 != 101)
      {
        j = 0;
        if (i6 != 69);
      }
      else
      {
        if (i7 >= i1)
          break label438;
        char[] arrayOfChar2 = this.J;
        i11 = i7 + 1;
        i12 = arrayOfChar2[i7];
        if ((i12 != 45) && (i12 != 43))
          break label469;
        if (i11 >= i1)
          break label438;
        char[] arrayOfChar3 = this.J;
        i7 = i11 + 1;
        i13 = arrayOfChar3[i11];
      }
      while (true)
        if ((i13 <= 57) && (i13 >= 48))
        {
          j++;
          if (i7 < i1)
          {
            char[] arrayOfChar4 = this.J;
            int i14 = i7 + 1;
            i13 = arrayOfChar4[i7];
            i7 = i14;
          }
        }
        else
        {
          if (j == 0)
            a(i13, "Exponent indicator not followed by a digit");
          int i9 = i7 - 1;
          this.f = i9;
          int i10 = i9 - n;
          this.p.a(this.J, n, i10);
          return a(bool, i, i8, j);
          label438: if (bool);
          for (int i3 = n + 1; ; i3 = n)
          {
            this.f = i3;
            return a(bool);
          }
          label469: i13 = i12;
          i7 = i11;
          j = 0;
        }
      label482: i6 = i5;
      i7 = i4;
    }
  }

  protected final char e(String paramString)
  {
    if ((this.f >= this.g) && (!E()))
      c(paramString);
    char[] arrayOfChar = this.J;
    int i = this.f;
    this.f = (i + 1);
    return arrayOfChar[i];
  }

  protected final String e(int paramInt)
  {
    if (paramInt != 34)
      return f(paramInt);
    int i = this.f;
    int j = this.g;
    int k = 0;
    if (i < j)
    {
      int[] arrayOfInt = sk.a();
      int n = arrayOfInt.length;
      do
      {
        int i1 = this.J[i];
        if ((i1 < n) && (arrayOfInt[i1] != 0))
        {
          if (i1 != 34)
            break;
          int i2 = this.f;
          this.f = (i + 1);
          return this.L.a(this.J, i2, i - i2, k);
        }
        k = i1 + k * 31;
        i++;
      }
      while (i < j);
    }
    int m = this.f;
    this.f = i;
    return a(m, k, 34);
  }

  protected final String f(int paramInt)
  {
    if ((paramInt == 39) && (a(hj.a.d)))
      return V();
    if (!a(hj.a.c))
      b(paramInt, "was expecting double-quote to start field name");
    int[] arrayOfInt = sk.c();
    int i = arrayOfInt.length;
    boolean bool;
    int j;
    int k;
    int m;
    if (paramInt < i)
      if ((arrayOfInt[paramInt] == 0) && ((paramInt < 48) || (paramInt > 57)))
      {
        bool = true;
        if (!bool)
          b(paramInt, "was expecting either valid name character (for unquoted name) or double-quote (for quoted) to start field name");
        j = this.f;
        k = this.g;
        m = 0;
        if (j >= k)
          break label243;
      }
    label223: 
    do
    {
      int i1 = this.J[j];
      if (i1 < i)
      {
        if (arrayOfInt[i1] == 0)
          break label223;
        int i3 = -1 + this.f;
        this.f = j;
        return this.L.a(this.J, i3, j - i3, m);
        bool = false;
        break;
        bool = Character.isJavaIdentifierPart((char)paramInt);
        break;
      }
      if (!Character.isJavaIdentifierPart(i1))
      {
        int i2 = -1 + this.f;
        this.f = j;
        return this.L.a(this.J, i2, j - i2, m);
      }
      m = i1 + m * 31;
      j++;
    }
    while (j < k);
    label243: int n = -1 + this.f;
    this.f = j;
    return a(n, m, arrayOfInt);
  }

  protected final hm g(int paramInt)
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
          return W();
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
    char[] arrayOfChar = this.J;
    int i = this.f;
    this.f = (i + 1);
    return a(arrayOfChar[i], false);
  }

  public final String k()
  {
    hm localhm = this.b;
    if (localhm == hm.h)
    {
      if (this.M)
      {
        this.M = false;
        X();
      }
      return this.p.f();
    }
    return a(localhm);
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
        label116: if (this.M)
        {
          this.M = false;
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
      if (this.M)
      {
        this.M = false;
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
      if (this.M)
      {
        this.M = false;
        X();
      }
      break;
    case 3:
    case 4:
    }
    return this.p.d();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.hy
 * JD-Core Version:    0.6.2
 */