package textnow.u;

public class a
{
  private static final byte[] b;
  private static final byte[] c;
  private static final byte[] d;
  private static final byte[] e;

  static
  {
    if (!a.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      b = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
      c = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
      d = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9 };
      e = new byte[] { -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9 };
      return;
    }
  }

  private static int a(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2, byte[] paramArrayOfByte3)
  {
    if (paramArrayOfByte1[2] == 61)
    {
      paramArrayOfByte2[paramInt2] = ((byte)((paramArrayOfByte3[paramArrayOfByte1[0]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[1]] << 24 >>> 12) >>> 16));
      return 1;
    }
    if (paramArrayOfByte1[3] == 61)
    {
      int j = paramArrayOfByte3[paramArrayOfByte1[0]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[1]] << 24 >>> 12 | paramArrayOfByte3[paramArrayOfByte1[2]] << 24 >>> 18;
      paramArrayOfByte2[paramInt2] = ((byte)(j >>> 16));
      paramArrayOfByte2[(paramInt2 + 1)] = ((byte)(j >>> 8));
      return 2;
    }
    int i = paramArrayOfByte3[paramArrayOfByte1[0]] << 24 >>> 6 | paramArrayOfByte3[paramArrayOfByte1[1]] << 24 >>> 12 | paramArrayOfByte3[paramArrayOfByte1[2]] << 24 >>> 18 | paramArrayOfByte3[paramArrayOfByte1[3]] << 24 >>> 24;
    paramArrayOfByte2[paramInt2] = ((byte)(i >> 16));
    paramArrayOfByte2[(paramInt2 + 1)] = ((byte)(i >> 8));
    paramArrayOfByte2[(paramInt2 + 2)] = ((byte)i);
    return 3;
  }

  public static byte[] a(String paramString)
  {
    byte[] arrayOfByte1 = paramString.getBytes();
    int i = arrayOfByte1.length;
    byte[] arrayOfByte2 = d;
    byte[] arrayOfByte3 = new byte[2 + i * 3 / 4];
    byte[] arrayOfByte4 = new byte[4];
    int j = 0;
    int k = 0;
    int m = 0;
    int i2;
    int i3;
    if (j < i)
    {
      int n = (byte)(0x7F & arrayOfByte1[(j + 0)]);
      int i1 = arrayOfByte2[n];
      if (i1 >= -5)
      {
        if (i1 < -1)
          break label404;
        if (n == 61)
        {
          int i4 = i - j;
          int i5 = (byte)(0x7F & arrayOfByte1[(0 + (i - 1))]);
          if ((k == 0) || (k == 1))
            throw new b("invalid padding byte '=' at byte offset " + j);
          if (((k == 3) && (i4 > 2)) || ((k == 4) && (i4 > 1)))
            throw new b("padding byte '=' falsely signals end of encoded value at offset " + j);
          if ((i5 == 61) || (i5 == 10))
            break label314;
          throw new b("encoded value has invalid trailing byte");
        }
        i2 = k + 1;
        arrayOfByte4[k] = n;
        if (i2 != 4)
          break label397;
        i3 = m + a(arrayOfByte4, 0, arrayOfByte3, m, arrayOfByte2);
        i2 = 0;
      }
    }
    while (true)
    {
      j++;
      m = i3;
      k = i2;
      break;
      throw new b("Bad Base64 input character at " + j + ": " + arrayOfByte1[(0 + j)] + "(decimal)");
      label314: if (k != 0)
      {
        if (k == 1)
          throw new b("single trailing character at offset " + (i - 1));
        arrayOfByte4[k] = 61;
        m += a(arrayOfByte4, 0, arrayOfByte3, m, arrayOfByte2);
      }
      byte[] arrayOfByte5 = new byte[m];
      System.arraycopy(arrayOfByte3, 0, arrayOfByte5, 0, m);
      return arrayOfByte5;
      label397: i3 = m;
      continue;
      label404: i2 = k;
      i3 = m;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     textnow.u.a
 * JD-Core Version:    0.6.2
 */