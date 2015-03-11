package com.google.android.gms.internal;

public final class c$h extends ph<h>
{
  public static final pi<d.a, h> gf = pi.a(11, h.class, 810);
  private static final h[] gg = new h[0];
  public int[] gh;
  public int[] gi;
  public int[] gj;
  public int gk;
  public int[] gl;
  public int gm;
  public int gn;

  public c$h()
  {
    n();
  }

  public final void a(pg parampg)
  {
    if ((this.gh != null) && (this.gh.length > 0))
      for (int n = 0; n < this.gh.length; n++)
        parampg.s(1, this.gh[n]);
    if ((this.gi != null) && (this.gi.length > 0))
      for (int m = 0; m < this.gi.length; m++)
        parampg.s(2, this.gi[m]);
    if ((this.gj != null) && (this.gj.length > 0))
      for (int k = 0; k < this.gj.length; k++)
        parampg.s(3, this.gj[k]);
    if (this.gk != 0)
      parampg.s(4, this.gk);
    if (this.gl != null)
    {
      int i = this.gl.length;
      int j = 0;
      if (i > 0)
        while (j < this.gl.length)
        {
          parampg.s(5, this.gl[j]);
          j++;
        }
    }
    if (this.gm != 0)
      parampg.s(6, this.gm);
    if (this.gn != 0)
      parampg.s(7, this.gn);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    int i5;
    if ((this.gh != null) && (this.gh.length > 0))
    {
      int i4 = 0;
      i5 = 0;
      while (i4 < this.gh.length)
      {
        i5 += pg.gw(this.gh[i4]);
        i4++;
      }
    }
    for (int k = j + i5 + 1 * this.gh.length; ; k = j)
    {
      if ((this.gi != null) && (this.gi.length > 0))
      {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.gi.length)
        {
          i3 += pg.gw(this.gi[i2]);
          i2++;
        }
        k = k + i3 + 1 * this.gi.length;
      }
      if ((this.gj != null) && (this.gj.length > 0))
      {
        int n = 0;
        int i1 = 0;
        while (n < this.gj.length)
        {
          i1 += pg.gw(this.gj[n]);
          n++;
        }
        k = k + i1 + 1 * this.gj.length;
      }
      if (this.gk != 0)
        k += pg.u(4, this.gk);
      if ((this.gl != null) && (this.gl.length > 0))
      {
        int m = 0;
        while (i < this.gl.length)
        {
          m += pg.gw(this.gl[i]);
          i++;
        }
        k = k + m + 1 * this.gl.length;
      }
      if (this.gm != 0)
        k += pg.u(6, this.gm);
      if (this.gn != 0)
        k += pg.u(7, this.gn);
      return k;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    h localh;
    int n;
    int i1;
    do
    {
      int k;
      int m;
      do
      {
        boolean bool6;
        do
        {
          int i;
          int j;
          do
          {
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
                    bool1 = paramObject instanceof h;
                    bool2 = false;
                  }
                  while (!bool1);
                  localh = (h)paramObject;
                  bool3 = pl.equals(this.gh, localh.gh);
                  bool2 = false;
                }
                while (!bool3);
                bool4 = pl.equals(this.gi, localh.gi);
                bool2 = false;
              }
              while (!bool4);
              bool5 = pl.equals(this.gj, localh.gj);
              bool2 = false;
            }
            while (!bool5);
            i = this.gk;
            j = localh.gk;
            bool2 = false;
          }
          while (i != j);
          bool6 = pl.equals(this.gl, localh.gl);
          bool2 = false;
        }
        while (!bool6);
        k = this.gm;
        m = localh.gm;
        bool2 = false;
      }
      while (k != m);
      n = this.gn;
      i1 = localh.gn;
      bool2 = false;
    }
    while (n != i1);
    return a(localh);
  }

  public final int hashCode()
  {
    return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (527 + pl.hashCode(this.gh)) + pl.hashCode(this.gi)) + pl.hashCode(this.gj)) + this.gk) + pl.hashCode(this.gl)) + this.gm) + this.gn) + qz();
  }

  public final h i(pf parampf)
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
        int i19 = pq.b(parampf, 8);
        if (this.gh == null);
        int[] arrayOfInt8;
        for (int i20 = 0; ; i20 = this.gh.length)
        {
          arrayOfInt8 = new int[i19 + i20];
          if (i20 != 0)
            System.arraycopy(this.gh, 0, arrayOfInt8, 0, i20);
          while (i20 < -1 + arrayOfInt8.length)
          {
            arrayOfInt8[i20] = parampf.ql();
            parampf.qi();
            i20++;
          }
        }
        arrayOfInt8[i20] = parampf.ql();
        this.gh = arrayOfInt8;
        break;
      case 10:
        int i15 = parampf.gp(parampf.qp());
        int i16 = parampf.getPosition();
        for (int i17 = 0; parampf.qu() > 0; i17++)
          parampf.ql();
        parampf.gr(i16);
        if (this.gh == null);
        int[] arrayOfInt7;
        for (int i18 = 0; ; i18 = this.gh.length)
        {
          arrayOfInt7 = new int[i17 + i18];
          if (i18 != 0)
            System.arraycopy(this.gh, 0, arrayOfInt7, 0, i18);
          while (i18 < arrayOfInt7.length)
          {
            arrayOfInt7[i18] = parampf.ql();
            i18++;
          }
        }
        this.gh = arrayOfInt7;
        parampf.gq(i15);
        break;
      case 16:
        int i13 = pq.b(parampf, 16);
        if (this.gi == null);
        int[] arrayOfInt6;
        for (int i14 = 0; ; i14 = this.gi.length)
        {
          arrayOfInt6 = new int[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.gi, 0, arrayOfInt6, 0, i14);
          while (i14 < -1 + arrayOfInt6.length)
          {
            arrayOfInt6[i14] = parampf.ql();
            parampf.qi();
            i14++;
          }
        }
        arrayOfInt6[i14] = parampf.ql();
        this.gi = arrayOfInt6;
        break;
      case 18:
        int i9 = parampf.gp(parampf.qp());
        int i10 = parampf.getPosition();
        for (int i11 = 0; parampf.qu() > 0; i11++)
          parampf.ql();
        parampf.gr(i10);
        if (this.gi == null);
        int[] arrayOfInt5;
        for (int i12 = 0; ; i12 = this.gi.length)
        {
          arrayOfInt5 = new int[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.gi, 0, arrayOfInt5, 0, i12);
          while (i12 < arrayOfInt5.length)
          {
            arrayOfInt5[i12] = parampf.ql();
            i12++;
          }
        }
        this.gi = arrayOfInt5;
        parampf.gq(i9);
        break;
      case 24:
        int i7 = pq.b(parampf, 24);
        if (this.gj == null);
        int[] arrayOfInt4;
        for (int i8 = 0; ; i8 = this.gj.length)
        {
          arrayOfInt4 = new int[i7 + i8];
          if (i8 != 0)
            System.arraycopy(this.gj, 0, arrayOfInt4, 0, i8);
          while (i8 < -1 + arrayOfInt4.length)
          {
            arrayOfInt4[i8] = parampf.ql();
            parampf.qi();
            i8++;
          }
        }
        arrayOfInt4[i8] = parampf.ql();
        this.gj = arrayOfInt4;
        break;
      case 26:
        int i3 = parampf.gp(parampf.qp());
        int i4 = parampf.getPosition();
        for (int i5 = 0; parampf.qu() > 0; i5++)
          parampf.ql();
        parampf.gr(i4);
        if (this.gj == null);
        int[] arrayOfInt3;
        for (int i6 = 0; ; i6 = this.gj.length)
        {
          arrayOfInt3 = new int[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.gj, 0, arrayOfInt3, 0, i6);
          while (i6 < arrayOfInt3.length)
          {
            arrayOfInt3[i6] = parampf.ql();
            i6++;
          }
        }
        this.gj = arrayOfInt3;
        parampf.gq(i3);
        break;
      case 32:
        this.gk = parampf.ql();
        break;
      case 40:
        int i1 = pq.b(parampf, 40);
        if (this.gl == null);
        int[] arrayOfInt2;
        for (int i2 = 0; ; i2 = this.gl.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.gl, 0, arrayOfInt2, 0, i2);
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = parampf.ql();
            parampf.qi();
            i2++;
          }
        }
        arrayOfInt2[i2] = parampf.ql();
        this.gl = arrayOfInt2;
        break;
      case 42:
        int j = parampf.gp(parampf.qp());
        int k = parampf.getPosition();
        for (int m = 0; parampf.qu() > 0; m++)
          parampf.ql();
        parampf.gr(k);
        if (this.gl == null);
        int[] arrayOfInt1;
        for (int n = 0; ; n = this.gl.length)
        {
          arrayOfInt1 = new int[m + n];
          if (n != 0)
            System.arraycopy(this.gl, 0, arrayOfInt1, 0, n);
          while (n < arrayOfInt1.length)
          {
            arrayOfInt1[n] = parampf.ql();
            n++;
          }
        }
        this.gl = arrayOfInt1;
        parampf.gq(j);
        break;
      case 48:
        this.gm = parampf.ql();
        break;
      case 56:
      }
      this.gn = parampf.ql();
    }
  }

  public final h n()
  {
    this.gh = pq.awW;
    this.gi = pq.awW;
    this.gj = pq.awW;
    this.gk = 0;
    this.gl = pq.awW;
    this.gm = 0;
    this.gn = 0;
    this.awJ = null;
    this.awU = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.h
 * JD-Core Version:    0.6.2
 */