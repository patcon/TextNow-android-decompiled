package com.admarvel.android.util;

import java.io.UnsupportedEncodingException;

public class g
{
  static
  {
    if (!g.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      a = bool;
      return;
    }
  }

  public static String a(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      String str = new String(b(paramArrayOfByte, paramInt), "US-ASCII");
      return str;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      throw new AssertionError(localUnsupportedEncodingException);
    }
  }

  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    g.b localb = new g.b(paramInt3, null);
    int i = 4 * (paramInt2 / 3);
    int j;
    if (localb.d)
    {
      if (paramInt2 % 3 > 0)
        i += 4;
      if ((localb.e) && (paramInt2 > 0))
      {
        j = 1 + (paramInt2 - 1) / 57;
        if (!localb.f)
          break label167;
      }
    }
    label167: for (int k = 2; ; k = 1)
    {
      i += k * j;
      localb.a = new byte[i];
      localb.a(paramArrayOfByte, paramInt1, paramInt2, true);
      if ((a) || (localb.b == i))
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
    label173: return localb.a;
  }

  public static byte[] b(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.admarvel.android.util.g
 * JD-Core Version:    0.6.2
 */