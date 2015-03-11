package com.google.android.gms.internal;

import java.util.List;

public final class lw extends ma<lw>
{
  public lw.a[] amr;

  public lw()
  {
    nv();
  }

  public static lw n(byte[] paramArrayOfByte)
  {
    return (lw)me.a(new lw(), paramArrayOfByte);
  }

  public final void a(lz paramlz)
  {
    if ((this.amr != null) && (this.amr.length > 0))
      for (int i = 0; i < this.amr.length; i++)
      {
        lw.a locala = this.amr[i];
        if (locala != null)
          paramlz.a(1, locala);
      }
    super.a(paramlz);
  }

  protected final int c()
  {
    int i = super.c();
    if ((this.amr != null) && (this.amr.length > 0))
      for (int j = 0; j < this.amr.length; j++)
      {
        lw.a locala = this.amr[j];
        if (locala != null)
          i += lz.b(1, locala);
      }
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    lw locallw;
    do
    {
      return true;
      if (!(paramObject instanceof lw))
        return false;
      locallw = (lw)paramObject;
      if (!mc.equals(this.amr, locallw.amr))
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((locallw.amX == null) || (locallw.amX.isEmpty()));
    return false;
    return this.amX.equals(locallw.amX);
  }

  public final int hashCode()
  {
    int i = 31 * (527 + mc.hashCode(this.amr));
    if ((this.amX == null) || (this.amX.isEmpty()));
    for (int j = 0; ; j = this.amX.hashCode())
      return j + i;
  }

  public final lw nv()
  {
    this.amr = lw.a.nw();
    this.amX = null;
    this.anb = -1;
    return this;
  }

  public final lw q(ly paramly)
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
      }
      int j = mh.b(paramly, 10);
      if (this.amr == null);
      lw.a[] arrayOfa;
      for (int k = 0; ; k = this.amr.length)
      {
        arrayOfa = new lw.a[j + k];
        if (k != 0)
          System.arraycopy(this.amr, 0, arrayOfa, 0, k);
        while (k < -1 + arrayOfa.length)
        {
          arrayOfa[k] = new lw.a();
          paramly.a(arrayOfa[k]);
          paramly.nB();
          k++;
        }
      }
      arrayOfa[k] = new lw.a();
      paramly.a(arrayOfa[k]);
      this.amr = arrayOfa;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.lw
 * JD-Core Version:    0.6.2
 */