package com.flurry.sdk;

import java.util.Arrays;

public final class ha
{
  final String a;
  final boolean b;
  final char c;
  final int d;
  private final int[] e = new int[''];
  private final char[] f = new char[64];
  private final byte[] g = new byte[64];

  public ha(ha paramha, String paramString, int paramInt)
  {
    this(paramha, paramString, paramha.b, paramha.c, paramInt);
  }

  public ha(ha paramha, String paramString, boolean paramBoolean, char paramChar, int paramInt)
  {
    this.a = paramString;
    byte[] arrayOfByte = paramha.g;
    System.arraycopy(arrayOfByte, 0, this.g, 0, arrayOfByte.length);
    char[] arrayOfChar = paramha.f;
    System.arraycopy(arrayOfChar, 0, this.f, 0, arrayOfChar.length);
    int[] arrayOfInt = paramha.e;
    System.arraycopy(arrayOfInt, 0, this.e, 0, arrayOfInt.length);
    this.b = paramBoolean;
    this.c = paramChar;
    this.d = paramInt;
  }

  public ha(String paramString1, String paramString2, boolean paramBoolean, char paramChar, int paramInt)
  {
    this.a = paramString1;
    this.b = paramBoolean;
    this.c = paramChar;
    this.d = paramInt;
    int j = paramString2.length();
    if (j != 64)
      throw new IllegalArgumentException("Base64Alphabet length must be exactly 64 (was " + j + ")");
    paramString2.getChars(0, j, this.f, 0);
    Arrays.fill(this.e, -1);
    while (i < j)
    {
      int k = this.f[i];
      this.g[i] = ((byte)k);
      this.e[k] = i;
      i++;
    }
    if (paramBoolean)
      this.e[paramChar] = -2;
  }

  public final int a(int paramInt1, int paramInt2, byte[] paramArrayOfByte, int paramInt3)
  {
    int i = paramInt3 + 1;
    paramArrayOfByte[paramInt3] = this.g[(0x3F & paramInt1 >> 18)];
    int j = i + 1;
    paramArrayOfByte[i] = this.g[(0x3F & paramInt1 >> 12)];
    if (this.b)
    {
      int m = (byte)this.c;
      int n = j + 1;
      if (paramInt2 == 2);
      for (int i1 = this.g[(0x3F & paramInt1 >> 6)]; ; i1 = m)
      {
        paramArrayOfByte[j] = i1;
        int i2 = n + 1;
        paramArrayOfByte[n] = m;
        return i2;
      }
    }
    if (paramInt2 == 2)
    {
      int k = j + 1;
      paramArrayOfByte[j] = this.g[(0x3F & paramInt1 >> 6)];
      return k;
    }
    return j;
  }

  public final int a(int paramInt1, int paramInt2, char[] paramArrayOfChar, int paramInt3)
  {
    int i = paramInt3 + 1;
    paramArrayOfChar[paramInt3] = this.f[(0x3F & paramInt1 >> 18)];
    int j = i + 1;
    paramArrayOfChar[i] = this.f[(0x3F & paramInt1 >> 12)];
    if (this.b)
    {
      int m = j + 1;
      if (paramInt2 == 2);
      for (int n = this.f[(0x3F & paramInt1 >> 6)]; ; n = this.c)
      {
        paramArrayOfChar[j] = n;
        int i1 = m + 1;
        paramArrayOfChar[m] = this.c;
        return i1;
      }
    }
    if (paramInt2 == 2)
    {
      int k = j + 1;
      paramArrayOfChar[j] = this.f[(0x3F & paramInt1 >> 6)];
      return k;
    }
    return j;
  }

