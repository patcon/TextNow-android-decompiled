package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.pf;
import com.google.android.gms.internal.pg;
import com.google.android.gms.internal.ph;
import com.google.android.gms.internal.pn;

public final class ah extends ph<ah>
{
  public String Pl;
  public long Pm;
  public long Pn;
  public int versionCode;

  public ah()
  {
    ic();
  }

  public static ah g(byte[] paramArrayOfByte)
  {
    return (ah)pn.a(new ah(), paramArrayOfByte);
  }

  public final void a(pg parampg)
  {
    parampg.s(1, this.versionCode);
    parampg.b(2, this.Pl);
    parampg.c(3, this.Pm);
    parampg.c(4, this.Pn);
    super.a(parampg);
  }

  protected final int c()
  {
    return super.c() + pg.u(1, this.versionCode) + pg.j(2, this.Pl) + pg.e(3, this.Pm) + pg.e(4, this.Pn);
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    ah localah;
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
          bool1 = paramObject instanceof ah;
          bool2 = false;
        }
        while (!bool1);
        localah = (ah)paramObject;
        i = this.versionCode;
        j = localah.versionCode;
        bool2 = false;
      }
      while (i != j);
      if (this.Pl != null)
        break;
      str = localah.Pl;
      bool2 = false;
    }
    while (str != null);
    while (this.Pl.equals(localah.Pl))
    {
      String str;
      boolean bool3 = this.Pm < localah.Pm;
      bool2 = false;
      if (bool3)
        break;
      boolean bool4 = this.Pn < localah.Pn;
      bool2 = false;
      if (bool4)
        break;
      return a(localah);
    }
    return false;
  }

  public final int hashCode()
  {
    int i = 31 * (527 + this.versionCode);
    if (this.Pl == null);
    for (int j = 0; ; j = this.Pl.hashCode())
      return 31 * (31 * (31 * (j + i) + (int)(this.Pm ^ this.Pm >>> 32)) + (int)(this.Pn ^ this.Pn >>> 32)) + qz();
  }

  public final ah ic()
  {
    this.versionCode = 1;
    this.Pl = "";
    this.Pm = -1L;
    this.Pn = -1L;
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final ah m(pf parampf)
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
        this.versionCode = parampf.ql();
        break;
      case 18:
        this.Pl = parampf.readString();
        break;
      case 24:
        this.Pm = parampf.qo();
        break;
      case 32:
      }
      this.Pn = parampf.qo();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.drive.internal.ah
 * JD-Core Version:    0.6.2
 */