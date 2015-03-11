package com.google.android.gms.internal;

import java.util.Arrays;
import java.util.List;

public final class lw$a$a$a extends ma<a>
{
  public long amA;
  public int amB;
  public int amC;
  public boolean amD;
  public lw.a[] amE;
  public lw.a.a[] amF;
  public String[] amG;
  public long[] amH;
  public float[] amI;
  public long amJ;
  public byte[] amw;
  public String amx;
  public double amy;
  public float amz;

  public lw$a$a$a()
  {
    nA();
  }

  public final void a(lz paramlz)
  {
    if (!Arrays.equals(this.amw, mh.ank))
      paramlz.a(1, this.amw);
    if (!this.amx.equals(""))
      paramlz.b(2, this.amx);
    if (Double.doubleToLongBits(this.amy) != Double.doubleToLongBits(0.0D))
      paramlz.a(3, this.amy);
    if (Float.floatToIntBits(this.amz) != Float.floatToIntBits(0.0F))
      paramlz.b(4, this.amz);
    if (this.amA != 0L)
      paramlz.b(5, this.amA);
    if (this.amB != 0)
      paramlz.p(6, this.amB);
    if (this.amC != 0)
      paramlz.q(7, this.amC);
    if (this.amD)
      paramlz.a(8, this.amD);
    if ((this.amE != null) && (this.amE.length > 0))
      for (int i1 = 0; i1 < this.amE.length; i1++)
      {
        lw.a locala1 = this.amE[i1];
        if (locala1 != null)
          paramlz.a(9, locala1);
      }
    if ((this.amF != null) && (this.amF.length > 0))
      for (int n = 0; n < this.amF.length; n++)
      {
        lw.a.a locala = this.amF[n];
        if (locala != null)
          paramlz.a(10, locala);
      }
    if ((this.amG != null) && (this.amG.length > 0))
      for (int m = 0; m < this.amG.length; m++)
      {
        String str = this.amG[m];
        if (str != null)
          paramlz.b(11, str);
      }
    if ((this.amH != null) && (this.amH.length > 0))
      for (int k = 0; k < this.amH.length; k++)
        paramlz.b(12, this.amH[k]);
    if (this.amJ != 0L)
      paramlz.b(13, this.amJ);
    if (this.amI != null)
    {
      int i = this.amI.length;
      int j = 0;
      if (i > 0)
        while (j < this.amI.length)
        {
          paramlz.b(14, this.amI[j]);
          j++;
        }
    }
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    if (!Arrays.equals(this.amw, mh.ank))
      j += lz.b(1, this.amw);
    if (!this.amx.equals(""))
      j += lz.h(2, this.amx);
    if (Double.doubleToLongBits(this.amy) != Double.doubleToLongBits(0.0D))
      j += lz.b(3, this.amy);
    if (Float.floatToIntBits(this.amz) != Float.floatToIntBits(0.0F))
      j += lz.c(4, this.amz);
    if (this.amA != 0L)
      j += lz.d(5, this.amA);
    if (this.amB != 0)
      j += lz.r(6, this.amB);
    if (this.amC != 0)
      j += lz.s(7, this.amC);
    if (this.amD)
      j += lz.b(8, this.amD);
    if ((this.amE != null) && (this.amE.length > 0))
    {
      int i4 = j;
      for (int i5 = 0; i5 < this.amE.length; i5++)
      {
        lw.a locala1 = this.amE[i5];
        if (locala1 != null)
          i4 += lz.b(9, locala1);
      }
      j = i4;
    }
    if ((this.amF != null) && (this.amF.length > 0))
    {
      int i2 = j;
      for (int i3 = 0; i3 < this.amF.length; i3++)
      {
        lw.a.a locala = this.amF[i3];
        if (locala != null)
          i2 += lz.b(10, locala);
      }
      j = i2;
    }
    if ((this.amG != null) && (this.amG.length > 0))
    {
      int m = 0;
      int n = 0;
      int i1 = 0;
      while (m < this.amG.length)
      {
        String str = this.amG[m];
        if (str != null)
        {
          i1++;
          n += lz.cz(str);
        }
        m++;
      }
      j = j + n + i1 * 1;
    }
    if ((this.amH != null) && (this.amH.length > 0))
    {
      int k = 0;
      while (i < this.amH.length)
      {
        k += lz.D(this.amH[i]);
        i++;
      }
      j = j + k + 1 * this.amH.length;
    }
    if (this.amJ != 0L)
      j += lz.d(13, this.amJ);
    if ((this.amI != null) && (this.amI.length > 0))
      j = j + 4 * this.amI.length + 1 * this.amI.length;
    return j;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    a locala;
    do
    {
      return true;
      if (!(paramObject instanceof a))
        return false;
      locala = (a)paramObject;
      if (!Arrays.equals(this.amw, locala.amw))
        return false;
      if (this.amx == null)
      {
        if (locala.amx != null)
          return false;
      }
      else if (!this.amx.equals(locala.amx))
        return false;
      if (Double.doubleToLongBits(this.amy) != Double.doubleToLongBits(locala.amy))
        return false;
      if (Float.floatToIntBits(this.amz) != Float.floatToIntBits(locala.amz))
        return false;
      if (this.amA != locala.amA)
        return false;
      if (this.amB != locala.amB)
        return false;
      if (this.amC != locala.amC)
        return false;
      if (this.amD != locala.amD)
        return false;
      if (!mc.equals(this.amE, locala.amE))
        return false;
      if (!mc.equals(this.amF, locala.amF))
        return false;
      if (!mc.equals(this.amG, locala.amG))
        return false;
      if (!mc.equals(this.amH, locala.amH))
        return false;
      if (!mc.equals(this.amI, locala.amI))
        return false;
      if (this.amJ != locala.amJ)
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((locala.amX == null) || (locala.amX.isEmpty()));
    return false;
    return this.amX.equals(locala.amX);
  }

  public final int hashCode()
  {
    int i = 31 * (527 + Arrays.hashCode(this.amw));
    int j;
    int n;
    label112: int i1;
    int i2;
    if (this.amx == null)
    {
      j = 0;
      int k = j + i;
      long l = Double.doubleToLongBits(this.amy);
      int m = 31 * (31 * (31 * (31 * (31 * (k * 31 + (int)(l ^ l >>> 32)) + Float.floatToIntBits(this.amz)) + (int)(this.amA ^ this.amA >>> 32)) + this.amB) + this.amC);
      if (!this.amD)
        break label244;
      n = 1231;
      i1 = 31 * (31 * (31 * (31 * (31 * (31 * (31 * (n + m) + mc.hashCode(this.amE)) + mc.hashCode(this.amF)) + mc.hashCode(this.amG)) + mc.hashCode(this.amH)) + mc.hashCode(this.amI)) + (int)(this.amJ ^ this.amJ >>> 32));
      List localList = this.amX;
      i2 = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        i2 = 0;
        if (!bool)
          break label252;
      }
    }
    while (true)
    {
      return i1 + i2;
      j = this.amx.hashCode();
      break;
      label244: n = 1237;
      break label112;
      label252: i2 = this.amX.hashCode();
    }
  }

