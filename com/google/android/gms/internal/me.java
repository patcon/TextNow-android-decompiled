package com.google.android.gms.internal;

import java.io.IOException;

public abstract class me
{
  protected volatile int anb = -1;

  public static final <T extends me> T a(T paramT, byte[] paramArrayOfByte)
  {
    return b(paramT, paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public static final void a(me paramme, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      lz locallz = lz.b(paramArrayOfByte, paramInt1, paramInt2);
      paramme.a(locallz);
      locallz.nR();
      return;
    }
    catch (IOException localIOException)
    {
      throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", localIOException);
    }
  }

  public static final <T extends me> T b(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      ly locally = ly.a(paramArrayOfByte, paramInt1, paramInt2);
      paramT.b(locally);
      locally.eu(0);
      return paramT;
    }
    catch (md localmd)
    {
      throw localmd;
    }
    catch (IOException localIOException)
    {
    }
    throw new RuntimeException("Reading from a byte array threw an IOException (should never happen).");
  }

  public static final byte[] d(me paramme)
  {
    byte[] arrayOfByte = new byte[paramme.oa()];
    a(paramme, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }

  public void a(lz paramlz)
  {
  }

  public abstract me b(ly paramly);

  protected int c()
  {
    return 0;
  }

  public int nZ()
  {
    if (this.anb < 0)
      oa();
    return this.anb;
  }

  public int oa()
  {
    int i = c();
    this.anb = i;
    return i;
  }

  public String toString()
  {
    return mf.e(this);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.me
 * JD-Core Version:    0.6.2
 */