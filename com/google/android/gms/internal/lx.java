package com.google.android.gms.internal;

public class lx
{
  private final byte[] amK = new byte[256];
  private int amL;
  private int amM;

  public lx(byte[] paramArrayOfByte)
  {
    for (int i = 0; i < 256; i++)
      this.amK[i] = ((byte)i);
    int j = 0;
    for (int k = 0; k < 256; k++)
    {
      j = 0xFF & j + this.amK[k] + paramArrayOfByte[(k % paramArrayOfByte.length)];
      int m = this.amK[k];
      this.amK[k] = this.amK[j];
      this.amK[j] = m;
    }
    this.amL = 0;
    this.amM = 0;
  }

  public void o(byte[] paramArrayOfByte)
  {
    int i = this.amL;
    int j = this.amM;
    for (int k = 0; k < paramArrayOfByte.length; k++)
    {
      i = 0xFF & i + 1;
      j = 0xFF & j + this.amK[i];
      int m = this.amK[i];
      this.amK[i] = this.amK[j];
      this.amK[j] = m;
      paramArrayOfByte[k] = ((byte)(paramArrayOfByte[k] ^ this.amK[(0xFF & this.amK[i] + this.amK[j])]));
    }
    this.amL = i;
    this.amM = j;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lx
 * JD-Core Version:    0.6.2
 */