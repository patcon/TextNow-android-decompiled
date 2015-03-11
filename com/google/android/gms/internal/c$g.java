package com.google.android.gms.internal;

public final class c$g extends ph<g>
{
  private static volatile g[] fU;
  public int[] fV;
  public int[] fW;
  public int[] fX;
  public int[] fY;
  public int[] fZ;
  public int[] ga;
  public int[] gb;
  public int[] gc;
  public int[] gd;
  public int[] ge;

  public c$g()
  {
    m();
  }

  public static g[] l()
  {
    if (fU == null);
    synchronized (pl.awT)
    {
      if (fU == null)
        fU = new g[0];
      return fU;
    }
  }

  public final void a(pg parampg)
  {
    if ((this.fV != null) && (this.fV.length > 0))
      for (int i6 = 0; i6 < this.fV.length; i6++)
        parampg.s(1, this.fV[i6]);
    if ((this.fW != null) && (this.fW.length > 0))
      for (int i5 = 0; i5 < this.fW.length; i5++)
        parampg.s(2, this.fW[i5]);
    if ((this.fX != null) && (this.fX.length > 0))
      for (int i4 = 0; i4 < this.fX.length; i4++)
        parampg.s(3, this.fX[i4]);
    if ((this.fY != null) && (this.fY.length > 0))
      for (int i3 = 0; i3 < this.fY.length; i3++)
        parampg.s(4, this.fY[i3]);
    if ((this.fZ != null) && (this.fZ.length > 0))
      for (int i2 = 0; i2 < this.fZ.length; i2++)
        parampg.s(5, this.fZ[i2]);
    if ((this.ga != null) && (this.ga.length > 0))
      for (int i1 = 0; i1 < this.ga.length; i1++)
        parampg.s(6, this.ga[i1]);
    if ((this.gb != null) && (this.gb.length > 0))
      for (int n = 0; n < this.gb.length; n++)
        parampg.s(7, this.gb[n]);
    if ((this.gc != null) && (this.gc.length > 0))
      for (int m = 0; m < this.gc.length; m++)
        parampg.s(8, this.gc[m]);
    if ((this.gd != null) && (this.gd.length > 0))
      for (int k = 0; k < this.gd.length; k++)
        parampg.s(9, this.gd[k]);
    if (this.ge != null)
    {
      int i = this.ge.length;
      int j = 0;
      if (i > 0)
        while (j < this.ge.length)
        {
          parampg.s(10, this.ge[j]);
          j++;
        }
    }
    super.a(parampg);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    int i17;
    if ((this.fV != null) && (this.fV.length > 0))
    {
      int i16 = 0;
      i17 = 0;
      while (i16 < this.fV.length)
      {
        i17 += pg.gw(this.fV[i16]);
        i16++;
      }
    }
    for (int k = j + i17 + 1 * this.fV.length; ; k = j)
    {
      if ((this.fW != null) && (this.fW.length > 0))
      {
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.fW.length)
        {
          i15 += pg.gw(this.fW[i14]);
          i14++;
        }
        k = k + i15 + 1 * this.fW.length;
      }
      if ((this.fX != null) && (this.fX.length > 0))
      {
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.fX.length)
        {
          i13 += pg.gw(this.fX[i12]);
          i12++;
        }
        k = k + i13 + 1 * this.fX.length;
      }
      if ((this.fY != null) && (this.fY.length > 0))
      {
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.fY.length)
        {
          i11 += pg.gw(this.fY[i10]);
          i10++;
        }
        k = k + i11 + 1 * this.fY.length;
      }
      if ((this.fZ != null) && (this.fZ.length > 0))
      {
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.fZ.length)
        {
          i9 += pg.gw(this.fZ[i8]);
          i8++;
        }
        k = k + i9 + 1 * this.fZ.length;
      }
      if ((this.ga != null) && (this.ga.length > 0))
      {
        int i6 = 0;
        int i7 = 0;
        while (i6 < this.ga.length)
        {
          i7 += pg.gw(this.ga[i6]);
          i6++;
        }
        k = k + i7 + 1 * this.ga.length;
      }
      if ((this.gb != null) && (this.gb.length > 0))
      {
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.gb.length)
        {
          i5 += pg.gw(this.gb[i4]);
          i4++;
        }
        k = k + i5 + 1 * this.gb.length;
      }
      if ((this.gc != null) && (this.gc.length > 0))
      {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.gc.length)
        {
          i3 += pg.gw(this.gc[i2]);
          i2++;
        }
        k = k + i3 + 1 * this.gc.length;
      }
      if ((this.gd != null) && (this.gd.length > 0))
      {
        int n = 0;
        int i1 = 0;
        while (n < this.gd.length)
        {
          i1 += pg.gw(this.gd[n]);
          n++;
        }
        k = k + i1 + 1 * this.gd.length;
      }
      if ((this.ge != null) && (this.ge.length > 0))
      {
        int m = 0;
        while (i < this.ge.length)
        {
          m += pg.gw(this.ge[i]);
          i++;
        }
        k = k + m + 1 * this.ge.length;
      }
      return k;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    g localg;
    boolean bool12;
    do
    {
      boolean bool11;
      do
      {
        boolean bool10;
        do
        {
          boolean bool9;
          do
          {
            boolean bool8;
            do
            {
              boolean bool7;
              do
              {
                boolean bool6;
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
                          bool1 = paramObject instanceof g;
                          bool2 = false;
                        }
                        while (!bool1);
                        localg = (g)paramObject;
                        bool3 = pl.equals(this.fV, localg.fV);
                        bool2 = false;
                      }
                      while (!bool3);
                      bool4 = pl.equals(this.fW, localg.fW);
                      bool2 = false;
                    }
                    while (!bool4);
                    bool5 = pl.equals(this.fX, localg.fX);
                    bool2 = false;
                  }
                  while (!bool5);
                  bool6 = pl.equals(this.fY, localg.fY);
                  bool2 = false;
                }
                while (!bool6);
                bool7 = pl.equals(this.fZ, localg.fZ);
                bool2 = false;
              }
              while (!bool7);
              bool8 = pl.equals(this.ga, localg.ga);
              bool2 = false;
            }
            while (!bool8);
            bool9 = pl.equals(this.gb, localg.gb);
            bool2 = false;
          }
          while (!bool9);
          bool10 = pl.equals(this.gc, localg.gc);
          bool2 = false;
        }
        while (!bool10);
        bool11 = pl.equals(this.gd, localg.gd);
        bool2 = false;
      }
      while (!bool11);
      bool12 = pl.equals(this.ge, localg.ge);
      bool2 = false;
    }
    while (!bool12);
    return a(localg);
  }

  public final g h(pf parampf)
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
        int i55 = pq.b(parampf, 8);
        if (this.fV == null);
        int[] arrayOfInt20;
        for (int i56 = 0; ; i56 = this.fV.length)
        {
          arrayOfInt20 = new int[i55 + i56];
          if (i56 != 0)
            System.arraycopy(this.fV, 0, arrayOfInt20, 0, i56);
          while (i56 < -1 + arrayOfInt20.length)
          {
            arrayOfInt20[i56] = parampf.ql();
            parampf.qi();
            i56++;
          }
        }
        arrayOfInt20[i56] = parampf.ql();
        this.fV = arrayOfInt20;
        break;
      case 10:
        int i51 = parampf.gp(parampf.qp());
        int i52 = parampf.getPosition();
        for (int i53 = 0; parampf.qu() > 0; i53++)
          parampf.ql();
        parampf.gr(i52);
        if (this.fV == null);
        int[] arrayOfInt19;
        for (int i54 = 0; ; i54 = this.fV.length)
        {
          arrayOfInt19 = new int[i53 + i54];
          if (i54 != 0)
            System.arraycopy(this.fV, 0, arrayOfInt19, 0, i54);
          while (i54 < arrayOfInt19.length)
          {
            arrayOfInt19[i54] = parampf.ql();
            i54++;
          }
        }
        this.fV = arrayOfInt19;
        parampf.gq(i51);
        break;
      case 16:
        int i49 = pq.b(parampf, 16);
        if (this.fW == null);
        int[] arrayOfInt18;
        for (int i50 = 0; ; i50 = this.fW.length)
        {
          arrayOfInt18 = new int[i49 + i50];
          if (i50 != 0)
            System.arraycopy(this.fW, 0, arrayOfInt18, 0, i50);
          while (i50 < -1 + arrayOfInt18.length)
          {
            arrayOfInt18[i50] = parampf.ql();
            parampf.qi();
            i50++;
          }
        }
        arrayOfInt18[i50] = parampf.ql();
        this.fW = arrayOfInt18;
        break;
      case 18:
        int i45 = parampf.gp(parampf.qp());
        int i46 = parampf.getPosition();
        for (int i47 = 0; parampf.qu() > 0; i47++)
          parampf.ql();
        parampf.gr(i46);
        if (this.fW == null);
        int[] arrayOfInt17;
        for (int i48 = 0; ; i48 = this.fW.length)
        {
          arrayOfInt17 = new int[i47 + i48];
          if (i48 != 0)
            System.arraycopy(this.fW, 0, arrayOfInt17, 0, i48);
          while (i48 < arrayOfInt17.length)
          {
            arrayOfInt17[i48] = parampf.ql();
            i48++;
          }
        }
        this.fW = arrayOfInt17;
        parampf.gq(i45);
        break;
      case 24:
        int i43 = pq.b(parampf, 24);
        if (this.fX == null);
        int[] arrayOfInt16;
        for (int i44 = 0; ; i44 = this.fX.length)
        {
          arrayOfInt16 = new int[i43 + i44];
          if (i44 != 0)
            System.arraycopy(this.fX, 0, arrayOfInt16, 0, i44);
          while (i44 < -1 + arrayOfInt16.length)
          {
            arrayOfInt16[i44] = parampf.ql();
            parampf.qi();
            i44++;
          }
        }
        arrayOfInt16[i44] = parampf.ql();
        this.fX = arrayOfInt16;
        break;
      case 26:
        int i39 = parampf.gp(parampf.qp());
        int i40 = parampf.getPosition();
        for (int i41 = 0; parampf.qu() > 0; i41++)
          parampf.ql();
        parampf.gr(i40);
        if (this.fX == null);
        int[] arrayOfInt15;
        for (int i42 = 0; ; i42 = this.fX.length)
        {
          arrayOfInt15 = new int[i41 + i42];
          if (i42 != 0)
            System.arraycopy(this.fX, 0, arrayOfInt15, 0, i42);
          while (i42 < arrayOfInt15.length)
          {
            arrayOfInt15[i42] = parampf.ql();
            i42++;
          }
        }
        this.fX = arrayOfInt15;
        parampf.gq(i39);
        break;
      case 32:
        int i37 = pq.b(parampf, 32);
        if (this.fY == null);
        int[] arrayOfInt14;
        for (int i38 = 0; ; i38 = this.fY.length)
        {
          arrayOfInt14 = new int[i37 + i38];
          if (i38 != 0)
            System.arraycopy(this.fY, 0, arrayOfInt14, 0, i38);
          while (i38 < -1 + arrayOfInt14.length)
          {
            arrayOfInt14[i38] = parampf.ql();
            parampf.qi();
            i38++;
          }
        }
        arrayOfInt14[i38] = parampf.ql();
        this.fY = arrayOfInt14;
        break;
      case 34:
        int i33 = parampf.gp(parampf.qp());
        int i34 = parampf.getPosition();
        for (int i35 = 0; parampf.qu() > 0; i35++)
          parampf.ql();
        parampf.gr(i34);
        if (this.fY == null);
        int[] arrayOfInt13;
        for (int i36 = 0; ; i36 = this.fY.length)
        {
          arrayOfInt13 = new int[i35 + i36];
          if (i36 != 0)
            System.arraycopy(this.fY, 0, arrayOfInt13, 0, i36);
          while (i36 < arrayOfInt13.length)
          {
            arrayOfInt13[i36] = parampf.ql();
            i36++;
          }
        }
        this.fY = arrayOfInt13;
        parampf.gq(i33);
        break;
      case 40:
        int i31 = pq.b(parampf, 40);
        if (this.fZ == null);
        int[] arrayOfInt12;
        for (int i32 = 0; ; i32 = this.fZ.length)
        {
          arrayOfInt12 = new int[i31 + i32];
          if (i32 != 0)
            System.arraycopy(this.fZ, 0, arrayOfInt12, 0, i32);
          while (i32 < -1 + arrayOfInt12.length)
          {
            arrayOfInt12[i32] = parampf.ql();
            parampf.qi();
            i32++;
          }
        }
        arrayOfInt12[i32] = parampf.ql();
        this.fZ = arrayOfInt12;
        break;
      case 42:
        int i27 = parampf.gp(parampf.qp());
        int i28 = parampf.getPosition();
        for (int i29 = 0; parampf.qu() > 0; i29++)
          parampf.ql();
        parampf.gr(i28);
        if (this.fZ == null);
        int[] arrayOfInt11;
        for (int i30 = 0; ; i30 = this.fZ.length)
        {
          arrayOfInt11 = new int[i29 + i30];
          if (i30 != 0)
            System.arraycopy(this.fZ, 0, arrayOfInt11, 0, i30);
          while (i30 < arrayOfInt11.length)
          {
            arrayOfInt11[i30] = parampf.ql();
            i30++;
          }
        }
        this.fZ = arrayOfInt11;
        parampf.gq(i27);
        break;
      case 48:
        int i25 = pq.b(parampf, 48);
        if (this.ga == null);
        int[] arrayOfInt10;
        for (int i26 = 0; ; i26 = this.ga.length)
        {
          arrayOfInt10 = new int[i25 + i26];
          if (i26 != 0)
            System.arraycopy(this.ga, 0, arrayOfInt10, 0, i26);
          while (i26 < -1 + arrayOfInt10.length)
          {
            arrayOfInt10[i26] = parampf.ql();
            parampf.qi();
            i26++;
          }
        }
        arrayOfInt10[i26] = parampf.ql();
        this.ga = arrayOfInt10;
        break;
      case 50:
        int i21 = parampf.gp(parampf.qp());
        int i22 = parampf.getPosition();
        for (int i23 = 0; parampf.qu() > 0; i23++)
          parampf.ql();
        parampf.gr(i22);
        if (this.ga == null);
        int[] arrayOfInt9;
        for (int i24 = 0; ; i24 = this.ga.length)
        {
          arrayOfInt9 = new int[i23 + i24];
          if (i24 != 0)
            System.arraycopy(this.ga, 0, arrayOfInt9, 0, i24);
          while (i24 < arrayOfInt9.length)
          {
            arrayOfInt9[i24] = parampf.ql();
            i24++;
          }
        }
        this.ga = arrayOfInt9;
        parampf.gq(i21);
        break;
      case 56:
        int i19 = pq.b(parampf, 56);
        if (this.gb == null);
        int[] arrayOfInt8;
        for (int i20 = 0; ; i20 = this.gb.length)
        {
          arrayOfInt8 = new int[i19 + i20];
          if (i20 != 0)
            System.arraycopy(this.gb, 0, arrayOfInt8, 0, i20);
          while (i20 < -1 + arrayOfInt8.length)
          {
            arrayOfInt8[i20] = parampf.ql();
            parampf.qi();
            i20++;
          }
        }
        arrayOfInt8[i20] = parampf.ql();
        this.gb = arrayOfInt8;
        break;
      case 58:
        int i15 = parampf.gp(parampf.qp());
        int i16 = parampf.getPosition();
        for (int i17 = 0; parampf.qu() > 0; i17++)
          parampf.ql();
        parampf.gr(i16);
        if (this.gb == null);
        int[] arrayOfInt7;
        for (int i18 = 0; ; i18 = this.gb.length)
        {
          arrayOfInt7 = new int[i17 + i18];
          if (i18 != 0)
            System.arraycopy(this.gb, 0, arrayOfInt7, 0, i18);
          while (i18 < arrayOfInt7.length)
          {
            arrayOfInt7[i18] = parampf.ql();
            i18++;
          }
        }
        this.gb = arrayOfInt7;
        parampf.gq(i15);
        break;
      case 64:
        int i13 = pq.b(parampf, 64);
        if (this.gc == null);
        int[] arrayOfInt6;
        for (int i14 = 0; ; i14 = this.gc.length)
        {
          arrayOfInt6 = new int[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.gc, 0, arrayOfInt6, 0, i14);
          while (i14 < -1 + arrayOfInt6.length)
          {
            arrayOfInt6[i14] = parampf.ql();
            parampf.qi();
            i14++;
          }
        }
        arrayOfInt6[i14] = parampf.ql();
        this.gc = arrayOfInt6;
        break;
      case 66:
        int i9 = parampf.gp(parampf.qp());
        int i10 = parampf.getPosition();
        for (int i11 = 0; parampf.qu() > 0; i11++)
          parampf.ql();
        parampf.gr(i10);
        if (this.gc == null);
        int[] arrayOfInt5;
        for (int i12 = 0; ; i12 = this.gc.length)
        {
          arrayOfInt5 = new int[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.gc, 0, arrayOfInt5, 0, i12);
          while (i12 < arrayOfInt5.length)
          {
            arrayOfInt5[i12] = parampf.ql();
            i12++;
          }
        }
        this.gc = arrayOfInt5;
        parampf.gq(i9);
        break;
      case 72:
        int i7 = pq.b(parampf, 72);
        if (this.gd == null);
        int[] arrayOfInt4;
        for (int i8 = 0; ; i8 = this.gd.length)
        {
          arrayOfInt4 = new int[i7 + i8];
          if (i8 != 0)
            System.arraycopy(this.gd, 0, arrayOfInt4, 0, i8);
          while (i8 < -1 + arrayOfInt4.length)
          {
            arrayOfInt4[i8] = parampf.ql();
            parampf.qi();
            i8++;
          }
        }
        arrayOfInt4[i8] = parampf.ql();
        this.gd = arrayOfInt4;
        break;
      case 74:
        int i3 = parampf.gp(parampf.qp());
        int i4 = parampf.getPosition();
        for (int i5 = 0; parampf.qu() > 0; i5++)
          parampf.ql();
        parampf.gr(i4);
        if (this.gd == null);
        int[] arrayOfInt3;
        for (int i6 = 0; ; i6 = this.gd.length)
        {
          arrayOfInt3 = new int[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.gd, 0, arrayOfInt3, 0, i6);
          while (i6 < arrayOfInt3.length)
          {
            arrayOfInt3[i6] = parampf.ql();
            i6++;
          }
        }
        this.gd = arrayOfInt3;
        parampf.gq(i3);
        break;
      case 80:
        int i1 = pq.b(parampf, 80);
        if (this.ge == null);
        int[] arrayOfInt2;
        for (int i2 = 0; ; i2 = this.ge.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.ge, 0, arrayOfInt2, 0, i2);
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = parampf.ql();
            parampf.qi();
            i2++;
          }
        }
        arrayOfInt2[i2] = parampf.ql();
        this.ge = arrayOfInt2;
        break;
      case 82:
      }
      int j = parampf.gp(parampf.qp());
      int k = parampf.getPosition();
      for (int m = 0; parampf.qu() > 0; m++)
        parampf.ql();
      parampf.gr(k);
      if (this.ge == null);
      int[] arrayOfInt1;
      for (int n = 0; ; n = this.ge.length)
      {
        arrayOfInt1 = new int[m + n];
        if (n != 0)
          System.arraycopy(this.ge, 0, arrayOfInt1, 0, n);
        while (n < arrayOfInt1.length)
        {
          arrayOfInt1[n] = parampf.ql();
          n++;
        }
      }
      this.ge = arrayOfInt1;
      parampf.gq(j);
    }
  }

  public final int hashCode()
  {
    return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (527 + pl.hashCode(this.fV)) + pl.hashCode(this.fW)) + pl.hashCode(this.fX)) + pl.hashCode(this.fY)) + pl.hashCode(this.fZ)) + pl.hashCode(this.ga)) + pl.hashCode(this.gb)) + pl.hashCode(this.gc)) + pl.hashCode(this.gd)) + pl.hashCode(this.ge)) + qz();
  }

  public final g m()
  {
    this.fV = pq.awW;
    this.fW = pq.awW;
    this.fX = pq.awW;
    this.fY = pq.awW;
    this.fZ = pq.awW;
    this.ga = pq.awW;
    this.gb = pq.awW;
    this.gc = pq.awW;
    this.gd = pq.awW;
    this.ge = pq.awW;
    this.awJ = null;
    this.awU = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.g
 * JD-Core Version:    0.6.2
 */