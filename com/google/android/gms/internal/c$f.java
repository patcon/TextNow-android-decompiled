package com.google.android.gms.internal;

public final class c$f extends ph<f>
{
  public String[] fE;
  public String[] fF;
  public d.a[] fG;
  public c.e[] fH;
  public c.b[] fI;
  public c.b[] fJ;
  public c.b[] fK;
  public c.g[] fL;
  public String fM;
  public String fN;
  public String fO;
  public c.a fP;
  public float fQ;
  public boolean fR;
  public String[] fS;
  public int fT;
  public String version;

  public c$f()
  {
    k();
  }

  public static f a(byte[] paramArrayOfByte)
  {
    return (f)pn.a(new f(), paramArrayOfByte);
  }

  public final void a(pg parampg)
  {
    if ((this.fF != null) && (this.fF.length > 0))
      for (int i5 = 0; i5 < this.fF.length; i5++)
      {
        String str3 = this.fF[i5];
        if (str3 != null)
          parampg.b(1, str3);
      }
    if ((this.fG != null) && (this.fG.length > 0))
      for (int i4 = 0; i4 < this.fG.length; i4++)
      {
        d.a locala = this.fG[i4];
        if (locala != null)
          parampg.a(2, locala);
      }
    if ((this.fH != null) && (this.fH.length > 0))
      for (int i3 = 0; i3 < this.fH.length; i3++)
      {
        c.e locale = this.fH[i3];
        if (locale != null)
          parampg.a(3, locale);
      }
    if ((this.fI != null) && (this.fI.length > 0))
      for (int i2 = 0; i2 < this.fI.length; i2++)
      {
        c.b localb3 = this.fI[i2];
        if (localb3 != null)
          parampg.a(4, localb3);
      }
    if ((this.fJ != null) && (this.fJ.length > 0))
      for (int i1 = 0; i1 < this.fJ.length; i1++)
      {
        c.b localb2 = this.fJ[i1];
        if (localb2 != null)
          parampg.a(5, localb2);
      }
    if ((this.fK != null) && (this.fK.length > 0))
      for (int n = 0; n < this.fK.length; n++)
      {
        c.b localb1 = this.fK[n];
        if (localb1 != null)
          parampg.a(6, localb1);
      }
    if ((this.fL != null) && (this.fL.length > 0))
      for (int m = 0; m < this.fL.length; m++)
      {
        c.g localg = this.fL[m];
        if (localg != null)
          parampg.a(7, localg);
      }
    if (!this.fM.equals(""))
      parampg.b(9, this.fM);
    if (!this.fN.equals(""))
      parampg.b(10, this.fN);
    if (!this.fO.equals("0"))
      parampg.b(12, this.fO);
    if (!this.version.equals(""))
      parampg.b(13, this.version);
    if (this.fP != null)
      parampg.a(14, this.fP);
    if (Float.floatToIntBits(this.fQ) != Float.floatToIntBits(0.0F))
      parampg.b(15, this.fQ);
    if ((this.fS != null) && (this.fS.length > 0))
      for (int k = 0; k < this.fS.length; k++)
      {
        String str2 = this.fS[k];
        if (str2 != null)
          parampg.b(16, str2);
      }
    if (this.fT != 0)
      parampg.s(17, this.fT);
    if (this.fR)
      parampg.b(18, this.fR);
    if (this.fE != null)
    {
      int i = this.fE.length;
      int j = 0;
      if (i > 0)
        while (j < this.fE.length)
        {
          String str1 = this.fE[j];
          if (str1 != null)
            parampg.b(19, str1);
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
    int i18;
    if ((this.fF != null) && (this.fF.length > 0))
    {
      int i16 = 0;
      i17 = 0;
      i18 = 0;
      while (i16 < this.fF.length)
      {
        String str3 = this.fF[i16];
        if (str3 != null)
        {
          i18++;
          i17 += pg.di(str3);
        }
        i16++;
      }
    }
    for (int k = j + i17 + i18 * 1; ; k = j)
    {
      if ((this.fG != null) && (this.fG.length > 0))
      {
        int i14 = k;
        for (int i15 = 0; i15 < this.fG.length; i15++)
        {
          d.a locala = this.fG[i15];
          if (locala != null)
            i14 += pg.c(2, locala);
        }
        k = i14;
      }
      if ((this.fH != null) && (this.fH.length > 0))
      {
        int i12 = k;
        for (int i13 = 0; i13 < this.fH.length; i13++)
        {
          c.e locale = this.fH[i13];
          if (locale != null)
            i12 += pg.c(3, locale);
        }
        k = i12;
      }
      if ((this.fI != null) && (this.fI.length > 0))
      {
        int i10 = k;
        for (int i11 = 0; i11 < this.fI.length; i11++)
        {
          c.b localb3 = this.fI[i11];
          if (localb3 != null)
            i10 += pg.c(4, localb3);
        }
        k = i10;
      }
      if ((this.fJ != null) && (this.fJ.length > 0))
      {
        int i8 = k;
        for (int i9 = 0; i9 < this.fJ.length; i9++)
        {
          c.b localb2 = this.fJ[i9];
          if (localb2 != null)
            i8 += pg.c(5, localb2);
        }
        k = i8;
      }
      if ((this.fK != null) && (this.fK.length > 0))
      {
        int i6 = k;
        for (int i7 = 0; i7 < this.fK.length; i7++)
        {
          c.b localb1 = this.fK[i7];
          if (localb1 != null)
            i6 += pg.c(6, localb1);
        }
        k = i6;
      }
      if ((this.fL != null) && (this.fL.length > 0))
      {
        int i4 = k;
        for (int i5 = 0; i5 < this.fL.length; i5++)
        {
          c.g localg = this.fL[i5];
          if (localg != null)
            i4 += pg.c(7, localg);
        }
        k = i4;
      }
      if (!this.fM.equals(""))
        k += pg.j(9, this.fM);
      if (!this.fN.equals(""))
        k += pg.j(10, this.fN);
      if (!this.fO.equals("0"))
        k += pg.j(12, this.fO);
      if (!this.version.equals(""))
        k += pg.j(13, this.version);
      if (this.fP != null)
        k += pg.c(14, this.fP);
      if (Float.floatToIntBits(this.fQ) != Float.floatToIntBits(0.0F))
        k += pg.c(15, this.fQ);
      if ((this.fS != null) && (this.fS.length > 0))
      {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i1 < this.fS.length)
        {
          String str2 = this.fS[i1];
          if (str2 != null)
          {
            i3++;
            i2 += pg.di(str2);
          }
          i1++;
        }
        k = k + i2 + i3 * 2;
      }
      if (this.fT != 0)
        k += pg.u(17, this.fT);
      if (this.fR)
        k += pg.c(18, this.fR);
      if ((this.fE != null) && (this.fE.length > 0))
      {
        int m = 0;
        int n = 0;
        while (i < this.fE.length)
        {
          String str1 = this.fE[i];
          if (str1 != null)
          {
            n++;
            m += pg.di(str1);
          }
          i++;
        }
        k = k + m + n * 2;
      }
      return k;
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    f localf;
    label215: label236: 
    do
    {
      String str1;
      do
      {
        String str2;
        do
        {
          String str3;
          do
          {
            String str4;
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
                                bool1 = paramObject instanceof f;
                                bool2 = false;
                              }
                              while (!bool1);
                              localf = (f)paramObject;
                              bool3 = pl.equals(this.fE, localf.fE);
                              bool2 = false;
                            }
                            while (!bool3);
                            bool4 = pl.equals(this.fF, localf.fF);
                            bool2 = false;
                          }
                          while (!bool4);
                          bool5 = pl.equals(this.fG, localf.fG);
                          bool2 = false;
                        }
                        while (!bool5);
                        bool6 = pl.equals(this.fH, localf.fH);
                        bool2 = false;
                      }
                      while (!bool6);
                      bool7 = pl.equals(this.fI, localf.fI);
                      bool2 = false;
                    }
                    while (!bool7);
                    bool8 = pl.equals(this.fJ, localf.fJ);
                    bool2 = false;
                  }
                  while (!bool8);
                  bool9 = pl.equals(this.fK, localf.fK);
                  bool2 = false;
                }
                while (!bool9);
                bool10 = pl.equals(this.fL, localf.fL);
                bool2 = false;
              }
              while (!bool10);
              if (this.fM != null)
                break;
              str4 = localf.fM;
              bool2 = false;
            }
            while (str4 != null);
            if (this.fN != null)
              break label416;
            str3 = localf.fN;
            bool2 = false;
          }
          while (str3 != null);
          if (this.fO != null)
            break label433;
          str2 = localf.fO;
          bool2 = false;
        }
        while (str2 != null);
        if (this.version != null)
          break label450;
        str1 = localf.version;
        bool2 = false;
      }
      while (str1 != null);
      if (this.fP != null)
        break label467;
      locala = localf.fP;
      bool2 = false;
    }
    while (locala != null);
    label257: label278: label416: label433: label450: label467: 
    while (this.fP.equals(localf.fP))
    {
      c.a locala;
      int i = Float.floatToIntBits(this.fQ);
      int j = Float.floatToIntBits(localf.fQ);
      bool2 = false;
      if (i != j)
        break;
      boolean bool11 = this.fR;
      boolean bool12 = localf.fR;
      bool2 = false;
      if (bool11 != bool12)
        break;
      boolean bool13 = pl.equals(this.fS, localf.fS);
      bool2 = false;
      if (!bool13)
        break;
      int k = this.fT;
      int m = localf.fT;
      bool2 = false;
      if (k != m)
        break;
      return a(localf);
      if (this.fM.equals(localf.fM))
        break label215;
      return false;
      if (this.fN.equals(localf.fN))
        break label236;
      return false;
      if (this.fO.equals(localf.fO))
        break label257;
      return false;
      if (this.version.equals(localf.version))
        break label278;
      return false;
    }
    return false;
  }

  public final f g(pf parampf)
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
        int i13 = pq.b(parampf, 10);
        if (this.fF == null);
        String[] arrayOfString3;
        for (int i14 = 0; ; i14 = this.fF.length)
        {
          arrayOfString3 = new String[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.fF, 0, arrayOfString3, 0, i14);
          while (i14 < -1 + arrayOfString3.length)
          {
            arrayOfString3[i14] = parampf.readString();
            parampf.qi();
            i14++;
          }
        }
        arrayOfString3[i14] = parampf.readString();
        this.fF = arrayOfString3;
        break;
      case 18:
        int i11 = pq.b(parampf, 18);
        if (this.fG == null);
        d.a[] arrayOfa;
        for (int i12 = 0; ; i12 = this.fG.length)
        {
          arrayOfa = new d.a[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.fG, 0, arrayOfa, 0, i12);
          while (i12 < -1 + arrayOfa.length)
          {
            arrayOfa[i12] = new d.a();
            parampf.a(arrayOfa[i12]);
            parampf.qi();
            i12++;
          }
        }
        arrayOfa[i12] = new d.a();
        parampf.a(arrayOfa[i12]);
        this.fG = arrayOfa;
        break;
      case 26:
        int i9 = pq.b(parampf, 26);
        if (this.fH == null);
        c.e[] arrayOfe;
        for (int i10 = 0; ; i10 = this.fH.length)
        {
          arrayOfe = new c.e[i9 + i10];
          if (i10 != 0)
            System.arraycopy(this.fH, 0, arrayOfe, 0, i10);
          while (i10 < -1 + arrayOfe.length)
          {
            arrayOfe[i10] = new c.e();
            parampf.a(arrayOfe[i10]);
            parampf.qi();
            i10++;
          }
        }
        arrayOfe[i10] = new c.e();
        parampf.a(arrayOfe[i10]);
        this.fH = arrayOfe;
        break;
      case 34:
        int i7 = pq.b(parampf, 34);
        if (this.fI == null);
        c.b[] arrayOfb3;
        for (int i8 = 0; ; i8 = this.fI.length)
        {
          arrayOfb3 = new c.b[i7 + i8];
          if (i8 != 0)
            System.arraycopy(this.fI, 0, arrayOfb3, 0, i8);
          while (i8 < -1 + arrayOfb3.length)
          {
            arrayOfb3[i8] = new c.b();
            parampf.a(arrayOfb3[i8]);
            parampf.qi();
            i8++;
          }
        }
        arrayOfb3[i8] = new c.b();
        parampf.a(arrayOfb3[i8]);
        this.fI = arrayOfb3;
        break;
      case 42:
        int i5 = pq.b(parampf, 42);
        if (this.fJ == null);
        c.b[] arrayOfb2;
        for (int i6 = 0; ; i6 = this.fJ.length)
        {
          arrayOfb2 = new c.b[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.fJ, 0, arrayOfb2, 0, i6);
          while (i6 < -1 + arrayOfb2.length)
          {
            arrayOfb2[i6] = new c.b();
            parampf.a(arrayOfb2[i6]);
            parampf.qi();
            i6++;
          }
        }
        arrayOfb2[i6] = new c.b();
        parampf.a(arrayOfb2[i6]);
        this.fJ = arrayOfb2;
        break;
      case 50:
        int i3 = pq.b(parampf, 50);
        if (this.fK == null);
        c.b[] arrayOfb1;
        for (int i4 = 0; ; i4 = this.fK.length)
        {
          arrayOfb1 = new c.b[i3 + i4];
          if (i4 != 0)
            System.arraycopy(this.fK, 0, arrayOfb1, 0, i4);
          while (i4 < -1 + arrayOfb1.length)
          {
            arrayOfb1[i4] = new c.b();
            parampf.a(arrayOfb1[i4]);
            parampf.qi();
            i4++;
          }
        }
        arrayOfb1[i4] = new c.b();
        parampf.a(arrayOfb1[i4]);
        this.fK = arrayOfb1;
        break;
      case 58:
        int i1 = pq.b(parampf, 58);
        if (this.fL == null);
        c.g[] arrayOfg;
        for (int i2 = 0; ; i2 = this.fL.length)
        {
          arrayOfg = new c.g[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.fL, 0, arrayOfg, 0, i2);
          while (i2 < -1 + arrayOfg.length)
          {
            arrayOfg[i2] = new c.g();
            parampf.a(arrayOfg[i2]);
            parampf.qi();
            i2++;
          }
        }
        arrayOfg[i2] = new c.g();
        parampf.a(arrayOfg[i2]);
        this.fL = arrayOfg;
        break;
      case 74:
        this.fM = parampf.readString();
        break;
      case 82:
        this.fN = parampf.readString();
        break;
      case 98:
        this.fO = parampf.readString();
        break;
      case 106:
        this.version = parampf.readString();
        break;
      case 114:
        if (this.fP == null)
          this.fP = new c.a();
        parampf.a(this.fP);
        break;
      case 125:
        this.fQ = parampf.readFloat();
        break;
      case 130:
        int m = pq.b(parampf, 130);
        if (this.fS == null);
        String[] arrayOfString2;
        for (int n = 0; ; n = this.fS.length)
        {
          arrayOfString2 = new String[m + n];
          if (n != 0)
            System.arraycopy(this.fS, 0, arrayOfString2, 0, n);
          while (n < -1 + arrayOfString2.length)
          {
            arrayOfString2[n] = parampf.readString();
            parampf.qi();
            n++;
          }
        }
        arrayOfString2[n] = parampf.readString();
        this.fS = arrayOfString2;
        break;
      case 136:
        this.fT = parampf.ql();
        break;
      case 144:
        this.fR = parampf.qm();
        break;
      case 154:
      }
      int j = pq.b(parampf, 154);
      if (this.fE == null);
      String[] arrayOfString1;
      for (int k = 0; ; k = this.fE.length)
      {
        arrayOfString1 = new String[j + k];
        if (k != 0)
          System.arraycopy(this.fE, 0, arrayOfString1, 0, k);
        while (k < -1 + arrayOfString1.length)
        {
          arrayOfString1[k] = parampf.readString();
          parampf.qi();
          k++;
        }
      }
      arrayOfString1[k] = parampf.readString();
      this.fE = arrayOfString1;
    }
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (527 + pl.hashCode(this.fE)) + pl.hashCode(this.fF)) + pl.hashCode(this.fG)) + pl.hashCode(this.fH)) + pl.hashCode(this.fI)) + pl.hashCode(this.fJ)) + pl.hashCode(this.fK)) + pl.hashCode(this.fL));
    int j;
    int m;
    label118: int i1;
    label137: int i3;
    label157: int i5;
    label181: int i6;
    if (this.fM == null)
    {
      j = 0;
      int k = 31 * (j + i);
      if (this.fN != null)
        break label258;
      m = 0;
      int n = 31 * (m + k);
      if (this.fO != null)
        break label270;
      i1 = 0;
      int i2 = 31 * (i1 + n);
      if (this.version != null)
        break label282;
      i3 = 0;
      int i4 = 31 * (i3 + i2);
      c.a locala = this.fP;
      i5 = 0;
      if (locala != null)
        break label294;
      i6 = 31 * (31 * (i4 + i5) + Float.floatToIntBits(this.fQ));
      if (!this.fR)
        break label306;
    }
    label258: label270: label282: label294: label306: for (int i7 = 1231; ; i7 = 1237)
    {
      return 31 * (31 * (31 * (i7 + i6) + pl.hashCode(this.fS)) + this.fT) + qz();
      j = this.fM.hashCode();
      break;
      m = this.fN.hashCode();
      break label118;
      i1 = this.fO.hashCode();
      break label137;
      i3 = this.version.hashCode();
      break label157;
      i5 = this.fP.hashCode();
      break label181;
    }
  }

  public final f k()
  {
    this.fE = pq.axb;
    this.fF = pq.axb;
    this.fG = d.a.r();
    this.fH = c.e.i();
    this.fI = c.b.d();
    this.fJ = c.b.d();
    this.fK = c.b.d();
    this.fL = c.g.l();
    this.fM = "";
    this.fN = "";
    this.fO = "0";
    this.version = "";
    this.fP = null;
    this.fQ = 0.0F;
    this.fR = false;
    this.fS = pq.axb;
    this.fT = 0;
    this.awJ = null;
    this.awU = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.f
 * JD-Core Version:    0.6.2
 */