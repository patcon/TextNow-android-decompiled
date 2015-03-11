package com.google.android.gms.internal;

public final class pr$a extends ph<a>
{
  public String[] axe;
  public String[] axf;
  public int[] axg;

  public pr$a()
  {
    qJ();
  }

  public final void a(pg parampg)
  {
    if ((this.axe != null) && (this.axe.length > 0))
      for (int m = 0; m < this.axe.length; m++)
      {
        String str2 = this.axe[m];
        if (str2 != null)
          parampg.b(1, str2);
      }
    if ((this.axf != null) && (this.axf.length > 0))
      for (int k = 0; k < this.axf.length; k++)
      {
        String str1 = this.axf[k];
        if (str1 != null)
          parampg.b(2, str1);
      }
    if (this.axg != null)
    {
      int i = this.axg.length;
      int j = 0;
      if (i > 0)
        while (j < this.axg.length)
        {
          parampg.s(3, this.axg[j]);
          j++;
        }
    }
    super.a(parampg);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    int i4;
    int i5;
    if ((this.axe != null) && (this.axe.length > 0))
    {
      int i3 = 0;
      i4 = 0;
      i5 = 0;
      while (i3 < this.axe.length)
      {
        String str2 = this.axe[i3];
        if (str2 != null)
        {
          i5++;
          i4 += pg.di(str2);
        }
        i3++;
      }
    }
    for (int k = j + i4 + i5 * 1; ; k = j)
    {
      if ((this.axf != null) && (this.axf.length > 0))
      {
        int n = 0;
        int i1 = 0;
        int i2 = 0;
        while (n < this.axf.length)
        {
          String str1 = this.axf[n];
          if (str1 != null)
          {
            i2++;
            i1 += pg.di(str1);
          }
          n++;
        }
        k = k + i1 + i2 * 1;
      }
      if ((this.axg != null) && (this.axg.length > 0))
      {
        int m = 0;
        while (i < this.axg.length)
        {
          m += pg.gw(this.axg[i]);
          i++;
        }
        k = k + m + 1 * this.axg.length;
      }
      return k;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    a locala;
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
            bool1 = paramObject instanceof a;
            bool2 = false;
          }
          while (!bool1);
          locala = (a)paramObject;
          bool3 = pl.equals(this.axe, locala.axe);
          bool2 = false;
        }
        while (!bool3);
        bool4 = pl.equals(this.axf, locala.axf);
        bool2 = false;
      }
      while (!bool4);
      bool5 = pl.equals(this.axg, locala.axg);
      bool2 = false;
    }
    while (!bool5);
    return a(locala);
  }

  public final int hashCode()
  {
    return 31 * (31 * (31 * (527 + pl.hashCode(this.axe)) + pl.hashCode(this.axf)) + pl.hashCode(this.axg)) + qz();
  }

  public final a qJ()
  {
    this.axe = pq.axb;
    this.axf = pq.axb;
    this.axg = pq.awW;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final a v(pf parampf)
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
        int i5 = pq.b(parampf, 10);
        if (this.axe == null);
        String[] arrayOfString2;
        for (int i6 = 0; ; i6 = this.axe.length)
        {
          arrayOfString2 = new String[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.axe, 0, arrayOfString2, 0, i6);
          while (i6 < -1 + arrayOfString2.length)
          {
            arrayOfString2[i6] = parampf.readString();
            parampf.qi();
            i6++;
          }
        }
        arrayOfString2[i6] = parampf.readString();
        this.axe = arrayOfString2;
        break;
      case 18:
        int i3 = pq.b(parampf, 18);
        if (this.axf == null);
        String[] arrayOfString1;
        for (int i4 = 0; ; i4 = this.axf.length)
        {
          arrayOfString1 = new String[i3 + i4];
          if (i4 != 0)
            System.arraycopy(this.axf, 0, arrayOfString1, 0, i4);
          while (i4 < -1 + arrayOfString1.length)
          {
            arrayOfString1[i4] = parampf.readString();
            parampf.qi();
            i4++;
          }
        }
        arrayOfString1[i4] = parampf.readString();
        this.axf = arrayOfString1;
        break;
      case 24:
        int i1 = pq.b(parampf, 24);
        if (this.axg == null);
        int[] arrayOfInt2;
        for (int i2 = 0; ; i2 = this.axg.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.axg, 0, arrayOfInt2, 0, i2);
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = parampf.ql();
            parampf.qi();
            i2++;
          }
        }
        arrayOfInt2[i2] = parampf.ql();
        this.axg = arrayOfInt2;
        break;
      case 26:
      }
      int j = parampf.gp(parampf.qp());
      int k = parampf.getPosition();
      for (int m = 0; parampf.qu() > 0; m++)
        parampf.ql();
      parampf.gr(k);
      if (this.axg == null);
      int[] arrayOfInt1;
      for (int n = 0; ; n = this.axg.length)
      {
        arrayOfInt1 = new int[m + n];
        if (n != 0)
          System.arraycopy(this.axg, 0, arrayOfInt1, 0, n);
        while (n < arrayOfInt1.length)
        {
          arrayOfInt1[n] = parampf.ql();
          n++;
        }
      }
      this.axg = arrayOfInt1;
      parampf.gq(j);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pr.a
 * JD-Core Version:    0.6.2
 */