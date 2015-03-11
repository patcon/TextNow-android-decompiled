package com.google.android.gms.internal;

public final class mh
{
  public static final int[] and = new int[0];
  public static final long[] ane = new long[0];
  public static final float[] anf = new float[0];
  public static final double[] ang = new double[0];
  public static final boolean[] anh = new boolean[0];
  public static final String[] ani = new String[0];
  public static final byte[][] anj = new byte[0][];
  public static final byte[] ank = new byte[0];

  public static final int b(ly paramly, int paramInt)
  {
    int i = 1;
    int j = paramly.getPosition();
    paramly.ev(paramInt);
    while ((paramly.nN() > 0) && (paramly.nB() == paramInt))
    {
      paramly.ev(paramInt);
      i++;
    }
    paramly.ez(j);
    return i;
  }

  static int eN(int paramInt)
  {
    return paramInt & 0x7;
  }

  public static int eO(int paramInt)
  {
    return paramInt >>> 3;
  }

  static int u(int paramInt1, int paramInt2)
  {
    return paramInt2 | paramInt1 << 3;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mh
 * JD-Core Version:    0.6.2
 */