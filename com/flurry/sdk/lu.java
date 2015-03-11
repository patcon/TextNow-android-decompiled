package com.flurry.sdk;

public class lu extends mc<sh>
{
  public lu()
  {
    super(sh.class);
  }

  public sh b(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.h)
    {
      String str = paramhj.k().trim();
      if (str.length() == 0)
        return (sh)c();
      return paramiz.f().b(str);
    }
    if (localhm == hm.g)
      return (sh)paramhj.z();
    throw paramiz.b(this.q);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lu
 * JD-Core Version:    0.6.2
 */