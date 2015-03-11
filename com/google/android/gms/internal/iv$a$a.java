package com.google.android.gms.internal;

import java.util.List;

public final class iv$a$a extends ma<a>
{
  private static volatile a[] Uz;
  public String UA;
  public String UB;
  public int viewId;

  public iv$a$a()
  {
    iS();
  }

  public static a[] iR()
  {
    if (Uz == null);
    synchronized (mc.ana)
    {
      if (Uz == null)
        Uz = new a[0];
      return Uz;
    }
  }

  public final void a(lz paramlz)
  {
    if (!this.UA.equals(""))
      paramlz.b(1, this.UA);
    if (!this.UB.equals(""))
      paramlz.b(2, this.UB);
    if (this.viewId != 0)
      paramlz.p(3, this.viewId);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c();
    if (!this.UA.equals(""))
      i += lz.h(1, this.UA);
    if (!this.UB.equals(""))
      i += lz.h(2, this.UB);
    if (this.viewId != 0)
      i += lz.r(3, this.viewId);
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
      if (this.UA == null)
      {
        if (locala.UA != null)
          return false;
      }
      else if (!this.UA.equals(locala.UA))
        return false;
      if (this.UB == null)
      {
        if (locala.UB != null)
          return false;
      }
      else if (!this.UB.equals(locala.UB))
        return false;
      if (this.viewId != locala.viewId)
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
    if (this.UA == null)
    {
      i = 0;
      int j = 31 * (i + 527);
      if (this.UB != null)
        break label93;
      k = 0;
      m = 31 * (31 * (k + j) + this.viewId);
      List localList = this.amX;
      n = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        n = 0;
        if (!bool)
          break label104;
      }
    }
    while (true)
    {
      return m + n;
      i = this.UA.hashCode();
      break;
      label93: k = this.UB.hashCode();
      break label27;
      label104: n = this.amX.hashCode();
    }
  }

  public final a iS()
  {
    this.UA = "";
    this.UB = "";
    this.viewId = 0;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final a o(ly paramly)
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
        this.UA = paramly.readString();
        break;
      case 18:
        this.UB = paramly.readString();
        break;
      case 24:
      }
      this.viewId = paramly.nE();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.iv.a.a
 * JD-Core Version:    0.6.2
 */