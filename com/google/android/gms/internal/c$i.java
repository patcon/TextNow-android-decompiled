package com.google.android.gms.internal;

import java.util.List;

public final class c$i extends ma<i>
{
  private static volatile i[] fG;
  public d.a fH;
  public c.d fI;
  public String name;

  public c$i()
  {
    p();
  }

  public static i[] o()
  {
    if (fG == null);
    synchronized (mc.ana)
    {
      if (fG == null)
        fG = new i[0];
      return fG;
    }
  }

  public final void a(lz paramlz)
  {
    if (!this.name.equals(""))
      paramlz.b(1, this.name);
    if (this.fH != null)
      paramlz.a(2, this.fH);
    if (this.fI != null)
      paramlz.a(3, this.fI);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c();
    if (!this.name.equals(""))
      i += lz.h(1, this.name);
    if (this.fH != null)
      i += lz.b(2, this.fH);
    if (this.fI != null)
      i += lz.b(3, this.fI);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    i locali;
    do
    {
      return true;
      if (!(paramObject instanceof i))
        return false;
      locali = (i)paramObject;
      if (this.name == null)
      {
        if (locali.name != null)
          return false;
      }
      else if (!this.name.equals(locali.name))
        return false;
      if (this.fH == null)
      {
        if (locali.fH != null)
          return false;
      }
      else if (!this.fH.equals(locali.fH))
        return false;
      if (this.fI == null)
      {
        if (locali.fI != null)
          return false;
      }
      else if (!this.fI.equals(locali.fI))
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((locali.amX == null) || (locali.amX.isEmpty()));
    return false;
    return this.amX.equals(locali.amX);
  }

  public final int hashCode()
  {
    int i;
    int k;
    label27: int n;
    label45: int i1;
    int i2;
    if (this.name == null)
    {
      i = 0;
      int j = 31 * (i + 527);
      if (this.fH != null)
        break label105;
      k = 0;
      int m = 31 * (k + j);
      if (this.fI != null)
        break label116;
      n = 0;
      i1 = 31 * (n + m);
      List localList = this.amX;
      i2 = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        i2 = 0;
        if (!bool)
          break label128;
      }
    }
    while (true)
    {
      return i1 + i2;
      i = this.name.hashCode();
      break;
      label105: k = this.fH.hashCode();
      break label27;
      label116: n = this.fI.hashCode();
      break label45;
      label128: i2 = this.amX.hashCode();
    }
  }

  public final i j(ly paramly)
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
        if (this.fH == null)
          this.fH = new d.a();
        paramly.a(this.fH);
        break;
      case 26:
      }
      if (this.fI == null)
        this.fI = new c.d();
      paramly.a(this.fI);
    }
  }

  public final i p()
  {
    this.name = "";
    this.fH = null;
    this.fI = null;
    this.amX = null;
    this.anb = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.i
 * JD-Core Version:    0.6.2
 */