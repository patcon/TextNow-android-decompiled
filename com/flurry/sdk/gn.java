package com.flurry.sdk;

public class gn
{
  protected final gn.a a;
  protected gq[] b;
  protected int c;

  public gn(gq paramgq, gn.a parama)
  {
    this.a = parama;
    this.b = new gq[5];
    this.b[0] = paramgq;
    this.c = 1;
  }

  private void f()
  {
    gq[] arrayOfgq = new gq[this.b.length + Math.max(this.b.length, 1024)];
    System.arraycopy(this.b, 0, arrayOfgq, 0, this.b.length);
    this.b = arrayOfgq;
  }

  public final gq a(gq paramgq)
  {
    while (true)
    {
      gq[] arrayOfgq = this.b;
      int i = -1 + this.c;
      this.c = i;
      gq localgq1 = arrayOfgq[i];
      if (localgq1 == paramgq)
        return localgq1;
      gq.i locali = localgq1.a;
      if (locali == gq.i.f)
      {
        gq localgq2 = this.a.a(paramgq, localgq1);
        if (localgq2 != null)
          return localgq2;
      }
      else
      {
        if (locali == gq.i.a)
          throw new fl("Attempt to process a " + paramgq + " when a " + localgq1 + " was expected.");
        if ((locali == gq.i.d) && (paramgq == ((gq.j)localgq1).z))
          return paramgq;
        b(localgq1);
      }
    }
  }

  public final void a()
  {
    while (this.c > 1)
    {
      gq localgq = this.b[(-1 + this.c)];
      if (localgq.a == gq.i.f)
      {
        this.c = (-1 + this.c);
        this.a.a(null, localgq);
      }
      else
      {
        if (localgq.a == gq.i.a)
          break;
        this.c = (-1 + this.c);
        b(localgq);
      }
    }
  }

  public final void b()
  {
    while (this.c > 0)
    {
      gq localgq = this.b[(-1 + this.c)];
      if ((localgq.a != gq.i.f) || (!((gq.g)localgq).A))
        break;
      this.c = (-1 + this.c);
      this.a.a(null, localgq);
    }
  }

  public final void b(gq paramgq)
  {
    gq[] arrayOfgq = paramgq.b;
    while (this.c + arrayOfgq.length > this.b.length)
      f();
    System.arraycopy(arrayOfgq, 0, this.b, this.c, arrayOfgq.length);
    this.c += arrayOfgq.length;
  }

  public gq c()
  {
    gq[] arrayOfgq = this.b;
    int i = -1 + this.c;
    this.c = i;
    return arrayOfgq[i];
  }

  public void c(gq paramgq)
  {
    if (this.c == this.b.length)
      f();
    gq[] arrayOfgq = this.b;
    int i = this.c;
    this.c = (i + 1);
    arrayOfgq[i] = paramgq;
  }

  public gq d()
  {
    return this.b[(-1 + this.c)];
  }

  public void e()
  {
    this.c = 1;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gn
 * JD-Core Version:    0.6.2
 */