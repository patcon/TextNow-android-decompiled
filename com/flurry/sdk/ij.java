package com.flurry.sdk;

public final class ij
{
  static final String a;
  static final char[] b;
  static final char[] c;
  static final byte[] d;
  static final String[] e = { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" };
  static final String[] f = { "-1", "-2", "-3", "-4", "-5", "-6", "-7", "-8", "-9", "-10" };
  private static int g = 1000000;
  private static int h = 1000000000;
  private static long i = 10000000000L;
  private static long j = 1000L;
  private static long k = -2147483648L;
  private static long l = 2147483647L;

  static
  {
    a = String.valueOf(-9223372036854775808L);
    b = new char[4000];
    c = new char[4000];
    int m = 0;
    int n = 0;
    while (m < 10)
    {
      int i2 = (char)(m + 48);
      int i3;
      int i4;
      if (m == 0)
      {
        i3 = 0;
        i4 = 0;
      }
      while (true)
      {
        if (i4 >= 10)
          break label219;
        int i5 = (char)(i4 + 48);
        if ((m == 0) && (i4 == 0));
        int i7;
        for (int i6 = 0; ; i6 = i5)
        {
          i7 = n;
          for (int i8 = 0; i8 < 10; i8++)
          {
            int i9 = (char)(i8 + 48);
            b[i7] = i3;
            b[(i7 + 1)] = i6;
            b[(i7 + 2)] = i9;
            c[i7] = i2;
            c[(i7 + 1)] = i5;
            c[(i7 + 2)] = i9;
            i7 += 4;
          }
          i3 = i2;
          break;
        }
        i4++;
        n = i7;
      }
      label219: m++;
    }
    d = new byte[4000];
    for (int i1 = 0; i1 < 4000; i1++)
      d[i1] = ((byte)c[i1]);
  }

  public static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      if (paramInt1 == -2147483648)
        return a(paramInt1, paramArrayOfByte, paramInt2);
      int i9 = paramInt2 + 1;
      paramArrayOfByte[paramInt2] = 45;
      paramInt1 = -paramInt1;
      paramInt2 = i9;
    }
    if (paramInt1 < g)
    {
      if (paramInt1 < 1000)
      {
        if (paramInt1 < 10)
        {
          int i8 = paramInt2 + 1;
          paramArrayOfByte[paramInt2] = ((byte)(paramInt1 + 48));
          return i8;
        }
        return b(paramInt1, paramArrayOfByte, paramInt2);
      }
      int i7 = paramInt1 / 1000;
      return c(paramInt1 - i7 * 1000, paramArrayOfByte, b(i7, paramArrayOfByte, paramInt2));
    }
    int m;
    label149: int i1;
    int i2;
    int i3;
    if (paramInt1 >= h)
    {
      m = 1;
      if (m != 0)
      {
        paramInt1 -= h;
        if (paramInt1 < h)
          break label218;
        paramInt1 -= h;
        int i6 = paramInt2 + 1;
        paramArrayOfByte[paramInt2] = 50;
        paramInt2 = i6;
      }
      int n = paramInt1 / 1000;
      i1 = paramInt1 - n * 1000;
      i2 = n / 1000;
      i3 = n - i2 * 1000;
      if (m == 0)
        break label234;
    }
    label218: label234: for (int i4 = c(i2, paramArrayOfByte, paramInt2); ; i4 = b(i2, paramArrayOfByte, paramInt2))
    {
      return c(i1, paramArrayOfByte, c(i3, paramArrayOfByte, i4));
      m = 0;
      break;
      int i5 = paramInt2 + 1;
      paramArrayOfByte[paramInt2] = 49;
      paramInt2 = i5;
      break label149;
    }
  }

  public static int a(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    if (paramInt1 < 0)
    {
      if (paramInt1 == -2147483648)
        return a(paramInt1, paramArrayOfChar, paramInt2);
      int i9 = paramInt2 + 1;
      paramArrayOfChar[paramInt2] = '-';
      paramInt1 = -paramInt1;
      paramInt2 = i9;
    }
    if (paramInt1 < g)
    {
      if (paramInt1 < 1000)
      {
        if (paramInt1 < 10)
        {
          int i8 = paramInt2 + 1;
          paramArrayOfChar[paramInt2] = ((char)(paramInt1 + 48));
          return i8;
        }
        return b(paramInt1, paramArrayOfChar, paramInt2);
      }
      int i7 = paramInt1 / 1000;
      return c(paramInt1 - i7 * 1000, paramArrayOfChar, b(i7, paramArrayOfChar, paramInt2));
    }
    int m;
    label149: int i1;
    int i2;
    int i3;
    if (paramInt1 >= h)
    {
      m = 1;
      if (m != 0)
      {
        paramInt1 -= h;
        if (paramInt1 < h)
          break label218;
        paramInt1 -= h;
        int i6 = paramInt2 + 1;
        paramArrayOfChar[paramInt2] = '2';
        paramInt2 = i6;
      }
      int n = paramInt1 / 1000;
      i1 = paramInt1 - n * 1000;
      i2 = n / 1000;
      i3 = n - i2 * 1000;
      if (m == 0)
        break label234;
    }
    label218: label234: for (int i4 = c(i2, paramArrayOfChar, paramInt2); ; i4 = b(i2, paramArrayOfChar, paramInt2))
    {
      return c(i1, paramArrayOfChar, c(i3, paramArrayOfChar, i4));
      m = 0;
      break;
      int i5 = paramInt2 + 1;
      paramArrayOfChar[paramInt2] = '1';
      paramInt2 = i5;
      break label149;
    }
  }

  public static int a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramLong < 0L)
    {
      if (paramLong > k)
        i6 = a((int)paramLong, paramArrayOfByte, paramInt);
      while (true)
      {
        return i6;
        if (paramLong != -9223372036854775808L)
          break;
        i4 = a.length();
        i5 = 0;
        for (i6 = paramInt; i5 < i4; i6 = i7)
        {
          i7 = i6 + 1;
          paramArrayOfByte[i6] = ((byte)a.charAt(i5));
          i5++;
        }
      }
      i3 = paramInt + 1;
      paramArrayOfByte[paramInt] = 45;
      paramLong = -paramLong;
      paramInt = i3;
    }
    int m;
    int n;
    while (paramLong > l)
    {
      int i6;
      int i4;
      int i5;
      int i7;
      int i3;
      m = paramInt + b(paramLong);
      n = m;
      while (paramLong > l)
      {
        n -= 3;
        long l1 = paramLong / j;
        c((int)(paramLong - l1 * j), paramArrayOfByte, n);
        paramLong = l1;
      }
    }
    return a((int)paramLong, paramArrayOfByte, paramInt);
    int i2;
    for (int i1 = (int)paramLong; i1 >= 1000; i1 = i2)
    {
      n -= 3;
      i2 = i1 / 1000;
      c(i1 - i2 * 1000, paramArrayOfByte, n);
    }
    b(i1, paramArrayOfByte, paramInt);
    return m;
  }

  public static int a(long paramLong, char[] paramArrayOfChar, int paramInt)
  {
    if (paramLong < 0L)
    {
      if (paramLong > k)
        return a((int)paramLong, paramArrayOfChar, paramInt);
      if (paramLong == -9223372036854775808L)
      {
        i4 = a.length();
        a.getChars(0, i4, paramArrayOfChar, paramInt);
        return paramInt + i4;
      }
      i3 = paramInt + 1;
      paramArrayOfChar[paramInt] = '-';
      paramLong = -paramLong;
      paramInt = i3;
    }
    int m;
    int n;
    while (paramLong > l)
    {
      int i4;
      int i3;
      m = paramInt + b(paramLong);
      n = m;
      while (paramLong > l)
      {
        n -= 3;
        long l1 = paramLong / j;
        c((int)(paramLong - l1 * j), paramArrayOfChar, n);
        paramLong = l1;
      }
    }
    return a((int)paramLong, paramArrayOfChar, paramInt);
    int i2;
    for (int i1 = (int)paramLong; i1 >= 1000; i1 = i2)
    {
      n -= 3;
      i2 = i1 / 1000;
      c(i1 - i2 * 1000, paramArrayOfChar, n);
    }
    b(i1, paramArrayOfChar, paramInt);
    return m;
  }

  public static String a(double paramDouble)
  {
    return Double.toString(paramDouble);
  }

  public static String a(int paramInt)
  {
    if (paramInt < e.length)
    {
      if (paramInt >= 0)
        return e[paramInt];
      int m = -1 + -paramInt;
      if (m < f.length)
        return f[m];
    }
    return Integer.toString(paramInt);
  }

  public static String a(long paramLong)
  {
    if ((paramLong <= 2147483647L) && (paramLong >= -2147483648L))
      return a((int)paramLong);
    return Long.toString(paramLong);
  }

  private static int b(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int m = paramInt1 << 2;
    char[] arrayOfChar1 = b;
    int n = m + 1;
    int i1 = arrayOfChar1[m];
    if (i1 != 0)
    {
      int i6 = paramInt2 + 1;
      paramArrayOfByte[paramInt2] = ((byte)i1);
      paramInt2 = i6;
    }
    char[] arrayOfChar2 = b;
    int i2 = n + 1;
    int i3 = arrayOfChar2[n];
    if (i3 != 0)
    {
      int i5 = paramInt2 + 1;
      paramArrayOfByte[paramInt2] = ((byte)i3);
      paramInt2 = i5;
    }
    int i4 = paramInt2 + 1;
    paramArrayOfByte[paramInt2] = ((byte)b[i2]);
    return i4;
  }

  private static int b(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    int m = paramInt1 << 2;
    char[] arrayOfChar1 = b;
    int n = m + 1;
    int i1 = arrayOfChar1[m];
    if (i1 != 0)
    {
      int i6 = paramInt2 + 1;
      paramArrayOfChar[paramInt2] = i1;
      paramInt2 = i6;
    }
    char[] arrayOfChar2 = b;
    int i2 = n + 1;
    int i3 = arrayOfChar2[n];
    if (i3 != 0)
    {
      int i5 = paramInt2 + 1;
      paramArrayOfChar[paramInt2] = i3;
      paramInt2 = i5;
    }
    int i4 = paramInt2 + 1;
    paramArrayOfChar[paramInt2] = b[i2];
    return i4;
  }

  private static int b(long paramLong)
  {
    int m = 10;
    for (long l1 = i; (paramLong >= l1) && (m != 19); l1 = (l1 << 3) + (l1 << 1))
      m++;
    return m;
  }

  private static int c(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int m = paramInt1 << 2;
    int n = paramInt2 + 1;
    byte[] arrayOfByte1 = d;
    int i1 = m + 1;
    paramArrayOfByte[paramInt2] = arrayOfByte1[m];
    int i2 = n + 1;
    byte[] arrayOfByte2 = d;
    int i3 = i1 + 1;
    paramArrayOfByte[n] = arrayOfByte2[i1];
    int i4 = i2 + 1;
    paramArrayOfByte[i2] = d[i3];
    return i4;
  }

  private static int c(int paramInt1, char[] paramArrayOfChar, int paramInt2)
  {
    int m = paramInt1 << 2;
    int n = paramInt2 + 1;
    char[] arrayOfChar1 = c;
    int i1 = m + 1;
    paramArrayOfChar[paramInt2] = arrayOfChar1[m];
    int i2 = n + 1;
    char[] arrayOfChar2 = c;
    int i3 = i1 + 1;
    paramArrayOfChar[n] = arrayOfChar2[i1];
    int i4 = i2 + 1;
    paramArrayOfChar[i2] = c[i3];
    return i4;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ij
 * JD-Core Version:    0.6.2
 */