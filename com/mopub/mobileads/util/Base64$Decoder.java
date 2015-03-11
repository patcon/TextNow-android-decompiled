package com.mopub.mobileads.util;

class Base64$Decoder extends Base64.Coder
{
  private static final int[] DECODE = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  private static final int[] DECODE_WEBSAFE = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -2, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
  private static final int EQUALS = -2;
  private static final int SKIP = -1;
  private final int[] alphabet;
  private int state;
  private int value;

  public Base64$Decoder(int paramInt, byte[] paramArrayOfByte)
  {
    this.output = paramArrayOfByte;
    if ((paramInt & 0x8) == 0);
    for (int[] arrayOfInt = DECODE; ; arrayOfInt = DECODE_WEBSAFE)
    {
      this.alphabet = arrayOfInt;
      this.state = 0;
      this.value = 0;
      return;
    }
  }

  public int maxOutputSize(int paramInt)
  {
    return 10 + paramInt * 3 / 4;
  }

  public boolean process(byte[] paramArrayOfByte, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (this.state == 6)
      return false;
    int i = paramInt2 + paramInt1;
    int j = this.state;
    int k = this.value;
    int m = 0;
    byte[] arrayOfByte = this.output;
    int[] arrayOfInt = this.alphabet;
    int n = j;
    int i1 = paramInt1;
    if (i1 < i)
      if (n == 0)
      {
        while (i1 + 4 <= i)
        {
          k = arrayOfInt[(0xFF & paramArrayOfByte[i1])] << 18 | arrayOfInt[(0xFF & paramArrayOfByte[(i1 + 1)])] << 12 | arrayOfInt[(0xFF & paramArrayOfByte[(i1 + 2)])] << 6 | arrayOfInt[(0xFF & paramArrayOfByte[(i1 + 3)])];
          if (k < 0)
            break;
          arrayOfByte[(m + 2)] = ((byte)k);
          arrayOfByte[(m + 1)] = ((byte)(k >> 8));
          arrayOfByte[m] = ((byte)(k >> 16));
          m += 3;
          i1 += 4;
        }
        if (i1 >= i);
      }
      else
      {
        int i5 = i1 + 1;
        int i6 = arrayOfInt[(0xFF & paramArrayOfByte[i1])];
        switch (n)
        {
        default:
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        }
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    i1 = i5;
                    break;
                    if (i6 >= 0)
                    {
                      n++;
                      k = i6;
                      i1 = i5;
                      break;
                    }
                  }
                  while (i6 == -1);
                  this.state = 6;
                  return false;
                  if (i6 >= 0)
                  {
                    k = i6 | k << 6;
                    n++;
                    i1 = i5;
                    break;
                  }
                }
                while (i6 == -1);
                this.state = 6;
                return false;
                if (i6 >= 0)
                {
                  k = i6 | k << 6;
                  n++;
                  i1 = i5;
                  break;
                }
                if (i6 == -2)
                {
                  int i7 = m + 1;
                  arrayOfByte[m] = ((byte)(k >> 4));
                  n = 4;
                  m = i7;
                  i1 = i5;
                  break;
                }
              }
              while (i6 == -1);
              this.state = 6;
              return false;
              if (i6 >= 0)
              {
                k = i6 | k << 6;
                arrayOfByte[(m + 2)] = ((byte)k);
                arrayOfByte[(m + 1)] = ((byte)(k >> 8));
                arrayOfByte[m] = ((byte)(k >> 16));
                m += 3;
                i1 = i5;
                n = 0;
                break;
              }
              if (i6 == -2)
              {
                arrayOfByte[(m + 1)] = ((byte)(k >> 2));
                arrayOfByte[m] = ((byte)(k >> 10));
                m += 2;
                n = 5;
                i1 = i5;
                break;
              }
            }
            while (i6 == -1);
            this.state = 6;
            return false;
            if (i6 == -2)
            {
              n++;
              i1 = i5;
              break;
            }
          }
          while (i6 == -1);
          this.state = 6;
          return false;
        }
        while (i6 == -1);
        this.state = 6;
        return false;
      }
    int i2 = k;
    if (!paramBoolean)
    {
      this.state = n;
      this.value = i2;
      this.op = m;
      return true;
    }
    switch (n)
    {
    case 0:
    default:
    case 1:
    case 2:
    case 3:
      while (true)
      {
        this.state = n;
        this.op = m;
        return true;
        this.state = 6;
        return false;
        int i4 = m + 1;
        arrayOfByte[m] = ((byte)(i2 >> 4));
        m = i4;
        continue;
        int i3 = m + 1;
        arrayOfByte[m] = ((byte)(i2 >> 10));
        m = i3 + 1;
        arrayOfByte[i3] = ((byte)(i2 >> 2));
      }
    case 4:
    }
    this.state = 6;
    return false;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.mopub.mobileads.util.Base64.Decoder
 * JD-Core Version:    0.6.2
 */