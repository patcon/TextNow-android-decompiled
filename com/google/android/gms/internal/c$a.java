package com.google.android.gms.internal;

public final class c$a extends ph<a>
{
  public int fn;
  public int fo;
  public int level;

  public c$a()
  {
    b();
  }

  public final a a(pf parampf)
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
        }
        this.level = j;
        break;
      case 16:
        this.fn = parampf.ql();
        break;
      case 24:
      }
      this.fo = parampf.ql();
    }
  }

  public final void a(pg parampg)
  {
    if (this.level != 1)
      parampg.s(1, this.level);
    if (this.fn != 0)
      parampg.s(2, this.fn);
    if (this.fo != 0)
      parampg.s(3, this.fo);
    super.a(parampg);
  }

  public final a b()
  {
    this.level = 1;
    this.fn = 0;
    this.fo = 0;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  protected final int c()
  {
    int i = super.c();
    if (this.level != 1)
      i += pg.u(1, this.level);
    if (this.fn != 0)
      i += pg.u(2, this.fn);
    if (this.fo != 0)
      i += pg.u(3, this.fo);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    a locala;
    int n;
    int i1;
    do
    {
      int k;
      int m;
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
          i = this.level;
          j = locala.level;
          bool2 = false;
        }
        while (i != j);
        k = this.fn;
        m = locala.fn;
        bool2 = false;
      }
      while (k != m);
      n = this.fo;
      i1 = locala.fo;
      bool2 = false;
    }
    while (n != i1);
    return a(locala);
  }

  public final int hashCode()
  {
    return 31 * (31 * (31 * (527 + this.level) + this.fn) + this.fo) + qz();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.a
 * JD-Core Version:    0.6.2
 */