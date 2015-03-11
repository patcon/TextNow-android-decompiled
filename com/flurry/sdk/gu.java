package com.flurry.sdk;

public class gu<T> extends fv<T>
{
  public gu()
  {
    super(gs.b());
  }

  public gu(Class<T> paramClass)
  {
    super(gs.b().a(paramClass), gs.b());
  }

  protected void c(fn paramfn, Object paramObject, gi paramgi)
  {
    if (!(paramObject instanceof Enum))
    {
      super.c(paramfn, paramObject, paramgi);
      return;
    }
    paramgi.a(((Enum)paramObject).ordinal());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.gu
 * JD-Core Version:    0.6.2
 */