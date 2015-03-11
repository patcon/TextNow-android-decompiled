package com.flurry.sdk;

class fn$g extends fn.n
{
  private final int i;

  public fn$g(fn.m paramm, String paramString, int paramInt)
  {
    super(fn.v.f, paramm, paramString);
    if (paramInt < 0)
      throw new IllegalArgumentException("Invalid fixed size: " + paramInt);
    this.i = paramInt;
  }

  void a(fn.o paramo, hf paramhf)
  {
    if (c(paramo, paramhf))
      return;
    paramhf.d();
    paramhf.a("type", "fixed");
    d(paramo, paramhf);
    if (e() != null)
      paramhf.a("doc", e());
    paramhf.a("size", this.i);
    this.c.a(paramhf);
    a(paramhf);
    paramhf.e();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    g localg;
    do
    {
      return true;
      if (!(paramObject instanceof g))
        return false;
      localg = (g)paramObject;
    }
    while ((c(localg)) && (a(localg)) && (this.i == localg.i) && (this.c.equals(localg.c)));
    return false;
  }

  public int l()
  {
    return this.i;
  }

  int m()
  {
    return super.m() + this.i;
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.g
 * JD-Core Version:    0.6.2
 */