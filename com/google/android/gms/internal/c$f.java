package com.google.android.gms.internal;

import java.util.List;

public final class c$f extends ma<f>
{
  public String[] eV;
  public String[] eW;
  public d.a[] eX;
  public c.e[] eY;
  public c.b[] eZ;
  public c.b[] fa;
  public c.b[] fb;
  public c.g[] fc;
  public String fd;
  public String fe;
  public String ff;
  public String fg;
  public c.a fh;
  public float fi;
  public boolean fj;
  public String[] fk;
  public int fl;

  public c$f()
  {
    k();
  }

  public static f a(byte[] paramArrayOfByte)
  {
    return (f)me.a(new f(), paramArrayOfByte);
  }

  public final void a(lz paramlz)
  {
    if ((this.eW != null) && (this.eW.length > 0))
      for (int i5 = 0; i5 < this.eW.length; i5++)
      {
        String str3 = this.eW[i5];
        if (str3 != null)
          paramlz.b(1, str3);
      }
    if ((this.eX != null) && (this.eX.length > 0))
      for (int i4 = 0; i4 < this.eX.length; i4++)
      {
        d.a locala = this.eX[i4];
        if (locala != null)
          paramlz.a(2, locala);
      }
    if ((this.eY != null) && (this.eY.length > 0))
      for (int i3 = 0; i3 < this.eY.length; i3++)
      {
        c.e locale = this.eY[i3];
        if (locale != null)
          paramlz.a(3, locale);
      }
    if ((this.eZ != null) && (this.eZ.length > 0))
      for (int i2 = 0; i2 < this.eZ.length; i2++)
      {
        c.b localb3 = this.eZ[i2];
        if (localb3 != null)
          paramlz.a(4, localb3);
      }
    if ((this.fa != null) && (this.fa.length > 0))
      for (int i1 = 0; i1 < this.fa.length; i1++)
      {
        c.b localb2 = this.fa[i1];
        if (localb2 != null)
          paramlz.a(5, localb2);
      }
    if ((this.fb != null) && (this.fb.length > 0))
      for (int n = 0; n < this.fb.length; n++)
      {
        c.b localb1 = this.fb[n];
        if (localb1 != null)
          paramlz.a(6, localb1);
      }
    if ((this.fc != null) && (this.fc.length > 0))
      for (int m = 0; m < this.fc.length; m++)
      {
        c.g localg = this.fc[m];
        if (localg != null)
          paramlz.a(7, localg);
      }
    if (!this.fd.equals(""))
      paramlz.b(9, this.fd);
    if (!this.fe.equals(""))
      paramlz.b(10, this.fe);
    if (!this.ff.equals("0"))
      paramlz.b(12, this.ff);
    if (!this.fg.equals(""))
      paramlz.b(13, this.fg);
    if (this.fh != null)
      paramlz.a(14, this.fh);
    if (Float.floatToIntBits(this.fi) != Float.floatToIntBits(0.0F))
      paramlz.b(15, this.fi);
    if ((this.fk != null) && (this.fk.length > 0))
      for (int k = 0; k < this.fk.length; k++)
      {
        String str2 = this.fk[k];
        if (str2 != null)
          paramlz.b(16, str2);
      }
    if (this.fl != 0)
      paramlz.p(17, this.fl);
    if (this.fj)
      paramlz.a(18, this.fj);
    if (this.eV != null)
    {
      int i = this.eV.length;
      int j = 0;
      if (i > 0)
        while (j < this.eV.length)
        {
          String str1 = this.eV[j];
          if (str1 != null)
            paramlz.b(19, str1);
          j++;
        }
    }
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    int i17;
    int i18;
    if ((this.eW != null) && (this.eW.length > 0))
    {
      int i16 = 0;
      i17 = 0;
      i18 = 0;
      while (i16 < this.eW.length)
      {
        String str3 = this.eW[i16];
        if (str3 != null)
        {
          i18++;
          i17 += lz.cz(str3);
        }
        i16++;
      }
    }
    for (int k = j + i17 + i18 * 1; ; k = j)
    {
      if ((this.eX != null) && (this.eX.length > 0))
      {
        int i14 = k;
        for (int i15 = 0; i15 < this.eX.length; i15++)
        {
          d.a locala = this.eX[i15];
          if (locala != null)
            i14 += lz.b(2, locala);
        }
        k = i14;
      }
      if ((this.eY != null) && (this.eY.length > 0))
      {
        int i12 = k;
        for (int i13 = 0; i13 < this.eY.length; i13++)
        {
          c.e locale = this.eY[i13];
          if (locale != null)
            i12 += lz.b(3, locale);
        }
        k = i12;
      }
      if ((this.eZ != null) && (this.eZ.length > 0))
      {
        int i10 = k;
        for (int i11 = 0; i11 < this.eZ.length; i11++)
        {
          c.b localb3 = this.eZ[i11];
          if (localb3 != null)
            i10 += lz.b(4, localb3);
        }
        k = i10;
      }
      if ((this.fa != null) && (this.fa.length > 0))
      {
        int i8 = k;
        for (int i9 = 0; i9 < this.fa.length; i9++)
        {
          c.b localb2 = this.fa[i9];
          if (localb2 != null)
            i8 += lz.b(5, localb2);
        }
        k = i8;
      }
      if ((this.fb != null) && (this.fb.length > 0))
      {
        int i6 = k;
        for (int i7 = 0; i7 < this.fb.length; i7++)
        {
          c.b localb1 = this.fb[i7];
          if (localb1 != null)
            i6 += lz.b(6, localb1);
        }
        k = i6;
      }
      if ((this.fc != null) && (this.fc.length > 0))
      {
        int i4 = k;
        for (int i5 = 0; i5 < this.fc.length; i5++)
        {
          c.g localg = this.fc[i5];
          if (localg != null)
            i4 += lz.b(7, localg);
        }
        k = i4;
      }
      if (!this.fd.equals(""))
        k += lz.h(9, this.fd);
      if (!this.fe.equals(""))
        k += lz.h(10, this.fe);
      if (!this.ff.equals("0"))
        k += lz.h(12, this.ff);
      if (!this.fg.equals(""))
        k += lz.h(13, this.fg);
      if (this.fh != null)
        k += lz.b(14, this.fh);
      if (Float.floatToIntBits(this.fi) != Float.floatToIntBits(0.0F))
        k += lz.c(15, this.fi);
      if ((this.fk != null) && (this.fk.length > 0))
      {
        int i1 = 0;
        int i2 = 0;
        int i3 = 0;
        while (i1 < this.fk.length)
        {
          String str2 = this.fk[i1];
          if (str2 != null)
          {
            i3++;
            i2 += lz.cz(str2);
          }
          i1++;
        }
        k = k + i2 + i3 * 2;
      }
      if (this.fl != 0)
        k += lz.r(17, this.fl);
      if (this.fj)
        k += lz.b(18, this.fj);
      if ((this.eV != null) && (this.eV.length > 0))
      {
        int m = 0;
        int n = 0;
        while (i < this.eV.length)
        {
          String str1 = this.eV[i];
          if (str1 != null)
          {
            n++;
            m += lz.cz(str1);
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
    if (paramObject == this);
    f localf;
    do
    {
      return true;
      if (!(paramObject instanceof f))
        return false;
      localf = (f)paramObject;
      if (!mc.equals(this.eV, localf.eV))
        return false;
      if (!mc.equals(this.eW, localf.eW))
        return false;
      if (!mc.equals(this.eX, localf.eX))
        return false;
      if (!mc.equals(this.eY, localf.eY))
        return false;
      if (!mc.equals(this.eZ, localf.eZ))
        return false;
      if (!mc.equals(this.fa, localf.fa))
        return false;
      if (!mc.equals(this.fb, localf.fb))
        return false;
      if (!mc.equals(this.fc, localf.fc))
        return false;
      if (this.fd == null)
      {
        if (localf.fd != null)
          return false;
      }
      else if (!this.fd.equals(localf.fd))
        return false;
      if (this.fe == null)
      {
        if (localf.fe != null)
          return false;
      }
      else if (!this.fe.equals(localf.fe))
        return false;
      if (this.ff == null)
      {
        if (localf.ff != null)
          return false;
      }
      else if (!this.ff.equals(localf.ff))
        return false;
      if (this.fg == null)
      {
        if (localf.fg != null)
          return false;
      }
      else if (!this.fg.equals(localf.fg))
        return false;
      if (this.fh == null)
      {
        if (localf.fh != null)
          return false;
      }
      else if (!this.fh.equals(localf.fh))
        return false;
      if (Float.floatToIntBits(this.fi) != Float.floatToIntBits(localf.fi))
        return false;
      if (this.fj != localf.fj)
        return false;
      if (!mc.equals(this.fk, localf.fk))
        return false;
      if (this.fl != localf.fl)
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((localf.amX == null) || (localf.amX.isEmpty()));
    return false;
    return this.amX.equals(localf.amX);
  }

  public final f g(ly paramly)
  {
    while (true)
    {
      int i = paramly.nB();
      switch (i)
      {
      default:
        if (a(paramly, i))
          continue;
      case 0:
        return this;
      case 10:
        int i13 = mh.b(paramly, 10);
        if (this.eW == null);
        String[] arrayOfString3;
        for (int i14 = 0; ; i14 = this.eW.length)
        {
          arrayOfString3 = new String[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.eW, 0, arrayOfString3, 0, i14);
          while (i14 < -1 + arrayOfString3.length)
          {
            arrayOfString3[i14] = paramly.readString();
            paramly.nB();
            i14++;
          }
        }
        arrayOfString3[i14] = paramly.readString();
        this.eW = arrayOfString3;
        break;
      case 18:
        int i11 = mh.b(paramly, 18);
        if (this.eX == null);
        d.a[] arrayOfa;
        for (int i12 = 0; ; i12 = this.eX.length)
        {
          arrayOfa = new d.a[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.eX, 0, arrayOfa, 0, i12);
          while (i12 < -1 + arrayOfa.length)
          {
            arrayOfa[i12] = new d.a();
            paramly.a(arrayOfa[i12]);
            paramly.nB();
            i12++;
          }
        }
        arrayOfa[i12] = new d.a();
        paramly.a(arrayOfa[i12]);
        this.eX = arrayOfa;
        break;
      case 26:
        int i9 = mh.b(paramly, 26);
        if (this.eY == null);
        c.e[] arrayOfe;
        for (int i10 = 0; ; i10 = this.eY.length)
        {
          arrayOfe = new c.e[i9 + i10];
          if (i10 != 0)
            System.arraycopy(this.eY, 0, arrayOfe, 0, i10);
          while (i10 < -1 + arrayOfe.length)
          {
            arrayOfe[i10] = new c.e();
            paramly.a(arrayOfe[i10]);
            paramly.nB();
            i10++;
          }
        }
        arrayOfe[i10] = new c.e();
        paramly.a(arrayOfe[i10]);
        this.eY = arrayOfe;
        break;
      case 34:
        int i7 = mh.b(paramly, 34);
        if (this.eZ == null);
        c.b[] arrayOfb3;
        for (int i8 = 0; ; i8 = this.eZ.length)
        {
          arrayOfb3 = new c.b[i7 + i8];
          if (i8 != 0)
            System.arraycopy(this.eZ, 0, arrayOfb3, 0, i8);
          while (i8 < -1 + arrayOfb3.length)
          {
            arrayOfb3[i8] = new c.b();
            paramly.a(arrayOfb3[i8]);
            paramly.nB();
            i8++;
          }
        }
        arrayOfb3[i8] = new c.b();
        paramly.a(arrayOfb3[i8]);
        this.eZ = arrayOfb3;
        break;
      case 42:
        int i5 = mh.b(paramly, 42);
        if (this.fa == null);
        c.b[] arrayOfb2;
        for (int i6 = 0; ; i6 = this.fa.length)
        {
          arrayOfb2 = new c.b[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.fa, 0, arrayOfb2, 0, i6);
          while (i6 < -1 + arrayOfb2.length)
          {
            arrayOfb2[i6] = new c.b();
            paramly.a(arrayOfb2[i6]);
            paramly.nB();
            i6++;
          }
        }
        arrayOfb2[i6] = new c.b();
        paramly.a(arrayOfb2[i6]);
        this.fa = arrayOfb2;
        break;
      case 50:
        int i3 = mh.b(paramly, 50);
        if (this.fb == null);
        c.b[] arrayOfb1;
        for (int i4 = 0; ; i4 = this.fb.length)
        {
          arrayOfb1 = new c.b[i3 + i4];
          if (i4 != 0)
            System.arraycopy(this.fb, 0, arrayOfb1, 0, i4);
          while (i4 < -1 + arrayOfb1.length)
          {
            arrayOfb1[i4] = new c.b();
            paramly.a(arrayOfb1[i4]);
            paramly.nB();
            i4++;
          }
        }
        arrayOfb1[i4] = new c.b();
        paramly.a(arrayOfb1[i4]);
        this.fb = arrayOfb1;
        break;
      case 58:
        int i1 = mh.b(paramly, 58);
        if (this.fc == null);
        c.g[] arrayOfg;
        for (int i2 = 0; ; i2 = this.fc.length)
        {
          arrayOfg = new c.g[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.fc, 0, arrayOfg, 0, i2);
          while (i2 < -1 + arrayOfg.length)
          {
            arrayOfg[i2] = new c.g();
            paramly.a(arrayOfg[i2]);
            paramly.nB();
            i2++;
          }
        }
        arrayOfg[i2] = new c.g();
        paramly.a(arrayOfg[i2]);
        this.fc = arrayOfg;
        break;
      case 74:
        this.fd = paramly.readString();
        break;
      case 82:
        this.fe = paramly.readString();
        break;
      case 98:
        this.ff = paramly.readString();
        break;
      case 106:
        this.fg = paramly.readString();
        break;
      case 114:
        if (this.fh == null)
          this.fh = new c.a();
        paramly.a(this.fh);
        break;
      case 125:
        this.fi = paramly.readFloat();
        break;
      case 130:
        int m = mh.b(paramly, 130);
        if (this.fk == null);
        String[] arrayOfString2;
        for (int n = 0; ; n = this.fk.length)
        {
          arrayOfString2 = new String[m + n];
          if (n != 0)
            System.arraycopy(this.fk, 0, arrayOfString2, 0, n);
          while (n < -1 + arrayOfString2.length)
          {
            arrayOfString2[n] = paramly.readString();
            paramly.nB();
            n++;
          }
        }
        arrayOfString2[n] = paramly.readString();
        this.fk = arrayOfString2;
        break;
      case 136:
        this.fl = paramly.nE();
        break;
      case 144:
        this.fj = paramly.nF();
        break;
      case 154:
      }
      int j = mh.b(paramly, 154);
      if (this.eV == null);
      String[] arrayOfString1;
      for (int k = 0; ; k = this.eV.length)
      {
        arrayOfString1 = new String[j + k];
        if (k != 0)
          System.arraycopy(this.eV, 0, arrayOfString1, 0, k);
        while (k < -1 + arrayOfString1.length)
        {
          arrayOfString1[k] = paramly.readString();
          paramly.nB();
          k++;
        }
      }
      arrayOfString1[k] = paramly.readString();
      this.eV = arrayOfString1;
    }
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (527 + mc.hashCode(this.eV)) + mc.hashCode(this.eW)) + mc.hashCode(this.eX)) + mc.hashCode(this.eY)) + mc.hashCode(this.eZ)) + mc.hashCode(this.fa)) + mc.hashCode(this.fb)) + mc.hashCode(this.fc));
    int j;
    int m;
    label118: int i1;
    label137: int i3;
    label157: int i5;
    label177: int i7;
    label210: int i8;
    int i9;
    if (this.fd == null)
    {
      j = 0;
      int k = 31 * (j + i);
      if (this.fe != null)
        break label289;
      m = 0;
      int n = 31 * (m + k);
      if (this.ff != null)
        break label301;
      i1 = 0;
      int i2 = 31 * (i1 + n);
      if (this.fg != null)
        break label313;
      i3 = 0;
      int i4 = 31 * (i3 + i2);
      if (this.fh != null)
        break label325;
      i5 = 0;
      int i6 = 31 * (31 * (i5 + i4) + Float.floatToIntBits(this.fi));
      if (!this.fj)
        break label337;
      i7 = 1231;
      i8 = 31 * (31 * (31 * (i7 + i6) + mc.hashCode(this.fk)) + this.fl);
      List localList = this.amX;
      i9 = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        i9 = 0;
        if (!bool)
          break label345;
      }
    }
    while (true)
    {
      return i8 + i9;
      j = this.fd.hashCode();
      break;
      label289: m = this.fe.hashCode();
      break label118;
      label301: i1 = this.ff.hashCode();
      break label137;
      label313: i3 = this.fg.hashCode();
      break label157;
      label325: i5 = this.fh.hashCode();
      break label177;
      label337: i7 = 1237;
      break label210;
      label345: i9 = this.amX.hashCode();
    }
  }

  public final f k()
  {
    this.eV = mh.ani;
    this.eW = mh.ani;
    this.eX = d.a.r();
    this.eY = c.e.i();
    this.eZ = c.b.d();
    this.fa = c.b.d();
    this.fb = c.b.d();
    this.fc = c.g.l();
    this.fd = "";
    this.fe = "";
    this.ff = "0";
    this.fg = "";
    this.fh = null;
    this.fi = 0.0F;
    this.fj = false;
    this.fk = mh.ani;
    this.fl = 0;
    this.amX = null;
    this.anb = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.f
 * JD-Core Version:    0.6.2
 */