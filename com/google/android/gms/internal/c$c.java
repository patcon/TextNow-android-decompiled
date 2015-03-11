package com.google.android.gms.internal;

import java.util.List;

public final class c$c extends ma<c>
{
  private static volatile c[] eL;
  public String eM;
  public long eN;
  public long eO;
  public boolean eP;
  public long eQ;

  public c$c()
  {
    g();
  }

  public static c[] f()
  {
    if (eL == null);
    synchronized (mc.ana)
    {
      if (eL == null)
        eL = new c[0];
      return eL;
    }
  }

  public final void a(lz paramlz)
  {
    if (!this.eM.equals(""))
      paramlz.b(1, this.eM);
    if (this.eN != 0L)
      paramlz.b(2, this.eN);
    if (this.eO != 2147483647L)
      paramlz.b(3, this.eO);
    if (this.eP)
      paramlz.a(4, this.eP);
    if (this.eQ != 0L)
      paramlz.b(5, this.eQ);
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c();
    if (!this.eM.equals(""))
      i += lz.h(1, this.eM);
    if (this.eN != 0L)
      i += lz.d(2, this.eN);
    if (this.eO != 2147483647L)
      i += lz.d(3, this.eO);
    if (this.eP)
      i += lz.b(4, this.eP);
    if (this.eQ != 0L)
      i += lz.d(5, this.eQ);
    return i;
  }

  public final c d(ly paramly)
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
        this.eM = paramly.readString();
        break;
      case 16:
        this.eN = paramly.nD();
        break;
      case 24:
        this.eO = paramly.nD();
        break;
      case 32:
        this.eP = paramly.nF();
        break;
      case 40:
      }
      this.eQ = paramly.nD();
    }
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    c localc;
    do
    {
      return true;
      if (!(paramObject instanceof c))
        return false;
      localc = (c)paramObject;
      if (this.eM == null)
      {
        if (localc.eM != null)
          return false;
      }
      else if (!this.eM.equals(localc.eM))
        return false;
      if (this.eN != localc.eN)
        return false;
      if (this.eO != localc.eO)
        return false;
      if (this.eP != localc.eP)
        return false;
      if (this.eQ != localc.eQ)
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((localc.amX == null) || (localc.amX.isEmpty()));
    return false;
    return this.amX.equals(localc.amX);
  }

  public final c g()
  {
    this.eM = "";
    this.eN = 0L;
    this.eO = 2147483647L;
    this.eP = false;
    this.eQ = 0L;
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final int hashCode()
  {
    int i;
    int k;
    label63: int m;
    int n;
    if (this.eM == null)
    {
      i = 0;
      int j = 31 * (31 * (31 * (i + 527) + (int)(this.eN ^ this.eN >>> 32)) + (int)(this.eO ^ this.eO >>> 32));
      if (!this.eP)
        break label138;
      k = 1231;
      m = 31 * (31 * (k + j) + (int)(this.eQ ^ this.eQ >>> 32));
      List localList = this.amX;
      n = 0;
      if (localList != null)
      {
        boolean bool = this.amX.isEmpty();
        n = 0;
        if (!bool)
          break label145;
      }
    }
    while (true)
    {
      return m + n;
      i = this.eM.hashCode();
      break;
      label138: k = 1237;
      break label63;
      label145: n = this.amX.hashCode();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.c
 * JD-Core Version:    0.6.2
 */