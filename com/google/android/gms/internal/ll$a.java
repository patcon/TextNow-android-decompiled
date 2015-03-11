package com.google.android.gms.internal;

public final class ll$a extends ph<a>
{
  public ll.a.a[] adE;

  public ll$a()
  {
    lP();
  }

  public final void a(pg parampg)
  {
    if ((this.adE != null) && (this.adE.length > 0))
      for (int i = 0; i < this.adE.length; i++)
      {
        ll.a.a locala = this.adE[i];
        if (locala != null)
          parampg.a(1, locala);
      }
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if ((this.adE != null) && (this.adE.length > 0))
      for (int j = 0; j < this.adE.length; j++)
      {
        ll.a.a locala = this.adE[j];
        if (locala != null)
          i += pg.c(1, locala);
      }
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    a locala;
    boolean bool3;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = paramObject instanceof a;
        bool2 = false;
      }
      while (!bool1);
      locala = (a)paramObject;
      bool3 = pl.equals(this.adE, locala.adE);
      bool2 = false;
    }
    while (!bool3);
    return a(locala);
  }

  public final int hashCode()
  {
    return 31 * (527 + pl.hashCode(this.adE)) + qz();
  }

  public final a lP()
  {
    this.adE = ll.a.a.lQ();
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final a n(pf parampf)
  {
    while (true)
    {
      int i = parampf.qi();
      switch (i)
      {
      default:
        if (a(parampf, i))
          continue;
      case 0:
        return this;
      case 10:
      }
      int j = pq.b(parampf, 10);
      if (this.adE == null);
      ll.a.a[] arrayOfa;
      for (int k = 0; ; k = this.adE.length)
      {
        arrayOfa = new ll.a.a[j + k];
        if (k != 0)
          System.arraycopy(this.adE, 0, arrayOfa, 0, k);
        while (k < -1 + arrayOfa.length)
        {
          arrayOfa[k] = new ll.a.a();
          parampf.a(arrayOfa[k]);
          parampf.qi();
          k++;
        }
      }
      arrayOfa[k] = new ll.a.a();
      parampf.a(arrayOfa[k]);
      this.adE = arrayOfa;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ll.a
 * JD-Core Version:    0.6.2
 */