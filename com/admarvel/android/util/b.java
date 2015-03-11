package com.admarvel.android.util;

import java.io.UnsupportedEncodingException;

public class b
{
  static
  {
    if (!b.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  public static byte[] a(String paramString, int paramInt)
  {
    return a(paramString.getBytes(), paramInt);
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    b.b localb = new b.b(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!localb.a(paramArrayOfByte, paramInt1, paramInt2, true))
      throw new IllegalArgumentException("bad base-64");
    if (localb.b == localb.a.length)
      return localb.a;
    byte[] arrayOfByte = new byte[localb.b];
    System.arraycopy(localb.a, 0, arrayOfByte, 0, localb.b);
    return arrayOfByte;
  }

  public static String b(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      String str = new String(c(paramArrayOfByte, paramInt), "US-ASCII");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
  }

  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    b.c localc = new b.c(paramInt3, null);
    int i = 4 * (paramInt2 / 3);
    int j;
    if (localc.d)
    {
      if (paramInt2 % 3 > 0)
        i += 4;
      if ((localc.e) && (paramInt2 > 0))
      {
        j = 1 + (paramInt2 - 1) / 57;
        if (!localc.f)
          break label167;
      }
    }
    label167: for (int k = 2; ; k = 1)
    {
      i += k * j;
      localc.a = new byte[i];
      localc.a(paramArrayOfByte, paramInt1, paramInt2, true);
      if ((a) || (localc.b == i))
        break label173;
      throw new AssertionError();
      switch (paramInt2 % 3)
      {
      case 0:
      default:
        break;
      case 1:
        i += 2;
        break;
      case 2:
        i += 3;
        break;
      }
    }
    label173: return localc.a;
  }

  public static byte[] c(byte[] paramArrayOfByte, int paramInt)
  {
    return b(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.b
 * JD-Core Version:    0.6.2
 */