package com.flurry.sdk;

import java.io.InputStream;

public class gg
{
  private static final gg b = new gg.a(null);
  int a = 8192;

  public static gg a()
  {
    return b;
  }

  public gb a(InputStream paramInputStream, gb paramgb)
  {
    if ((paramgb == null) || (!paramgb.getClass().equals(gb.class)))
      return new gb(paramInputStream, this.a);
    return paramgb.a(paramInputStream, this.a);
  }

  public gb a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, gb paramgb)
  {
    if ((paramgb == null) || (!paramgb.getClass().equals(gb.class)))
      return new gb(paramArrayOfByte, paramInt1, paramInt2);
    return paramgb.a(paramArrayOfByte, paramInt1, paramInt2);
  }

  public gb a(byte[] paramArrayOfByte, gb paramgb)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramgb);
  }

  public gl a(fn paramfn1, fn paramfn2, gf paramgf)
  {
    return new gl(paramfn1, paramfn2, paramgf);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gg
 * JD-Core Version:    0.6.2
 */