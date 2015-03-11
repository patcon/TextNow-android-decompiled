package com.google.android.gms.internal;

public final class c$d extends ph<d>
{
  public d.a[] fA;
  public d.a[] fB;
  public c.c[] fC;

  public c$d()
  {
    h();
  }

  public final void a(pg parampg)
  {
    if ((this.fA != null) && (this.fA.length > 0))
      for (int m = 0; m < this.fA.length; m++)
      {
        d.a locala2 = this.fA[m];
        if (locala2 != null)
          parampg.a(1, locala2);
      }
    if ((this.fB != null) && (this.fB.length > 0))
      for (int k = 0; k < this.fB.length; k++)
      {
        d.a locala1 = this.fB[k];
        if (locala1 != null)
          parampg.a(2, locala1);
      }
    if (this.fC != null)
    {
      int i = this.fC.length;
      int j = 0;
      if (i > 0)
        while (j < this.fC.length)
        {
          c.c localc = this.fC[j];
          if (localc != null)
            parampg.a(3, localc);
          j++;
        }
    }
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if ((this.fA != null) && (this.fA.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.fA.length; i2++)
      {
        d.a locala2 = this.fA[i2];
        if (locala2 != null)
          i1 += pg.c(1, locala2);
      }
      i = i1;
    }
    if ((this.fB != null) && (this.fB.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.fB.length; n++)
      {
        d.a locala1 = this.fB[n];
        if (locala1 != null)
          m += pg.c(2, locala1);
      }
      i = m;
    }
    if (this.fC != null)
    {
      int j = this.fC.length;
      int k = 0;
      if (j > 0)
        while (k < this.fC.length)
        {
          c.c localc = this.fC[k];
          if (localc != null)
            i += pg.c(3, localc);
          k++;
        }
    }
    return i;
  }

  public final d e(pf parampf)
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
        int i1 = pq.b(parampf, 10);
        if (this.fA == null);
        d.a[] arrayOfa2;
        for (int i2 = 0; ; i2 = this.fA.length)
        {
          arrayOfa2 = new d.a[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.fA, 0, arrayOfa2, 0, i2);
          while (i2 < -1 + arrayOfa2.length)
          {
            arrayOfa2[i2] = new d.a();
            parampf.a(arrayOfa2[i2]);
            parampf.qi();
            i2++;
          }
        }
        arrayOfa2[i2] = new d.a();
        parampf.a(arrayOfa2[i2]);
        this.fA = arrayOfa2;
        break;
      case 18:
        int m = pq.b(parampf, 18);
        if (this.fB == null);
        d.a[] arrayOfa1;
        for (int n = 0; ; n = this.fB.length)
        {
          arrayOfa1 = new d.a[m + n];
          if (n != 0)
            System.arraycopy(this.fB, 0, arrayOfa1, 0, n);
          while (n < -1 + arrayOfa1.length)
          {
            arrayOfa1[n] = new d.a();
            parampf.a(arrayOfa1[n]);
            parampf.qi();
            n++;
          }
        }
        arrayOfa1[n] = new d.a();
        parampf.a(arrayOfa1[n]);
        this.fB = arrayOfa1;
        break;
      case 26:
      }
      int j = pq.b(parampf, 26);
      if (this.fC == null);
      c.c[] arrayOfc;
      for (int k = 0; ; k = this.fC.length)
      {
        arrayOfc = new c.c[j + k];
        if (k != 0)
          System.arraycopy(this.fC, 0, arrayOfc, 0, k);
        while (k < -1 + arrayOfc.length)
        {
          arrayOfc[k] = new c.c();
          parampf.a(arrayOfc[k]);
          parampf.qi();
          k++;
        }
      }
      arrayOfc[k] = new c.c();
      parampf.a(arrayOfc[k]);
      this.fC = arrayOfc;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    d locald;
    boolean bool5;
    do
    {
      boolean bool4;
      do
      {
        boolean bool3;
        do
        {
          boolean bool1;
          do
          {
            return bool2;
            bool1 = paramObject instanceof d;
            bool2 = false;
          }
          while (!bool1);
          locald = (d)paramObject;
          bool3 = pl.equals(this.fA, locald.fA);
          bool2 = false;
        }
        while (!bool3);
        bool4 = pl.equals(this.fB, locald.fB);
        bool2 = false;
      }
      while (!bool4);
      bool5 = pl.equals(this.fC, locald.fC);
      bool2 = false;
    }
    while (!bool5);
    return a(locald);
  }

  public final d h()
  {
    this.fA = d.a.r();
    this.fB = d.a.r();
    this.fC = c.c.f();
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final int hashCode()
  {
    return 31 * (31 * (31 * (527 + pl.hashCode(this.fA)) + pl.hashCode(this.fB)) + pl.hashCode(this.fC)) + qz();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.d
 * JD-Core Version:    0.6.2
 */