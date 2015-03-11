package com.google.android.gms.internal;

import java.util.List;

public final class c$a extends ma<a>
{
  public int eE;
  public int eF;
  public int level;

  public c$a()
  {
    b();
  }

  public final a a(ly paramly)
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
        }
        this.level = j;
        break;
      case 16:
        this.eE = paramly.nE();
        break;
      case 24:
      }
      this.eF = paramly.nE();
    }
  }

  public final void a(lz paramlz)
  {
    if (this.level != 1)
      paramlz.p(1, this.level);
    if (this.eE != 0)
      paramlz.p(2, this.eE);
    if (this.eF != 0)
      paramlz.p(3, this.eF);
    super.a(paramlz);
  }

  public final a b()
  {
    this.level = 1;
    this.eE = 0;
    this.eF = 0;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  protected final int c()
  {
    int i = super.c();
    if (this.level != 1)
      i += lz.r(1, this.level);
    if (this.eE != 0)
      i += lz.r(2, this.eE);
    if (this.eF != 0)
      i += lz.r(3, this.eF);
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
      if (this.level != locala.level)
        return false;
      if (this.eE != locala.eE)
        return false;
      if (this.eF != locala.eF)
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
    int i = 31 * (31 * (31 * (527 + this.level) + this.eE) + this.eF);
    if ((this.amX == null) || (this.amX.isEmpty()));
    for (int j = 0; ; j = this.amX.hashCode())
      return j + i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.a
 * JD-Core Version:    0.6.2
 */