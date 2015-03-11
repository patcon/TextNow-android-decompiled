package com.flurry.sdk;

final class lv$b extends lk<rw>
{
  protected static final b a = new b();

  protected lv$b()
  {
    super(rw.class);
  }

  public static b d()
  {
    return a;
  }

  public final rw b(hj paramhj, iz paramiz)
  {
    if (paramhj.e() == hm.b)
    {
      paramhj.b();
      return a(paramhj, paramiz, paramiz.e());
    }
    if (paramhj.e() == hm.f)
      return a(paramhj, paramiz, paramiz.e());
    throw paramiz.b(rw.class);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lv.b
 * JD-Core Version:    0.6.2
 */