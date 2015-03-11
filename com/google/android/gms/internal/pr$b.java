package com.google.android.gms.internal;

public final class pr$b extends ph<b>
{
  public int axh;
  public String axi;
  public String version;

  public pr$b()
  {
    qK();
  }

  public final void a(pg parampg)
  {
    if (this.axh != 0)
      parampg.s(1, this.axh);
    if (!this.axi.equals(""))
      parampg.b(2, this.axi);
    if (!this.version.equals(""))
      parampg.b(3, this.version);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if (this.axh != 0)
      i += pg.u(1, this.axh);
    if (!this.axi.equals(""))
      i += pg.j(2, this.axi);
    if (!this.version.equals(""))
      i += pg.j(3, this.version);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    b localb;
    do
    {
      String str2;
      do
      {
        int i;
        int j;
        do
        {
          boolean bool1;
          do
          {
            return bool2;
            bool1 = paramObject instanceof b;
            bool2 = false;
          }
          while (!bool1);
          localb = (b)paramObject;
          i = this.axh;
          j = localb.axh;
          bool2 = false;
        }
        while (i != j);
        if (this.axi != null)
          break;
        str2 = localb.axi;
        bool2 = false;
      }
      while (str2 != null);
      if (this.version != null)
        break label114;
      str1 = localb.version;
      bool2 = false;
    }
    while (str1 != null);
    label114: 
    while (this.version.equals(localb.version))
    {
      String str1;
      return a(localb);
      if (this.axi.equals(localb.axi))
        break;
      return false;
    }
    return false;
  }

  public final int hashCode()
  {
    int i = 31 * (527 + this.axh);
    int j;
    int k;
    int m;
    if (this.axi == null)
    {
      j = 0;
      k = 31 * (j + i);
      String str = this.version;
      m = 0;
      if (str != null)
        break label66;
    }
    while (true)
    {
      return 31 * (k + m) + qz();
      j = this.axi.hashCode();
      break;
      label66: m = this.version.hashCode();
    }
  }

  public final b qK()
  {
    this.axh = 0;
    this.axi = "";
    this.version = "";
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final b w(pf parampf)
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
      case 8:
        int j = parampf.ql();
        switch (j)
        {
        default:
          break;
        case 0:
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
        case 16:
        case 17:
        case 18:
        case 19:
        case 20:
        case 21:
        case 22:
        }
        this.axh = j;
        break;
      case 18:
        this.axi = parampf.readString();
        break;
      case 26:
      }
      this.version = parampf.readString();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pr.b
 * JD-Core Version:    0.6.2
 */