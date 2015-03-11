package com.google.android.gms.internal;

import java.util.List;

public final class c$h extends ma<h>
{
  public static final mb<d.a, h> fx = mb.a(11, h.class, 810);
  private static final h[] fy = new h[0];
  public int[] fA;
  public int[] fB;
  public int fC;
  public int[] fD;
  public int fE;
  public int fF;
  public int[] fz;

  public c$h()
  {
    n();
  }

  public final void a(lz paramlz)
  {
    if ((this.fz != null) && (this.fz.length > 0))
      for (int n = 0; n < this.fz.length; n++)
        paramlz.p(1, this.fz[n]);
    if ((this.fA != null) && (this.fA.length > 0))
      for (int m = 0; m < this.fA.length; m++)
        paramlz.p(2, this.fA[m]);
    if ((this.fB != null) && (this.fB.length > 0))
      for (int k = 0; k < this.fB.length; k++)
        paramlz.p(3, this.fB[k]);
    if (this.fC != 0)
      paramlz.p(4, this.fC);
    if (this.fD != null)
    {
      int i = this.fD.length;
      int j = 0;
      if (i > 0)
        while (j < this.fD.length)
        {
          paramlz.p(5, this.fD[j]);
          j++;
        }
    }
    if (this.fE != 0)
      paramlz.p(6, this.fE);
    if (this.fF != 0)
      paramlz.p(7, this.fF);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    int i5;
    if ((this.fz != null) && (this.fz.length > 0))
    {
      int i4 = 0;
      i5 = 0;
      while (i4 < this.fz.length)
      {
        i5 += lz.eE(this.fz[i4]);
        i4++;
      }
    }
    for (int k = j + i5 + 1 * this.fz.length; ; k = j)
    {
      if ((this.fA != null) && (this.fA.length > 0))
      {
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.fA.length)
        {
          i3 += lz.eE(this.fA[i2]);
          i2++;
        }
        k = k + i3 + 1 * this.fA.length;
      }
      if ((this.fB != null) && (this.fB.length > 0))
      {
        int n = 0;
        int i1 = 0;
        while (n < this.fB.length)
        {
          i1 += lz.eE(this.fB[n]);
          n++;
        }
        k = k + i1 + 1 * this.fB.length;
      }
      if (this.fC != 0)
        k += lz.r(4, this.fC);
      if ((this.fD != null) && (this.fD.length > 0))
      {
        int m = 0;
        while (i < this.fD.length)
        {
          m += lz.eE(this.fD[i]);
          i++;
        }
        k = k + m + 1 * this.fD.length;
      }
      if (this.fE != 0)
        k += lz.r(6, this.fE);
      if (this.fF != 0)
        k += lz.r(7, this.fF);
      return k;
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    h localh;
    do
    {
      return true;
      if (!(paramObject instanceof h))
        return false;
      localh = (h)paramObject;
      if (!mc.equals(this.fz, localh.fz))
        return false;
      if (!mc.equals(this.fA, localh.fA))
        return false;
      if (!mc.equals(this.fB, localh.fB))
        return false;
      if (this.fC != localh.fC)
        return false;
      if (!mc.equals(this.fD, localh.fD))
        return false;
      if (this.fE != localh.fE)
        return false;
      if (this.fF != localh.fF)
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((localh.amX == null) || (localh.amX.isEmpty()));
    return false;
    return this.amX.equals(localh.amX);
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (527 + mc.hashCode(this.fz)) + mc.hashCode(this.fA)) + mc.hashCode(this.fB)) + this.fC) + mc.hashCode(this.fD)) + this.fE) + this.fF);
    if ((this.amX == null) || (this.amX.isEmpty()));
    for (int j = 0; ; j = this.amX.hashCode())
      return j + i;
  }

  public final h i(ly paramly)
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
        int i19 = mh.b(paramly, 8);
        if (this.fz == null);
        int[] arrayOfInt8;
        for (int i20 = 0; ; i20 = this.fz.length)
        {
          arrayOfInt8 = new int[i19 + i20];
          if (i20 != 0)
            System.arraycopy(this.fz, 0, arrayOfInt8, 0, i20);
          while (i20 < -1 + arrayOfInt8.length)
          {
            arrayOfInt8[i20] = paramly.nE();
            paramly.nB();
            i20++;
          }
        }
        arrayOfInt8[i20] = paramly.nE();
        this.fz = arrayOfInt8;
        break;
      case 10:
        int i15 = paramly.ex(paramly.nI());
        int i16 = paramly.getPosition();
        for (int i17 = 0; paramly.nN() > 0; i17++)
          paramly.nE();
        paramly.ez(i16);
        if (this.fz == null);
        int[] arrayOfInt7;
        for (int i18 = 0; ; i18 = this.fz.length)
        {
          arrayOfInt7 = new int[i17 + i18];
          if (i18 != 0)
            System.arraycopy(this.fz, 0, arrayOfInt7, 0, i18);
          while (i18 < arrayOfInt7.length)
          {
            arrayOfInt7[i18] = paramly.nE();
            i18++;
          }
        }
        this.fz = arrayOfInt7;
        paramly.ey(i15);
        break;
      case 16:
        int i13 = mh.b(paramly, 16);
        if (this.fA == null);
        int[] arrayOfInt6;
        for (int i14 = 0; ; i14 = this.fA.length)
        {
          arrayOfInt6 = new int[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.fA, 0, arrayOfInt6, 0, i14);
          while (i14 < -1 + arrayOfInt6.length)
          {
            arrayOfInt6[i14] = paramly.nE();
            paramly.nB();
            i14++;
          }
        }
        arrayOfInt6[i14] = paramly.nE();
        this.fA = arrayOfInt6;
        break;
      case 18:
        int i9 = paramly.ex(paramly.nI());
        int i10 = paramly.getPosition();
        for (int i11 = 0; paramly.nN() > 0; i11++)
          paramly.nE();
        paramly.ez(i10);
        if (this.fA == null);
        int[] arrayOfInt5;
        for (int i12 = 0; ; i12 = this.fA.length)
        {
          arrayOfInt5 = new int[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.fA, 0, arrayOfInt5, 0, i12);
          while (i12 < arrayOfInt5.length)
          {
            arrayOfInt5[i12] = paramly.nE();
            i12++;
          }
        }
        this.fA = arrayOfInt5;
        paramly.ey(i9);
        break;
      case 24:
        int i7 = mh.b(paramly, 24);
        if (this.fB == null);
        int[] arrayOfInt4;
        for (int i8 = 0; ; i8 = this.fB.length)
        {
          arrayOfInt4 = new int[i7 + i8];
          if (i8 != 0)
            System.arraycopy(this.fB, 0, arrayOfInt4, 0, i8);
          while (i8 < -1 + arrayOfInt4.length)
          {
            arrayOfInt4[i8] = paramly.nE();
            paramly.nB();
            i8++;
          }
        }
        arrayOfInt4[i8] = paramly.nE();
        this.fB = arrayOfInt4;
        break;
      case 26:
        int i3 = paramly.ex(paramly.nI());
        int i4 = paramly.getPosition();
        for (int i5 = 0; paramly.nN() > 0; i5++)
          paramly.nE();
        paramly.ez(i4);
        if (this.fB == null);
        int[] arrayOfInt3;
        for (int i6 = 0; ; i6 = this.fB.length)
        {
          arrayOfInt3 = new int[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.fB, 0, arrayOfInt3, 0, i6);
          while (i6 < arrayOfInt3.length)
          {
            arrayOfInt3[i6] = paramly.nE();
            i6++;
          }
        }
        this.fB = arrayOfInt3;
        paramly.ey(i3);
        break;
      case 32:
        this.fC = paramly.nE();
        break;
      case 40:
        int i1 = mh.b(paramly, 40);
        if (this.fD == null);
        int[] arrayOfInt2;
        for (int i2 = 0; ; i2 = this.fD.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.fD, 0, arrayOfInt2, 0, i2);
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = paramly.nE();
            paramly.nB();
            i2++;
          }
        }
        arrayOfInt2[i2] = paramly.nE();
        this.fD = arrayOfInt2;
        break;
      case 42:
        int j = paramly.ex(paramly.nI());
        int k = paramly.getPosition();
        for (int m = 0; paramly.nN() > 0; m++)
          paramly.nE();
        paramly.ez(k);
        if (this.fD == null);
        int[] arrayOfInt1;
        for (int n = 0; ; n = this.fD.length)
        {
          arrayOfInt1 = new int[m + n];
          if (n != 0)
            System.arraycopy(this.fD, 0, arrayOfInt1, 0, n);
          while (n < arrayOfInt1.length)
          {
            arrayOfInt1[n] = paramly.nE();
            n++;
          }
        }
        this.fD = arrayOfInt1;
        paramly.ey(j);
        break;
      case 48:
        this.fE = paramly.nE();
        break;
      case 56:
      }
      this.fF = paramly.nE();
    }
  }

  public final h n()
  {
    this.fz = mh.and;
    this.fA = mh.and;
    this.fB = mh.and;
    this.fC = 0;
    this.fD = mh.and;
    this.fE = 0;
    this.fF = 0;
    this.amX = null;
    this.anb = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.h
 * JD-Core Version:    0.6.2
 */