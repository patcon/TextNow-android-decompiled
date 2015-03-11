package com.google.android.gms.internal;

import java.util.List;

public final class c$d extends ma<d>
{
  public d.a[] eR;
  public d.a[] eS;
  public c.c[] eT;

  public c$d()
  {
    h();
  }

  public final void a(lz paramlz)
  {
    if ((this.eR != null) && (this.eR.length > 0))
      for (int m = 0; m < this.eR.length; m++)
      {
        d.a locala2 = this.eR[m];
        if (locala2 != null)
          paramlz.a(1, locala2);
      }
    if ((this.eS != null) && (this.eS.length > 0))
      for (int k = 0; k < this.eS.length; k++)
      {
        d.a locala1 = this.eS[k];
        if (locala1 != null)
          paramlz.a(2, locala1);
      }
    if (this.eT != null)
    {
      int i = this.eT.length;
      int j = 0;
      if (i > 0)
        while (j < this.eT.length)
        {
          c.c localc = this.eT[j];
          if (localc != null)
            paramlz.a(3, localc);
          j++;
        }
    }
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c();
    if ((this.eR != null) && (this.eR.length > 0))
    {
      int i1 = i;
      for (int i2 = 0; i2 < this.eR.length; i2++)
      {
        d.a locala2 = this.eR[i2];
        if (locala2 != null)
          i1 += lz.b(1, locala2);
      }
      i = i1;
    }
    if ((this.eS != null) && (this.eS.length > 0))
    {
      int m = i;
      for (int n = 0; n < this.eS.length; n++)
      {
        d.a locala1 = this.eS[n];
        if (locala1 != null)
          m += lz.b(2, locala1);
      }
      i = m;
    }
    if (this.eT != null)
    {
      int j = this.eT.length;
      int k = 0;
      if (j > 0)
        while (k < this.eT.length)
        {
          c.c localc = this.eT[k];
          if (localc != null)
            i += lz.b(3, localc);
          k++;
        }
    }
    return i;
  }

  public final d e(ly paramly)
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
        int i1 = mh.b(paramly, 10);
        if (this.eR == null);
        d.a[] arrayOfa2;
        for (int i2 = 0; ; i2 = this.eR.length)
        {
          arrayOfa2 = new d.a[i1 + i2];
          if (i2 != 0)
            System.arraycopy(this.eR, 0, arrayOfa2, 0, i2);
          while (i2 < -1 + arrayOfa2.length)
          {
            arrayOfa2[i2] = new d.a();
            paramly.a(arrayOfa2[i2]);
            paramly.nB();
            i2++;
          }
        }
        arrayOfa2[i2] = new d.a();
        paramly.a(arrayOfa2[i2]);
        this.eR = arrayOfa2;
        break;
      case 18:
        int m = mh.b(paramly, 18);
        if (this.eS == null);
        d.a[] arrayOfa1;
        for (int n = 0; ; n = this.eS.length)
        {
          arrayOfa1 = new d.a[m + n];
          if (n != 0)
            System.arraycopy(this.eS, 0, arrayOfa1, 0, n);
          while (n < -1 + arrayOfa1.length)
          {
            arrayOfa1[n] = new d.a();
            paramly.a(arrayOfa1[n]);
            paramly.nB();
            n++;
          }
        }
        arrayOfa1[n] = new d.a();
        paramly.a(arrayOfa1[n]);
        this.eS = arrayOfa1;
        break;
      case 26:
      }
      int j = mh.b(paramly, 26);
      if (this.eT == null);
      c.c[] arrayOfc;
      for (int k = 0; ; k = this.eT.length)
      {
        arrayOfc = new c.c[j + k];
        if (k != 0)
          System.arraycopy(this.eT, 0, arrayOfc, 0, k);
        while (k < -1 + arrayOfc.length)
        {
          arrayOfc[k] = new c.c();
          paramly.a(arrayOfc[k]);
          paramly.nB();
          k++;
        }
      }
      arrayOfc[k] = new c.c();
      paramly.a(arrayOfc[k]);
      this.eT = arrayOfc;
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    d locald;
    do
    {
      return true;
      if (!(paramObject instanceof d))
        return false;
      locald = (d)paramObject;
      if (!mc.equals(this.eR, locald.eR))
        return false;
      if (!mc.equals(this.eS, locald.eS))
        return false;
      if (!mc.equals(this.eT, locald.eT))
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((locald.amX == null) || (locald.amX.isEmpty()));
    return false;
    return this.amX.equals(locald.amX);
  }

  public final d h()
  {
    this.eR = d.a.r();
    this.eS = d.a.r();
    this.eT = c.c.f();
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (31 * (527 + mc.hashCode(this.eR)) + mc.hashCode(this.eS)) + mc.hashCode(this.eT));
    if ((this.amX == null) || (this.amX.isEmpty()));
    for (int j = 0; ; j = this.amX.hashCode())
      return j + i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.d
 * JD-Core Version:    0.6.2
 */