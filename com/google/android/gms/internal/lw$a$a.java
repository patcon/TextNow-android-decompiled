package com.google.android.gms.internal;

import java.util.List;

public final class lw$a$a extends ma<a>
{
  private static volatile a[] amu;
  public lw.a.a.a amv;
  public int type;

  public lw$a$a()
  {
    nz();
  }

  public static a[] ny()
  {
    if (amu == null);
    synchronized (mc.ana)
    {
      if (amu == null)
        amu = new a[0];
      return amu;
    }
  }

  public final void a(lz paramlz)
  {
    paramlz.p(1, this.type);
    if (this.amv != null)
      paramlz.a(2, this.amv);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c() + lz.r(1, this.type);
    if (this.amv != null)
      i += lz.b(2, this.amv);
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
      if (this.amv == null)
      {
        if (locala.amv != null)
          return false;
      }
      else if (!this.amv.equals(locala.amv))
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
    int i = 31 * (527 + this.type);
    int j;
    int k;
    int m;
    if (this.amv == null)
    {
      j = 0;
      k = 31 * (j + i);
      List localList = this.amX;
      m = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        m = 0;
        if (!bool)
          break label77;
      }
    }
    while (true)
    {
      return k + m;
      j = this.amv.hashCode();
      break;
      label77: m = this.amX.hashCode();
    }
  }

  public final a nz()
  {
    this.type = 1;
    this.amv = null;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final a s(ly paramly)
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
        int j = paramly.nE();
        switch (j)
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
        }
        this.type = j;
        break;
      case 18:
      }
      if (this.amv == null)
        this.amv = new lw.a.a.a();
      paramly.a(this.amv);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lw.a.a
 * JD-Core Version:    0.6.2
 */