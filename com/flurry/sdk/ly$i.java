package com.flurry.sdk;

@kb
final class ly$i extends ly.a<short[]>
{
  public ly$i()
  {
    super([S.class);
  }

  private final short[] c(hj paramhj, iz paramiz)
  {
    if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
      return null;
    if (!paramiz.a(iy.a.o))
      throw paramiz.b(this.q);
    short[] arrayOfShort = new short[1];
    arrayOfShort[0] = s(paramhj, paramiz);
    return arrayOfShort;
  }

  public final short[] b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      return c(paramhj, paramiz);
    qw.h localh = paramiz.h().c();
    Object localObject = (short[])localh.a();
    int i = 0;
    int j;
    int k;
    if (paramhj.b() != hm.e)
    {
      j = s(paramhj, paramiz);
      if (i < localObject.length)
        break label108;
      short[] arrayOfShort = (short[])localh.a(localObject, i);
      k = 0;
      localObject = arrayOfShort;
    }
    while (true)
    {
      i = k + 1;
      localObject[k] = j;
      break;
      return (short[])localh.b(localObject, i);
      label108: k = i;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.i
 * JD-Core Version:    0.6.2
 */