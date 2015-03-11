package com.google.android.gms.internal;

import java.util.List;

public final class c$g extends ma<g>
{
  private static volatile g[] fm;
  public int[] fn;
  public int[] fo;
  public int[] fp;
  public int[] fq;
  public int[] fr;
  public int[] fs;
  public int[] ft;
  public int[] fu;
  public int[] fv;
  public int[] fw;

  public c$g()
  {
    m();
  }

  public static g[] l()
  {
    if (fm == null);
    synchronized (mc.ana)
    {
      if (fm == null)
        fm = new g[0];
      return fm;
    }
  }

  public final void a(lz paramlz)
  {
    if ((this.fn != null) && (this.fn.length > 0))
      for (int i6 = 0; i6 < this.fn.length; i6++)
        paramlz.p(1, this.fn[i6]);
    if ((this.fo != null) && (this.fo.length > 0))
      for (int i5 = 0; i5 < this.fo.length; i5++)
        paramlz.p(2, this.fo[i5]);
    if ((this.fp != null) && (this.fp.length > 0))
      for (int i4 = 0; i4 < this.fp.length; i4++)
        paramlz.p(3, this.fp[i4]);
    if ((this.fq != null) && (this.fq.length > 0))
      for (int i3 = 0; i3 < this.fq.length; i3++)
        paramlz.p(4, this.fq[i3]);
    if ((this.fr != null) && (this.fr.length > 0))
      for (int i2 = 0; i2 < this.fr.length; i2++)
        paramlz.p(5, this.fr[i2]);
    if ((this.fs != null) && (this.fs.length > 0))
      for (int i1 = 0; i1 < this.fs.length; i1++)
        paramlz.p(6, this.fs[i1]);
    if ((this.ft != null) && (this.ft.length > 0))
      for (int n = 0; n < this.ft.length; n++)
        paramlz.p(7, this.ft[n]);
    if ((this.fu != null) && (this.fu.length > 0))
      for (int m = 0; m < this.fu.length; m++)
        paramlz.p(8, this.fu[m]);
    if ((this.fv != null) && (this.fv.length > 0))
      for (int k = 0; k < this.fv.length; k++)
        paramlz.p(9, this.fv[k]);
    if (this.fw != null)
    {
      int i = this.fw.length;
      int j = 0;
      if (i > 0)
        while (j < this.fw.length)
        {
          paramlz.p(10, this.fw[j]);
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
    if ((this.fn != null) && (this.fn.length > 0))
    {
      int i16 = 0;
      i17 = 0;
      while (i16 < this.fn.length)
      {
        i17 += lz.eE(this.fn[i16]);
        i16++;
      }
    }
    for (int k = j + i17 + 1 * this.fn.length; ; k = j)
    {
      if ((this.fo != null) && (this.fo.length > 0))
      {
        int i14 = 0;
        int i15 = 0;
        while (i14 < this.fo.length)
        {
          i15 += lz.eE(this.fo[i14]);
          i14++;
        }
        k = k + i15 + 1 * this.fo.length;
      }
      if ((this.fp != null) && (this.fp.length > 0))
      {
        int i12 = 0;
        int i13 = 0;
        while (i12 < this.fp.length)
        {
          i13 += lz.eE(this.fp[i12]);
          i12++;
        }
        k = k + i13 + 1 * this.fp.length;
      }
      if ((this.fq != null) && (this.fq.length > 0))
      {
        int i10 = 0;
        int i11 = 0;
        while (i10 < this.fq.length)
        {
          i11 += lz.eE(this.fq[i10]);
          i10++;
        }
        k = k + i11 + 1 * this.fq.length;
      }
      if ((this.fr != null) && (this.fr.length > 0))
      {
        int i8 = 0;
        int i9 = 0;
        while (i8 < this.fr.length)
        {
          i9 += lz.eE(this.fr[i8]);
          i8++;
        }
        k = k + i9 + 1 * this.fr.length;
      }
      if ((this.fs != null) && (this.fs.length > 0))
      {
        int i6 = 0;
        int i7 = 0;
        while (i6 < this.fs.length)
        {
          i7 += lz.eE(this.fs[i6]);
          i6++;
        }
        k = k + i7 + 1 * this.fs.length;
      }
      if ((this.ft != null) && (this.ft.length > 0))
      {
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.ft.length)
        {
          i5 += lz.eE(this.ft[i4]);
          i4++;
        }
        k = k + i5 + 1 * this.ft.length;
      }
      if ((this.fu != null) && (this.fu.length > 0))
      {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.fu.length)
        {
          i3 += lz.eE(this.fu[i2]);
          i2++;
        }
        k = k + i3 + 1 * this.fu.length;
      }
      if ((this.fv != null) && (this.fv.length > 0))
      {
        int n = 0;
        int i1 = 0;
        while (n < this.fv.length)
        {
          i1 += lz.eE(this.fv[n]);
          n++;
        }
        k = k + i1 + 1 * this.fv.length;
      }
      if ((this.fw != null) && (this.fw.length > 0))
      {
        int m = 0;
        while (i < this.fw.length)
        {
          m += lz.eE(this.fw[i]);
          i++;
        }
        k = k + m + 1 * this.fw.length;
      }
      return k;
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    g localg;
    do
    {
      return true;
      if (!(paramObject instanceof g))
        return false;
      localg = (g)paramObject;
      if (!mc.equals(this.fn, localg.fn))
        return false;
      if (!mc.equals(this.fo, localg.fo))
        return false;
      if (!mc.equals(this.fp, localg.fp))
        return false;
      if (!mc.equals(this.fq, localg.fq))
        return false;
      if (!mc.equals(this.fr, localg.fr))
        return false;
      if (!mc.equals(this.fs, localg.fs))
        return false;
      if (!mc.equals(this.ft, localg.ft))
        return false;
      if (!mc.equals(this.fu, localg.fu))
        return false;
      if (!mc.equals(this.fv, localg.fv))
        return false;
      if (!mc.equals(this.fw, localg.fw))
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((localg.amX == null) || (localg.amX.isEmpty()));
    return false;
    return this.amX.equals(localg.amX);
  }

  public final g h(ly paramly)
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
      case 8:
        int i55 = mh.b(paramly, 8);
        if (this.fn == null);
        int[] arrayOfInt20;
        for (int i56 = 0; ; i56 = this.fn.length)
        {
          arrayOfInt20 = new int[i55 + i56];
          if (i56 != 0)
            System.arraycopy(this.fn, 0, arrayOfInt20, 0, i56);
          while (i56 < -1 + arrayOfInt20.length)
          {
            arrayOfInt20[i56] = paramly.nE();
            paramly.nB();
            i56++;
          }
        }
        arrayOfInt20[i56] = paramly.nE();
        this.fn = arrayOfInt20;
        break;
      case 10:
        int i51 = paramly.ex(paramly.nI());
        int i52 = paramly.getPosition();
        for (int i53 = 0; paramly.nN() > 0; i53++)
          paramly.nE();
        paramly.ez(i52);
        if (this.fn == null);
        int[] arrayOfInt19;
        for (int i54 = 0; ; i54 = this.fn.length)
        {
          arrayOfInt19 = new int[i53 + i54];
          if (i54 != 0)
            System.arraycopy(this.fn, 0, arrayOfInt19, 0, i54);
          while (i54 < arrayOfInt19.length)
          {
            arrayOfInt19[i54] = paramly.nE();
            i54++;
          }
        }
        this.fn = arrayOfInt19;
        paramly.ey(i51);
        break;
      case 16:
        int i49 = mh.b(paramly, 16);
        if (this.fo == null);
        int[] arrayOfInt18;
        for (int i50 = 0; ; i50 = this.fo.length)
        {
          arrayOfInt18 = new int[i49 + i50];
          if (i50 != 0)
            System.arraycopy(this.fo, 0, arrayOfInt18, 0, i50);
          while (i50 < -1 + arrayOfInt18.length)
          {
            arrayOfInt18[i50] = paramly.nE();
            paramly.nB();
            i50++;
          }
        }
        arrayOfInt18[i50] = paramly.nE();
        this.fo = arrayOfInt18;
        break;
      case 18:
        int i45 = paramly.ex(paramly.nI());
        int i46 = paramly.getPosition();
        for (int i47 = 0; paramly.nN() > 0; i47++)
          paramly.nE();
        paramly.ez(i46);
        if (this.fo == null);
        int[] arrayOfInt17;
        for (int i48 = 0; ; i48 = this.fo.length)
        {
          arrayOfInt17 = new int[i47 + i48];
          if (i48 != 0)
            System.arraycopy(this.fo, 0, arrayOfInt17, 0, i48);
          while (i48 < arrayOfInt17.length)
          {
            arrayOfInt17[i48] = paramly.nE();
            i48++;
          }
        }
        this.fo = arrayOfInt17;
        paramly.ey(i45);
        break;
      case 24:
        int i43 = mh.b(paramly, 24);
        if (this.fp == null);
        int[] arrayOfInt16;
        for (int i44 = 0; ; i44 = this.fp.length)
        {
          arrayOfInt16 = new int[i43 + i44];
          if (i44 != 0)
            System.arraycopy(this.fp, 0, arrayOfInt16, 0, i44);
          while (i44 < -1 + arrayOfInt16.length)
          {
            arrayOfInt16[i44] = paramly.nE();
            paramly.nB();
            i44++;
          }
        }
        arrayOfInt16[i44] = paramly.nE();
        this.fp = arrayOfInt16;
        break;
      case 26:
        int i39 = paramly.ex(paramly.nI());
        int i40 = paramly.getPosition();
        for (int i41 = 0; paramly.nN() > 0; i41++)
          paramly.nE();
        paramly.ez(i40);
        if (this.fp == null);
        int[] arrayOfInt15;
        for (int i42 = 0; ; i42 = this.fp.length)
        {
          arrayOfInt15 = new int[i41 + i42];
          if (i42 != 0)
            System.arraycopy(this.fp, 0, arrayOfInt15, 0, i42);
          while (i42 < arrayOfInt15.length)
          {
            arrayOfInt15[i42] = paramly.nE();
            i42++;
          }
        }
        this.fp = arrayOfInt15;
        paramly.ey(i39);
        break;
      case 32:
        int i37 = mh.b(paramly, 32);
        if (this.fq == null);
        int[] arrayOfInt14;
        for (int i38 = 0; ; i38 = this.fq.length)
        {
          arrayOfInt14 = new int[i37 + i38];
          if (i38 != 0)
            System.arraycopy(this.fq, 0, arrayOfInt14, 0, i38);
          while (i38 < -1 + arrayOfInt14.length)
          {
            arrayOfInt14[i38] = paramly.nE();
            paramly.nB();
            i38++;
          }
        }
        arrayOfInt14[i38] = paramly.nE();
        this.fq = arrayOfInt14;
        break;
      case 34:
        int i33 = paramly.ex(paramly.nI());
        int i34 = paramly.getPosition();
        for (int i35 = 0; paramly.nN() > 0; i35++)
          paramly.nE();
        paramly.ez(i34);
        if (this.fq == null);
        int[] arrayOfInt13;
        for (int i36 = 0; ; i36 = this.fq.length)
        {
          arrayOfInt13 = new int[i35 + i36];
          if (i36 != 0)
            System.arraycopy(this.fq, 0, arrayOfInt13, 0, i36);
          while (i36 < arrayOfInt13.length)
          {
            arrayOfInt13[i36] = paramly.nE();
            i36++;
          }
        }
        this.fq = arrayOfInt13;
        paramly.ey(i33);
        break;
      case 40:
        int i31 = mh.b(paramly, 40);
        if (this.fr == null);
        int[] arrayOfInt12;
        for (int i32 = 0; ; i32 = this.fr.length)
        {
          arrayOfInt12 = new int[i31 + i32];
          if (i32 != 0)
            System.arraycopy(this.fr, 0, arrayOfInt12, 0, i32);
          while (i32 < -1 + arrayOfInt12.length)
          {
            arrayOfInt12[i32] = paramly.nE();
            paramly.nB();
            i32++;
          }
        }
        arrayOfInt12[i32] = paramly.nE();
        this.fr = arrayOfInt12;
        break;
      case 42:
        int i27 = paramly.ex(paramly.nI());
        int i28 = paramly.getPosition();
        for (int i29 = 0; paramly.nN() > 0; i29++)
          paramly.nE();
        paramly.ez(i28);
        if (this.fr == null);
        int[] arrayOfInt11;
        for (int i30 = 0; ; i30 = this.fr.length)
        {
          arrayOfInt11 = new int[i29 + i30];
          if (i30 != 0)
            System.arraycopy(this.fr, 0, arrayOfInt11, 0, i30);
          while (i30 < arrayOfInt11.length)
          {
            arrayOfInt11[i30] = paramly.nE();
            i30++;
          }
        }
        this.fr = arrayOfInt11;
        paramly.ey(i27);
        break;
      case 48:
        int i25 = mh.b(paramly, 48);
        if (this.fs == null);
        int[] arrayOfInt10;
        for (int i26 = 0; ; i26 = this.fs.length)
        {
          arrayOfInt10 = new int[i25 + i26];
          if (i26 != 0)
            System.arraycopy(this.fs, 0, arrayOfInt10, 0, i26);
          while (i26 < -1 + arrayOfInt10.length)
          {
            arrayOfInt10[i26] = paramly.nE();
            paramly.nB();
            i26++;
          }
        }
        arrayOfInt10[i26] = paramly.nE();
        this.fs = arrayOfInt10;
        break;
      case 50:
        int i21 = paramly.ex(paramly.nI());
        int i22 = paramly.getPosition();
        for (int i23 = 0; paramly.nN() > 0; i23++)
          paramly.nE();
        paramly.ez(i22);
        if (this.fs == null);
        int[] arrayOfInt9;
        for (int i24 = 0; ; i24 = this.fs.length)
        {
          arrayOfInt9 = new int[i23 + i24];
          if (i24 != 0)
            System.arraycopy(this.fs, 0, arrayOfInt9, 0, i24);
          while (i24 < arrayOfInt9.length)
          {
            arrayOfInt9[i24] = paramly.nE();
            i24++;
          }
        }
        this.fs = arrayOfInt9;
        paramly.ey(i21);
        break;
      case 56:
        int i19 = mh.b(paramly, 56);
        if (this.ft == null);
        int[] arrayOfInt8;
        for (int i20 = 0; ; i20 = this.ft.length)
        {
          arrayOfInt8 = new int[i19 + i20];
          if (i20 != 0)
            System.arraycopy(this.ft, 0, arrayOfInt8, 0, i20);
          while (i20 < -1 + arrayOfInt8.length)
          {
            arrayOfInt8[i20] = paramly.nE();
            paramly.nB();
            i20++;
          }
        }
        arrayOfInt8[i20] = paramly.nE();
        this.ft = arrayOfInt8;
        break;
      case 58:
        int i15 = paramly.ex(paramly.nI());
        int i16 = paramly.getPosition();
        for (int i17 = 0; paramly.nN() > 0; i17++)
          paramly.nE();
        paramly.ez(i16);
        if (this.ft == null);
        int[] arrayOfInt7;
        for (int i18 = 0; ; i18 = this.ft.length)
        {
          arrayOfInt7 = new int[i17 + i18];
          if (i18 != 0)
            System.arraycopy(this.ft, 0, arrayOfInt7, 0, i18);
          while (i18 < arrayOfInt7.length)
          {
            arrayOfInt7[i18] = paramly.nE();
            i18++;
          }
        }
        this.ft = arrayOfInt7;
        paramly.ey(i15);
        break;
      case 64:
        int i13 = mh.b(paramly, 64);
        if (this.fu == null);
        int[] arrayOfInt6;
        for (int i14 = 0; ; i14 = this.fu.length)
        {
          arrayOfInt6 = new int[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.fu, 0, arrayOfInt6, 0, i14);
          while (i14 < -1 + arrayOfInt6.length)
          {
            arrayOfInt6[i14] = paramly.nE();
            paramly.nB();
            i14++;
          }
        }
        arrayOfInt6[i14] = paramly.nE();
        this.fu = arrayOfInt6;
        break;
      case 66:
        int i9 = paramly.ex(paramly.nI());
        int i10 = paramly.getPosition();
        for (int i11 = 0; paramly.nN() > 0; i11++)
          paramly.nE();
        paramly.ez(i10);
        if (this.fu == null);
        int[] arrayOfInt5;
        for (int i12 = 0; ; i12 = this.fu.length)
        {
          arrayOfInt5 = new int[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.fu, 0, arrayOfInt5, 0, i12);
          while (i12 < arrayOfInt5.length)
          {
            arrayOfInt5[i12] = paramly.nE();
            i12++;
          }
        }
        this.fu = arrayOfInt5;
        paramly.ey(i9);
        break;
      case 72:
        int i7 = mh.b(paramly, 72);
        if (this.fv == null);
        int[] arrayOfInt4;
        for (int i8 = 0; ; i8 = this.fv.length)
        {
          arrayOfInt4 = new int[i7 + i8];
          if (i8 != 0)
            System.arraycopy(this.fv, 0, arrayOfInt4, 0, i8);
          while (i8 < -1 + arrayOfInt4.length)
          {
            arrayOfInt4[i8] = paramly.nE();
            paramly.nB();
            i8++;
          }
        }
        arrayOfInt4[i8] = paramly.nE();
        this.fv = arrayOfInt4;
        break;
      case 74:
        int i3 = paramly.ex(paramly.nI());
        int i4 = paramly.getPosition();
        for (int i5 = 0; paramly.nN() > 0; i5++)
          paramly.nE();
        paramly.ez(i4);
        if (this.fv == null);
        int[] arrayOfInt3;
        for (int i6 = 0; ; i6 = this.fv.length)
        {
          arrayOfInt3 = new int[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.fv, 0, arrayOfInt3, 0, i6);
          while (i6 < arrayOfInt3.length)
          {
            arrayOfInt3[i6] = paramly.nE();
            i6++;
          }
        }
        this.fv = arrayOfInt3;
        paramly.ey(i3);
        break;
      case 80:
        int i1 = mh.b(paramly, 80);
        if (this.fw == null);
        int[] arrayOfInt2;
        for (int i2 = 0; ; i2 = this.fw.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.fw, 0, arrayOfInt2, 0, i2);
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = paramly.nE();
            paramly.nB();
            i2++;
          }
        }
        arrayOfInt2[i2] = paramly.nE();
        this.fw = arrayOfInt2;
        break;
      case 82:
      }
      int j = paramly.ex(paramly.nI());
      int k = paramly.getPosition();
      for (int m = 0; paramly.nN() > 0; m++)
        paramly.nE();
      paramly.ez(k);
      if (this.fw == null);
      int[] arrayOfInt1;
      for (int n = 0; ; n = this.fw.length)
      {
        arrayOfInt1 = new int[m + n];
        if (n != 0)
          System.arraycopy(this.fw, 0, arrayOfInt1, 0, n);
        while (n < arrayOfInt1.length)
        {
          arrayOfInt1[n] = paramly.nE();
          n++;
        }
      }
      this.fw = arrayOfInt1;
      paramly.ey(j);
    }
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (31 * (527 + mc.hashCode(this.fn)) + mc.hashCode(this.fo)) + mc.hashCode(this.fp)) + mc.hashCode(this.fq)) + mc.hashCode(this.fr)) + mc.hashCode(this.fs)) + mc.hashCode(this.ft)) + mc.hashCode(this.fu)) + mc.hashCode(this.fv)) + mc.hashCode(this.fw));
    if ((this.amX == null) || (this.amX.isEmpty()));
    for (int j = 0; ; j = this.amX.hashCode())
      return j + i;
  }

  public final g m()
  {
    this.fn = mh.and;
    this.fo = mh.and;
    this.fp = mh.and;
    this.fq = mh.and;
    this.fr = mh.and;
    this.fs = mh.and;
    this.ft = mh.and;
    this.fu = mh.and;
    this.fv = mh.and;
    this.fw = mh.and;
    this.amX = null;
    this.anb = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.g
 * JD-Core Version:    0.6.2
 */