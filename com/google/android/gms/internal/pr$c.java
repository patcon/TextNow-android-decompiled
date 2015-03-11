package com.google.android.gms.internal;

import java.util.Arrays;

public final class pr$c extends ph<c>
{
  public long axj;
  public int axk;
  public int axl;
  public boolean axm;
  public pr.d[] axn;
  public pr.b axo;
  public byte[] axp;
  public byte[] axq;
  public byte[] axr;
  public pr.a axs;
  public String axt;
  public String tag;

  public pr$c()
  {
    qL();
  }

  public final void a(pg parampg)
  {
    if (this.axj != 0L)
      parampg.b(1, this.axj);
    if (!this.tag.equals(""))
      parampg.b(2, this.tag);
    if ((this.axn != null) && (this.axn.length > 0))
      for (int i = 0; i < this.axn.length; i++)
      {
        pr.d locald = this.axn[i];
        if (locald != null)
          parampg.a(3, locald);
      }
    if (!Arrays.equals(this.axp, pq.axd))
      parampg.a(6, this.axp);
    if (this.axs != null)
      parampg.a(7, this.axs);
    if (!Arrays.equals(this.axq, pq.axd))
      parampg.a(8, this.axq);
    if (this.axo != null)
      parampg.a(9, this.axo);
    if (this.axm)
      parampg.b(10, this.axm);
    if (this.axk != 0)
      parampg.s(11, this.axk);
    if (this.axl != 0)
      parampg.s(12, this.axl);
    if (!Arrays.equals(this.axr, pq.axd))
      parampg.a(13, this.axr);
    if (!this.axt.equals(""))
      parampg.b(14, this.axt);
    super.a(parampg);
  }

