package com.google.android.gms.internal;

import java.util.Arrays;

public final class mg
{
  final byte[] anc;
  final int tag;

  mg(int paramInt, byte[] paramArrayOfByte)
  {
    this.tag = paramInt;
    this.anc = paramArrayOfByte;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    mg localmg;
    do
    {
      return true;
      if (!(paramObject instanceof mg))
        return false;
      localmg = (mg)paramObject;
    }
    while ((this.tag == localmg.tag) && (Arrays.equals(this.anc, localmg.anc)));
    return false;
  }

  public final int hashCode()
  {
    return 31 * (527 + this.tag) + Arrays.hashCode(this.anc);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.mg
 * JD-Core Version:    0.6.2
 */