package com.google.android.gms.internal;

import java.util.List;

public final class lw$a extends ma<a>
{
  private static volatile a[] ams;
  public lw.a.a amt;
  public String name;

  public lw$a()
  {
    nx();
  }

  public static a[] nw()
  {
    if (ams == null);
    synchronized (mc.ana)
    {
      if (ams == null)
        ams = new a[0];
      return ams;
    }
  }

  public final void a(lz paramlz)
  {
    paramlz.b(1, this.name);
    if (this.amt != null)
      paramlz.a(2, this.amt);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c() + lz.h(1, this.name);
    if (this.amt != null)
      i += lz.b(2, this.amt);
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
      if (this.name == null)
      {
        if (locala.name != null)
          return false;
      }
      else if (!this.name.equals(locala.name))
        return false;
      if (this.amt == null)
      {
        if (locala.amt != null)
          return false;
      }
      else if (!this.amt.equals(locala.amt))
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
    int i;
    int k;
    label27: int m;
    int n;
    if (this.name == null)
    {
      i = 0;
      int j = 31 * (i + 527);
      if (this.amt != null)
        break label85;
      k = 0;
      m = 31 * (k + j);
      List localList = this.amX;
      n = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        n = 0;
        if (!bool)
          break label96;
      }
    }
    while (true)
    {
      return m + n;
      i = this.name.hashCode();
      break;
      label85: k = this.amt.hashCode();
      break label27;
      label96: n = this.amX.hashCode();
    }
  }

  public final a nx()
  {
    this.name = "";
    this.amt = null;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final a r(ly paramly)
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
        this.name = paramly.readString();
        break;
      case 18:
      }
      if (this.amt == null)
        this.amt = new lw.a.a();
      paramly.a(this.amt);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lw.a
 * JD-Core Version:    0.6.2
 */