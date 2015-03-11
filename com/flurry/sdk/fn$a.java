package com.flurry.sdk;

class fn$a extends fn
{
  private final fn f;

  public fn$a(fn paramfn)
  {
    super(fn.v.c);
    this.f = paramfn;
  }

  void a(fn.o paramo, hf paramhf)
  {
    paramhf.d();
    paramhf.a("type", "array");
    paramhf.a("items");
    this.f.a(paramo, paramhf);
    this.c.a(paramhf);
    paramhf.e();
  }

  public boolean equals(Object paramObject)
  {
    if (paramObject == this);
    a locala;
    do
    {
      return true;
      if (!(paramObject instanceof a))
        return false;
      locala = (a)paramObject;
    }
    while ((c(locala)) && (this.f.equals(locala.f)) && (this.c.equals(locala.c)));
    return false;
  }

  public fn i()
  {
    return this.f;
  }

  int m()
  {
    return super.m() + this.f.m();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.fn.a
 * JD-Core Version:    0.6.2
 */