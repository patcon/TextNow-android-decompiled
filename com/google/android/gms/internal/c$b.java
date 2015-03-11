package com.google.android.gms.internal;

public final class c$b extends ph<b>
{
  private static volatile b[] fp;
  public int[] fq;
  public int fr;
  public boolean fs;
  public boolean ft;
  public int name;

  public c$b()
  {
    e();
  }

  public static b[] d()
  {
    if (fp == null);
    synchronized (pl.awT)
    {
      if (fp == null)
        fp = new b[0];
      return fp;
    }
  }

  public final void a(pg parampg)
  {
    if (this.ft)
      parampg.b(1, this.ft);
    parampg.s(2, this.fr);
    if ((this.fq != null) && (this.fq.length > 0))
      for (int i = 0; i < this.fq.length; i++)
        parampg.s(3, this.fq[i]);
    if (this.name != 0)
      parampg.s(4, this.name);
    if (this.fs)
      parampg.b(6, this.fs);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    if (this.ft)
      j += pg.c(1, this.ft);
    int k = j + pg.u(2, this.fr);
    if ((this.fq != null) && (this.fq.length > 0))
      for (int n = 0; n < this.fq.length; n++)
        i += pg.gw(this.fq[n]);
    for (int m = k + i + 1 * this.fq.length; ; m = k)
    {
      if (this.name != 0)
        m += pg.u(4, this.name);
      if (this.fs)
        m += pg.c(6, this.fs);
      return m;
    }
  }

  public final b c(pf parampf)
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
        this.ft = parampf.qm();
        break;
      case 16:
        this.fr = parampf.ql();
        break;
      case 24:
        int i1 = pq.b(parampf, 24);
        if (this.fq == null);
        int[] arrayOfInt2;
        for (int i2 = 0; ; i2 = this.fq.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.fq, 0, arrayOfInt2, 0, i2);
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = parampf.ql();
            parampf.qi();
            i2++;
          }
        }
        arrayOfInt2[i2] = parampf.ql();
        this.fq = arrayOfInt2;
        break;
      case 26:
        int j = parampf.gp(parampf.qp());
        int k = parampf.getPosition();
        for (int m = 0; parampf.qu() > 0; m++)
          parampf.ql();
        parampf.gr(k);
        if (this.fq == null);
        int[] arrayOfInt1;
        for (int n = 0; ; n = this.fq.length)
        {
          arrayOfInt1 = new int[m + n];
          if (n != 0)
            System.arraycopy(this.fq, 0, arrayOfInt1, 0, n);
          while (n < arrayOfInt1.length)
          {
            arrayOfInt1[n] = parampf.ql();
            n++;
          }
        }
        this.fq = arrayOfInt1;
        parampf.gq(j);
        break;
      case 32:
        this.name = parampf.ql();
        break;
      case 48:
      }
      this.fs = parampf.qm();
    }
  }

  public final b e()
  {
    this.fq = pq.awW;
    this.fr = 0;
    this.name = 0;
    this.fs = false;
    this.ft = false;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    b localb;
    boolean bool6;
    boolean bool7;
    do
    {
      boolean bool4;
      boolean bool5;
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
            boolean bool3;
            do
            {
              boolean bool1;
              do
              {
                return bool2;
                bool1 = paramObject instanceof b;
                bool2 = false;
              }
              while (!bool1);
              localb = (b)paramObject;
              bool3 = pl.equals(this.fq, localb.fq);
              bool2 = false;
            }
            while (!bool3);
            i = this.fr;
            j = localb.fr;
            bool2 = false;
          }
          while (i != j);
          k = this.name;
          m = localb.name;
          bool2 = false;
        }
        while (k != m);
        bool4 = this.fs;
        bool5 = localb.fs;
        bool2 = false;
      }
      while (bool4 != bool5);
      bool6 = this.ft;
      bool7 = localb.ft;
      bool2 = false;
    }
    while (bool6 != bool7);
    return a(localb);
  }

  public final int hashCode()
  {
    int i = 1231;
    int j = 31 * (31 * (31 * (527 + pl.hashCode(this.fq)) + this.fr) + this.name);
    int k;
    int m;
    if (this.fs)
    {
      k = i;
      m = 31 * (k + j);
      if (!this.ft)
        break label79;
    }
    while (true)
    {
      return 31 * (m + i) + qz();
      k = 1237;
      break;
      label79: i = 1237;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.b
 * JD-Core Version:    0.6.2
 */