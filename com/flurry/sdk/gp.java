package com.flurry.sdk;

public class gp extends gn
{
  private final gp.a e;

  static
  {
    if (!gp.class.desiredAssertionStatus());
    for (boolean bool = true; ; bool = false)
    {
      d = bool;
      return;
    }
  }

  public gp(gq paramgq, gn.a parama, gp.a parama1)
  {
    super(paramgq, parama);
    this.e = parama1;
  }

  public final void a(int paramInt)
  {
    while (paramInt < this.c)
    {
      gq localgq = this.b[(-1 + this.c)];
      if (localgq.a != gq.i.a)
      {
        if ((localgq.a == gq.i.f) || (localgq.a == gq.i.g))
        {
          this.e.l();
        }
        else
        {
          this.c = (-1 + this.c);
          b(localgq);
        }
      }
      else
        this.e.t();
    }
  }

  public final void d(gq paramgq)
  {
    int i = this.c;
    c(paramgq);
    a(i);
  }

  public final void f()
  {
    int i = this.c;
    gq[] arrayOfgq = this.b;
    int j = -1 + this.c;
    this.c = j;
    gq localgq = arrayOfgq[j];
    if ((!d) && (localgq.a != gq.i.d))
      throw new AssertionError();
    b(localgq);
    a(i);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gp
 * JD-Core Version:    0.6.2
 */