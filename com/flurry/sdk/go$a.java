package com.flurry.sdk;

class go$a extends gr.a
{
  public fn a;

  public go$a(fn paramfn1, fn paramfn2)
  {
    super(paramfn1);
    this.a = paramfn2;
  }

  public boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof a));
    a locala;
    do
    {
      return false;
      locala = (a)paramObject;
    }
    while ((this.b != locala.b) || (this.a != locala.a));
    return true;
  }

  public int hashCode()
  {
    return super.hashCode() + this.a.hashCode();
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.go.a
 * JD-Core Version:    0.6.2
 */