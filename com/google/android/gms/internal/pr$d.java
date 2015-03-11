package com.google.android.gms.internal;

public final class pr$d extends ph<d>
{
  private static volatile d[] axu;
  public String fv;
  public String value;

  public pr$d()
  {
    qN();
  }

  public static d[] qM()
  {
    if (axu == null);
    synchronized (pl.awT)
    {
      if (axu == null)
        axu = new d[0];
      return axu;
    }
  }

  public final void a(pg parampg)
  {
    if (!this.fv.equals(""))
      parampg.b(1, this.fv);
    if (!this.value.equals(""))
      parampg.b(2, this.value);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if (!this.fv.equals(""))
      i += pg.j(1, this.fv);
    if (!this.value.equals(""))
      i += pg.j(2, this.value);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    d locald;
    do
    {
      String str2;
      do
      {
        boolean bool1;
        do
        {
          return bool2;
          bool1 = paramObject instanceof d;
          bool2 = false;
        }
        while (!bool1);
        locald = (d)paramObject;
        if (this.fv != null)
          break;
        str2 = locald.fv;
        bool2 = false;
      }
      while (str2 != null);
      if (this.value != null)
        break label92;
      str1 = locald.value;
      bool2 = false;
    }
    while (str1 != null);
    label92: 
    while (this.value.equals(locald.value))
    {
      String str1;
      return a(locald);
      if (this.fv.equals(locald.fv))
        break;
      return false;
    }
    return false;
  }

  public final int hashCode()
  {
    int i;
    int j;
    int k;
    if (this.fv == null)
    {
      i = 0;
      j = 31 * (i + 527);
      String str = this.value;
      k = 0;
      if (str != null)
        break label54;
    }
    while (true)
    {
      return 31 * (j + k) + qz();
      i = this.fv.hashCode();
      break;
      label54: k = this.value.hashCode();
    }
  }

  public final d qN()
  {
    this.fv = "";
    this.value = "";
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final d y(pf parampf)
  {
    while (true)
    {
      int i = parampf.qi();
      switch (i)
      {
      default:
        if (a(parampf, i))
          continue;
      case 0:
        return this;
      case 10:
        this.fv = parampf.readString();
        break;
      case 18:
      }
      this.value = parampf.readString();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pr.d
 * JD-Core Version:    0.6.2
 */