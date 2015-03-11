package com.flurry.sdk;

class fn$l extends fn
{
  private final fn f;

  public fn$l(fn paramfn)
  {
    super(fn.v.d);
    this.f = paramfn;
  }

  void a(fn.o paramo, hf paramhf)
  {
    paramhf.d();
    paramhf.a("type", "map");
    paramhf.a("values");
    this.f.a(paramo, paramhf);
    this.c.a(paramhf);
    paramhf.e();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    l locall;
    do
    {
      return true;
      if (!(paramObject instanceof l))
        return false;
      locall = (l)paramObject;
    }
    while ((c(locall)) && (this.f.equals(locall.f)) && (this.c.equals(locall.c)));
    return false;
  }

  public fn j()
  {
    return this.f;
  }

  int m()
  {
    return super.m() + this.f.m();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.l
 * JD-Core Version:    0.6.2
 */