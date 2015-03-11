package com.google.android.gms.internal;

import java.util.Arrays;

public final class pd$a$a$a extends ph<a>
{
  public byte[] awi;
  public String awj;
  public double awk;
  public float awl;
  public long awm;
  public int awn;
  public int awo;
  public boolean awp;
  public pd.a[] awq;
  public pd.a.a[] awr;
  public String[] aws;
  public long[] awt;
  public float[] awu;
  public long awv;

  public pd$a$a$a()
  {
    qh();
  }

  public final void a(pg parampg)
  {
    if (!Arrays.equals(this.awi, pq.axd))
      parampg.a(1, this.awi);
    if (!this.awj.equals(""))
      parampg.b(2, this.awj);
    if (Double.doubleToLongBits(this.awk) != Double.doubleToLongBits(0.0D))
      parampg.a(3, this.awk);
    if (Float.floatToIntBits(this.awl) != Float.floatToIntBits(0.0F))
      parampg.b(4, this.awl);
    if (this.awm != 0L)
      parampg.b(5, this.awm);
    if (this.awn != 0)
      parampg.s(6, this.awn);
    if (this.awo != 0)
      parampg.t(7, this.awo);
    if (this.awp)
      parampg.b(8, this.awp);
    if ((this.awq != null) && (this.awq.length > 0))
      for (int i1 = 0; i1 < this.awq.length; i1++)
      {
        pd.a locala1 = this.awq[i1];
        if (locala1 != null)
          parampg.a(9, locala1);
      }
    if ((this.awr != null) && (this.awr.length > 0))
      for (int n = 0; n < this.awr.length; n++)
      {
        pd.a.a locala = this.awr[n];
        if (locala != null)
          parampg.a(10, locala);
      }
    if ((this.aws != null) && (this.aws.length > 0))
      for (int m = 0; m < this.aws.length; m++)
      {
        String str = this.aws[m];
        if (str != null)
          parampg.b(11, str);
      }
    if ((this.awt != null) && (this.awt.length > 0))
      for (int k = 0; k < this.awt.length; k++)
        parampg.b(12, this.awt[k]);
    if (this.awv != 0L)
      parampg.b(13, this.awv);
    if (this.awu != null)
    {
      int i = this.awu.length;
      int j = 0;
      if (i > 0)
        while (j < this.awu.length)
        {
          parampg.b(14, this.awu[j]);
          j++;
        }
    }
    super.a(parampg);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    if (!Arrays.equals(this.awi, pq.axd))
      j += pg.b(1, this.awi);
    if (!this.awj.equals(""))
      j += pg.j(2, this.awj);
    if (Double.doubleToLongBits(this.awk) != Double.doubleToLongBits(0.0D))
      j += pg.b(3, this.awk);
    if (Float.floatToIntBits(this.awl) != Float.floatToIntBits(0.0F))
      j += pg.c(4, this.awl);
    if (this.awm != 0L)
      j += pg.d(5, this.awm);
    if (this.awn != 0)
      j += pg.u(6, this.awn);
    if (this.awo != 0)
      j += pg.v(7, this.awo);
    if (this.awp)
      j += pg.c(8, this.awp);
    if ((this.awq != null) && (this.awq.length > 0))
    {
      int i4 = j;
      for (int i5 = 0; i5 < this.awq.length; i5++)
      {
        pd.a locala1 = this.awq[i5];
        if (locala1 != null)
          i4 += pg.c(9, locala1);
      }
      j = i4;
    }
    if ((this.awr != null) && (this.awr.length > 0))
    {
      int i2 = j;
      for (int i3 = 0; i3 < this.awr.length; i3++)
      {
        pd.a.a locala = this.awr[i3];
        if (locala != null)
          i2 += pg.c(10, locala);
      }
      j = i2;
    }
    if ((this.aws != null) && (this.aws.length > 0))
    {
      int m = 0;
      int n = 0;
      int i1 = 0;
      while (m < this.aws.length)
      {
        String str = this.aws[m];
        if (str != null)
        {
          i1++;
          n += pg.di(str);
        }
        m++;
      }
      j = j + n + i1 * 1;
    }
    if ((this.awt != null) && (this.awt.length > 0))
    {
      int k = 0;
      while (i < this.awt.length)
      {
        k += pg.D(this.awt[i]);
        i++;
      }
      j = j + k + 1 * this.awt.length;
    }
    if (this.awv != 0L)
      j += pg.d(13, this.awv);
    if ((this.awu != null) && (this.awu.length > 0))
      j = j + 4 * this.awu.length + 1 * this.awu.length;
    return j;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    a locala;
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
        bool3 = Arrays.equals(this.awi, locala.awi);
        bool2 = false;
      }
      while (!bool3);
      if (this.awj != null)
        break;
      str = locala.awj;
      bool2 = false;
    }
    while (str != null);
    while (this.awj.equals(locala.awj))
    {
      String str;
      boolean bool4 = Double.doubleToLongBits(this.awk) < Double.doubleToLongBits(locala.awk);
      bool2 = false;
      if (bool4)
        break;
      int i = Float.floatToIntBits(this.awl);
      int j = Float.floatToIntBits(locala.awl);
      bool2 = false;
      if (i != j)
        break;
      boolean bool5 = this.awm < locala.awm;
      bool2 = false;
      if (bool5)
        break;
      int k = this.awn;
      int m = locala.awn;
      bool2 = false;
      if (k != m)
        break;
      int n = this.awo;
      int i1 = locala.awo;
      bool2 = false;
      if (n != i1)
        break;
      boolean bool6 = this.awp;
      boolean bool7 = locala.awp;
      bool2 = false;
      if (bool6 != bool7)
        break;
      boolean bool8 = pl.equals(this.awq, locala.awq);
      bool2 = false;
      if (!bool8)
        break;
      boolean bool9 = pl.equals(this.awr, locala.awr);
      bool2 = false;
      if (!bool9)
        break;
      boolean bool10 = pl.equals(this.aws, locala.aws);
      bool2 = false;
      if (!bool10)
        break;
      boolean bool11 = pl.equals(this.awt, locala.awt);
      bool2 = false;
      if (!bool11)
        break;
      boolean bool12 = pl.equals(this.awu, locala.awu);
      bool2 = false;
      if (!bool12)
        break;
      boolean bool13 = this.awv < locala.awv;
      bool2 = false;
      if (bool13)
        break;
      return a(locala);
    }
    return false;
  }

  public final int hashCode()
  {
    int i = 31 * (527 + Arrays.hashCode(this.awi));
    int j;
    int m;
    if (this.awj == null)
    {
      j = 0;
      int k = j + i;
      long l = Double.doubleToLongBits(this.awk);
      m = 31 * (31 * (31 * (31 * (31 * (k * 31 + (int)(l ^ l >>> 32)) + Float.floatToIntBits(this.awl)) + (int)(this.awm ^ this.awm >>> 32)) + this.awn) + this.awo);
      if (!this.awp)
        break label209;
    }
    label209: for (int n = 1231; ; n = 1237)
    {
      return 31 * (31 * (31 * (31 * (31 * (31 * (31 * (n + m) + pl.hashCode(this.awq)) + pl.hashCode(this.awr)) + pl.hashCode(this.aws)) + pl.hashCode(this.awt)) + pl.hashCode(this.awu)) + (int)(this.awv ^ this.awv >>> 32)) + qz();
      j = this.awj.hashCode();
      break;
    }
  }

  public final a qh()
  {
    this.awi = pq.axd;
    this.awj = "";
    this.awk = 0.0D;
    this.awl = 0.0F;
    this.awm = 0L;
    this.awn = 0;
    this.awo = 0;
    this.awp = false;
    this.awq = pd.a.qd();
    this.awr = pd.a.a.qf();
    this.aws = pq.axb;
    this.awt = pq.awX;
    this.awu = pq.awY;
    this.awv = 0L;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final a t(pf parampf)
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
        this.awi = parampf.readBytes();
        break;
      case 18:
        this.awj = parampf.readString();
        break;
      case 25:
        this.awk = parampf.readDouble();
        break;
      case 37:
        this.awl = parampf.readFloat();
        break;
      case 40:
        this.awm = parampf.qk();
        break;
      case 48:
        this.awn = parampf.ql();
        break;
      case 56:
        this.awo = parampf.qn();
        break;
      case 64:
        this.awp = parampf.qm();
        break;
      case 74:
        int i13 = pq.b(parampf, 74);
        if (this.awq == null);
        pd.a[] arrayOfa1;
        for (int i14 = 0; ; i14 = this.awq.length)
        {
          arrayOfa1 = new pd.a[i13 + i14];
          if (i14 != 0)
            System.arraycopy(this.awq, 0, arrayOfa1, 0, i14);
          while (i14 < -1 + arrayOfa1.length)
          {
            arrayOfa1[i14] = new pd.a();
            parampf.a(arrayOfa1[i14]);
            parampf.qi();
            i14++;
          }
        }
        arrayOfa1[i14] = new pd.a();
        parampf.a(arrayOfa1[i14]);
        this.awq = arrayOfa1;
        break;
      case 82:
        int i11 = pq.b(parampf, 82);
        if (this.awr == null);
        pd.a.a[] arrayOfa;
        for (int i12 = 0; ; i12 = this.awr.length)
        {
          arrayOfa = new pd.a.a[i11 + i12];
          if (i12 != 0)
            System.arraycopy(this.awr, 0, arrayOfa, 0, i12);
          while (i12 < -1 + arrayOfa.length)
          {
            arrayOfa[i12] = new pd.a.a();
            parampf.a(arrayOfa[i12]);
            parampf.qi();
            i12++;
          }
        }
        arrayOfa[i12] = new pd.a.a();
        parampf.a(arrayOfa[i12]);
        this.awr = arrayOfa;
        break;
      case 90:
        int i9 = pq.b(parampf, 90);
        if (this.aws == null);
        String[] arrayOfString;
        for (int i10 = 0; ; i10 = this.aws.length)
        {
          arrayOfString = new String[i9 + i10];
          if (i10 != 0)
            System.arraycopy(this.aws, 0, arrayOfString, 0, i10);
          while (i10 < -1 + arrayOfString.length)
          {
            arrayOfString[i10] = parampf.readString();
            parampf.qi();
            i10++;
          }
        }
        arrayOfString[i10] = parampf.readString();
        this.aws = arrayOfString;
        break;
      case 96:
        int i7 = pq.b(parampf, 96);
        if (this.awt == null);
        long[] arrayOfLong2;
        for (int i8 = 0; ; i8 = this.awt.length)
        {
          arrayOfLong2 = new long[i7 + i8];
          if (i8 != 0)
            System.arraycopy(this.awt, 0, arrayOfLong2, 0, i8);
          while (i8 < -1 + arrayOfLong2.length)
          {
            arrayOfLong2[i8] = parampf.qk();
            parampf.qi();
            i8++;
          }
        }
        arrayOfLong2[i8] = parampf.qk();
        this.awt = arrayOfLong2;
        break;
      case 98:
        int i3 = parampf.gp(parampf.qp());
        int i4 = parampf.getPosition();
        for (int i5 = 0; parampf.qu() > 0; i5++)
          parampf.qk();
        parampf.gr(i4);
        if (this.awt == null);
        long[] arrayOfLong1;
        for (int i6 = 0; ; i6 = this.awt.length)
        {
          arrayOfLong1 = new long[i5 + i6];
          if (i6 != 0)
            System.arraycopy(this.awt, 0, arrayOfLong1, 0, i6);
          while (i6 < arrayOfLong1.length)
          {
            arrayOfLong1[i6] = parampf.qk();
            i6++;
          }
        }
        this.awt = arrayOfLong1;
        parampf.gq(i3);
        break;
      case 104:
        this.awv = parampf.qk();
        break;
      case 117:
        int i1 = pq.b(parampf, 117);
        if (this.awu == null);
        float[] arrayOfFloat2;
        for (int i2 = 0; ; i2 = this.awu.length)
        {
          arrayOfFloat2 = new float[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.awu, 0, arrayOfFloat2, 0, i2);
          while (i2 < -1 + arrayOfFloat2.length)
          {
            arrayOfFloat2[i2] = parampf.readFloat();
            parampf.qi();
            i2++;
          }
        }
        arrayOfFloat2[i2] = parampf.readFloat();
        this.awu = arrayOfFloat2;
        break;
      case 114:
      }
      int j = parampf.qp();
      int k = parampf.gp(j);
      int m = j / 4;
      if (this.awu == null);
      float[] arrayOfFloat1;
      for (int n = 0; ; n = this.awu.length)
      {
        arrayOfFloat1 = new float[m + n];
        if (n != 0)
          System.arraycopy(this.awu, 0, arrayOfFloat1, 0, n);
        while (n < arrayOfFloat1.length)
        {
          arrayOfFloat1[n] = parampf.readFloat();
          n++;
        }
      }
      this.awu = arrayOfFloat1;
      parampf.gq(k);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pd.a.a.a
 * JD-Core Version:    0.6.2
 */