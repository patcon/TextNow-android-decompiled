package com.google.android.gms.internal;

import java.util.List;

public final class le$a extends ma<a>
{
  public long aiG;
  public c.j aiH;
  public c.f fK;

  public le$a()
  {
    nf();
  }

  public static a l(byte[] paramArrayOfByte)
  {
    return (a)me.a(new a(), paramArrayOfByte);
  }

  public final void a(lz paramlz)
  {
    paramlz.b(1, this.aiG);
    if (this.fK != null)
      paramlz.a(2, this.fK);
    if (this.aiH != null)
      paramlz.a(3, this.aiH);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c() + lz.d(1, this.aiG);
    if (this.fK != null)
      i += lz.b(2, this.fK);
    if (this.aiH != null)
      i += lz.b(3, this.aiH);
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
      if (this.aiG != locala.aiG)
        return false;
      if (this.fK == null)
      {
        if (locala.fK != null)
          return false;
      }
      else if (!this.fK.equals(locala.fK))
        return false;
      if (this.aiH == null)
      {
        if (locala.aiH != null)
          return false;
      }
      else if (!this.aiH.equals(locala.aiH))
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
    int i = 31 * (527 + (int)(this.aiG ^ this.aiG >>> 32));
    int j;
    int m;
    label47: int n;
    int i1;
    if (this.fK == null)
    {
      j = 0;
      int k = 31 * (j + i);
      if (this.aiH != null)
        break label106;
      m = 0;
      n = 31 * (m + k);
      List localList = this.amX;
      i1 = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        i1 = 0;
        if (!bool)
          break label118;
      }
    }
    while (true)
    {
      return n + i1;
      j = this.fK.hashCode();
      break;
      label106: m = this.aiH.hashCode();
      break label47;
      label118: i1 = this.amX.hashCode();
    }
  }

  public final a nf()
  {
    this.aiG = 0L;
    this.fK = null;
    this.aiH = null;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final a p(ly paramly)
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
        this.aiG = paramly.nD();
        break;
      case 18:
        if (this.fK == null)
          this.fK = new c.f();
        paramly.a(this.fK);
        break;
      case 26:
      }
      if (this.aiH == null)
        this.aiH = new c.j();
      paramly.a(this.aiH);
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.le.a
 * JD-Core Version:    0.6.2
 */