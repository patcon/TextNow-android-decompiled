package com.google.android.gms.internal;

public final class pd$a extends ph<a>
{
  private static volatile a[] awe;
  public pd.a.a awf;
  public String name;

  public pd$a()
  {
    qe();
  }

  public static a[] qd()
  {
    if (awe == null);
    synchronized (pl.awT)
    {
      if (awe == null)
        awe = new a[0];
      return awe;
    }
  }

  public final void a(pg parampg)
  {
    parampg.b(1, this.name);
    if (this.awf != null)
      parampg.a(2, this.awf);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c() + pg.j(1, this.name);
    if (this.awf != null)
      i += pg.c(2, this.awf);
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
      String str;
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
        if (this.name != null)
          break;
        str = locala.name;
        bool2 = false;
      }
      while (str != null);
      if (this.awf != null)
        break label92;
      locala1 = locala.awf;
      bool2 = false;
    }
    while (locala1 != null);
    label92: 
    while (this.awf.equals(locala.awf))
    {
      pd.a.a locala1;
      return a(locala);
      if (this.name.equals(locala.name))
        break;
      return false;
    }
    return false;
  }

  public final int hashCode()
  {
    int i;
    int j;
    int k;
    if (this.name == null)
    {
      i = 0;
      j = 31 * (i + 527);
      pd.a.a locala = this.awf;
      k = 0;
      if (locala != null)
        break label54;
    }
    while (true)
    {
      return 31 * (j + k) + qz();
      i = this.name.hashCode();
      break;
      label54: k = this.awf.hashCode();
    }
  }

  public final a qe()
  {
    this.name = "";
    this.awf = null;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final a r(pf parampf)
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
        this.name = parampf.readString();
        break;
      case 18:
      }
      if (this.awf == null)
        this.awf = new pd.a.a();
      parampf.a(this.awf);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pd.a
 * JD-Core Version:    0.6.2
 */