  public final a nA()
  {
    this.amw = mh.ank;
    this.amx = "";
    this.amy = 0.0D;
    this.amz = 0.0F;
    this.amA = 0L;
    this.amB = 0;
    this.amC = 0;
    this.amD = false;
    this.amE = lw.a.nw();
    this.amF = lw.a.a.ny();
    this.amG = mh.ani;
    this.amH = mh.ane;
    this.amI = mh.anf;
    this.amJ = 0L;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final a t(ly paramly)
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
        this.amw = paramly.readBytes();
        break;
      case 18:
        this.amx = paramly.readString();
        break;
      case 25:
        this.amy = paramly.readDouble();
        break;
      case 37:
        this.amz = paramly.readFloat();
        break;
      case 40:
        this.amA = paramly.nD();
        break;
      case 48:
        this.amB = paramly.nE();
        break;
      case 56:
        this.amC = paramly.nG();
        break;
      case 64:
        this.amD = paramly.nF();
        break;
      case 74:
        int i13 = mh.b(paramly, 74);
        if (this.amE == null);
        lw.a[] arrayOfa1;
        for (int i14 = 0; ; i14 = this.amE.length)
        {
          arrayOfa1 = new lw.a[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.amE, 0, arrayOfa1, 0, i14);
          while (i14 < -1 + arrayOfa1.length)
          {
            arrayOfa1[i14] = new lw.a();
            paramly.a(arrayOfa1[i14]);
            paramly.nB();
            i14++;
          }
        }
        arrayOfa1[i14] = new lw.a();
        paramly.a(arrayOfa1[i14]);
        this.amE = arrayOfa1;
        break;
      case 82:
        int i11 = mh.b(paramly, 82);
        if (this.amF == null);
        lw.a.a[] arrayOfa;
        for (int i12 = 0; ; i12 = this.amF.length)
        {
          arrayOfa = new lw.a.a[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.amF, 0, arrayOfa, 0, i12);
          while (i12 < -1 + arrayOfa.length)
          {
            arrayOfa[i12] = new lw.a.a();
            paramly.a(arrayOfa[i12]);
            paramly.nB();
            i12++;
          }
        }
        arrayOfa[i12] = new lw.a.a();
        paramly.a(arrayOfa[i12]);
        this.amF = arrayOfa;
        break;
      case 90:
        int i9 = mh.b(paramly, 90);
        if (this.amG == null);
        String[] arrayOfString;
        for (int i10 = 0; ; i10 = this.amG.length)
        {
          arrayOfString = new String[i9 + i10];
          if (i10 != 0)
            System.arraycopy(this.amG, 0, arrayOfString, 0, i10);
          while (i10 < -1 + arrayOfString.length)
          {
            arrayOfString[i10] = paramly.readString();
            paramly.nB();
            i10++;
          }
        }
        arrayOfString[i10] = paramly.readString();
        this.amG = arrayOfString;
        break;
      case 96:
        int i7 = mh.b(paramly, 96);
        if (this.amH == null);
        long[] arrayOfLong2;
        for (int i8 = 0; ; i8 = this.amH.length)
        {
          arrayOfLong2 = new long[i7 + i8];
          if (i8 != 0)
            System.arraycopy(this.amH, 0, arrayOfLong2, 0, i8);
          while (i8 < -1 + arrayOfLong2.length)
          {
            arrayOfLong2[i8] = paramly.nD();
            paramly.nB();
            i8++;
          }
        }
        arrayOfLong2[i8] = paramly.nD();
        this.amH = arrayOfLong2;
        break;
      case 98:
        int i3 = paramly.ex(paramly.nI());
        int i4 = paramly.getPosition();
        for (int i5 = 0; paramly.nN() > 0; i5++)
          paramly.nD();
        paramly.ez(i4);
        if (this.amH == null);
        long[] arrayOfLong1;
        for (int i6 = 0; ; i6 = this.amH.length)
        {
          arrayOfLong1 = new long[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.amH, 0, arrayOfLong1, 0, i6);
          while (i6 < arrayOfLong1.length)
          {
            arrayOfLong1[i6] = paramly.nD();
            i6++;
          }
        }
        this.amH = arrayOfLong1;
        paramly.ey(i3);
        break;
      case 104:
        this.amJ = paramly.nD();
        break;
      case 117:
        int i1 = mh.b(paramly, 117);
        if (this.amI == null);
        float[] arrayOfFloat2;
        for (int i2 = 0; ; i2 = this.amI.length)
        {
          arrayOfFloat2 = new float[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.amI, 0, arrayOfFloat2, 0, i2);
          while (i2 < -1 + arrayOfFloat2.length)
          {
            arrayOfFloat2[i2] = paramly.readFloat();
            paramly.nB();
            i2++;
          }
        }
        arrayOfFloat2[i2] = paramly.readFloat();
        this.amI = arrayOfFloat2;
        break;
      case 114:
      }
      int j = paramly.nI();
      int k = paramly.ex(j);
      int m = j / 4;
      if (this.amI == null);
      float[] arrayOfFloat1;
      for (int n = 0; ; n = this.amI.length)
      {
        arrayOfFloat1 = new float[m + n];
        if (n != 0)
          System.arraycopy(this.amI, 0, arrayOfFloat1, 0, n);
        while (n < arrayOfFloat1.length)
        {
          arrayOfFloat1[n] = paramly.readFloat();
          n++;
        }
      }
      this.amI = arrayOfFloat1;
      paramly.ey(k);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lw.a.a.a
 * JD-Core Version:    0.6.2
 */