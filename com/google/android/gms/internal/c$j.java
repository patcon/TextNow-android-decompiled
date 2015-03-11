package com.google.android.gms.internal;

public final class c$j extends ph<j>
{
  public c.i[] gr;
  public c.f gs;
  public String gt;

  public c$j()
  {
    q();
  }

  public static j b(byte[] paramArrayOfByte)
  {
    return (j)pn.a(new j(), paramArrayOfByte);
  }

  public final void a(pg parampg)
  {
    if ((this.gr != null) && (this.gr.length > 0))
      for (int i = 0; i < this.gr.length; i++)
      {
        c.i locali = this.gr[i];
        if (locali != null)
          parampg.a(1, locali);
      }
    if (this.gs != null)
      parampg.a(2, this.gs);
    if (!this.gt.equals(""))
      parampg.b(3, this.gt);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if ((this.gr != null) && (this.gr.length > 0))
      for (int j = 0; j < this.gr.length; j++)
      {
        c.i locali = this.gr[j];
        if (locali != null)
          i += pg.c(1, locali);
      }
    if (this.gs != null)
      i += pg.c(2, this.gs);
    if (!this.gt.equals(""))
      i += pg.j(3, this.gt);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    j localj;
    do
    {
      c.f localf;
      do
      {
        boolean bool3;
        do
        {
          boolean bool1;
          do
          {
            return bool2;
            bool1 = paramObject instanceof j;
            bool2 = false;
          }
          while (!bool1);
          localj = (j)paramObject;
          bool3 = pl.equals(this.gr, localj.gr);
          bool2 = false;
        }
        while (!bool3);
        if (this.gs != null)
          break;
        localf = localj.gs;
        bool2 = false;
      }
      while (localf != null);
      if (this.gt != null)
        break label113;
      str = localj.gt;
      bool2 = false;
    }
    while (str != null);
    label113: 
    while (this.gt.equals(localj.gt))
    {
      String str;
      return a(localj);
      if (this.gs.equals(localj.gs))
        break;
      return false;
    }
    return false;
  }

  public final int hashCode()
  {
    int i = 31 * (527 + pl.hashCode(this.gr));
    int j;
    int k;
    int m;
    if (this.gs == null)
    {
      j = 0;
      k = 31 * (j + i);
      String str = this.gt;
      m = 0;
      if (str != null)
        break label69;
    }
    while (true)
    {
      return 31 * (k + m) + qz();
      j = this.gs.hashCode();
      break;
      label69: m = this.gt.hashCode();
    }
  }

  public final j k(pf parampf)
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
        int j = pq.b(parampf, 10);
        if (this.gr == null);
        c.i[] arrayOfi;
        for (int k = 0; ; k = this.gr.length)
        {
          arrayOfi = new c.i[j + k];
          if (k != 0)
            System.arraycopy(this.gr, 0, arrayOfi, 0, k);
          while (k < -1 + arrayOfi.length)
          {
            arrayOfi[k] = new c.i();
            parampf.a(arrayOfi[k]);
            parampf.qi();
            k++;
          }
        }
        arrayOfi[k] = new c.i();
        parampf.a(arrayOfi[k]);
        this.gr = arrayOfi;
        break;
      case 18:
        if (this.gs == null)
          this.gs = new c.f();
        parampf.a(this.gs);
        break;
      case 26:
      }
      this.gt = parampf.readString();
    }
  }

  public final j q()
  {
    this.gr = c.i.o();
    this.gs = null;
    this.gt = "";
    this.awJ = null;
    this.awU = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.j
 * JD-Core Version:    0.6.2
 */