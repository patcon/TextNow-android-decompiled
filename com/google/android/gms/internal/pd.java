package com.google.android.gms.internal;

public final class pd extends ph<pd>
{
  public pd.a[] awd;

  public pd()
  {
    qc();
  }

  public static pd n(byte[] paramArrayOfByte)
  {
    return (pd)pn.a(new pd(), paramArrayOfByte);
  }

  public final void a(pg parampg)
  {
    if ((this.awd != null) && (this.awd.length > 0))
      for (int i = 0; i < this.awd.length; i++)
      {
        pd.a locala = this.awd[i];
        if (locala != null)
          parampg.a(1, locala);
      }
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if ((this.awd != null) && (this.awd.length > 0))
      for (int j = 0; j < this.awd.length; j++)
      {
        pd.a locala = this.awd[j];
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
    pd localpd;
    boolean bool3;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = paramObject instanceof pd;
        bool2 = false;
      }
      while (!bool1);
      localpd = (pd)paramObject;
      bool3 = pl.equals(this.awd, localpd.awd);
      bool2 = false;
    }
    while (!bool3);
    return a(localpd);
  }

  public final int hashCode()
  {
    return 31 * (527 + pl.hashCode(this.awd)) + qz();
  }

  public final pd q(pf parampf)
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
      if (this.awd == null);
      pd.a[] arrayOfa;
      for (int k = 0; ; k = this.awd.length)
      {
        arrayOfa = new pd.a[j + k];
        if (k != 0)
          System.arraycopy(this.awd, 0, arrayOfa, 0, k);
        while (k < -1 + arrayOfa.length)
        {
          arrayOfa[k] = new pd.a();
          parampf.a(arrayOfa[k]);
          parampf.qi();
          k++;
        }
      }
      arrayOfa[k] = new pd.a();
      parampf.a(arrayOfa[k]);
      this.awd = arrayOfa;
    }
  }

  public final pd qc()
  {
    this.awd = pd.a.qd();
    this.awJ = null;
    this.awU = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pd
 * JD-Core Version:    0.6.2
 */