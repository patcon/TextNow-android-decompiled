package com.google.android.gms.internal;

import java.util.Arrays;

final class pp
{
  final byte[] awV;
  final int tag;

  pp(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.awV = paramArrayOfByte;
  }

  final void a(pg parampg)
  {
    parampg.gA(this.tag);
    parampg.t(this.awV);
  }

  final int c()
  {
    return 0 + pg.gB(this.tag) + this.awV.length;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    pp localpp;
    do
    {
      return true;
      if (!(paramObject instanceof pp))
        return false;
      localpp = (pp)paramObject;
    }
    while ((this.tag == localpp.tag) && (Arrays.equals(this.awV, localpp.awV)));
    return false;
  }

  public final int hashCode()
  {
    return 31 * (527 + this.tag) + Arrays.hashCode(this.awV);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pp
 * JD-Core Version:    0.6.2
 */