package com.google.android.gms.internal;

public final class ly
{
  private int amN;
  private int amO;
  private int amP;
  private int amQ;
  private int amR;
  private int amS = 2147483647;
  private int amT;
  private int amU = 64;
  private int amV = 67108864;
  private final byte[] buffer;

  private ly(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    this.buffer = paramArrayOfByte;
    this.amN = paramInt1;
    this.amO = (paramInt1 + paramInt2);
    this.amQ = paramInt1;
  }

  public static long A(long paramLong)
  {
    return paramLong >>> 1 ^ -(1L & paramLong);
  }

  public static ly a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    return new ly(paramArrayOfByte, paramInt1, paramInt2);
  }

  public static int ew(int paramInt)
  {
    return paramInt >>> 1 ^ -(paramInt & 0x1);
  }

  private void nM()
  {
    this.amO += this.amP;
    int i = this.amO;
    if (i > this.amS)
    {
      this.amP = (i - this.amS);
      this.amO -= this.amP;
      return;
    }
    this.amP = 0;
  }

  public static ly p(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }

  public final void a(me paramme)
  {
    int i = nI();
    if (this.amT >= this.amU)
      throw md.nY();
    int j = ex(i);
    this.amT = (1 + this.amT);
    paramme.b(this);
    eu(0);
    this.amT = (-1 + this.amT);
    ey(j);
  }

  public final void a(me paramme, int paramInt)
  {
    if (this.amT >= this.amU)
      throw md.nY();
    this.amT = (1 + this.amT);
    paramme.b(this);
    eu(mh.u(paramInt, 4));
    this.amT = (-1 + this.amT);
  }

  public final byte[] eA(int paramInt)
  {
    if (paramInt < 0)
      throw md.nT();
    if (paramInt + this.amQ > this.amS)
    {
      eB(this.amS - this.amQ);
      throw md.nS();
    }
    if (paramInt <= this.amO - this.amQ)
    {
      byte[] arrayOfByte = new byte[paramInt];
      System.arraycopy(this.buffer, this.amQ, arrayOfByte, 0, paramInt);
      this.amQ = (paramInt + this.amQ);
      return arrayOfByte;
    }
    throw md.nS();
  }

  public final void eB(int paramInt)
  {
    if (paramInt < 0)
      throw md.nT();
    if (paramInt + this.amQ > this.amS)
    {
      eB(this.amS - this.amQ);
      throw md.nS();
    }
    if (paramInt <= this.amO - this.amQ)
    {
      this.amQ = (paramInt + this.amQ);
      return;
    }
    throw md.nS();
  }

  public final void eu(int paramInt)
  {
    if (this.amR != paramInt)
      throw md.nW();
  }

  public final boolean ev(int paramInt)
  {
    switch (mh.eN(paramInt))
    {
    default:
      throw md.nX();
    case 0:
      nE();
      return true;
    case 1:
      nL();
      return true;
    case 2:
      eB(nI());
      return true;
    case 3:
      nC();
      eu(mh.u(mh.eO(paramInt), 4));
      return true;
    case 4:
      return false;
    case 5:
    }
    nK();
    return true;
  }

  public final int ex(int paramInt)
  {
    if (paramInt < 0)
      throw md.nT();
    int i = paramInt + this.amQ;
    int j = this.amS;
    if (i > j)
      throw md.nS();
    this.amS = i;
    nM();
    return j;
  }

  public final void ey(int paramInt)
  {
    this.amS = paramInt;
    nM();
  }

  public final void ez(int paramInt)
  {
    if (paramInt > this.amQ - this.amN)
      throw new IllegalArgumentException("Position " + paramInt + " is beyond current " + (this.amQ - this.amN));
    if (paramInt < 0)
      throw new IllegalArgumentException("Bad position " + paramInt);
    this.amQ = (paramInt + this.amN);
  }

  public final int getPosition()
  {
    return this.amQ - this.amN;
  }

  public final int nB()
  {
    if (nO())
    {
      this.amR = 0;
      return 0;
    }
    this.amR = nI();
    if (this.amR == 0)
      throw md.nV();
    return this.amR;
  }

  public final void nC()
  {
    int i;
    do
      i = nB();
    while ((i != 0) && (ev(i)));
  }

  public final long nD()
  {
    return nJ();
  }

  public final int nE()
  {
    return nI();
  }

  public final boolean nF()
  {
    return nI() != 0;
  }

  public final int nG()
  {
    return ew(nI());
  }

  public final long nH()
  {
    return A(nJ());
  }

  public final int nI()
  {
    int i = nP();
    if (i >= 0);
    int i4;
    do
    {
      return i;
      int j = i & 0x7F;
      int k = nP();
      if (k >= 0)
        return j | k << 7;
      int m = j | (k & 0x7F) << 7;
      int n = nP();
      if (n >= 0)
        return m | n << 14;
      int i1 = m | (n & 0x7F) << 14;
      int i2 = nP();
      if (i2 >= 0)
        return i1 | i2 << 21;
      int i3 = i1 | (i2 & 0x7F) << 21;
      i4 = nP();
      i = i3 | i4 << 28;
    }
    while (i4 >= 0);
    for (int i5 = 0; ; i5++)
    {
      if (i5 >= 5)
        break label151;
      if (nP() >= 0)
        break;
    }
    label151: throw md.nU();
  }

  public final long nJ()
  {
    int i = 0;
    long l = 0L;
    while (i < 64)
    {
      int j = nP();
      l |= (j & 0x7F) << i;
      if ((j & 0x80) == 0)
        return l;
      i += 7;
    }
    throw md.nU();
  }

  public final int nK()
  {
    int i = nP();
    int j = nP();
    int k = nP();
    int m = nP();
    return i & 0xFF | (j & 0xFF) << 8 | (k & 0xFF) << 16 | (m & 0xFF) << 24;
  }

  public final long nL()
  {
    int i = nP();
    int j = nP();
    int k = nP();
    int m = nP();
    int n = nP();
    int i1 = nP();
    int i2 = nP();
    int i3 = nP();
    return 0xFF & i | (0xFF & j) << 8 | (0xFF & k) << 16 | (0xFF & m) << 24 | (0xFF & n) << 32 | (0xFF & i1) << 40 | (0xFF & i2) << 48 | (0xFF & i3) << 56;
  }

  public final int nN()
  {
    if (this.amS == 2147483647)
      return -1;
    int i = this.amQ;
    return this.amS - i;
  }

  public final boolean nO()
  {
    return this.amQ == this.amO;
  }

  public final byte nP()
  {
    if (this.amQ == this.amO)
      throw md.nS();
    byte[] arrayOfByte = this.buffer;
    int i = this.amQ;
    this.amQ = (i + 1);
    return arrayOfByte[i];
  }

  public final byte[] o(int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0)
      return mh.ank;
    byte[] arrayOfByte = new byte[paramInt2];
    int i = paramInt1 + this.amN;
    System.arraycopy(this.buffer, i, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }

  public final byte[] readBytes()
  {
    int i = nI();
    if ((i <= this.amO - this.amQ) && (i > 0))
    {
      byte[] arrayOfByte = new byte[i];
      System.arraycopy(this.buffer, this.amQ, arrayOfByte, 0, i);
      this.amQ = (i + this.amQ);
      return arrayOfByte;
    }
    return eA(i);
  }

  public final double readDouble()
  {
    return Double.longBitsToDouble(nL());
  }

  public final float readFloat()
  {
    return Float.intBitsToFloat(nK());
  }

  public final String readString()
  {
    int i = nI();
    if ((i <= this.amO - this.amQ) && (i > 0))
    {
      String str = new String(this.buffer, this.amQ, i, "UTF-8");
      this.amQ = (i + this.amQ);
      return str;
    }
    return new String(eA(i), "UTF-8");
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ly
 * JD-Core Version:    0.6.2
 */