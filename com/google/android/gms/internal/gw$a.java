package com.google.android.gms.internal;

public final class gw$a
{
  public final int FS;
  public final int FT;

  public gw$a(int paramInt1, int paramInt2)
  {
    this.FS = paramInt1;
    this.FT = paramInt2;
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
    while ((locala.FS != this.FS) || (locala.FT != this.FT));
    return true;
  }

  public final int hashCode()
  {
    Object[] arrayOfObject = new Object[2];
    arrayOfObject[0] = Integer.valueOf(this.FS);
    arrayOfObject[1] = Integer.valueOf(this.FT);
    return hk.hashCode(arrayOfObject);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.gw.a
 * JD-Core Version:    0.6.2
 */