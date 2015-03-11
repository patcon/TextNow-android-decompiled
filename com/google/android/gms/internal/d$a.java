package com.google.android.gms.internal;

import java.util.List;

public final class d$a extends ma<a>
{
  private static volatile a[] fM;
  public String fN;
  public a[] fO;
  public a[] fP;
  public a[] fQ;
  public String fR;
  public String fS;
  public long fT;
  public boolean fU;
  public a[] fV;
  public int[] fW;
  public boolean fX;
  public int type;

  public d$a()
  {
    s();
  }

  public static a[] r()
  {
    if (fM == null);
    synchronized (mc.ana)
    {
      if (fM == null)
        fM = new a[0];
      return fM;
    }
  }

  public final void a(lz paramlz)
  {
    paramlz.p(1, this.type);
    if (!this.fN.equals(""))
      paramlz.b(2, this.fN);
    if ((this.fO != null) && (this.fO.length > 0))
      for (int i1 = 0; i1 < this.fO.length; i1++)
      {
        a locala4 = this.fO[i1];
        if (locala4 != null)
          paramlz.a(3, locala4);
      }
    if ((this.fP != null) && (this.fP.length > 0))
      for (int n = 0; n < this.fP.length; n++)
      {
        a locala3 = this.fP[n];
        if (locala3 != null)
          paramlz.a(4, locala3);
      }
    if ((this.fQ != null) && (this.fQ.length > 0))
      for (int m = 0; m < this.fQ.length; m++)
      {
        a locala2 = this.fQ[m];
        if (locala2 != null)
          paramlz.a(5, locala2);
      }
    if (!this.fR.equals(""))
      paramlz.b(6, this.fR);
    if (!this.fS.equals(""))
      paramlz.b(7, this.fS);
    if (this.fT != 0L)
      paramlz.b(8, this.fT);
    if (this.fX)
      paramlz.a(9, this.fX);
    if ((this.fW != null) && (this.fW.length > 0))
      for (int k = 0; k < this.fW.length; k++)
        paramlz.p(10, this.fW[k]);
    if (this.fV != null)
    {
      int i = this.fV.length;
      int j = 0;
      if (i > 0)
        while (j < this.fV.length)
        {
          a locala1 = this.fV[j];
          if (locala1 != null)
            paramlz.a(11, locala1);
          j++;
        }
    }
    if (this.fU)
      paramlz.a(12, this.fU);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c() + lz.r(1, this.type);
    if (!this.fN.equals(""))
      i += lz.h(2, this.fN);
    if ((this.fO != null) && (this.fO.length > 0))
    {
      int i5 = i;
      for (int i6 = 0; i6 < this.fO.length; i6++)
      {
        a locala4 = this.fO[i6];
        if (locala4 != null)
          i5 += lz.b(3, locala4);
      }
      i = i5;
    }
    if ((this.fP != null) && (this.fP.length > 0))
    {
      int i3 = i;
      for (int i4 = 0; i4 < this.fP.length; i4++)
      {
        a locala3 = this.fP[i4];
        if (locala3 != null)
          i3 += lz.b(4, locala3);
      }
      i = i3;
    }
    if ((this.fQ != null) && (this.fQ.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.fQ.length; i2++)
      {
        a locala2 = this.fQ[i2];
        if (locala2 != null)
          i1 += lz.b(5, locala2);
      }
      i = i1;
    }
    if (!this.fR.equals(""))
      i += lz.h(6, this.fR);
    if (!this.fS.equals(""))
      i += lz.h(7, this.fS);
    if (this.fT != 0L)
      i += lz.d(8, this.fT);
    if (this.fX)
      i += lz.b(9, this.fX);
    if ((this.fW != null) && (this.fW.length > 0))
    {
      int m = 0;
      int n = 0;
      while (m < this.fW.length)
      {
        n += lz.eE(this.fW[m]);
        m++;
      }
      i = i + n + 1 * this.fW.length;
    }
    if (this.fV != null)
    {
      int j = this.fV.length;
      int k = 0;
      if (j > 0)
        while (k < this.fV.length)
        {
          a locala1 = this.fV[k];
          if (locala1 != null)
            i += lz.b(11, locala1);
          k++;
        }
    }
    if (this.fU)
      i += lz.b(12, this.fU);
    return i;
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
      if (this.type != locala.type)
        return false;
      if (this.fN == null)
      {
        if (locala.fN != null)
          return false;
      }
      else if (!this.fN.equals(locala.fN))
        return false;
      if (!mc.equals(this.fO, locala.fO))
        return false;
      if (!mc.equals(this.fP, locala.fP))
        return false;
      if (!mc.equals(this.fQ, locala.fQ))
        return false;
      if (this.fR == null)
      {
        if (locala.fR != null)
          return false;
      }
      else if (!this.fR.equals(locala.fR))
        return false;
      if (this.fS == null)
      {
        if (locala.fS != null)
          return false;
      }
      else if (!this.fS.equals(locala.fS))
        return false;
      if (this.fT != locala.fT)
        return false;
      if (this.fU != locala.fU)
        return false;
      if (!mc.equals(this.fV, locala.fV))
        return false;
      if (!mc.equals(this.fW, locala.fW))
        return false;
      if (this.fX != locala.fX)
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
    int i = 1231;
    int j = 31 * (527 + this.type);
    int k;
    int n;
    label76: int i2;
    label96: int i4;
    label133: label172: int i6;
    int i7;
    if (this.fN == null)
    {
      k = 0;
      int m = 31 * (31 * (31 * (31 * (k + j) + mc.hashCode(this.fO)) + mc.hashCode(this.fP)) + mc.hashCode(this.fQ));
      if (this.fR != null)
        break label231;
      n = 0;
      int i1 = 31 * (n + m);
      if (this.fS != null)
        break label243;
      i2 = 0;
      int i3 = 31 * (31 * (i2 + i1) + (int)(this.fT ^ this.fT >>> 32));
      if (!this.fU)
        break label255;
      i4 = i;
      int i5 = 31 * (31 * (31 * (i4 + i3) + mc.hashCode(this.fV)) + mc.hashCode(this.fW));
      if (!this.fX)
        break label263;
      i6 = 31 * (i5 + i);
      List localList = this.amX;
      i7 = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        i7 = 0;
        if (!bool)
          break label270;
      }
    }
    while (true)
    {
      return i6 + i7;
      k = this.fN.hashCode();
      break;
      label231: n = this.fR.hashCode();
      break label76;
      label243: i2 = this.fS.hashCode();
      break label96;
      label255: i4 = 1237;
      break label133;
      label263: i = 1237;
      break label172;
      label270: i7 = this.amX.hashCode();
    }
  }

  public final a l(ly paramly)
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
        int i17 = paramly.nE();
        switch (i17)
        {
        default:
          break;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        }
        this.type = i17;
        break;
      case 18:
        this.fN = paramly.readString();
        break;
      case 26:
        int i15 = mh.b(paramly, 26);
        if (this.fO == null);
        a[] arrayOfa4;
        for (int i16 = 0; ; i16 = this.fO.length)
        {
          arrayOfa4 = new a[i15 + i16];
          if (i16 != 0)
            System.arraycopy(this.fO, 0, arrayOfa4, 0, i16);
          while (i16 < -1 + arrayOfa4.length)
          {
            arrayOfa4[i16] = new a();
            paramly.a(arrayOfa4[i16]);
            paramly.nB();
            i16++;
          }
        }
        arrayOfa4[i16] = new a();
        paramly.a(arrayOfa4[i16]);
        this.fO = arrayOfa4;
        break;
      case 34:
        int i13 = mh.b(paramly, 34);
        if (this.fP == null);
        a[] arrayOfa3;
        for (int i14 = 0; ; i14 = this.fP.length)
        {
          arrayOfa3 = new a[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.fP, 0, arrayOfa3, 0, i14);
          while (i14 < -1 + arrayOfa3.length)
          {
            arrayOfa3[i14] = new a();
            paramly.a(arrayOfa3[i14]);
            paramly.nB();
            i14++;
          }
        }
        arrayOfa3[i14] = new a();
        paramly.a(arrayOfa3[i14]);
        this.fP = arrayOfa3;
        break;
      case 42:
        int i11 = mh.b(paramly, 42);
        if (this.fQ == null);
        a[] arrayOfa2;
        for (int i12 = 0; ; i12 = this.fQ.length)
        {
          arrayOfa2 = new a[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.fQ, 0, arrayOfa2, 0, i12);
          while (i12 < -1 + arrayOfa2.length)
          {
            arrayOfa2[i12] = new a();
            paramly.a(arrayOfa2[i12]);
            paramly.nB();
            i12++;
          }
        }
        arrayOfa2[i12] = new a();
        paramly.a(arrayOfa2[i12]);
        this.fQ = arrayOfa2;
        break;
      case 50:
        this.fR = paramly.readString();
        break;
      case 58:
        this.fS = paramly.readString();
        break;
      case 64:
        this.fT = paramly.nD();
        break;
      case 72:
        this.fX = paramly.nF();
        break;
      case 80:
        int i5 = mh.b(paramly, 80);
        int[] arrayOfInt2 = new int[i5];
        int i6 = 0;
        int i7 = 0;
        if (i6 < i5)
        {
          if (i6 != 0)
            paramly.nB();
          int i9 = paramly.nE();
          int i10;
          switch (i9)
          {
          default:
            i10 = i7;
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:
          case 17:
          }
          while (true)
          {
            i6++;
            i7 = i10;
            break;
            i10 = i7 + 1;
            arrayOfInt2[i7] = i9;
          }
        }
        if (i7 == 0)
          continue;
        if (this.fW == null);
        for (int i8 = 0; ; i8 = this.fW.length)
        {
          if ((i8 != 0) || (i7 != arrayOfInt2.length))
            break label849;
          this.fW = arrayOfInt2;
          break;
        }
        int[] arrayOfInt3 = new int[i8 + i7];
        if (i8 != 0)
          System.arraycopy(this.fW, 0, arrayOfInt3, 0, i8);
        System.arraycopy(arrayOfInt2, 0, arrayOfInt3, i8, i7);
        this.fW = arrayOfInt3;
        break;
      case 82:
        int m = paramly.ex(paramly.nI());
        int n = paramly.getPosition();
        int i1 = 0;
        while (paramly.nN() > 0)
          switch (paramly.nE())
          {
          default:
            break;
          case 1:
          case 2:
          case 3:
          case 4:
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
          case 10:
          case 11:
          case 12:
          case 13:
          case 14:
          case 15:
          case 16:
          case 17:
            i1++;
          }
        if (i1 != 0)
        {
          paramly.ez(n);
          if (this.fW == null);
          int[] arrayOfInt1;
          for (int i2 = 0; ; i2 = this.fW.length)
          {
            arrayOfInt1 = new int[i1 + i2];
            if (i2 != 0)
              System.arraycopy(this.fW, 0, arrayOfInt1, 0, i2);
            while (paramly.nN() > 0)
            {
              int i3 = paramly.nE();
              switch (i3)
              {
              default:
                break;
              case 1:
              case 2:
              case 3:
              case 4:
              case 5:
              case 6:
              case 7:
              case 8:
              case 9:
              case 10:
              case 11:
              case 12:
              case 13:
              case 14:
              case 15:
              case 16:
              case 17:
                int i4 = i2 + 1;
                arrayOfInt1[i2] = i3;
                i2 = i4;
              }
            }
          }
          this.fW = arrayOfInt1;
        }
        paramly.ey(m);
        break;
      case 90:
        label849: int j = mh.b(paramly, 90);
        if (this.fV == null);
        a[] arrayOfa1;
        for (int k = 0; ; k = this.fV.length)
        {
          arrayOfa1 = new a[j + k];
          if (k != 0)
            System.arraycopy(this.fV, 0, arrayOfa1, 0, k);
          while (k < -1 + arrayOfa1.length)
          {
            arrayOfa1[k] = new a();
            paramly.a(arrayOfa1[k]);
            paramly.nB();
            k++;
          }
        }
        arrayOfa1[k] = new a();
        paramly.a(arrayOfa1[k]);
        this.fV = arrayOfa1;
        break;
      case 96:
      }
      this.fU = paramly.nF();
    }
  }

  public final a s()
  {
    this.type = 1;
    this.fN = "";
    this.fO = r();
    this.fP = r();
    this.fQ = r();
    this.fR = "";
    this.fS = "";
    this.fT = 0L;
    this.fU = false;
    this.fV = r();
    this.fW = mh.and;
    this.fX = false;
    this.amX = null;
    this.anb = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.d.a
 * JD-Core Version:    0.6.2
 */