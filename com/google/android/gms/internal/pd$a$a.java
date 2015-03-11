package com.google.android.gms.internal;

public final class pd$a$a extends ph<a>
{
  private static volatile a[] awg;
  public pd.a.a.a awh;
  public int type;

  public pd$a$a()
  {
    qg();
  }

  public static a[] qf()
  {
    if (awg == null);
    synchronized (pl.awT)
    {
      if (awg == null)
        awg = new a[0];
      return awg;
    }
  }

  public final void a(pg parampg)
  {
    parampg.s(1, this.type);
    if (this.awh != null)
      parampg.a(2, this.awh);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c() + pg.u(1, this.type);
    if (this.awh != null)
      i += pg.c(2, this.awh);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    a locala;
    do
    {
      int i;
      int j;
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
        i = this.type;
        j = locala.type;
        bool2 = false;
      }
      while (i != j);
      if (this.awh != null)
        break;
      locala1 = locala.awh;
      bool2 = false;
    }
    while (locala1 != null);
    while (this.awh.equals(locala.awh))
    {
      pd.a.a.a locala1;
      return a(locala);
    }
    return false;
  }

  public final int hashCode()
  {
    int i = 31 * (527 + this.type);
    if (this.awh == null);
    for (int j = 0; ; j = this.awh.hashCode())
      return 31 * (j + i) + qz();
  }

  public final a qg()
  {
    this.type = 1;
    this.awh = null;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final a s(pf parampf)
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
      case 8:
        int j = parampf.ql();
        switch (j)
        {
        default:
          break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        case 10:
        case 11:
        case 12:
        case 13:
        case 14:
        case 15:
        }
        this.type = j;
        break;
      case 18:
      }
      if (this.awh == null)
        this.awh = new pd.a.a.a();
      parampf.a(this.awh);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pd.a.a
 * JD-Core Version:    0.6.2
 */