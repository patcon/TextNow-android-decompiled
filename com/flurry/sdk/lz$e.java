package com.flurry.sdk;

@kb
public final class lz$e extends lz.k<Character>
{
  public lz$e(Class<Character> paramClass, Character paramCharacter)
  {
    super(paramClass, paramCharacter);
  }

  public final Character b(hj paramhj, iz paramiz)
  {
    hm localhm = paramhj.e();
    if (localhm == hm.i)
    {
      int i = paramhj.t();
      if ((i >= 0) && (i <= 65535))
        return Character.valueOf((char)i);
    }
    else if (localhm == hm.h)
    {
      String str = paramhj.k();
      if (str.length() == 1)
        return Character.valueOf(str.charAt(0));
      if (str.length() == 0)
        return (Character)c();
    }
    throw paramiz.a(this.q, localhm);
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.lz.e
 * JD-Core Version:    0.6.2
 */