package com.google.android.gms.internal;

import java.util.List;

public final class c$j extends ma<j>
{
  public c.i[] fJ;
  public c.f fK;
  public String fL;

  public c$j()
  {
    q();
  }

  public static j b(byte[] paramArrayOfByte)
  {
    return (j)me.a(new j(), paramArrayOfByte);
  }

  public final void a(lz paramlz)
  {
    if ((this.fJ != null) && (this.fJ.length > 0))
      for (int i = 0; i < this.fJ.length; i++)
      {
        c.i locali = this.fJ[i];
        if (locali != null)
          paramlz.a(1, locali);
      }
    if (this.fK != null)
      paramlz.a(2, this.fK);
    if (!this.fL.equals(""))
      paramlz.b(3, this.fL);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c();
    if ((this.fJ != null) && (this.fJ.length > 0))
      for (int j = 0; j < this.fJ.length; j++)
      {
        c.i locali = this.fJ[j];
        if (locali != null)
          i += lz.b(1, locali);
      }
    if (this.fK != null)
      i += lz.b(2, this.fK);
    if (!this.fL.equals(""))
      i += lz.h(3, this.fL);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    j localj;
    do
    {
      return true;
      if (!(paramObject instanceof j))
        return false;
      localj = (j)paramObject;
      if (!mc.equals(this.fJ, localj.fJ))
        return false;
      if (this.fK == null)
      {
        if (localj.fK != null)
          return false;
      }
      else if (!this.fK.equals(localj.fK))
        return false;
      if (this.fL == null)
      {
        if (localj.fL != null)
          return false;
      }
      else if (!this.fL.equals(localj.fL))
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((localj.amX == null) || (localj.amX.isEmpty()));
    return false;
    return this.amX.equals(localj.amX);
  }

  public final int hashCode()
  {
    int i = 31 * (527 + mc.hashCode(this.fJ));
    int j;
    int m;
    label41: int n;
    int i1;
    if (this.fK == null)
    {
      j = 0;
      int k = 31 * (j + i);
      if (this.fL != null)
        break label100;
      m = 0;
      n = 31 * (m + k);
      List localList = this.amX;
      i1 = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        i1 = 0;
        if (!bool)
          break label112;
      }
    }
    while (true)
    {
      return n + i1;
      j = this.fK.hashCode();
      break;
      label100: m = this.fL.hashCode();
      break label41;
      label112: i1 = this.amX.hashCode();
    }
  }

  public final j k(ly paramly)
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
        int j = mh.b(paramly, 10);
        if (this.fJ == null);
        c.i[] arrayOfi;
        for (int k = 0; ; k = this.fJ.length)
        {
          arrayOfi = new c.i[j + k];
          if (k != 0)
            System.arraycopy(this.fJ, 0, arrayOfi, 0, k);
          while (k < -1 + arrayOfi.length)
          {
            arrayOfi[k] = new c.i();
            paramly.a(arrayOfi[k]);
            paramly.nB();
            k++;
          }
        }
        arrayOfi[k] = new c.i();
        paramly.a(arrayOfi[k]);
        this.fJ = arrayOfi;
        break;
      case 18:
        if (this.fK == null)
          this.fK = new c.f();
        paramly.a(this.fK);
        break;
      case 26:
      }
      this.fL = paramly.readString();
    }
  }

  public final j q()
  {
    this.fJ = c.i.o();
    this.fK = null;
    this.fL = "";
    this.amX = null;
    this.anb = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.j
 * JD-Core Version:    0.6.2
 */