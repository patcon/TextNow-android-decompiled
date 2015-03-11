package com.flurry.sdk;

final class sa$a
{
  protected final sc a;
  protected final a b;

  sa$a(sc paramsc, a parama)
  {
    this.a = paramsc;
    this.b = parama;
  }

  public final int a()
  {
    int i = 1;
    for (a locala = this.b; locala != null; locala = locala.b)
      i++;
    return i;
  }

  public final sc a(int paramInt1, int paramInt2, int paramInt3)
  {
    sc localsc;
    if ((this.a.hashCode() == paramInt1) && (this.a.a(paramInt2, paramInt3)))
    {
      localsc = this.a;
      return localsc;
    }
    for (a locala = this.b; ; locala = locala.b)
    {
      if (locala == null)
        break label79;
      localsc = locala.a;
      if ((localsc.hashCode() == paramInt1) && (localsc.a(paramInt2, paramInt3)))
        break;
    }
    label79: return null;
  }

  public final sc a(int paramInt1, int[] paramArrayOfInt, int paramInt2)
  {
    sc localsc;
    if ((this.a.hashCode() == paramInt1) && (this.a.a(paramArrayOfInt, paramInt2)))
    {
      localsc = this.a;
      return localsc;
    }
    for (a locala = this.b; ; locala = locala.b)
    {
      if (locala == null)
        break label79;
      localsc = locala.a;
      if ((localsc.hashCode() == paramInt1) && (localsc.a(paramArrayOfInt, paramInt2)))
        break;
    }
    label79: return null;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sa.a
 * JD-Core Version:    0.6.2
 */