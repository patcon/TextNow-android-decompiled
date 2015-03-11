package com.flurry.sdk;

import java.lang.ref.SoftReference;

public final class ig
{
  protected static final ThreadLocal<SoftReference<ig>> a = new ThreadLocal();
  private static final char[] e = sk.g();
  private static final byte[] f = sk.h();
  protected sp b;
  protected sj c;
  protected final char[] d = new char[6];

  public ig()
  {
    this.d[0] = '\\';
    this.d[2] = '0';
    this.d[3] = '0';
  }

  private int a(int paramInt1, int paramInt2)
  {
    if ((paramInt2 < 56320) || (paramInt2 > 57343))
      throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(paramInt1) + ", second 0x" + Integer.toHexString(paramInt2) + "; illegal combination");
    return 65536 + (paramInt1 - 55296 << 10) + (paramInt2 - 56320);
  }

  private int a(int paramInt1, int paramInt2, sj paramsj, int paramInt3)
  {
    paramsj.e(paramInt3);
    paramsj.a(92);
    if (paramInt2 < 0)
    {
      paramsj.a(117);
      if (paramInt1 > 255)
      {
        int i = paramInt1 >> 8;
        paramsj.a(f[(i >> 4)]);
        paramsj.a(f[(i & 0xF)]);
        paramInt1 &= 255;
        paramsj.a(f[(paramInt1 >> 4)]);
        paramsj.a(f[(paramInt1 & 0xF)]);
      }
    }
    while (true)
    {
      return paramsj.f();
      paramsj.a(48);
      paramsj.a(48);
      break;
      paramsj.a((byte)paramInt2);
    }
  }

  private int a(int paramInt, char[] paramArrayOfChar)
  {
    if (paramInt < 0)
    {
      int i = -(paramInt + 1);
      paramArrayOfChar[1] = 'u';
      paramArrayOfChar[4] = e[(i >> 4)];
      paramArrayOfChar[5] = e[(i & 0xF)];
      return 6;
    }
    paramArrayOfChar[1] = ((char)paramInt);
    return 2;
  }

  public static ig a()
  {
    SoftReference localSoftReference = (SoftReference)a.get();
    if (localSoftReference == null);
    for (ig localig = null; ; localig = (ig)localSoftReference.get())
    {
      if (localig == null)
      {
        localig = new ig();
        a.set(new SoftReference(localig));
      }
      return localig;
    }
  }

  private void a(int paramInt)
  {
    if (paramInt > 1114111)
      throw new IllegalArgumentException("Illegal character point (0x" + Integer.toHexString(paramInt) + ") to output; max is 0x10FFFF as per RFC 4627");
    if (paramInt >= 55296)
    {
      if (paramInt <= 56319)
        throw new IllegalArgumentException("Unmatched first part of surrogate pair (0x" + Integer.toHexString(paramInt) + ")");
      throw new IllegalArgumentException("Unmatched second part of surrogate pair (0x" + Integer.toHexString(paramInt) + ")");
    }
    throw new IllegalArgumentException("Illegal character point (0x" + Integer.toHexString(paramInt) + ") to output");
  }

  public final char[] a(String paramString)
  {
    sp localsp = this.b;
    if (localsp == null)
    {
      localsp = new sp(null);
      this.b = localsp;
    }
    char[] arrayOfChar = localsp.k();
    int[] arrayOfInt = sk.f();
    int i = arrayOfInt.length;
    int j = paramString.length();
    int k = 0;
    int m = 0;
    label57: int n;
    if (m < j)
    {
      n = paramString.charAt(m);
      if ((n < i) && (arrayOfInt[n] != 0))
        break label128;
      if (k < arrayOfChar.length)
        break label255;
      arrayOfChar = localsp.m();
    }
    label128: label255: for (int i1 = 0; ; i1 = k)
    {
      k = i1 + 1;
      arrayOfChar[i1] = n;
      m++;
      if (m < j)
        break label57;
      localsp.a(k);
      return localsp.g();
      int i2 = m + 1;
      int i3 = a(arrayOfInt[paramString.charAt(m)], this.d);
      if (k + i3 > arrayOfChar.length)
      {
        int i4 = arrayOfChar.length - k;
        if (i4 > 0)
          System.arraycopy(this.d, 0, arrayOfChar, k, i4);
        arrayOfChar = localsp.m();
        int i5 = i3 - i4;
        System.arraycopy(this.d, i4, arrayOfChar, k, i5);
        k += i5;
        m = i2;
        break;
      }
      System.arraycopy(this.d, 0, arrayOfChar, k, i3);
      k += i3;
      m = i2;
      break;
    }
  }

  public final byte[] b(String paramString)
  {
    sj localsj = this.c;
    if (localsj == null)
    {
      localsj = new sj(null);
      this.c = localsj;
    }
    int i = paramString.length();
    Object localObject1 = localsj.c();
    int j = 0;
    int k = 0;
    int[] arrayOfInt;
    label51: int m;
    if (k < i)
    {
      arrayOfInt = sk.f();
      m = paramString.charAt(k);
      if ((m > 127) || (arrayOfInt[m] != 0))
        break label124;
      if (j < localObject1.length)
        break label595;
      localObject1 = localsj.d();
    }
    label588: label595: for (int i16 = 0; ; i16 = j)
    {
      j = i16 + 1;
      localObject1[i16] = ((byte)m);
      k++;
      if (k < i)
        break label51;
      return this.c.d(j);
      label124: if (j >= localObject1.length)
      {
        localObject1 = localsj.d();
        j = 0;
      }
      int n = k + 1;
      int i1 = paramString.charAt(k);
      if (i1 <= 127)
      {
        j = a(i1, arrayOfInt[i1], localsj, j);
        localObject1 = localsj.e();
        k = n;
        break;
      }
      int i4;
      Object localObject2;
      int i6;
      if (i1 <= 2047)
      {
        i4 = j + 1;
        localObject1[j] = ((byte)(0xC0 | i1 >> 6));
        int i15 = 0x80 | i1 & 0x3F;
        localObject2 = localObject1;
        i6 = i15;
        if (i4 >= localObject2.length)
        {
          localObject2 = localsj.d();
          i4 = 0;
        }
        int i7 = i4 + 1;
        localObject2[i4] = ((byte)i6);
        localObject1 = localObject2;
        k = n;
        j = i7;
        break;
      }
      int i2;
      if ((i1 < 55296) || (i1 > 57343))
      {
        i2 = j + 1;
        localObject1[j] = ((byte)(0xE0 | i1 >> 12));
        if (i2 < localObject1.length)
          break label588;
        localObject1 = localsj.d();
      }
      for (int i3 = 0; ; i3 = i2)
      {
        i4 = i3 + 1;
        localObject1[i3] = ((byte)(0x80 | 0x3F & i1 >> 6));
        int i5 = 0x80 | i1 & 0x3F;
        localObject2 = localObject1;
        i6 = i5;
        break;
        if (i1 > 56319)
          a(i1);
        if (n >= i)
          a(i1);
        int i8 = n + 1;
        int i9 = a(i1, paramString.charAt(n));
        if (i9 > 1114111)
          a(i9);
        int i10 = j + 1;
        localObject1[j] = ((byte)(0xF0 | i9 >> 18));
        if (i10 >= localObject1.length)
          localObject1 = localsj.d();
        for (int i11 = 0; ; i11 = i10)
        {
          int i12 = i11 + 1;
          localObject1[i11] = ((byte)(0x80 | 0x3F & i9 >> 12));
          if (i12 >= localObject1.length)
            localObject1 = localsj.d();
          for (int i13 = 0; ; i13 = i12)
          {
            i4 = i13 + 1;
            localObject1[i13] = ((byte)(0x80 | 0x3F & i9 >> 6));
            int i14 = 0x80 | i9 & 0x3F;
            n = i8;
            Object localObject3 = localObject1;
            i6 = i14;
            localObject2 = localObject3;
            break;
          }
        }
      }
    }
  }

  public final byte[] c(String paramString)
  {
    sj localsj = this.c;
    if (localsj == null)
    {
      localsj = new sj(null);
      this.c = localsj;
    }
    int i = paramString.length();
    Object localObject1 = localsj.c();
    int j = localObject1.length;
    int k = 0;
    int m = 0;
    int i4;
    int i18;
    int i6;
    int i15;
    int i16;
    if (m < i)
    {
      int i1 = m + 1;
      int i2 = paramString.charAt(m);
      int i3 = j;
      Object localObject2 = localObject1;
      i4 = k;
      int i5 = i3;
      while (i2 <= 127)
      {
        if (i4 >= i5)
        {
          localObject2 = localsj.d();
          i5 = localObject2.length;
          i4 = 0;
        }
        i18 = i4 + 1;
        localObject2[i4] = ((byte)i2);
        if (i1 >= i)
          break label548;
        int i19 = i1 + 1;
        i2 = paramString.charAt(i1);
        i1 = i19;
        i4 = i18;
      }
      if (i4 >= i5)
      {
        localObject2 = localsj.d();
        i5 = localObject2.length;
        i6 = 0;
        int i9;
        int i10;
        if (i2 < 2048)
        {
          i9 = i6 + 1;
          localObject2[i6] = ((byte)(0xC0 | i2 >> 6));
          i10 = i2;
          m = i1;
        }
        while (true)
        {
          if (i9 >= i5)
          {
            localObject2 = localsj.d();
            i5 = localObject2.length;
            i9 = 0;
          }
          int i11 = i9 + 1;
          localObject2[i9] = ((byte)(0x80 | i10 & 0x3F));
          localObject1 = localObject2;
          j = i5;
          k = i11;
          break;
          if ((i2 < 55296) || (i2 > 57343))
          {
            int i7 = i6 + 1;
            localObject2[i6] = ((byte)(0xE0 | i2 >> 12));
            if (i7 >= i5)
            {
              localObject2 = localsj.d();
              i5 = localObject2.length;
              i7 = 0;
            }
            int i8 = i7 + 1;
            localObject2[i7] = ((byte)(0x80 | 0x3F & i2 >> 6));
            i9 = i8;
            i10 = i2;
            m = i1;
          }
          else
          {
            if (i2 > 56319)
              a(i2);
            if (i1 >= i)
              a(i2);
            int i12 = i1 + 1;
            int i13 = a(i2, paramString.charAt(i1));
            if (i13 > 1114111)
              a(i13);
            int i14 = i6 + 1;
            localObject2[i6] = ((byte)(0xF0 | i13 >> 18));
            if (i14 >= i5)
            {
              localObject2 = localsj.d();
              i5 = localObject2.length;
              i14 = 0;
            }
            i15 = i14 + 1;
            localObject2[i14] = ((byte)(0x80 | 0x3F & i13 >> 12));
            if (i15 < i5)
              break label562;
            localObject2 = localsj.d();
            i5 = localObject2.length;
            i16 = 0;
            label509: int i17 = i16 + 1;
            localObject2[i16] = ((byte)(0x80 | 0x3F & i13 >> 6));
            i9 = i17;
            i10 = i13;
            m = i12;
          }
        }
      }
    }
    label548: for (int n = i18; ; n = k)
    {
      return this.c.d(n);
      label562: i16 = i15;
      break label509;
      i6 = i4;
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ig
 * JD-Core Version:    0.6.2
 */