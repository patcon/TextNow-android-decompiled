package com.flurry.sdk;

@kb
final class ly$h extends ly.a<long[]>
{
  public ly$h()
  {
    super([J.class);
  }

  private final long[] c(hj paramhj, iz paramiz)
  {
    if ((paramhj.e() == hm.h) && (paramiz.a(iy.a.q)) && (paramhj.k().length() == 0))
      return null;
    if (!paramiz.a(iy.a.o))
      throw paramiz.b(this.q);
    long[] arrayOfLong = new long[1];
    arrayOfLong[0] = w(paramhj, paramiz);
    return arrayOfLong;
  }

  public final long[] b(hj paramhj, iz paramiz)
  {
    if (!paramhj.j())
      return c(paramhj, paramiz);
    qw.g localg = paramiz.h().e();
    Object localObject = (long[])localg.a();
    int i = 0;
    long l;
    int j;
    if (paramhj.b() != hm.e)
    {
      l = w(paramhj, paramiz);
      if (i < localObject.length)
        break label108;
      long[] arrayOfLong = (long[])localg.a(localObject, i);
      j = 0;
      localObject = arrayOfLong;
    }
    while (true)
    {
      i = j + 1;
      localObject[j] = l;
      break;
      return (long[])localg.b(localObject, i);
      label108: j = i;
    }
  }
}

/* Location:           /home/patcon/Downloads/com.enflick.android.TextNow-2-dex2jar.jar
 * Qualified Name:     com.flurry.sdk.ly.h
 * JD-Core Version:    0.6.2
 */