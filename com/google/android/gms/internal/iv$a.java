package com.google.android.gms.internal;

import java.util.List;

public final class iv$a extends ma<a>
{
  public iv.a.a[] Uy;

  public iv$a()
  {
    iQ();
  }

  public final void a(lz paramlz)
  {
    if ((this.Uy != null) && (this.Uy.length > 0))
      for (int i = 0; i < this.Uy.length; i++)
      {
        iv.a.a locala = this.Uy[i];
        if (locala != null)
          paramlz.a(1, locala);
      }
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c();
    if ((this.Uy != null) && (this.Uy.length > 0))
      for (int j = 0; j < this.Uy.length; j++)
      {
        iv.a.a locala = this.Uy[j];
        if (locala != null)
          i += lz.b(1, locala);
      }
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    a locala;
    do
    {
      return true;
      if (!(paramObject instanceof a))
        return false;
      locala = (a)paramObject;
      if (!mc.equals(this.Uy, locala.Uy))
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((locala.amX == null) || (locala.amX.isEmpty()));
    return false;
    return this.amX.equals(locala.amX);
  }

  public final int hashCode()
  {
    int i = 31 * (527 + mc.hashCode(this.Uy));
    if ((this.amX == null) || (this.amX.isEmpty()));
    for (int j = 0; ; j = this.amX.hashCode())
      return j + i;
  }

  public final a iQ()
  {
    this.Uy = iv.a.a.iR();
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final a n(ly paramly)
  {
    while (true)
    {
      int i = paramly.nB();
      switch (i)
      {
      default:
        if (a(paramly, i))
          continue;
      case 0:
        return this;
      case 10:
      }
      int j = mh.b(paramly, 10);
      if (this.Uy == null);
      iv.a.a[] arrayOfa;
      for (int k = 0; ; k = this.Uy.length)
      {
        arrayOfa = new iv.a.a[j + k];
        if (k != 0)
          System.arraycopy(this.Uy, 0, arrayOfa, 0, k);
        while (k < -1 + arrayOfa.length)
        {
          arrayOfa[k] = new iv.a.a();
          paramly.a(arrayOfa[k]);
          paramly.nB();
          k++;
        }
      }
      arrayOfa[k] = new iv.a.a();
      paramly.a(arrayOfa[k]);
      this.Uy = arrayOfa;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iv.a
 * JD-Core Version:    0.6.2
 */