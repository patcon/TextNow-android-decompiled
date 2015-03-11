package com.google.android.gms.internal;

import java.util.List;

public final class c$e extends ma<e>
{
  private static volatile e[] eU;
  public int key;
  public int value;

  public c$e()
  {
    j();
  }

  public static e[] i()
  {
    if (eU == null);
    synchronized (mc.ana)
    {
      if (eU == null)
        eU = new e[0];
      return eU;
    }
  }

  public final void a(lz paramlz)
  {
    paramlz.p(1, this.key);
    paramlz.p(2, this.value);
    super.a(paramlz);
  }

  protected final int c()
  {
    return super.c() + lz.r(1, this.key) + lz.r(2, this.value);
  }

  public final boolean equals(Object paramObject)
  {
    if (paramObject == this);
    e locale;
    do
    {
      return true;
      if (!(paramObject instanceof e))
        return false;
      locale = (e)paramObject;
      if (this.key != locale.key)
        return false;
      if (this.value != locale.value)
        return false;
      if ((this.amX != null) && (!this.amX.isEmpty()))
        break;
    }
    while ((locale.amX == null) || (locale.amX.isEmpty()));
    return false;
    return this.amX.equals(locale.amX);
  }

  public final e f(ly paramly)
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
        this.key = paramly.nE();
        break;
      case 16:
      }
      this.value = paramly.nE();
    }
  }

  public final int hashCode()
  {
    int i = 31 * (31 * (527 + this.key) + this.value);
    if ((this.amX == null) || (this.amX.isEmpty()));
    for (int j = 0; ; j = this.amX.hashCode())
      return j + i;
  }

  public final e j()
  {
    this.key = 0;
    this.value = 0;
    this.amX = null;
    this.anb = -1;
    return this;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.e
 * JD-Core Version:    0.6.2
 */