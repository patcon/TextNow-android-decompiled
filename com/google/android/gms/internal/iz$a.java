package com.google.android.gms.internal;

import com.google.android.gms.common.internal.n;

public final class iz$a
{
  public final int Lp;
  public final int Lq;

  public iz$a(int paramInt1, int paramInt2)
  {
    this.Lp = paramInt1;
    this.Lq = paramInt2;
  }

  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a));
    a locala;
    do
    {
      return false;
      if (this == paramObject)
        return true;
      locala = (a)paramObject;
    }
    while ((locala.Lp != this.Lp) || (locala.Lq != this.Lq));
    return true;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.Lp);
    arrayOfObject[1] = Integer.valueOf(this.Lq);
    return n.hashCode(arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iz.a
 * JD-Core Version:    0.6.2
 */