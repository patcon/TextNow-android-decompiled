package com.flurry.sdk;

public class lv extends lk<hh>
{
  private static final lv a = new lv();

  protected lv()
  {
    super(hh.class);
  }

  public static jg<? extends hh> a(Class<?> paramClass)
  {
    if (paramClass == rw.class)
      return lv.b.d();
    if (paramClass == rj.class)
      return lv.a.d();
    return a;
  }

  public hh b(hj paramhj, iz paramiz)
  {
    switch (1.a[paramhj.e().ordinal()])
    {
    default:
      return c(paramhj, paramiz, paramiz.e());
    case 1:
      return a(paramhj, paramiz, paramiz.e());
    case 2:
    }
    return b(paramhj, paramiz, paramiz.e());
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lv
 * JD-Core Version:    0.6.2
 */