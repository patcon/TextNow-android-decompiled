package com.google.android.gms.internal;

public final class c$c extends ph<c>
{
  private static volatile c[] fu;
  public String fv;
  public long fw;
  public long fx;
  public boolean fy;
  public long fz;

  public c$c()
  {
    g();
  }

  public static c[] f()
  {
    if (fu == null);
    synchronized (pl.awT)
    {
      if (fu == null)
        fu = new c[0];
      return fu;
    }
  }

  public final void a(pg parampg)
  {
    if (!this.fv.equals(""))
      parampg.b(1, this.fv);
    if (this.fw != 0L)
      parampg.b(2, this.fw);
    if (this.fx != 2147483647L)
      parampg.b(3, this.fx);
    if (this.fy)
      parampg.b(4, this.fy);
    if (this.fz != 0L)
      parampg.b(5, this.fz);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if (!this.fv.equals(""))
      i += pg.j(1, this.fv);
    if (this.fw != 0L)
      i += pg.d(2, this.fw);
    if (this.fx != 2147483647L)
      i += pg.d(3, this.fx);
    if (this.fy)
      i += pg.c(4, this.fy);
    if (this.fz != 0L)
      i += pg.d(5, this.fz);
    return i;
  }

  public final c d(pf parampf)
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
      case 16:
        this.fw = parampf.qk();
        break;
      case 24:
        this.fx = parampf.qk();
        break;
      case 32:
        this.fy = parampf.qm();
        break;
      case 40:
      }
      this.fz = parampf.qk();
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    c localc;
    do
    {
      boolean bool1;
      do
      {
        return bool2;
        bool1 = paramObject instanceof c;
        bool2 = false;
      }
      while (!bool1);
      localc = (c)paramObject;
      if (this.fv != null)
        break;
      str = localc.fv;
      bool2 = false;
    }
    while (str != null);
    while (this.fv.equals(localc.fv))
    {
      String str;
      boolean bool3 = this.fw < localc.fw;
      bool2 = false;
      if (bool3)
        break;
      boolean bool4 = this.fx < localc.fx;
      bool2 = false;
      if (bool4)
        break;
      boolean bool5 = this.fy;
      boolean bool6 = localc.fy;
      bool2 = false;
      if (bool5 != bool6)
        break;
      boolean bool7 = this.fz < localc.fz;
      bool2 = false;
      if (bool7)
        break;
      return a(localc);
    }
    return false;
  }

  public final c g()
  {
    this.fv = "";
    this.fw = 0L;
    this.fx = 2147483647L;
    this.fy = false;
    this.fz = 0L;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final int hashCode()
  {
    int i;
    int j;
    if (this.fv == null)
    {
      i = 0;
      j = 31 * (31 * (31 * (i + 527) + (int)(this.fw ^ this.fw >>> 32)) + (int)(this.fx ^ this.fx >>> 32));
      if (!this.fy)
        break label103;
    }
    label103: for (int k = 1231; ; k = 1237)
    {
      return 31 * (31 * (k + j) + (int)(this.fz ^ this.fz >>> 32)) + qz();
      i = this.fv.hashCode();
      break;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.c.c
 * JD-Core Version:    0.6.2
 */