  protected final int c()
  {
    int i = super.c();
    if (this.axj != 0L)
      i += pg.d(1, this.axj);
    if (!this.tag.equals(""))
      i += pg.j(2, this.tag);
    if ((this.axn != null) && (this.axn.length > 0))
    {
      int j = i;
      for (int k = 0; k < this.axn.length; k++)
      {
        pr.d locald = this.axn[k];
        if (locald != null)
          j += pg.c(3, locald);
      }
      i = j;
    }
    if (!Arrays.equals(this.axp, pq.axd))
      i += pg.b(6, this.axp);
    if (this.axs != null)
      i += pg.c(7, this.axs);
    if (!Arrays.equals(this.axq, pq.axd))
      i += pg.b(8, this.axq);
    if (this.axo != null)
      i += pg.c(9, this.axo);
    if (this.axm)
      i += pg.c(10, this.axm);
    if (this.axk != 0)
      i += pg.u(11, this.axk);
    if (this.axl != 0)
      i += pg.u(12, this.axl);
    if (!Arrays.equals(this.axr, pq.axd))
      i += pg.b(13, this.axr);
    if (!this.axt.equals(""))
      i += pg.j(14, this.axt);
    return i;
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool2;
    if (paramObject == this)
      bool2 = true;
    c localc;
    label174: 
    do
    {
      pr.a locala;
      do
      {
        boolean bool9;
        do
        {
          boolean bool8;
          do
          {
            boolean bool7;
            do
            {
              pr.b localb;
              do
              {
                boolean bool6;
                do
                {
                  boolean bool4;
                  boolean bool5;
                  do
                  {
                    int k;
                    int m;
                    do
                    {
                      int i;
                      int j;
                      do
                      {
                        String str2;
                        do
                        {
                          boolean bool3;
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
                            bool3 = this.axj < localc.axj;
                            bool2 = false;
                          }
                          while (bool3);
                          if (this.tag != null)
                            break;
                          str2 = localc.tag;
                          bool2 = false;
                        }
                        while (str2 != null);
                        i = this.axk;
                        j = localc.axk;
                        bool2 = false;
                      }
                      while (i != j);
                      k = this.axl;
                      m = localc.axl;
                      bool2 = false;
                    }
                    while (k != m);
                    bool4 = this.axm;
                    bool5 = localc.axm;
                    bool2 = false;
                  }
                  while (bool4 != bool5);
                  bool6 = pl.equals(this.axn, localc.axn);
                  bool2 = false;
                }
                while (!bool6);
                if (this.axo != null)
                  break label303;
                localb = localc.axo;
                bool2 = false;
              }
              while (localb != null);
              bool7 = Arrays.equals(this.axp, localc.axp);
              bool2 = false;
            }
            while (!bool7);
            bool8 = Arrays.equals(this.axq, localc.axq);
            bool2 = false;
          }
          while (!bool8);
          bool9 = Arrays.equals(this.axr, localc.axr);
          bool2 = false;
        }
        while (!bool9);
        if (this.axs != null)
          break label320;
        locala = localc.axs;
        bool2 = false;
      }
      while (locala != null);
      if (this.axt != null)
        break label337;
      str1 = localc.axt;
      bool2 = false;
    }
    while (str1 != null);
    label258: label303: label320: label337: 
    while (this.axt.equals(localc.axt))
    {
      String str1;
      return a(localc);
      if (this.tag.equals(localc.tag))
        break;
      return false;
      if (this.axo.equals(localc.axo))
        break label174;
      return false;
      if (this.axs.equals(localc.axs))
        break label258;
      return false;
    }
    return false;
  }

  public final int hashCode()
  {
    int i = 31 * (527 + (int)(this.axj ^ this.axj >>> 32));
    int j;
    int m;
    label65: int i1;
    label95: int i3;
    label148: int i4;
    int i5;
    if (this.tag == null)
    {
      j = 0;
      int k = 31 * (31 * (31 * (j + i) + this.axk) + this.axl);
      if (!this.axm)
        break label197;
      m = 1231;
      int n = 31 * (31 * (m + k) + pl.hashCode(this.axn));
      if (this.axo != null)
        break label205;
      i1 = 0;
      int i2 = 31 * (31 * (31 * (31 * (i1 + n) + Arrays.hashCode(this.axp)) + Arrays.hashCode(this.axq)) + Arrays.hashCode(this.axr));
      if (this.axs != null)
        break label217;
      i3 = 0;
      i4 = 31 * (i3 + i2);
      String str = this.axt;
      i5 = 0;
      if (str != null)
        break label229;
    }
    while (true)
    {
      return 31 * (i4 + i5) + qz();
      j = this.tag.hashCode();
      break;
      label197: m = 1237;
      break label65;
      label205: i1 = this.axo.hashCode();
      break label95;
      label217: i3 = this.axs.hashCode();
      break label148;
      label229: i5 = this.axt.hashCode();
    }
  }

  public final c qL()
  {
    this.axj = 0L;
    this.tag = "";
    this.axk = 0;
    this.axl = 0;
    this.axm = false;
    this.axn = pr.d.qM();
    this.axo = null;
    this.axp = pq.axd;
    this.axq = pq.axd;
    this.axr = pq.axd;
    this.axs = null;
    this.axt = "";
    this.awJ = null;
    this.awU = -1;
    return this;
  }

  public final c x(pf parampf)
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
        this.axj = parampf.qk();
        break;
      case 18:
        this.tag = parampf.readString();
        break;
      case 26:
        int j = pq.b(parampf, 26);
        if (this.axn == null);
        pr.d[] arrayOfd;
        for (int k = 0; ; k = this.axn.length)
        {
          arrayOfd = new pr.d[j + k];
          if (k != 0)
            System.arraycopy(this.axn, 0, arrayOfd, 0, k);
          while (k < -1 + arrayOfd.length)
          {
            arrayOfd[k] = new pr.d();
            parampf.a(arrayOfd[k]);
            parampf.qi();
            k++;
          }
        }
        arrayOfd[k] = new pr.d();
        parampf.a(arrayOfd[k]);
        this.axn = arrayOfd;
        break;
      case 50:
        this.axp = parampf.readBytes();
        break;
      case 58:
        if (this.axs == null)
          this.axs = new pr.a();
        parampf.a(this.axs);
        break;
      case 66:
        this.axq = parampf.readBytes();
        break;
      case 74:
        if (this.axo == null)
          this.axo = new pr.b();
        parampf.a(this.axo);
        break;
      case 80:
        this.axm = parampf.qm();
        break;
      case 88:
        this.axk = parampf.ql();
        break;
      case 96:
        this.axl = parampf.ql();
        break;
      case 106:
        this.axr = parampf.readBytes();
        break;
      case 114:
      }
      this.axt = parampf.readString();
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.pr.c
 * JD-Core Version:    0.6.2
 */