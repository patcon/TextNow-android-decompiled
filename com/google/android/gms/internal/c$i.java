package com.google.android.gms.internal;

public final class c$i extends ph<i>
{
  private static volatile i[] go;
  public d.a gp;
  public c.d gq;
  public String name;

  public c$i()
  {
    p();
  }

  public static i[] o()
  {
    if (go == null);
    synchronized (pl.awT)
    {
      if (go == null)
        go = new i[0];
      return go;
    }
  }

  public final void a(pg parampg)
  {
    if (!this.name.equals(""))
      parampg.b(1, this.name);
    if (this.gp != null)
      parampg.a(2, this.gp);
    if (this.gq != null)
      parampg.a(3, this.gq);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if (!this.name.equals(""))
      i += pg.j(1, this.name);
    if (this.gp != null)
      i += pg.c(2, this.gp);
    if (this.gq != null)
      i += pg.c(3, this.gq);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    i locali;
    label68: 
    do
    {
      d.a locala;
      do
      {
        String str;
        do
        {
          boolean bool1;
          do
          {
            return bool2;
            bool1 = paramObject instanceof i;
            bool2 = false;
          }
          while (!bool1);
          locali = (i)paramObject;
          if (this.name != null)
            break;
          str = locali.name;
          bool2 = false;
        }
        while (str != null);
        if (this.gp != null)
          break label113;
        locala = locali.gp;
        bool2 = false;
      }
      while (locala != null);
      if (this.gq != null)
        break label130;
      locald = locali.gq;
      bool2 = false;
    }
    while (locald != null);
    label113: 
    while (this.gq.equals(locali.gq))
    {
      c.d locald;
      return a(locali);
      if (this.name.equals(locali.name))
        break;
      return false;
      if (this.gp.equals(locali.gp))
        break label68;
      return false;
    }
    label130: return false;
  }

  public final int hashCode()
  {
    int i;
    int k;
    label27: int m;
    int n;
    if (this.name == null)
    {
      i = 0;
      int j = 31 * (i + 527);
      if (this.gp != null)
        break label74;
      k = 0;
      m = 31 * (k + j);
      c.d locald = this.gq;
      n = 0;
      if (locald != null)
        break label85;
    }
    while (true)
    {
      return 31 * (m + n) + qz();
      i = this.name.hashCode();
      break;
      label74: k = this.gp.hashCode();
      break label27;
      label85: n = this.gq.hashCode();
    }
  }

  public final i j(pf parampf)
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
        if (this.gp == null)
          this.gp = new d.a();
        parampf.a(this.gp);
        break;
      case 26:
      }
      if (this.gq == null)
        this.gq = new c.d();
      parampf.a(this.gq);
    }
  }

  public final i p()
  {
    this.name = "";
    this.gp = null;
    this.gq = null;
    this.awJ = null;
    this.awU = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.i
 * JD-Core Version:    0.6.2
 */