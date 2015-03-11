package com.flurry.sdk;

public class sl
  implements ho
{
  protected hs a = new sl.a();
  protected hs b = new sl.b();
  protected boolean c = true;
  protected int d = 0;

  public void a(hf paramhf)
  {
    paramhf.a(' ');
  }

  public void a(hf paramhf, int paramInt)
  {
    if (!this.b.a())
      this.d = (-1 + this.d);
    if (paramInt > 0)
      this.b.a(paramhf, this.d);
    while (true)
    {
      paramhf.a('}');
      return;
      paramhf.a(' ');
    }
  }

  public void b(hf paramhf)
  {
    paramhf.a('{');
    if (!this.b.a())
      this.d = (1 + this.d);
  }

  public void b(hf paramhf, int paramInt)
  {
    if (!this.a.a())
      this.d = (-1 + this.d);
    if (paramInt > 0)
      this.a.a(paramhf, this.d);
    while (true)
    {
      paramhf.a(']');
      return;
      paramhf.a(' ');
    }
  }

  public void c(hf paramhf)
  {
    paramhf.a(',');
    this.b.a(paramhf, this.d);
  }

  public void d(hf paramhf)
  {
    if (this.c)
    {
      paramhf.c(" : ");
      return;
    }
    paramhf.a(':');
  }

  public void e(hf paramhf)
  {
    if (!this.a.a())
      this.d = (1 + this.d);
    paramhf.a('[');
  }

  public void f(hf paramhf)
  {
    paramhf.a(',');
    this.a.a(paramhf, this.d);
  }

  public void g(hf paramhf)
  {
    this.a.a(paramhf, this.d);
  }

  public void h(hf paramhf)
  {
    this.b.a(paramhf, this.d);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.sl
 * JD-Core Version:    0.6.2
 */