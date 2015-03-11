package com.flurry.sdk;

public class ga
{
  private static final ThreadLocal<ga.a> a = new ThreadLocal()
  {
    protected final ga.a a()
    {
      return new ga.a();
    }
  };
  private static final ThreadLocal<ga.b> b = new ThreadLocal()
  {
    protected final ga.b a()
    {
      return new ga.b();
    }
  };

  public static int a(double paramDouble, byte[] paramArrayOfByte, int paramInt)
  {
    long l = Double.doubleToRawLongBits(paramDouble);
    int i = (int)(l & 0xFFFFFFFF);
    int j = (int)(0xFFFFFFFF & l >>> 32);
    paramArrayOfByte[paramInt] = ((byte)(i & 0xFF));
    paramArrayOfByte[(paramInt + 4)] = ((byte)(j & 0xFF));
    paramArrayOfByte[(paramInt + 5)] = ((byte)(0xFF & j >>> 8));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(0xFF & i >>> 8));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(0xFF & i >>> 16));
    paramArrayOfByte[(paramInt + 6)] = ((byte)(0xFF & j >>> 16));
    paramArrayOfByte[(paramInt + 7)] = ((byte)(0xFF & j >>> 24));
    paramArrayOfByte[(paramInt + 3)] = ((byte)(0xFF & i >>> 24));
    return 8;
  }

  public static int a(float paramFloat, byte[] paramArrayOfByte, int paramInt)
  {
    int i = Float.floatToRawIntBits(paramFloat);
    paramArrayOfByte[paramInt] = ((byte)(i & 0xFF));
    paramArrayOfByte[(paramInt + 1)] = ((byte)(0xFF & i >>> 8));
    paramArrayOfByte[(paramInt + 2)] = ((byte)(0xFF & i >>> 16));
    paramArrayOfByte[(paramInt + 3)] = ((byte)(0xFF & i >>> 24));
    return 4;
  }

  public static int a(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    int i = paramInt1 << 1 ^ paramInt1 >> 31;
    int n;
    int i1;
    int k;
    int i2;
    int j;
    if ((i & 0xFFFFFF80) != 0)
    {
      n = paramInt2 + 1;
      paramArrayOfByte[paramInt2] = ((byte)(0xFF & (i | 0x80)));
      i1 = i >>> 7;
      if (i1 > 127)
      {
        k = n + 1;
        paramArrayOfByte[n] = ((byte)(0xFF & (i1 | 0x80)));
        i2 = i1 >>> 7;
        if (i2 <= 127)
          break label174;
        n = k + 1;
        paramArrayOfByte[k] = ((byte)(0xFF & (i2 | 0x80)));
        i1 = i2 >>> 7;
        if (i1 > 127)
        {
          k = n + 1;
          paramArrayOfByte[n] = ((byte)(0xFF & (i1 | 0x80)));
          j = i1 >>> 7;
        }
      }
    }
    while (true)
    {
      int m = k + 1;
      paramArrayOfByte[k] = ((byte)j);
      return m - paramInt2;
      k = n;
      j = i1;
      continue;
      label174: j = i2;
      continue;
      j = i;
      k = paramInt2;
    }
  }

  public static int a(long paramLong, byte[] paramArrayOfByte, int paramInt)
  {
    long l = paramLong << 1 ^ paramLong >> 63;
    int i;
    int k;
    if ((0xFFFFFF80 & l) != 0L)
    {
      i = paramInt + 1;
      paramArrayOfByte[paramInt] = ((byte)(int)(0xFF & (0x80 | l)));
      l >>>= 7;
      if (l > 127L)
      {
        k = i + 1;
        paramArrayOfByte[i] = ((byte)(int)(0xFF & (0x80 | l)));
        l >>>= 7;
        if (l <= 127L)
          break label371;
        i = k + 1;
        paramArrayOfByte[k] = ((byte)(int)(0xFF & (0x80 | l)));
        l >>>= 7;
        if (l > 127L)
        {
          k = i + 1;
          paramArrayOfByte[i] = ((byte)(int)(0xFF & (0x80 | l)));
          l >>>= 7;
          if (l <= 127L)
            break label371;
          i = k + 1;
          paramArrayOfByte[k] = ((byte)(int)(0xFF & (0x80 | l)));
          l >>>= 7;
          if (l > 127L)
          {
            k = i + 1;
            paramArrayOfByte[i] = ((byte)(int)(0xFF & (0x80 | l)));
            l >>>= 7;
            if (l <= 127L)
              break label371;
            i = k + 1;
            paramArrayOfByte[k] = ((byte)(int)(0xFF & (0x80 | l)));
            l >>>= 7;
            if (l > 127L)
            {
              k = i + 1;
              paramArrayOfByte[i] = ((byte)(int)(0xFF & (0x80 | l)));
              l >>>= 7;
              if (l <= 127L)
                break label371;
              i = k + 1;
              paramArrayOfByte[k] = ((byte)(int)(0xFF & (0x80 | l)));
              l >>>= 7;
            }
          }
        }
      }
    }
    while (true)
    {
      int j = i + 1;
      paramArrayOfByte[i] = ((byte)(int)l);
      return j - paramInt;
      label371: i = k;
      continue;
      i = paramInt;
    }
  }

  public static int a(boolean paramBoolean, byte[] paramArrayOfByte, int paramInt)
  {
    if (paramBoolean);
    for (int i = 1; ; i = 0)
    {
      paramArrayOfByte[paramInt] = i;
      return 1;
    }
  }

  public static int a(byte[] paramArrayOfByte1, int paramInt1, int paramInt2, byte[] paramArrayOfByte2, int paramInt3, int paramInt4)
  {
    int i = paramInt1 + paramInt2;
    int j = paramInt3 + paramInt4;
    while ((paramInt1 < i) && (paramInt3 < j))
    {
      int k = 0xFF & paramArrayOfByte1[paramInt1];
      int m = 0xFF & paramArrayOfByte2[paramInt3];
      if (k != m)
        return k - m;
      paramInt1++;
      paramInt3++;
    }
    return paramInt2 - paramInt4;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ga
 * JD-Core Version:    0.6.2
 */