  public final int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int i = paramInt2 + 1;
    paramArrayOfByte[paramInt2] = this.g[(0x3F & paramInt1 >> 18)];
    int j = i + 1;
    paramArrayOfByte[i] = this.g[(0x3F & paramInt1 >> 12)];
    int k = j + 1;
    paramArrayOfByte[j] = this.g[(0x3F & paramInt1 >> 6)];
    int m = k + 1;
    paramArrayOfByte[k] = this.g[(paramInt1 & 0x3F)];
    return m;
  }

  public final int a(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    int i = paramInt2 + 1;
    paramArrayOfChar[paramInt2] = this.f[(0x3F & paramInt1 >> 18)];
    int j = i + 1;
    paramArrayOfChar[i] = this.f[(0x3F & paramInt1 >> 12)];
    int k = j + 1;
    paramArrayOfChar[j] = this.f[(0x3F & paramInt1 >> 6)];
    int m = k + 1;
    paramArrayOfChar[k] = this.f[(paramInt1 & 0x3F)];
    return m;
  }

  public final String a(byte[] paramArrayOfByte, boolean paramBoolean)
  {
    int i = paramArrayOfByte.length;
    StringBuilder localStringBuilder = new StringBuilder(i + (i >> 2) + (i >> 3));
    if (paramBoolean)
      localStringBuilder.append('"');
    int j = c() >> 2;
    int k = 0;
    int m = i - 3;
    int n = j;
    while (k <= m)
    {
      int i4 = k + 1;
      int i5 = paramArrayOfByte[k] << 8;
      int i6 = i4 + 1;
      int i7 = (i5 | 0xFF & paramArrayOfByte[i4]) << 8;
      int i8 = i6 + 1;
      a(localStringBuilder, i7 | 0xFF & paramArrayOfByte[i6]);
      int i9 = n - 1;
      if (i9 <= 0)
      {
        localStringBuilder.append('\\');
        localStringBuilder.append('n');
        i9 = c() >> 2;
      }
      n = i9;
      k = i8;
    }
    int i1 = i - k;
    if (i1 > 0)
    {
      int i2 = k + 1;
      int i3 = paramArrayOfByte[k] << 16;
      if (i1 == 2)
        i3 |= (0xFF & paramArrayOfByte[i2]) << 8;
      a(localStringBuilder, i3, i1);
    }
    if (paramBoolean)
      localStringBuilder.append('"');
    return localStringBuilder.toString();
  }

  public final void a(StringBuilder paramStringBuilder, int paramInt)
  {
    paramStringBuilder.append(this.f[(0x3F & paramInt >> 18)]);
    paramStringBuilder.append(this.f[(0x3F & paramInt >> 12)]);
    paramStringBuilder.append(this.f[(0x3F & paramInt >> 6)]);
    paramStringBuilder.append(this.f[(paramInt & 0x3F)]);
  }

  public final void a(StringBuilder paramStringBuilder, int paramInt1, int paramInt2)
  {
    paramStringBuilder.append(this.f[(0x3F & paramInt1 >> 18)]);
    paramStringBuilder.append(this.f[(0x3F & paramInt1 >> 12)]);
    if (this.b)
      if (paramInt2 == 2)
      {
        c1 = this.f[(0x3F & paramInt1 >> 6)];
        paramStringBuilder.append(c1);
        paramStringBuilder.append(this.c);
      }
    while (paramInt2 != 2)
      while (true)
      {
        return;
        char c1 = this.c;
      }
    paramStringBuilder.append(this.f[(0x3F & paramInt1 >> 6)]);
  }

  public final boolean a()
  {
    return this.b;
  }

  public final boolean a(char paramChar)
  {
    return paramChar == this.c;
  }

  public final boolean a(int paramInt)
  {
    return paramInt == this.c;
  }

  public final char b()
  {
    return this.c;
  }

  public final int b(char paramChar)
  {
    if (paramChar <= '')
      return this.e[paramChar];
    return -1;
  }

  public final int b(int paramInt)
  {
    if (paramInt <= 127)
      return this.e[paramInt];
    return -1;
  }

  public final int c()
  {
    return this.d;
  }

  public final String toString()
  {
    return this.a;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ha
 * JD-Core Version:    0.6.2
 */