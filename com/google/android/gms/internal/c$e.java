package com.google.android.gms.internal;

public final class c$e extends ph<e>
{
  private static volatile e[] fD;
  public int key;
  public int value;

  public c$e()
  {
    j();
  }

  public static e[] i()
  {
    if (fD == null);
    synchronized (pl.awT)
    {
      if (fD == null)
        fD = new e[0];
      return fD;
    }
  }

  public final void a(pg parampg)
  {
    parampg.s(1, this.key);
    parampg.s(2, this.value);
    super.a(parampg);
  }

  protected final int c()
  {
    return super.c() + pg.u(1, this.key) + pg.u(2, this.value);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    e locale;
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
          bool1 = paramObject instanceof e;
          bool2 = false;
        }
        while (!bool1);
        locale = (e)paramObject;
        i = this.key;
        j = locale.key;
        bool2 = false;
      }
      while (i != j);
      k = this.value;
      m = locale.value;
      bool2 = false;
    }
    while (k != m);
    return a(locale);
  }

  public final e f(pf parampf)
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
        this.key = parampf.ql();
        break;
      case 16:
      }
      this.value = parampf.ql();
    }
  }

  public final int hashCode()
  {
    return 31 * (31 * (527 + this.key) + this.value) + qz();
  }

  public final e j()
  {
    this.key = 0;
    this.value = 0;
    this.awJ = null;
    this.awU = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.e
 * JD-Core Version:    0.6.2
 */