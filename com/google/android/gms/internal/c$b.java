package com.google.android.gms.internal;

import java.util.List;

public final class c$b extends ma<b>
{
  private static volatile b[] eG;
  public int[] eH;
  public int eI;
  public boolean eJ;
  public boolean eK;
  public int name;

  public c$b()
  {
    e();
  }

  public static b[] d()
  {
    if (eG == null);
    synchronized (mc.ana)
    {
      if (eG == null)
        eG = new b[0];
      return eG;
    }
  }

  public final void a(lz paramlz)
  {
    if (this.eK)
      paramlz.a(1, this.eK);
    paramlz.p(2, this.eI);
    if ((this.eH != null) && (this.eH.length > 0))
      for (int i = 0; i < this.eH.length; i++)
        paramlz.p(3, this.eH[i]);
    if (this.name != 0)
      paramlz.p(4, this.name);
    if (this.eJ)
      paramlz.a(6, this.eJ);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = 0;
    int j = super.c();
    if (this.eK)
      j += lz.b(1, this.eK);
    int k = j + lz.r(2, this.eI);
    if ((this.eH != null) && (this.eH.length > 0))
      for (int n = 0; n < this.eH.length; n++)
        i += lz.eE(this.eH[n]);
    for (int m = k + i + 1 * this.eH.length; ; m = k)
    {
      if (this.name != 0)
        m += lz.r(4, this.name);
      if (this.eJ)
        m += lz.b(6, this.eJ);
      return m;
    }
  }

  public final b c(ly paramly)
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
        this.eK = paramly.nF();
        break;
      case 16:
        this.eI = paramly.nE();
        break;
      case 24:
        int i1 = mh.b(paramly, 24);
        if (this.eH == null);
        int[] arrayOfInt2;
        for (int i2 = 0; ; i2 = this.eH.length)
        {
          arrayOfInt2 = new int[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.eH, 0, arrayOfInt2, 0, i2);
          while (i2 < -1 + arrayOfInt2.length)
          {
            arrayOfInt2[i2] = paramly.nE();
            paramly.nB();
            i2++;
          }
        }
        arrayOfInt2[i2] = paramly.nE();
        this.eH = arrayOfInt2;
        break;
      case 26:
        int j = paramly.ex(paramly.nI());
        int k = paramly.getPosition();
        for (int m = 0; paramly.nN() > 0; m++)
          paramly.nE();
        paramly.ez(k);
        if (this.eH == null);
        int[] arrayOfInt1;
        for (int n = 0; ; n = this.eH.length)
        {
          arrayOfInt1 = new int[m + n];
          if (n != 0)
            System.arraycopy(this.eH, 0, arrayOfInt1, 0, n);
          while (n < arrayOfInt1.length)
          {
            arrayOfInt1[n] = paramly.nE();
            n++;
          }
        }
        this.eH = arrayOfInt1;
        paramly.ey(j);
        break;
      case 32:
        this.name = paramly.nE();
        break;
      case 48:
      }
      this.eJ = paramly.nF();
    }
  }

  public final b e()
  {
    this.eH = mh.and;
    this.eI = 0;
    this.name = 0;
    this.eJ = false;
    this.eK = false;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    b localb;
    do
    {
      return true;
      if (!(paramObject instanceof b))
        return false;
      localb = (b)paramObject;
      if (!mc.equals(this.eH, localb.eH))
        return false;
      if (this.eI != localb.eI)
        return false;
      if (this.name != localb.name)
        return false;
      if (this.eJ != localb.eJ)
        return false;
      if (this.eK != localb.eK)
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((localb.amX == null) || (localb.amX.isEmpty()));
    return false;
    return this.amX.equals(localb.amX);
  }

  public final int hashCode()
  {
    int i = 1231;
    int j = 31 * (31 * (31 * (527 + mc.hashCode(this.eH)) + this.eI) + this.name);
    int k;
    label59: int n;
    if (this.eJ)
    {
      k = i;
      int m = 31 * (k + j);
      if (!this.eK)
        break label103;
      n = 31 * (m + i);
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break label110;
    }
    label103: label110: for (int i1 = 0; ; i1 = this.amX.hashCode())
    {
      return i1 + n;
      k = 1237;
      break;
      i = 1237;
      break label59;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.b
 * JD-Core Version:    0.6.2
 */