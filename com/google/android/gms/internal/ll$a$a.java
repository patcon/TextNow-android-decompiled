package com.google.android.gms.internal;

public final class ll$a$a extends ph<a>
{
  private static volatile a[] adF;
  public String adG;
  public String adH;
  public int viewId;

  public ll$a$a()
  {
    lR();
  }

  public static a[] lQ()
  {
    if (adF == null);
    synchronized (pl.awT)
    {
      if (adF == null)
        adF = new a[0];
      return adF;
    }
  }

  public final void a(pg parampg)
  {
    if (!this.adG.equals(""))
      parampg.b(1, this.adG);
    if (!this.adH.equals(""))
      parampg.b(2, this.adH);
    if (this.viewId != 0)
      parampg.s(3, this.viewId);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if (!this.adG.equals(""))
      i += pg.j(1, this.adG);
    if (!this.adH.equals(""))
      i += pg.j(2, this.adH);
    if (this.viewId != 0)
      i += pg.u(3, this.viewId);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    a locala;
    label47: 
    do
    {
      String str2;
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
        if (this.adG != null)
          break;
        str2 = locala.adG;
        bool2 = false;
      }
      while (str2 != null);
      if (this.adH != null)
        break label114;
      str1 = locala.adH;
      bool2 = false;
    }
    while (str1 != null);
    label114: 
    while (this.adH.equals(locala.adH))
    {
      String str1;
      int i = this.viewId;
      int j = locala.viewId;
      bool2 = false;
      if (i != j)
        break;
      return a(locala);
      if (this.adG.equals(locala.adG))
        break label47;
      return false;
    }
    return false;
  }

  public final int hashCode()
  {
    int i;
    int j;
    int k;
    if (this.adG == null)
    {
      i = 0;
      j = 31 * (i + 527);
      String str = this.adH;
      k = 0;
      if (str != null)
        break label62;
    }
    while (true)
    {
      return 31 * (31 * (j + k) + this.viewId) + qz();
      i = this.adG.hashCode();
      break;
      label62: k = this.adH.hashCode();
    }
  }

  public final a lR()
  {
    this.adG = "";
    this.adH = "";
    this.viewId = 0;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final a o(pf parampf)
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
        this.adG = parampf.readString();
        break;
      case 18:
        this.adH = parampf.readString();
        break;
      case 24:
      }
      this.viewId = parampf.ql();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.ll.a.a
 * JD-Core Version:    0.6.2
 */